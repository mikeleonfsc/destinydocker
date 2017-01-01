/* hoverMaster.js */
Class.create(BaseController, {
	
initialize: function() {
	this.groups = new Hash();
},

createGroup: function(options) {
	this.options = options;
	var restoreHoverKey = null;
	var groupName = this.options.name;
	if (this.groups.keys().indexOf(groupName) >= 0) {
		var oldGroup = this.groups.get(groupName);
		restoreHoverKey = oldGroup.getVisibleHoverKey();
		this.cleanupGroup(oldGroup);
	}
	
	var activators = this.findActivators(this.options.activatorContainer);
	var group = new HoverGroup({
		name: groupName,
		data: this.options.data,
		activators: activators,
		hoverContainer: this.options.hoverContainer,
		controllerURL: this.options.controllerURL, 
		templateURL: this.options.templateURL, 
		onShow: this.options.onShow, 
		onHide: this.options.onHide,
		showEffect: this.options.showEffect,
		hideEffect: this.options.hideEffect,
		activateEvent: this.options.activateEvent,
		openDelay: this.options.openDelay,
		closeDelay: this.options.closeDelay,
		contentContainer: this.options.contentContainer
	});
	this.groups.set(groupName, group);
	
	if (restoreHoverKey) {
		group.showHoverNow(restoreHoverKey);
	}
	
	return group;
},

lookupGroup: function(groupName) {
	return this.groups.get(groupName);
},

cleanupGroup: function(group) {
	group.dispose();
},

findActivators: function(container) {
	var activators = [];
	if (container && Object.isElement(container)) {
		var myChildren = container.descendants();
		myChildren.each(function(child) {
			if (child && Object.isElement(child) && child.readAttribute("hoverKey")) {
				activators.push(child);
			}
		});
	}
	
	return activators;
},

enable: function() {
	this.groups.values().each(function(group) {
		group.enable();
	});
},

disable: function() {
	this.groups.values().each(function(group) {
		group.disable();
	});
}

});
