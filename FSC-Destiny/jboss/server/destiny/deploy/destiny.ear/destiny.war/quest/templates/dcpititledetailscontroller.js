/* dcpititledetailscontroller.js */
Class.create(BaseController, {
	
    init: function() {
		if(this.data.activeTab) {
			this.setTab(this.data.activeTab);
		} else {
			this.setTab(TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO);
		}
		//this is kinda poopy, but now by default we will always show the dialog
		if (!this.data.doNotShowDialog) {
			this.modal.show();
		}
		var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
		if (titleDetails) {
			Registry.unregister("TitleDetailsController.TitleDetails");
		}
		if (this.data.canAddToBooklist) {
			DAO.load({endpoint: "BooklistSelectController.TitleDetails", container: this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});
			var select = Registry.lookup("BooklistSelectController.TitleDetails");
			if (select) {
				select.setBooklistValue(this.data.listID);
			}
		}
    },
    
    registerEvents: function() {
    	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO));
    	
    	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS));
        if (Object.isElement(this.elementMap.get(TitleDetailsController_LINK_TITLE_DETAIL_REVIEWS))) {
        	Event.observe(this.elementMap.get(TitleDetailsController_LINK_TITLE_DETAIL_REVIEWS), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS));
        }
        
        if (Object.isElement(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_MORE))) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_MORE), "mousedown", this.titleDetailsShowMoreLessListener.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_MORE));
        }
        if (Object.isElement(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_LESS))) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_LESS), "mousedown", this.titleDetailsShowMoreLessListener.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_LESS));
        }
    	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_CLOSE), "mousedown", this.closeDialog.bind(this));
    	Event.observe(this.modal.contentDiv, "modal:close", this.onClose.bind(this));
        if(this.data.canAccessBooklist) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST), "mousedown", this.addTitleToBooklist.bind(this));
        }
        if(this.data.isOwningSite && this.data.canSubmitReviews ) {
        	if(! this.data.titleDetailValue.reviewForPatron) {
        		Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_ADD_REVIEW), "mousedown", this.openReviewDialog.bind(this));
        	}
        }

    },
    
    closeDialog: function() {
    	if(this.modal.visible) {
    		this.modal.closeDialog();
    	}
    },
    
    onClose: function() {
		DAO.load({endpoint:"TitleDetailsController.TabSaver", container:null}, this.data.activeTab);
    	if ( Registry.lookup("SearchTypeController.Selector").getSearchType() != SearchTypeController_SEARCHTYPE_DCPI) {
    		Registry.lookup("SearchBoxController.SearchBox").focusSearchBox();
    	}
    },
    
    setTab: function(tabName) {

    	this.data.activeTab = tabName;
    	var activeTab = this.elementMap.get(tabName);
    	var activeTabContent= this.elementMap.get(tabName + TitleDetailsController_DIV_TITLE_DETAIL_TAB_CONTENT);
    	var inactiveTabs = [TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO, TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS];
    	inactiveTabs = inactiveTabs.without(tabName);
    	
    	for (var i=0; i < inactiveTabs.length; i++) {
    		this.elementMap.get(inactiveTabs[i] + TitleDetailsController_DIV_TITLE_DETAIL_TAB_CONTENT).hide();
    		this.elementMap.get(inactiveTabs[i]).removeClassName("tabActive");
    	}
    	
    	activeTab.addClassName("tabActive");
    	activeTabContent.show();
    },
    
    addTitleToBooklist: function() {
    	this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST).hide();
    	this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_IN_BOOKLIST).show();
    	var searchType = SearchTypeController_SEARCHTYPE_DCPI;
    	var loadResult = DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder", container:null}, null, 
    			this.data.titleDetailValue.recordGUID, searchType, this.data.titleDetailValue.copySiteID ? this.data.titleDetailValue.copySiteID : null);
    	if(!loadResult) {
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST).show();
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_IN_BOOKLIST).hide();
    	}
    },
    updateInUsersBooklist: function(inUsersBooklist, bibID, dcpiRecordGUID) {
    	if (bibID != null && this.data.bibID == bibID) {
	    	this.data.titleDetailValue.inUsersBooklist = inUsersBooklist;
	    	this.data.keywordSearchRecord.inUsersBookList = inUsersBooklist;
    	} else if (dcpiRecordGUID != null && this.data.dcpiRecordGUID == dcpiRecordGUID) {
    		this.data.inUsersBooklist = inUsersBooklist;
    	}
    	if (inUsersBooklist) {
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST).hide();
        	this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_IN_BOOKLIST).show();
    	} else {
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST).show();
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_IN_BOOKLIST).hide();
    	}
    },
    
    openReviewDialog: function() {
    	var params = {
				width:"400px",
				id:ReviewController_DIV_ADD_REVIEW_DIALOG,
				zIndex:"50000",
				hideOnOutsideClick:"true"
		};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ReviewController.ReviewDialog", modal: modalDialog});
    },
    
	titleDetailsShowMoreLessListener: function(mode) {
    	if (mode == TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_MORE) {
	        this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_DATA).show();
	        this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_LESS).show();
	        this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_MORE).hide();
	    } else if (mode == TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_LESS) {
	        this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_DATA).hide();
	        this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_LESS).hide();
	        this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_REVIEWS_WITHOUT_COMMENTS_SHOW_MORE).show();
	    }
	},

	updateStatuses: function(data) {
		this.elementMap.get("tdvAvailability").update(data.availabilityText);
		this.elementMap.get("localCopies").update(data.titleDetailValue.localAvailability);
		this.elementMap.get("offsiteCopies").update(data.titleDetailValue.offsiteAvailability);
		this.elementMap.get("imageAvailabilityDiv").update(data.availabilityImageDiv);
		
		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_CONTROLS).removeClassName("statusIn");
		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_CONTROLS).removeClassName("statusOut");
		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_CONTROLS).removeClassName("statusAsk");
		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_CONTROLS).addClassName(data.classAvailability);
		
	},
	updateReviews: function(reviewsJSON, reviewForPatronJSON) {
    	this.data.titleDetailValue.reviewInfo = reviewsJSON;
    	this.data.titleDetailValue.reviewForPatron = reviewForPatronJSON;
    	this.refreshPage();
    },
    getTitle: function() {
    	return this.data.titleDetailValue.title;
    },
//    getMiniBibTypeIconURL: function() {
//    	return this.data.keywordSearchRecord.miniBibTypeIconURL;
//    },
//    getBibTypeDescription: function() {
//    	return this.data.keywordSearchRecord.bibTypeDescription;
//    },
    getDCPIRecordGUID: function() {
    	return this.data.dcpiRecordGUID;
    }
	
});