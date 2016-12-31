/* limiterhistory.js */
Class.create(BaseController, {
    init: function() {
		this.narrowNav = this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_NAV);
	    this.overflowNav = this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_NAV_PREVIOUS_ALL);
	    this.overflowMenu = this.elementMap.get(LimiterController_LI_NARROWING_HISTORY_NAV_PREVIOUS);
	    
	    this.reset(true);
    },

    registerEvents: function() {
    	Event.observe(this.elementMap.get(LimiterController_LINK_NARROWING_HISTORY_NAV_PREVIOUS), "mousedown", this.showOverflowMenu.bind(this));
    	Event.observe(this.elementMap.get(LimiterController_LINK_NARROWING_HISTORY_NAV_PREVIOUS), "mouseover", this.clearHideOverflowMenuTimeout.bind(this));
    	Event.observe(this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN), "mouseover", this.clearHideOverflowMenuTimeout.bind(this));
    	Event.observe(this.elementMap.get(LimiterController_LINK_NARROWING_HISTORY_NAV_PREVIOUS), "mouseout", this.delayHideOverflowMenu.bind(this));
    	Event.observe(this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN), "mouseout", this.delayHideOverflowMenu.bind(this));
    },
    
    showOverflowMenu: function() {
    	if ( Object.isElement(this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN)) ) {
    		new Effect.BlindDown(this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN), {duration: 0.25});
    	}
    },
    
    clearHideOverflowMenuTimeout: function(){
    	if (this.hideTimeout) {
    		window.clearTimeout(this.hideTimeout);
    	}
    },
    
    delayHideOverflowMenu: function() {
    	if (this.hideTimeout) {
    		window.clearTimeout(this.hideTimeout);
    	}
    	
    	var boundHide = this.hideOverflowMenu.bind(this);
    	this.hideTimeout = boundHide.delay(1.5); 
    },
    
    hideOverflowMenu: function() {
    	var overflowMenu = this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN);
    	if ( Object.isElement(overflowMenu) && overflowMenu.visible() ) {
    		new Effect.BlindUp(overflowMenu, {duration: 0.25});
    	}
    },
    
    getNarrowingHistory: function() {
    	var menubar = Registry.lookup("MenuBarController.MenuData");
    	var searchType = Registry.lookup("SearchTypeController.Selector");
    	DAO.load({endpoint: "LimiterController.HistoryElement", container: this.elementMap.get(LimiterController_DIV_LIMITER_HISTORY_HOLDING_TANK)}, menubar.getViewMode(), searchType.getSearchType());
    },
    
    deleteHistoryElement: function(element) {
	    var position = this.deleteHistory(element);
	    if ( position > 0 ) {
	        // hide the limiter hover window whenever we clear a history                
	    	if ( Object.isElement(this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN)) ) {
	            this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN).hide();
	        }
	          
	    	var searchType = Registry.lookup("SearchTypeController.Selector");
	    	if (DAO.load({endpoint: "LimiterController.HistoryElementDeleter", appendTo: "SearchController.SearchResults"}, position-1, searchType.getSearchType())) {
	    		var searchMaster = Registry.lookup("SearchController.SearchMaster");
	    		searchMaster.prepareForRefresh();
	    	}
	    }
    },
    
    notifyHistoryLoaded: function(data) {
    	var descendants = this.elementMap.get(LimiterController_DIV_LIMITER_HISTORY_HOLDING_TANK).immediateDescendants();
    	if (Object.isArray(descendants)) {
    		for (var i=0; i < descendants.length; i++) {
    			var element = descendants[i];
    			var clone = element.clone(true);
    			element.remove();
    			this.addUpdate(clone, data.indexToPrint);
    			if (data.indexToPrint > 0) {
    				Event.observe(clone, "mousedown", this.deleteHistoryElement.bind(this, clone));
    			}
    		}
    	}
    },
    
    addUpdate: function(data, index) {
        var narrowNav = this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_NAV);
        var overflowMenu = this.elementMap.get(LimiterController_LI_NARROWING_HISTORY_NAV_PREVIOUS);
        var overflowNav = this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_NAV_PREVIOUS_ALL);
        
        // remove if one is already there for this index.
        this.removeElement(index);
        
        // add the LI to the DOM
        if ( index == 0 ) {
            this.reset();
            overflowMenu.remove();
            narrowNav.insert(data);
            var childElements = narrowNav.childElements();
            childElements[0].insert({after: overflowMenu});
        } else {
            narrowNav.insert(data);
        }
        
        
        var childElements = narrowNav.childElements();
        if ( childElements && childElements.length > 0 ) {
        // special case when doing a WPE search and grade level is limited in search setup
            if ( index == 0 && childElements.length == 3 ) {
                var htmlElement = childElements[1];
                this.internalList[this.internalList.length] = htmlElement;
            }
            var htmlElement = childElements[childElements.length-1];
            this.internalList[this.internalList.length] = htmlElement;
            
            // update the over flow list if necessary (1 plus 2 search terms are allowed on screen)
            if ( this.internalList.length > 3) {
                var obj = this.internalList[1];
                // put the oldest intneral list element into the most recent overflpw
                this.overflowList[this.overflowList.length] = obj;
                // remove the item from the internal list.
                this.internalList = this.internalList.without(obj); 
                // remove from DOM
                obj.remove();
                // add it to the overflow DOM
                this.overflowNav.insert(obj);
                var anchor = Utility.downToClass(obj, "narrowNavFirstLevel");
                if ( anchor ) {
                    anchor.removeClassName("narrowNavFirstLevel");
                    anchor.addClassName("narrowNavSecondLevel");
                }
                
                // show the menu item!
                overflowMenu.show();
            }
        }
    },

    removeElement: function(index) {
        if ( index > 0 ) {
            if ( index - 1 < this.overflowList.length ) {
                var obj = this.overflowList[index-1]; // -remove from overflowList array
                Element.remove.delay(0, obj); //-- remove from DOM
                this.overflowList = this.overflowList.without(obj); // copy array
            } else {
                var indexOfIntneralList = index - this.overflowList.length; 
                if ( this.internalList[indexOfIntneralList] ) {
                    var obj = this.internalList[indexOfIntneralList]; // -remove from internal array
                    Element.remove.delay(0, obj); //-- remove from DOM
                    this.internalList = this.internalList.without(obj); // copy array
                }
            }
    	 } 
    },

    reset: function(hideOnReset) {
        this.internalList = new Array();
        this.overflowList = new Array();
        var obj = this.overflowMenu;
        
        if ( obj ) {
            obj.remove();
        }
        
        if (this.narrowNav) {
            this.narrowNav.update("");
            if ( obj ) {
                this.narrowNav.insert(obj);
                this.overflowMenu = obj;
            }
        }
        
        if (this.overflowNav) {
           this.overflowNav.update("");
        }
        
        if ( Object.isElement(this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN)) ) {
            this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN).hide();
        }
        
        if ( this.overflowMenu ) {
            this.overflowMenu.hide();
        }
        
        if (hideOnReset) {
        	this.hide();
        } else {
        	this.show();
        }
    },
    
    hide: function() {
    	// overriding because an outer div needs to be hidden for this to be done right
    	$(SearchController_DIV_HEADER_INNER_GROUP1).hide();
    },
    
    show: function() {
    	// overriding because an outer div needs to be shown for this to be done right
    	$(SearchController_DIV_HEADER_INNER_GROUP1).show();
    },

    deleteHistory: function(element) {
        var position = -1;
        
        if (element != this.overflowMenu) {
        	if (element.id != 'narrowNavTerm') {
        		// narrowNavTerm = our original search term
    		    position = this.overflowList.indexOf(element);
    		    var removedFromInternalList = false;
    		    if (position == -1 ) {
    		        position = this.internalList.indexOf(element);
    		        position += this.overflowList.length;
    		        removedFromInternalList = true;
    		    } else {
    			    if ( this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN) ) {
    			        this.elementMap.get(LimiterController_DIV_NARROWING_HISTORY_PREVIOUS_DROP_DOWN).hide();
    			    }
    	            position += 1;
    		    }
        	}
    	    
            if ( position != -1 ) {
                this.removeElement(position);
                if ( removedFromInternalList ) {
                    // copy the items from overflowList to internal list
                    if ( this.overflowList.length > 0 ) {
                        var obj = this.overflowList[this.overflowList.length-1];
                        this.overflowList = this.overflowList.without(obj);
                        this.internalList[this.internalList.length] = obj;
                        var currentIndex = this.internalList.length-1;
                        while (currentIndex > 1 ) {
                            this.internalList[currentIndex] = this.internalList[currentIndex-1];
                            this.internalList[currentIndex-1] = obj;
                            currentIndex--;
                        }
                        
                        obj.remove();
                        this.internalList[0].insert({after: obj});
                        var anchor = Utility.downToClass(obj, "narrowNavSecondLevel");
                        if ( anchor ) {
                            anchor.removeClassName("narrowNavSecondLevel");
                            anchor.addClassName("narrowNavFirstLevel");
                        }
                    }
                }            
                
    		     // hide the overflow list if empty
    			if ( this.overflowList.length == 0 ) {
    			    this.overflowMenu.hide();
    			}
            }
        } 
        
        return position;
    }
});