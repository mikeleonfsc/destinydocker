/* publiclists.js */
Class.create(BaseController, {
	init: function() {
		// Note: users need to have either access my lists or view public lists to get here, so we're assuming if
		// they don't have one, then they have the other one.
		
		this.showLoading();
		// default to My Lists tab unless user does not have permission to view my lists.
		if (this.data.canViewMyLists) {
			this.myLists = true;
			this.loadMyListsTab();
		} else {
			this.hideMyListsTab();
			this.loadPublicListsTab();
		}
		// if user does not have permission to view public lists, hide the tab.
		if (!this.data.canViewPublicLists) {
			this.hidePublicListsTab();
		}
	},
	
	registerEvents: function() {
		Event.observe(this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_MY_LISTS), "click", this.loadMyListsTab.bind(this));
		Event.observe(this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_PUBLIC_LISTS), "click", this.loadPublicListsTab.bind(this));
	},
	
	showLoading: function ()  {
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_LOADING).show();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_TAB_WIDGET).hide();
	}, 
	
	hideLoading: function () {
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_LOADING).hide();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_TAB_WIDGET).show();
	},
	
	hidePublicListsTab: function() {
		this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_PUBLIC_LISTS).hide();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_PUBLIC_LISTS).hide();
	},
	
	hideMyListsTab: function() {
		this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_MY_LISTS).hide();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_MY_LISTS).hide();
	},
	
	loadMyListsTab: function() {
		this.myLists = true;
		DAO.load({endpoint: "PublicListsController.MyLists", container: this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_MY_LISTS)});
	},
	
	loadPublicListsTab: function() {
		this.myLists = false;
		DAO.load({endpoint: "PublicListsController.PublicLists", container: this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_PUBLIC_LISTS)});
	},
	useMyListsTab: function() {
		this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_MY_LISTS).addClassName("tabActive");
		this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_PUBLIC_LISTS).removeClassName("tabActive");
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_MY_LISTS).show();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_PUBLIC_LISTS).hide();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTROLS).hide();
		this.myLists = true;
	},
	
	usePublicListsTab: function() {
		this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_MY_LISTS).removeClassName("tabActive");
		this.elementMap.get(PublicListsController_LI_PUBLIC_LISTS_TAB_PUBLIC_LISTS).addClassName("tabActive");
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_MY_LISTS).hide();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTENT_PUBLIC_LISTS).show();
		this.elementMap.get(PublicListsController_DIV_PUBLIC_LISTS_CONTROLS).show();
		this.elementMap.get(PublicListsController_INPUT_PUBLIC_LISTS_SEARCH).focus();
		this.myLists = false;
	},
	
	isMyLists: function() {
		return this.myLists;
	},
	
	setPublicListData: function(json, resultTemplate) {
		this.publicListData = json;
		if (! this.isMyLists()) {
			this.elementMap.get(PublicListsController_INPUT_PUBLIC_LISTS_SEARCH).setValue("");
			this.autocomplete = new this.AutoCompleter(PublicListsController_INPUT_PUBLIC_LISTS_SEARCH, 
					PublicListsController_DIV_PUBLIC_LISTS_CONTENT_PUBLIC_LISTS, 
					PublicListsController_PREFIX_PUBLIC_LISTS_ROW, this.publicListData, resultTemplate);
		}
	},
	
	AutoCompleter: Class.create(Autocompleter.Local, {
		initialize: function($super, inputID, contentID, rowPrefixID, data, template) {
			this.template = template;
			this.templateData = data;
			var convert = this.selectEntriesAndApplyTemplate.bind(this);
		    var options = {
		    	choices: 1000,
		      	partialSearch: true,
		      	partialChars: 1,
		      	ignoreCase: true,
		      	fullSearch: true,
		      	selector: function(instance) {
					var entry = instance.getToken();
					return convert(instance.rowPrefixID, instance.options.array, entry);
		      	}
		    };
			
			$super(inputID, contentID, data.results, options);
			
			this.rowPrefixID = rowPrefixID;
			
			Element.show(this.update);

			this.changed = false;
			this.hasFocus = true;
			this.options.minChars = 0;		// Force this thing to zero
			this.getUpdatedChoices();
		},

		hide: function($super) {
			// DO NOTHING BECAUSE WE DON'T WANT TO HIDE
		},

		selectEntriesAndApplyTemplate: function(rowPrefixID, values, entry) {
			var ret       = []; // Beginning matches
			
			for (var i = 0; i < values.length; i++) {
				var elem = values[i];
				var foundPos = -1;
				if (entry) {
			    	foundPos = elem.name.toLowerCase().indexOf(entry.toLowerCase());
			    	
			    	if (foundPos == -1) {
			    		// Didn't find the text in the name field, check description
			    		foundPos = elem.description.toLowerCase().indexOf(entry.toLowerCase());
			    	}
				} else {
					// Did not specify an "entry" (ie. filter string), show all elements then
					foundPos = 0;
				}

		    	if (foundPos != -1) {
		    		ret.push(elem);
		    	}
			}
			
			this.templateData.results = ret;
			
			return this.template.render(this.templateData);
		},

		onClick: function(event) {
			var element = Event.findElement(event, "LI");
			var listID = element.readAttribute("listID");
			
			var params = {
	    			width:"",
	    			id:ResourceListController_DIV_RESOURCE_LIST_WINDOW,
	    			zIndex:"10000",
	    			hideOnOutsideClick:"true"
	    	};
	    	var modalDialog = new ModalDialog(params);
	    	DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, listID, "ResourceList", true);
	    	
//		    var listName = Utility.downToClass(element, 'publicListsItem').innerHTML.strip();
//		    var obj = $("publicListsOuter");
//		    if (obj && listID) {
//		    	obj.fire('ajax:localACClick', {listID: listID, listName: listName});
//		    }
		},

		onKeyPress: function($super, event) {
		    //we need to capture return and tab keys so that the autosuggestion does not populate the search box for 
		    //public list searching
		    if(event.keyCode==Event.KEY_RETURN || event.keyCode==Event.KEY_TAB) {
		        Event.stop(event);
		    } else {
		        $super(event);
		    }
		}
	})
});