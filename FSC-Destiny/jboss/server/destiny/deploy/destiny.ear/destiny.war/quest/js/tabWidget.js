// tabWidget.js
Class.create({

initialize: function(optionArray) {
	this.options = optionArray;
    this.tabWindow = $(this.options.id);
    
    if (this.tabWindow) {
	    var tabs = Utility.selectByClass(this.tabWindow, "tab");
	    var content = Utility.selectByClass(this.tabWindow, "tabContent");
	    
	    if (tabs.length == content.length) {
	        for (var index = 0; index < tabs.length; index ++) {
	        	Event.observe($(tabs[index]), "mousedown", this.flipToPage.bindAsEventListener(this, $(content[index]).id, $(tabs[index]).id));
	            if ($(tabs[index]).id != this.options.defaultTabID) {
	                $(content[index]).hide();
	            } else {
	                this.currentTabContents = $(content[index]).id;
	                this.currentTab = $(tabs[index]).id;
	                
	                $(this.currentTab).addClassName("tabActive");
	            }
	        }	
	    }
	
	    this.tabWindow.show();
    }
},

flipToPage: function(event, page, tab) {
    if (isMousedown(event)) {
	    this.setActiveTab(page, tab);
    } else {
    	return false;
    }
},

setActiveTab: function(page, tab) {
    $(this.currentTabContents).hide();
    $(this.currentTabContents).setStyle({display: "none"});
    
    $(page).show();
    $(page).setStyle({display: "block"});
    
    $(this.currentTab).removeClassName("tabActive");
    $(tab).addClassName("tabActive");
    this.currentTabContents = page;
    this.currentTab = tab;
}

});