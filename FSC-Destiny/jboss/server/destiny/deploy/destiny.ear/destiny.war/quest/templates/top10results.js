/* top10results.js */
Class.create(BaseController, {
	init: function() {
		var t = Registry.lookup("Top10Controller.Load");
		t.hideLoading();
		var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		this.hoverGroup = HoverMaster.createGroup({
			name: this.name,
			data: this.data.records,
			activatorContainer: this.container,
			hoverContainer: $("content-outer"),
			controllerURL: this.data.hoverControllerURL,
			templateURL: this.data.hoverTemplateURL,
			openDelay: 0.5,
			closeDelay: 0.1,
			onShow: function() {
				$("content-outer").addClassName("high-zindex");
				$("top10").addClassName("high-zindex");
			},
			onHide: function() {
				$("content-outer").removeClassName("high-zindex");
				$("top10").removeClassName("high-zindex");
			}
		});
		
	},
	
	registerEvents: function() {	
		this.elementMap.get(Top10Controller_DIV_TOP10_ITEM_PREFIX + "0").addClassName("top10ItemSelected");
		
		var i = 0;
		var topten = this;
		var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
		this.data.records.each(function(record) {
			Event.observe("top10Item_"+ i, "mouseover", topten.mouseOverTop10Item.bindAsEventListener(topten));
			Event.observe("top10Item_"+ i, "mouseout", topten.mouseOutTop10Item.bindAsEventListener(topten));
			Event.observe("top10Item_"+ i, "mousedown", topten.top10MouseDownItemListener.bindAsEventListener(topten));
			topten.addDraggable(CoverImageTemplate_DIV_TITLE_IMAGE_PREFIX + i, record.bibID, null, "top10");
			var launchTitleDetails = titleDetailsMaster.loadTitleDetails.curry(record.bibID, null);
			Event.observe(topten.elementMap.get(CoverImageTemplate_DIV_COVER_IMAGE_PREFIX + i), "click", launchTitleDetails);
			Event.observe(topten.elementMap.get(HitListRecordTemplate_DIV_TITLE_PREFIX + i), "click", launchTitleDetails);
			i++;
		});		
	},	

	mouseOverTop10Item: function (event){
		var highlightedID = Event.element(event).getAttribute("value");
        var currentSelectedID = Utility.downToClass(this.elementMap.get(Top10Controller_DIV_TOP10_ITEMS), Top10Controller_CLASS_TOP10_ITEM_SELECTED).readAttribute("value");
        var hilightedElement = this.elementMap.get(Top10Controller_DIV_TOP10_COVER_PREFIX  + highlightedID);
        var highlightedMenuElement = this.elementMap.get(Top10Controller_CLASS_TOP10_ITEM + "_" + highlightedID);
        if (currentSelectedID != highlightedID && hilightedElement){
        	this.elementMap.get(Top10Controller_DIV_TOP10_COVER_PREFIX  + currentSelectedID).hide();
        	hilightedElement.show();
        	highlightedMenuElement.addClassName(Top10Controller_CLASS_TOP10_ITEM_HIGHLIGHTED);
        }		
    },
    
	mouseOutTop10Item: function (event){
    	var highlightedID = Event.element(event).getAttribute("value");
        var currentSelectedID = Utility.downToClass(this.elementMap.get(Top10Controller_DIV_TOP10_ITEMS ), Top10Controller_CLASS_TOP10_ITEM_SELECTED).readAttribute("value");
        var hilightedElement = this.elementMap.get(Top10Controller_DIV_TOP10_COVER_PREFIX  + highlightedID);
        var highlightedMenuElement = this.elementMap.get(Top10Controller_CLASS_TOP10_ITEM + "_" + highlightedID);
        if (currentSelectedID != highlightedID && hilightedElement){
        	this.elementMap.get(Top10Controller_DIV_TOP10_COVER_PREFIX  + currentSelectedID).show();
        	hilightedElement.hide();
        	highlightedMenuElement.removeClassName(Top10Controller_CLASS_TOP10_ITEM_HIGHLIGHTED);
        }
    },           
   
    top10MouseDownItemListener:  function (event) {    	
    	var eventSource = Event.element(event);
    	var topLevel = this.elementMap.get(Top10Controller_DIV_TOP10_ITEMS);
    	if (!eventSource.hasClassName("top10ItemInactive")) {
    		var currentSelectedID = Utility.downToClass(topLevel, "top10ItemSelected").readAttribute("value");
    		var newSelectedID = eventSource.readAttribute("value");
    		this.elementMap.get(Top10Controller_DIV_TOP10_ITEM_PREFIX  + currentSelectedID).removeClassName("top10ItemSelected");
    		this.elementMap.get(Top10Controller_DIV_TOP10_COVER_PREFIX + currentSelectedID).hide();
    		this.elementMap.get(Top10Controller_DIV_TOP10_COVER_PREFIX + newSelectedID).show();
    		this.elementMap.get(Top10Controller_DIV_TOP10_ITEM_PREFIX + newSelectedID).removeClassName("top10ItemHighlighted");
    		this.elementMap.get(Top10Controller_DIV_TOP10_ITEM_PREFIX + newSelectedID).addClassName("top10ItemSelected");
    	}
    },
    
    updateSearchResults: function (IDs, key, value, propertyToUpdate) {        
		var records = this.data.records;
		for (var j = 0; j < records.length; j++) {
			var record = records[j];
			if (IDs && IDs.indexOf(eval("record." + key)) >= 0) {
				record[propertyToUpdate] = value;					
			}        
		}
	}
	
});