/* menubar.js */
Class.create(BaseController, {
	init: function() {
		var menuBarContainer = this.elementMap.get(MenuBarController_DIV_MENU_BAR);
		
		if(this.data.showVisualSearchToggle) {
			this.elementMap.get(MenuBarController_LI_MENU_SEARCH_VISUAL).addClassName("last");
		} else {
			this.elementMap.get(MenuBarController_LI_MENU_SEARCH_ADVANCED).addClassName("last");
		}
		
		//setup theme selection
		var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		this.hoverGroup = HoverMaster.createGroup({
			name: this.name,
			data: [this.data.themes],
			activatorContainer: this.container,
			hoverContainer: this.elementMap.get(MenuBarController_DIV_MENU_BAR),
			controllerURL: this.data.themeControllerURL,
			templateURL: this.data.themeTemplateURL,
			activateEvent: "mousedown",
			openDelay: 0.1,
			closeDelay: 0.5,
			contentContainer: MenuBarController_DIV_CHANGE_THEME_WINDOW,
			onShow: function() {
				menuBarContainer.addClassName("high-zindex");
			},
			onHide: function() {
				menuBarContainer.removeClassName("high-zindex");
			},
			showEffect: function(contentContainer) {
				new Effect.BlindDown(contentContainer, {duration: 0.25});
			},
			hideEffect: function(contentContainer, hoverContainer) {
				new Effect.BlindUp(contentContainer, {duration: 0.25, afterFinish: function(){hoverContainer.hide();}});
			}
		});
		this.setViewMode(MenuBarController_VIEW_MODE_WIDGET);
	},
	
	registerEvents: function() {
                if (this.data.showHelpMenuLink) {
		Event.observe(this.elementMap.get("questHelp"), "mousedown", this.openHelpWindow.curry('ContextLevelHelpWindow', "http://destinyhelp.fsc.follett.com/content/c_quest.htm?sessid=" + this.data.sessionID + "&key=" + encodeURIComponent(this.data.helpKey), 1000, 500));
		}
		if(!this.data.userLoggedIn) {
			Event.observe(this.elementMap.get("loginLink"), "click", this.showQuestLogin.bind(this));
		}
		if (this.data.showMyInfoLink) {
			Event.observe(this.elementMap.get(MenuBarController_ANCHOR_VIEW_MY_INFO), "mousedown", this.showMyInfo.bind(this));
		}
		if (this.elementMap.get("createAccountLink")){			
			Event.observe(this.elementMap.get("createAccountLink"), "click", this.showCreateAccount.bind(this));
		}
			
		Event.observe(this.elementMap.get(MenuBarController_ANCHOR_ADVANCED_SEARCH_LINK), "mousedown", this.showAdvancedSearch.bind(this));

	},
	
    showAdvancedSearch: function () {
		this.modalId = "advancedSearchModalContainer";    	
    	var params = {
				id:this.modalId,
				zIndex:"50000",
				hideOnOutsideClick:"true"
		};
		var modal = new ModalDialog(params);    	
    	DAO.load({endpoint: "AdvancedSearchController.Window", modal: modal});
    },	

	openHelpWindow: function (name, url, width, height ) {
		var helpWindow = window.open(url, name, 'width=' + width + ',height=' + height + ',resizable,scrollbars,menubar');
		if(helpWindow) {
			helpWindow.focus();
		}
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
	
	showQuestLogin: function() {
		//create modal dialog for login
		var modalDialog = this.createModal();
		DAO.load({endpoint:"LoginController.LoginDialog", modal:modalDialog});
	},
	
	showMyInfo: function() {
    	var params = {
    			width:"",
    			id:ResourceListController_DIV_RESOURCE_LIST_WINDOW,
    			zIndex:"10000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	if (this.data.canViewOwnStatus){
    		DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, null, "MyInfo", false);
    	} else if (this.data.canAccessBookList) {
    		DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, null, "ResourceList", false);
    	} else {
    		DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, null, "Recommendations", false);
    	}
	},
	
	showCreateAccount: function() {
		//create modal dialog for login
		var modalDialog = this.createModal();
		DAO.load({endpoint:"CreateAccountController.CreateAccountDialog", modal:modalDialog}, false);
	},
	
	setViewMode: function(viewMode) {
		this.viewMode = viewMode;
	},
	
	getViewMode: function() {
		return this.viewMode;
	}
});