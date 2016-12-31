/* advancedsearchcontroller.js */
Class.create(BaseController, {
    init: function() {
		var savedAdvSearch = Registry.lookup("SaveAdvancedSearch");
		if (savedAdvSearch) {
			this.advancedSearch = savedAdvSearch;
			this.advancedSearch.controller = this;
			this.advancedSearch.truncateEmptyRows();
			$("advSearch-QueryDisplayed").update(savedAdvSearch.getQueryString());
		} else {
			this.advancedSearch = new AdvancedSearch();
			this.advancedSearch.init(this);
		}
		this.modal.contentDiv.fire(AdvancedSearchController_EVENT_OPEN_ADVANCED_SEARCH);		
		this.advancedSearchShow();
    },

    registerEvents: function() {        
        Event.observe(this.modal.contentDiv, "keydown", this.advancedSearchEnterKeyListener.bind(this));
        Event.observe(this.elementMap.get(AdvancedSearchController_BUTTON_ADVANCED_SEARCH_GO ), "mousedown", this.submitAdvancedSearch.bind(this));
        Event.observe("advSearch-ResetForm", "click", this.resetAdvancedSearchListener.bind(this));
        Event.observe(this.elementMap.get(AdvancedSearchController_BUTTON_ADVANCED_SEARCH_CLOSE), "click", this.advancedSearchCloseListener.bind(this));
    },

advancedSearchShow: function(event) {
    	this.elementMap.get("advSearch-SectionWrapper").insert(this.advancedSearch.getElement());
        this.advancedSearch.fireUpdateEvent();
        this.modal.show();
        this.advancedSearch.allLines[0].focus();
},

advancedSearchEnterKeyListener: function(event) {
	if (event.keyCode == 13) {
		this.submitAdvancedSearch();
	}
},

submitAdvancedSearch: function() {
        var query;
        var searchType = Registry.lookup("SearchTypeController.Selector");
        if (searchType.getSearchType() == SearchTypeController_SEARCHTYPE_LIBRARY || searchType.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
            query = this.advancedSearch.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_SEARCH).unescapeHTML();
        } else {
            query = this.advancedSearch.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_SERVICES).unescapeHTML();
        }
        var hiddenSearch = false;
        
        if (this.advancedSearch.canSearchWithOnlyTheseLimiters() && query.length == 0) {
            hiddenSearch = true;
        }
    
        if ((query && ! query.empty()) || hiddenSearch) {
        	var searchBox = Registry.lookup("SearchBoxController.SearchBox");
            searchBox.setSearchBoxText(query);
            this.modal.closeDialog();
            
            var visualSearch = Registry.lookup("VisualSearchController.VisualSearch");
    		if (visualSearch && Object.isFunction(visualSearch.setVisualSearchNodeID)) {
    			visualSearch.setVisualSearchNodeID(null);
    		}
    		
        	searchBox.submitSearch(false, hiddenSearch, this.advancedSearch.getLimiterJSON());
            
            if (this.advancedSearch) {
                Registry.register("SaveAdvancedSearch", this.advancedSearch);
                this.advancedSearch.cleanup();
                this.advancedSearch.getElement().remove();
                this.advancedSearch = null;
                this.asListener = null;
                this.elementMap.get(AdvancedSearchController_DIV_ADVANCED_SEARCH_QUERY).update("");
            }
        } else {
            var errorDiv = this.advancedSearch.errorDiv;
            if (searchType.getSearchType() == SearchTypeController_SEARCHTYPE_LIBRARY || searchType.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI) {
                errorDiv.update(MessageHelper.format("advancedSearchDataValue_pleaseEnterASearchTerm"));
            } else {
                var service = (searchType.getSearchType() == SearchTypeController_SEARCHTYPE_ONESEARCH) ? MessageHelper.format("advancedSearchDataValue_onlineResourcesRequiresASearchTerm") : MessageHelper.format("advancedSearchDataValue_webSearchRequiresASearchTerm");
                errorDiv.update(service);
            }
            errorDiv.show();
        }
    },

resetAdvancedSearchListener: function(event) {
    	if (this.advancedSearch) {
    		this.advancedSearch.cleanup();
    		this.advancedSearch.getElement().remove();
    		this.advancedSearch = null;
    		this.asListener = null;
    	}
    	
    	this.advancedSearch = new AdvancedSearch();
    	this.advancedSearch.init(this);
    	
    	this.elementMap.get("advSearch-SectionWrapper").insert(this.advancedSearch.getElement());
    	
    	this.advancedSearch.fireUpdateEvent();
    	this.advancedSearch.allLines[0].focus();
    	Event.observe("advSearch-ResetForm", "click", this.resetAdvancedSearchListener.bind(this));
},

advancedSearchCloseListener: function (event) {
	    if (this.advancedSearch) {
	        this.advancedSearch.cleanup();
	        this.advancedSearch.getElement().remove();
	        this.advancedSearch = null;
	        this.asListener = null;
	    }
	    
	   this.elementMap.get(AdvancedSearchController_DIV_ADVANCED_SEARCH_QUERY).update("");
	   this.modal.closeDialog();
	}

});