/* advancedSearchNotLine.js */
Class.create(AdvancedSearchAnyLine, {
	getQueryString: function($super, outputType) {
		var result = $super(outputType);
		if (!result.strip().empty()) {
			if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) {
				result = "<span class=\"queryBoolean\">NOT </span>" + result;
			} else {
				result = "NOT " + result;
			}
		}
		return result;
	},
	
	getLineType: function() {
		return AdvancedSearchController_AS_LINE_TYPE_NOT;
	}
});