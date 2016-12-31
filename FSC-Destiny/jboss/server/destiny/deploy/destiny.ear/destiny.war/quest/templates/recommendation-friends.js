/* recommendation-friends.js */
Class.create(BaseController, {
    init: function() {
		var dialog = Registry.lookup("RecommendationController.RecommendationDialog");
		dialog.updateFriends(this.data);
    },

    registerEvents: function() {
    }
    
});