/* accountmanagementvalidator.js */
Class.create(BaseController, {
	init: function() {
		window.ajaxTracker.abortAllRequests();
		var createAccountDialog = Registry.lookup("CreateAccountController.CreateAccountDialog");
	    if (this.data.redirect) {
	        window.location = this.data.redirect; //successful login
	    } else if (this.data.errors) {
	    	createAccountDialog.handleError(this.data);
	    } else {
	    	createAccountDialog.handlePageChange(this.data);
	    	createAccountDialog.clearErrors();
	    }
	}
});