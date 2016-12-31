/* myquestdata.js */
//i am used for myquest updates and myquest inbox
Class.create(BaseController, {
	init: function() {
		var loader = Registry.lookup("MyQuestController.Loader");
		
		$("searchtemplate").removeClassName("home");
		$("searchtemplate").removeClassName("search");
		$("searchtemplate").addClassName("bookClub");		
		var json = this.data;		
		this.menu = Registry.lookup("MyQuestController.Menu");
		
		if(json.inboxCount >= 0){
			this.menu.updateInboxCount(json.inboxCount);
		}		
		var html = this.template.render(json);		
		loader.updateContent(html);		
		this.shelfSelect = new ShelfSelect({id: "myQuestMainContent"});		
		var wrapper = $("myQuestMainContentWrapper");
		
		this.updatesList = null;
		
		$("myQuestMainContentWrapper").className = "myQuestUpdates";
		
		var todayStr = json.todayStr;		
		if (wrapper.hasClassName("myQuestUpdates")) {
			this.updatesList = new MyQuestList({resultsDivID: 'myQuestMainContent', rowClass: 'myQuestItem', todayStr: todayStr, emptyStr: MessageHelper.format("myQuestUpdatesController_youHaveNoUpdates") });
		}
		wrapper.show();
		this.currentMode = json.mapping;
		
		this.disableOnLoading();
		if(!DAO.load({endpoint:"MyQuestUpdatesController.OlderLoader", container: $(MyQuestUpdatesController_DIV_MYQUEST_UPDATES_RESULTS)}, 20, null, -1, "")) {
			this.enableOnLoading();
		}
	},
	
	registerEvents: function() {
		if ($("myQuestUpdatesResults")) {
			Event.stopObserving("myQuestUpdatesResults");
			Event.observe($("myQuestUpdatesResults"), "mousedown", this.prefsListener.bindAsEventListener(this));
			Event.observe("myQuestUpdatesResults","click", this.showCommentBox.bindAsEventListener(this));
			Event.observe("myQuestUpdatesResults","click", this.addComment.bindAsEventListener(this));
			Event.observe("myQuestUpdatesResults","keyup", this.addCommentAsYouTypeListener.bindAsEventListener(this));
			Event.observe("myQuestUpdatesResults","click", this.showAllComments.bindAsEventListener(this));
			Event.observe("myQuestUpdatesResults", "click", this.doReportAbuse.bindAsEventListener(this));
			Event.observe("myQuestUpdatesResults", "click", this.showHideDateGroups.bindAsEventListener(this));
		}
		Event.stopObserving("myQuestMainContent");
		Event.observe('myQuestMainContent', "mousedown", this.determineAction.bindAsEventListener(this));
		Event.stopObserving("myQuestFooter");
		Event.observe('myQuestFooter', "click", this.loadOlderOrNewerResults.bindAsEventListener(this));
		

	},
	
	disableOnLoading: function() {
		// Show loading graphic
		if($(MyQuestUpdatesController_ID_MYQUEST_UPDATES_LOADING)) {
			$(MyQuestUpdatesController_ID_MYQUEST_UPDATES_LOADING).show();
		}
		// hide the show older post link
		if($(MyQuestUpdatesController_ID_MYQUEST_OLDER_RESULTS_LINK)) {
			$(MyQuestUpdatesController_ID_MYQUEST_OLDER_RESULTS_LINK).hide();
		}
		
		// disable the date headers
		this.setLoading(true);
	},
	enableOnLoading: function() {
		// Hide loading graphic
		
		if($(MyQuestUpdatesController_ID_MYQUEST_UPDATES_LOADING)) {
			$(MyQuestUpdatesController_ID_MYQUEST_UPDATES_LOADING).hide();
		}
		
		// refresh older post link
	    var olderLoader = Registry.lookup("MyQuestUpdatesController.OlderLoader");
		if(olderLoader) {
			olderLoader.refreshFooter();
		}
		
		// enable the date headers
		this.setLoading(false);
	},
	setLoading: function(loading) {
		this.isLoading = loading;
	},
    doReportAbuse: function(event){    
    	var eventSource = Event.element(event);
		if (eventSource.hasClassName(MyQuestUpdatesController_CLASS_MYQUEST_REPORT_ABUSE)) {
			var wrapper = Utility.upToClass(eventSource, "myQuestUpdatesItem");
			if (wrapper) {
				var conversationID = Utility.downToClass(wrapper, "conversationID").readAttribute("value");
			} else {
				wrapper = Utility.upToClass(eventSource, "myQuestShelfItem");
	 			var recommendationID = wrapper.getAttribute("rowid");
			}
	    		    	    	
	    	var params = {
	    			width:"610",
	    			id:ReportAbuseController_DIV_REPORT_ABUSE_DIALOG,
	    			zIndex:"50000",
	    			hideOnOutsideClick:"true"
	    	};
	    	var modalDialog = new ModalDialog(params);
	    	DAO.load({endpoint: "ReportAbuseController.ReportAbuseDialog", modal: modalDialog}, conversationID, recommendationID);
    	}
    },
    
    showHideDateGroups: function (event) {
    	if(!this.isLoading) {
			var eventSource = Event.element(event);
			if (eventSource.hasClassName(MyQuestController_CLASS_MYQUEST_DATE_GROUP_EXPAND) || 
				eventSource.hasClassName(MyQuestController_CLASS_MYQUEST_DATE_GROUP_COLLAPSE)) {
				var idx = eventSource.readAttribute("id");
				
				var olderLoader = Registry.lookup("MyQuestUpdatesController.OlderLoader");
				var lastAuditID = olderLoader.getLastAuditIDForDateGroup(idx);
				olderLoader.truncateResults(idx);
				
				this.disableOnLoading();
				if(!DAO.load({endpoint:"MyQuestUpdatesController.OlderLoader", appendTo: "MyQuestUpdatesController.OlderLoader"}, 10, lastAuditID, eval(idx)-1, "", idx)) {
					this.enableOnLoading();
				}
			}
    	}
	},
    
	showAllComments: function (event) {	
		var eventSource = Event.element(event);
		if (eventSource.hasClassName(MyQuestUpdatesController_CLASS_MYQUEST_VIEW_ALL_COMMENT)) {
			var wrapper = Utility.upToClass(eventSource, "myQuestUpdatesItem");
			var idx = Utility.downToClass(wrapper, "auditID").readAttribute("value");
			var conversationID = Utility.downToClass(wrapper, "conversationID").readAttribute("value");
			
			DAO.load({endpoint:"MyQuestUpdatesController.AllComments", container:null}, idx, conversationID);			
		}
	},
	
	showCommentBox: function (event) {
		var eventSource = Event.element(event);
		if (eventSource.hasClassName(MyQuestController_CLASS_MYQUEST_ADD_A_COMMENT)) {
			var wrapper = Utility.upToClass(eventSource, "myQuestUpdatesItem");
			var idx = Utility.downToClass(wrapper, "auditID").readAttribute("value");
			
			// Begin Safari 2/3 hokey fix.. sometimes it will find the ID, othertimes it will not.
			var tmp = MyQuestController_LI_MY_QUEST_ADD_COMMENT_BOX_PREFIX  + idx;
			var commentBoxThing = $(tmp); 
			if (!commentBoxThing) {
				commentBoxThing = Utility.downToClass($(window.newRowID), "myQuestAddCommentWrapper");
			}
			if (commentBoxThing) {
				commentBoxThing = commentBoxThing.up();
			}
			if (commentBoxThing && !commentBoxThing.visible()) {
				var numbers = Utility.downToClass(wrapper, "myQuestAddCommentCharValue");
				if (numbers) {
					numbers.innerHTML = 255;
				}
				
				if (this.commentBoxThing) {
					var results = $("myQuestUpdatesResults");
					this.restoreOldAuditRow(results);
					results.oldRow = null;
	
					if (this.commentBoxThing.visible()) {				
						this.commentBoxThing.hide();
					}
				}
				
				commentBoxThing.show();
				this.commentBoxThing = commentBoxThing;
			}
			this.focusCommentBox(idx);
		}
	},
 	restoreOldAuditRow: function (results) {
		if (results.oldRow) {
			// We've already got a comment opened, we need to restore the old element
			var addedAudit = $$(".auditID[value=" + results.newAuditID + "]")[0];
			
			if (addedAudit) {
				var dopplegangerElem = Utility.upToClass(addedAudit, "myQuestUpdatesItem");
				Element.insert(dopplegangerElem, {before: results.oldRow});
				dopplegangerElem.remove();
				results.newRowID = null;
			}
		}
	},
	addComment: function (event) {
		var eventSource = Event.element(event);
		var upDiv = Utility.upToClass(eventSource,"myQuestAddCommentButton");
		if (upDiv) {
			var addCommentButtonID = upDiv.readAttribute("value")
			var temp = Utility.upToClass(eventSource, "myQuestUpdatesItem");   
			var temp2 = Utility.downToClass(temp, "auditID");
			var auditID = temp2.readAttribute("value");   
			var temp3 = Utility.downToClass(temp, "conversationID");
			var conversationID = temp3.readAttribute("value");
			
			var commentWrapper = Utility.upToClass(eventSource, "myQuestAddCommentWrapper");
			var textareaThing = Utility.downToClass(commentWrapper, MyQuestUpdatesController_CLASS_MY_QUEST_ADD_COMMENT_BOX );
			var commentData = textareaThing.value;
			
			if (commentData && !commentData.blank()) {
				textareaThing.value = "";
				DAO.load({endpoint:"MyQuestUpdatesController.MyQuestCommentAdd",container:null},auditID, conversationID, commentData, temp.identify(), addCommentButtonID);								
			} 
		}
	},
	
	addCommentAsYouTypeListener: function (event) {
		var eventSource = Event.element(event);
		if (eventSource.hasClassName("myQuestAddCommentBox")) {
			var wrapper = Utility.upToClass(eventSource, "myQuestAddCommentWrapper");
			var numbers = Utility.downToClass(wrapper, "myQuestAddCommentCharValue");
			if (eventSource.value.length > 255) {			
				eventSource.value = eventSource.value.substring(0, 255);
			}
			if (eventSource.value.length > 235) {
				numbers.addClassName("warnCharLeft");
			} 
			if (eventSource.value.length <= 235 && numbers.hasClassName("warnCharLeft") ){
				numbers.removeClassName("warnCharLeft");
			}
			numbers.innerHTML = 255 - eventSource.value.length;
		}
	},
	
	focusCommentBox: function (index) {
		var commentWrapper = $("myQuestAddCommentBoxLI_" + index);
		if (commentWrapper) { 
			var textarea = Utility.downToClass(commentWrapper, MyQuestController_CLASS_MY_QUEST_ADD_COMMENT_BOX);
			if (textarea && textarea.visible()) {
				textarea.focus();
			}
		}
	},
	
	loadOlderOrNewerResults: function (event) {
		var eventSource = Event.element(event);
		var loadingHtml = ReusableTemplates.load("EmptyImageTemplate", {id:"loading",styleClass:"loading", altText:"loading_string"});
		if (eventSource.identify() === "myQuestEarlierPostControlLink") {			
			
			var olderLoader = Registry.lookup("MyQuestUpdatesController.OlderLoader");
			var lastAuditID = olderLoader.getLastAuditID();
			this.disableOnLoading();
			
			if(!DAO.load({endpoint:"MyQuestUpdatesController.OlderLoader", appendTo: "MyQuestUpdatesController.OlderLoader"}, 10, lastAuditID, olderLoader.getLastDateGroupIdx(), olderLoader.getLastDateString())) {
				this.enableOnLoading();
			}
		}
	},
	
	determineAction: function (event) {
 		if ($("myQuestMainContentWrapper").className != "myQuestFriends") {
	 		var eventSource = Event.element(event);
	 		var wrapper = event.target.up(".myQuestFriendsItem");
	 		if (wrapper) {
	 			var userID = wrapper.getAttribute("rowid");
		 		if (eventSource.hasClassName("myQuestControlDecline")) {
		 			wrapper.down(".myQuestControlWrapper").hide();
					DAO.load({endpoint: "MyQuestFriendsController.RemoveFriend", container:null},userID, this.getCurrentMode());
		 		} else if (eventSource.hasClassName("myQuestControlAccept")) {
		 			wrapper.down(".myQuestControlWrapper").hide();
		 			DAO.load({endpoint: "MyQuestFriendsController.AddFriend", container:null},userID, this.getCurrentMode());
		 		}
		 	} 
	 		if (eventSource.hasClassName("myQuestRecommendationRemove")) {
	 			var wrapper = event.target.up(".myQuestShelfItem");
	 			wrapper.down(".myQuestShelfControlWrapper").hide();
	 			wrapper.down(".myQuestRecommendationRemove").hide();
	 			var recID = wrapper.getAttribute("rowid");
	 			DAO.load({endpoint:"MyQuestUpdatesController.RecommendationRemove", container:null}, recID);	 				 		   
		 	}
 		}
	},	
	
	removeFriendCallback: function (json) { 
		if (this.updatesList) {
			this.updatesList.removeRow(json.userID, null, function() {
				var mapping = MyQuestFriendsController_MAPPING_INBOX ;
				var wrapper = $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT_WRAPPER);
				mapping = MyQuestFriendsController_MAPPING_UPDATES;
				wrapper.fire(MyQuestFriendsController_EVENT_MYQUEST_OPTION_CLICK, {mapping: mapping});
			});
		} 
 		if(json.inboxCount >= 0){
			$(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount); 			
 		}	  
 	},
 	
 	addFriendCallback: function (json) {
		if (this.updatesList)  {
			var patronName = $$(".myQuestItem[rowid=" + json.userID + "] > .column2 > .myQuestFriendsFullName > .myQuestPatronName")[0].innerHTML;
			this.updatesList.removeRow(json.userID, MessageHelper.format("myQuestInboxController_someoneHasBeenAddedToYourFriends", patronName), null);
		}
 
		if(json.inboxCount >= 0){   
			var menu = Registry.lookup("MyQuestController.Menu");			
			$(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount);
		}		
	},
	removeRecommendationCallback: function (json) {
		if (this.updatesList) {
			this.updatesList.removeRow(json.recommendationID, null, null);
		}
		if(json.inboxCount >= 0){
			var menu = Registry.lookup("MyQuestController.Menu");
			$(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount);
		}
	},
	
	prefsListener: function(event) {
		var element = Event.element(event);		
		if (element.hasClassName("myQuestShelfPreferencesLink")) { 
			var loader = Registry.lookup("MyQuestController.Loader");
			loader.updateWrapperClass("myQuestPref");
			DAO.load({
				endpoint:"MyQuestPreferencesController.Loader", 
			container: loader.elementMap.get(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)});
		}
	},
	
	getCurrentMode: function() {
		return this.currentMode;
	}
	
});