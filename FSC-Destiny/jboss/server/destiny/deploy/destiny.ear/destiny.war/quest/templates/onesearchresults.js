/* onesearchresults.js */
Class.create(BaseController, {
    init: function() {
		var questError = Registry.lookup("QuestErrorController.Loader");
		if(questError && questError.hasErrors() && ! questError.sideWidgetsLoaded) {
			questError.sideWidgetsLoaded = true;
			PostLoadBootstrapper.load(["BooklistWidgetController.Load", "MyQuestController.MyShelves"]);
		}
		
		var oneSearchMaster = Registry.lookup("OneSearchController.SearchMaster");
		if (this.data.warningMessage) {
			oneSearchMaster.setWarningMessage(this.data.warningMessage);
		}
		if (this.data.errorMessage) {			
			oneSearchMaster.setErrorMessage(this.data.errorMessage);			
		} else {
			oneSearchMaster.setCountMessage(this.data.countMessage);
			if (! this.data.oneSearchResult.listComplete) {
				oneSearchMaster.startRefreshTimer();
			} else {
				oneSearchMaster.hideLoadingGraphic();
			}
		}
		
		if (this.data.limiters && Object.isArray(this.data.limiters.limiterMenu)) {
			Registry.createController("LimiterController.Limiters", this.data.limiterTemplateURL, this.data.limiterControllerURL, {endpoint: "LimiterController.Limiters", container: $(LimiterController_DIV_LIMITER_OUTER)}, this.data.limiters);
		}
		
		var limiterHistory = Registry.lookup("LimiterController.History");
		limiterHistory.getNarrowingHistory();
    },
    
    dataAppended: function(pageNumber) {
    	// when we get new data, merge the old and new data together and redisplay
    	
    	var mainData = this.pagedData[0];
    	var addedData = this.pagedData[1];
    	
    	var mainResults = mainData.oneSearchResult.results;
    	if (addedData) {
	    	var addedResults = addedData.oneSearchResult.results;
	    	if (Object.isArray(mainResults) && Object.isArray(addedResults)) {
	    		mainResults = mainResults.concat(addedResults);
	    	}
    	}
	    	
    	this.data = Object.extend(mainData, addedData);
		if (this.data.limiters && Object.isArray(this.data.limiters.limiterMenu)) {
			Registry.createController("LimiterController.Limiters", this.data.limiterTemplateURL, this.data.limiterControllerURL, {endpoint: "LimiterController.Limiters", container: $(LimiterController_DIV_LIMITER_OUTER)}, this.data.limiters);
    	}
    	
    	this.data.oneSearchResult.results = mainResults;
    	
    	this.pagedData = [this.data];
    	this.currentPage = null;
    	this.setPage(0);
    },

    registerEvents: function() {
    	for (var i=0; i < this.data.oneSearchResult.results.length; i++) {
    		var database = this.data.oneSearchResult.results[i];
    		var boundLoadOneSearchDetails = this.loadOneSearchDetails.bind(this);
    		Event.observe(this.elementMap.get("oneseachDatabaseRow_" + (database.vopacRecDisplayID - 1)), "mousedown", boundLoadOneSearchDetails.curry(database.vopacRecDisplayID));
    	}
    },
    
    loadOneSearchDetails: function(recID) {
    	var dialog = Registry.lookup("OneSearchController.Dialog");
    	if (! dialog) {
    		var params = {
    				id: OneSearchController_DIV_ONESEARCH_DBDETAIL_DIALOG,
    				zIndex:"50000",
    				hideOnOutsideClick:"true"
    		};
    		var modal = new ModalDialog(params);   
    		DAO.load({endpoint: "OneSearchController.Dialog", modal: modal}, recID);
    	} else {
    		dialog.loadDatabase(recID);
    	}
    }
});