/* titledetailsebookpreview.js */
Class.create(BaseController, {
    init: function() {
		if(this.data.url) {
			this.elementMap.get(TitleDetailsController_DIV_PREVIEW_EBOOK_PASSWORD_INNER).hide();
			this.launchPreview(this.data.url);
			var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
			titleDetails.showPreviewEBookButton();
			this.closeDialog();
		} else {
			this.modal.show();
            this.focusPassword();
		}
	
    },

    registerEvents: function() {
    	if(!this.data.url) {
    		Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_PREVIEW_EBOOK_PASSWORD_SAVE), "click", this.previewEBook.bind(this));
    		Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_PREVIEW_EBOOK_PASSWORD_CLOSE), "mousedown", this.closeDialog.bind(this));
    	}
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },

    previewEBook: function() {
    	this.elementMap.get(TitleDetailsController_BUTTON_PREVIEW_EBOOK_PASSWORD_SAVE).disabled = true;
    	var password = this.elementMap.get(TitleDetailsController_FIELD_PREVIEW_EBOOK_PASSWORD).getValue();
        var loadResult = DAO.load({endpoint: "TitleDetailsController.PreviewEBookPasswordSaver"}, password, this.data.bibID);
        if(!loadResult) {
        	this.elementMap.get(TitleDetailsController_BUTTON_PREVIEW_EBOOK_PASSWORD_SAVE).disabled = false;
        }
    },

	showPreviewEBookPasswordErrors: function (error) {
    	this.elementMap.get(TitleDetailsController_DIV_PREVIEW_EBOOK_PASSWORD_ERRORS).update(error);
    	this.elementMap.get(TitleDetailsController_DIV_PREVIEW_EBOOK_PASSWORD_ERRORS).show();
    	this.elementMap.get(TitleDetailsController_BUTTON_PREVIEW_EBOOK_PASSWORD_SAVE).disabled = false;
    	this.elementMap.get(TitleDetailsController_BUTTON_PREVIEW_EBOOK_PASSWORD_SAVE).blur();
    	this.focusPassword();
    },

    launchPreview: function (url) {
	    window.open(url, 'previewEbook');
	},
	
    focusPassword: function () {
	    this.elementMap.get(TitleDetailsController_FIELD_PREVIEW_EBOOK_PASSWORD).activate();
	}

});