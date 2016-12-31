/* advancedSearchAllLine.js */
Class.create(AdvancedSearchBaseLine, {	
	getLabel: function() {
		return MessageHelper.format("advancedSearchDataValue_allOfThese");		
	},
	
	getQueryString: function(outputType) {
		var value = this.getValue();
		value = this.lowerBooleans(value);
		
		var needsParens = (!value.strip().empty() && value.split(/\s/).length > 1);
		
		if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED && !value.strip().empty()) {
			value = "<span class=\"queryValue\">" + value + "</span>";
		}
		
		return this.buildDQLComponent(value, outputType, needsParens);
	},
	
	getLineType: function() {
		return AdvancedSearchController_AS_LINE_TYPE_ALL;
	}
});