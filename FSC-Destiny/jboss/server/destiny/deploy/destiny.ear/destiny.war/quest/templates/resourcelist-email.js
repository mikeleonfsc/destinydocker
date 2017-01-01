/* resourcelist-email.js */
Class.create(BaseController, {
    init: function() {
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		
		if (this.data.message) {
			var emailDialog = Registry.lookup("ResourceListEmailController.Dialog");
			if (this.data.successMsg) {
				emailDialog.modal.animatedSubmit(this.data.successMsg, 2.0);
	        } else {
	            var errorDiv = emailDialog.elementMap.get(ResourceListEmailController_DIV_EMAIL_OPTIONS_ERROR_MESSAGE);
	            errorDiv.update(this.data.message);
	            errorDiv.show();
	            emailDialog.elementMap.get(ResourceListEmailController_BUTTON_EMAIL_OPTIONS_SEND).show();
	            emailDialog.elementMap.get(ResourceListEmailController_IMG_SEND_EMAIL_IN_PROGRESS).hide();
			}
		} else {
			this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_DISPLAY_NAME).setValue(this.data.displayName);
			this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_DISPLAY_NAME).focus();
			
			this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_ADDRESS).setValue(this.data.emailAddress);
			this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_SUBJECT).setValue(resourceListMaster.getListNameForEmail());
			this.elementMap.get(ResourceListEmailController_IMG_SEND_EMAIL_IN_PROGRESS).hide();
		
			this.modal.show();
		}
    },
    
    registerEvents: function() {
    	if (!this.data.message) {
	    	Event.observe(this.elementMap.get(ResourceListEmailController_BUTTON_EMAIL_OPTIONS_CLOSE), "mousedown", this.closeDialog.bind(this));
	    	Event.observe(this.elementMap.get(ResourceListEmailController_BUTTON_EMAIL_OPTIONS_SEND), "mousedown", this.sendEmail.bind(this));
    	}
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },
    
    sendEmail: function() {
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		var collectionType = resourceListMaster.getCollectionType();
		var listID = resourceListMaster.getListID();
		
    	var displayName = this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_DISPLAY_NAME).getValue();
		var emailAddress = this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_ADDRESS).getValue();
		var subject = this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_SUBJECT).getValue();
		var message = this.elementMap.get(ResourceListEmailController_INPUT_EMAIL_OPTIONS_MESSAGE).getValue();
    	
		var errorDiv = this.elementMap.get(ResourceListEmailController_DIV_EMAIL_OPTIONS_ERROR_MESSAGE);
		
		displayName = displayName.strip();
		emailAddress = emailAddress.strip();
		subject = subject.strip();
        if (displayName.empty() || emailAddress.empty() || subject.empty()) {
            errorDiv.update(MessageHelper.format("resourceListEmailController_youMustProvideADisplayName"));
            errorDiv.show();
        } else {
        	errorDiv.update("");
        	errorDiv.hide();
        	
            this.elementMap.get(ResourceListEmailController_BUTTON_EMAIL_OPTIONS_SEND).hide();
            this.elementMap.get(ResourceListEmailController_IMG_SEND_EMAIL_IN_PROGRESS).show();
            
        	DAO.load({endpoint: "ResourceListEmailController.SendEmail", method: "post"}, collectionType, listID, displayName, emailAddress, subject, message);
        }
    }
});