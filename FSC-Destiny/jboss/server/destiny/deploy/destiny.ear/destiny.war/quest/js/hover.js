/* hover.js */
Class.create({
	
initialize: function(name, activator, hoverBoundaryContainer, controllerURL, templateURL) {
	this.name = name;
	this.activator = activator;
	this.templateURL = templateURL;
	this.controllerURL = controllerURL;
	this.hoverBoundaryContainer = hoverBoundaryContainer;
},

show: function(container, data, showEffect, contentContainer) {
	var hoverInserted = false;
	var hoverContainerID = data.hoverContainerID;
	var hoverKey = data.hoverKey;
	if (Object.isArray(data) && data.length > 0) {
		// Sometimes (limiters) we have paged data.  In those cases, inspect the first page's data
		hoverContainerID = data[0].hoverContainerID;
		hoverKey = data[0].hoverKey;
	}
	
	if (! (container.visible() && container.hoverKey == hoverKey)) { // if the container is already visible and is showing this hover, don't show it again
		if (hoverContainerID) {
			var hoverInsertPoint = $(hoverContainerID);
			if (hoverInsertPoint && Object.isElement(hoverInsertPoint)) {
				hoverInsertPoint.insert(container);
				hoverInserted = true;
			}
		}
		
		if (! hoverInserted) {
			document.body.insert(container);
		}
		container.hoverKey = hoverKey;
		
		this.controller = Registry.createController(this.name, this.templateURL, this.controllerURL, {endpoint: this.name, container: container}, data);
		this.controller.hover = this;
		this.controller.activator = this.activator;
		if (Object.isFunction(this.controller.setBoundaryContainer)) {
			this.controller.setBoundaryContainer(this.hoverBoundaryContainer);
		}
		this.controller.setPosition(container);
		
		if (Object.isFunction(showEffect) && $(contentContainer)) {
			showEffect($(contentContainer));
		} else {
			container.show();
		}
	}
},

dispose: function() {
	
}

});
