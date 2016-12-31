/* resourcelist-print.js */
Class.create(BaseController, {
    init: function() {
		this.resourceListMaster = Registry.lookup("ResourceListController.Master");
		this.searchType = this.resourceListMaster.getListType();
		var stickyReportTitle = this.resourceListMaster.getStickyPrintOptionName();
		if (stickyReportTitle) {
			this.setReportTitle(stickyReportTitle);
		}
		this.modal.show();

		var div = this.elementMap.get(ResourceListPrintController_DIV_RESOURCE_LIST_PRINT_GENERAL);				
		
		var ejs = null;
		if (this.searchType == ResourceListController_RESOURCE_LIST_TYPE_LIBRARY) {
			ejs = new EJS ({url: this.data.libraryTemplateURL});            
		} else if (this.searchType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
			ejs = new EJS ({url: this.data.dcpiTemplateURL});
		} else {
			ejs = new EJS ({url: this.data.onlineTemplateURL});
		}
		if (ejs) {
			var html = ejs.render(this.data);            		
			div.update(html);
			this.refreshElements();
		}
	},
    
    registerEvents: function() {
		Event.observe(this.modal.contentDiv, "modal:close", this.saveStickyPrintOptionName.bind(this));
		Event.observe(this.elementMap.get(ResourceListPrintController_BUTTON_PRINT_OPTIONS_CLOSE), "mousedown", this.closeDialog.bind(this));
		
		Event.observe(this.elementMap.get(ResourceListPrintController_BUTTON_RESOURCE_LIST_PRINT_CANCEL), "mousedown", this.closeDialog.bind(this));
		Event.observe(this.elementMap.get(ResourceListPrintController_BUTTON_RESOURCE_LIST_PRINT_OK), "click", this.doPrint.bind(this));
		Event.observe(this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_CITATION), "click", this.enableGeneralControls.bind(this, ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_CITATION));

		var generalRadio = this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL);
		if (Object.isElement(generalRadio)) {
			Event.observe(this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL), "click", this.enableGeneralControls.bind(this, ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL));
			this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL).checked = true;
			this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_CITATION).checked = false;
			this.enableGeneralControls(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL);    	    	
		}
		
    },
    
    saveStickyPrintOptionName: function() {
    	this.resourceListMaster.setStickyPrintOptionName(this.getReportTitle());
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },
    
    enableGeneralControls:  function (selectedRadio) {
        if (this.searchType == ResourceListController_RESOURCE_LIST_TYPE_LIBRARY) {
            if (selectedRadio == ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL) {
                this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_CITATION).checked = false;
                this.elementMap.get(ResourceListPrintController_SELECT_RESOURCE_LIST_PRINT_GENERAL_SORT_BY).enable();
                this.elementMap.get(ResourceListPrintController_INPUT_RESOURCE_LIST_PRINT_GENERAL_SHOW_NOTES).enable();
            } else {
                this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL).checked = false;
                this.elementMap.get(ResourceListPrintController_SELECT_RESOURCE_LIST_PRINT_GENERAL_SORT_BY).disable();
                this.elementMap.get(ResourceListPrintController_INPUT_RESOURCE_LIST_PRINT_GENERAL_SHOW_NOTES).disable();
            }
        } else {
            if (selectedRadio == ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL) {
                this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_CITATION).checked = false;
            } else {
                this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_GENERAL).checked = false;
            }
        }
    },   
    
    getReportTitle: function() {
    	return this.elementMap.get(ResourceListPrintController_FIELD_RESOURCE_LIST_PRINT_TITLE).getValue();
    },

    setReportTitle: function(title) {
    	this.elementMap.get(ResourceListPrintController_FIELD_RESOURCE_LIST_PRINT_TITLE).setValue(title);
    },
    
    doPrint: function (event) {
    	var reportTitle = Utility.destinyEscape(this.getReportTitle());
    	var sortOrder = ResourceListPrintController_OPTION_BIBREPORT_SORTBY_TITLEAUTHOR;
     	    
    	var listID = this.resourceListMaster.getListID();
    	if (this.elementMap.get(ResourceListPrintController_OPTION_RESOURCE_LIST_PRINT_CITATION).checked) {
    		if( this.searchType ==  ResourceListPrintController_LIBRARY) {
    			window.open("/cataloging/servlet/presentcitationreportform.do;jsessionid="+ this.data.sessionID +"?listID=" + listID + "&reportTitle=" + reportTitle + "&collectionType="+ResourceListPrintController_COLLECTION_LIBRARY, "resourceList");
    		} else if (this.searchType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
    			window.open("/cataloging/servlet/presentcitationreportform.do;jsessionid="+ this.data.sessionID
    					+"?listID=" + listID 
    					+"&reportTitle=" + reportTitle 
    					+"&collectionType="+ResourceListPrintController_COLLECTION_LIBRARY
    					+"&citationType="+ResourceListPrintController_CITATION_TYPE_DCPI,
					"resourceList");
    		} else {
    			window.open("/cataloging/servlet/presentwebsitecitationreportform.do;jsessionid="+ this.data.sessionID +"?listID=" + listID + "&vopac=true&reportTitle=" + reportTitle, "resourceList");
    		}
    	} else if( this.searchType ==  ResourceListController_RESOURCE_LIST_TYPE_LIBRARY ) {
    		sortOrder = $F(ResourceListPrintController_SELECT_RESOURCE_LIST_PRINT_GENERAL_SORT_BY);
    		var showNotes = $F(ResourceListPrintController_INPUT_RESOURCE_LIST_PRINT_GENERAL_SHOW_NOTES );
    		var showNotesAttribute = "";
    		if (showNotes) {
    			showNotesAttribute = "&showNotes=true";
    		} 
    		window.open("/cataloging/servlet/presentbibreportform.do;jsessionid="+ this.data.sessionID+ "?reportTitle=" + reportTitle + "&sort=" + sortOrder + "&listID=" + listID + "&collectionType="+ResourceListPrintController_COLLECTION_LIBRARY + showNotesAttribute, "resourceList");
    	} else {
    		var collectionType = (this.searchType == ResourceListController_RESOURCE_LIST_TYPE_ONE_SEARCH) ? ResourceListPrintController_COLLECTION_ONE_SEARCH : ResourceListPrintController_COLLECTION_WPE;
    		var digitalContentMode = ResourceListController_DIGITAL_CONTENT_MODE_EXCLUDE;
    		if (this.searchType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
    			collectionType = ResourceListPrintController_LIBRARY;
    			digitalContentMode = ResourceListController_DIGITAL_CONTENT_MODE_ONLY;
    		}
			window.open("/cataloging/servlet/presentbooklistform.do;jsessionid=" + this.data.sessionID + "?reportTitle=" + reportTitle + "&sort=" + sortOrder + "&vopac=true&listID=" + listID + "&collectionType="+ collectionType + "&digitalContentMode=" + digitalContentMode + "&printerFriendly=true&page=-1", "resourceList");
    	}
    	this.closeDialog();
    }
});