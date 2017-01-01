/* resourcelist.js */
Class.create(BaseController, {
    init: function() {
    	this.endpoint = this.data.type;
		var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
		if (searchTypeSelector) {			
			this.listType = searchTypeSelector.getSearchType();
		} else {
			this.listType = ResourceListController_RESOURCE_LIST_TYPE_LIBRARY;
		}

		if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_LIBRARY && Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES).addClassName("tabActive");
		} else if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_WPE && Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS).addClassName("tabActive");
		} else if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_ONE_SEARCH && Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH).addClassName("tabActive");
		} else if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI && Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI).addClassName("tabActive");
		}
		
		this.myInfoCollectionType = ResourceListController_COLLECTION_TYPE_LIBRARY;
		
		if (Object.isElement(this.elementMap.get(ResourceListController_ID_MYINFO_LIBRARY_ITEMS_OUT))){
				this.elementMap.get(ResourceListController_ID_MYINFO_LIBRARY_ITEMS_OUT).up("." + ResourceListController_CLASS_TAB).addClassName("tabActive");
		}
		
		if (!this.data.publicList) {
			if (this.endpoint == "ResourceList") {
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).removeClassName("tab");
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).addClassName("tabActive");
			} else if (this.endpoint == "MyInfo") {
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).removeClassName("tab");
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).addClassName("tabActive");
			} else if (this.endpoint == "Holds") {
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).removeClassName("tab");
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).addClassName("tabActive");
			} else if (this.endpoint == "Recommendations") {
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).removeClassName("tab");
				this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).addClassName("tabActive");
			}
		} else {
			this.elementMap.get(ResourceListController_DIV_PUBLIC_LIST_INFO).show();
			this.elementMap.get(ResourceListController_SPAN_PUBLIC_LIST_INFO_OWNER).update(this.data.publicListOwner);
			this.elementMap.get(ResourceListController_SPAN_PUBLIC_LIST_INFO_UPDATED).update(this.data.publicListUpdated);
			this.elementMap.get(ResourceListController_SPAN_PUBLIC_LIST_INFO_DESCRIPTION).update(this.data.publicListDescription);
			this.setTitle(this.data.listName);
		}
		this.modal.show();
		this.data.isListChange = false;
		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		if (this.endpoint == "ResourceList" && !this.data.publicList) {
			DAO.load({endpoint: "BooklistSelectController.ResourceList", container: this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});
			var select = Registry.lookup("BooklistSelectController.ResourceList");
			if (select) {
				select.setBooklistValue(this.data.listID);
			}
		}
    },
    
    registerEvents: function() {
    	Event.observe(this.elementMap.get(ResourceListController_IMG_RESOURCE_LIST_WINDOW_CLOSE), "mousedown", this.closeDialog.bind(this));
    	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_PREV_PAGE), "mousedown", this.previousPage.bind(this));
    	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_NEXT_PAGE), "mousedown", this.nextPage.bind(this));
    	
    	if (!this.data.publicList) {
    		if (this.data.canViewOwnStatus) {
    			if (Object.isElement(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO ))) {
    				Event.observe(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO ), "mousedown", this.myInfoTabListener.bind(this));
    			}
    			if (Object.isElement(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS ))) {
    				Event.observe(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS ), "mousedown", this.myHoldsTabListener.bind(this));
    			}
    			if (Object.isElement(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS ))) {
    				Event.observe(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS ), "mousedown", this.myListsTabListener.bind(this));
    			}
    			if (Object.isElement(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS ))) {
    				Event.observe(this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS ), "mousedown", this.myRecommendationsTabListener.bind(this));
    			}
    		}
	        Event.observe(this.elementMap.get(ResourceListController_BUTTON_RESOURCE_LIST_REMOVE_ALL), "mousedown", this.removeAll.bind(this));
    	}
    	
        if (this.data.canSaveResourceList) {
        	Event.observe(this.elementMap.get(ResourceListController_BUTTON_RESOURCE_LIST_SAVE), "mousedown", this.save.bind(this));
        }
        if (this.data.canEmailResourceList) {
        	Event.observe(this.elementMap.get(ResourceListController_BUTTON_RESOURCE_LIST_EMAIL), "mousedown", this.email.bind(this));
        }
        Event.observe(this.elementMap.get(ResourceListController_BUTTON_RESOURCE_LIST_PRINT), "mousedown", this.print.bind(this));

        if (this.data.showSearchTypeSelectorForResourceList) {
	        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_LIBRARY_TITLES), "mousedown", this.resourceListLibraryLinkListener.bind(this));
	        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_LIBRARY_TITLES), "mouseover", this.highlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_LIBRARY_TITLES));
	        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_LIBRARY_TITLES), "mouseout", this.unhighlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_LIBRARY_TITLES));
	        if (this.data.showOneSearchInResourceList) {
	        	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_ONE_SEARCH), "mousedown", this.resourceListOneSearchLinkListener.bind(this));
		        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_ONE_SEARCH), "mouseover", this.highlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_ONE_SEARCH));
		        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_ONE_SEARCH), "mouseout", this.unhighlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_ONE_SEARCH));
	        }
	        if (this.data.showWPEInResourceList) {
	        	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_WEBPATH_EXPRESS), "mousedown", this.resourceListWebpathLinkListener.bind(this));
		        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_WEBPATH_EXPRESS), "mouseover", this.highlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_WEBPATH_EXPRESS));
		        Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_WEBPATH_EXPRESS), "mouseout", this.unhighlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_WEBPATH_EXPRESS));
	        }
	        if (this.data.showDCPIInResourceList) {
	        	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_DCPI), "mousedown", this.resourceListDcpiLinkListener.bind(this));
	        	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_DCPI), "mouseover", this.highlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_DCPI));
	        	Event.observe(this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_DCPI), "mouseout", this.unhighlightResourceListTab.bind(this, ResourceListController_LINK_RESOURCE_LIST_DCPI));
	        }
        } 
        if (this.data.showCollectionTypeSelectorForMyInfo) {
        	Event.observe(this.elementMap.get(ResourceListController_ID_MYINFO_LIBRARY_ITEMS_OUT), "mousedown", this.myInfoLibraryListener.bind(this));
        	Event.observe(this.elementMap.get(ResourceListController_ID_MYINFO_TEXTBOOK_ITEMS_OUT), "mousedown", this.myInfoTextbookListener.bind(this));
        }
        
        var searchBox = Registry.lookup("SearchBoxController.SearchBox");
        var focusSearchBox = searchBox.focusSearchBox.bind(searchBox);
        Event.observe(this.modal.contentDiv, "modal:close", focusSearchBox);
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },
    
    save: function() {
        var collectionTypeHidden = this.elementMap.get(ResourceListController_PARAM_SAVEBOOK_LIST_COLLECTION_TYPE);

        var collectionType = this.getCollectionType();
        collectionTypeHidden.setValue(collectionType);
        
        var digitalContentMode = ResourceListController_DIGITAL_CONTENT_MODE_EXCLUDE;
        if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
        	digitalContentMode = ResourceListController_DIGITAL_CONTENT_MODE_ONLY;
        }
        this.elementMap.get(ResourceListController_PARAM_SAVEBOOK_LIST_DIGITAL_CONTENT_MODE).setValue(digitalContentMode);
        
        this.elementMap.get(ResourceListController_PARAM_SAVEBOOK_LIST_LIST_ID).setValue(this.data.listID);

        this.elementMap.get(ResourceListController_FORM_SAVE_BOOKLIST).submit();
    },
    email: function() {
    	var params = {
    			width:"",
    			id:ResourceListEmailController_DIV_RESOURCE_LIST_EMAIL_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ResourceListEmailController.Dialog", modal: modalDialog});
    },
    print: function() {
    	var params = {
    			width:"",
    			id:ResourceListPrintController_DIV_RESOURCE_LIST_PRINT_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ResourceListPrintController.Dialog", modal: modalDialog}, this.data.listName);
    },
    
    setStickyPrintOptionName: function(name) {
    	this.stickyPrintOptionName = name;
    },
    
    getStickyPrintOptionName: function() {
    	return this.stickyPrintOptionName;
    },
    
    removeAll: function() {
    	var resourceListResults = Registry.lookup("ResourceListController.ResourceList");
    	if(resourceListResults) {
    		resourceListResults.clearData();
    	}
    	
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	
    	DAO.load({endpoint: "ResourceListController.RemoveAll"}, this.data.listID, this.listType);
    },
    
    setTitle: function(title) {
    	this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WINDOW_HEADER_TITLE).update(title);
    },
    
    notifyPageDataUpdated: function(pageNumber) {
    	this.isFetching = false;
    	if (this.isLoading) {
	    	var results = Registry.lookup("ResourceListController." + this.endpoint);
    		results.setPage(pageNumber);
    		this.isLoading = false;
    	}
    },
    
    fetchPage: function(pageNumber) {
    	this.isFetching = true;
    	var options = {};
    	options.endpoint = "ResourceListController." + this.endpoint;
    	
    	if (pageNumber == 0) {
    		options.container = this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER);
    	} else {
    		options.appendTo = "ResourceListController." + this.endpoint;
    	}
    	
    	// TODO CB - This is hokey, but for some reason this line was causing a script error in IE 
    	// when the list changed so let's skip it. Skipping it works and doesn't seem to harm anything.
    	if ( navigator.appName.indexOf('Microsoft') == -1 
    			|| navigator.appVersion.indexOf('Windows') == -1
    			|| !this.data.isListChange) {
    		window.ajaxTracker.abortAllRequests();
    	}
    	
    	if (this.endpoint == "ResourceList") {
			if (!DAO.load(options, null, null, this.data.listID, pageNumber, this.listType, this.data.publicList, null)) {
				var tryAgain = this.fetchPage.bind(this, pageNumber);
				tryAgain.delay(0.5);
			}
    	} else if (this.endpoint == "MyInfo") {
    		if (!DAO.load(options, pageNumber, this.myInfoCollectionType)) {
				var tryAgain = this.fetchPage.bind(this, pageNumber);
				tryAgain.delay(0.5);
			}
    	} else {
			if (!DAO.load(options, pageNumber)) {
				var tryAgain = this.fetchPage.bind(this, pageNumber);
				tryAgain.delay(0.5);
			}
    	}
    },
    
    nextPage: function() {
		if (! this.isFetching) {
	    	var results = Registry.lookup("ResourceListController." + this.endpoint);
	    	if (results) {
	    		results.nextPage();
				if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
					// JQUERY ALERT - Don't use jQuery without good reason.  The good reason here is that they have a nice function for scrolling and I'm afraid to do it myself.
					$j("#" + ResourceListController_DIV_RESULTS_CACHE).scrollTop(0);
					// END JQUERY ALERT
				}
	    	}
		} else {
			this.showLoading();
		}
    },
    
    showLoading: function() {
    	this.isLoading = true;
    	this.setNextButtonVisible(false);
    	this.setPreviousButtonVisible(false);
    	this.setPageIndex(MessageHelper.format("resourceListController_loading"));
    },
    
    previousPage: function() {
    	var results = Registry.lookup("ResourceListController." + this.endpoint);
    	if (results) {
			results.previousPage();
			if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
				// JQUERY ALERT - Don't use jQuery without good reason.  The good reason here is that they have a nice function for scrolling and I'm afraid to do it myself.
				$j("#" + ResourceListController_DIV_RESULTS_CACHE).scrollTop(0);
				// END JQUERY ALERT
			}
    	}
    },
    
    setNextButtonVisible: function(visible) {
    	var visibility = visible ? "inherit" : "hidden";
		this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_NEXT_PAGE).setStyle("visibility: " + visibility);
    },

    setPreviousButtonVisible: function(visible) {
    	var visibility = visible ? "inherit" : "hidden";
    	this.elementMap.get(ResourceListController_LINK_RESOURCE_LIST_PREV_PAGE).setStyle("visibility: " + visibility);
    },
    
    setTotalCount: function(count) {
    	this.data.totalCount = count;
    },
    
    getTotalCount: function(count) {
    	return this.data.totalCount;
    },
    
    getListName: function() {
    	return this.data.listName;
    },
    
    setListName: function(listName) {
    	this.data.listName = listName;
    },
    
    getListNameForEmail: function() {
    	return this.data.listNameForEmail;
    },
    
    getListID: function() {
    	return this.data.listID;
    },

    getListType: function() {
		return this.listType;
	},
    
    getCollectionType: function() {
		var collectionType;
		
        if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_LIBRARY) {
            collectionType = ResourceListController_COLLECTION_TYPE_LIBRARY;
        } else if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
        	collectionType = ResourceListController_COLLECTION_TYPE_DCPI;
        } else if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_WPE) {
        	collectionType = ResourceListController_COLLECTION_TYPE_WPE;
        } else if (this.listType == ResourceListController_RESOURCE_LIST_TYPE_ONE_SEARCH) {
        	collectionType = ResourceListController_COLLECTION_TYPE_ONE_SEARCH;
        }
        
        return collectionType;
	},
    
    setPageIndex: function(pageIndex, startIndex, endIndex) {	
    	var message = "";
		var needsListName = this.data.listName && this.endpoint == "ResourceList" && !this.data.publicList;
		if (pageIndex == MessageHelper.format("resourceListController_loading")) {
			message = MessageHelper.format("resourceListController_loading");
		} else if (this.data.totalCount > 0) {
    		if (needsListName) {
    			message = MessageHelper.format(pageIndex + "WithName", this.data.listName, startIndex, endIndex, this.data.totalCount);
    		} else {
    			message = MessageHelper.format(pageIndex, startIndex, endIndex, this.data.totalCount);
    		}
    	} else {
    		if (needsListName) {
    			message = MessageHelper.format(pageIndex + "NoResultsWithName", this.data.listName, this.data.totalCount);
    		} else {
    			message = MessageHelper.format(pageIndex + "NoResults", this.data.totalCount);
    		}
    	}
    	this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WINDOW_TITLE_COUNTS).update(message);
    },
    
    showLoadingGraphic: function() {
    	this.elementMap.get(ResourceListController_DIV_RESULTS_LOADING).show();
    	this.hideResults();
    },
    
    setLoading: function(value) {
    	this.isLoading = value;
    },
    
    hideLoadingGraphic: function() {
    	this.isLoading = false;
    	this.elementMap.get(ResourceListController_DIV_RESULTS_LOADING).hide();
    	this.showResults();
    },
    
    showResults: function() {
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE).show();
    },
    
    hideResults: function() {
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE).hide();
    },

	myInfoTabListener: function(event) {
		this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.endpoint = "MyInfo";
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		this.elementMap.get(ResourceListController_DIV_WINDOW_BUTTONS).hide();
		
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).removeClassName("tab");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).addClassName("tabActive");

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).addClassName("tab");

		if (this.data.canAccessBooklist) {
			this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).removeClassName("tabActive");
			this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).addClassName("tab");
		}
		
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).addClassName("tab");
		
		if (Object.isElement(this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION))) {
			this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION).hide();
		}
    },
    
    myInfoLibraryListener: function() {
    	this.myInfoCollectionType = ResourceListController_COLLECTION_TYPE_LIBRARY;
    	this.elementMap.get(ResourceListController_ID_MYINFO_LIBRARY_ITEMS_OUT).up("." + ResourceListController_CLASS_TAB).addClassName("tabActive");
    	this.elementMap.get(ResourceListController_ID_MYINFO_TEXTBOOK_ITEMS_OUT).up("." + ResourceListController_CLASS_TAB).removeClassName("tabActive");
    	this.myInfoTabListener();
    },
    myInfoTextbookListener: function() {
    	this.myInfoCollectionType = ResourceListController_COLLECTION_TYPE_TEXTBOOK;
    	this.elementMap.get(ResourceListController_ID_MYINFO_LIBRARY_ITEMS_OUT).up("." + ResourceListController_CLASS_TAB).removeClassName("tabActive");
    	this.elementMap.get(ResourceListController_ID_MYINFO_TEXTBOOK_ITEMS_OUT).up("." + ResourceListController_CLASS_TAB).addClassName("tabActive");
    	this.myInfoTabListener();
    },
    
    myHoldsTabListener: function(event) {
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.endpoint = "Holds";
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		this.elementMap.get(ResourceListController_DIV_WINDOW_BUTTONS).hide();

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).addClassName("tab");
		
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).removeClassName("tab");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).addClassName("tabActive");
		
		if (this.data.canAccessBooklist) {
			this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).removeClassName("tabActive");
			this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).addClassName("tab");
		}
		
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).addClassName("tab");
		
		if (Object.isElement(this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION))) {
			this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION).hide();
		}
    },

    myListsTabListener: function(event) {
    	if (!this.data.listID) {
    		// If we came into MyInfo, then we need to look up the stickyListID
	    	var booklistWidget = Registry.lookup("BooklistWidgetController.Load");
	    	this.data.listID = booklistWidget.data.stickyListID;
    	}
    	
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.endpoint = "ResourceList";
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		this.elementMap.get(ResourceListController_DIV_WINDOW_BUTTONS).hide();
		
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).addClassName("tab");

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).addClassName("tab");

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).removeClassName("tab");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).addClassName("tabActive");

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).addClassName("tab");
		
		if (!this.data.publicList) {
			this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION).show();
			DAO.load({endpoint: "BooklistSelectController.ResourceList", container: this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});
			var select = Registry.lookup("BooklistSelectController.ResourceList");
			if (select) {
				select.setBooklistValue(this.data.listID);
			}
		}
    },

    myRecommendationsTabListener: function(event) {
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.endpoint = "Recommendations";
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		this.elementMap.get(ResourceListController_DIV_WINDOW_BUTTONS).hide();

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_INFO).addClassName("tab");

		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).removeClassName("tabActive");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_HOLDS).addClassName("tab");

		if (this.data.canAccessBooklist) {
			this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).removeClassName("tabActive");
			this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RESOURCE_LISTS).addClassName("tab");
		}
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).removeClassName("tab");
		this.elementMap.get(ResourceListController_BUTTON_GOTO_MY_RECOMMENDATIONS).addClassName("tabActive");
		
		if (Object.isElement(this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION))) {
			this.elementMap.get(ResourceListController_BOOK_LIST_SELECTION).hide();
		}
    },
    
	resourceListLibraryLinkListener: function(event) {   
		this.listType = ResourceListController_RESOURCE_LIST_TYPE_LIBRARY;
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH).removeClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS).removeClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES).addClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI).removeClassName("tabActive");
    	}
    },
    
    hideButtons: function() {
    	this.elementMap.get(ResourceListController_DIV_WINDOW_BUTTONS).hide();
    },
    
    showButtons: function() {
    	this.elementMap.get(ResourceListController_DIV_WINDOW_BUTTONS).show();
    },
    
    hideOptions: function() {
    	this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_OPTIONS_INNER).hide();
    },
    
    showOptions: function() {
    	this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_OPTIONS_INNER).show();
    },
    
    showResourceListOptions: function() {
    	this.showOptions();
    	if (Object.isElement(this.elementMap.get(ResourceListController_ID_RESOURCE_LIST_OPTIONS))){
    		this.elementMap.get(ResourceListController_ID_RESOURCE_LIST_OPTIONS).show();
    	}
    	if (Object.isElement(this.elementMap.get(ResourceListController_ID_MYINFO_OPTIONS))){
    		this.elementMap.get(ResourceListController_ID_MYINFO_OPTIONS).hide();
    	}
    },
    
    showMyInfoOptions: function() {
    	this.showOptions();
    	if (Object.isElement(this.elementMap.get(ResourceListController_ID_MYINFO_OPTIONS))){
    		this.elementMap.get(ResourceListController_ID_MYINFO_OPTIONS).show();
    	}
    	if (Object.isElement(this.elementMap.get(ResourceListController_ID_RESOURCE_LIST_OPTIONS))){
    		this.elementMap.get(ResourceListController_ID_RESOURCE_LIST_OPTIONS).hide();
    	}
    },

    resourceListWebpathLinkListener: function(event) {    
		this.listType = ResourceListController_RESOURCE_LIST_TYPE_WPE;
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH).removeClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS).addClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES).removeClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI).removeClassName("tabActive");
    	}
    },

    resourceListDcpiLinkListener: function(event) {    
    	this.listType = ResourceListController_RESOURCE_LIST_TYPE_DCPI;
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.data.isListChange = false;
    	this.fetchPage(0);
    	this.showLoading();
    	this.showLoadingGraphic();
    	
    	if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH).removeClassName("tabActive");
    	}
    	if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS).removeClassName("tabActive");
    	}
    	if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES).removeClassName("tabActive");
    	}
    	if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI).addClassName("tabActive");
    	}
    },

    resourceListOneSearchLinkListener: function(event) {    
		this.listType = ResourceListController_RESOURCE_LIST_TYPE_ONE_SEARCH;
    	this.clearData();
    	this.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
    	this.data.isListChange = false;
 		this.fetchPage(0);
		this.showLoading();
		this.showLoadingGraphic();
		
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_ONE_SEARCH).addClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WEBPATH_EXPRESS).removeClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES))) {
			this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_LIBRARY_TITLES).removeClassName("tabActive");
		}
		if (Object.isElement(this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI))) {
    		this.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI).removeClassName("tabActive");
    	}
    },

	highlightResourceListTab: function(anchorId) {
	    var anchor = this.elementMap.get(anchorId);
	    if (anchor) {
	        anchor.addClassName('highlight');
	    }
	},

	unhighlightResourceListTab: function(anchorId) {
	    var anchor = this.elementMap.get(anchorId);
	    if (anchor) {
	        anchor.removeClassName('highlight');
	    }
	}
});