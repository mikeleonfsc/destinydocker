/* advancedSearchExactLine.js */
Class.create(AdvancedSearchBaseLine, {
	getLabel: function() {		
		return MessageHelper.format("advancedSearchDataValue_thisExact");
	},
	
	_buildSelectNode: function() {
		return Builder.node("select", {},
				[
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_KEYWORD}, MessageHelper.format("advancedSearchDataValue_keyword")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_TITLE}, MessageHelper.format("advancedSearchDataValue_title")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_AUTHOR}, MessageHelper.format("advancedSearchDataValue_author")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_NOTE}, MessageHelper.format("advancedSearchDataValue_note")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_SERIES}, MessageHelper.format("advancedSearchDataValue_series")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_SUBJECT}, MessageHelper.format("advancedSearchDataValue_subject"))
				]
		);
	},
	
	getQueryString: function(outputType) {
		var result = "";
		var value = this.getValue();
		value = this.lowerBooleans(value);
		if (!value.strip().empty()) {
			if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) {
				value = "<span class=\"queryQuotes\">\"</span><span class=\"queryValue\">" + value + "</span><span class=\"queryQuotes\">\"</span>";
			} else {
				value = "\"" + value + "\"";
			}
			
			result = this.buildDQLComponent(value, outputType, false);
		}
		return result;
	},
	
	getLineType: function() {
		return AdvancedSearchController_AS_LINE_TYPE_EXACT;
	}

});