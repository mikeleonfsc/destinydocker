/* resourcelist-renew.js */
Class.create(BaseController, {
    init: function() {
		if (this.data.errorMessage) {
            this.elementMap.get(ResourceListRenewController_SPAN_REASON_FOR_RENEW_FAILURE).update(this.data.errorMessage);
			this.modal.show();
		} else {
			var resourceListResults = Registry.lookup("ResourceListController.MyInfo");
			resourceListResults.updateTitleOnRenew(this.data.recordID, this.data.currentID, this.data.newDueDate, this.data.newDueDateLabel);
			this.modal.hide();
		}
    },
    
    registerEvents: function() {
    	Event.observe(this.elementMap.get(ResourceListRenewController_BUTTON_RENEW_CLOSE), "mousedown", this.closeDialog.bind(this));
    	Event.observe(this.elementMap.get(ResourceListRenewController_BUTTON_RENEW_MESSAGE_BOX_CLOSE), "mousedown", this.closeDialog.bind(this));
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    }
});