/* searchtype.js */
Class.create(BaseController, {
    init: function() {
		this.searchType = this.data.initialSearchType;
		this.container.hide();
		
		if(this.data.canDoDCPI) {
			this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_DCPI).addClassName("last");
		} else if(this.data.canDoOneSearch) {
			this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_ONESEARCH).addClassName("last");
		} else if(this.data.canDoWPE) {
			this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_WPE).addClassName("last");
		} else {
			this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_LIBRARY).addClassName("last");
		}
    },

    registerEvents: function() {
    	var boundReset = this.resetHighlight.bind(this);
    	var boundSetSearchType = this.setSearchType.bind(this);
    	
    	Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY), "mouseout", boundReset);
    	Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY), "mousedown", boundSetSearchType.curry(SearchTypeController_SEARCHTYPE_LIBRARY));

    	if(this.data.canDoDCPI) {
    		Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI), "mouseout", boundReset);
    		Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI), "mousedown", boundSetSearchType.curry(SearchTypeController_SEARCHTYPE_DCPI));
    	}
    	
    	if (this.data.canDoWPE) {
    		Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE), "mouseout", boundReset);
    		Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE), "mousedown", boundSetSearchType.curry(SearchTypeController_SEARCHTYPE_WPE));
    	}
    	
    	if (this.data.canDoOneSearch) {
    		Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH), "mouseout", boundReset);
    		Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH), "mousedown", boundSetSearchType.curry(SearchTypeController_SEARCHTYPE_ONESEARCH));
    	}
    },
    
    getSearchType: function() {
    	return this.searchType;
    },
    
    updateInternalSearchType: function(sType) {
    	// this is used when we need to update the internal state of the search type without actually changing it
    	this.highlightSearchType(sType);
    	this.searchType = sType;
    },
    
    hideWPE: function() {
    	if (Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE))) {
    		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).hide();
    	}
    },
    
    showWPE: function() {
    	if (Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE))) {
    		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).show();
    	}
    },

    hideOneSearch: function() {
    	if (Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH))) {
    		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).hide();
    	}
    },
    
    showOneSearch: function() {
    	if (Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH))) {
    		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).show();
    	}
    },

    hideDigitalResources: function() {
    	if (Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI))) {
    		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).hide();
    	}
    },
    
    showDigitalResources: function() {
    	if (Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI))) {
    		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).show();
    	}
    },
    
    setSearchType: function(sType) {
        this.highlightSearchType(sType);
        if (this.searchType != sType) {
        	window.ajaxTracker.abortAllRequests();
            this.searchType = sType;
            
            // handle advanced search
            var hiddenSearch = false;
            var advancedSearchData = null;
            
            var searchBox = Registry.lookup("SearchBoxController.SearchBox");
            
            var advancedSearch = Registry.lookup("SaveAdvancedSearch");
            var query = "";
            if (advancedSearch) {
            	if (this.getSearchType() == SearchTypeController_SEARCHTYPE_LIBRARY || this.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
                    query = advancedSearch.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_SEARCH).unescapeHTML();
                } else {
                    query = advancedSearch.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_SERVICES).unescapeHTML();
                }
                
                if (advancedSearch.canSearchWithOnlyTheseLimiters() && query.length == 0) {
                    hiddenSearch = true;
                }
                advancedSearchData = advancedSearch.getLimiterJSON();
            } else {
            	query = this.getSearchText();
            	this.setSavedSearchText(query);
            }
            
            searchBox.setSearchBoxText(query);
            
            // simulate clicking the go button by calling into the inputValidator directly
            searchBox.submitSearch(false, hiddenSearch, advancedSearchData);
            
            var booklistWidget = Registry.lookup("BooklistWidgetController.Load");
            if (booklistWidget) {
            	DAO.load({endpoint: "BooklistWidgetController.Updater", container: null}, sType, null);
            }
        }
    },
    
    setSavedSearchText: function(value) {
    	this.savedSearchText = value;
    },
    
    getSearchText: function() {
    	var searchText = this.savedSearchText;
    	var searchBox = Registry.lookup("SearchBoxController.SearchBox");
    	var currentSearchBoxText = searchBox.getSearchBoxText();
    	
		if (! currentSearchBoxText.strip().empty()) {
			searchText = currentSearchBoxText;
		}
    	
    	return searchText;
    },
    
    resetHighlight: function() {
    	this.highlightSearchType(this.searchType);
    },

    highlightSearchType: function(sType) {
        switch (sType) {
            default:
            case SearchTypeController_SEARCHTYPE_LIBRARY:
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("activeButton");
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("inactiveButton");
                // everything else small
                 if (this.data.canDoDCPI) { 
                	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("activeButton");
                	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("inactiveButton");
                 } 
                 if (this.data.canDoWPE) { 
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("activeButton");
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("inactiveButton");
                 } 
                 if (this.data.canDoOneSearch) { 
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("activeButton");
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("inactiveButton");
                 } 
                break;
            case SearchTypeController_SEARCHTYPE_DCPI:
            	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("activeButton");
            	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("inactiveButton");
            	
            	// everything else small
            	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("activeButton");
            	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("inactiveButton");
            	
            	if (this.data.canDoWPE) { 
            		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("activeButton");
            		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("inactiveButton");
            	} 
            	if (this.data.canDoOneSearch) { 
            		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("activeButton");
            		this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("inactiveButton");
            	} 
            	break;
            case SearchTypeController_SEARCHTYPE_WPE:
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("activeButton");
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("inactiveButton");

                // everything else small
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("activeButton");
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("inactiveButton");

                if (this.data.canDoDCPI) { 
                	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("activeButton");
                	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("inactiveButton");
                }
                 if (this.data.canDoOneSearch) { 
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("activeButton");
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("inactiveButton");
                 } 
                break;
            case SearchTypeController_SEARCHTYPE_ONESEARCH:
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("activeButton");
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("inactiveButton");
                // everything else small
                if (this.data.canDoDCPI) { 
                	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("activeButton");
                	this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("inactiveButton");
                }
                 if (this.data.canDoWPE) { 
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("activeButton");
                    this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("inactiveButton");
                 } 
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("activeButton");
                this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("inactiveButton");
                break;
        }
    }
});