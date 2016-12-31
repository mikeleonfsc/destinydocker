/* onesearchmaster.js */
Class.create(BaseController, {
    init: function() {
		this.pollingPeriodSec = this.data.pollingPeriod / 1000.0;
		this.maxPollingCount = this.data.maxPollingCount;
		this.currentRefreshCount = 0;
    },

    registerEvents: function() {
    },
    
    submitNewSearch: function(search) {
    	window.ajaxTracker.abortAllRequests();
          
    	var body = $(document.body);
        body.removeClassName("home");
        body.removeClassName("bookClub");
        body.addClassName("search");
        this.elementMap.get(OneSearchController_DIV_ONESEARCH_MAIN).show();
        
    	Registry.unregister("Top10Controller.Load");
    	Registry.unregister("Top10Controller.Top10");
    	Registry.unregister("NewArrivalsController.Loader");
    	Registry.unregister("NewArrivalsController.Contents");
    	Registry.unregister("PublicListsController.Load");
    	Registry.unregister("LimiterController.Limiters");    	   
    	
    	var visualSearch = Registry.lookup("VisualSearchController.VisualSearch");
    	if (visualSearch && Object.isFunction(visualSearch.hide)) {
    		visualSearch.hide();
    	}
    	
    	Registry.lookup("LimiterController.History").reset();
    	
    	Registry.lookup("SearchController.SearchMaster").hide();
    	this.show();
    	
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_WARNING).show();
    	
    	$(SearchController_DIV_HEADER_INNER_GROUP1).show(); // the bar that narrowing history
    	var searchType = Registry.lookup("SearchTypeController.Selector");
		searchType.show();
    	searchType.updateInternalSearchType(SearchTypeController_SEARCHTYPE_ONESEARCH); // ensure the selector gets set over to one search, especially when coming from things like advanced search and visual search.
        
    	this.clearRefreshTimer();
    	
        if (DAO.load({endpoint: "OneSearchController.SearchResults", container: this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_HITS)}, 
    			search.searchText, search.resetOneSearchDatabases, search.visualSearchNodeID)) {
    		Registry.unregister("OneSearchController.SearchResults");
    		this.elementMap.get(OneSearchController_DIV_ONESEARCH_WARNING).hide();
    		this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_COUNTS).hide();
    		this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_PROGRESS).show();
    	}
    },
    
    clearRefreshTimer: function() {
    	this.currentRefreshCount = 0;
    	if (this.currentRefreshID) {
    		window.clearTimeout(this.currentRefreshID);
    	}
    },
    
    startRefreshTimer: function() {
    	var boundFetch = this.fetchMoreResults.bind(this);
    	if (this.currentRefreshCount < this.maxPollingCount) {
    		var delayTime = this.pollingPeriodSec;
    		if (this.currentRefreshCount >= (this.maxPollingCount/2)) {
    			delayTime = delayTime * 2;
    		}
    		
    		this.currentRefreshID = boundFetch.delay(delayTime);
    	} else {
    		this.hideLoadingGraphic();
    	}
    },
    
    fetchMoreResults: function() {
    	DAO.load({endpoint: "OneSearchController.SearchResultsUpdater", appendTo: "OneSearchController.SearchResults"});
    },
    
    hideLoadingGraphic: function() {
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_PROGRESS).hide();
    },
    
    setWarningMessage: function(message) {
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_WARNING).update(message);
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_WARNING).show();
    },
    
    prepareForRefresh: function() {
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_HITS).update("");
		this.elementMap.get(OneSearchController_DIV_ONESEARCH_WARNING).hide();
		this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_COUNTS).hide();
		this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_PROGRESS).show();
		
		var searchResults = Registry.lookup("OneSearchController.SearchResults");
		searchResults.clearData();
    },
    
    setErrorMessage: function(message) {
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_PROGRESS).hide();
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_HITS).update("");
    	this.setCountMessage(message);
    },
    
    setCountMessage: function(message) {
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_COUNTS).show();
    	this.elementMap.get(OneSearchController_DIV_ONESEARCH_DB_COUNTS).update(message);
    }
});