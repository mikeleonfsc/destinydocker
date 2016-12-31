/* patronFindAutoComplete.js */
Class.create(BaseDestinyAutoCompleter, {
	initialize: function($super, textFieldID, suggestionsID, errorDiv, inputField, loader, options) {
		this.errorDiv = errorDiv;
		this.inputField = inputField;
	    $super(textFieldID, suggestionsID, Object.extend( {
	    	minChars: 1,
		    updateElement: this.myUpdateElement.bind(this)
	    }, options));
	    
	    this.loader = loader;
	    this.enable();
	},

	reEnableSaveForSafari: function() {
		this.dialog.autocompleter.saveEnabled = true;
	},

	myUpdateElement: function(index) {
		this.dialog = Registry.lookup("RecommendationController.RecommendationDialog");		
		if (index) {
		    if (Object.isElement(index)) {
				index = index.autocompleteIndex;
		    }
		    
			var myPatron = this.dialog.autocompleter.patronData[index];
			
			if (Prototype.Browser.WebKit > 0) {
				// hokey safari 2.x fix for auto-submitting on patron select
				this.dialog.autocompleter.saveEnabled = false;
				var boundReEnable = this.reEnableSaveForSafari.bind(this);
				boundReEnable.delay(0.5);
			} else {
				this.dialog.autocompleter.saveEnabled = true;
			}
			   
			this.dialog.autocompleter.selectedPatron = myPatron.patronID;						
			this.dialog.autocompleter.selectedPatronName = myPatron.patronName; 
			this.dialog._selectPatron();
		}
	},	
	
	onComplete: function() {
		this.ajaxInProgress = false;
		
		var json = this.data;
		this.patronData = $H(json.patronData);
		if (this.hasFocus) {
    		this.updateChoices(json.autocompleteDOM);
		} else if (this.patronData && this.patronData.size() > 0){
			var patronToSelect = this.patronData.keys()[0];
			if (this.patronData.get(patronToSelect).patronID >= 0) {
    			this.myUpdateElement(patronToSelect);
			} else {
				var errorSpan = $("addRecommendationError"); 
				errorSpan.update(MessageHelper.format("recommendationController_noMatchesFound"));
				errorSpan.show();
			}
		}
		
		this.stopIndicator();
	},
	
	updateChoices: function() {
		if(!this.changed && this.hasFocus) {
			Element.cleanWhitespace(this.update);
			Element.cleanWhitespace(this.update.down());
			
			if(this.update.firstChild && this.update.down().childNodes) {
				this.entryCount =
					this.update.down().childNodes.length;
				for (var i = 0; i < this.entryCount; i++) {
					var entry = this.getEntry(i);
					entry.autocompleteIndex = i;
					this.addObservers(entry);
				}
			} else {
				this.entryCount = 0;
			}
			
			this.stopIndicator();
			this.index = 0;
			
			if(this.entryCount==1 && this.options.autoSelect) {
				this.selectEntry();
				this.hide();
			} else {
				this.render();
			}
		}
	},
	
	addObservers: function(element) {
	    Event.observe(element, "mouseover", this.onHover.bindAsEventListener(this));
	    Event.observe(element, "click", this.onClick.bindAsEventListener(this));
	},
	
	startIndicator: function($super) {
		$super();
		this.ajaxInProgress = true;
		window.ajaxTracker.abortAllRequests();
	},
	
	stopIndicator: function($super) {
		if (! this.ajaxInProgress) {
			$super();
		}
	},
	
	onKeyPress: function($super, event) {
		if(! this.active && event.keyCode==Event.KEY_RETURN) {
			if (event) {
				Event.stop(event);
			}
			this.inputField.activate();
		} else {
			$super(event);
		}
	},

	getUpdatedChoices: function($super) {
		if (this.enabled && this.oldElementValue != this.element.value) {
	    	this.startIndicator();
	    	this.loader();
	    }
	},

	updateChoices: function() {
	    // Had to copy paste all of this code since by default the auto completer will ALWAYS
	    //  select the first element in the list. This isn't nice from a usability standpoint.
	    if(!this.changed && this.hasFocus) {       
	      Element.cleanWhitespace(this.update);
	      if (this.update.firstChild) {
	        Element.cleanWhitespace(this.update.down());
	      }
	
	      if(this.update.firstChild && this.update.down().childNodes) {
	        this.entryCount = 
	          this.update.down().childNodes.length;
	        for (var i = 0; i < this.entryCount; i++) {
	          var entry = this.getEntry(i);
	          entry.autocompleteIndex = i;
	          this.addObservers(entry);
	        }
	      } else {
	        this.entryCount = 0;
	      }
	
	      this.stopIndicator();
	      this.index = 0;      // this is the line that was changed, it used to be "this.index = 0;"
	      
	      if(this.entryCount==1 && this.options.autoSelect) {
	        this.selectEntry();
	        this.hide();
	      } else {
	        this.render();
	      }
	    }
	    this.updated = false;
	},
	
	getToken: function() {
	  	var bounds = this.getTokenBounds();
	  	return this.element.value.substring(bounds[0], bounds[1]);
	},
	
	reset: function() {
		this.patronData = null;
		this.selectedPatron = null;
	},
	
	enable: function() {
	    this.enabled = true;
	},
	
	disable: function() {
	    this.enabled = false;
	}

});

