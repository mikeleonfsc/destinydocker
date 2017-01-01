/* searchmaster.js */
Class.create(BaseController, {
    init: function() {
		this.elementMap.get(SearchController_DIV_MAIN_CENTER).hide();
		this.providers = null;
    },

    registerEvents: function() {
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_PREV), "mousedown", this.previousPage.bind(this));
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_NEXT), "mousedown", this.nextPage.bind(this));
    	Event.observe(this.elementMap.get(SearchController_LINK_SORT_RELEVANCE), "mousedown", this.changeSort.bind(this, SearchController_SORTBYRELEVANCE));
    	Event.observe(this.elementMap.get(SearchController_LINK_SORT_TITLE), "mousedown", this.changeSort.bind(this, SearchController_SORTBYTITLE));
    	
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_PREV), "mouseover", this.navigationHoverOver.bind(this, this.elementMap.get(SearchController_LINK_SEARCH_RESULTS_PREV_PAGE), SearchController_CLASS_PREV_HOVER));
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_PREV), "mouseout", this.navigationHoverOut.bind(this, this.elementMap.get(SearchController_LINK_SEARCH_RESULTS_PREV_PAGE), SearchController_CLASS_PREV_HOVER));
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_NEXT), "mouseover", this.navigationHoverOver.bind(this, this.elementMap.get(SearchController_LINK_SEARCH_RESULTS_NEXT_PAGE), SearchController_CLASS_NEXT_HOVER));
    	Event.observe(this.elementMap.get(SearchController_LINK_RESULTS_NEXT), "mouseout", this.navigationHoverOut.bind(this, this.elementMap.get(SearchController_LINK_SEARCH_RESULTS_NEXT_PAGE), SearchController_CLASS_NEXT_HOVER));
    },
    
    submitNewSearch: function(search) {
    	if ((search.searchText && ! search.searchText.empty()) ||
    		search.advancedSearchData || search.visualSearchNodeID || search.advancedServicesSearch) {
    		window.ajaxTracker.abortAllRequests();
	    	// unregister any widget on the front page
	    	Registry.unregister("Top10Controller.Load");
	    	Registry.unregister("Top10Controller.Top10");
	    	Registry.unregister("PublicListsController.Load");
	    	Registry.unregister("NewArrivalsController.Loader");
	    	Registry.unregister("NewArrivalsController.Contents");
	    	Registry.unregister("LimiterController.Limiters");
	    	
	    	var visualSearch = Registry.lookup("VisualSearchController.VisualSearch");
	    	if (visualSearch && Object.isFunction(visualSearch.hide)) {
	    		visualSearch.hide();
	    	}
	    	var myQuestLoader = Registry.lookup("MyQuestController.Loader");
	    	if (myQuestLoader && Object.isFunction(myQuestLoader.hide)) {
	    		myQuestLoader.hide();
	    	}
	    	var myQuestMenu = Registry.lookup("MyQuestController.Menu");
	    	if (myQuestMenu && Object.isFunction(myQuestMenu.hide)) {
	    		myQuestMenu.hide();
	    	}
	    	
	    	var errorMaster = Registry.lookup("QuestErrorController.Loader");
	    	if (errorMaster && Object.isFunction(errorMaster.clearMessages)) {
	    		errorMaster.clearMessages();
	    	}
	    	
	    	Registry.lookup("LimiterController.History").reset();
	    	
	    	Registry.lookup("OneSearchController.SearchMaster").hide();
	    	this.show();
	    	
	    	this.elementMap.get(SearchController_DIV_MAIN_CENTER).show();
	    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_WARNING).hide();
	    	
	    	var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
	    	searchTypeSelector.show();
	    	if (search.visualSearchType == VisualSearchController_TYPE_ELEMENT_CATEGORY) {
	    		searchTypeSelector.hideWPE();
	    		searchTypeSelector.hideOneSearch();
	    		searchTypeSelector.hideDigitalResources();
	    	} else {
	    		searchTypeSelector.showWPE();
	    		searchTypeSelector.showOneSearch();
	    		searchTypeSelector.showDigitalResources();
	    	}
	    	
	    	var body = $(document.body);
            body.removeClassName("home");
            body.removeClassName("bookClub");
            body.addClassName("search");
            
            if (searchTypeSelector.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
            	if (DAO.load({endpoint: "DCPISearchController.SearchResults", container: this.elementMap.get(SearchController_DIV_RESULTS_CACHE_INNER)}, 
                		search.searchText, search.visualSearchNodeID, search.advancedSearchData, this.providers, this.providers && this.providers.length == 0)) {
		    		Registry.unregister("DCPISearchController.SearchResults");
		    		Registry.unregister("SearchController.SearchResults");
		    		this.showLoading();
		    		this.showLoadingGraphic();
		    	}
            } else {
		    	if (DAO.load({endpoint: "SearchController.SearchResults", container: this.elementMap.get(SearchController_DIV_RESULTS_CACHE_INNER)}, 
		    			search.searchText, search.searchType, search.pageNumber, search.sortBy, 
		    			search.didYouMeanSearch, search.hiddenSearch, search.advancedSearchData, search.visualSearchNodeID)) {
		    		Registry.unregister("DCPISearchController.SearchResults");
		    		Registry.unregister("SearchController.SearchResults");
		    		this.showLoading();
		    		this.showLoadingGraphic();
		    	}
            }
    	}
    },
    
    dcpiRedirectorLoader: function(id,context,dcpiSiteID,isDCPI){
        var context = "";
        if(context){
        	context = "&context=" + context;
        }
        this.openPopup("/cataloging/servlet/presentdcpiredirectform.do?"+
    		((isDCPI)? "recordGUID=" : "bibID=")
    		 +id
    		 +((isDCPI && dcpiSiteID) ? ("&dcpiSiteID=" + dcpiSiteID) : "")
    		 +"&client=1" + context
		);
    },
    
    openPopup: function(url) {
        window.open(url, "dcpicontent");
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
    
    changeSort: function(sortType) {
    	if (! this.isFetching && ! this.isLoading) {
    		var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
	    	if (DAO.load({endpoint: "SearchController.SearchResultsSort", appendTo: "SearchController.SearchResults"}, sortType, searchTypeSelector.getSearchType())) {
	    		this.prepareForRefresh();
	    	}
    	}
    },
    
    updateSortControl: function(sortType) {
    	if (sortType == SearchController_SORTBYTITLE) {
			this.elementMap.get(SearchController_LINK_SORT_RELEVANCE).show();
			this.elementMap.get(SearchController_LINK_SORT_RELEVANCE + SearchController_DIV_SUFFIX_UNLINKED_CONTROL).hide();
			this.elementMap.get(SearchController_LINK_SORT_TITLE).hide();
			this.elementMap.get(SearchController_LINK_SORT_TITLE + SearchController_DIV_SUFFIX_UNLINKED_CONTROL).show();
		} else {
			this.elementMap.get(SearchController_LINK_SORT_RELEVANCE).hide();
			this.elementMap.get(SearchController_LINK_SORT_RELEVANCE + SearchController_DIV_SUFFIX_UNLINKED_CONTROL).show();
			this.elementMap.get(SearchController_LINK_SORT_TITLE).show();
			this.elementMap.get(SearchController_LINK_SORT_TITLE + SearchController_DIV_SUFFIX_UNLINKED_CONTROL).hide();
		}
    },
    
    prepareForRefresh: function() {
    	this.showLoading();
		this.showLoadingGraphic();
		
		var searchResults = Registry.lookup("SearchController.SearchResults");
		searchResults.clearData();
		this.elementMap.get(SearchController_DIV_RESULTS_CACHE_INNER).update("");
    },
    
    prepareForRefresh_DCPI: function() {
    	this.showLoading();
		this.showLoadingGraphic();
		
		var searchResults = Registry.lookup("DCPISearchController.SearchResults");
		searchResults.clearData();
		this.elementMap.get(SearchController_DIV_RESULTS_CACHE_INNER).update("");
    },
    
    notifyPageDataUpdated: function(pageNumber) {
    	this.isFetching = false;
    	if (this.isLoading) {
    		var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
    		var searchResults = (searchTypeSelector.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) ? Registry.lookup("DCPISearchController.SearchResults") : Registry.lookup("SearchController.SearchResults");
    		
    		searchResults.setPage(pageNumber);
    		this.isLoading = false;
    	}
    },
    
    fetchPage: function(pageNumber, searchTerm, visualSearchNodeID, advancedSearchData) {
    	this.isFetching = true;
    	var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
    	if (searchTypeSelector.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
    		if (! DAO.load({endpoint: "DCPISearchController.SearchResultsPage", appendTo: "DCPISearchController.SearchResults"}, 
    				searchTerm, visualSearchNodeID, pageNumber, advancedSearchData, this.providers, this.providers && this.providers.length == 0)) {
    			var tryAgain = this.fetchPage.bind(this, pageNumber);
    			tryAgain.delay(0.5);
    		}
    	} else {
    		if (! DAO.load({endpoint: "SearchController.SearchResultsPage", appendTo: "SearchController.SearchResults"}, pageNumber, searchTypeSelector.getSearchType())) {
    			var tryAgain = this.fetchPage.bind(this, pageNumber);
    			tryAgain.delay(0.5);
    		}
    	}
    },
    
    nextPage: function() {
		if (! this.isFetching) {
			var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
			var searchResults = null;
			if (searchTypeSelector.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
				searchResults = Registry.lookup("DCPISearchController.SearchResults");
			} else {
				searchResults = Registry.lookup("SearchController.SearchResults");
			}
			if (searchResults) {
				this.hideSortControls();
				searchResults.nextPage();
			}
		} else {
			this.showLoading();
		}
    },
    
    showLoading: function() {
    	this.isLoading = true;
    	this.setNextButtonVisible(false);
    	this.setPreviousButtonVisible(false);
    	this.hideSortControls();
    	this.setPageIndex(MessageHelper.format("searchController_loading"));
    },
    
    previousPage: function() {
    	var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
    	var searchResults = null;
		if (searchTypeSelector.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
			searchResults = Registry.lookup("DCPISearchController.SearchResults");
		} else {
			searchResults = Registry.lookup("SearchController.SearchResults");
		}
    	if (searchResults) {
    		this.hideSortControls();
			searchResults.previousPage();
    	}
    },
    
    setWarningMessage: function(message) {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_WARNING).update(message);
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_WARNING).show();
    },
    
    hideWarningMessage: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_WARNING).hide();
    },
    
    showWarningMessage: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_WARNING).show();
    },
    
    setNextButtonVisible: function(visible) {
    	var visibility = visible ? "inherit" : "hidden";
		this.elementMap.get(SearchController_LINK_RESULTS_NEXT).setStyle("visibility: " + visibility);
    },

    setPreviousButtonVisible: function(visible) {
    	var visibility = visible ? "inherit" : "hidden";
    	this.elementMap.get(SearchController_LINK_RESULTS_PREV).setStyle("visibility: " + visibility);
    },
    
    setPageIndex: function(pageIndex) {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_X_OF_Y).update(pageIndex);
    },
    
    prepareSearchResultsForAnimation: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_CACHE).addClassName("searchResultsAnimation");
    },
    
    finishSearchResultsAnimation: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_CACHE).removeClassName("searchResultsAnimation");
    },
    
    showLoadingGraphic: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_LOADING).show();
    },
    
    hideLoadingGraphic: function() {
    	this.isLoading = false;
    	this.elementMap.get(SearchController_DIV_RESULTS_LOADING).hide();
    },
    
    navigationHoverOver: function(element, styleClass) {
    	element.addClassName(styleClass);
    },
    
    navigationHoverOut: function(element, styleClass) {
    	element.removeClassName(styleClass);
    },
    
    showHeader: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_OUTER).show();
    },
    
    hideHeader: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_OUTER).hide();
    },
    
    showSortControls: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_SORT).show();
    },

    hideSortControls: function() {
    	this.elementMap.get(SearchController_DIV_RESULTS_HEADER_SORT).hide();
    }
});