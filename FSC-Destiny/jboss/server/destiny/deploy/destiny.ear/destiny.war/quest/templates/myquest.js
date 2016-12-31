/* myquest.js */
Class.create(BaseController, {
	init: function() {
        var myQuestShelves = Registry.lookup("MyQuestController.MyShelves");
        // TODO: This block needs to be fixed. We should not be hiding divs from other controllers directly
	        //hide the top 10 and new arrivals cuz IE 7 is just not happy w/ these empty divs hangin around in the dom
            $(Top10Controller_DIV_TOP10).hide();
            $(NewArrivalsController_DIV_NEW_ARRIVALS_MAIN).hide();
            $(PublicListsController_DIV_PUBLIC_LISTS_MAIN).hide();
        // END
        if(myQuestShelves) {
        	var shelfToLoad = myQuestShelves.getCurrentlyLoadingShelf();
        	if(shelfToLoad) {
        		this.loadShelf(shelfToLoad);
        		myQuestShelves.clearCurrentlyLoadingShelf();
        	} 
        } else {
        	if(this.data.loadInbox) {
        		this.loadInBox();
        	} else {
        		this.loadUpdates();
        	}
        }
        var menubar = Registry.lookup("MenuBarController.MenuData");
		menubar.setViewMode(MenuBarController_VIEW_MODE_BOOK_CLUB);
	},
	
	registerEvents: function() {
	},
	
	loadShelf: function(shelfToLoad) {
		Registry.unregister("NewArrivalsController.Loader");
    	Registry.unregister("Top10Controller.Top10");
    	Registry.unregister("PublicListsController.Load");
    	Registry.unregister("LimiterController.Limiters");
    	Registry.unregister("VisualSearchController.VisualSearch");
    	
    	var searchType = Registry.lookup("SearchTypeController.Selector");
    	if (searchType && Object.isFunction(searchType.hide)) {
    		searchType.hide();
    	}
		this.updateWrapperClass("myQuestShelf" +  shelfToLoad);
        return DAO.load({endpoint:"MyQuestShelfController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)}, shelfToLoad);
	},
	
	loadUpdates: function() {
		this.updateWrapperClass("myQuestUpdates");
    	return DAO.load({endpoint:"MyQuestUpdatesController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)});
	},
	
	loadInBox: function() {
		this.updateWrapperClass("myQuestInbox");
        return DAO.load({endpoint:"MyQuestInboxController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)});
	},
	
	loadFriends: function() {
		this.updateWrapperClass("myQuestFriends");
        return DAO.load({endpoint:"MyQuestFriendsController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)});
	},
	
	loadPreferences: function() {
		this.updateWrapperClass("myQuestPref");
        return DAO.load({endpoint:"MyQuestPreferencesController.Loader", container: $(MyQuestController_DIV_MYQUEST_MAIN_CONTENT)});
	},
	
	updateWrapperClass: function(className) {
		// for some reason, in IE7, this.elementMap is null, but when we set a break point here
		//  it shows it as being populated
		if ($(MyQuestController_DIV_MYQUEST_MAIN_CONTENT_WRAPPER)) {
			// It can be null if you are on search results and click on a shelf
			$(MyQuestController_DIV_MYQUEST_MAIN_CONTENT_WRAPPER).className = className;
		}
	},
	
	showLoading: function() {
		var html = ReusableTemplates.load("EmptyImageTemplate", {id:"loading",styleClass:"loading", altText: MessageHelper.format("myQuestController_loading")});
		this.elementMap.get(MyQuestController_DIV_MYQUEST_MAIN_CONTENT).update(html);
	},
	
	updateContent: function(html) {
		this.elementMap.get(MyQuestController_DIV_MYQUEST_MAIN_CONTENT).innerHTML = html;
	},
	
    updateShelfCounts: function (json) {
    	this.elementMap.get(MyQuestController_DIV_MYQUEST_HAVE_READ_COUNT).down("a").update(json.haveread);
    	this.elementMap.get(MyQuestController_DIV_MYQUEST_CURRENT_COUNT).down("a").update(json.current);
    	this.elementMap.get(MyQuestController_DIV_MYQUEST_TO_READ_COUNT).down("a").update(json.toread);
    }    
    
});