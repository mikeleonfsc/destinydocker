/* booklistaddbook.js */
Class.create(BaseController, {
	init: function() {
		var booklist = Registry.lookup("BooklistWidgetController.Load");
		booklist.updateTitleCounts(this.data.defaultBookListCount);
		if(this.data.bibID || this.data.contentID) {
			var key = "bibID";
			var listID = "hitList"
			var property = "inUsersBookList"
			if(this.data.isWPE) {
				key = "recID";
				listID = "wpeHitList"
			} 
			var searchMaster = Registry.lookup("SearchController.SearchResults");
			if(searchMaster) {
				this.data.bibID && searchMaster.updateSearchResults([this.data.bibID], "hitList", "bibID", true, property);
				this.data.contentID && searchMaster.updateSearchResults_DigitalResources(void 0,[this.data.contentID],true);
			}
			
			var searchMasterReally = Registry.lookup("SearchController.SearchMaster");
			if(searchMasterReally){
				if (this.data.warningMessage) {
					searchMasterReally.setWarningMessage(this.data.warningMessage);
				}else {
					searchMasterReally.hideWarningMessage();
				}
			}
			
			var dcpiSearchResults = Registry.lookup("DCPISearchController.SearchResults");
			if(dcpiSearchResults) {
				dcpiSearchResults.updateSearchResults_DigitalResources([this.data.bibID], [this.data.contentID], true);
			}
			
			if(!this.data.isWPE) {
				var myShelf = Registry.lookup("MyQuestShelfController.Loader");
				if(myShelf) {
					myShelf.updateShelfResults([this.data.bibID], true);
				}
				var top10 = Registry.lookup("Top10Controller.Top10");
				if(top10) {
					top10.updateSearchResults([this.data.bibID], "bibID", true, "inUsersBookList");
				}
				
				var newArrivals = Registry.lookup("NewArrivalsController.Contents");
				if(newArrivals) {
					newArrivals.updateSearchResults([this.data.bibID], "bibID", true, "inUsersBookList");
				}			
			}
			
		}
	},
	
	registerEvents: function() {
	}
});