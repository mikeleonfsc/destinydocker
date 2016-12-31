/* titledetailshold.js */
Class.create(BaseController, {
    init: function() {
		var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
		if (titleDetails) {
			titleDetails.updateHoldInfo(this.data);
		}
		var searchResults = Registry.lookup("SearchController.SearchResults");
		if (searchResults) {
			searchResults.updateStatusInfo(this.data.bibID, this.data.availabilityString, this.data.availabilityClass, this.data.titleDetailValue.localAvailability);
		}
	},

    registerEvents: function() {
    }
    
});