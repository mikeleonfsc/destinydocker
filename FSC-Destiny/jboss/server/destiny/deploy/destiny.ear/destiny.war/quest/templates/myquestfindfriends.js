/* myquestfindfriends.js */
Class.create(BaseController, {
	init: function() {
		var loader = Registry.lookup("MyQuestFriendsController.Loader");		
		loader.findFriendsCallback(this);
 	},
	
	registerEvents: function() { 		 		
 	}
 	
});