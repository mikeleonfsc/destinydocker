/* recommendation.js */
Class.create(BaseController, {
    init: function() {
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).update(MessageHelper.format("recommendationController_enterYourCommentsHere"));
		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_LABEL).update(MessageHelper.format("recommendationController_findPatron"));
		this.modal.show();
		
		var mainTitle = this.data.mainTitle;
		var bibTypeDescription = this.data.bibTypeDescription;
		var miniBibTypeIconURL = this.data.miniBibTypeIconURL;
		this.bibID = this.data.bibID;	
		
		var icon = new Element("img", {alt: bibTypeDescription, title: bibTypeDescription, height: 16, border: 0, width: 20, src: miniBibTypeIconURL});
		var span = new Element("span");
		span.update(mainTitle);
		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_DEFAULT_TITLE).insert(icon);
		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_DEFAULT_TITLE).insert(span);
		
		this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).disable();
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).enable();
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).show();
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).clear();
		this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON).hide();
        
        // setup default screen based on permissions.
        if (this.data.useBookClub) {
        	this.elementMap.get(RecommendationController_DIV_FRIENDS_WRAPPER).show();
        	this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AUTO_SUGGESTION_CONTROL).hide();
        	this.elementMap.get(RecommendationController_RADIO_FRIENDS).checked = true;
        	
            if(this.data.allowCommentMyQuest) {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).show();
            } else {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).hide();
            }

            if(this.data.friendApprovalRequired){
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).show();
    		} else {
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).hide();
    		}
            this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).hide();
        } else {
        	this.elementMap.get(RecommendationController_DIV_FRIENDS_WRAPPER).hide();
        	this.elementMap.get(RecommendationController_RADIO_FIND_PATRON).checked = true;

        	if(this.data.allowCommentDestiny) {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).show();
            } else {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).hide();
            }

        	if(this.data.approvalRequired){
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).show();
    		} else {
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).hide();
    		}
        	this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).hide();
        }
        if (this.data.recommendToOthers) { 
        	this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AREA_WRAPPER).show();
            if (!this.data.useBookClub) {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).activate();
            }
        } else {
        	this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AREA_WRAPPER).hide();
        }
		
        this.elementMap.get(RecommendationController_IMG_ADD_RECOMMENDATION_SEARCH_IN_PROGRESS).hide();
        
		this.autocompleter = new PatronFindAutoComplete(
			this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON), 
			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_RESULTS),
			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_RESULTS),
			this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON),
			function() {
		        DAO.load({endpoint: "RecommendationController.AutoSuggest", container: this.update}, 
		        		this.getToken() + "z", this.bibID);
			},
            {
				indicator: this.elementMap.get(RecommendationController_IMG_ADD_RECOMMENDATION_SEARCH_IN_PROGRESS)
            }
        );
		this.autocompleter.startMe();
		this.autocompleter.bibID = this.bibID;	// for easier reference. No need to lookup title details via registry, etc.
		
		if (this.data.useBookClub) {
			// Need to do this last, must ensure everything is initialized
            this._loadFriends();
		}
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_CLOSE), "mousedown", this.closeDialog.bind(this));
        Event.observe(this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT), "focus", this._defaultTextListener.bind(this));
        Event.observe(this.elementMap.get(RecommendationController_RADIO_FRIENDS), "click", this._toggleFriend.bind(this));
        Event.observe(this.elementMap.get(RecommendationController_RADIO_FIND_PATRON), "click", this._togglePatron.bind(this));
        Event.observe(this.elementMap.get(RecommendationController_BUTTON_SELECT_ALL), "mousedown", this._setAllFriends.bind(this, true));
        Event.observe(this.elementMap.get(RecommendationController_BUTTON_CLEAR_ALL), "mousedown", this._setAllFriends.bind(this, false));
        Event.observe(this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON), "mousedown", this._clickSelectedPatron.bind(this));
        Event.observe(this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE), "click", this._saveAction.bind(this));
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },

    _defaultTextListener: function (event) {
        if (this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).value == MessageHelper.format("recommendationController_enterYourCommentsHere")) {
    		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).value = "";
        } 
    },

    _selectPatron: function(){
        if (this.autocompleter.selectedPatron >= 0 ){
            // hide the input field (disable it too, since IE/Safari still will submit on enter)
        	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).disable(); 
        	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).hide();
            
            // Update/show the static text
            this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON).down().update(this.autocompleter.selectedPatronName);
            this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON).show();
            
            // Change the label to "To" instead of "Find Patron"
            this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_LABEL).update(MessageHelper.format("recommendationController_to"));
            
            // Enable the save button
            this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).enable();
        }
        var commentContainer = this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT);
        if (commentContainer.visible()){
        	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).activate();
        }
    },

    _saveAction: function (event, eventSource, ajaxObject) {
        var bibID = this.bibID;
        var comments = this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).value;
        if (comments == MessageHelper.format("recommendationController_enterYourCommentsHere")) { // don't save help text.
            comments = "";
        } 
        // now that we pulled the comments off reset the control
//        this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).value = this.data.label_enterComments;

        var patronID;
        var friendCheckboxes = [];
        var isRadioPatronChecked = this.elementMap.get(RecommendationController_RADIO_FIND_PATRON).checked;
        if (isRadioPatronChecked || !this.data.useBookClub) { 
            if (! this.autocompleter.saveEnabled || ! this.autocompleter.selectedPatron) {
                // if for some reason a patron has not been selected and we cause a submit, don't do it!
                ajaxObject.stop();
            } else {
                patronID = this.autocompleter.selectedPatron;
            }
        } else { 
            var checkboxes = $$("input[name='friendCheckboxes']");
            
            var count = 0;
            for (var i=0; i < checkboxes.size(); i++) {
                if (!checkboxes[i].disabled && checkboxes[i].checked) {
                    count++;
                    friendCheckboxes.push(checkboxes[i].value);
                }
            }
        }
        
        if (Object.isElement(this.elementMap.get(RecommendationController_RADIO_FRIENDS))) {
        	this.elementMap.get(RecommendationController_RADIO_FRIENDS).disable();
        }
        if (Object.isElement(this.elementMap.get(RecommendationController_RADIO_FIND_PATRON))) {
        	this.elementMap.get(RecommendationController_RADIO_FIND_PATRON).disable();
        }
        if (Object.isElement(this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE))) {
        	this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).disable();
        }
        
        DAO.load({endpoint: "RecommendationController.Saver", method:'post'}, bibID, patronID, friendCheckboxes, comments);
    },

    _addFriend: function(element, json) {
    	var friend = new Element("li", {id: "recommendationFriend_" + json.patronID});
    	var params = {
    		type: "checkbox", 
    		name:"friendCheckboxes", 
    		id:"friendCheckboxes_" + json.patronID,
    		value: json.patronID};
	    if (json.duplicateRecommendationForTitle) {
	    	params.disabled = true;
	    }
    	
    	var siteName = "";
    	if (json.siteName) {
    		siteName = "&nbsp;[" + json.siteName + "]";
    	}
    	
    	friend.insert(new Element("input", params));
    	friend.insert(json.displayName + siteName)
    	
    	element.insert(friend);
    	
    	if (!json.duplicateRecommendationForTitle) {
    		Event.observe(friend, "click", this._validateRecommendation.bind(this));
    	}
    },
    
    updateFriends: function(json){
    	if (json.friends != null) {
    		var html = new Element("ul", {"class": "addRecommendationFriendsCheckboxList"});
        	this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FRIENDS).update(html);
        	
        	var friends = json.friends.dateGroups[0].items;
        	for (var i = 0; i < friends.length; i ++) {
        		this._addFriend(html, friends[i]);
        	}
            this.autocompleter.enabled = false;
        	this.elementMap.get(RecommendationController_DIV_EMPTY_FRIENDS_LIST_MSG).hide();
            this.elementMap.get(RecommendationController_DIV_FRIENDS_WRAPPER).show();
            if (this.data.useBookClub && this.data.recommendToOthers) {
            	this.elementMap.get(RecommendationController_RADIO_FRIENDS).show();
                this.elementMap.get(RecommendationController_RADIO_FIND_PATRON).show();
            } 
            this.elementMap.get(RecommendationController_DIV_FRIENDS_CONTROLS).show();
            this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FRIENDS).show();
            this._setAllFriends(true);
            
            if(this.data.friendApprovalRequired){
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).show();
    		} else {
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).hide();
    		}
    		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).hide();
            
        } else { // we have no friends
        	this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FRIENDS).hide();
        	this.elementMap.get(RecommendationController_BUTTON_SELECT_ALL).hide();
        	this.elementMap.get(RecommendationController_BUTTON_CLEAR_ALL).hide();
        	this.elementMap.get(RecommendationController_DIV_EMPTY_FRIENDS_LIST_MSG).show();
        	this.elementMap.get(RecommendationController_RADIO_FRIENDS).disable();
            if (this.data.recommendToOthers) {
            	this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).disable();            
        		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).enable();
        		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).show();
        		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).clear();
        		this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON).hide();
        		this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AUTO_SUGGESTION_CONTROL).show();
                this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).activate();
                this.autocompleter.reset();
                this.elementMap.get(RecommendationController_RADIO_FIND_PATRON).checked = true;
                if(this.data.allowCommentDestiny) {
                	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).show();
                } else {
                	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).clear();
                	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).hide();
                }
            }
            if(this.data.approvalRequired){
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).show();
    		} else {
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).hide();
    		}
    		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).hide();
        }
    },

    _toggleFriend: function(event){
//        if (!window.radioButtonStateFriend) {
        	this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_LABEL).update(MessageHelper.format("recommendationController_findPatron"));
        	this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AUTO_SUGGESTION_CONTROL).hide();
            this.elementMap.get(RecommendationController_DIV_FRIENDS_CONTROLS).show();
            this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FRIENDS).show();
    		if(this.data.friendApprovalRequired){
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).show();
    		} else {
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).hide();
    		}
    		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).hide();
			
            var json = this.data;
            
            if(json.allowCommentMyQuest) {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).show();
            } else {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).clear();
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).hide();
            }
            this.elementMap.get(RecommendationController_DIV_FRIENDS_CONTROLS).show();
            this._setAllFriends(true);
            this.autocompleter.disable();
//            window.radioButtonStateFriend = true;
//        }
    },

    _togglePatron: function(event){
//        if (window.radioButtonStateFriend) {
        	this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).disable();            
        	this.elementMap.get(RecommendationController_DIV_FRIENDS_CONTROLS).hide();
            this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FRIENDS).hide();
            this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).enable();
            this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).show();
    		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).clear();
    		this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON).hide();
    		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_LABEL).update(MessageHelper.format("recommendationController_findPatron"));
    		this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AUTO_SUGGESTION_CONTROL).show();
    		
    		if(this.data.approvalRequired){
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).show();
    		} else {
    			this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL).hide();
    		}
    		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_NEEDS_APPROVAL_FRIENDS).hide();
            this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).activate();

            var json = this.data;

            if(json.allowCommentDestiny) {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).show();
            } else {
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).clear();
            	this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_TEXT).hide();
            }
            
            this.autocompleter.reset();
            this.autocompleter.enable();
//            window.radioButtonStateFriend = false;
//        }
    },

    _clickSelectedPatron: function(event){
    	this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).disable();            
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).enable();
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).show();
		this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).clear();
		this.elementMap.get(RecommendationController_SPAN_ADD_RECOMMENDATION_SELECTED_PATRON).hide();
		this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FIND_PATRON_LABEL).update(MessageHelper.format("recommendationController_findPatron"));
		this.elementMap.get(RecommendationController_DIV_FIND_PATRON_AUTO_SUGGESTION_CONTROL).show();
        this.elementMap.get(RecommendationController_FIELD_ADD_RECOMMENDATION_FIND_PATRON).activate();
        this.autocompleter.reset();
    },
    
    _validateRecommendation: function(event, checkboxes)  {
    	if (checkboxes == null) {
    		// this method is called by _setAllFriends, and we
    		// already get this, so we're just going to pass it in and re-use it
    		checkboxes = $$("input[name='friendCheckboxes']");
    	}
    	
        var anySelected = false;
        for (var i=0; i < checkboxes.size(); i++) {
            if (!checkboxes[i].disabled && checkboxes[i].checked) {
                anySelected = true;
                break;
            }
        }
        
        if (anySelected) {
        	this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).enable();    
        } else {
        	this.elementMap.get(RecommendationController_BUTTON_ADD_RECOMMENDATION_SAVE).disable();
        }
    },

    _setAllFriends: function(setTo)  {
        var checkboxes = $$("input[name='friendCheckboxes']");
        for (var i=0; i < checkboxes.size(); i++) {
            if (!checkboxes[i].disabled) {
                checkboxes[i].checked = setTo;
            }                
        }
        this._validateRecommendation(null, checkboxes);
    },    
 
    _loadFriends: function() {
    	this.elementMap.get(RecommendationController_DIV_ADD_RECOMMENDATION_FRIENDS).update('<div id="myQuestLoadingDiv"><img src="/images/icons/general/spacer.gif" alt="' + MessageHelper.format("recommendationController_loading") + '" class="loading" /></div>');       
    	
    	DAO.load({endpoint: "RecommendationController.FriendsList"}, this.bibID);
    },
    
    showSuggestions: function() {
    	this.autocompleter.updateChoices();
    }
    
    
});