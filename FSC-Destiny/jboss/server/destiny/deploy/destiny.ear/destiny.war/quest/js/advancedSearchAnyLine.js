/* advancedSearchAnyLine.js */
Class.create(AdvancedSearchBaseLine, {
	getLabel: function() {
		return MessageHelper.format("advancedSearchDataValue_oneOrMoreOfThese");
	},
	
	getColumnTwoNode: function() {
		var columnTwo = Builder.node("p", {"class": "column column-2"});
		this.textInput = [];
		this.textInput.push(Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "100"}));
		columnTwo.insert(this.textInput[0]);
		columnTwo.insert(Builder.node("span", {}, " " + MessageHelper.format("advancedSearchDataValue_or") + " "));
		this.textInput.push(Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "100"}));
		columnTwo.insert(this.textInput[1]);
		columnTwo.insert(Builder.node("span", {}, " " + MessageHelper.format("advancedSearchDataValue_or") + " "));
		this.textInput.push(Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "100"}));
		columnTwo.insert(this.textInput[2]);
		
		var boundFireUpdate = this.fireUpdateEvent.bindAsEventListener(this);
		for (var i=0; i < this.textInput.size(); i++) {
			Event.observe(this.textInput[i], "keyup", boundFireUpdate);
		}
		return columnTwo;
	},
	
	setValue: function(value, index) {
		if (this.textInput[index]) {
			this.textInput[index].setValue(value);
		}
	},

	getValue: function() {
		var result = [];
		for (var i = 0 ; i < this.textInput.size(); i ++) {
			if (this.textInput[i]) {
				result.push(this.textInput[i].getValue().escapeHTML());
			}
		}
		
		return result;
	},
	
	getQueryString: function(outputType) {
		var result = "";
		var temp = "";
		var values = this.getValue();
		for (var i = 0 ; i < values.size(); i ++) {
			var value = values[i];
			if (!value.strip().empty()) {
				if (!temp.empty()) {
					if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) {
						temp += "<span class=\"queryBoolean\">";
					} 
					temp += " OR ";
					if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) {
						temp += "</span>";
					}
				}
				value = this.lowerBooleans(value);
				if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) {
					var valueTemp = "<span class=\"queryValue\">" + value + "</span>";
					if (value.split(/\s/).length > 1) {
						valueTemp = "<span class=\"queryQuotes\">\"</span>" + valueTemp + "<span class=\"queryQuotes\">\"</span>";
					}
					temp += valueTemp;
				} else {
					if (value.split(/\s/).length > 1) {
						temp += "\"" + value + "\"";
					} else {
						temp += value;
					}
				}
			}
		}
		
		var rawQuery = temp.stripTags().strip();
		var needsParens = (!rawQuery.empty() && rawQuery.split(/\s/).length > 1);
		var leftParen = (needsParens ? ((outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) ? "<span class=\"queryProperty\">(</span>" : "(") : "");
		var rightParen = (needsParens ? ((outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) ? "<span class=\"queryProperty\">)</span>" : ")") : "");
		
		result = this.buildDQLComponent(temp, outputType, needsParens);
		if ((this.getType() == AdvancedSearchController_AS_SEARCH_TYPE_KEYWORD || outputType == AdvancedSearchController_AS_QUERY_OUTPUT_SERVICES) && !result.empty()) {
			result = leftParen + result + rightParen; 
		}
		return result;
	},

	focus: function() {
		this.textInput[0].focus();
	},
	
	getLineType: function() {
		return AdvancedSearchController_AS_LINE_TYPE_ANY;
	},
	
	setTabOrder: function(tabIndex) {
		this.type.tabIndex = tabIndex++;
		for (var i = 0 ; i < this.textInput.size(); i ++) {
			this.textInput[i].tabIndex = tabIndex++;
		}
		return tabIndex;
	}

});