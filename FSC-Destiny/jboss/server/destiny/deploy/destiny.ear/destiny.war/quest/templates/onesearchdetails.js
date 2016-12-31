/* onesearchdetails.js */
Class.create(BaseController, {
    init: function() {
		var dialog = Registry.lookup("OneSearchController.Dialog");
		dialog.notifyDataLoaded();
		
		if (this.data.hasNext) {
			this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_NEXT).show();
		}
		if (this.data.hasPrev) {
			this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_PREV).show();
		}
		if (this.data.hasResults && this.data.canAddToBooklist) {
			DAO.load({endpoint: "BooklistSelectController.OneSearchTitleDetails", container: this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});
			var select = Registry.lookup("BooklistSelectController.OneSearchTitleDetails");
			if (select) {
				select.setBooklistValue(this.data.listID);
			}
		}
    },

    registerEvents: function() {
    	if (this.data.hasResults) {
    		var dialogController = Registry.lookup("OneSearchController.Dialog");
    		var boundNext = dialogController.nextOneSearchPage.bind(dialogController);
    		var boundPrevious = dialogController.previousOneSearchPage.bind(dialogController);
    		var boundLoad = dialogController.loadOtherLink.bind(dialogController);
    		if (Object.isElement(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_NEXT))) {
    			Event.observe(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_NEXT), "mousedown", boundNext);
    		}
    		if (Object.isElement(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_PREV))) {
    			Event.observe(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_PREV), "mousedown", boundPrevious);
    		}
    		
    		for (var i=0; i < this.data.searchResultElement.otherLinksEntries.length; i++) {
    			var otherLink = this.data.searchResultElement.otherLinksEntries[i];
    			Event.observe(this.elementMap.get("otherLink" + i), "mousedown", boundLoad.curry(otherLink.linkName));
    		}
    		
    		if(this.data.canAddToBooklist) {
    			var results = this.data.searchResultElement.results;
    			for(var i=0; i < results.length; i++) {
    				Event.observe(this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DETAIL_ADD_TO_BOOKLIST_PREFIX + i), "mousedown", this.addOneSearchToBooklist.bind(this, i))
    			}
    		}
    	}
    },
    
    addOneSearchToBooklist: function(index) {
    	this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DETAIL_ADD_TO_BOOKLIST_PREFIX + index).hide();
    	this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DB_DETAIL_IN_LIST_PREFIX + index).show();
    	
    	//should we update shelf count? TF 12/11/2009

    	var lineID = index + 1;
    	var loadResult = DAO.load({endpoint:"BooklistWidgetController.BooklistOneSearchAdder", container:null}, this.data.dbRecID, lineID);
    	if(!loadResult) {
    		this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DETAIL_ADD_TO_BOOKLIST_PREFIX + index).show();
    		this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DB_DETAIL_IN_LIST_PREFIX + index).hide();    		
    	}
    },
    updateSearchResults: function (titles, urls, value, propertyToUpdate) {  
		var pagedData = this.pagedData;
		for (var i = 0; i < pagedData.length; i++) {
			var records = pagedData[i].searchResultElement.results;
			for (var j = 0; j < records.length; j++) {
				var record = records[j];
				if (titles && urls && titles.indexOf(eval("record.title")) >= 0 && urls.indexOf(eval("record.linkHref")) >= 0) {
					record[propertyToUpdate] = value;					
				}        
			}     
		}
	}
    
});