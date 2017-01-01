/* shelfbrowse-results.js */
Class.create(BaseController, {
    init: function() {
		var shelfBrowse = Registry.lookup("ShelfBrowseController.ShelfBrowseDialog");
		shelfBrowse.resetCarousel();
		shelfBrowse.addRecords(this.data);  
		shelfBrowse.renderCarousel();  
		shelfBrowse.hideLoading();
		shelfBrowse.modal.centerDialog();
    },

    registerEvents: function() {
    }
});