/* myquestremoverecommendation.js */
Class.create(BaseController, {
	init: function() {
		//hokey
		var loader = Registry.lookup("MyQuestUpdatesController.Loader");
		if (!loader) {
			loader = Registry.lookup("MyQuestInboxController.Loader");
		}
		loader.removeRecommendationCallback(this.data);
 	},
	
	registerEvents: function() { 		 		
 	}
 	
});