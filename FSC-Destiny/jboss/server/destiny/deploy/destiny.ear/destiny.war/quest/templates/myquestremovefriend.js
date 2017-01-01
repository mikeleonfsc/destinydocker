/* myquestremovefriend.js */
Class.create(BaseController, {
	init: function() {
		if (this.data.mapping == MyQuestController_MAPPING_UPDATES) {
			var loader = Registry.lookup("MyQuestUpdatesController.Loader");
		} else if (this.data.mapping == MyQuestController_MAPPING_INBOX) {
			var loader = Registry.lookup("MyQuestInboxController.Loader");
		} else if (this.data.mapping == MyQuestController_MAPPING_FRIENDS){
			var loader = Registry.lookup("MyQuestFriendsController.Loader");
		}
		
		if (loader && Object.isFunction(loader.removeFriendCallback)) {
			loader.removeFriendCallback(this.data);
		}
 	},
	
	registerEvents: function() { 		 		
 	}
 	
});