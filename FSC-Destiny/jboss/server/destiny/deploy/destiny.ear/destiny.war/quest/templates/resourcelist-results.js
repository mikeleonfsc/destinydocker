/* resourcelist-results.js */
Class.create(BaseController, {
    init: function(pageChange) {
		this.hitList = this.data.hitList;
		if (this.data.wpeHitList && Object.isArray(this.data.wpeHitList.records) && this.data.wpeHitList.records.length > 0) {
			this.hitList = this.data.wpeHitList;
		}
		
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		var bookListWidget = Registry.lookup("BooklistWidgetController.Load");
		if (this.name == "ResourceListController.ResourceList") {
			resourceListMaster.showResourceListOptions();
			if (this.hitList.records.length > 0) {
				resourceListMaster.showButtons();
			} else {
				resourceListMaster.hideButtons();
			}
		} else if (this.name == "ResourceListController.MyInfo") {
			resourceListMaster.showMyInfoOptions();
		} else {
			resourceListMaster.hideOptions();
		}
		
		if (!pageChange) {
			resourceListMaster.setTotalCount(this.data.totalCount);
			resourceListMaster.setListName(this.data.listName);
			var listData = resourceListMaster.data;
			if (this.name == "ResourceListController.ResourceList"
				&& bookListWidget && Object.isFunction(bookListWidget.updateTitleCounts)
				&& (!listData.publicList || (listData.publicList && listData.publicListOwnerUserID == listData.loggedInUserID))) {
				bookListWidget.updateTitleCounts(this.data.totalCount);
				bookListWidget.updateListName(this.data.listName);
				var booklistSelect = Registry.lookup("BooklistSelectController.Widget");
				if (booklistSelect) {
					booklistSelect.setBooklistValue(this.data.listID);
				}
			}
		}

		var errorNode = resourceListMaster.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_DCPI_ERROR);
		if (this.data.dcpiErrorMessage) {
			errorNode.innerHTML = this.data.dcpiErrorMessage;
			errorNode.style.display = "block";
		}else {
			errorNode.style.display = "none";
		}
		
		if (this.hitList) {
			if (this.hitList && !this.hitList.options.hideQuickDetails) {
				var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
				this.hoverGroup = HoverMaster.createGroup({
					name: this.name,
					data: this.hitList.records,
					activatorContainer: this.container,
					hoverContainer: resourceListMaster.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WINDOW_CONTENT),
					controllerURL: this.hitList.hoverControllerURL,
					templateURL: this.hitList.hoverTemplateURL,
					openDelay: 0.5,
					closeDelay: 0.1,
					onShow: function() {
						resourceListMaster.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WINDOW_CONTENT).addClassName("high-zindex");
						var oldHighZParent = Utility.downToClass($("rlCacheInner"), "high-zindex");
						if(oldHighZParent) {
							oldHighZParent.removeClassName("high-zindex");
						}
						var newHighZParent = Utility.upToClass(this.currentActivator, "searchResult");
						newHighZParent.addClassName("high-zindex");
					},
					onHide: function() {
						resourceListMaster.elementMap.get(ResourceListController_DIV_RESOURCE_LIST_WINDOW_CONTENT).removeClassName("high-zindex");
					}
				});
			}
			
			// if we are on digital resources, we handle this differently in checkResultsLoaded
			resourceListMaster.setPageIndex(this.data.pageIndex, this.data.startIndex, this.data.endIndex);
			resourceListMaster.setNextButtonVisible(this.data.showNextButton);
			resourceListMaster.setPreviousButtonVisible(this.data.showPreviousButton);
			resourceListMaster.hideLoadingGraphic();
			if (!resourceListMaster.data.publicList) {
				resourceListMaster.setTitle(this.data.title);
			}
			if (this.data.totalCount == 0) {
				resourceListMaster.hideResults();
			}
			resourceListMaster.modal.centerDialog();
			
			if (this.data.showNextButton && ! this.hasNextPage()) { 
				var fetchPage = resourceListMaster.fetchPage.bind(resourceListMaster, this.data.pageNumber + 1);
				fetchPage.defer(); // defer this until after the results have loaded
			}
			resourceListMaster.notifyPageDataUpdated(this.data.pageNumber);
		}
    },
    
    registerEvents: function() { 
    	var resourceListMaster = Registry.lookup("ResourceListController.Master");
		var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
		var listType = resourceListMaster.getListType();
		for (var i=0; i < this.hitList.records.length; i++) {
			var currentID = i;
			var rec = this.hitList.records[i];
			if (resourceListMaster.endpoint == "ResourceList" && !resourceListMaster.data.publicList) {
				var recID = null;
				var dcpiRecordGUID = null;
				if (listType == ResourceListController_RESOURCE_LIST_TYPE_LIBRARY || listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) {
					if (rec.dcpiRecordGUID) {
						dcpiRecordGUID = rec.dcpiRecordGUID;
					} else {
						recID = rec.bibID;
					}
				} else if (listType == ResourceListController_RESOURCE_LIST_TYPE_WPE) {
					recID = rec.recID;
				} else {
					recID = rec.resourceID;
				}
				var removeButton = this.elementMap.get(CoverImageTemplate_DIV_TITLE_REMOVE_IMAGE + "rl_" + currentID);
    			Event.observe(removeButton, "mousedown", this.removeTitle.bind(this, recID, dcpiRecordGUID, listType, rec.dcpiRecordType, removeButton));
    			if (!window.isI18N) {
    				if (Object.isElement(this.elementMap.get(CoverImageTemplate_BUTTON_RESOURCE_LIST_CITATION_EDIT + "rl_" + currentID))) {
    					Event.observe(this.elementMap.get(CoverImageTemplate_BUTTON_RESOURCE_LIST_CITATION_EDIT + "rl_" + currentID), "mousedown", this.editCitation.bind(this, recID, dcpiRecordGUID, rec.copySiteID, rec.bibType, resourceListMaster.getListType()));
    				}
    			}
			} else if (resourceListMaster.endpoint == "MyInfo") {
				if (Object.isElement(this.elementMap.get(HitListRecordTemplate_DIV_TITLE_RENEW_IMAGE + "rl_" + currentID))) {
					Event.observe(this.elementMap.get(HitListRecordTemplate_DIV_TITLE_RENEW_IMAGE + "rl_" + currentID), "mousedown", this.renewTitle.bind(this, rec.bibID, rec.copyID, currentID));
				}
				if (Object.isElement(this.elementMap.get(CoverImageTemplate_DIV_RECOMMEND_TITLE_IMAGE + "rl_" + currentID))) {
					Event.observe(this.elementMap.get(CoverImageTemplate_DIV_RECOMMEND_TITLE_IMAGE + "rl_" + currentID), "mousedown", this.sendRecommendation.bind(this, rec.bibID));
				}
			} else if (resourceListMaster.endpoint == "Holds") {
				var holdID = rec.holdID;
    			if (!rec.holdIsReady && rec.canDeleteHolds) {
    				Event.observe(this.elementMap.get(CoverImageTemplate_DIV_TITLE_REMOVE_IMAGE + "rl_" + currentID), "mousedown", this.deleteHold.bind(this, holdID));
    			}
			} else if (resourceListMaster.endpoint == "Recommendations") {
				var recommendationID = rec.recommendationID;
    			Event.observe(this.elementMap.get(CoverImageTemplate_DIV_TITLE_REMOVE_IMAGE + "rl_" + currentID), "mousedown", this.deleteRecommendation.bind(this, recommendationID));
    			if(rec.hasRecommendationComment) {
    				Event.observe(this.elementMap.get(CoverImageTemplate_DIV_RESOURCE_LIST_RECOMMENDATION_VIEW + recommendationID), "mousedown", this.viewRecommendation.bind(this, recommendationID));
    				Event.observe(this.elementMap.get(HitListRecordTemplate_ID_RECOMMENDATION_PATRON_LINK_PREFIX + "rl_" + currentID), "mousedown", this.viewRecommendation.bind(this, recommendationID));
    			}
			}
			
			if ((listType == ResourceListController_RESOURCE_LIST_TYPE_LIBRARY || listType == ResourceListController_RESOURCE_LIST_TYPE_DCPI) && !this.hitList.options.hideLinkToTitleDetails) {
				var searchMaster = Registry.lookup("SearchController.SearchMaster");
				var titleDetailsLoader =
    				(rec.digitalMediaProviderName)
    					? (rec.follettEBookTitleDetailsURL)
    							? (function(reciffy){
    								return function(){
    									var win = window.open(reciffy.follettEBookTitleDetailsURL, "shelfcontent_blank");
    									if(win) win.focus();
    								}
    							})(rec)
							: searchMaster.dcpiRedirectorLoader.bind(searchMaster, rec.dcpiRecordGUID || rec.bibID, null, rec.copySiteID, !!rec.dcpiRecordGUID)
						: titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, rec.bibID, null);							
				Event.observe(this.elementMap.get(HitListRecordTemplate_DIV_TITLE_PREFIX + "rl_" + currentID), "click", titleDetailsLoader);
				Event.observe(this.elementMap.get(CoverImageTemplate_DIV_TITLE_IMAGE_PREFIX + "rl_" + currentID), "click", titleDetailsLoader);
			}
		}
    },
    
    showTitleDetails: function(bibID) {
		var titleDetails = Registry.lookup("TitleDetailsController.Master");
		titleDetails.loadTitleDetails(bibID);
    },

    showTitleDetailsDCPI: function(recordGUID) {
    	var titleDetails = Registry.lookup("TitleDetailsController.Master");
    	titleDetails.loadTitleDetails(recordGUID,null,null,true);
    },
    
    checkResultsLoaded: function() {
    	var allLoaded = true;
    	for (var i=0; (i < this.recordControllers.length) && allLoaded; i++) {
    		allLoaded == allLoaded && this.recordControllers[i].isLoaded();
    	}
    	
    	if (allLoaded) {
    		var resourceListMaster = Registry.lookup("ResourceListController.Master");
    		resourceListMaster.setPageIndex(this.data.pageIndex, this.data.startIndex, this.data.endIndex);
    		resourceListMaster.setNextButtonVisible(this.data.showNextButton);
    		resourceListMaster.setPreviousButtonVisible(this.data.showPreviousButton);
    		resourceListMaster.hideLoadingGraphic();
    		if (!resourceListMaster.data.publicList) {
    			resourceListMaster.setTitle(this.data.title);
    		}
    		resourceListMaster.modal.centerDialog();
    	} else {
    		this.resultsLoadedChecker.delay(250);
    	}
    },

    dataAppended: function(pageNumber) {
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		resourceListMaster.notifyPageDataUpdated(pageNumber);
    },
    
    removeTitle: function(bibID, recordGUID, type, dcpiType, buttonElement) {
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		
		if (! resourceListMaster.isFetching) {
			if (DAO.load({endpoint:"ResourceListController.RemoveTitle"}, bibID,recordGUID, resourceListMaster.data.listID, this.data.pageNumber, type, dcpiType)) {
				this.truncatePagedData();
				resourceListMaster.showLoading();
				if (Object.isElement(buttonElement)) {
					Event.stopObserving(buttonElement);
				}
			}
		}
    },
    
    deleteRecommendation: function(recommendationID) {
    	var resourceListMaster = Registry.lookup("ResourceListController.Master");
    	this.truncatePagedData();
    	
    	resourceListMaster.showLoading();
    	DAO.load({endpoint:"ResourceListController.DeleteRecommendation"}, recommendationID, this.data.pageNumber);
    },
    
    viewRecommendation: function(recommendationID) {
    	var params = {
				width:"",
				height:"",
				id:ResourceListController_DIV_RECOMMENDATION_VIEW_DIALOG,
				zIndex:"50000",
				hideOnOutsideClick:"true"
		};
		var modalDialog = new ModalDialog(params);
    	
    	DAO.load({endpoint:"ResourceListController.ViewRecommendation", modal: modalDialog}, recommendationID);
    },
    
    deleteHold: function(holdID) {
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
    	this.truncatePagedData();
    	
    	resourceListMaster.showLoading();
    	DAO.load({endpoint:"ResourceListController.DeleteHold"}, holdID, this.data.pageNumber);
    },
    
    renewTitle: function(bibID, copyID, currentID) {
    	var params = {
    			width:"500px",
    			height:"400px",
    			id:ResourceListRenewController_DIV_RENEW_MESSAGE_BOX + "Modal",
    			zIndex:"30000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	
    	DAO.load({endpoint:"ResourceListRenewController.RenewCopy", modal: modalDialog}, bibID, copyID, currentID);
    },
    
    updateTitleOnRenew: function(bibID, currentID, newDueDate, newDueDateLabel) {
		var updateItem = this.elementMap.get(HitListRecordTemplate_DIV_DUE_DATE_PREFIX + "rl_" + currentID)			
		var button = this.elementMap.get(HitListRecordTemplate_DIV_TITLE_RENEW + "rl_" + currentID)			
        if ( updateItem ) {
            updateItem.removeClassName(ResourceListRenewController_CLASS_SEARCH_RESULT_DUE_DATE_NORMAL);
            updateItem.removeClassName(ResourceListRenewController_CLASS_SEARCH_RESULT_DUE_DATE_OVERDUE);
            updateItem.addClassName(ResourceListRenewController_CLASS_SEARCH_RESULT_DUE_DATE_RECENTLY_RENEWED);
            updateItem.update(newDueDateLabel);
            if (button) {
            	button.hide();
            }
        }
		this.updateResults([bibID], "hitList", "bibID", true, "overDueItem");
		this.updateResults([bibID], "hitList", "bibID", newDueDate, "dueDate");

    },
    
    sendRecommendation: function(bibID) {
    	var params = {
    			width:"610",
    			id:RecommendationController_DIV_ADD_RECOMMENDATION_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "RecommendationController.RecommendationDialog", modal: modalDialog}, bibID);
    },
    
    editCitation: function(bibID, contentID, dcpiSiteID, type, listType) {
    	var params = {
    			width:"",
    			id:ResourceListCitationController_DIV_CITATION_EDIT_DIALOG,
    			zIndex:"50000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ResourceListCitationController.Dialog", modal: modalDialog}, bibID, contentID, dcpiSiteID, type, listType);
    },
    
    updateResults: function (IDs, listID, key, value, propertyToUpdate) {        
		for (var i = this.pagedData.length - 1; i >=0; i-- ) {
			if (eval("this.pagedData[i]." + listID)) {
				var records = eval("this.pagedData[i]." + listID + ".records;");
				for (var j = 0; j < records.length; j++) {
					var record = records[j];
					if (IDs.indexOf(eval(eval("record." + key))) >= 0) {
						record[propertyToUpdate] = value;					
					}        
				}
			}
		}        
	}
});