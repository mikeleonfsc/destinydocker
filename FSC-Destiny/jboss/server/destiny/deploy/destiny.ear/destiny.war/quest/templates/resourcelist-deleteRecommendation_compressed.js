Class.create(BaseController,{init:function(c){var b=Registry.lookup("ResourceListController.Master");var d=Registry.lookup("ResourceListController.Recommendations");b.setTotalCount(this.data.totalCount);if(this.data.startIndex<=this.data.totalCount){d.pagedData[this.data.pageNumber]=this.data;d.setPage(this.data.pageNumber)}else{if(this.data.pageNumber>0&&(this.data.pageNumber-1)<d.pagedData.length){d.pagedData[this.data.pageNumber-1].showNextButton=false;d.setPage(this.data.pageNumber-1)}else{d.pagedData[0]=this.data;d.currentPage=null;d.setPage(0)}}var a=Registry.lookup("MyQuestUpdatesController.Loader");if(!a){a=Registry.lookup("MyQuestInboxController.Loader")}if(a){a.removeRecommendationCallback(this.data)}},registerEvents:function(){}});