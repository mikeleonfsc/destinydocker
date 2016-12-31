/* myquestshelfremove.js */
Class.create(BaseController, {
	init: function() {		
		this.loader = Registry.lookup("MyQuestController.Loader");
		
		Registry.lookup("MyQuestController.MyShelves").updateShelfCounts(this.data);
		
		var shelfcontroller = Registry.lookup("MyQuestShelfController.Loader");
		if(shelfcontroller){
			shelfcontroller.removeFromShelfCallback(this.data);
		}
		
		var searchResults = Registry.lookup("SearchController.SearchResults");
		if (searchResults) {
			searchResults.updateSearchResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}

		var top10 = Registry.lookup("Top10Controller.Top10");
		if(top10) {
			top10.updateSearchResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var newArrivals = Registry.lookup("NewArrivalsController.Contents");
		if(newArrivals) {
			newArrivals.updateSearchResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
 	},
	
	registerEvents: function() { 		 		
 	}
 	
});