/* myquestdata-inbox.js */
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
		
		if (json.mapping == MyQuestController_MAPPING_INBOX) {
			$("myQuestMainContentWrapper").className = "myQuestInbox";
		}
		
		var todayStr = json.todayStr;		
		if (wrapper.hasClassName("myQuestInbox")) {
			this.updatesList = new MyQuestList({resultsDivID: 'myQuestMainContent', rowClass: 'myQuestItem', todayStr: todayStr, emptyStr: MessageHelper.format("myQuestUpdatesController_youHaveNoUpdates") });
		}
		wrapper.show();
		this.currentMode = json.mapping;
		
		this.records = [];
        for (i = 0; i < this.data.data.dateGroups.length; i ++) {
        	var dateGroup = this.data.data.dateGroups[i];
        	for (j = 0; j < dateGroup.items.length; j ++) {
        		var item = dateGroup.items[j];
        		this.records.push(item);
        	}
        }
		var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		this.hoverGroup = HoverMaster.createGroup({
			name: this.name,
			data: this.records,
			activatorContainer: this.container,
			hoverContainer: $("content-outer"),
			controllerURL: this.data.hoverControllerURL,
			templateURL: this.data.hoverTemplateURL,
			openDelay: 0.5,
			closeDelay: 0.1,
			onShow: function(activator, hover) {	
				var mainContent = activator.up("#myQuestMainContent");
				if (Object.isElement(mainContent)) {
					var highZindexChildren = mainContent.select(".high-zindex");
					if (Object.isArray(highZindexChildren)) {
						for (i=0; i < highZindexChildren.length; i++) {
							if (Object.isElement(highZindexChildren[i])) {
								highZindexChildren[i].removeClassName("high-zindex");
							}
						}
					}
				}
				var parentItem = activator.up(".myQuestItem");
				if (Object.isElement(parentItem)) {
					parentItem.addClassName("high-zindex");
				}
				var dateGroup = activator.up("." + MyQuestController_CLASS_MYQUEST_DATE_GROUP);
				if (Object.isElement(dateGroup)) {
					dateGroup.addClassName("high-zindex");
				}
				$("content-outer").addClassName("high-zindex");
			},
			onHide: function(activator, hover) {
				var parentItem = activator.up(".myQuestItem");
				if (Object.isElement(parentItem)) {
					parentItem.removeClassName("high-zindex");
				}
				var dateGroup = activator.up("." + MyQuestController_CLASS_MYQUEST_DATE_GROUP);
				if (Object.isElement(dateGroup)) {
					dateGroup.removeClassName("high-zindex");
				}
				$("content-outer").removeClassName("high-zindex");
			}
		});
	},
	
	registerEvents: function() {		
		if ($("myQuestUpdatesResults")) {
			Event.stopObserving("myQuestUpdatesResults");
			Event.observe("myQuestUpdatesResults", "click", this.doReportAbuse.bindAsEventListener(this));
		}
		Event.stopObserving("myQuestMainContent");
		Event.observe('myQuestMainContent', "mousedown", this.determineAction.bindAsEventListener(this));
		Event.stopObserving("myQuestFooter");
		Event.observe('myQuestFooter', "click", this.loadOlderOrNewerResults.bindAsEventListener(this));
		
		//do the titledetails stuff now
		for (i = 0; i < this.data.data.dateGroups.length; i ++ ) {
			var group = this.data.data.dateGroups[i];
			for (j = 0; j < group.items.length; j ++) {					
				var item = group.items[j];				
				var link = $("titleDetailLink_" + item.auditID);
				var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
				
				var titleDetailsLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, item.bibID, null);												
				if (link) {
					Event.observe("titleDetailLink_" + item.auditID, "mousedown", titleDetailsLoader);
				}				
			}
		}
	},
	
    doReportAbuse: function(event){    
    	var eventSource = Event.element(event);
		if (eventSource.hasClassName(MyQuestUpdatesController_CLASS_MYQUEST_REPORT_ABUSE)) {
			var wrapper = Utility.upToClass(eventSource, "myQuestUpdatesItem");
			if (wrapper) {
				var idx = Utility.downToClass(wrapper, "currentID").readAttribute("value");
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
	
	loadOlderOrNewerResults: function (event) {
		var eventSource = Event.element(event);
		var loadingHtml = ReusableTemplates.load("EmptyImageTemplate", {id:"loading",styleClass:"loading", altText:"loading_string"});
		if (eventSource.hasClassName("myQuestLaterPostControlLink")) {			
			var updatesOffset = $("updatesOffsetPrev").innerHTML;
			$("myQuestMainContent").innerHTML = loadingHtml ;
			DAO.load({endpoint:"MyQuestInboxController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)}, null, updatesOffset);			
			
		} else if (eventSource.hasClassName("myQuestEarlierPostControlLink")) {			
			var updatesOffset = $("updatesOffsetNext").innerHTML;
			$("myQuestMainContent").innerHTML = loadingHtml ;
			DAO.load({endpoint:"MyQuestInboxController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)}, null, updatesOffset);			
			
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
			this.updatesList.removeRow(json.userID, MessageHelper.format("myQuestInboxController_someoneHasBeenAddedToYourFriends", patronName), this.refreshUpdatesOrInbox.bind(this));
		}
 
		if(json.inboxCount >= 0){   
			var menu = Registry.lookup("MyQuestController.Menu");			
			$(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount);
		}		
	},
	removeRecommendationCallback: function (json) {
		if (this.updatesList) {
			this.updatesList.removeRow(json.recommendationID, null, this.refreshUpdatesOrInbox.bind(this));
		}
		if(json.inboxCount >= 0){
			var menu = Registry.lookup("MyQuestController.Menu");
			$(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount);
		}
	},
	
	refreshUpdatesOrInbox: function() {
		var wrapper = $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT_WRAPPER);
		DAO.load({endpoint: "MyQuestInboxController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)}, this.data.numResultsForPage, this.data.updatesOffset);
	},
		
	getCurrentMode: function() {
		return this.currentMode;
	},

	updateResults: function (IDs, key, value, propertyToUpdate) {
		var records = this.records;
		for (var j = 0; j < records.length; j++) {
			var record = records[j];
			if (IDs.indexOf(eval("record." + key)) >= 0) {
				record[propertyToUpdate] = value;
			}        
		}
	}
	
});