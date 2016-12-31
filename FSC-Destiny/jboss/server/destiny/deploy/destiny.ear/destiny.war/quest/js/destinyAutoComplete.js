/* destinyAutoComplete.js */
Class.create(BaseDestinyAutoCompleter, {

// If we need to untie the autoComplete from the searchbox, you'll
// need to pass in the objects for window.inputValidator and also
// the submitSearch (and event name) [onClick].
    
initialize: function($super, textFieldID, suggestionsID, endPoint, minChars) {
    $super(textFieldID, suggestionsID, {
        minChars: minChars,
        updateElement: function(selectedElement) {
            if (selectedElement) {
                $(textFieldID).value = Utility.downToClass(selectedElement, "suggestionText").innerHTML;
            }
            this.onHide(textFieldID, suggestionsID);
            this.updated = true;
           
            var obj = Registry.lookup("SearchBoxController.SearchBox");
            if (Object.isFunction(obj.submitSearch)) { 
               obj.submitSearch();
            }
        }
    });
    this.endPoint = endPoint;
    this.enable();
},

fixIEOverlapping: function($super) {
    // Need to override this because scriptaculous sets it to 2 in IE which will place it underneath
    // our search results.
    $super();
    this.update.style.zIndex = 9000;
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
      this.index = -1;      // this is the line that was changed, it used to be "this.index = 0;"
      
      if(this.entryCount==1 && this.options.autoSelect) {
        this.selectEntry();
        this.hide();
      } else {
        this.render();
      }
    }
    this.updated = false;
	this.update.style.opacity = null;  //this is added to ensure we're not leaving an opicity style on the update element when the show/hide animations don't have time to finish
  },
  
getEntry: function(index) {
    // Since we now allow a negative index, we need to make this method safe
    if (index < 0) {
        return null;
    }    
    return this.update.firstChild.childNodes[index];
},

getUpdatedChoices: function($super) {
    if (this.enabled && this.oldElementValue != this.element.value) {
//        $super();
        DAO.load({endpoint: this.endPoint, container: this.update}, this.getToken());
    }
},

markPrevious: function($super) {
    if(this.index > 0) this.index--
      else this.index = this.entryCount-1;
// overriding this to set scrollIntoView to false, setting it to true was causing us to lose the search box when scrolling      
      this.getEntry(this.index).scrollIntoView(false);
},

onClick: function($super, event) {
    $super(event);
},

enable: function() {
    this.enabled = true;
},

disable: function() {
    this.enabled = false;
}

});