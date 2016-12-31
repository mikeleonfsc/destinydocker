/* titledetailsmaster.js */
Class.create(BaseController, {
    init: function() {
    },

    registerEvents: function() {
    },
    
    loadTitleDetails: function(bibOrRecordGUID, activeTab, doNotShowDialog, isDCPI, fromSiteID) {
    	var params = {
    			width:"735px",
    			id: TitleDetailsController_DIV_TITLE_DETAIL_DIALOG,
    			zIndex:"20000",
    			hideOnOutsideClick:"true"
    	};
    	
    	var titleDetailsDialog = new ModalDialog(params);
    	if(isDCPI){
    		DAO.load({
    			endpoint:"TitleDetailsController.DCPITitleDetails",
    			modal:titleDetailsDialog
    		}, bibOrRecordGUID, activeTab, doNotShowDialog, fromSiteID);
    	}else{
    		DAO.load({
    			endpoint:"TitleDetailsController.TitleDetails",
    			modal:titleDetailsDialog
    		}, bibOrRecordGUID, activeTab, doNotShowDialog);
    	}
    	
    }
    
});