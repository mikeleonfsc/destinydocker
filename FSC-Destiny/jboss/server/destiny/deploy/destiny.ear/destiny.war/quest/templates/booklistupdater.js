/* booklistupdater.js */
Class.create(BaseController, {
	init: function() {
		var booklist = Registry.lookup("BooklistWidgetController.Load");
		if (booklist && Object.isFunction(booklist.updateTitleCounts)) {
			booklist.updateTitleCounts(this.data.defaultBookListCount);
			booklist.updateListName(this.data.defaultBookListName);
		}
	},
	
	registerEvents: function() {
	}
});