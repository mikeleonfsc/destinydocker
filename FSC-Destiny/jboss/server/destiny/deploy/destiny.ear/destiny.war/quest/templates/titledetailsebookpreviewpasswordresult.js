/* titledetailsebookpreviewpasswordresult.js */
Class.create(BaseController, {
    init: function() {
		var previewPassword = Registry.lookup("TitleDetailsController.PreviewEBookPasswordChecker");
		if(this.data.url) {
			previewPassword.launchPreview(this.data.url);
			var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
			titleDetails.showPreviewEBookButton();
            previewPassword.closeDialog();
		} else if(this.data.error) {
			previewPassword.showPreviewEBookPasswordErrors(this.data.error);
		}
    },

    registerEvents: function() {
    }
});