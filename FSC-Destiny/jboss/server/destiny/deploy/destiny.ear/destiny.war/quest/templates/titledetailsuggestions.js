/* titledetailsuggestions.js */
Class.create(BaseController, {
    init: function() {
		var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
		var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		if (titleDetails) {
			this.hoverGroup = HoverMaster.createGroup({
				name: this.name,
				data: this.data.recList,
				activatorContainer: this.container,
				hoverContainer: titleDetails.getSuggestionsHoverBoundary(),
				controllerURL: this.data.hoverControllerURL,
				templateURL: this.data.hoverTemplateURL,
				openDelay: 0.5,
				closeDelay: 0.1,
				onShow: function() {
					titleDetails.getSuggestionsHoverBoundary().addClassName("high-zindex");
				},
				onHide: function() {
					titleDetails.getSuggestionsHoverBoundary().removeClassName("high-zindex");
				}
			});
		}
    },

    registerEvents: function() {
    	for (var i = 0; i < this.data.recList.length; i ++) {
    		var suggestion = this.data.recList[i];
    		var tmp = this.elementMap.get(TitleDetailsController_CLASS_TITLE_DETAIL_SUGGESTIONS_CONTENT_TITLE + TitleDetailsController_DIV_TITLE_DETAIL_SUGGESTION_HOVER + i);
    		if (Object.isElement(tmp)) {
    			Event.observe(tmp, "mousedown", this.openTitleDetails.bind(this, suggestion.bibID, suggestion.shelfNumber));
    		}
    	}
    },
    
    openTitleDetails: function(bibID, shelfNumber) {
    	this.hoverGroup.disable();
		var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
		var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
		
		titleDetails.closeDialog();
		titleDetailsMaster.loadTitleDetails(bibID, null);
    },
    
    updateSearchResults: function (IDs, key, value, propertyToUpdate) {      
		var pagedData = this.pagedData;
		for (var i = 0; i < pagedData.length; i++) {
			var records = pagedData[i].recList;
			for (var j = 0; j < records.length; j++) {
				var record = records[j];
				if (IDs.indexOf(eval("record." + key)) >= 0) {
					record[propertyToUpdate] = value;					
				}        
			}
		}
	}
});