Class.create(BaseController,{init:function(){var b=Registry.lookup("OneSearchController.Dialog");b.notifyDataLoaded();if(this.data.hasNext){this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_NEXT).show()}if(this.data.hasPrev){this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_PREV).show()}if(this.data.hasResults&&this.data.canAddToBooklist){DAO.load({endpoint:"BooklistSelectController.OneSearchTitleDetails",container:this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});var a=Registry.lookup("BooklistSelectController.OneSearchTitleDetails");if(a){a.setBooklistValue(this.data.listID)}}},registerEvents:function(){if(this.data.hasResults){var g=Registry.lookup("OneSearchController.Dialog");var a=g.nextOneSearchPage.bind(g);var f=g.previousOneSearchPage.bind(g);var b=g.loadOtherLink.bind(g);if(Object.isElement(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_NEXT))){Event.observe(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_NEXT),"mousedown",a)
}if(Object.isElement(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_PREV))){Event.observe(this.elementMap.get(OneSearchController_ANCHOR_ONESEARCH_DBDETAIL_PREV),"mousedown",f)}for(var e=0;e<this.data.searchResultElement.otherLinksEntries.length;e++){var d=this.data.searchResultElement.otherLinksEntries[e];Event.observe(this.elementMap.get("otherLink"+e),"mousedown",b.curry(d.linkName))}if(this.data.canAddToBooklist){var c=this.data.searchResultElement.results;for(var e=0;e<c.length;e++){Event.observe(this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DETAIL_ADD_TO_BOOKLIST_PREFIX+e),"mousedown",this.addOneSearchToBooklist.bind(this,e))}}}},addOneSearchToBooklist:function(b){this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DETAIL_ADD_TO_BOOKLIST_PREFIX+b).hide();this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DB_DETAIL_IN_LIST_PREFIX+b).show();var c=b+1;var a=DAO.load({endpoint:"BooklistWidgetController.BooklistOneSearchAdder",container:null},this.data.dbRecID,c);
if(!a){this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DETAIL_ADD_TO_BOOKLIST_PREFIX+b).show();this.elementMap.get(OneSearchController_BUTTON_ONE_SEARCH_DB_DETAIL_IN_LIST_PREFIX+b).hide()}},updateSearchResults:function(titles,urls,value,propertyToUpdate){var pagedData=this.pagedData;for(var i=0;i<pagedData.length;i++){var records=pagedData[i].searchResultElement.results;for(var j=0;j<records.length;j++){var record=records[j];if(titles&&urls&&titles.indexOf(eval("record.title"))>=0&&urls.indexOf(eval("record.linkHref"))>=0){record[propertyToUpdate]=value}}}}});