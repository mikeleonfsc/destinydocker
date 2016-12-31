/* wish.js */
Class.create(BaseController, {
    init: function() {	
		this.modal.show();
	    
	    this.bibID = this.data.bibID;
	    //initialize bolding
	    if(this.bibID) {
	    	this.elementMap.get(WishController_INPUT_ADD_WISH_CURRENT_TITLE).checked = true;
	    	this.elementMap.get(WishController_SPAN_ADD_WISH_DEFAULT_TITLE).addClassName(WishController_CLASS_ADD_WISH_SELECTED_WISH);                   
	    	this.elementMap.get(WishController_SPAN_ADD_WISH_ANOTHER_TITLE).removeClassName(WishController_CLASS_ADD_WISH_SELECTED_WISH);
	    } else {
	    	this.elementMap.get(WishController_INPUT_ADD_WISH_ANOTHER_TITLE).checked = true;
	    	this.elementMap.get(WishController_DIV_ADD_WISH_TITLE_SELECTOR).hide();                   
	    	this.elementMap.get(WishController_DIV_ADD_WISH_DATA).show(); 
	    	var searchResults = Registry.lookup("SearchController.SearchResults");
	    	if(searchResults && searchResults.getSearchTerm()) {
    			this.elementMap.get(WishController_FIELD_WISH_TITLE).value = searchResults.getSearchTerm();
	    	}
	    }
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(WishController_BUTTON_ADD_WISH_CLOSE), "mousedown", this.closeDialog.bind(this));
        Event.observe(this.elementMap.get(WishController_INPUT_ADD_WISH_CURRENT_TITLE), "click", this.toggleSelectedTitle.bind(this, false));
        Event.observe(this.elementMap.get(WishController_INPUT_ADD_WISH_ANOTHER_TITLE), "click", this.toggleSelectedTitle.bind(this, true));
        Event.observe(this.elementMap.get(WishController_BUTTON_ADD_WISH_SAVE), "click", this.addWish.bind(this));
    },

    populateErrors: function(errors) {
    	var errorHTML = ReusableTemplates.load("GenericListTemplate", {list:errors});
    	this.elementMap.get(WishController_DIV_ADD_WISH_ERRORS).update(errorHTML);
    	this.elementMap.get(WishController_DIV_ADD_WISH_ERRORS).show();
    	this.elementMap.get(WishController_BUTTON_ADD_WISH_SAVE).disabled = false;
    	this.elementMap.get(WishController_BUTTON_ADD_WISH_SAVE).blur();
    },
    
    addWish: function(event) {
        this.elementMap.get(WishController_BUTTON_ADD_WISH_SAVE).disabled = true;                        
        var reason = this.elementMap.get(WishController_FIELD_WISH_REASON).getValue();
        var loadResult = false;
        if(this.elementMap.get(WishController_INPUT_ADD_WISH_CURRENT_TITLE).checked == true) {
        	loadResult = DAO.load({endpoint:"WishController.WishGranter", container: null, method:'post'}, this.bibID, null, null, null, reason)
        }  else {
        	var title = this.elementMap.get(WishController_FIELD_WISH_TITLE).getValue();
        	var author = this.elementMap.get(WishController_FIELD_WISH_AUTHOR).getValue();
        	var isbn = this.elementMap.get(WishController_FIELD_WISH_ISBN).getValue();
        	loadResult = DAO.load({endpoint:"WishController.WishGranter", container: null, method:'post'}, null, title, author, isbn, reason)
        }
        if(!loadResult) {
        	this.elementMap.get(WishController_BUTTON_ADD_WISH_SAVE).disabled = false;                        
        }
    },

    animateClose: function(thanks) {
        //instead of closing the dialog..lets roll some animation yo!
        this.modal.animatedSubmit(thanks);
    },

    closeDialog: function(event) {
            this.modal.closeDialog();
    },
    
    toggleSelectedTitle: function(showme)  {
        if (showme) {
            if(!this.elementMap.get(WishController_DIV_ADD_WISH_DATA).visible()) {
                this.elementMap.get(WishController_INPUT_ADD_WISH_CURRENT_TITLE).disabled=true;
                this.elementMap.get(WishController_INPUT_ADD_WISH_ANOTHER_TITLE).disabled=true;
                Effect.BlindDown(this.elementMap.get(WishController_DIV_ADD_WISH_DATA), {duration: 0.5, afterFinish: this.enableTitleSelector.bind(this)});
                this.elementMap.get(WishController_SPAN_ADD_WISH_ANOTHER_TITLE).addClassName(WishController_CLASS_ADD_WISH_SELECTED_WISH);
                this.elementMap.get(WishController_SPAN_ADD_WISH_DEFAULT_TITLE).removeClassName(WishController_CLASS_ADD_WISH_SELECTED_WISH);
            }
        } else {
            if(this.elementMap.get(WishController_DIV_ADD_WISH_DATA).visible()) {
                this.elementMap.get(WishController_INPUT_ADD_WISH_CURRENT_TITLE).disabled=true;
                this.elementMap.get(WishController_INPUT_ADD_WISH_ANOTHER_TITLE).disabled=true;
                Effect.BlindUp(this.elementMap.get(WishController_DIV_ADD_WISH_DATA), {duration: 0.5, afterFinish: this.enableTitleSelector.bind(this)});
                this.elementMap.get(WishController_SPAN_ADD_WISH_DEFAULT_TITLE).addClassName(WishController_CLASS_ADD_WISH_SELECTED_WISH);                   
                this.elementMap.get(WishController_SPAN_ADD_WISH_ANOTHER_TITLE).removeClassName(WishController_CLASS_ADD_WISH_SELECTED_WISH);
            }
        }
        this.elementMap.get(WishController_DIV_ADD_WISH_ERRORS).hide();
    },

    enableTitleSelector: function() {
        this.elementMap.get(WishController_INPUT_ADD_WISH_ANOTHER_TITLE).disabled=false; 
        this.elementMap.get(WishController_INPUT_ADD_WISH_CURRENT_TITLE).disabled=false;
    }
   
});