/* myquestshelfinit.js */
Class.create(BaseController, {
	init: function() {
		var loader = Registry.lookup("MyQuestController.Loader");
	    
	    $("searchtemplate").removeClassName("home");
	    $("searchtemplate").removeClassName("search");
	    $("searchtemplate").addClassName("bookClub");
	    
		var json = this.data;		
		//shelfSelect sets up the listeners for the shelf dropdown
		this.shelfSelect = new ShelfSelect({id: "myQuestMainContent"});
		
		this.currentMode = json.mapping;
        
        var menu = Registry.lookup("MyQuestController.Menu");
        if(json.inboxCount >= 0){
            menu.updateInboxCount(json.inboxCount);
        }    
        
        this.records = [];
        
        for (i = 0; i < this.data.data.dateGroups.length; i ++) {
        	var dateGroup = this.data.data.dateGroups[i];
        	for (j = 0; j < dateGroup.items.length; j ++) {
        		var item = dateGroup.items[j];
        		this.records.push(item);
        	}
        }
        
		var HoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
		this.hoverGroup = HoverMaster.createGroup({
			name: this.name,
			data: this.records,
			activatorContainer: this.container,
			hoverContainer: $("content-outer"),
			controllerURL: this.data.hoverControllerURL,
			templateURL: this.data.hoverTemplateURL,
			openDelay: 0.5,
			closeDelay: 0.1,
			onShow: function() {
				var oldHighZParent = Utility.downToClass($("myQuestShelfHeaderResults"), "high-zindex");
				if(oldHighZParent) {
					oldHighZParent.removeClassName("high-zindex");
				}
				var newHighZParent = this.currentActivator.up();
				newHighZParent.addClassName("high-zindex");
				
				$("content-outer").addClassName("high-zindex");
			},
			onHide: function() {
				$("content-outer").removeClassName("high-zindex");
			}
		});
 	},
	
	registerEvents: function() { 	
 		Event.observe($(MyQuestShelfController_DIV_MYQUEST_SHELVES_HEADER_RESULTS), "click", this.doRecommendation.bindAsEventListener(this));

 		Event.observe($(MyQuestShelfController_DIV_MYQUEST_SHELVES_HEADER_RESULTS), "click", this.doReview.bindAsEventListener(this));		
 		
 		var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");	
 		var yoda = 0;
 		
		for (i = 0; i < this.data.data.dateGroups.length; i ++ ) {
    		var group = this.data.data.dateGroups[i];
    		for (j = 0; j < group.items.length; j ++) {	    			
    			var item = group.items[j];
    			var titleDetailsLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, item.bibID, null);
    			
    			var avgRatingLink = this.elementMap.get(MyQuestShelfController_AVERAGE_RATING_PREFIX + yoda);
    			var cover = this.elementMap.get(MyQuestShelfController_CLASS_MYQUEST_SHELF_COVER_WRAPPER + yoda);
    			var titleLink = this.elementMap.get(MyQuestController_ID_TITLE_DETAIL_LINK_PREFIX + item.bibID);
    			var remove = this.elementMap.get(MyQuestController_ID_MYQUEST_SHELF_ITEM_REMOVE + yoda);
    			
    			if (!item.shelfBib && avgRatingLink) {
    				var reviewLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, item.bibID, TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS);
    				Event.observe(avgRatingLink, "mousedown", reviewLoader);
    			}	
    			if (cover) {
    				Event.observe(cover, "mousedown", titleDetailsLoader);
    			}
    			if (titleLink) {
    				Event.observe(titleLink, "mousedown", titleDetailsLoader);
    			}
    			if (remove) {
    				Event.observe(remove, "click", this.removeFromShelf.bind(this, item.bibID, item.shelfNumber));
    			}
    			yoda ++;
    		}
    	}		
 	},
 	
 	updatePendingReviewForBib: function(bibID, pending) {
 		var tmp = $$(".recordID[value=" + bibID + "]")[0];
 		var shelfItem = tmp.up();
 		var wrapper = Utility.downToClass(shelfItem, "myQuestTitleMyRatingWrapper");
 		wrapper.innerHTML = "<p><em class=\"label\">" + pending + "</em></p>";
 		
 	},
 	
    updateReviewForBib: function(bibID, myRating, avgRating) {
    	var tmp = $$(".recordID[value=" + bibID + "]")[0];
    	var shelfItem = tmp.up();
    	var myRatingDiv = Utility.downToClass(shelfItem, "titleDetailsAddReviewClass").down();
    	for (var i = 0; i < myRating; i ++) {
    		myRatingDiv.children[i].removeClassName("rating_small_empty");
    		myRatingDiv.children[i].addClassName("rating_small_full");
    	}
    	var wrapper = Utility.downToClass(shelfItem, "myQuestTitleMyRatingWrapper");
    	var avgRatingDiv = wrapper.down("a");
    	if (avgRatingDiv) {
    		avgRatingDiv.update(MessageHelper.format("myQuestShelfController_averageRating", avgRating));
    	} else {
    		// need to add average rating
    		var shelfItem = Utility.upToClass(wrapper, "myQuestShelfItem");
    		var idx = 999;
    		if (shelfItem) {
    			var i = shelfItem.identify().indexOf("_");
    			idx = shelfItem.identify().substring(i+1);
    		}
    		var reviewSpan = $(MyQuestController_ID_TITLE_DETAILS_ADD_REVIEW + "_" + idx);
    		if(reviewSpan) {
    			reviewSpan.removeClassName(MyQuestController_CLASS_TITLE_DETAILS_ADD_REVIEW);
    		}
    		var avgRatingID = "averageRating_" + idx;
    		wrapper.down().innerHTML += "(<a id=\""+avgRatingID+"\" class=\"titleDetailLink reviewLink\" onclick=\"return false;\" href=\"#\">"+ MessageHelper.format("myQuestShelfController_averageRating", avgRating) + "</a>)";
    		
			var avgRatingLink = $(avgRatingID);
    		if (avgRatingLink) {
    			var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
    			if(titleDetailsMaster){
					Event.observe(
						avgRatingLink, 
						"mousedown", 
						titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, bibID, TitleDetailsController_DIV_TITLE_DETAIL_TAB_REVIEWS));
    			}
			}
    	}
    },
 	
 	removeFromShelf: function(bibID, shelfNumber) {
    	DAO.load({endpoint: "MyQuestShelfController.ShelfRemove", container:null}, bibID, shelfNumber);
    },
    
    doRecommendation: function(event){    
    	var eventSource = Event.element(event);
    	if (eventSource.hasClassName("shelfListAddRecommendationClass")) {
	    	var bibID = eventSource.getAttribute("value");
	    		    	    	
	    	var params = {
	    			width:"610",
	    			id:RecommendationController_DIV_ADD_RECOMMENDATION_DIALOG,
	    			zIndex:"50000",
	    			hideOnOutsideClick:"true"
	    	};
	    	var modalDialog = new ModalDialog(params);
	    	DAO.load({endpoint: "RecommendationController.RecommendationDialog", modal: modalDialog}, bibID);
    	}
    },
    
    doReview: function(event){    
    	var eventSource = Event.element(event);
    	var darthVader = eventSource.up().up();
    	if (eventSource.hasClassName("titleDetailsAddReviewClass") || darthVader.hasClassName("titleDetailsAddReviewClass")) {
    		var x = Utility.upToClass(eventSource,"myQuestShelfItem");

    		var y = Utility.downToClass(x, "shelfNumber");
    		var shelfNumber = y.getAttribute("value");    		
    		var z = Utility.downToClass(x, "recordID");
    		var bibID = z.getAttribute("value");
    		
    		var params = {
    				width:"400",
    				id:ReviewController_DIV_ADD_REVIEW_DIALOG,
    				zIndex:"50000",
    				hideOnOutsideClick:"true"
    		};
    		var modalDialog = new ModalDialog(params);
    		DAO.load({endpoint: "ReviewController.ReviewDialog", modal: modalDialog}, bibID, shelfNumber);
    	}
    },
    
    updateShelfResults: function (IDs, value) {        
		for (var j = 0; j < this.records.length; j++) {
			var record = this.records[j];
			if (IDs.indexOf(record.bibID) >= 0) {
				//we found our guy
				record.inUsersBookList = value;
			}        
		}
	},
    
    getShelfNumber: function(){
		return this.data.shelfNumber;
	},
	
 	removeFromShelfCallback: function (json) {
		var recObj = $$("#"+MyQuestShelfController_DIV_MYQUEST_SHELVES_HEADER_RESULTS+" .recordID[value=" + json.bibID+"]");
		
		if(recObj.length !== 0){
			var obj = recObj[0].up();
			
	 		var that = this;
	 		Effect.BlindUp(obj.id, { duration: 0.5, 
	 			afterFinish: function() { 
	 			if (obj.previous().hasClassName(MyQuestController_CLASS_ACTIVITY_TIMESTAMP) && 
	 					(obj.next() == undefined || !obj.next().hasClassName(MyQuestController_CLASS_MYQUEST_SHELF_ITEM))) {
	 				obj.previous().remove();
	 			}
	 			obj.remove();
	 			
	 			var myquestloader = Registry.lookup("MyQuestController.Loader");
				if(myquestloader){
					if($$(".recordID").length == 0){
		 				myquestloader.loadShelf(that.getShelfNumber());
		 			}
				}
	 		} });
		}
    }
});