/* limiters.js */
Class.create(BaseController, {
    init: function() {
		var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		var limiterContainer = this.elementMap.get(LimiterController_DIV_NARROWING_LIMITERS);
		this.hoverGroup = HoverMaster.createGroup({
			name: this.name,
			data: this.data.limiterData,
			activatorContainer: this.container,
			controllerURL: this.data.hoverControllerURL,
			templateURL: this.data.hoverTemplateURL,
			activateEvent: "mousedown",
			openDelay: 0,
			closeDelay: 1,
			onShow: function(activator, hover) {		
				var searchResultsHovers = HoverMaster.lookupGroup("SearchController.SearchResults");
				if (searchResultsHovers && Object.isFunction(searchResultsHovers.disable)) {
					searchResultsHovers.disable();
				}
				limiterContainer.select("." + LimiterController_CLASS_LIMITER_MENU_ITEM).each(
					function(item) {
						item.select("a")[0].removeClassName("activeLimiter");
					}
				);
				activator.select("a")[0].addClassName("activeLimiter");
				
				// Really hokey TF fix for lowering search results
				var oldHighZParent = Utility.downToClass($("resultsCacheInner"), "high-zindex");
				if(oldHighZParent) {
					oldHighZParent.removeClassName("high-zindex");
				}

				Event.stopObserving(limiterContainer, "mouseout");
				Event.observe(limiterContainer, "mouseout", hover.deactivatorFunction);
			},
			onHide: function(activator, hover) {
				var searchResultsHovers = HoverMaster.lookupGroup("SearchController.SearchResults");
				if (searchResultsHovers && Object.isFunction(searchResultsHovers.enable)) {
					searchResultsHovers.enable();
				}
				Event.stopObserving(limiterContainer, "mouseout");
				activator.select("a")[0].removeClassName("activeLimiter");
			}
		});
    },

    registerEvents: function() {
    }    
});