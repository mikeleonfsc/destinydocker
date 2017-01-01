/* booklistselectchange.js */
Class.create(BaseController, {
	init: function() {
		var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
		if (titleDetails && this.data.titlesBibID) {
			titleDetails.updateInUsersBooklist(this.data.selectedItemInList, this.data.titlesBibID);
		}
		var dcpiTitleDetails = Registry.lookup("TitleDetailsController.DCPITitleDetails");
		if (dcpiTitleDetails && (this.data.dcpiBibID || this.data.dcpiRecordGUID)) {
			dcpiTitleDetails.updateInUsersBooklist(this.data.selectedItemInList, this.data.dcpiBibID, this.data.dcpiRecordGUID);
		}
		var oneSearchTitleDetails = Registry.lookup("OneSearchController.Dialog");
		if(oneSearchTitleDetails && this.data.dbRecID) {
			oneSearchTitleDetails.reloadCurrent(this.data.dbRecID);
		}
		var resourceList = Registry.lookup("ResourceListController.Master");
		if (resourceList && this.data.listType) {
			resourceList.listType = this.data.listType;
			resourceList.data.listID = this.data.stickyListID;
			resourceList.data.isListChange = true;
			if (resourceList.endpoint == "ResourceList") {
				resourceList.clearData();
				resourceList.elementMap.get(ResourceListController_DIV_RESULTS_CACHE_INNER).update("");
				resourceList.fetchPage(0);
				resourceList.showLoading();
				resourceList.showLoadingGraphic();
			}
		}
		var myInfo = Registry.lookup("ResourceListController.MyInfo");
		if(myInfo && this.data.checkoutsResults) {
			var results = this.data.checkoutsResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					myInfo.updateResults([results[i].bibID], "hitList", "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		
		var holds = Registry.lookup("ResourceListController.Holds");
		if(holds && this.data.holdsResults) {
			var results = this.data.holdsResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					holds.updateResults([results[i].bibID], "hitList", "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		
		var recommendations = Registry.lookup("ResourceListController.Recommendations");
		if(recommendations && this.data.recommendationsResults) {
			var results = this.data.recommendationsResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					recommendations.updateResults([results[i].bibID], "hitList", "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		
		var searchResults = Registry.lookup("SearchController.SearchResults");
		if(searchResults && this.data.titlesResults) {
			var results = this.data.titlesResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					if (results[i].isWPE) {
						searchResults.updateSearchResults([results[i].recID], "wpeHitList", "recID", results[i].inUsersBookList, "inUsersBookList");
					} else {
						searchResults.updateSearchResults([results[i].bibID], "hitList", "bibID", results[i].inUsersBookList, "inUsersBookList");
					}
				}
			}
		}
		var dcpiSearchResults = Registry.lookup("DCPISearchController.SearchResults");
		if(dcpiSearchResults && this.data.dcpiResults) {
			var results = this.data.dcpiResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					dcpiSearchResults.updateSearchResults_DigitalResources([results[i].bibID],[results[i].dcpiRecordGUID],results[i].inUsersBookList);
				}
			}
		}
		var inbox = Registry.lookup("MyQuestInboxController.Loader");
		if(inbox && this.data.inboxResults) {
			var results = this.data.inboxResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					inbox.updateResults([results[i].bibID], "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		var updates = Registry.lookup("MyQuestUpdatesController.OlderLoader");
		if(updates && this.data.updatesResults) {
			var results = this.data.updatesResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					updates.updateResults([results[i].bibID], "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		var myShelf = Registry.lookup("MyQuestShelfController.Loader");
		if(myShelf && this.data.shelfResults) {
			var results = this.data.shelfResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					myShelf.updateShelfResults([results[i].bibID], results[i].inUsersBookList);
				}
			}
		}
		var top10 = Registry.lookup("Top10Controller.Top10");
		if(top10 && this.data.top10Results) {
			var results = this.data.top10Results;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					top10.updateSearchResults([results[i].bibID], "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		
		var newArrivals = Registry.lookup("NewArrivalsController.Contents");
		if(newArrivals && this.data.newArrivalResults) {
			var results = this.data.newArrivalResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					newArrivals.updateSearchResults([results[i].bibID], "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		var suggestions = Registry.lookup("TitleDetailsController.Suggestions");
		if(suggestions && this.data.suggestionResults) {
			var results = this.data.suggestionResults;
			if (results && Object.isArray(results)) {
				for (var i = 0; i < results.length; i++) {
					suggestions.updateSearchResults([results[i].bibID], "bibID", results[i].inUsersBookList, "inUsersBookList");
				}
			}
		}
		
		// Update Quick Details
		if ($(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST) 
			&& (this.data.quickTitlesBibID || this.data.quickDcpiBibID || this.data.quickDcpiRecordGUID 
			|| (this.data.wpeTitle && this.data.wpeUrl))) {
			if (this.data.selectedHoverItemInList) {
				$(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST).hide();
				$(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST).show();
			} else {
				$(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST).show();
				$(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST).hide();
			}
		}
	},
	
	registerEvents: function() {
	}
});