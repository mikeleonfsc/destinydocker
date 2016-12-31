/* shelfSelect.js */
Class.create({

initialize: function(optionsArray) {
    var options = Object.extend({
        id: "searchtemplate",
        shelfNumber: null
    }, optionsArray);
    if ($(options.id)) {
    	var shelfControlWrappers = Utility.selectByClass($(options.id), "myQuestShelfControlWrapper");
    	for (var i = 0; i < shelfControlWrappers.length; i ++) {
		    var shelfOptions = Utility.selectByClass(shelfControlWrappers[i], "linkHoverShelfOption");
		    var shelfDropDown = Utility.selectByClass(shelfControlWrappers[i], "linkHoverShelfSelect");
		    var shelfControlHeader = Utility.selectByClass(shelfControlWrappers[i], "myQuestShelfControlHeader");
		    var bibID = shelfControlWrappers[i].up().down(".currentID");
		    if (bibID) {
		    	bibID = bibID.innerHTML;
		    }
		    if (options.shelfNumber && null != options.shelfNumber && "" != options.shelfNumber) {
		    	// This is used only for hovers.
		    	//   We store the hover in the pageCache, and the cache will always have the original selected,
		    	//   the hovermaster will send us the most up-to-date shelfNumber from the bib record, so
		    	//   we need to overwrite it with that.
		    	this.updateSelected(bibID, shelfOptions, shelfDropDown, options.shelfNumber);
		    }
		    
		    Event.observe(shelfOptions[0], "click", this.handleChange.bind(this, shelfControlWrappers[i], shelfOptions, shelfDropDown, 0));
		    Event.observe(shelfOptions[1], "click", this.handleChange.bind(this, shelfControlWrappers[i], shelfOptions, shelfDropDown, 1));
		    Event.observe(shelfOptions[2], "click", this.handleChange.bind(this, shelfControlWrappers[i], shelfOptions, shelfDropDown, 2));
		    Event.observe(shelfControlHeader[0], "mousedown", this.showOptions.bind(this, shelfControlWrappers[i]));
		    Event.observe(shelfControlWrappers[i], "mouseout", this.triggerHideOptions.bind(this, shelfControlWrappers[i]));
		    Event.observe(shelfControlWrappers[i], "mouseover", this.stopTriggerHideOptions.bind(this, shelfControlWrappers[i]));
		    shelfControlWrappers[i].hoverTimeout = null;
    	}
    }
},

handleChange: function(wrapper, shelfOptions, shelfDropDown, index) {
	var bibID = wrapper.readAttribute("bibID");
	var shelfNumber = shelfOptions[index].readAttribute("shelfNumber");
    var params = {
    		bibID: bibID,
            shelfNumber: shelfNumber
    	};	
    if(!shelfOptions[index].hasClassName("selected")){
    	this.updateSelected(bibID, shelfOptions, shelfDropDown, index);
    	this.updateShelfNumberOnBib(bibID, shelfNumber);
    	this.hideOptions(wrapper);
        
    	DAO.load({endpoint:"MyQuestShelfController.ShelfAdd", container:null},bibID, shelfNumber);    	                    	
    	if (!window.shelfStuff) {
    		window.shelfStuff = [];
    	}
    	window.shelfStuff[bibID] = shelfNumber;
    }
	return false;	// So onclick in FF doesn't pop up to the top of the screen
},

updateCacheHTML: function(cacheHTML, bibID, shelfNumber) {
	
},

updateShelfNumberOnBib: function(bibID, shelfNumber) {
	var refs = $$(".recordID[value='" + bibID + "']");
	// Need to update all records instances for this bib in the DOM
	for (var i = 0; i < refs.length; i ++) {
		refs[i].next(".shelfNumber").setAttribute('value', shelfNumber);
	}
},

updateSelected: function(bibID, shelfOptions, shelfDropDown, index) {
	var refs = $$(".recordID[value='" + bibID + "']");
	
	// Need to loop through all of these guys. In case two people recommend the same
	//  thing to me, we need to update BOTH drop downs.
	for (var i = 0; i < refs.length; i ++) {
		var _shelfDropDown = refs[i].up().down(".myQuestShelfControlWrapper");
		if (_shelfDropDown) {
			var _shelfOptions = Utility.selectByClass(_shelfDropDown, "linkHoverShelfOption");
			this._updateSingleSelected(_shelfOptions, _shelfDropDown.down().down(), index);
		}
	}
	
	// Some places, like title details and hovers, still need this.
	this._updateSingleSelected(shelfOptions, shelfDropDown[0], index);
},

_updateSingleSelected: function(shelfOptions, shelfDropDown, index) {
	shelfOptions[0].removeClassName("selected");
	shelfOptions[1].removeClassName("selected");
	shelfOptions[2].removeClassName("selected");
	shelfDropDown.update(shelfOptions[index].down().down().innerHTML + "<em></em>");
	shelfOptions[index].addClassName("selected");
},

showOptions: function(wrapper) {
	if (wrapper) {
		var ul = wrapper.down("ul");
		if (ul && !ul.visible()) {
			Effect.BlindDown(ul, {duration: .25});
		}
	}
	return false;	// So onclick in FF doesn't pop up to the top of the screen
},

hideOptions: function(wrapper) {
	if (wrapper) {
		var ul = wrapper.down("ul");
		if (ul && ul.visible()) {
			Effect.BlindUp(ul, {duration: .25});
			wrapper.hoverTimeout = null;
		}
	}
},

triggerHideOptions: function(wrapper) {
	if (!wrapper.hoverTimeout) {
		wrapper.hoverTimeout = this.hideOptions.bind(this, wrapper).delay(.25);
	}
},

stopTriggerHideOptions: function(wrapper) {
	if (wrapper.hoverTimeout) {
		window.clearTimeout(wrapper.hoverTimeout);
		wrapper.hoverTimeout = null;
	}
}

});
