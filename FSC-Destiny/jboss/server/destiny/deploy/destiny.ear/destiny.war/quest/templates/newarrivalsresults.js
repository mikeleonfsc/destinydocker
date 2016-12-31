/* newarrivalsresult.js */
Class.create(BaseController, {
	init: function(pageChange) {
		var loader = Registry.lookup("NewArrivalsController.Loader");
		if(! pageChange) {
			loader.hideLoading();
		}
		
		if (this.hasNextPage()) {
			loader.showNextButton();
		} else {
			loader.hideNextButton();
		}
		
		if (this.hasPreviousPage()) {
			loader.showPreviousButton();
		} else {
			loader.hidePreviousButton();
		}
	
		if (Object.isArray(this.data.recList)) {
			var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
			this.hoverGroup = HoverMaster.createGroup({
				name: this.name,
				data: this.data.recList,
				activatorContainer: this.container,
				hoverContainer: $("content-outer"),
				controllerURL: this.data.hoverControllerURL,
				templateURL: this.data.hoverTemplateURL,
				openDelay: 0.5,
				closeDelay: 0.1,
				onShow: function(activator, hover) {
					var mainContent = activator.up("#" + NewArrivalsController_DIV_NEW_ARRIVALS_LOADED);
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
					var parentItem = activator.up("." + NewArrivalsController_CLASS_TITLE_DETAIL_SUGGESTION);
					if (Object.isElement(parentItem)) {
						parentItem.addClassName("high-zindex");
					}
					
					$("content-outer").addClassName("high-zindex");
					$("newArrivalsMain").addClassName("high-zindex");
				},
				onHide: function(activator, hover) {
					var parentItem = activator.up("." + NewArrivalsController_CLASS_TITLE_DETAIL_SUGGESTION);
					if (Object.isElement(parentItem)) {
						parentItem.removeClassName("high-zindex");
					}
					
					$("content-outer").removeClassName("high-zindex");
					$("newArrivalsMain").removeClassName("high-zindex");
				}
			});
		}
	},
	
	registerEvents: function(pageChange) {
		var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
		if (Object.isArray(this.data.recList)) {
			for (var i=0; i < this.data.recList.length; i++) {
				var elementID = NewArrivalsController_SPAN_NEW_ARRIVALS_ITEM_PREFIX + (i+(this.data.pageNumber*5));
				var titleDetailsLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, this.data.recList[i].bibID, null);
				Event.observe(this.elementMap.get(elementID), "mousedown", titleDetailsLoader);
			}
		}
	},
	
	updateSearchResults: function (IDs, key, value, propertyToUpdate) {  
		var pagedData = this.pagedData;
		for (var i = 0; i < pagedData.length; i++) {
			var records = pagedData[i].recList;
			for (var j = 0; j < records.length; j++) {
				var record = records[j];
				if (IDs && IDs.indexOf(eval("record." + key)) >= 0) {
					record[propertyToUpdate] = value;					
				}        
			}     
		}
	}
});