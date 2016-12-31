/* dcpisearchmaster.js */
Class.create(BaseController, {
    init: function() {
		this.elementMap.get(DCPISearchController_DIV_MAIN_CENTER).hide();
		this.providers = null;
    },

    registerEvents: function() {
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_PREV), "mousedown", this.previousPage.bind(this));
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_NEXT), "mousedown", this.nextPage.bind(this));
    	
    	Event.observe(this.elementMap.get(DCPISearchController_LINK_RESULTS_PREV), "mouseover", this.navigationHoverOver.bind(this, this.elementMap.get(DCPISearchController_LINK_SEARCH_RESULTS_PREV_PAGE), DCPISearchController_CLASS_PREV_HOVER));
    	Event.observe(this.elementMap.get(DCPISearchController_LINK_RESULTS_PREV), "mouseout", this.navigationHoverOut.bind(this, this.elementMap.get(DCPISearchController_LINK_SEARCH_RESULTS_PREV_PAGE), DCPISearchController_CLASS_PREV_HOVER));
    	Event.observe(this.elementMap.get(DCPISearchController_LINK_RESULTS_NEXT), "mouseover", this.navigationHoverOver.bind(this, this.elementMap.get(DCPISearchController_LINK_SEARCH_RESULTS_NEXT_PAGE), DCPISearchController_CLASS_NEXT_HOVER));
    	Event.observe(this.elementMap.get(DCPISearchController_LINK_RESULTS_NEXT), "mouseout", this.navigationHoverOut.bind(this, this.elementMap.get(DCPISearchController_LINK_SEARCH_RESULTS_NEXT_PAGE), DCPISearchController_CLASS_NEXT_HOVER));
    },
    
    submitNewSearch: function(search) {
    	window.ajaxTracker.abortAllRequests();
    	
    	this.search = search;
          
    	var body = $(document.body);
        body.removeClassName("home");
        body.addClassName("search");
        this.elementMap.get(DCPISearchController_DIV_MAIN_CENTER).show();
        
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
    	
    	Registry.lookup("OneSearchController.SearchMaster").hide();
    	Registry.lookup("SearchController.SearchMaster").hide();
    	this.show();
    	
    	var searchType = Registry.lookup("SearchTypeController.Selector");
    	searchType.show();
    	searchType.updateInternalSearchType(SearchTypeController_SEARCHTYPE_DCPI); // ensure the selector gets set over to one search, especially when coming from things like advanced search and visual search.
        
    	this.showLoadingGraphic();
        if (DAO.load({endpoint: "DCPISearchController.SearchResults", container: this.elementMap.get(DCPISearchController_DIV_DCPI_SEARCH_RESULTS)}, 
        		this.search.searchText, this.search.visualSearchNodeID, this.search.advancedSearchData, this.providers, this.providers && this.providers.length == 0)) {
    		Registry.unregister("DCPISearchController.SearchResults");
        	this.showLoading();
    	} else {
    		this.hideLoadingGraphic();
    	}
    },
    
    setSelectedProviders: function(providers) {
    	var provs = [];
    	if(providers){
    		for(var i=0; i<providers.length; i++){
    			if (providers[i].selected) {
    				provs.push(providers[i].id);
    			}
    		}
    	}
    	this.providers = provs;
    },
    
    setNextButtonVisible: function(visible) {
    	var visibility = visible ? "inherit" : "hidden";
		this.elementMap.get(DCPISearchController_LINK_RESULTS_NEXT).setStyle("visibility: " + visibility);
    },

    setPreviousButtonVisible: function(visible) {
    	var visibility = visible ? "inherit" : "hidden";
    	this.elementMap.get(DCPISearchController_LINK_RESULTS_PREV).setStyle("visibility: " + visibility);
    },
    
    setPageIndex: function(pageIndex) {
    	this.elementMap.get(DCPISearchController_DIV_RESULTS_HEADER_X_OF_Y).update(pageIndex);
    },
    
    navigationHoverOver: function(element, styleClass) {
    	element.addClassName(styleClass);
    },
    
    showLoadingGraphic: function() {
    	this.showHeader();
    	this.elementMap.get(DCPISearchController_DIV_RESULTS_LOADING).show();
    	this.hideSearchResults();
    },
    
    hideLoadingGraphic: function() {
    	this.isLoading = false;
    	this.elementMap.get(DCPISearchController_DIV_RESULTS_LOADING).hide();
    },
    
    navigationHoverOut: function(element, styleClass) {
    	element.removeClassName(styleClass);
    },
    
    notifyPageDataUpdated: function(pageNumber) {
    	this.isFetching = false;
    	if (this.isLoading) {
    		var searchResults = Registry.lookup("DCPISearchController.SearchResults");
    		searchResults.setPage(pageNumber);
    		this.isLoading = false;
    	}
    },
    
    fetchPage: function(pageNumber) {
    	this.isFetching = true;
    	var advancedSearch = Registry.lookup("SaveAdvancedSearch");
    	var advancedSearchData = null;
    	if (advancedSearch) {
    		advancedSearchData = advancedSearch.getLimiterJSON();
    	}

    	var providerController = Registry.lookup("LimiterController.Limiters.digitalResourceProvider");
    	var selectedProviderIDs = null;
    	if(providerController){
    		selectedProviderIDs = providerController.getSelectedDigitalResourceProvidersIDs();
    	}
    	
		if (! DAO.load({endpoint: "DCPISearchController.SearchResultsPage", appendTo: "DCPISearchController.SearchResults"}, this.search.searchText, this.search.visualSearchNodeID, pageNumber, advancedSearchData, selectedProviderIDs)) {
			var tryAgain = this.fetchPage.bind(this, pageNumber);
			tryAgain.delay(0.5);
		}
    },
    
    showLoading: function() {
    	this.isLoading = true;
    	this.setNextButtonVisible(false);
    	this.setPreviousButtonVisible(false);
    	this.setPageIndex(this.data.labels.pageIndexLoading);
    },

    prepareForRefresh: function() {
    	this.showLoading();
		this.showLoadingGraphic();
		
		var searchResults = Registry.lookup("DCPISearchController.SearchResults");
		searchResults.clearData();
		this.elementMap.get(DCPISearchController_DIV_DCPI_SEARCH_RESULTS).update("");
    },

    nextPage: function() {
		if (! this.isFetching) {
			var searchResults = Registry.lookup("DCPISearchController.SearchResults");
			if (searchResults) {
				searchResults.nextPage();
			}
		} else {
			this.showLoading();
		}
    },

    previousPage: function() {
    	var searchResults = Registry.lookup("DCPISearchController.SearchResults");
    	if (searchResults) {
			searchResults.previousPage();
    	}
    },
    
    showHeader: function() {
    	this.elementMap.get(DCPISearchController_DIV_RESULTS_HEADER_OUTER).show();
    },
    
    hideHeader: function() {
    	this.elementMap.get(DCPISearchController_DIV_RESULTS_HEADER_OUTER).hide();
    },

    hideSearchResults: function() {
    	this.elementMap.get(DCPISearchController_DIV_DCPI_SEARCH_RESULTS).hide();
    },
    
    showSearchResults: function() {
    	//we must show the element before we call fixIERenderingIssue otherwise Firefox flickers.
    	this.elementMap.get(DCPISearchController_DIV_DCPI_SEARCH_RESULTS).show();
    	//this defers the call to show the search results to fix a rendering bug in IE.
    	this.fixIERenderingIssue(DCPISearchController_DIV_DCPI_SEARCH_RESULTS);
    },
    
    removeSearchResultsStyleOnError: function() {
    	this.elementMap.get(DCPISearchController_DIV_DCPI_SEARCH_RESULTS).removeClassName("searchResultsPage");
    },

    addSearchResultsStyleNoError: function() {
    	this.elementMap.get(DCPISearchController_DIV_DCPI_SEARCH_RESULTS).addClassName("searchResultsPage");
    }
});