/* searchresults.js */
Class.create(BaseController, {
    init: function() {
		var questError = Registry.lookup("QuestErrorController.Loader");
		if(questError && questError.hasErrors() && ! questError.sideWidgetsLoaded) {
			questError.sideWidgetsLoaded = true;
			PostLoadBootstrapper.load(["BooklistWidgetController.Load", "MyQuestController.MyShelves"]);
		}
		if (questError && questError.messages) {
			questError.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).update(questError.messages);
			questError.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).show();
		} else {
			questError.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).update("");
			questError.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).hide();
		}
			
		var searchMaster = Registry.lookup("SearchController.SearchMaster");
		searchMaster.setNextButtonVisible(this.data.showNextButton);
		searchMaster.setPreviousButtonVisible(this.data.showPreviousButton);
		searchMaster.setPageIndex(this.data.pageIndex);
		searchMaster.hideLoadingGraphic();
		searchMaster.updateSortControl(this.data.sortType);
	
		if (this.data.warningMessage && this.data.pageNumber === 0) {
			searchMaster.setWarningMessage(this.data.warningMessage);
		}else {
			searchMaster.hideWarningMessage();
		}

		if (Object.isArray(this.data.errors) && this.data.errors.length > 0) {
			searchMaster.hideHeader();
		} else {
			searchMaster.showHeader();
		}
		
		var searchBox = Registry.lookup("SearchBoxController.SearchBox");
		searchBox.enableAutoComplete();
		
		if (this.data.wpeHitList && Object.isArray(this.data.wpeHitList.records)) {
			this.isWPE = true;
		} else {
			this.isWPE = false;
		}
		this.hitList = (this.isWPE) ? this.data.wpeHitList : this.data.hitList;
		
		var searchTypeSelector = Registry.lookup("SearchTypeController.Selector");
		this.isDCPI = searchTypeSelector.getSearchType() == SearchTypeController_SEARCHTYPE_DCPI;
		if (this.hitList) {
			if (this.isWPE || this.isDCPI) {
				searchMaster.hideSortControls();
			} else {
				searchMaster.showSortControls();
			}
			var isWebPath = this.isWPE;	
			var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
			this.hoverGroup = HoverMaster.createGroup({
				name: this.name,
				data: this.hitList.records,
				activatorContainer: this.container,
				hoverContainer: $("content-outer"),
				controllerURL: this.hitList.hoverControllerURL,
				templateURL: this.hitList.hoverTemplateURL,
				openDelay: 0.5,
				closeDelay: 0.1,
				onShow: function() {
					var limiterHovers = HoverMaster.lookupGroup("LimiterController.Limiters");
					if (limiterHovers && Object.isFunction(limiterHovers.disable)) {
						limiterHovers.disable();
					}
					$("content-outer").addClassName("high-zindex");
					var oldHighZParent = Utility.downToClass($("resultsCacheInner"), "high-zindex");
					if(oldHighZParent) {
						oldHighZParent.removeClassName("high-zindex");
					}
					var newHighZParent = Utility.upToClass(this.currentActivator, "searchResult");
					newHighZParent.addClassName("high-zindex");
				},
				onHide: function() {
					var limiterHovers = HoverMaster.lookupGroup("LimiterController.Limiters");
					if (limiterHovers && Object.isFunction(limiterHovers.enable)) {
						limiterHovers.enable();
					}
					$("content-outer").removeClassName("high-zindex");
				}
			});
			
			if (this.data.showNextButton && ! this.hasNextPage()) { 
				var fetchPage = searchMaster.fetchPage.bind(searchMaster, this.data.pageNumber + 1, this.data.searchTerm, this.data.visualSearchNodeID, this.data.advancedSearchData);
				fetchPage.defer(); // defer this until after the results have loaded
			}
		}
		
		
		if (this.isDCPI || this.hitList) {
			if (this.data.limiters && Object.isArray(this.data.limiters.limiterMenu)) {
				// This is unconventional, but we have a 2nd set of data that came back with
				// the search results that needs its own controller.  This is the best way
				// i can think of to deal with this.
				Registry.createController("LimiterController.Limiters", this.data.limiterTemplateURL, this.data.limiterControllerURL, {endpoint: "LimiterController.Limiters", container: $(LimiterController_DIV_LIMITER_OUTER)}, this.data.limiters);

				if (this.data.limiters.limiterData && this.data.limiters.limiterData.length > 0 && this.data.limiters.limiterData[0] && this.data.limiters.limiterData[0].length > 0 && this.data.limiters.limiterData[0][0].providers) {
					searchMaster.setSelectedProviders(this.data.limiters.limiterData[0][0].providers);
				}
			}
		}
		
		if (this.data.refreshLimiterHistory) {
    		var limiterHistory = Registry.lookup("LimiterController.History");
    		limiterHistory.getNarrowingHistory();
		}
		
		Registry.lookup("SearchBoxController.SearchBox").focusSearchBox();
    },
    
    registerEvents: function() {
    	var myshelves = Registry.lookup("MyQuestController.MyShelves");
    	var searchMaster = Registry.lookup("SearchController.SearchMaster");
    	if (! this.isWPE && this.hitList) {
    		var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
    		if(myshelves) {
    			myshelves.enableDroppables();
    		}
    		for (var i=0; i < this.hitList.records.length; i++) {
    			var isDCPIRecord = this.isDCPI || this.hitList.records[i].dcpiRecordGUID || this.hitList.records[i].digitalMediaProviderName;
    			var titleDetailsLoader =
    				(isDCPIRecord)
						? (this.hitList.records[i].follettEBookTitleDetailsURL)
		    					? (function(reciffy){
		    						return function(){
		    							var win = window.open(reciffy.follettEBookTitleDetailsURL, "shelfcontent_blank");
		    							if(win) win.focus();
		    						}
		    					  })(this.hitList.records[i])
								: searchMaster.dcpiRedirectorLoader.bind(searchMaster, this.hitList.records[i].dcpiRecordGUID || this.hitList.records[i].bibID, null, this.hitList.records[i].copySiteID, !!this.hitList.records[i].dcpiRecordGUID)
						: titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, this.hitList.records[i].bibID, null);
    			Event.observe(this.elementMap.get(HitListRecordTemplate_DIV_TITLE_PREFIX + i), "click",titleDetailsLoader);
    			Event.observe(this.elementMap.get(CoverImageTemplate_DIV_TITLE_IMAGE_PREFIX + i), "click", titleDetailsLoader);
    			this.addDraggable(CoverImageTemplate_DIV_TITLE_IMAGE_PREFIX + i, this.hitList.records[i].bibID, this.hitList.records[i].dcpiRecordGUID, null, false, isDCPIRecord);
    		}
    	} else if(this.hitList) {
    		if(myshelves) {
    			myshelves.disableDroppables();
    		}
    		for (var i=0; i < this.hitList.records.length; i++) {
    			this.addDraggable(CoverImageTemplate_DIV_TITLE_IMAGE_PREFIX + i, this.hitList.records[i].recID, null, null, true);
    		}
    	}
    	if(this.data.showMakeAWish) {
    		Event.observe(this.elementMap.get(SearchController_DIV_ADD_WISH_FROM_SEARCH_RESULTS_LINK), "mousedown", this.openWishDialog.bind(this));
    	}
    	if (Object.isArray(this.data.alternateTerms)) {
    		Event.observe(this.elementMap.get(SearchController_BUTTON_DID_YOU_MEAN_GO), "mousedown", this.submitDidYouMeanSearch.bind(this));
    	}
    },
    
    openWishDialog: function() {
    	var params = {
    			width:"512px",
    			id:WishController_DIV_ADD_WISH_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "WishController.WishDialog", modal: modalDialog}, null, null);
    },
    
    getSearchTerm: function() {
    	return this.data.searchTerm;
    },
    
    dataAppended: function(pageNumber) {
    	var searchMaster = Registry.lookup("SearchController.SearchMaster");
    	searchMaster.notifyPageDataUpdated(pageNumber);
    },
    
    pagingAnimation: function(currentElement, newElement, isNext, callback) {
    	if (! Object.isElement(currentElement)) {
    		this.container.update(newElement);
    		callback();
    	} else {
    		var width = currentElement.getWidth();
    		this.container.makePositioned();
    		this.container.insert(newElement);
    		
    		var direction = isNext ? -1 : 1;
    		if (window.isRTL) {
    			direction = -direction;
    		}
    		
    		currentElement.setStyle({left: direction * width + "px", width: width + "px", position: "absolute"});
    		newElement.setStyle({width: width + "px"});
    		this.container.setStyle({left: -direction * width + "px"});
    		
    		var searchMaster = Registry.lookup("SearchController.SearchMaster");
    		searchMaster.prepareSearchResultsForAnimation();
    		
    		var afterFinish = this.finishAnimation.bind(this, currentElement, callback);
    		new Effect.Move(this.container, {x: direction * width, mode: "relative", duration: 1.0, afterFinish: afterFinish});
    	}
    },
    
    finishAnimation: function(currentElement, callback) {
    	currentElement.remove();
    	var searchMaster = Registry.lookup("SearchController.SearchMaster");
    	searchMaster.finishSearchResultsAnimation();
    	callback();
    },
    
    getCurrentSort: function() {
        var currentSort = SearchController_SORTBYRELEVANCE;
        if (! $("SearchController_LINK_SORT_TITLE").visible()) {
            currentSort = SearchController_SORTBYTITLE;
        }
        
        return currentSort;
    },

	submitDidYouMeanSearch: function() {
	    var didMeanTerms = "";        
	    for( var i=0; i < 5; i++){
	      var termElement = this.elementMap.get("didYouMeanTerm" + i);
	      if (termElement) {
	        if (i > 0 ) {
	          didMeanTerms += " " ;
	        }
	        didMeanTerms +=  termElement.getValue();
	      }
	    }
	    
	    var searchBox = Registry.lookup("SearchBoxController.SearchBox");
	    searchBox.setSearchBoxText(didMeanTerms);
	    searchBox.submitSearch(true);
	},
	
	updateSearchResults_DigitalResources: function (bibIDs, dcpiRecordGUIDs, value) {
		for (var i = this.pagedData.length - 1; i >=0; i-- ) {
			if(this.pagedData[i].hitList) {
				var records = this.pagedData[i].hitList.records;
				for (var j=0; j < records.length; j++) {
					var record = records[j];
					if (bibIDs && bibIDs.indexOf(record.bibID) >= 0) {
						if (record.bibID != null){
							record.inUsersBookList = value;
						}
					} else if (dcpiRecordGUIDs && dcpiRecordGUIDs.indexOf(record.dcpiRecordGUID) >= 0) {
						if (record.dcpiRecordGUID != null){
							record.inUsersBookList = value;
						}
					}
				}
			}
		}
	},
	
	updateSearchResults: function (IDs, listID, key, value, propertyToUpdate) {        
		for (var i = this.pagedData.length - 1; i >=0; i-- ) {
			if (eval("this.pagedData[i]." + listID)) {
				var records = eval("this.pagedData[i]." + listID + ".records;");
				for (var j = 0; j < records.length; j++) {
					var record = records[j];
					if (IDs.indexOf(eval(eval("record." + key))) >= 0) {
						record[propertyToUpdate] = value;					
					}        
				}
			}
		}        
	},
	
	updateStatusInfo: function(bibID, availabilityString, availabilityClass, hoverHighLevelAvailabilityLocalStatusString) {
		if(bibID) {
			for (var i = 0; i < this.pagedData.length; i++) {
				var records = this.pagedData[i].hitList.records;
				for(var j = 0; j < records.length; j++) {
					if(records[j].bibID == bibID) {
						records[j].availabilityImageString = availabilityString;
						records[j].availabilityClass = availabilityClass;
						records[j].hoverHighLevelAvailabilityLocalStatusString = hoverHighLevelAvailabilityLocalStatusString;
						jQuery('.'+HitListRecordTemplate_CLASS_SEARCHRESULT+'.'+HitListRecordTemplate_CLASS_BIBID_PREFIX+bibID+' .'+CoverImageTemplate_CLASS_RESULT_STATUS+' > img')
						.replaceWith(records[j].availabilityImageString);
					}
				}
			}
		}
	}
});