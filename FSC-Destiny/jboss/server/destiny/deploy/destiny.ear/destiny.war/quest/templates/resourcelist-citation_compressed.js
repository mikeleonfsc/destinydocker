Class.create(BaseController,{init:function(){this.initializeCitation();this.modal.show()},registerEvents:function(){Event.observe(this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_CANCEL),"mousedown",this.closeDialog.bind(this));Event.observe(this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE),"click",this.saveCitation.bind(this))},closeDialog:function(){this.modal.closeDialog()},handleErrorMessage:function(b,a){this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).update(b);this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).show();this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE).enable();this.elementMap.get(a).activate()},initializeCitation:function(){var a=this.data;this.citationListID=a.citationListID;this.citationID=a.citationID;this.dcpiRecordGUID=a.dcpiRecordGUID;this.bibID=a.bibID;this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM).setValue(a.mediumValue);
if(a.displayedSearchType!=ResourceListCitationController_SEARCHTYPE_LIBRARY&&a.displayedSearchType!=ResourceListCitationController_SEARCHTYPE_DCPI){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ORGANIZATION).setValue(a.organizationValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_WEBSITE_TITLE).setValue(a.websiteTitleValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ACCESS_DATE).setValue(a.accessDateValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_URL).setValue(a.urlValue);var b=this.elementMap.get(ResourceListCitationController_SPAN_CITATION_EDIT_URL);if(b){b.update(a.urlValue)}this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE_WPE).setValue(a.wpeTitleValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_WPE).setValue(a.wpeDateValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM_OS).setValue(a.osMediumValue);
if(a.paidOneSearchValue){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_SERVICE_NAME_OS).setValue(a.osServiceNameValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_NAME_OS).setValue(a.osLibraryNameValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_LOCATION_OS).setValue(a.osLibraryLocationValue);this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_NAME_OF_PERIODICAL).setValue(a.nameOfPeriodicalValue)}this.elementMap.get("citationLibrary").hide()}else{if(a.isTitleFieldDisplayable){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE).setValue(a.titleValue)}if(a.isPublisherLocationDisplayable){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_PUB_LOCATION).setValue(a.publisherLocationValue)}if(a.isPublisherDisplayable){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_PUBLISHER).setValue(a.publisherValue)}if(a.isCopyrightYearDisplayable){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE).setValue(a.copyrightYearValue)
}if(a.isDateOfCompositionDisplayable){this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_OF_COMPOSITION).setValue(a.dateOfCompositionValue)}this.elementMap.get("citationWebpath").hide()}this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).update();this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).hide();if(a.isBibTypeFilm){$("citationEditFormWrapper").select(".disableForVideo").each(function(c){c.hide()})}else{$("citationEditFormWrapper").select(".disableForVideo").each(function(c){c.show()})}if(a.paidOneSearchValue){$("citationWebpath").select(".paidOS").each(function(c){c.show()});this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_GROUP+ResourceListCitationController_DIV_CITATION_GROUP_WEB_SITE).update(MessageHelper.format("resourceListCitationController_nameOfDatabase"))}else{$("citationWebpath").select(".paidOS").each(function(c){c.hide()});this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_GROUP+ResourceListCitationController_DIV_CITATION_GROUP_WEB_SITE).update(MessageHelper.format("resourceListCitationController_titleOfWebSite"))
}$("citationLoading").setStyle({visibility:"hidden"});$("citationEditFormWrapper").setStyle({visibility:"inherit"});this.elementMap.get(ResourceListCitationController_DIV_WINDOW_BUTTONS).setStyle({visibility:"inherit"})},saveCitation:function(){var c=this;var b=function(g){var f;return(f=c.elementMap.get(g))&&f.getValue()};this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE).disable();var e={lastname1:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_LAST_1),firstname1:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_FIRST_1),middlename1:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_MIDDLE_1),lastname2:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_LAST_2),firstname2:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_FIRST_2),middlename2:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_MIDDLE_2),lastname3:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_LAST_3),firstname3:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_FIRST_3),middlename3:b(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_MIDDLE_3),medium:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM).getValue(),bibID:this.bibID,citationID:this.citationID,dcpiRecordGUID:this.dcpiRecordGUID};
if(this.data.displayedSearchType!=ResourceListCitationController_SEARCHTYPE_LIBRARY&&this.data.displayedSearchType!=ResourceListCitationController_SEARCHTYPE_DCPI){Object.extend(e,{organization:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ORGANIZATION).getValue(),websiteTitle:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_WEBSITE_TITLE).getValue(),accessDate:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ACCESS_DATE).getValue(),url:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_URL).getValue(),wpeTitle:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE_WPE).getValue(),wpeDate:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_WPE).getValue(),osMedium:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM_OS).getValue()});if(this.data.paidOneSearchValue){Object.extend(e,{osServiceName:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_SERVICE_NAME_OS).getValue(),osLibraryName:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_NAME_OS).getValue(),osLibraryLocation:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_LOCATION_OS).getValue(),nameOfPeriodical:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_NAME_OF_PERIODICAL).getValue(),subscriptionRequired:true})
}}else{Object.extend(e,{title:this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE).getValue(),publisherLocation:b(ResourceListCitationController_FIELD_CITATION_EDIT_PUB_LOCATION),publisher:b(ResourceListCitationController_FIELD_CITATION_EDIT_PUBLISHER),copyrightYear:b(ResourceListCitationController_FIELD_CITATION_EDIT_DATE),dateOfComposition:b(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_OF_COMPOSITION),citationListID:this.citationListID})}var a=Registry.lookup("ResourceListController.Master");var d=DAO.load({endpoint:"ResourceListCitationController.CitationSave",container:null},Object.toJSON(e),a.getListType());if(!d){this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE).enable()}}});