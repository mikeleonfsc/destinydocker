Class.create(BaseController,{init:function(){this.searchType=this.data.initialSearchType;this.container.hide();if(this.data.canDoDCPI){this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_DCPI).addClassName("last")}else{if(this.data.canDoOneSearch){this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_ONESEARCH).addClassName("last")}else{if(this.data.canDoWPE){this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_WPE).addClassName("last")}else{this.elementMap.get(SearchTypeController_LI_SEARCH_TYPE_LIBRARY).addClassName("last")}}}},registerEvents:function(){var b=this.resetHighlight.bind(this);var a=this.setSearchType.bind(this);Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY),"mouseout",b);Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY),"mousedown",a.curry(SearchTypeController_SEARCHTYPE_LIBRARY));if(this.data.canDoDCPI){Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI),"mouseout",b);Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI),"mousedown",a.curry(SearchTypeController_SEARCHTYPE_DCPI))
}if(this.data.canDoWPE){Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE),"mouseout",b);Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE),"mousedown",a.curry(SearchTypeController_SEARCHTYPE_WPE))}if(this.data.canDoOneSearch){Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH),"mouseout",b);Event.observe(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH),"mousedown",a.curry(SearchTypeController_SEARCHTYPE_ONESEARCH))}},getSearchType:function(){return this.searchType},updateInternalSearchType:function(a){this.highlightSearchType(a);this.searchType=a},hideWPE:function(){if(Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE))){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).hide()}},showWPE:function(){if(Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE))){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).show()}},hideOneSearch:function(){if(Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH))){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).hide()
}},showOneSearch:function(){if(Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH))){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).show()}},hideDigitalResources:function(){if(Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI))){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).hide()}},showDigitalResources:function(){if(Object.isElement(this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI))){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).show()}},setSearchType:function(g){this.highlightSearchType(g);if(this.searchType!=g){window.ajaxTracker.abortAllRequests();this.searchType=g;var f=false;var b=null;var e=Registry.lookup("SearchBoxController.SearchBox");var a=Registry.lookup("SaveAdvancedSearch");var d="";if(a){if(this.getSearchType()==SearchTypeController_SEARCHTYPE_LIBRARY||this.getSearchType()==SearchTypeController_SEARCHTYPE_DCPI){d=a.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_SEARCH).unescapeHTML()
}else{d=a.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_SERVICES).unescapeHTML()}if(a.canSearchWithOnlyTheseLimiters()&&d.length==0){f=true}b=a.getLimiterJSON()}else{d=this.getSearchText();this.setSavedSearchText(d)}e.setSearchBoxText(d);e.submitSearch(false,f,b);var c=Registry.lookup("BooklistWidgetController.Load");if(c){DAO.load({endpoint:"BooklistWidgetController.Updater",container:null},g,null)}}},setSavedSearchText:function(a){this.savedSearchText=a},getSearchText:function(){var b=this.savedSearchText;var c=Registry.lookup("SearchBoxController.SearchBox");var a=c.getSearchBoxText();if(!a.strip().empty()){b=a}return b},resetHighlight:function(){this.highlightSearchType(this.searchType)},highlightSearchType:function(a){switch(a){default:case SearchTypeController_SEARCHTYPE_LIBRARY:this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("inactiveButton");
if(this.data.canDoDCPI){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("inactiveButton")}if(this.data.canDoWPE){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("inactiveButton")}if(this.data.canDoOneSearch){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("inactiveButton")}break;case SearchTypeController_SEARCHTYPE_DCPI:this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("inactiveButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("inactiveButton");
if(this.data.canDoWPE){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("inactiveButton")}if(this.data.canDoOneSearch){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("inactiveButton")}break;case SearchTypeController_SEARCHTYPE_WPE:this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("inactiveButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("inactiveButton");if(this.data.canDoDCPI){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("inactiveButton")
}if(this.data.canDoOneSearch){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("inactiveButton")}break;case SearchTypeController_SEARCHTYPE_ONESEARCH:this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).addClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_ONESEARCH).removeClassName("inactiveButton");if(this.data.canDoDCPI){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_DCPI).addClassName("inactiveButton")}if(this.data.canDoWPE){this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).removeClassName("activeButton");this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_WPE).addClassName("inactiveButton")}this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).removeClassName("activeButton");
this.elementMap.get(SearchTypeController_IMG_SEARCH_TYPE_LIBRARY).addClassName("inactiveButton");break}}});