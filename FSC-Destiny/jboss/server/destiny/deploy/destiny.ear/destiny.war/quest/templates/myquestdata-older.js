/* myquestdata-older.js */
Class.create(BaseController, {
	init: function() {
		this.refreshFooter();
		this.records = [];
		for (x=0; x < this.pagedData.length; x++) {
			var pageData = this.pagedData[x];
			for (i = 0; i < pageData.data.dateGroups.length; i ++) {
				var dateGroup = pageData.data.dateGroups[i];
				for (j = 0; j < dateGroup.items.length; j ++) {
					var item = dateGroup.items[j];
					this.records.push(item);
				}
			}
		}
		
		this.shelfSelect = new ShelfSelect({id: MyQuestUpdatesController_DIV_MYQUEST_UPDATES_RESULTS});
	    
	    var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		this.hoverGroup = HoverMaster.createGroup({
			name: this.name,
			data: this.records,
			activatorContainer: this.container,
			hoverContainer: $("content-outer"),
			controllerURL: this.data.hoverControllerURL,
			templateURL: this.data.hoverTemplateURL,
			openDelay: 0.5,
			closeDelay: 0.1,
			onShow: function(activator, hover) {	
				var mainContent = activator.up("#myQuestMainContent");
				if (Object.isElement(mainContent)) {
					var highZindexChildren = mainContent.select(".high-zindex");
					if (Object.isArray(highZindexChildren)) {
						for (i=0; i < highZindexChildren.length; i++) {
							if (Object.isElement(highZindexChildren[i])) {
								highZindexChildren[i].removeClassName("high-zindex");
							}
						}
					}
				}
				var parentItem = activator.up(".myQuestItem");
				if (Object.isElement(parentItem)) {
					parentItem.addClassName("high-zindex");
				}
				var dateGroup = activator.up("." + MyQuestController_CLASS_MYQUEST_DATE_GROUP);
				if (Object.isElement(dateGroup)) {
					dateGroup.addClassName("high-zindex");
				}
				$("content-outer").addClassName("high-zindex");
			},
			onHide: function(activator, hover) {
				var parentItem = activator.up(".myQuestItem");
				if (Object.isElement(parentItem)) {
					parentItem.removeClassName("high-zindex");
				}
				var dateGroup = activator.up("." + MyQuestController_CLASS_MYQUEST_DATE_GROUP);
				if (Object.isElement(dateGroup)) {
					dateGroup.removeClassName("high-zindex");
				}
				$("content-outer").removeClassName("high-zindex");
			}
		});
		
	    var loader = Registry.lookup("MyQuestUpdatesController.Loader");
	    loader.enableOnLoading();
	},
	
	registerEvents: function() {
		//do the titledetails stuff now
		var pageData = this.pagedData[this.pagedData.length-1];
		for (i = 0; i < pageData.data.dateGroups.length; i ++ ) {
			var group = pageData.data.dateGroups[i];
			for (j = 0; j < group.items.length; j ++) {					
				var item = group.items[j];				
				var link = $("titleDetailLink_" + item.auditID);
				var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
				
				var titleDetailsLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, item.bibID, null);																
				if (link) {
					Event.observe("titleDetailLink_" + item.auditID, "mousedown", titleDetailsLoader);
				}				
			}
		}
	},
	
	refreshFooter: function() {
		if($(MyQuestUpdatesController_ID_MYQUEST_OLDER_RESULTS_LINK)) {
			if (!this.pagedData[this.pagedData.length-1].nextPage) {
				$(MyQuestUpdatesController_ID_MYQUEST_OLDER_RESULTS_LINK).hide();
			} else {
				$(MyQuestUpdatesController_ID_MYQUEST_OLDER_RESULTS_LINK).show();
			}	
		}
	},		
	
	dataAppended: function(page) {
		$(this.container).insert({bottom: this.template.render(this.pagedData[page])});
		
		this.init();
		this.registerEvents();
	},
	
	truncateResults: function(idx) {
		this._truncateInternalData(idx);
		this._truncateDOMElements(idx);
	},
	
	getLastAuditIDForDateGroup: function(idx) {
		var dateGroupAnchors = $("myQuestUpdatesResults").select(".myQuestDateGroupElement a");
		var auditID = null;
		for (var i=0; i < dateGroupAnchors.length; i++) {
			var anchor = dateGroupAnchors[i];
			if (anchor && anchor.identify() == idx) {
				auditID = anchor.readAttribute("lastAuditID");
				if (auditID == "0") {
					auditID = null;
				}
			}
		}
		
		return auditID;
	},
	
	_truncateDOMElements: function(idx) {
		var children = $("myQuestUpdatesResults").childElements();
		var startRemoving = false;
		for (var i=0; i < children.length; i++) {
			if (children[i].hasClassName("myQuestDateGroupElement")) {
				var anchor = children[i].firstDescendant();
				if (anchor && anchor.identify() == idx) {
					startRemoving = true;
				}
			}
			
			if (startRemoving) {
				children[i].remove();
			}
		}
	},
	
	_truncateInternalData: function(idx) {
		var foundIdx = -1;
		var remainingPages = [];
		for (var i=0; i < this.pagedData.length && foundIdx == -1; i++) {
			var dateGroups = this.pagedData[i].data.dateGroups;
			for (var j=0; j < dateGroups.length; j++) {
				if (dateGroups[j].dateGroupID == idx) {
					foundIdx = j;
					break;
				}			
			}
			
			var temp = [];
			if (foundIdx >= 0) {
				for (var j=0; j < foundIdx; j++) {
					temp[j] = dateGroups[j];
				}
				this.pagedData[i].data.dateGroups = temp;
			}
			
			remainingPages[i] = this.pagedData[i];
		}
		
		this.pagedData = remainingPages;
	},
	
	getLastAuditID: function() {
		return this.pagedData[this.pagedData.length-1].lastAuditID;
	},
	
	getLastDateGroupIdx: function() {
		var dateGroups = this.pagedData[this.pagedData.length-1].data.dateGroups;
		var dateGroupID = -1;
		if (dateGroups && dateGroups.length > 0) {
			dateGroupID = dateGroups[dateGroups.length-1].dateGroupID;
		}
		return dateGroupID;
	},

	getLastDateString: function() {
		var dateGroups = this.pagedData[this.pagedData.length-1].data.dateGroups;
		var dateString = "";
		if (dateGroups && dateGroups.length > 0) {
			dateString = dateGroups[dateGroups.length-1].dateString;
		}
		return dateString;
	},
	
	updateResults: function (IDs, key, value, propertyToUpdate) {
		var records = this.records;
		for (var j = 0; j < records.length; j++) {
			var record = records[j];
			if (IDs.indexOf(eval("record." + key)) >= 0) {
				record[propertyToUpdate] = value;
			}        
		}
	}
});