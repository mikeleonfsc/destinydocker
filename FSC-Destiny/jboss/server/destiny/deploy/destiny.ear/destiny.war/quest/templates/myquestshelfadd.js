/* myquestshelfadd.js */
Class.create(BaseController, {
	init: function() {
		Registry.lookup("MyQuestController.MyShelves").updateShelfCounts(this.data);
		var searchResults = Registry.lookup("SearchController.SearchResults");
		if (searchResults) {
			searchResults.updateSearchResults([this.data.bibID], "hitList", "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var resourceList = Registry.lookup("ResourceListController.ResourceList");
		if (resourceList) {
			resourceList.updateResults([this.data.bibID], "hitList", "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var myInfo = Registry.lookup("ResourceListController.MyInfo");
		if (myInfo) {
			myInfo.updateResults([this.data.bibID], "hitList", "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var holds = Registry.lookup("ResourceListController.Holds");
		if (holds) {
			holds.updateResults([this.data.bibID], "hitList", "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var recommendations = Registry.lookup("ResourceListController.Recommendations");
		if (recommendations) {
			recommendations.updateResults([this.data.bibID], "hitList", "bibID", this.data.shelfNumber, "shelfNumber");
		}

		var myquestloader = Registry.lookup("MyQuestUpdatesController.OlderLoader");
		if (!myquestloader) {
			myquestloader = Registry.lookup("MyQuestInboxController.Loader");
		}
		if (myquestloader) {
			myquestloader.updateResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var top10 = Registry.lookup("Top10Controller.Top10");
		if(top10) {
			top10.updateSearchResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var newArrivals = Registry.lookup("NewArrivalsController.Contents");
		if(newArrivals) {
			newArrivals.updateSearchResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
		if (titleDetails) {
			titleDetails.updateMyQuestShelf(this.data.shelfNumber, this.data.bibID);
		}

		var suggestions = Registry.lookup("TitleDetailsController.Suggestions");
		if(suggestions) {
			suggestions.updateSearchResults([this.data.bibID], "bibID", this.data.shelfNumber, "shelfNumber");
		}
		
		var myquestshelf = Registry.lookup("MyQuestShelfController.Loader");
		if(myquestshelf){
			var myquestshelfHeader = $$("#"+MyQuestShelfController_DIV_MYQUEST_SHELVES_HEADER_RESULTS)[0];
			if(myquestshelfHeader){
				if(myquestshelf.getShelfNumber() == this.data.shelfNumber){
					var myquest = Registry.lookup("MyQuestController.Loader");
					if(myquest){
						myquest.loadShelf(this.data.shelfNumber);
					}
				}else{
					myquestshelf.removeFromShelfCallback(this.data);
				}
			}
		}
 	},
	
	registerEvents: function() { 		 		
 	}
});