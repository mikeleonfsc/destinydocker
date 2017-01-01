Class.create(BaseController,{init:function(){this.updateShelfCounts(this.data)},registerEvents:function(){Event.observe(this.elementMap.get(MyQuestController_DIV_MYQUEST_HAVE_READ_COUNT),"click",this.loadHaveReadShelf.bind(this));Event.observe(this.elementMap.get(MyQuestController_DIV_MYQUEST_CURRENT_COUNT),"click",this.loadNowReadingShelf.bind(this));Event.observe(this.elementMap.get(MyQuestController_DIV_MYQUEST_TO_READ_COUNT),"click",this.loadWantToReadShelf.bind(this));this.addDroppable(MyQuestController_DIV_MYQUEST_HAVE_READ_COUNT,".canAddToShelf",this.dropIntoShelf.bind(this,MyQuestController_SHELF_HAVE_READ),{top:"0px",left:"17px"},"dragDropTarget");this.addDroppable(MyQuestController_DIV_MYQUEST_CURRENT_COUNT,".canAddToShelf",this.dropIntoShelf.bind(this,MyQuestController_SHELF_NOW_READING),{top:"0px",left:"17px"},"dragDropTarget");this.addDroppable(MyQuestController_DIV_MYQUEST_TO_READ_COUNT,".canAddToShelf",this.dropIntoShelf.bind(this,MyQuestController_SHELF_WANT_TO_READ),{top:"0px",left:"17px"},"dragDropTarget")
},dropIntoShelf:function(b,a){DAO.load({endpoint:"MyQuestShelfController.ShelfAdd",container:null},a,b)},disableDroppables:function(){$j("#"+MyQuestController_DIV_MYQUEST_HAVE_READ_COUNT).droppable("disable");$j("#"+MyQuestController_DIV_MYQUEST_CURRENT_COUNT).droppable("disable");$j("#"+MyQuestController_DIV_MYQUEST_TO_READ_COUNT).droppable("disable")},enableDroppables:function(){$j("#"+MyQuestController_DIV_MYQUEST_HAVE_READ_COUNT).droppable("enable");$j("#"+MyQuestController_DIV_MYQUEST_CURRENT_COUNT).droppable("enable");$j("#"+MyQuestController_DIV_MYQUEST_TO_READ_COUNT).droppable("enable")},updateShelfCounts:function(a){this.elementMap.get(MyQuestController_DIV_MYQUEST_HAVE_READ_COUNT).down("a").update(a.haveread);this.elementMap.get(MyQuestController_DIV_MYQUEST_CURRENT_COUNT).down("a").update(a.current);this.elementMap.get(MyQuestController_DIV_MYQUEST_TO_READ_COUNT).down("a").update(a.toread)},loadMyShelf:function(c){var b=Registry.lookup("MyQuestController.Loader");window.ajaxTracker.abortAllRequests();
Registry.lookup("LimiterController.History").reset(true);Registry.lookup("OneSearchController.SearchMaster").hide();Registry.lookup("SearchController.SearchMaster").hide();if(!b){this.currentlyLoadingShelf=c;PostLoadBootstrapper.load(["MyQuestController.Loader","MyQuestController.Menu"])}else{var a=b.loadShelf(c);if(a){b.showLoading()}}},loadHaveReadShelf:function(){this.loadMyShelf(MyQuestController_SHELF_HAVE_READ)},loadNowReadingShelf:function(){this.loadMyShelf(MyQuestController_SHELF_NOW_READING)},loadWantToReadShelf:function(b,a){this.loadMyShelf(MyQuestController_SHELF_WANT_TO_READ)},getCurrentlyLoadingShelf:function(){return this.currentlyLoadingShelf},clearCurrentlyLoadingShelf:function(){this.currentlyLoadingShelf=null}});