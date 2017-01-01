/* titleHoverController.js */
Class.create(BaseController, {
	
init: function() {
	this.width = 300;
	this.hoverTopAdjust = 0.15;
	this.shelfSelect = new ShelfSelect({id: this.data.hoverKey});
	if (this.data.canAddToBooklist && !this.data.resourceList) {
		DAO.load({endpoint: "BooklistSelectController.QuickDetails", container: this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});
		
		var noBubble = function (e) { 
				if (e && e.stopPropagation) {
					e.stopPropagation();
				}else{ 
					window.event.cancelBubble = true; 
				};
		}
		
		// This fixes an IE glitch where a <select> pulldown will loose focus and close the dialog window.
		this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmouseout = noBubble;
		this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmouseleave = noBubble;
		this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmousein = noBubble;
		this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmouseenter = noBubble;
	}
},

registerEvents: function() {
	if(Object.isElement(this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST))) {
		Event.observe(this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST), "mousedown", this.addTitleToBooklist.bind(this));
	}
	if(this.elementMap.get(HoverMasterController_LINK_TITLE_HOVER_MORE_PREFIX)) {
		var titleDetailsLoader = this.openTitleDetails.bind(this, this.data.dcpiRecordGUID || this.data.bibID, !!this.data.dcpiRecordGUID, this.data.copySiteID);
		Event.observe(this.elementMap.get(HoverMasterController_LINK_TITLE_HOVER_MORE_PREFIX), "click", titleDetailsLoader);
	}
	if(Object.isElement(this.elementMap.get(HoverMasterController_LINK_HOVER_CLOSE_BUTTON))) {
		Event.observe(this.elementMap.get(HoverMasterController_LINK_HOVER_CLOSE_BUTTON), "mousedown", this.hide.bind(this));
	}
},

openTitleDetails: function(bibIDOrRecordGUID, isDCPI, copySiteID) {
	var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
	var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
	if ( titleDetails && Object.isFunction(titleDetails.closeDialog) ) {
		titleDetails.closeDialog();
	}
	this.hide();
	titleDetailsMaster.loadTitleDetails(bibIDOrRecordGUID, null, null, isDCPI, copySiteID);
},

addTitleToBooklist: function() {
	this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST).hide();
	this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST).show();
	var id = this.data.bibID ? this.data.bibID : this.data.recID;
	var copySiteID = this.data.copySiteID ? this.data.copySiteID : null;
	var stController = Registry.lookup("SearchTypeController.Selector");
	var loadResult = DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder", container:null}, id ? id : null, 
			this.data.dcpiRecordGUID ? this.data.dcpiRecordGUID : null, stController.getSearchType(), copySiteID);
	this.data.inUsersBookList = true;
	if(!loadResult) {
		this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST).show();
		this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST).hide();
	} else {
		//animate the book to the booklist
		var element = $(this.data.hoverContainerID); 
		var image = element.down("img.resultCoverImage");
		if(image) {
			if(element.hasClassName("searchResult")) {
				this.animateToBookList();
			}
		}
	}
	
	Registry.lookup("SearchBoxController.SearchBox").focusSearchBox();
},

animateToBookList: function() {
	var booklistController = Registry.lookup("BooklistWidgetController.Load");
	booklistElement = booklistController.elementMap.get(BooklistWidgetController_DIV_BOOK_LIST);
	
	var element = $(this.data.hoverContainerID).down("img.resultCoverImage");
	var clone = element.clone();
	clone.writeAttribute("id", "addToListClone");
	clone.setStyle({position: "absolute", zIndex: '10001'});
	
	element.insert({after: clone});
    
	var elemOffset = clone.cumulativeOffset();
    var bookListOffset = booklistElement.cumulativeOffset();
    var elemWidth = clone.getWidth();
    var elemHeight = clone.getHeight();
    var bookListWidth = booklistElement.getWidth();
    var bookListHeight = booklistElement.getHeight();
    
    // ensure it is centered over the bookListDiv
    var xMove = (bookListOffset.left + (bookListWidth / 2)) - (elemOffset.left + (elemWidth/2));
    var yMove = (bookListOffset.top + (bookListHeight / 2)) - (elemOffset.top + (elemHeight/2));

    $('top10').setStyle({zIndex:'10000'});
    $('content-outer').setStyle({zIndex:'10000'});
    this.hide();
    var hoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
	hoverMaster.disable();
    new Effect.Move(clone, {
    	x: xMove,
    	y: yMove,
    	duration: 0.5,
        afterFinish:
        	function(){
		    	new Effect.Shrink('addToListClone', {duration:0.5, afterFinish: 
		    		function(){
		    			$("addToListClone").remove();
		    		    $('top10').setStyle({zIndex:''});
		    			$('content-outer').setStyle({zIndex:''});
		    			var hoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		    	    	hoverMaster.enable();
		    		}
		    	});
			}
   });
},

setPosition: function(hover) {
	if (this.activator) {
		// add this first, just so we get the width right
		hover.addClassName("titleHoverArrowTR");
		hover.addClassName(HoverMasterController_CLASS_TITLE_HOVER);
		
		var positionInfo = this.calculatePosition(hover);
		
		hover.removeClassName("titleHoverArrowTL");
		hover.removeClassName("titleHoverArrowBL");
		hover.removeClassName("titleHoverArrowTR");
		hover.removeClassName("titleHoverArrowBR");
		
		if ( positionInfo.hoverUsedLeft) {
			if(window.isRTL){
				/*
				 * TODO Refactor.
				 * This is a quick solution to get the hoverleft to 
				 * work properly in Arabic mode for New Arrivals.  
				 * See Redmine Bug #1246: Quest - Arabic - New Arrivals hover not positioned correctly"
				 * TPL September 22, 2010.
				 */
				positionInfo.hoverLeft = positionInfo.hoverLeft + 42;
			}			
			if ( positionInfo.hoverUsedTop) {
				hover.addClassName("titleHoverArrowTL");
			} else {
				hover.addClassName("titleHoverArrowBL");
			}
		} else {
			if ( positionInfo.hoverUsedTop) {
				hover.addClassName("titleHoverArrowTR");
			} else {
				hover.addClassName("titleHoverArrowBR");
			}
		}
		
		hover.setStyle({
			position: "absolute",
			zIndex: 10000,
			top: positionInfo.hoverTop + "px",
			left: positionInfo.hoverLeft + "px",
			visibility: "inherit"
		});
	}
},

calculatePosition: function(hover) {
	var activatorOffset = this.activator.positionedOffset();
	var activatorWidth = this.activator.getWidth();
	
	var hoverWidth = hover.getWidth();
	var hoverHeight = hover.getHeight();
	var hoverUsedLeft = true;
	var hoverUsedTop = true;
	var hoverTopAdjust = 0;
	if (this.hoverTopAdjust) {
		hoverTopAdjust = hoverHeight * this.hoverTopAdjust;
	}
	
	var hoverLeft = activatorWidth;
	var hoverTop = activatorOffset.top - hoverTopAdjust;
	
	var activatorCumulativeLeft = this.activator.cumulativeOffset().left;
	var container = this.getBoundaryContainer();
	
	var containerCumulativeLeft = 10000; // default to something huge if we have no container (i.e. never flip)
	var containerWidth = 10000;
	var activatorCumulativeTop = this.activator.cumulativeOffset().top;
	var containerCumulativeTop = 10000;
	var containerHeight = 10000;
	if (Object.isElement(container)) {
		containerCumulativeLeft = container.cumulativeOffset().left;
		containerWidth = container.getWidth();
		containerCumulativeTop = container.cumulativeOffset().top;
		containerHeight = container.getHeight();
	}
	
	if ((activatorCumulativeLeft + hoverLeft + hoverWidth) > (containerCumulativeLeft + containerWidth)) {
		if ((activatorCumulativeLeft - hoverWidth) >= document.viewport.getScrollOffsets().left) {
			hoverLeft = hoverLeft - activatorWidth - hoverWidth;
			hoverUsedLeft = false;
		}   
	}
	
	if ((activatorCumulativeTop + hoverHeight) > (containerCumulativeTop + containerHeight)) {
		if ((activatorCumulativeTop - hoverHeight) >= document.viewport.getScrollOffsets().top) {
			var hoverFlipTopAdjust = 0;
			if (this.hoverFlipTopAdjust) {
				hoverFlipTopAdjust = hoverHeight * this.hoverFlipTopAdjust;
			}
			if (hoverTop - hoverHeight > 0) {
				// need to ensure we are not going to be way off the screen
				hoverTop = hoverTop - hoverHeight + hoverFlipTopAdjust;
				hoverUsedTop = 0;
			}
		}
	}
	
	return {hoverLeft: hoverLeft, hoverTop: hoverTop, hoverUsedLeft: hoverUsedLeft, hoverUsedTop: hoverUsedTop};
},

getBoundaryContainer: function() {
    return this.boundaryContainer;
},

setBoundaryContainer: function(boundaryContainer) {
	this.boundaryContainer = boundaryContainer;
}

});
