/* visualsearch.js */
Class.create(BaseController, {
    init: function() {
		DAO.load({endpoint: "VisualSearchController.Contents", container: this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_CONTENT)});
		this.outerDiv = this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_HIST_DRAWER);
		this.drawerChest = [];
		this.addHomeDrawer(MessageHelper.format("visualSearchController_visualSearchHome"));
		var menubar = Registry.lookup("MenuBarController.MenuData");
		menubar.setViewMode(MenuBarController_VIEW_MODE_VISUAL_SEARCH);
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(VisualSearchController_LINK_VISUAL_SEARCH_NEXT), "mousedown", this.clickNext.bind(this));
        Event.observe(this.elementMap.get(VisualSearchController_LINK_VISUAL_SEARCH_PREV), "mousedown", this.clickPrevious.bind(this));
    },
    
    initContent: function(contents) { 
    	this.contents = contents;
    	this.elementMap.get(VisualSearchController_DIV_RESULTS_LOADING).hide();
    	this.registerContentEvents();
    },
    
    registerContentEvents: function() {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PAGING_MAIN).update(""); // clear out the paging dots for rebuild
        if(this.contents.data) {
        	var boundDotsListener = this.visualSearchPagingDotsListener.bind(this);
        	for(var i = 0; i < this.contents.data.pageCount; i++) {
        		var dotElement = Builder.node("a", {
        			"onclick": "return false;", 
        			"id": VisualSearchController_LINK_VISUAL_SEARCH_PAGE_DOT + i, 
        			"class": "pageInactive", 
        			"pageindex": i, 
        			"alt": eval("this.contents.data.page" + i), 
        			"title": eval("this.contents.data.page" + i)}, 
					[Builder.node("span")]);
        		this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PAGING_MAIN).insert(dotElement);
        		Event.observe(dotElement, "mousedown", boundDotsListener.curry(i));
        	}
        	if(this.contents.data.pageList) {
        		var boundNodeListener = this.visualSearchNodeListener.bind(this);
        		for(var i = 0; i < this.contents.data.pageList.length; i++) {
        			var node = this.contents.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_NODE + i);
        			Event.observe(node, "click", boundNodeListener.curry(this.contents.data.pageList[i]));
        		}
        	}
        }
        
    },
    
    clickNext: function() {
    	if(this.contents) {
    		this.hideNextPrevButtons();
    		this.contents.nextPage();
    	}
    },

    clickPrevious: function() {
    	if(this.contents) {
    		this.hideNextPrevButtons();
    		this.contents.previousPage();
    	}
    },
    
    hideNextPrevButtons: function() {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PAGING_MAIN).setStyle("visibility: hidden");
        this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_NEXT_BUTTON).hide();
        this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PREVIOUS_BUTTON).hide();
    },
    
    showNextButton: function() {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_NEXT_BUTTON).show();
    },

    hideNextButton: function() {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_NEXT_BUTTON).hide();
    },
    
    showPreviousButton: function() {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PREVIOUS_BUTTON).show();
    },
    
    hidePreviousButton: function() {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PREVIOUS_BUTTON).hide();
    },

    visualSearchPagingDotsListener: function(pageIndex) {
		if(this.contents && this.contents.currentPage != pageIndex) {
			this.hideNextPrevButtons();
			this.contents.setPage(pageIndex);
		}
     },

     visualSearchNodeListener: function(node) {
        var nodeType = node.nodeType;
        var nodeID = node.nodeID;
        var description = node.description;
        var imagePath = node.imageName;
        var listID = node.nodeType == VisualSearchController_TYPE_ELEMENT_PUBLIC_LIST ? node.searchSyntax : null;
        var oneSearch = (node.oneSearchDatabases ? true : false);
                
        switch (nodeType) {
            case VisualSearchController_TYPE_GROUP:
                this.addDrawer(imagePath, description, nodeID);
                this.visualSearchGroupAction(nodeID, description);
                break;
            case VisualSearchController_TYPE_ELEMENT_PUBLIC_LIST:
            	var params = {
            			width:"",
            			id:ResourceListController_DIV_RESOURCE_LIST_WINDOW,
            			zIndex:"10000",
            			hideOnOutsideClick:"true"
            	};
            	var modalDialog = new ModalDialog(params);
            	DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, listID, "ResourceList", true);
                break;
            case VisualSearchController_TYPE_ELEMENT_CATEGORY:
            case VisualSearchController_TYPE_ELEMENT_SEARCH:
                this.setVisualSearchNodeID(nodeID);
                if (oneSearch) {
    				var oneSearchMaster = Registry.lookup("OneSearchController.SearchMaster");
    				var searchOptions = {
    					searchText: '',
						searchType: 3,		// VopacLimiterSet.ONE_SEARCH
						resetOneSearchDatabases: false,
						visualSearchNodeID: nodeID
    				};
    				
    				oneSearchMaster.submitNewSearch(searchOptions);
                } else {
    				var searchMaster = Registry.lookup("SearchController.SearchMaster");
    				var searchOptions = {
						searchText: '',
						searchType: 1,		// VopacLimiterSet.LIBRARY
						pageNumber: 0,
						sortBy: SearchController_SORTBYRELEVANCE,
						didYouMeanSearch: false,
						hiddenSearch: false,
						visualSearchNodeID: nodeID,
						visualSearchType: nodeType
    				};
    				
    				searchMaster.submitNewSearch(searchOptions);
                }
                break;
            case VisualSearchController_TYPE_ELEMENT_URL:
                // does nothing
        }
    },
    
    setVisualSearchNodeID: function(nodeID) {
    	this.visualSearchNodeID = nodeID;
    },
    
    getVisualSearchNodeID: function() {
    	return this.visualSearchNodeID;
    },
    
    visualSearchHistoryOverListener: function(node) {
        node.addClassName("activeHistoryRow");
    },

    visualSearchHistoryOutListener: function(node) {
        node.removeClassName("activeHistoryRow");
    },

    visualSearchHistoryListener: function(node) {
        var eventSourceLink = node.down("a");
        if (eventSourceLink) {
            var description = eventSourceLink.readAttribute("description");
            var groupID = eventSourceLink.readAttribute("groupID");    
            if(this.visualSearchGroupAction(groupID, description)) {
            	this.closeDrawer(eventSourceLink.identify());
            }
        }
    },

    visualSearchGroupAction: function(groupID, description) {
    	this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_CONTENT).update("");
    	this.elementMap.get(VisualSearchController_DIV_RESULTS_LOADING).show();
    	var loadResult = DAO.load({endpoint: "VisualSearchController.GroupFetcher", container: this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_CONTENT)}, groupID);
    	if(loadResult) {
    		this.elementMap.get(VisualSearchController_SPAN_VISUAL_SEARCH_HEADING).update(description);
    	}
    	return loadResult;
    },

	visualSearchListClickListener: function(event) {    
        this.show();
        window.currentResourceListID = event.memo.listID;
        window.currentResourceListName = event.memo.listName.unescapeHTML();
        this.elementMap.get(VisualSearchController_FIELD_RESOURCE_LIST_PRINT_TITLE).value = event.memo.listName.unescapeHTML();
        window.VisualSearchController_DIV_RESOURCE_LIST_WINDOW_LIST.showResourceList(event.memo.listID); 
        updateCurrentResourceListTab();   
    },
    
    updateVisualSearchDots: function(activeIndex) {
	    var dots = this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PAGING_MAIN).select("a");
	    for (i=0; i < dots.length; i++) {
	        dots[i].removeClassName("pageInactive");
	        dots[i].removeClassName("pageActive");
	        if (activeIndex == dots[i].readAttribute("pageindex")) {
	            dots[i].addClassName("pageActive");
	        } else {
	            dots[i].addClassName("pageInactive");
	        }
	    }
	    this.elementMap.get(VisualSearchController_DIV_VISUAL_SEARCH_PAGING_MAIN).setStyle("visibility: inherit");
	},
    
//visualsearch drawer functions    
	addDrawer: function(imagePath, description, nodeID) {
		var link = "<a href=\"#\" class=\"vsHistoryLink\" description=\"" + description + "\"";
		if (nodeID != null) {
			link += " groupID=\"" + nodeID + "\"";
		}
		link += ">" + description + "</a>";
		
		var rowAttributes = {className: "visualSearchHistoryRow", style: "display: none"};
		if (nodeID == null) {
			rowAttributes = Object.extend({id: "visualSearchHistoryHome"}, rowAttributes);
		} else {
			rowAttributes = Object.extend({id: "visualSearchHistoryNode_" + nodeID}, rowAttributes);
		}
		var innerSpan = Builder.node("span", {className: "vsHistoryTitleText"});
		var row = Builder.node("div", rowAttributes, [
		    Builder.node("img", {className: "vsHistoryThumnail", src: imagePath, height: "40", width: "44", alt: "", title: ""}),
		    innerSpan
		]);
		innerSpan.update(MessageHelper.format("visualSearchController_returnTo", link));
		
		this.drawerChest[this.drawerChest.length] = row;
		
		this.outerDiv.insert({top: row});
		this.refreshElements();
		
		var node = this.elementMap.get(rowAttributes.id);
		Event.observe(node, "mousedown", this.visualSearchHistoryListener.bind(this, node));
		Event.observe(node, "mouseover", this.visualSearchHistoryOverListener.bind(this, node));
		Event.observe(node, "mouseout", this.visualSearchHistoryOutListener.bind(this, node));
		
		if (this.drawerChest.length > 1) {
			var appearingDrawer = this.drawerChest[this.drawerChest.length - 2];
			
			appearingDrawer.show();
			this.outerDiv.setStyle({top: "-" + appearingDrawer.getHeight() + "px"});
			new Effect.Move(this.outerDiv, {x: 0, y: appearingDrawer.getHeight(), duration: 0.5,
				afterFinish: function() {
				}
			});
		}
	},

	closeDrawer: function(historyLinkID) {
		var targetRow;
		var newDrawer = [];
		var removeDrawer = [];
		var heightToClose = 0;
		
		var foundDrawer = false;
		for(var i=0; i < this.drawerChest.length; i++) {
			if (! foundDrawer && this.drawerChest[i].down("a").identify() != historyLinkID) {
				newDrawer[i] = this.drawerChest[i];
			} else {
				if (this.drawerChest[i].visible()) {
					heightToClose += this.drawerChest[i].getHeight();
				}
				if (! foundDrawer) {
					newDrawer[i] = this.drawerChest[i];
					targetRow = this.drawerChest[i];
				} else {
					removeDrawer[removeDrawer.length] = this.drawerChest[i];
				}
				foundDrawer = true;
			}
		}

		new Effect.Move(this.outerDiv, {
			x: 0, y: -heightToClose, duration: 0.5,
			afterFinish: this.cleanUpDrawerClose.bind(this, targetRow, removeDrawer, newDrawer)});
	},
	
	cleanUpDrawerClose: function(targetRow, removeDrawer, newDrawer) {
		targetRow.hide();
		for (var i=0; i < removeDrawer.length; i++) {
			removeDrawer[i].remove();
		}
		this.outerDiv.setStyle({top: "0px"});
		
		this.drawerChest = newDrawer;
		
		if (this.drawerChest.length == 0) {
			this.addHomeDrawer();
		}
	},

	addHomeDrawer: function(description) {
		this.addDrawer("/images/icons/general/spacer.gif", description, null);
	}
    

});