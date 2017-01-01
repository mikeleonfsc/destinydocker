Class.create(BaseController,{init:function(){this.width=300;this.hoverTopAdjust=0.15;this.shelfSelect=new ShelfSelect({id:this.data.hoverKey});if(this.data.canAddToBooklist&&!this.data.resourceList){DAO.load({endpoint:"BooklistSelectController.QuickDetails",container:this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER)});var a=function(b){if(b&&b.stopPropagation){b.stopPropagation()}else{window.event.cancelBubble=true}};this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmouseout=a;this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmouseleave=a;this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmousein=a;this.elementMap.get(BooklistSelectController_SELECT_LIST_CONTAINER).onmouseenter=a}},registerEvents:function(){if(Object.isElement(this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST))){Event.observe(this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST),"mousedown",this.addTitleToBooklist.bind(this))
}if(this.elementMap.get(HoverMasterController_LINK_TITLE_HOVER_MORE_PREFIX)){var a=this.openTitleDetails.bind(this,this.data.dcpiRecordGUID||this.data.bibID,!!this.data.dcpiRecordGUID,this.data.copySiteID);Event.observe(this.elementMap.get(HoverMasterController_LINK_TITLE_HOVER_MORE_PREFIX),"click",a)}if(Object.isElement(this.elementMap.get(HoverMasterController_LINK_HOVER_CLOSE_BUTTON))){Event.observe(this.elementMap.get(HoverMasterController_LINK_HOVER_CLOSE_BUTTON),"mousedown",this.hide.bind(this))}},openTitleDetails:function(e,b,a){var d=Registry.lookup("TitleDetailsController.TitleDetails");var c=Registry.lookup("TitleDetailsController.Master");if(d&&Object.isFunction(d.closeDialog)){d.closeDialog()}this.hide();c.loadTitleDetails(e,null,null,b,a)},addTitleToBooklist:function(){this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST).hide();this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST).show();var f=this.data.bibID?this.data.bibID:this.data.recID;
var a=this.data.copySiteID?this.data.copySiteID:null;var e=Registry.lookup("SearchTypeController.Selector");var b=DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder",container:null},f?f:null,this.data.dcpiRecordGUID?this.data.dcpiRecordGUID:null,e.getSearchType(),a);this.data.inUsersBookList=true;if(!b){this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_ADD_TO_BOOKLIST).show();this.elementMap.get(HoverMasterController_DIV_TITLE_HOVER_IN_BOOKLIST).hide()}else{var c=$(this.data.hoverContainerID);var d=c.down("img.resultCoverImage");if(d){if(c.hasClassName("searchResult")){this.animateToBookList()}}}Registry.lookup("SearchBoxController.SearchBox").focusSearchBox()},animateToBookList:function(){var j=Registry.lookup("BooklistWidgetController.Load");booklistElement=j.elementMap.get(BooklistWidgetController_DIV_BOOK_LIST);var g=$(this.data.hoverContainerID).down("img.resultCoverImage");var k=g.clone();k.writeAttribute("id","addToListClone");k.setStyle({position:"absolute",zIndex:"10001"});
g.insert({after:k});var i=k.cumulativeOffset();var h=booklistElement.cumulativeOffset();var e=k.getWidth();var c=k.getHeight();var d=booklistElement.getWidth();var l=booklistElement.getHeight();var b=(h.left+(d/2))-(i.left+(e/2));var a=(h.top+(l/2))-(i.top+(c/2));$("top10").setStyle({zIndex:"10000"});$("content-outer").setStyle({zIndex:"10000"});this.hide();var f=Registry.lookup("HoverMasterController.HoverMaster");f.disable();new Effect.Move(k,{x:b,y:a,duration:0.5,afterFinish:function(){new Effect.Shrink("addToListClone",{duration:0.5,afterFinish:function(){$("addToListClone").remove();$("top10").setStyle({zIndex:""});$("content-outer").setStyle({zIndex:""});var m=Registry.lookup("HoverMasterController.HoverMaster");m.enable()}})}})},setPosition:function(b){if(this.activator){b.addClassName("titleHoverArrowTR");b.addClassName(HoverMasterController_CLASS_TITLE_HOVER);var a=this.calculatePosition(b);b.removeClassName("titleHoverArrowTL");b.removeClassName("titleHoverArrowBL");b.removeClassName("titleHoverArrowTR");
b.removeClassName("titleHoverArrowBR");if(a.hoverUsedLeft){if(window.isRTL){a.hoverLeft=a.hoverLeft+42}if(a.hoverUsedTop){b.addClassName("titleHoverArrowTL")}else{b.addClassName("titleHoverArrowBL")}}else{if(a.hoverUsedTop){b.addClassName("titleHoverArrowTR")}else{b.addClassName("titleHoverArrowBR")}}b.setStyle({position:"absolute",zIndex:10000,top:a.hoverTop+"px",left:a.hoverLeft+"px",visibility:"inherit"})}},calculatePosition:function(n){var c=this.activator.positionedOffset();var e=this.activator.getWidth();var a=n.getWidth();var d=n.getHeight();var b=true;var k=true;var q=0;if(this.hoverTopAdjust){q=d*this.hoverTopAdjust}var r=e;var f=c.top-q;var o=this.activator.cumulativeOffset().left;var h=this.getBoundaryContainer();var j=10000;var g=10000;var l=this.activator.cumulativeOffset().top;var p=10000;var i=10000;if(Object.isElement(h)){j=h.cumulativeOffset().left;g=h.getWidth();p=h.cumulativeOffset().top;i=h.getHeight()}if((o+r+a)>(j+g)){if((o-a)>=document.viewport.getScrollOffsets().left){r=r-e-a;
b=false}}if((l+d)>(p+i)){if((l-d)>=document.viewport.getScrollOffsets().top){var m=0;if(this.hoverFlipTopAdjust){m=d*this.hoverFlipTopAdjust}if(f-d>0){f=f-d+m;k=0}}}return{hoverLeft:r,hoverTop:f,hoverUsedLeft:b,hoverUsedTop:k}},getBoundaryContainer:function(){return this.boundaryContainer},setBoundaryContainer:function(a){this.boundaryContainer=a}});