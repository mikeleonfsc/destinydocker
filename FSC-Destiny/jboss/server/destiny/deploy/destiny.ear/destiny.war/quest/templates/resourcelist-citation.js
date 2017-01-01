/* resourcelist-citation.js */
Class.create(BaseController, {
    init: function() {
		this.initializeCitation();
		this.modal.show();
    },
    
    registerEvents: function() {
    	Event.observe(this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_CANCEL), "mousedown", this.closeDialog.bind(this));
    	Event.observe(this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE), "click", this.saveCitation.bind(this));
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },
    
    handleErrorMessage: function(msg, focusField) {
    	this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).update(msg);
    	this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).show();
    	this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE).enable();
    	this.elementMap.get(focusField).activate();
    },
    
    initializeCitation: function () {
    	var json = this.data;
        this.citationListID = json.citationListID;
        this.citationID = json.citationID;
        this.dcpiRecordGUID = json.dcpiRecordGUID;
        this.bibID = json.bibID;

        this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM).setValue(json.mediumValue);

        if (json.displayedSearchType != ResourceListCitationController_SEARCHTYPE_LIBRARY && json.displayedSearchType != ResourceListCitationController_SEARCHTYPE_DCPI ) {
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ORGANIZATION).setValue(json.organizationValue);
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_WEBSITE_TITLE).setValue(json.websiteTitleValue);
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ACCESS_DATE).setValue(json.accessDateValue);
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_URL).setValue(json.urlValue);
            var urlSpan = this.elementMap.get(ResourceListCitationController_SPAN_CITATION_EDIT_URL);
            if (urlSpan) {
                urlSpan.update(json.urlValue);
            }
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE_WPE).setValue(json.wpeTitleValue);
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_WPE).setValue(json.wpeDateValue);
            this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM_OS).setValue(json.osMediumValue);
            if (json.paidOneSearchValue) {
                this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_SERVICE_NAME_OS).setValue(json.osServiceNameValue);
                this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_NAME_OS).setValue(json.osLibraryNameValue);
                this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_LOCATION_OS).setValue(json.osLibraryLocationValue);
                this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_NAME_OF_PERIODICAL).setValue(json.nameOfPeriodicalValue);
            }
            this.elementMap.get("citationLibrary").hide();
        } else {
        	if(json.isTitleFieldDisplayable){
        		this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE).setValue(json.titleValue);
        	}
        	if(json.isPublisherLocationDisplayable){
        		this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_PUB_LOCATION).setValue(json.publisherLocationValue);
        	}
        	if(json.isPublisherDisplayable){
        		this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_PUBLISHER).setValue(json.publisherValue);
        	}
        	if(json.isCopyrightYearDisplayable){
        		this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE).setValue(json.copyrightYearValue);
        	}
        	if(json.isDateOfCompositionDisplayable){
        		this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_OF_COMPOSITION).setValue(json.dateOfCompositionValue);
        	}
            this.elementMap.get("citationWebpath").hide();
        }
         
        this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).update();
        this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_ERRORS).hide();
        
        if (json.isBibTypeFilm) {
            $("citationEditFormWrapper").select(".disableForVideo").each(function (tr) {tr.hide()});
        } else {
            $("citationEditFormWrapper").select(".disableForVideo").each(function (tr) {tr.show()});
        }
        
        if (json.paidOneSearchValue) {
            $("citationWebpath").select(".paidOS").each(function (tr) {tr.show()});
            this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_GROUP + ResourceListCitationController_DIV_CITATION_GROUP_WEB_SITE).update(MessageHelper.format("resourceListCitationController_nameOfDatabase"));
        } else {
            $("citationWebpath").select(".paidOS").each(function (tr) {tr.hide()});
            this.elementMap.get(ResourceListCitationController_DIV_CITATION_EDIT_GROUP + ResourceListCitationController_DIV_CITATION_GROUP_WEB_SITE).update(MessageHelper.format("resourceListCitationController_titleOfWebSite"));
        }

        $("citationLoading").setStyle({"visibility": "hidden"});
        $("citationEditFormWrapper").setStyle({"visibility": "inherit"});
        this.elementMap.get(ResourceListCitationController_DIV_WINDOW_BUTTONS).setStyle({"visibility": "inherit"});  
    },
    
    saveCitation: function() {
      var self = this;
      /* Helper to return this.elementMap.get(obj).getValue() IF obj (ui element) exists, otherwise undefined. */
      var getValue = function(obj){
        var tmp;
        return (tmp = self.elementMap.get(obj)) && tmp.getValue();
      };

      this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE).disable();
    	var citation = {
    		lastname1   	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_LAST_1),
    		firstname1  	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_FIRST_1),
    		middlename1 	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_MIDDLE_1),
    		lastname2   	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_LAST_2),
    		firstname2  	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_FIRST_2),
    		middlename2 	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_MIDDLE_2),
    		lastname3   	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_LAST_3),
    		firstname3  	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_FIRST_3),
    		middlename3 	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_AUTHOR_MIDDLE_3),
    		medium			: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM).getValue(),
    		bibID			: this.bibID,
    		citationID		: this.citationID,
    		dcpiRecordGUID: this.dcpiRecordGUID
    	};
    	
		if (this.data.displayedSearchType != ResourceListCitationController_SEARCHTYPE_LIBRARY && this.data.displayedSearchType != ResourceListCitationController_SEARCHTYPE_DCPI) {
			Object.extend(citation, {
				organization 	: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ORGANIZATION).getValue(),
				websiteTitle 	: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_WEBSITE_TITLE).getValue(),
				accessDate   	: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_ACCESS_DATE).getValue(),
				url				: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_URL).getValue(),    				
				wpeTitle		: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE_WPE).getValue(),
				wpeDate			: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_WPE).getValue(),
				osMedium		: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_MEDIUM_OS).getValue()
			}); 
            if (this.data.paidOneSearchValue) {
            	Object.extend(citation, {
                    osServiceName		: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_SERVICE_NAME_OS).getValue(),
                    osLibraryName		: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_NAME_OS).getValue(),
                    osLibraryLocation 	: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_LIBRARY_LOCATION_OS).getValue(),
                    nameOfPeriodical	: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_NAME_OF_PERIODICAL).getValue(),
                    subscriptionRequired: true
            	});
            }
        } else {
        	Object.extend(citation, {
                title				: this.elementMap.get(ResourceListCitationController_FIELD_CITATION_EDIT_TITLE).getValue(),
                publisherLocation	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_PUB_LOCATION),
                publisher			: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_PUBLISHER),
                copyrightYear		: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_DATE),
                dateOfComposition	: getValue(ResourceListCitationController_FIELD_CITATION_EDIT_DATE_OF_COMPOSITION),
                citationListID		: this.citationListID
        	});
        }
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
    	var loadResult = DAO.load({endpoint:"ResourceListCitationController.CitationSave", container:null}, Object.toJSON(citation), resourceListMaster.getListType());
    	if(!loadResult) {
    		this.elementMap.get(ResourceListCitationController_BUTTON_CITATION_EDIT_SAVE).enable();
    	}
    }    
});
