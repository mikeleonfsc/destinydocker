/* autosuggest.js */
Class.create(BaseController, {
	init: function() {	
	  var searchBoxController = Registry.lookup("SearchBoxController.SearchBox");
	  searchBoxController.showSuggestions();
	  
	},
	
	registerEvents: function() {

	}
	
});