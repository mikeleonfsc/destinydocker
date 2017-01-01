/* booklistselect.js */
Class.create(BaseController, {
	
	init: function() {
		if (this.data.results.length > 1) {
			this.elementMap.get(BooklistSelectController_SPAN_BOOK_LIST_SELECT).show();
			if ($(OneSearchController_ONE_SEARCH_BOOK_LIST_SELECTION)) {
				$(OneSearchController_ONE_SEARCH_BOOK_LIST_SELECTION).show();
			}
		} else {
			if ($(OneSearchController_ONE_SEARCH_BOOK_LIST_SELECTION)) {
				$(OneSearchController_ONE_SEARCH_BOOK_LIST_SELECTION).hide();
			}
		}
	},

	registerEvents: function() {
		if (Object.isElement(this.elementMap.get(BooklistSelectController_PARAM_SELECTED_LIST))) {
			Event.observe(this.elementMap.get(BooklistSelectController_PARAM_SELECTED_LIST), "change", this.selectBooklist.bind(this));
		}
	},
	
	selectBooklist: function() {
		var bookListDropDown = this.elementMap.get(BooklistSelectController_PARAM_SELECTED_LIST);
		var booklistWidget = Registry.lookup("BooklistWidgetController.Load");
		var searchType = Registry.lookup("SearchTypeController.Selector");
		var widget = Registry.lookup("BooklistSelectController.Widget");
		var titleDetails = Registry.lookup("BooklistSelectController.TitleDetails");
		var resourceList = Registry.lookup("BooklistSelectController.ResourceList");
		var listID;
		var titlesBibID;
		var dcpiBibID;
		var dcpiRecordGUID;
		var quickTitlesBibID;
		var quickDcpiBibID;
		var quickDcpiRecordGUID;
		var dbRecID;
		var listType;
		var checkoutsArray;
		var holdsArray;
		var recommendationsArray;
		var dcpiBibArray;
		var dcpiGUIDArray;
		var titlesBibArray;
		var wpeObject;
		var top10Array;
		var newArrivalArray;
		var suggestionArray;
		var shelfArray;
		var inboxArray;
		var updatesArray;
		var wpeTitle;
		var wpeUrl;
		
		if (booklistWidget && widget && Object.isElement(bookListDropDown)) {
        	if (DAO.load({endpoint: "BooklistWidgetController.Updater", container: null}, searchType.getSearchType(), bookListDropDown.getValue())) {
        		// Update the widget, title details, and resource list drop downs with the value selected
        		widget.setBooklistValue(bookListDropDown.getValue());
        		listID = bookListDropDown.getValue();
        		if (resourceList) {
        			resourceList.setBooklistValue(listID);
        		}
        		if (titleDetails) {
        			titleDetails.setBooklistValue(listID);
        		}
        	}
        }

		// gather result information in order to change in this list / add to this list toggle every place that is currently running
		var titleDetailsController = Registry.lookup("TitleDetailsController.TitleDetails");
		if(titleDetailsController) {
			titlesBibID = titleDetailsController.data.bibID;
		} 
		var dcpiTitleDetails = Registry.lookup("TitleDetailsController.DCPITitleDetails");
		if(dcpiTitleDetails) {
			dcpiBibID = dcpiTitleDetails.data.bibID;
			dcpiRecordGUID = dcpiTitleDetails.data.dcpiRecordGUID;
		} 
		var oneSearchTitleDetails = Registry.lookup("OneSearchController.DatabaseDetail");
		if(oneSearchTitleDetails) {
			dbRecID = oneSearchTitleDetails.data.dbRecID;
		} 
		var resourceListController = Registry.lookup("ResourceListController.Master");
		if(resourceListController) {
			listType = resourceListController.listType;
		} 
		var myInfo = Registry.lookup("ResourceListController.MyInfo");
		if (myInfo) {
			checkoutsArray = this.populateResourceListIDs(myInfo);
		}
		
		var holds = Registry.lookup("ResourceListController.Holds");
		if (holds) {
			holdsArray = this.populateResourceListIDs(holds);
		}
		
		var recommendations = Registry.lookup("ResourceListController.Recommendations");
		if (recommendations) {
			recommendationsArray = this.populateResourceListIDs(recommendations);
		}
		var searchResults = Registry.lookup("SearchController.SearchResults");
		if(searchResults) {
			this.populateSearchResultIDs(searchResults, false);
			
			titlesBibArray = this.titlesBibArray;
			wpeObject = this.wpeObject;
		}
		var dcpiSearchResults = Registry.lookup("DCPISearchController.SearchResults");
		if(dcpiSearchResults) {
			this.populateSearchResultIDs(dcpiSearchResults, true);
			dcpiBibArray = this.dcpiBibArray;
			dcpiGUIDArray = this.dcpiGUIDArray;
		}
		var top10 = Registry.lookup("Top10Controller.Top10");
		if(top10) {
			var records = top10.data.records;
			var bibIDs = new Array();
			var countBibs = 0;
			if (Object.isArray(records)) {
				for (var i = 0; i < records.length; i++) {
					if (records[i].bibID) {
						bibIDs[countBibs] = records[i].bibID;
						countBibs++;
					}
				}
			}
			top10Array = bibIDs;
		}
		
		var newArrivals = Registry.lookup("NewArrivalsController.Contents");
		if(newArrivals) {
			var pagedData = newArrivals.pagedData;
			var bibIDs = new Array();
			var countBibs = 0;
			if (Object.isArray(pagedData)) {
				for (var i = 0; i < pagedData.length; i++) {
					var records = pagedData[i].recList;
					if (Object.isArray(records)) {
						for (var j=0; j < records.length; j++) {
							if (records[j].bibID) {
								bibIDs[countBibs] = records[j].bibID;
								countBibs++;
							}
						}
					}
				}
			}
			newArrivalArray = bibIDs;
		}			
		var myShelf = Registry.lookup("MyQuestShelfController.Loader");
		if(myShelf) {
			var records = myShelf.records;
			var bibIDs = new Array();
			var countBibs = 0;
			if (Object.isArray(records)) {
				for (var i = 0; i < records.length; i++) {
					if (records[i].bibID) {
						bibIDs[countBibs] = records[i].bibID;
						countBibs++;
					}
				}
			}
			shelfArray = bibIDs;
		}
		var suggestions = Registry.lookup("TitleDetailsController.Suggestions");
		if(suggestions) {
			var pagedData = suggestions.pagedData;
			var bibIDs = new Array();
			var countBibs = 0;
			if (Object.isArray(pagedData)) {
				for (var i = 0; i < pagedData.length; i++) {
					var records = pagedData[i].recList;
					if (Object.isArray(records)) {
						for (var j=0; j < records.length; j++) {
							if (records[j].bibID) {
								bibIDs[countBibs] = records[j].bibID;
								countBibs++;
							}
						}
					}
				}
			}
			suggestionArray = bibIDs;
		}
		var inbox = Registry.lookup("MyQuestInboxController.Loader");
		if(inbox) {
			var records = inbox.records;
			var bibIDs = new Array();
			var countBibs = 0;
			if (Object.isArray(records)) {
				for (var i = 0; i < records.length; i++) {
					if (records[i].bibID) {
						bibIDs[countBibs] = records[i].bibID;
						countBibs++;
					}
				}
			}
			inboxArray = bibIDs;
		}
		var updates = Registry.lookup("MyQuestUpdatesController.OlderLoader");
		if(updates) {
			var records = updates.records;
			var bibIDs = new Array();
			var countBibs = 0;
			if (Object.isArray(records)) {
				for (var i = 0; i < records.length; i++) {
					if (records[i].bibID) {
						bibIDs[countBibs] = records[i].bibID;
						countBibs++;
					}
				}
			}
			updatesArray = bibIDs;
		}
		var quickDetails = $(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST);
		if (quickDetails) {
			if ($(HoverMasterController_DIV_TITLE_HOVER_WPE_ANCHOR)) {
				wpeTitle = $(HoverMasterController_DIV_TITLE_HOVER_WPE_ANCHOR).innerText;
				wpeUrl = $(HoverMasterController_DIV_TITLE_HOVER_WPE_ANCHOR).getAttribute("href");
			} else {
				var type = $("titleHoverModuleInner").getAttribute("type");
				var itemID = $("titleHoverModuleInner").getAttribute("itemID");
				if (itemID && type) {
					switch(type) {
						case "bibID":
							quickTitlesBibID = itemID;
							break;
						case "dcpiBibID":
							quickDcpiBibID = itemID;
							break;
						case "dcpiRecordGUID":
							quickDcpiRecordGUID = itemID;
							break;
					}	
				}
				
			}
		}
		DAO.load({endpoint:"BooklistSelectController.ChangeList", container:null}, listID, titlesBibID, dcpiBibID, dcpiRecordGUID, 
				quickTitlesBibID, quickDcpiBibID, quickDcpiRecordGUID, dbRecID, listType, checkoutsArray, 
				holdsArray, recommendationsArray, dcpiBibArray, dcpiGUIDArray, titlesBibArray, Object.toJSON(wpeObject), 
				top10Array, newArrivalArray, shelfArray, inboxArray, updatesArray, suggestionArray, wpeTitle, wpeUrl);
	},
	
	setBooklistValue: function(listID) {
		if (Object.isElement(this.elementMap.get(BooklistSelectController_PARAM_SELECTED_LIST)) && listID) {
			this.elementMap.get(BooklistSelectController_PARAM_SELECTED_LIST).setValue(listID);
		}
	},
	
	populateSearchResultIDs: function(controller, isDCPI) {
		var pagedData = controller.pagedData;
		var bibIDs = new Array();
		var dcpiRecordGUIDs = new Array();
		var wpeObject = new Object();
		var wpeResults = new Array();
		var countBibs = 0;
		var countGUIDs = 0;
		var countWpe = 0;
		
		if (Object.isArray(pagedData)) {
			for (var i = 0; i < pagedData.length; i++) {
				if (pagedData[i].wpeHitList) {
					var records = pagedData[i].wpeHitList.records;
					if (Object.isArray(records)) {
						for (var j=0; j < records.length; j++) {
							wpeResults[countWpe] = new Object();
							wpeResults[countWpe].url = records[j].element.url;
							wpeResults[countWpe].title = records[j].element.title;
							wpeResults[countWpe].recID = records[j].recID;
							countWpe++;
						}
					}
				} else if (pagedData[i].hitList) {
					var records = pagedData[i].hitList.records;
					if (Object.isArray(records)) {
						for (var j=0; j < records.length; j++) {
							if (records[j].bibID) {
								bibIDs[countBibs] = records[j].bibID;
								countBibs++;
							} else {
								dcpiRecordGUIDs[countGUIDs] = records[j].dcpiRecordGUID;
								countGUIDs++;
							}
						}
					}
				}
			}
		}
		if (isDCPI) {
			this.dcpiBibArray = bibIDs;
			this.dcpiGUIDArray = dcpiRecordGUIDs;
		} else {
			if (bibIDs && bibIDs.length > 0) {
				this.titlesBibArray = bibIDs;
			} else {
				this.wpeObject = new Object();
				this.wpeObject.results = wpeResults;
			}
		}
	},
	populateResourceListIDs: function(controller) {
		var pagedData = controller.pagedData;
		var bibIDs = new Array();
		var countBibs = 0;
		if (Object.isArray(pagedData)) {
			for (var i = 0; i < pagedData.length; i++) {
				var records = pagedData[i].hitList.records;
				if (Object.isArray(records)) {
					for (var j=0; j < records.length; j++) {
						var bibID = null;
						if (records[j].bibID) {
							bibIDs[countBibs] = records[j].bibID;
							countBibs++;
						}
					}
				}
			}
		}
		return bibIDs;
	}
});