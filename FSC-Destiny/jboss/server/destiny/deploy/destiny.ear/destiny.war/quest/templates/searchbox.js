/* searchbox.js */
Class.create(BaseController, {
	init: function () {		
		if (this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).value == MessageHelper.format("searchBoxController_enterYourSearchHere")) {
			this.currentTextDefault = true ;
		}
		
		if (this.data.enableSearchSuggestionsInQuest) {
			this.currentTextAutoComplete = new DestinyAutoCompleter("currentText", "searchBoxSuggestions", "SearchBoxController.AutoSuggest", SearchBoxController_AUTOSUGGEST_MIN_CHARS);		
			this.currentTextAutoComplete.startMe();
		}
	}, 
	
	registerEvents: function () {		              
		Event.observe(this.elementMap.get(SearchBoxController_DIV_LOGIN_MODULE_OUTER), SearchBoxController_MODAL_CLOSE, this.returnHome.bind(this));		
		Event.observe(this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT), "keydown", this.enterEvent.bind(this) );
		Event.observe(this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT), "focus", this.textFocusListener.bind(this) );
		Event.observe(this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT), "blur", this.textBlurListener.bind(this) );
		Event.observe(this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT), "mousedown", this.textClickListener.bind(this));
		Event.observe(this.elementMap.get(SearchBoxController_BUTTON_SUBMIT), "mousedown", this.submitSearchClick.bind(this));		
		Event.observe(this.elementMap.get(SearchBoxController_FORM_ID_SEARCH_FORM), "submit", this.submitSearchSubmit.bindAsEventListener(this));		
	},
	//TODO in our listeners here, we are b/w window.currentTextDefault and this.currentTextDefault. This guy gets loaded up in 
	// searchtemplate.jsp, in the body onload(). needs to be addressed if we are not using window level vars
	returnHome: function () {
		if (this.data.sslEnabled) {
			window.location = this.data.httpRootURL;
		}
	},
	enterEvent: function () {
        if (this.currentTextDefault) {
        	this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).setValue("");
            this.currentTextDefault = false;
        }
	},
	focusSearchBox: function() {
		this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).activate();
	},
	
	textFocusListener: function () {		
		var textbox = this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT);
		if (this.currentTextDefault && textbox.hasClassName(SearchBoxController_CLASS_SEARCH_BOX_NO_INPUT)) {			
			textbox.setValue("");
			this.currentTextDefault = false;
			textbox.removeClassName(SearchBoxController_CLASS_SEARCH_BOX_NO_INPUT);
		}
	},
	textBlurListener: function () {
		var textbox = this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT);
		if (this.getSearchBoxText().empty() || this.currentTextDefault) {
			textbox.setValue(MessageHelper.format("searchBoxController_enterYourSearchHere"));
			textbox.addClassName(SearchBoxController_CLASS_SEARCH_BOX_NO_INPUT );
			this.currentTextDefault = true;
		}
	},
	textClickListener: function () {
		var textbox = this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT);
		if (this.currentTextDefault) {
			var boundSetValue = textbox.setValue.bind(textbox, "");
			boundSetValue.delay(0);
			this.currentTextDefault = false;
			textbox.removeClassName(SearchBoxController_CLASS_SEARCH_BOX_NO_INPUT );
		}
	},
	
	submitSearchSubmit: function (event) {
		if (event) {
			Event.stop(event);
		}
		this.submitSearchClick();
	},
	
	submitSearchClick: function () {
		Registry.unregister("SaveAdvancedSearch");
		var visualSearch = Registry.lookup("VisualSearchController.VisualSearch");
		if (visualSearch && Object.isFunction(visualSearch.setVisualSearchNodeID)) {
			visualSearch.setVisualSearchNodeID(null);
		}
		var searchText = this.submitSearch();
		if (searchText) {
			var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
			searchTypeSelector.setSavedSearchText(searchText);
		}
	},
	
	disableAutoComplete: function() {
		if (this.currentTextAutoComplete) {
			this.currentTextAutoComplete.disable();
			this.currentTextAutoComplete.hide();
		}
	},

	enableAutoComplete: function() {
		if (this.currentTextAutoComplete) {
			this.currentTextAutoComplete.enable();
		}
	},
	
	submitSearch: function (didYouMeanSearch, hiddenSearch, advancedSearchData) {
		var searchBoxEmpty = this.getSearchBoxText().empty() || this.currentTextDefault;
		var searchBoxDisabled = this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).disabled;
		var visualSearch = Registry.lookup("VisualSearchController.VisualSearch");
		var visualSearchNodeID = null;
		if (visualSearch && Object.isFunction(visualSearch.getVisualSearchNodeID)) {
			visualSearchNodeID = visualSearch.getVisualSearchNodeID();
		}
		
		var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
		var searchType = searchTypeSelector.getSearchType();
		
		var advancedServicesSearch = false;
		var savedAdvancedSearch = Registry.lookup("SaveAdvancedSearch");
		if (savedAdvancedSearch) {
			advancedServicesSearch = searchType != SearchTypeController_SEARCHTYPE_LIBRARY;
		}
		
		var searchBoxText;
		if (searchBoxEmpty){
			searchBoxText = MessageHelper.format("searchBoxController_enterYourSearchHere");
		}
		if ((! searchBoxEmpty && ! searchBoxDisabled) || hiddenSearch || advancedServicesSearch || visualSearchNodeID) {
			this.disableAutoComplete();
			
			searchBoxText = this.getSearchBoxText();
			Registry.unregister("MyQuestController.Loader");
			Registry.unregister("MyQuestController.Menu");
			
			if (searchType == SearchTypeController_SEARCHTYPE_ONESEARCH) {
				var oneSearchMaster = Registry.lookup("OneSearchController.SearchMaster");
				var searchOptions = {
						searchText: searchBoxText,
						resetOneSearchDatabases: false,
						visualSearchNodeID: visualSearchNodeID
				};
				
				oneSearchMaster.submitNewSearch(searchOptions);
			} else if (searchType == SearchTypeController_SEARCHTYPE_DCPI) {
				var dcpiSearchMaster = Registry.lookup("SearchController.SearchMaster");
				var searchOptions = {
						searchText: searchBoxText,
						advancedSearchData: advancedSearchData,
						visualSearchNodeID: visualSearchNodeID
				};
				
				dcpiSearchMaster.submitNewSearch(searchOptions);
			} else {
				var searchMaster = Registry.lookup("SearchController.SearchMaster");
				var searchOptions = {
						searchText: searchBoxText,
						searchType: searchType,
						pageNumber: 0,
						sortBy: SearchController_SORTBYRELEVANCE,
						didYouMeanSearch: didYouMeanSearch,
						hiddenSearch: hiddenSearch,
						advancedSearchData: advancedSearchData,
						visualSearchNodeID: visualSearchNodeID,
						advancedServicesSearch: advancedServicesSearch
				};
				
				searchMaster.submitNewSearch(searchOptions);
			}
			
			// start the guest timeout
			var guestTimeout = Registry.lookup("QuestErrorController.GuestTimeout");
			if (guestTimeout && Object.isFunction(guestTimeout.startTimeout)) {
				guestTimeout.startTimeout();
			}
		} else {
			this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).removeClassName(SearchBoxController_CLASS_SEARCH_BOX_NO_INPUT );
			this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).setValue(MessageHelper.format("searchBoxController_enterYourSearchHere"));
			this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT ).activate();
			this.currentTextDefault = true;
		}
		
		return searchBoxText;
	},
	
    showSuggestions: function() {   
		if (this.currentTextAutoComplete) {
			this.currentTextAutoComplete.updateChoices();
		}
    },
  
    getSearchBoxText: function() {
    	var searchText = this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).getValue();
    	searchText = searchText.replace(/^\s+|\s+$/g, "");
    	var searchBoxText = (this.currentTextDefault) ? "" : searchText;
    	if (! searchBoxText || ! Object.isString(searchBoxText)) {
    		searchBoxText = "";
    	}
    	return searchBoxText;
    },
    
    setSearchBoxText: function(value) {
    	this.elementMap.get(SearchBoxController_FIELD_CURRENT_TEXT).setValue(value);
    	this.currentTextDefault = false;
    }	
});
