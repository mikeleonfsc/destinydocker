/* hoverGroup.js */
Class.create({
	
initialize: function(options) {
	this.options = options;
	this.name = this.options.name;
	this.hoverMap = this.convertDataToHoverMap(this.options.data);
	this.activators = this.options.activators;
	this.controllerURL = this.options.controllerURL;
	this.templateURL = this.options.templateURL;
	this.boundActivate = this.activate.bind(this);
	this.boundDeactivate = this.deactivate.bind(this);
	this.boundHide = this.hide.bind(this);
	this.boundShow = this.show.bind(this);
	this.hoverBoundaryContainer = this.options.hoverContainer;
	this.onShow = this.options.onShow;
	this.onHide = this.options.onHide;
	this.activateEvent = (this.options.activateEvent) ? this.options.activateEvent : "mouseover";
	this.enabled = true;
	this.openDelay = this.options.openDelay ? this.options.openDelay : 0;
	this.closeDelay = this.options.closeDelay ? this.options.closeDelay : 0;
	
	this._buildHovers();
},

convertDataToHoverMap: function(data) {
	var hoverMap = new Hash();
	if (data && Object.isArray(data)) {
		data.each(function(record) {
			if (record) {
				if (Object.isArray(record) && record.length > 0 && record[0].hoverKey) {
					//Sometimes (limiters) we have paged hover data.  In this case, inspect the first page
					hoverMap.set(record[0].hoverKey, record);
				} else if (record.hoverKey) {
					hoverMap.set(record.hoverKey, record);
				}
			}
		});
	}
	return hoverMap;
},

getHoverContainer: function() {
	if (! this.hoverContainer) {
		this.hoverContainer = new Element("div", {id: this.name});
		this.hoverContainer.addClassName("hoverContainer");
		this.hoverContainer.addClassName(HoverMasterController_CLASS_HOVER);
		this.hoverContainer.setStyle({position: "absolute"});
	}
	
	return this.hoverContainer;
},

_buildHovers: function() {
	this.hovers = new Hash();
	this.activators.each(this._addHover.bind(this));
},

_addHover: function(activator) {
	if (activator && Object.isElement(activator)) {
		var hoverKey = activator.readAttribute("hoverKey");
		var hover = new Hover(this.name + "." + hoverKey, activator, this.hoverBoundaryContainer, this.controllerURL, this.templateURL);
		this.hovers.set(hoverKey, hover);
		hover.activatorFunction = this.boundActivate.curry(activator, hover);
		hover.deactivatorFunction = this.boundDeactivate.curry(activator, hover);
		hover.close = this.boundHide.curry(activator, hover);
		hover.showNow = this.boundShow.curry(activator, hover);
		Event.observe(activator, this.activateEvent, hover.activatorFunction);
		Event.observe(activator, "mouseout", hover.deactivatorFunction);
	}
},

activate: function(activator, hover, event) {
	if (this.enabled) {
		if (! activator) {
			activator = this.currentActivator;
		}
		
		if (this.closeTimeout) {
			window.clearTimeout(this.closeTimeout);
		}
		
		if (this.currentActivator != activator || ! this.isHoverVisible() || this.getVisibleHoverKey() != activator.readAttribute("hoverKey")) {
			this.currentActivator = activator;
			if (this.openTimeout) {
				window.clearTimeout(this.openTimeout);
			}
			
			this.openTimeout = this.show.bind(this, activator, hover).delay(this.openDelay);
		}
	}
},

show: function(activator, hover) {
	if(this.enabled) {
		var hoverContainer = this.getHoverContainer();
		Event.stopObserving(hoverContainer, "mouseover");
		Event.stopObserving(hoverContainer, "mouseout");
		Event.observe(hoverContainer, "mouseover", hover.activatorFunction);
		Event.observe(hoverContainer, "mouseout", hover.deactivatorFunction);
		
		if (this.activateEvent != "mouseover") {
			Event.observe(activator, "mouseover", hover.activatorFunction);
		}
		
		var hoverKey = activator.readAttribute("hoverKey");
		var data = this.hoverMap.get(hoverKey);
		hover.show(hoverContainer, data, this.options.showEffect, this.options.contentContainer);
		
		if (Object.isFunction(this.onShow)) {
			this.onShow(activator, hover);
		}
	}
},

showHoverNow: function(hoverKey) {
	if(this.enabled) {
		var hover = this.hovers.get(hoverKey);
		if (hover && Object.isFunction(hover.show)) {
			hover.showNow();
		}
	}
},

deactivate: function(activator, hover, event) {
	if (this.openTimeout) {
		window.clearTimeout(this.openTimeout);
	}
	if (this.closeTimeout) {
		window.clearTimeout(this.closeTimeout);
	}
	this.closeTimeout = this.hide.bind(this, activator, hover).delay(this.closeDelay);
},

hide: function(activator, hover) {
	var hoverContainer = this.getHoverContainer();
	if (! Object.isElement(this.currentActivator) || this.currentActivator == activator) {
		// only hide the hover container if we haven't started showing another
		this.currentActivator = null;
		
		if (this.activateEvent != "mouseover") {
			Event.stopObserving(activator, "mouseover");
		}
		
		if (Object.isFunction(this.options.hideEffect)) {
			var contentDiv = $(this.options.contentContainer)
			if(this.options.contentContainer && contentDiv) {
				this.options.hideEffect(contentDiv, hoverContainer);
			} 
		} else {
			hoverContainer.hide();
		}
		
		if (Object.isFunction(this.onHide)) {
			this.onHide(activator, hover);
		}
	}
},

dispose: function() {
	var hoverContainer = this.hoverContainer;
	if (Object.isElement(hoverContainer) && Object.isElement(hoverContainer.parentNode)) {
		hoverContainer.remove();
	}
	this.hovers.values().each(this._disposeHover);
},

getVisibleHoverKey: function() {
	var hoverContainer = this.hoverContainer;
	var hoverKey = null;
	if (Object.isElement(hoverContainer) && Object.isElement(hoverContainer.parentNode) && hoverContainer.visible()) {
		hoverKey = hoverContainer.hoverKey;
	}
	
	return hoverKey;
},

isHoverVisible: function() {
	var hoverContainer = this.hoverContainer;
	return Object.isElement(hoverContainer) && Object.isElement(hoverContainer.parentNode) && hoverContainer.visible();
},

_disposeHover: function(hover) {
	hover.dispose();
},

disable: function() {
	this.enabled = false;
	var hoverContainer = this.hoverContainer;
	if (Object.isElement(hoverContainer) && Object.isElement(hoverContainer.parentNode) && hoverContainer.visible()) {
		hoverContainer.hide();
	}
},

enable: function() {
	this.enabled = true;
},

getActiveHover: function() {
	var hoverKey = this.getVisibleHoverKey();
	var hover = null;
	if (hoverKey) {
		hover = this.hovers.get(hoverKey);
	}
	return hover;
}

});
