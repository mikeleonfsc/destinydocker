/* myquestmenu.js */
Class.create(BaseController, {
	init: function() {
	},
	
	registerEvents: function() {
		var boundUpdateMyQuestView = this.updateMyQuestView.bind(this);
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_UPDATES), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_UPDATES));
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_SHELF_HAVE_READ), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_SHELF, MyQuestController_SHELF_HAVE_READ));
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_SHELF_NOW_READING), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_SHELF, MyQuestController_SHELF_NOW_READING));
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_SHELF_WANT_TO_READ), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_SHELF, MyQuestController_SHELF_WANT_TO_READ));
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_INBOX), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_INBOX));
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_FRIENDS), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_FRIENDS));
		Event.observe(this.elementMap.get(MyQuestController_LINK_MYQUEST_LEFT_PREFERENCES), "mousedown", boundUpdateMyQuestView.curry(MyQuestController_MAPPING_PREFERENCES));
	},
	
	updateMyQuestView: function(mapping, shelfNumber) {
		var loader = Registry.lookup("MyQuestController.Loader");
		
		window.ajaxTracker.abortAllRequests();
		
		var result = true;
        if (mapping == MyQuestController_MAPPING_UPDATES) {
            result = loader.loadUpdates();
        } else if (mapping == MyQuestController_MAPPING_SHELF) {
        	result = loader.loadShelf(shelfNumber);
        } else if (mapping == MyQuestController_MAPPING_INBOX) {
            result = loader.loadInBox();
        } else if (mapping == MyQuestController_MAPPING_FRIENDS) {
            result = loader.loadFriends();
        } else if (mapping == MyQuestController_MAPPING_PREFERENCES) {
            result = loader.loadPreferences();
        }
        
        if(result) {
        	loader.showLoading();
        }
	},
	
	updateInboxCount: function(count) {
		this.elementMap.get(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(count);
	},
	updateUpdateCount: function(count) {
		this.elementMap.get(MyQuestController_SPAN_MYQUEST_LEFT_UPDATE_COUNT).update(count);
	},
	isVisible: function() {
		return this.container.visible();
	}
});