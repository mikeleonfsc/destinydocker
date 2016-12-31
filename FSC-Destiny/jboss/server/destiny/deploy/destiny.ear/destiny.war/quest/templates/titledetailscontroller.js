/* titledetailscontroller.js */
Class.create(BaseController, {
    init: function() {
    	if(this.data.activeTab) {
    		if (this.data.activeTab == TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS && (this.data.titleDetailValue.shelfBib || this.data.titleDetailValue.temporary)) {
    			this.setTab(TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO);
    		} else {
    			this.setTab(this.data.activeTab);
    		}
		} else {
			this.setTab(TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO);
		}
		//this is kinda poopy, but now by default we will always show the dialog
		if (!this.data.doNotShowDialog) {
			this.modal.show();
		}
		
		if (this.data.bacoEnabled) {
			this.loadSuggestions();
        }
		this.shelfSelect = new ShelfSelect({id: "titleDetailsActionButtons", shelfNumber: this.data.shelfNumber});
		
		var titleDetails = Registry.lookup("TitleDetailsController.DCPITitleDetails");
		if (titleDetails) {
			Registry.unregister("TitleDetailsController.DCPITitleDetails");
		}
		if (this.data.canAccessBooklist) {
			DAO.load({endpoint: "BooklistSelectController.TitleDetails", container: this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});
			var select = Registry.lookup("BooklistSelectController.TitleDetails");
			if (select) {
				select.setBooklistValue(this.data.listID);
			}
		}
    },
    
    registerEvents: function() {
    	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO));
        
        if( this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_TAB_QUIZINFO) != null) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_TAB_QUIZINFO), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_QUIZINFO));
        }
        
        Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_TAB_AWARDS), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_AWARDS));
        if (! this.data.titleDetailValue.shelfBib && ! this.data.titleDetailValue.temporary) {
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
        }
        
        Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_CLOSE), "click", this.closeDialog.bind(this)); // needs to be a click instead of mousedown, otherwise the focus text box won't work
        if (this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_COVER_CAPTION)) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_COVER_CAPTION), "mousedown", this.openShelfBrowse.bind(this));
        }
        if (this.data.canSeeRecommendationButton) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_RECOMMENDATION), "mousedown", this.openRecommendations.bind(this));
        }

        if(!this.data.titleDetailValue.shelfBib && ! this.data.titleDetailValue.temporary && this.data.bibAssociated && this.data.canSubmitReviews ) {
        	if(! this.data.titleDetailValue.reviewForPatron) {
        		Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_ADD_REVIEW), "mousedown", this.openReviewDialog.bind(this));
        	}
        }
        
        if(this.data.canAddToWishList) {
        	Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_ADD_TO_WISHLIST_BUTTON), "mousedown", this.openWishDialog.bind(this));
        }
        
        if(this.data.titleDetailValue.canPlaceHold) {
        	if (this.data.titleDetailValue.canHoldMultipleCopies) {
        		Event.observe(this.elementMap.get(TitleDetailsController_SPAN_HOLD_IT_BUTTON), "mousedown", this.openHoldDialog.bind(this));
        	} else {
        		Event.observe(this.elementMap.get(TitleDetailsController_SPAN_HOLD_IT_BUTTON), "mousedown", this.titleDetailsHoldItListener.bind(this));
        	}
        }
        
        if(this.data.titleDetailValue.ebookCheckoutState == TitleDetailsController_EBOOK_CHECKOUT_STATE_BLOCKS_EXIST || 
          	  this.data.titleDetailValue.ebookCheckoutState == TitleDetailsController_EBOOK_CHECKOUT_STATE_AVAILABLE) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_EBOOK_CHECKOUT), "mousedown", this.titleDetailsCheckoutEbook.bind(this));
        }
        
        
        if(this.data.titleDetailValue.follettEBook) {
        	if(this.data.canPreviewEbooks && this.data.titleDetailValue.ebookReadOnlineState == TitleDetailsController_EBOOK_READ_ONLINE_STATE_AVAILABLE) {
        		Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_PREVIEW_EBOOK), "mousedown", this.titleDetailsPreviewEbook.bind(this));
        	}
        }
        if((this.data.titleDetailValue.shelfBib || this.data.titleDetailValue.resoldShelfBib) && this.data.follettEBookTitleDetailsURL) {
    		Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_READ_IT), "mousedown", this.titleDetailsReadFollettEbook.bind(this));
        }
        if(this.data.showReadItNonFollettEbook) {
        	Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_READ_IT_NON_FOLLETT), "mousedown", this.titleDetailsReadNonFollettEbook.bind(this));
        }
        
        if(this.data.canAccessBooklist) {
        	Event.observe(this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST), "mousedown", this.addTitleToBooklist.bind(this));
        }
        
        for (var i = 0; i < this.data.titleDetailValue.quizInfo.readingCounts.length; i++) {
        	Event.observe(this.elementMap.get(TitleDetailsController_LINK_TITLE_DETAIL_QUIZ_RC + i), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_QUIZINFO));
        }
        for (var i = 0; i < this.data.titleDetailValue.quizInfo.acceleratedReader.length; i++) {
        	Event.observe(this.elementMap.get(TitleDetailsController_LINK_TITLE_DETAIL_QUIZ_AR + i), "mousedown", this.setTab.bind(this, TitleDetailsController_DIV_TITLE_DETAIL_TAB_QUIZINFO));
        }

        Event.observe(this.modal.contentDiv, "modal:close", this.onClose.bind(this));
    },
    
    loadSuggestions: function() {
    	var loader = function() {
    		return DAO.load({endpoint: "TitleDetailsController.Suggestions", container: this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_SUGGESTIONS_CONTENT)}, this.data.bibID);
    	};
    	var boundLoader = loader.bind(this);
    	if (! boundLoader()) {
    		var retry = this.loadSuggestions.bind(this);
    		retry.delay(0.5);
    	}
    },
    
    closeDialog: function() {
    	if(this.modal.visible) {
    		this.modal.closeDialog();
    	}
    },
    
    onClose: function() {
    	DAO.load({endpoint:"TitleDetailsController.TabSaver", container:null}, this.data.activeTab);
    	// if we are on a screen that vertically scrolls (like DCPI and MyQuest), then don't focus the search box
    	// so that the screen doesn't jump to the top.
    	var myQuestMenu = Registry.lookup("MyQuestController.Menu");
    	var myQuestVisible = myQuestMenu && myQuestMenu.isVisible();
    	if ( Registry.lookup("SearchTypeController.Selector").getSearchType() != SearchTypeController_SEARCHTYPE_DCPI && ! myQuestVisible) {
    		Registry.lookup("SearchBoxController.SearchBox").focusSearchBox();
    	}
    },
    
    setTab: function(tabName) {
    	this.data.activeTab = tabName;
    	var activeTab = this.elementMap.get(tabName);
    	var activeTabContent= this.elementMap.get(tabName + TitleDetailsController_DIV_TITLE_DETAIL_TAB_CONTENT);
    	var inactiveTabs = [TitleDetailsController_DIV_TITLE_DETAIL_TAB_ADDITIONALINFO, TitleDetailsController_DIV_TITLE_DETAIL_TAB_QUIZINFO,
    	                    TitleDetailsController_DIV_TITLE_DETAIL_TAB_AWARDS, TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS];
    	inactiveTabs = inactiveTabs.without(tabName);
    	
    	for (var i=0; i < inactiveTabs.length; i++) {
    		var tabElement = this.elementMap.get(inactiveTabs[i] + TitleDetailsController_DIV_TITLE_DETAIL_TAB_CONTENT)
    		if(tabElement != null) {
    			tabElement.hide();
        		this.elementMap.get(inactiveTabs[i]).removeClassName("tabActive");       			
    		} 
 		
    	}
    	activeTab.addClassName("tabActive");
    	activeTabContent.show();
    },
    
    addTitleToBooklist: function() {
    	this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST).hide();
    	this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_IN_BOOKLIST).show();
    	var searchType = (this.data.keywordSearchRecord.digitalMediaProviderName) ? SearchTypeController_SEARCHTYPE_DCPI : SearchTypeController_SEARCHTYPE_LIBRARY;
    	var loadResult = DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder", container:null}, this.data.bibID, null, searchType, null);
    	if(!loadResult) {
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_ADD_TO_BOOKLIST).show();
    		this.elementMap.get(TitleDetailsController_DIV_TITLE_DETAIL_IN_BOOKLIST).hide();
    	}
    },
    updateInUsersBooklist: function(inUsersBooklist, bibID) {
    	if (this.data.bibID == bibID) {
	    	this.data.titleDetailValue.inUsersBooklist = inUsersBooklist;
	    	this.data.keywordSearchRecord.inUsersBookList = inUsersBooklist;
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
    
    openWishDialog: function() {
    	var params = {
    			width:"512px",
    			id:WishController_DIV_ADD_WISH_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "WishController.WishDialog", modal: modalDialog}, this.data.bibID, this.data.titleDetailValue.mainTitle);
    },
    
    openHoldDialog: function() {
    	var params = {
    			width:"512px",
    			id:HoldController_DIV_ADD_HOLD_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "HoldController.HoldDialog", modal: modalDialog}, this.data.bibID, this.data.titleDetailValue.mainTitle, 
    			this.data.titleDetailValue.responsibility, this.data.titleDetailValue.totalHoldableCopies);
    },
    
    openShelfBrowse: function() {
    	var params = {
    			width:"700px",
    			height:"300px",
    			id:ShelfBrowseController_DIV_SHELF_BROWSE,
    			zIndex:"30000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ShelfBrowseController.ShelfBrowseDialog", modal: modalDialog});
    },
    
    updateMyQuestShelf: function(shelfNumber, bibID) {
    	if (this.data.bibID == bibID) {
    		this.data.shelfNumber = shelfNumber;
    	}
    },    	
    
    openRecommendations: function() {
    	var params = {
    			width:"610px",
    			id:RecommendationController_DIV_ADD_RECOMMENDATION_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "RecommendationController.RecommendationDialog", modal: modalDialog}, this.data.bibID);
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

	titleDetailsHoldItListener: function() {
	    this.elementMap.get(TitleDetailsController_SPAN_HOLD_IT_BUTTON).hide();
	    var loadResult = DAO.load({endpoint: "TitleDetailsController.Holder", container:null}, this.data.bibID);
	    if(!loadResult) {
	    	this.elementMap.get(TitleDetailsController_SPAN_HOLD_IT_BUTTON).show();
	    }
	},

	titleDetailsCheckoutEbook: function() {
		var hideDiv = this.elementMap.get(TitleDetailsController_DIV_EBOOK_CHECKOUT).hide();
		hideDiv.hide();
	    var params = {
    			id:"ebookModalDialogModal",
    			zIndex:"30000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
	    var loadResult = DAO.load({endpoint: "TitleDetailsController.EBookChecker", modal:modalDialog}, this.data.bibID);
	    if(!loadResult) {
	    	if(hideDiv) {
	    		hideDiv.show();
	    	}
	    }
	},
	
	titleDetailsPreviewEbook: function() {
		var params = {
				id:TitleDetailsController_DIV_PREVIEW_EBOOK_PASSWORD_DIALOG,
				zIndex:"50000",
				hideOnOutsideClick:"true"
		};
		var modalDialog = new ModalDialog(params);
		this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_PREVIEW_EBOOK).disable = true;                        
		var loadResult = DAO.load({endpoint: "TitleDetailsController.PreviewEBookPasswordChecker", modal:modalDialog}, this.data.bibID);
		if(!loadResult) {
			this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_PREVIEW_EBOOK).disable = false;                        			
		}
	},
	
	titleDetailsReadFollettEbook: function() {
		var win = window.open(this.data.follettEBookTitleDetailsURL, "shelfcontent_blank");
		if(win) win.focus();
	},
	titleDetailsReadNonFollettEbook: function() {
		var win = window.open(this.data.nonFollettEbookURL, "nonfollettebook_blank");
		if(win) win.focus();
	},

	updateHoldInfo: function(data) {
		this.elementMap.get(TitleDetailsController_SPAN_HOLD_IT_BUTTON).hide();
		this.elementMap.get("holdInfo").update(data.titleDetailValue.holdHeader + "<br/>" + data.titleDetailValue.holdDetail);
		
		this.updateModel(data);
	},
	
    updateMultipleHoldInfo: function(data) {
    	this.data.titleDetailValue = data.titleDetailValue;
    	this.data.availabilityText = data.availabilityText;
    	this.data.bibID = data.bibID;
    	this.data.bibAssociated = data.bibAssociated;
    	this.data.availabilityString = data.availabilityString;
    	this.data.availabilityClass = data.availabilityClass;
    	this.data.canPlaceHold = data.canPlaceHold;
    	this.data.canHoldMultipleCopies = data.canHoldMultipleCopies;
    	this.data.doNotShowDialog = data.doNotShowDialog;
    	this.data.activeTab = data.activeTab;
    	this.refreshPage();
    },
	
	updateModel: function(data) {
    	this.pagedData = [data];
    	this.refreshPage();
	},
	
	populateEBookErrorMessage: function(errorMessage) {
		this.elementMap.get(TitleDetailsController_DIV_EBOOK_CHECKOUT).update('<p id="titleDetailEbookError">' + errorMessage + '</p>');
        this.elementMap.get(TitleDetailsController_DIV_EBOOK_CHECKOUT).show();
	},
	
	showPreviewEBookButton: function() {
		this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_PREVIEW_EBOOK).disable = false;
	},

    getBibID: function() {
    	return this.data.bibID;
    },
    getTitle: function() {
    	return this.data.titleDetailValue.mainTitle;
    },
    getMiniBibTypeIconURL: function() {
    	return this.data.keywordSearchRecord.miniBibTypeIconURL;
    },
    getBibTypeDescription: function() {
    	return this.data.keywordSearchRecord.bibTypeDescription;
    },
    getMaterialType: function() {
    	return this.data.titleDetailValue.materialType;
    },
    getCallNumberCopyID: function() {
    	return this.data.titleDetailValue.callNumberCopyID;
    },
    getCallNumber: function() {
    	return this.data.titleDetailValue.callNumber;
    },
    updateReviews: function(reviewsJSON, reviewForPatronJSON) {
    	this.data.titleDetailValue.reviewInfo = reviewsJSON;
    	this.data.titleDetailValue.reviewForPatron = reviewForPatronJSON;
    	this.refreshPage();
    },
    
    getSuggestionsHoverBoundary: function() {
    	return this.elementMap.get("titleDetails");
    }    
    
});