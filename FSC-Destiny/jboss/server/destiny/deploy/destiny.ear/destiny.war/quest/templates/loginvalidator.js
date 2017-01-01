/* loginvalidator.js */
Class.create(BaseController, {
	init: function() {
		window.ajaxTracker.abortAllRequests();
        if (this.data.redirect) {
            window.location = this.data.redirect; //successful login
        } else {
        	var loginDialog = Registry.lookup("LoginController.LoginDialog");        	
        	loginDialog.handleError(this.data);
        }
	},
	
	registerEvents: function() {		
	}
		
});