/* visualsearchpage.js */
Class.create(BaseController, {
	init: function(pageChange) {
		var visualSearch = Registry.lookup("VisualSearchController.VisualSearch");
		visualSearch.initContent(this);
		if(!pageChange) {
			visualSearch.updateVisualSearchDots(this.currentPage);
		}
		
		if (this.hasNextPage()) {
			visualSearch.showNextButton();
		} else {
			visualSearch.hideNextButton();
		}
		
		if (this.hasPreviousPage()) {
			visualSearch.showPreviousButton();
		} else {
			visualSearch.hidePreviousButton();
		}
	},
	
	registerEvents: function(pageChange) {
	},
	
	pagingAnimation: function(currentElement, newElement, isNext, callback) {
    	if (! Object.isElement(currentElement)) {
    		this.container.update(newElement);
    		callback();
    	} else {
    		var width = currentElement.getWidth();
    		this.container.makePositioned();
    		this.container.insert(newElement);
    		
    		var direction = isNext ? -1 : 1;
    		if (window.isRTL) {
    			direction = -direction;
    		}
    		currentElement.setStyle({left: direction * width + "px", width: width + "px", position: "absolute"});
    		newElement.setStyle({width: width + "px"});
    		this.container.setStyle({left: -direction * width + "px"});
    		
    		var afterFinish = this.finishAnimation.bind(this, currentElement, callback);
    		new Effect.Move(this.container, {x: direction * width, mode: "relative", duration: 1.0, afterFinish: afterFinish});
    	}
    },
    
    finishAnimation: function(currentElement, callback) {
    	currentElement.remove();
    	callback();
    }
});