/* shelfbrowse.js */
Class.create(BaseController, {
    init: function() {
		if (this.modal && Object.isElement(this.modal.contentDiv)) {
			this.modal.show();
			this.shelfBrowsePreLoad();
		}
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(ShelfBrowseController_ID_SHELF_BROWSE_CLOSE), "mousedown", this.closeDialog.bind(this));
        Event.observe(this.elementMap.get(ShelfBrowseController_LINK_SHELF_BROWSE_NEXT), "mousedown", this.clickNext.bind(this));
        Event.observe(this.elementMap.get(ShelfBrowseController_LINK_SHELF_BROWSE_PREVIOUS), "mousedown", this.clickPrevious.bind(this));
    },

    closeDialog: function() {
    	this.modal.closeDialog();
    	this.hideControls();
        this.resetCarousel();
    },
    
    hideControls: function() {
    	this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_CONTROLS).hide();
    },
    
    showControls: function() {
    	this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_CONTROLS).show();
		
        var handle = this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_SLIDER_CONTROL);
        var track = this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_SLIDER);
        this.slider = new Control.Slider(handle, track, {
        	onChange:this.drag.bind(this), 
        	onSlide:this.drag.bind(this), 
        	range: $R(0, this.data.shelfSize), 
        	sliderValue: this.data.currentIndex
        	});
    },
    
    hideLoading: function() {
        this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_LOADING).hide();
        this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).show();
        this.modal.centerDialog();
    },
    
    showLoading: function() {
        this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).hide();
        this.hideControls();
        this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_LOADING).show();
        this.modal.centerDialog();
    },

    shelfBrowsePreLoad: function() {
        this.showLoading();
        
    	var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
    	if (titleDetails) {
	    	var callNumber = titleDetails.getCallNumber();
	    	var callNumberCopyID = titleDetails.getCallNumberCopyID();
	    	var materialType = titleDetails.getMaterialType();
	        
	        DAO.load({endpoint: "ShelfBrowseController.ResultLoader"}, callNumber, callNumberCopyID, materialType);
    	}
    },

    clickNext: function() {
        this.cycleNext(true);
    },

    clickPrevious: function() {
        this.cyclePrevious(true);
    },
    
    _getRenderedComponent: function(index) {
        var json = this.data.shelfData[index];
        var options = {};
        var result = ReusableTemplates.load("HitListRecordTemplate", 
        	{
	        	record: json,
	        	currentID: "shelfBrowseRecord_" + index,
	        	options: options
	        });
        
        return result;
    },
    
    _removeRenderedComponent: function(index) {
    	var obj = $("searchResult_shelfBrowseRecord_" + index);
    	if (obj) {
    		obj.remove();
    	}
    },
    
    resetCarousel: function() {
    	this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).update("");
    	
        this.data.shelfData = null;
        this.data.currentIndex = 0;
        this.data.shelfSize = 0;
    },

    resetIndex: function() {
    	this.data.currentIndex = this.data.originalStartIndex;
    },

    addRecords: function(json) {
    	this.data.shelfData = json.results;
    	this.data.originalStartIndex = eval(json.startingPoint);
    	this.data.currentIndex = this.data.originalStartIndex;
        this.data.shelfSize = json.results.length;
    },
    
    _loadTitleDetails: function(loader) {
    	this.closeDialog();
    	var titleDetails = Registry.lookup("TitleDetailsController.TitleDetails");
    	if (titleDetails) {
    		titleDetails.closeDialog();
    	}
    	
    	loader();
    },
    
    _updateListeners: function(ids) {
    	var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
    	
    	for (var index = 0; index < ids.length; index ++) {
    		var idx = ids[index];
    		var json = this.data.shelfData[idx];
	        var bibID = json.bibID;
	        var image = $(CoverImageTemplate_DIV_TITLE_IMAGE_PREFIX + "shelfBrowseRecord_" + idx);
	        var link = $(HitListRecordTemplate_DIV_TITLE_PREFIX + "shelfBrowseRecord_" + idx); 
			var titleDetailsLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, bibID, null);
			if (Object.isElement(image)) {
				Event.observe(image, "mousedown", this._loadTitleDetails.bind(this, titleDetailsLoader));
			}
			if (Object.isElement(link)) {
				Event.observe(link, "mousedown", this._loadTitleDetails.bind(this, titleDetailsLoader));
			}
    	}
    },

    renderCarousel: function() {
    	var innerHTML = "";
    	
    	//  (We don't want to repeat the shelf if we have less than 5 results)
    	var length = 5;
    	if (length > this.data.shelfSize) {
    		length = this.data.shelfSize;
    	}
    	var ids = [];
    	
    	if (this.data.shelfSize > 0) {
    	    for (var index = 0; index < length; index ++) {
    	        // this.data.currentIndex is pointing to the book in the MIDDLE of
    	        //  the carousel, so we need to offset ourselves 2 books to the
    	        //  left
    	        var actualIndex = this.data.currentIndex + index -2;
    	        
    	        while (actualIndex < 0) {
    	        	actualIndex += this.data.shelfSize;
    	        }
    	        while (actualIndex >= this.data.shelfSize) {
    	        	actualIndex -= this.data.shelfSize;
    	        }
    	        
    	        var elementContent = this._getRenderedComponent(actualIndex);
    	        if (elementContent) {
    	            innerHTML += elementContent;
    	            ids.push(actualIndex);
    	        }
    	    }
    	} else {
            innerHTML = MessageHelper.format("shelfBrowseController_noTitlesFoundOnThisShelf");
        }

    	this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).innerHTML = innerHTML;
    	
    	this._updateListeners(ids);
        if (this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).visible) {
        	this.updateInfo();
        }
    },

    cycleNext: function(updatePosition) {
    	var deadIndex = this.data.currentIndex - 2;
    	if (deadIndex < 0) {
    		deadIndex += this.data.shelfSize;
    	}
        this._removeRenderedComponent(deadIndex);
    	
    	this.data.currentIndex++;
    	if (this.data.currentIndex >= this.data.shelfSize) {
    		this.data.currentIndex -= this.data.shelfSize;
    	}
    	
    	var addedIndex = this.data.currentIndex + 2;
    	if (addedIndex >= this.data.shelfSize) {
    		addedIndex -= this.data.shelfSize;
    	}
    	
    	var elementContent = this._getRenderedComponent(addedIndex);
    	this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).insert(elementContent);
    	
    	this._updateListeners([addedIndex]);
    	 
    	if (updatePosition) {
            this.updateSliderLocation();
    	}
    },

    cyclePrevious: function(updatePosition) {
    	var deadIndex = this.data.currentIndex + 2;
        if (deadIndex >= this.data.shelfSize) {
            deadIndex -= this.data.shelfSize;
        }
        this._removeRenderedComponent(deadIndex);
    	
    	this.data.currentIndex--;
        if (this.data.currentIndex < 0) {
            this.data.currentIndex += this.data.shelfSize;
        }

    	var addedIndex = this.data.currentIndex - 2;
        if (addedIndex < 0) {
            addedIndex += this.data.shelfSize;
        }
    	var elementContent = this._getRenderedComponent(addedIndex);
    	this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_INNER_CONTENTS).insert({top: elementContent});
    	
    	this._updateListeners([addedIndex]);
    	
    	if (updatePosition) {
            this.updateSliderLocation();
    	}
    },

    updateInfo: function() {
    	if (this.data.shelfSize <= 5) {
            this.hideControls();
    	} else {
        	this.showControls();
    	}
    	
    	this.updateSliderLocation();
    },

    updateSliderLocation: function() {
    	if (this.slider) {
    		this.slider.setValue(this.data.currentIndex);
    	}
    },

    drag: function(value) {
    	var control = this.elementMap.get(ShelfBrowseController_DIV_SHELF_BROWSE_SLIDER_CONTROL);
        var controlLeft = control.offsetLeft;
    	var oldIndex = this.data.currentIndex;
        var newIndex = Math.round(value);
        
    	if (oldIndex != newIndex) {
    		if (this.updateTimer) {
        		window.clearTimeout(this.updateTimer);
    		}
    		this.updateTimer = this.updateShelfOnDrag.bind(this).delay(0.02, oldIndex, newIndex);
    	}
    },

    updateShelfOnDrag: function(oldIndex, newIndex) {
    	this.updateTimer = null; // I clear this out for AT purposes
        if (oldIndex + 1 == newIndex) {
            this.cycleNext(false);
        } else if (oldIndex - 1 == newIndex) {
            this.cyclePrevious(false);
        } else if (oldIndex != newIndex) {
            this.data.currentIndex = newIndex;
            this.renderCarousel();
        }	
    }
});