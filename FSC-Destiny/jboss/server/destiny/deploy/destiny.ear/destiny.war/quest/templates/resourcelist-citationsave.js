/* resourcelist-citationsave.js */
Class.create(BaseController, {
    init: function() {
		var resourceList = Registry.lookup("ResourceListCitationController.Dialog");
		if(this.data.errorMsg) {
			resourceList.handleErrorMessage(this.data.errorMsg, this.data.focusField);
		} else {
			resourceList.closeDialog();
		}
    },
    
    registerEvents: function() {
    	
    }
});