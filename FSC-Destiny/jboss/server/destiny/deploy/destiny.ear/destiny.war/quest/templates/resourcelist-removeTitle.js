/* resourcelist-removeTitle.js */
Class.create(BaseController, {
    init: function(pageChange) {	
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		var resourceList = Registry.lookup("ResourceListController.ResourceList");
		var bookListWidget = Registry.lookup("BooklistWidgetController.Load");
		resourceListMaster.setTotalCount(this.data.totalCount);
		if (this.data.startIndex <= this.data.totalCount) {
			resourceList.pagedData[this.data.pageNumber] = this.data;
			resourceList.setPage(this.data.pageNumber);
		} else {
			if(resourceList.pagedData && resourceList.pagedData.size() > 0) {
				resourceList.pagedData[this.data.pageNumber-1].showNextButton = false;
				resourceList.setPage(this.data.pageNumber-1);
			} else {								
				resourceListMaster.setPageIndex(this.data.pageIndex);	
				resourceListMaster.setNextButtonVisible(this.data.showNextButton);
				resourceListMaster.setPreviousButtonVisible(this.data.showPreviousButton);
				resourceListMaster.hideLoadingGraphic();
				resourceListMaster.hideResults();
				resourceListMaster.modal.centerDialog();
				resourceListMaster.hideButtons();
				resourceList.setPage(0);	
				resourceList.dispose();
			}
		}
		bookListWidget.updateTitleCounts(this.data.totalCount);
		var stController = Registry.lookup("SearchTypeController.Selector");
		if (SearchTypeController_SEARCHTYPE_DCPI == stController.getSearchType() && (this.data.removedBibIDs || this.data.removedDCPIRecordGUIDs)) {
			var dcpiSearchResults = Registry.lookup("DCPISearchController.SearchResults");
			dcpiSearchResults.updateSearchResults_DigitalResources(this.data.removedBibIDs, this.data.removedDCPIRecordGUIDs, false);
		} else if(this.data.removedBibIDs || this.data.removedDCPIRecordGUIDs) {
			if(SearchTypeController_SEARCHTYPE_LIBRARY == stController.getSearchType() || SearchTypeController_SEARCHTYPE_ONESEARCH == stController.getSearchType()) {
				var searchMaster = Registry.lookup("SearchController.SearchResults");
				if(searchMaster) {
					this.data.removedBibIDs && searchMaster.updateSearchResults(this.data.removedBibIDs, "hitList", "bibID", false, "inUsersBookList");
					this.data.removedDCPIRecordGUIDs && searchMaster.updateSearchResults_DigitalResources(void 0,this.data.removedDCPIRecordGUIDs,false);
				}
				var myShelf = Registry.lookup("MyQuestShelfController.Loader");
				if(myShelf) {
					myShelf.updateShelfResults(this.data.removedBibIDs, false);
				}
			} else {
				var searchMaster = Registry.lookup("SearchController.SearchResults");
				if(searchMaster) {
					searchMaster.updateSearchResults(this.data.removedBibIDs, "wpeHitList", "recID", false, "inUsersBookList");
				}
			}
			
			var top10 = Registry.lookup("Top10Controller.Top10");
			if(top10) {
				top10.updateSearchResults(this.data.removedBibIDs, "bibID", false, "inUsersBookList");
			}
			
			var newArrivals = Registry.lookup("NewArrivalsController.Contents");
			if(newArrivals) {
				newArrivals.updateSearchResults(this.data.removedBibIDs, "bibID", false, "inUsersBookList");
			}
		}
	},
    
    registerEvents: function() {
    }

});