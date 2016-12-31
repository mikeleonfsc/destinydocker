/* publiclists-results.js */
Class.create(BaseController, {
	init: function() {
		var publicLists = Registry.lookup("PublicListsController.Load");
		if (publicLists.isMyLists()) {
	        publicLists.useMyListsTab();
		} else {
			publicLists.setPublicListData(this.data, this.template);
			publicLists.usePublicListsTab();
		}
		publicLists.hideLoading();
	},
	
	registerEvents: function() {		
		for (var i = 0; i < this.data.results.length; i ++) {
			Event.observe(this.elementMap.get(this.data.rowPrefix + i), "click", this.openList.bind(this, this.data.results[i].listID, this.data.publicList));
		}
	},
	
	openList: function(listID, publicList) {
    	var params = {
    			width:"",
    			id:ResourceListController_DIV_RESOURCE_LIST_WINDOW,
    			zIndex:"10000",
    			hideOnOutsideClick:"true"
    	};
    	var modalDialog = new ModalDialog(params);
    	DAO.load({endpoint: "ResourceListController.Master", modal: modalDialog}, listID, "ResourceList", publicList);
	}
	
});