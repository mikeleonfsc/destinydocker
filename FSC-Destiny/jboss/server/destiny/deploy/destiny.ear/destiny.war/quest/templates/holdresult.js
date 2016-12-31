/* holdresult.js */
Class.create(BaseController, {
    init: function() {
		var holdDialog = Registry.lookup("HoldController.HoldDialog");
		if(this.data.errors && this.data.errors.length > 0) {
			holdDialog.populateErrors(this.data.errors);
		} else {
			//fancy close thingy goes here
			holdDialog.populateHoldMessage(this.data.holdMessage);
			
			var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
			if (titleDetails) {
				titleDetails.updateMultipleHoldInfo(this.data);
			}
			var searchResults = Registry.lookup("SearchController.SearchResults");
			if (searchResults) {
				searchResults.updateStatusInfo(this.data.bibID, this.data.availabilityString, this.data.availabilityClass, this.data.titleDetailValue.localAvailability);
			}
		}
    },

    registerEvents: function() {
    }   
});