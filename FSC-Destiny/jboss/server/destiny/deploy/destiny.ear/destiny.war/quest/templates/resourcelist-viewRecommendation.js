/* resourcelist-viewRecommendation.js */
Class.create(BaseController, {
    init: function() {
		this.elementMap.get(ResourceListController_DIV_RECOMMENDATION_VIEW_TITLE).update(this.data.title);
		this.elementMap.get(ResourceListController_DIV_RECOMMENDATION_VIEW_AUTHOR).update(this.data.author);
		this.elementMap.get(ResourceListController_DIV_RECOMMENDATION_VIEW_DATE).update(this.data.date);
		this.elementMap.get(ResourceListController_DIV_RECOMMENDATION_VIEW_FROM_PATRON).update(this.data.fromPatron);
		this.elementMap.get(ResourceListController_DIV_RECOMMENDATION_VIEW_COMMENTS).update(this.data.comments);
	
		this.modal.show();
    },
    
    registerEvents: function() {
    	Event.observe(this.elementMap.get(ResourceListController_BUTTON_RECOMMENDATION_VIEW_CANCEL), "mousedown", this.closeDialog.bind(this));
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    }    
});