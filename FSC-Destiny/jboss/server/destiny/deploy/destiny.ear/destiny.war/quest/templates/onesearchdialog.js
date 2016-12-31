/* onesearchdialog.js */
Class.create(BaseController, {
    init: function(pageChange) {
		if (! pageChange) {
			this.loadDatabase(this.data.recID);
		}
    },

    registerEvents: function() {
    	var closeDialog = this.modal.closeDialog.bind(this.modal);
    	Event.observe(this.elementMap.get(OneSearchController_BUTTON_ONESEARCH_DBDETAIL_CLOSE), "mousedown", closeDialog);
    },
    
    preloadDialog: function() {
    	if (! Object.isElement(this.modal.contentDiv) || ! Object.isElement(this.modal.contentDiv.parentNode)) {
    		var params = this.modal.options;
    		this.modal = new ModalDialog(params);
    		this.container = this.modal.contentDiv;
    		this.currentPage = null;
    		this.setPage(0);
    	}
    	this.modal.show();
    	this.showLoadingGraphic();
    },
    
    showLoadingGraphic: function() {
    	this.elementMap.get(OneSearchController_DIV_DBDETAIL_LOADING).show();
    	this.elementMap.get(OneSearchController_DIV_DBDETAIL_CONTENT_INNER).update("");
    },
    
    loadDatabase: function(recID) {
    	this.data.recID = recID;
    	this.preloadDialog();
    	DAO.load({endpoint: "OneSearchController.DatabaseDetail", container: this.elementMap.get(OneSearchController_DIV_DBDETAIL_CONTENT_INNER)}, this.data.recID);
    },
    
    nextOneSearchPage: function() {
    	if (DAO.load({endpoint: "OneSearchController.DatabaseDetail", container: this.elementMap.get(OneSearchController_DIV_DBDETAIL_CONTENT_INNER)}, this.data.recID, true)) {
    		this.showLoadingGraphic();
    	}
    },
    
    previousOneSearchPage: function() {
    	if (DAO.load({endpoint: "OneSearchController.DatabaseDetail", container: this.elementMap.get(OneSearchController_DIV_DBDETAIL_CONTENT_INNER)}, this.data.recID, false)) {
    		this.showLoadingGraphic();
    	}
    },
    reloadCurrent: function() {
    	if (DAO.load({endpoint: "OneSearchController.DatabaseDetail", container: this.elementMap.get(OneSearchController_DIV_DBDETAIL_CONTENT_INNER)}, this.data.recID, null, true)) {
    		this.showLoadingGraphic();
    	}
    },

    loadOtherLink: function(linkName) {
    	if (DAO.load({endpoint: "OneSearchController.DatabaseDetail", container: this.elementMap.get(OneSearchController_DIV_DBDETAIL_CONTENT_INNER)}, this.data.recID, null, null, linkName)) {
    		this.showLoadingGraphic();
    	}
    },
    
    notifyDataLoaded: function() {
    	this.modal.centerDialog();
    	this.elementMap.get(OneSearchController_DIV_DBDETAIL_LOADING).hide();
    }
});