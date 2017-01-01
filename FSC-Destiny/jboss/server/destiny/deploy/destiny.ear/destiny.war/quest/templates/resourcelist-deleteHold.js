/* resourcelist-deleteHold.js */
Class.create(BaseController, {
    init: function(pageChange) {
		var resourceListMaster = Registry.lookup("ResourceListController.Master");
		var resourceList = Registry.lookup("ResourceListController.Holds");
		
		resourceListMaster.setTotalCount(this.data.totalCount);

		if (this.data.startIndex <= this.data.totalCount) {
			resourceList.pagedData[this.data.pageNumber] = this.data;
			resourceList.setPage(this.data.pageNumber);
		} else if (this.data.pageNumber > 0 && (this.data.pageNumber-1) < resourceList.pagedData.length){
			resourceList.pagedData[this.data.pageNumber-1].showNextButton = false;
			resourceList.setPage(this.data.pageNumber-1);
		} else {
			resourceList.pagedData[0] = this.data;
			resourceList.currentPage = null;
			resourceList.setPage(0);
		}
	},
    
    registerEvents: function() {
    }

});