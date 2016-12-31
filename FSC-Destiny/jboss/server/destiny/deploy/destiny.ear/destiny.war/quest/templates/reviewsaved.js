/* reviewsaved.js */
Class.create(BaseController, {
    init: function() {
		var reviewDialog = Registry.lookup("ReviewController.ReviewDialog");
		if (this.data.error) {
			reviewDialog.showError(this.data.error);
		} else {
			reviewDialog.closeDialog();
	        
			var titleDetailsDialog = Registry.lookup("TitleDetailsController.TitleDetails");
			if (titleDetailsDialog) {
				titleDetailsDialog.updateReviews(this.data.reviews, this.data.reviewForPatron);
			}
	        
			var dcpiTitleDetailsDialog = Registry.lookup("TitleDetailsController.DCPITitleDetails");
			if (dcpiTitleDetailsDialog) {
				dcpiTitleDetailsDialog.updateReviews(this.data.reviews, this.data.reviewForPatron);
			}
			
			var shelfController = Registry.lookup("MyQuestShelfController.Loader");
			if (shelfController) {
				if(this.data.pending ) {
					shelfController.updatePendingReviewForBib(this.data.bibID, this.data.pending);
				} else {
					shelfController.updateReviewForBib(this.data.bibID, this.data.myRating, this.data.reviews.averageTotal);
				}
			}
	    }
    }
 
});