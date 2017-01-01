/* review.js */
Class.create(BaseController, {
    init: function() {
		this.rating = 0;
		this.modal.show();
		
		this.rateLabel = MessageHelper.format("reviewController_rateThisTitle");
		
		var mainTitle = null;
		var bibTypeDescription = null;
		var miniBibTypeIconURL = null		
		//coming from shelves when we have the bibID and the shelfNumber, otherwise we are coming from title details
		if (this.data.bibID && this.data.shelfNumber >= 0 ) {
	    	var shelf = Registry.lookup("MyQuestShelfController.Loader");
	    	for (i = 0; i < shelf.data.data.dateGroups.length; i ++ ) {
	    		var group = shelf.data.data.dateGroups[i];
	    		for (j = 0; j < group.items.length; j ++) {	    			
	    			var item = group.items[j];
	    			if (item.bibID == this.data.bibID && item.shelfNumber ==  this.data.shelfNumber) {
	    				mainTitle = item.title;
	    				bibTypeDescription = item.bibTypeDescription;
	    				miniBibTypeIconURL = item.miniBibTypeIconURL;
	    				break;
	    			}
	    		}
	    	}		
	    	this.bibID = this.data.bibID;
	    	this.dcpiRecordGUID = this.data.dcpiRecordGUID;
		} else {		
			var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
			if (titleDetails) {
				mainTitle = titleDetails.getTitle();
				bibTypeDescription = titleDetails.getBibTypeDescription();
				miniBibTypeIconURL = titleDetails.getMiniBibTypeIconURL();
				this.bibID = titleDetails.getBibID();
			} else {
				titleDetails = Registry.lookup("TitleDetailsController.DCPITitleDetails");
				if (titleDetails) {
					mainTitle = titleDetails.getTitle();
					bibTypeDescription = titleDetails.data.typeDescription;
					miniBibTypeIconURL = titleDetails.data.typeIcon;
					this.dcpiRecordGUID = titleDetails.data.dcpiRecordGUID;
				}
			}
		}

		var icon = new Element("img", {alt: bibTypeDescription, title: bibTypeDescription, height: 16, border: 0, width: 20, src: miniBibTypeIconURL});
		var span = new Element("span");
		span.update(mainTitle);
		this.elementMap.get(ReviewController_DIV_ADD_REVIEW_TITLE).insert(icon);
		this.elementMap.get(ReviewController_DIV_ADD_REVIEW_TITLE).insert(span);
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(ReviewController_BUTTON_ADD_REVIEW_SAVE), "mousedown", this.saveReview.bind(this));
        Event.observe(this.elementMap.get(ReviewController_BUTTON_ADD_REVIEW_CLOSE), "mousedown", this.closeDialog.bind(this));
        
        for (var i = 1; i <= 5; i++) {
        	Event.observe(this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i), "mouseover", this._doStarOver.bind(this, i));
        	Event.observe(this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i), "mouseout", this._doStarOut.bind(this));
        	Event.observe(this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i), "mousedown", this._doSetRating.bind(this, i));
        }
    },

    saveReview: function(event) {
    	this.elementMap.get(ReviewController_DIV_ADD_REVIEW_SAVE_AREA).hide();
    	var commentObj = this.elementMap.get(ReviewController_FIELD_ADD_REVIEW_COMMENT);
    	var comments = "";
    	if (Object.isElement(commentObj)) {
    		comments = commentObj.getValue();
    	}
        if (!DAO.load({endpoint: "ReviewController.ReviewStash", method:'post'}, this.bibID, this.dcpiRecordGUID, this.rating, comments)) {
        	this.elementMap.get(ReviewController_DIV_ADD_REVIEW_SAVE_AREA).show();
        }
    },

    closeDialog: function () {
        this.modal.closeDialog();
    },

    _doStarOver: function(whichStar) {
        this.redFont = this.stickyRating;
        for (i=1; i <= whichStar; i++) {
            var starObj = this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i);
            if (starObj) {
                starObj.removeClassName("rating_large_half");
                starObj.removeClassName("rating_large_empty");
                starObj.addClassName("rating_large_full");
            }
        }
        for (i=(whichStar+1); i <= 5; i++) {
            var starObj = this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i);
            if (starObj) {
                starObj.removeClassName("rating_large_half");
                starObj.removeClassName("rating_large_full");
                starObj.addClassName("rating_large_empty");
            }
        }

        var ratingText = this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT);
        ratingText.style.color = "black";
        if (whichStar == 1) {
        	ratingText.update(MessageHelper.format("reviewController_poor"));
        } else if (whichStar == 2) {
        	ratingText.update(MessageHelper.format("reviewController_fair"));
        } else if (whichStar == 3) {
        	ratingText.update(MessageHelper.format("reviewController_ok"));
        } else if (whichStar == 4) {
        	ratingText.update(MessageHelper.format("reviewController_good"));
        } else if (whichStar == 5) {
        	ratingText.update(MessageHelper.format("reviewController_awesome"));
        } else{
        	ratingText.update(MessageHelper.format("reviewController_rateThisTitle"));
        	ratingText.style.color = "#CC0000";
        } 
    },

    _doStarOut: function() {
	    for (i=1; i <= this.rating; i++) {
	        var starObj = this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i);
	        if (starObj) {
	            starObj.removeClassName("rating_large_half");
	            starObj.removeClassName("rating_large_empty");
	            starObj.addClassName("rating_large_full");
	        }
	    }
	    
	    for (i = this.rating + 1; i <= 5; i++) {
	        var starObj = this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX + i);
	        if (starObj) {
	            starObj.removeClassName("rating_large_half");
	            starObj.removeClassName("rating_large_full");
	            starObj.addClassName("rating_large_empty");
	        }
	    }
	    
	    this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT).update(this.rateLabel);
	    var textColor = "black";
	    if (this.rateLabel == MessageHelper.format("reviewController_rateThisTitle")) {
	        textColor = "#CC0000";
	    }
	    this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT).style.color = textColor;
	},
	
	_doSetRating: function(rating) {
	    this.rating = rating;
	    this.rateLabel = this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT).innerHTML;
	},
	
	showError: function(error) {
		this.elementMap.get(ReviewController_DIV_ADD_REVIEW_ERRORS).update(error);
		this.elementMap.get(ReviewController_DIV_ADD_REVIEW_ERRORS).show();                
    	this.elementMap.get(ReviewController_DIV_ADD_REVIEW_SAVE_AREA).show();
	}
	
    
});