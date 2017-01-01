/* booklistwidget.js */
Class.create(BaseController, {
	init: function() {
		this.elementMap.get(BooklistWidgetController_DIV_BOOK_LIST).show();
		var select = Registry.lookup("BooklistSelectController.Widget");
		if (select) {
			select.setBooklistValue(this.data.stickyListID);
		}
	},
	
	registerEvents: function() {
		Event.observe(this.elementMap.get(BooklistWidgetController_DIV_BOOK_LIST), "mousedown", this.showResourceList.bind(this));
		this.addDroppable(BooklistWidgetController_DIV_BOOK_LIST, null, this.addToBookList.bind(this), {top: "66px", left: "21px"});
	},
	
	showResourceList: function() {
    	var params = {
    			width:"",
    			id:ResourceListController_DIV_RESOURCE_LIST_WINDOW,
    			zIndex:"10000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, null, "ResourceList", false);
	},
	
	addToBookList: function(bibID, dcpiRecordGUID) {
		var stController = Registry.lookup("SearchTypeController.Selector");
		DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder", container:null}, bibID ? bibID : null, dcpiRecordGUID ? dcpiRecordGUID : null, stController.getSearchType(), null);
	},

    updateTitleCounts: function(titleCount) {
    	this.elementMap.get(BooklistWidgetController_DIV_RESOURCE_LIST_TITLE_COUNT).update(MessageHelper.format("booklistWidgetController_titles", titleCount));
    },
    
	updateListName: function(listName) {
    	this.elementMap.get(BooklistWidgetController_RESOURCE_LIST_NAME).update(listName);
    }

});