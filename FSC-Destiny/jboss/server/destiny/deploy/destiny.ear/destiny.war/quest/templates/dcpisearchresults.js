/* dcpisearchresults.js */
Class.create(BaseController, {
    init: function() {
		var records = this.data.records;
		this.recordControllers = [];
		
		var searchMaster = Registry.lookup("DCPISearchController.SearchMaster");
		searchMaster.hideSearchResults(); // this is lame.  we automatically show the container in basecontroller.js, so we need to "re-hide" it
		
		if (Object.isArray(this.data.errors) && this.data.errors.length > 0) {
			searchMaster.hideHeader();
			searchMaster.removeSearchResultsStyleOnError();
			searchMaster.hideLoadingGraphic();
			searchMaster.showSearchResults();
		} else {
			this.resultsLoadedChecker = this.checkResultsLoaded.bind(this);
			this.resultsLoadedChecker.delay(0.25);
			
			if (this.data.showNextButton && ! this.hasNextPage()) { 
				var fetchPage = searchMaster.fetchPage.bind(searchMaster, this.data.pageNumber + 1);
				fetchPage.defer(); // defer this until after the results have loaded
			}
		}
		
		var limiterHistory = Registry.lookup("LimiterController.History");
		limiterHistory.getNarrowingHistory();

		searchMaster.setNextButtonVisible(this.data.showNextButton);
		searchMaster.setPreviousButtonVisible(this.data.showPreviousButton);
		searchMaster.setPageIndex(this.data.pageIndex);
		searchMaster.hideLoadingGraphic();
		
		searchMaster.setSelectedProviders(this.data.limiters.limiterData[0][0].providers);
		
		if (this.data.limiters && Object.isArray(this.data.limiters.limiterMenu)) {
			// This is unconventional, but we have a 2nd set of data that came back with
			// the search results that needs its own controller.  This is the best way
			// i can think of to deal with this.
			Registry.createController("LimiterController.Limiters", this.data.limiterTemplateURL, this.data.limiterControllerURL, {endpoint: "LimiterController.Limiters", container: $(LimiterController_DIV_LIMITER_OUTER)}, this.data.limiters);
		}
    },

    registerEvents: function() {
    	if (this.data.errors && this.data.errors.length == 0) {
    		var records = this.data.records;
    		if (Object.isArray(records)) {
    			for (var i=0; i < records.length; i++) {
    				var bibID = null;
    				var recordGUID = null;
    				if (records[i].recType == DCPISearchController_DCPI_REC_TYPE_DCPI) {
    					recordGUID = records[i].recData.dcpiRecordGUID;
    				} else {
    					bibID = records[i].recData.bibID;
    				}
    				if (Object.isElement(this.elementMap.get(DCPISearchController_BUTTON_ADD_TO_LIST + i))) {
    					Event.observe(this.elementMap.get(DCPISearchController_BUTTON_ADD_TO_LIST + i), "mousedown", this.addToList.bind(this, i, bibID, recordGUID));
    				}
       				if (Object.isElement(this.elementMap.get(DCPISearchController_BUTTON_TITLE_DETAILS + i))) {
       					if(records[i].recType == DCPISearchController_DCPI_REC_TYPE_LOCAL){
       						Event.observe(this.elementMap.get(DCPISearchController_BUTTON_TITLE_DETAILS + i), "mousedown", this.showTitleDetails.bind(this, bibID));
       					}else if(records[i].recType == DCPISearchController_DCPI_REC_TYPE_DCPI){
       						Event.observe(this.elementMap.get(DCPISearchController_BUTTON_TITLE_DETAILS + i), "mousedown", this.showTitleDetailsDCPI.bind(this, recordGUID));
       					}
    				}
    			}
    		}
    	}
    },
    
    checkResultsLoaded: function() {
    	var allLoaded = true;
    	for (var i=0; (i < this.recordControllers.length) && allLoaded; i++) {
    		allLoaded == allLoaded && this.recordControllers[i].isLoaded();
    	}
    	
    	if (allLoaded) {
    		var searchMaster = Registry.lookup("DCPISearchController.SearchMaster");
    		searchMaster.showHeader();
    		searchMaster.addSearchResultsStyleNoError();
    		searchMaster.showSearchResults();
    		searchMaster.hideLoadingGraphic();
    		
    		searchMaster.setPageIndex(this.data.pageIndex);
    		searchMaster.setNextButtonVisible(this.data.showNextButton);
    		searchMaster.setPreviousButtonVisible(this.data.showPreviousButton);
    	} else {
    		this.resultsLoadedChecker.delay(250);
    	}
    },
    
    addToList: function(index, bibID, contentID) {
    	this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST + index).hide();
    	this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST + index).show();
    	var loadResult = DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder", container:null}, bibID, contentID, SearchTypeController_SEARCHTYPE_DCPI, null);
    	if(!loadResult) {
    		this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST + index).show();
    		this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST + index).hide();
    	}
    },
    
    showTitleDetails: function(bibID) {
		var titleDetails = Registry.lookup("TitleDetailsController.Master");
		titleDetails.loadTitleDetails(bibID);
    },
    
    showTitleDetailsDCPI: function(recordGUID) {
    	var titleDetails = Registry.lookup("TitleDetailsController.Master");
    	titleDetails.loadTitleDetails(recordGUID,null,null,true);
    },
    
    
    dataAppended: function(pageNumber) {
    	var searchMaster = Registry.lookup("DCPISearchController.SearchMaster");
    	searchMaster.notifyPageDataUpdated(pageNumber);
    },
    
    updateSearchResults: function(bibIDs, dcpiRecordGUIDs, added) {
    	var records = this.data.records;
    	if (Object.isArray(records)) {
    		for (var i=0; i < records.length; i++) {
    			var updateImages = false;
    			if (dcpiRecordGUIDs && records[i].recType == DCPISearchController_DCPI_REC_TYPE_DCPI && dcpiRecordGUIDs.indexOf(records[i].recData.dcpiRecordGUID) >= 0) {
    				records[i].recData.inUsersBookList = added;
    				updateImages = true;
    			}
    			
    			if (bibIDs && records[i].recType == DCPISearchController_DCPI_REC_TYPE_LOCAL && bibIDs.indexOf(records[i].recData.bibID) >= 0) {
    				records[i].recData.inUsersBookList = added;
    				updateImages = true;
    			}
    			
    			if (updateImages) {
    				if (added) {
    					this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST + i).hide();
    					this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST + i).show();
    				} else {
    					this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST + i).show();
    					this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST + i).hide();
    				}
    			}
    		}
    	}
    }
});