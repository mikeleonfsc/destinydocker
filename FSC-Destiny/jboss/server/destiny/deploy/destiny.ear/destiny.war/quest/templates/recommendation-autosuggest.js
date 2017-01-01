/* recommendation-autosuggest.js */
Class.create(BaseController, {
	init: function() {	
		var dialog = Registry.lookup("RecommendationController.RecommendationDialog");
	  
		dialog.autocompleter.ajaxInProgress = false;
		dialog.autocompleter.stopIndicator();
			
		dialog.autocompleter.patronData = this.data.patrons;
		if (!dialog.autocompleter.hasFocus && dialog.autocompleter.patronData && dialog.autocompleter.patronData.length > 0){
			if (dialog.autocompleter.patronData[0].patronID >= 0) {
				dialog.autocompleter.myUpdateElement(0);
			}
		}

		dialog.autocompleter.stopIndicator();
		dialog.showSuggestions();
	},
	registerEvents: function() {
	}
});