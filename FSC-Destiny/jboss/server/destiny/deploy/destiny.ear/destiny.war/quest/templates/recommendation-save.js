/* recommendation-save.js */
Class.create(BaseController, {
    init: function() {
		var dialog = Registry.lookup("RecommendationController.RecommendationDialog");
		if (dialog && dialog.modal && Object.isFunction(dialog.modal.animatedSubmit)) {
			dialog.modal.animatedSubmit(this.data.sentMessage, 2.0);
		}
		var wrapper = $(MyQuestUpdatesController_ID_MYQUEST_STATS_RECOMMENDATIONS_SENT);
		var countElem = Utility.downToClass(wrapper, "myQuestCount");
		if (Object.isElement(countElem)) {
			var count =  eval($(countElem).innerHTML);
			countElem.update(count + 1);
		}
    },

    registerEvents: function() {
    }
    
});