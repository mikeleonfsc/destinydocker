/* createaccount.js */
Class.create(BaseController, {
    init: function() {
		window.ajaxTracker.abortAllRequests();
	    if (!this.data.loggedIn) {
	    	var secureLogin = Registry.lookup("LoginController.SecureLoginBootstrap")
            if (this.data.isSSLEnabled && (! secureLogin || ! secureLogin.isSecure())) {
	            window.location = this.data.redirect;
	        } else {
	        	this.loadTemplate();
	        	this.clearErrors();
	        	//maybe set styles.
	        	
	        	this.elementMap.get(CreateAccountController_BUTTON_NEXT).show();
	        	this.elementMap.get(CreateAccountController_BUTTON_CANCEL).show();
	        	this.elementMap.get(CreateAccountController_BUTTON_SAVE).hide();

	        	this.elementMap.get(CreateAccountController_DIV_LOGIN_MODULE_INNER).show();
	            this.modal.show();
	            var focuser = this.focusLastNameNow.bind(this);
	            focuser.defer();
	        }
	    }
    },

    registerEvents: function() {
    	Event.observe(this.elementMap.get(LoginController_ACTION_CANCEL), "click", this.closeDialog.bind(this));
    	Event.observe(this.modal.contentDiv, "modal:close", this.focusSearch.bind(this));
    	
        Event.observe(this.elementMap.get(CreateAccountController_BUTTON_NEXT), "click", this.validateCreateAccountNext.bind(this));
        Event.observe(this.elementMap.get(CreateAccountController_BUTTON_SAVE), "click", this.validateCreateAccountSave.bind(this));
        Event.observe(this.elementMap.get(CreateAccountController_BUTTON_CANCEL), "click", this.closeDialog.bind(this));
        
        Event.observe(this.elementMap.get(BaseLoginController_LI_LOGIN_TAB), "mousedown", this.loadLogin.bind(this));
        Event.observe(this.elementMap.get(BaseLoginController_LI_CREATE_NEW_ACCOUNT_TAB), "mousedown", this.loadCreateAccount.bind(this));
        
        //register trap enter
        Event.observe(this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_CONTENTS), "keydown", this.trapEnter.bindAsEventListener(this));
    },
    
	trapEnter: function(event) {
		if(event) {
			var charCode = event.charCode || event.keyCode || event.which;
	        if (charCode == 13) {
	        	if(this.compareTemplate(this.template, CreateAccountController_TEMPLATE_CREATE_USER_INFO)) {
	        		this.validateCreateAccountSave(event);
	        	} else {
	        		this.validateCreateAccountNext(event);
	        	}
	        }
		}
	},
	
    loadTemplate: function() {
    	this.template = this.data.template;
		var myTemplate = new EJS({url:this.template}).render(this.data);
		
		this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_CONTENTS).update(myTemplate);
		this.refreshElements();
		
		if (this.isForgotPassword()) {
			this.setLoginTabActive();
		} else {
			this.setCreateAccountTabActive();
		}
		
		this.fixIERenderingIssue(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_CONTENTS);
    },
    
    loadLogin: function() {
    	DAO.load({endpoint:"LoginController.LoginDialog", modal:this.modal});
    },

    loadCreateAccount: function() {
    	DAO.load({endpoint:"CreateAccountController.CreateAccountDialog", modal:this.modal}, false);
    },
    
	setCreateAccountTabActive: function() {
		this.elementMap.get(BaseLoginController_DIV_LOGIN_TAB).show();
	    this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).addClassName(BaseLoginController_CLASS_LOGIN_CREATE_ACCOUNT);
	    this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).removeClassName(BaseLoginController_CLASS_LOGIN_DEFAULT);
	},
	
	setLoginTabActive: function() {
		this.elementMap.get(BaseLoginController_DIV_LOGIN_TAB).show();
    	this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).removeClassName(BaseLoginController_CLASS_LOGIN_CREATE_ACCOUNT);
    	this.elementMap.get(BaseLoginController_DIV_LOGIN_FORM).addClassName(BaseLoginController_CLASS_LOGIN_DEFAULT);
	},
	
	focusLastNameNow: function() {
	    if (this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_LASTNAME_OR_USERNAME).visible()) {
	        this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_LASTNAME_OR_USERNAME).activate();
	    }
	},
	
	clearErrors: function() {
		this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_ERRORS).update("");
    	this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_ERRORS).hide();
	},
	
	handleError: function(errorData) {		
		var loginController = Registry.lookup("LoginController.LoginDialog");
		
		if (errorData.passwordExpired && this.isForgotPassword()) {
			loginController.handleError(errorData);
		} else {
			this.data = errorData;
			this.loadTemplate();
			
			var errorHTML = ReusableTemplates.load("GenericListTemplate", {list:this.data.errors});
			this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_ERRORS).update(errorHTML);
			this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_BOX_ERRORS).show();
			if (this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_LASTNAME_OR_USERNAME)) {
				this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_LASTNAME_OR_USERNAME).setValue(this.data.username);
			}
			if (this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_USERNAME)) {
				this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_USERNAME).setValue(this.data.username);
			}
		}
		
		this.handlePageChange(null);
	},
	
	handlePageChange: function(pageChangeData) {	
		if (pageChangeData) {
			this.data = pageChangeData;
			this.loadTemplate();
		}
        if (this.compareTemplate(this.template, CreateAccountController_TEMPLATE_VALIDATE_BIRTHDATE)) {
            this.elementMap.get(CreateAccountController_SPAN_PATRON_CONFIRMED_DISPLAY).update(eval("this.data." + CreateAccountController_FIELD_FIRST_LAST_NAME));
            if (this.data.isDateFormatMonthFirst) {
                this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BDAY_MONTH).activate();
            } else { 
                this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BDAY_DAY).activate();
            }
            this.showNextButton();
            this.hideSaveButton();
        } else if (this.compareTemplate(this.template, CreateAccountController_TEMPLATE_CREATE_USER_INFO)) {
            if (this.isForgotPassword()) {
				this.elementMap.get(CreateAccountController_SPAN_USERNAME_CONFIRMED_DISPLAY).update(this.data.username);
                this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_PASSWORD).activate();
			} else {
                if (eval("this.data." + CreateAccountController_FIELD_PATRON_HAS_EXISTING_EMAIL)) {
                    this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_EMAIL).hide();
                } else {
                	this.elementMap.get(CreateAccountController_DIV_CREATE_ACCOUNT_EMAIL).show();
                }
                this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_USERNAME).activate();
			}

            this.elementMap.get(CreateAccountController_SPAN_PATRON_CONFIRMED_DISPLAY).update(eval("this.data." + CreateAccountController_FIELD_FIRST_LAST_NAME));
            this.showSaveButton();
            this.hideNextButton();
        } else {
            this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_LASTNAME_OR_USERNAME).setValue(eval("this.data." + CreateAccountController_FIELD_LASTNAME_OR_USERNAME));
            this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BARCODE).setValue(eval("this.data." + CreateAccountController_FIELD_BARCODE));
            this.showNextButton();
            this.hideSaveButton();
        }        
	},
	
	showNextButton: function() {
		this.elementMap.get(CreateAccountController_BUTTON_NEXT).show();
		this.elementMap.get(CreateAccountController_BUTTON_NEXT).enable();
	},
	hideNextButton: function() {
		this.elementMap.get(CreateAccountController_BUTTON_NEXT).hide();
	},
	showSaveButton: function() {
		this.elementMap.get(CreateAccountController_BUTTON_SAVE).show();
		this.elementMap.get(CreateAccountController_BUTTON_SAVE).enable();
	},
	hideSaveButton: function() {
		this.elementMap.get(CreateAccountController_BUTTON_SAVE).hide();
	},
	disableSaveButton: function() {
		this.elementMap.get(CreateAccountController_BUTTON_SAVE).disable();
	},

    validateCreateAccountNext: function() {
    	this.elementMap.get(CreateAccountController_BUTTON_NEXT).disable();
    	var loadResult;
    	
        if (this.compareTemplate(this.template, CreateAccountController_TEMPLATE_FIND_PATRON)) {
        	var lastOrUserName = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_LASTNAME_OR_USERNAME).getValue();
        	var barcode = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BARCODE).getValue();
        	loadResult = DAO.load({endpoint: "CreateAccountController.Page1Validator", container:null}, lastOrUserName, barcode, this.isForgotPassword());
        } else if (this.compareTemplate(this.template, CreateAccountController_TEMPLATE_VALIDATE_BIRTHDATE)) {
        	var bdayMonth = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BDAY_MONTH).getValue();
        	var bdayDay = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BDAY_DAY).getValue();
        	var bdayYear = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_BDAY_YEAR).getValue();
        	loadResult = DAO.load({endpoint: "CreateAccountController.Page2Validator", container:null}, this.data.patronID, bdayYear, bdayMonth, bdayDay, this.isForgotPassword());
        }
        
        if(!loadResult) {
        	this.elementMap.get(CreateAccountController_BUTTON_NEXT).enable();
        }
        
    },

    validateCreateAccountSave: function(event) {
    	this.disableSaveButton();
    	var password = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_PASSWORD).getValue();
    	var confirmPassword = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_CONFIRM_PASSWORD).getValue();
    	var patronID = this.data.patronID;	
    	var userName = this.data.username
    	var email = null;
    	
    	if (! this.isForgotPassword()) {
    		var email = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_EMAIL).getValue();
    		var userName = this.elementMap.get(CreateAccountController_INPUT_CREATE_ACCOUNT_USERNAME).getValue();
    	}
    	
    	var loadResult = DAO.load({endpoint: "CreateAccountController.AccountUpdater", container: null}, patronID, userName, password, confirmPassword, this.isForgotPassword(), email);
    	if(!loadResult) {
    		this.showSaveButton();
    	}
    	
    },

	closeDialog: function() {
        this.modal.closeDialog();
    },
    
    isForgotPassword: function () {
		return this.data.forgotPassword;
	}

});