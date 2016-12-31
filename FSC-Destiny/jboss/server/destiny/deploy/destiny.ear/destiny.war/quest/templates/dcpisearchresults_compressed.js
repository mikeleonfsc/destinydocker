Class.create(BaseController,{init:function(){var b=this.data.records;this.recordControllers=[];var d=Registry.lookup("DCPISearchController.SearchMaster");d.hideSearchResults();if(Object.isArray(this.data.errors)&&this.data.errors.length>0){d.hideHeader();d.removeSearchResultsStyleOnError();d.hideLoadingGraphic();d.showSearchResults()}else{this.resultsLoadedChecker=this.checkResultsLoaded.bind(this);this.resultsLoadedChecker.delay(0.25);if(this.data.showNextButton&&!this.hasNextPage()){var c=d.fetchPage.bind(d,this.data.pageNumber+1);c.defer()}}var a=Registry.lookup("LimiterController.History");a.getNarrowingHistory();d.setNextButtonVisible(this.data.showNextButton);d.setPreviousButtonVisible(this.data.showPreviousButton);d.setPageIndex(this.data.pageIndex);d.hideLoadingGraphic();d.setSelectedProviders(this.data.limiters.limiterData[0][0].providers);if(this.data.limiters&&Object.isArray(this.data.limiters.limiterMenu)){Registry.createController("LimiterController.Limiters",this.data.limiterTemplateURL,this.data.limiterControllerURL,{endpoint:"LimiterController.Limiters",container:$(LimiterController_DIV_LIMITER_OUTER)},this.data.limiters)
}},registerEvents:function(){if(this.data.errors&&this.data.errors.length==0){var b=this.data.records;if(Object.isArray(b)){for(var c=0;c<b.length;c++){var a=null;var d=null;if(b[c].recType==DCPISearchController_DCPI_REC_TYPE_DCPI){d=b[c].recData.dcpiRecordGUID}else{a=b[c].recData.bibID}if(Object.isElement(this.elementMap.get(DCPISearchController_BUTTON_ADD_TO_LIST+c))){Event.observe(this.elementMap.get(DCPISearchController_BUTTON_ADD_TO_LIST+c),"mousedown",this.addToList.bind(this,c,a,d))}if(Object.isElement(this.elementMap.get(DCPISearchController_BUTTON_TITLE_DETAILS+c))){if(b[c].recType==DCPISearchController_DCPI_REC_TYPE_LOCAL){Event.observe(this.elementMap.get(DCPISearchController_BUTTON_TITLE_DETAILS+c),"mousedown",this.showTitleDetails.bind(this,a))}else{if(b[c].recType==DCPISearchController_DCPI_REC_TYPE_DCPI){Event.observe(this.elementMap.get(DCPISearchController_BUTTON_TITLE_DETAILS+c),"mousedown",this.showTitleDetailsDCPI.bind(this,d))}}}}}}},checkResultsLoaded:function(){var a=true;
for(var c=0;(c<this.recordControllers.length)&&a;c++){a==a&&this.recordControllers[c].isLoaded()}if(a){var b=Registry.lookup("DCPISearchController.SearchMaster");b.showHeader();b.addSearchResultsStyleNoError();b.showSearchResults();b.hideLoadingGraphic();b.setPageIndex(this.data.pageIndex);b.setNextButtonVisible(this.data.showNextButton);b.setPreviousButtonVisible(this.data.showPreviousButton)}else{this.resultsLoadedChecker.delay(250)}},addToList:function(c,a,d){this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST+c).hide();this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST+c).show();var b=DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder",container:null},a,d,SearchTypeController_SEARCHTYPE_DCPI,null);if(!b){this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST+c).show();this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST+c).hide()}},showTitleDetails:function(a){var b=Registry.lookup("TitleDetailsController.Master");b.loadTitleDetails(a)
},showTitleDetailsDCPI:function(a){var b=Registry.lookup("TitleDetailsController.Master");b.loadTitleDetails(a,null,null,true)},dataAppended:function(a){var b=Registry.lookup("DCPISearchController.SearchMaster");b.notifyPageDataUpdated(a)},updateSearchResults:function(a,e,d){var b=this.data.records;if(Object.isArray(b)){for(var c=0;c<b.length;c++){var f=false;if(e&&b[c].recType==DCPISearchController_DCPI_REC_TYPE_DCPI&&e.indexOf(b[c].recData.dcpiRecordGUID)>=0){b[c].recData.inUsersBookList=d;f=true}if(a&&b[c].recType==DCPISearchController_DCPI_REC_TYPE_LOCAL&&a.indexOf(b[c].recData.bibID)>=0){b[c].recData.inUsersBookList=d;f=true}if(f){if(d){this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST+c).hide();this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST+c).show()}else{this.elementMap.get(DCPISearchController_DIV_ADD_TO_BOOKLIST+c).show();this.elementMap.get(DCPISearchController_DIV_RESULT_IN_BOOKLIST+c).hide()}}}}}});