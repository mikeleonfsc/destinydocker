/* securelogin.js */
Class.create(BaseController, {
	init: function() {
		var delayedPopup = null;
		if (this.data.httpsLogin) {
			delayedPopup = this.loadLoginDialog.bind(this);
		} else if (this.data.httpsCreateAccount) {
			delayedPopup = this.loadCreateAccountDialog.bind(this);
		}
		
		if (delayedPopup) {
			delayedPopup.defer();
		}
	},
	
	registerEvents: function() {
	},
	
	isSecure: function() {
		return true;
	},
	
	redirectOnClose: function() {
		window.location = this.data.redirect;
	},
	
	createModal: function() {
		this.modalId = SearchBoxController_DIV_LOGIN_MODULE_OUTER;
    	this.modalContentDivId = "loginContent";
    	var params = {
				width:"",
				id:this.modalId,
				zIndex:"50000",
				contentDivId:this.modalContentDivId,
				hideOnOutsideClick:"true"
		};
		return new ModalDialog(params);
	},
	
	loadLoginDialog: function() {
		var modalDialog = this.createModal();
		Event.observe(modalDialog.contentDiv, "modal:close", this.redirectOnClose.bind(this));
		DAO.load({endpoint:"LoginController.LoginDialog", modal:modalDialog});
	},
	
	loadCreateAccountDialog: function() {
		var modalDialog = this.createModal();
		Event.observe(modalDialog.contentDiv, "modal:close", this.redirectOnClose.bind(this));
		DAO.load({endpoint:"CreateAccountController.CreateAccountDialog", modal:modalDialog}, false);
	}
});