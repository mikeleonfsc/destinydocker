/* login.js */
Class.create(BaseController, {
	init: function() {
        if (!this.data.loggedIn) {
        	window.ajaxTracker.abortAllRequests();
        	var secureLogin = Registry.lookup("LoginController.SecureLoginBootstrap")
            if (this.data.isSSLEnabled && (! secureLogin || ! secureLogin.isSecure())) {
                window.location = this.data.redirect;
            } else {
            	this.loadTemplate();
            	
            	this.setLoginTabActive();
            	this.clearErrors();
            	this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).setStyle({width: "556px"});
            	this.elementMap.get(LoginController_ACTION_LOGIN).enable();
            	this.setControlsToLoginStandard();

            	this.elementMap.get(LoginController_DIV_LOGIN_MODULE_INNER).show();
            	this.modal.show();
            	var focuser = this.focusUserNameNow.bind(this);
            	focuser.defer();
            }
        }
	},
	
	registerEvents: function() {	
	
		Event.observe(this.elementMap.get(LoginController_ACTION_CANCEL), "click", this.closeLoginDialog.bind(this));
		Event.observe(this.modal.contentDiv, "modal:close", this.focusSearch.bind(this));
		
		Event.observe(this.elementMap.get(LoginController_ACTION_LOGIN) , "click", this.validateLogin.bindAsEventListener(this));
		if (this.elementMap.get(LoginController_SPAN_LOGIN_FORGOT_PASSWORD_LINK_TEXT)) {
			Event.observe(this.elementMap.get(LoginController_SPAN_LOGIN_FORGOT_PASSWORD_LINK_TEXT), "mousedown", this.loadForgotPassword.bind(this));
		}
		if (this.data.userCanCreateLogin) {
			Event.observe(this.elementMap.get(BaseLoginController_LI_CREATE_NEW_ACCOUNT_TAB), "mousedown", this.loadCreateAccount.bind(this));
		}
		
		Event.observe(this.elementMap.get(LoginController_DIV_LOGIN_BOX_CONTENTS), "keydown", this.trapEnter.bindAsEventListener(this));
	},

	loadForgotPassword: function() {
		DAO.load({endpoint:"CreateAccountController.CreateAccountDialog", modal:this.modal}, true);
	},
	
	loadCreateAccount: function() {
		DAO.load({endpoint:"CreateAccountController.CreateAccountDialog", modal:this.modal}, false);
	},
	
	closeLoginDialog: function() {
		this.modal.closeDialog();
	},
	
	focusUserNameNow: function() {
		if (this.elementMap.get(LoginController_FIELD_USERNAME)) {
			if (this.elementMap.get(LoginController_FIELD_USERNAME).visible()){
				this.elementMap.get(LoginController_FIELD_USERNAME).activate();
			}
		}
	},	
	
	trapEnter: function(event) {
		if(event) {
			var charCode = event.charCode || event.keyCode || event.which;
	        if (charCode == 13) {
	        	this.validateLogin(event);
	        }

		}
	},
	
	validateLogin: function(event) {
		if(event) {
	        Event.stop(event);
	    }
		var login = this.elementMap.get(LoginController_ACTION_LOGIN);
	    if(login && login.visible()) {
	        login.disable();
	        
	        if(this.compareTemplate(this.template, LoginController_TEMPLATE_STANDARD)) {
		        var username = this.elementMap.get(LoginController_FIELD_USERNAME);
		        if(username) {
		        	username = username.getValue();
		        }
		        var password = this.elementMap.get(LoginController_FIELD_PASSWORD);
		        if(password) {
		        	password = password.getValue();
		        }
		        var loadResult = DAO.load({endpoint:"LoginController.LoginValidator", container:null}, username, password);
		        if(!loadResult) {
		        	login.enable();
		        }
	        } else {
	        	var username = this.elementMap.get(LoginController_FIELD_USERNAME2);
	        	if(username) {
	        		username = username.getValue();
	        	}
	        	var currentPassword = this.elementMap.get(LoginController_FIELD_PASSWORD_CURRENT);
	        	if(currentPassword) {
	        		currentPassword = currentPassword.getValue();
	        	}
	        	var newPassword = this.elementMap.get(LoginController_FIELD_PASSWORD_NEW);
	        	if(newPassword) {
	        		newPassword = newPassword.getValue();
	        	}
	        	var confirmPassword = this.elementMap.get(LoginController_FIELD_PASSWORD_CONFIRM);
	        	if(confirmPassword) {
	        		confirmPassword = confirmPassword.getValue();
	        	}
	        	var loadResult = DAO.load({endpoint:"LoginController.PasswordResetter", container:null}, username, currentPassword, newPassword, confirmPassword);
	        	if(!loadResult) {
	        		login.enable();
	        	}
	        }
	    }
	},
	
	loadTemplate: function() {	
		this.template = this.data.template;
		var myTemplate = new EJS({url:this.template}).render(this.data);		
		if (this.compareTemplate(this.template, LoginController_TEMPLATE_RESET_PASSWORD) && this.data.forgotPassword) {
			var temp = new EJS({url: this.data.loginWrapperTemplateURL}).render({requiredInfoLabel:this.data.requiredInfoLabel});
			$("loginFormCreateNewUserAccountTab_content").update(temp);		
			this.refreshElements();
		}
		
		this.elementMap.get(LoginController_DIV_LOGIN_BOX_CONTENTS).update(myTemplate);
		this.refreshElements();
		this.fixIERenderingIssue(LoginController_DIV_LOGIN_BOX_CONTENTS);
	},
	
	handleError: function(errorData) {
        this.data = errorData;
		this.loadTemplate();
		
		var errors = this.data.errors; 
		if (this.data.errorMessage) {
			errors = this.data.errorMessage;
		}
		
		var errorHTML = ReusableTemplates.load("GenericListTemplate", {list:errors});
		this.elementMap.get(LoginController_DIV_LOGIN_BOX_ERRORS).update(errorHTML);
		this.elementMap.get(LoginController_DIV_LOGIN_BOX_ERRORS).show();
        if (this.compareTemplate(this.template, LoginController_TEMPLATE_RESET_PASSWORD)) {
        	this.elementMap.get(LoginController_FIELD_USERNAME2).setValue(this.data.username);
        } else {
        	this.elementMap.get(LoginController_FIELD_USERNAME).setValue(this.data.username);
        	//we need to reobserve the forgot password link because we lost it when reloading the template.
        	if (this.data.userCanCreateLogin) {
        		Event.observe(this.elementMap.get(LoginController_SPAN_LOGIN_FORGOT_PASSWORD_LINK_TEXT), "mousedown", this.loadForgotPassword.bind(this));
        	}
        }
        if (this.data.focusField) {
            this.elementMap.get(this.data.focusField).focus();
        }
        
        if (this.data.passwordExpired) {        	
        	Event.observe(this.elementMap.get(LoginController_ACTION_LOGIN) , "click", this.validateLogin.bindAsEventListener(this));  	 
        } 
        this.setControlsToLoginStandard();
    	
	},
	
	showNextButton: function() {
		this.elementMap.get(LoginController_BUTTON_NEXT).show();
		this.elementMap.get(LoginController_BUTTON_NEXT).enable();
	},
	hideNextButton: function() {
		this.elementMap.get(LoginController_BUTTON_NEXT).hide();
	},
	showSaveButton: function() {
		this.elementMap.get(LoginController_BUTTON_SAVE).show();
		this.elementMap.get(LoginController_BUTTON_SAVE).enable();
	},
	hideSaveButton: function() {
		this.elementMap.get(LoginController_BUTTON_SAVE).hide();
	},
	
	setLoginTabActive: function() {
		this.elementMap.get(BaseLoginController_DIV_LOGIN_TAB).show();
    	this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).removeClassName(BaseLoginController_CLASS_LOGIN_CREATE_ACCOUNT);
    	this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).addClassName(BaseLoginController_CLASS_LOGIN_DEFAULT);
	},
	
	clearErrors: function() {
		this.elementMap.get(LoginController_DIV_LOGIN_BOX_ERRORS).update('');
		this.elementMap.get(LoginController_DIV_LOGIN_BOX_ERRORS).hide();
	},
	
	setControlsToLoginStandard: function() {
		this.elementMap.get(LoginController_ACTION_LOGIN).show();
    	this.elementMap.get(LoginController_BUTTON_NEXT).hide();
    	this.elementMap.get(LoginController_BUTTON_CANCEL).hide();
    	this.elementMap.get(LoginController_BUTTON_SAVE).hide();
    	this.elementMap.get(LoginController_ACTION_LOGIN).enable();
	}
});