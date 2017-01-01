/* advancedSearchBaseLine.js */
Class.create({
	initialize: function(advancedSearch) {
		this.advancedSearch = advancedSearch;
		this._buildElement();
	},
	
	_buildElement: function() {
		this.element = Builder.node("div", {"class": "advSearch-FilterRow"});
	
		var columnOne = Builder.node("p", {"class": "column column-1"});
		this.element.insert(columnOne);
		var labelSpan = Builder.node("span", {"class": "label"}, this.getLabel());
		columnOne.insert(labelSpan);
		this.type = this._buildSelectNode();
		var boundFireUpdate = this.fireUpdateEvent.bindAsEventListener(this);
		Event.observe(this.type, "change", boundFireUpdate);
		labelSpan.insert(this.type);
		this.setType(AdvancedSearchController_AS_SEARCH_TYPE_KEYWORD);
		
		this.element.insert(this.getColumnTwoNode());
		
		var columnThree = Builder.node("p", {"class": "column column-3"});
		this.element.insert(columnThree);
		this.removeRow = Builder.node("a", {"class": "advSearch-RemoveFilterRow", href: "#", alt: MessageHelper.format("advancedSearchDataValue_removeThisSearchFilter"), 
			title: MessageHelper.format("advancedSearchDataValue_removeThisSearchFilter")}, [Builder.node("em", {}, MessageHelper.format("advancedSearchDataValue_removeLimiter"))]);
		columnThree.insert(this.removeRow);
		columnThree.insert(Builder.node("span", {}, " "));
		this.addRow = Builder.node("a", {"class": "advSearch-AddFilterRow", href: "#", alt: MessageHelper.format("advancedSearchDataValue_addASearchFilter"), 
			title: MessageHelper.format("advancedSearchDataValue_addASearchFilter")}, [Builder.node("em", {}, MessageHelper.format("advancedSearchDataValue_addLimiter"))]);
		columnThree.insert(this.addRow);
		
		// Event listeners for add/remove
		if (this.advancedSearch) {
			var boundAddLine = this.advancedSearch.addLine.bind(this.advancedSearch, this.getLineType());
			Event.observe(this.addRow, "click", boundAddLine);
			var boundRemoveLine = this.advancedSearch.removeLine.bindAsEventListener(this.advancedSearch, this.getLineType());
			Event.observe(this.removeRow, "click", boundRemoveLine);
		}
	},
	
	_buildSelectNode: function() {
		return Builder.node("select", {},
				[
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_KEYWORD}, MessageHelper.format("advancedSearchDataValue_keywords")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_TITLE}, MessageHelper.format("advancedSearchDataValue_titles")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_AUTHOR}, MessageHelper.format("advancedSearchDataValue_authors")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_NOTE}, MessageHelper.format("advancedSearchDataValue_notes")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_SERIES}, MessageHelper.format("advancedSearchDataValue_series")),
				 	Builder.node("option", {value: AdvancedSearchController_AS_SEARCH_TYPE_SUBJECT}, MessageHelper.format("advancedSearchDataValue_subjects"))
				]
		);
	},
	
	hideAddRow: function() {
		this.addRow.setStyle({"visibility": "hidden"});
	},
	
	showAddRow: function() {
		this.addRow.setStyle({"visibility": "visible"});
	},
	
	getColumnTwoNode: function() {
		var columnTwo = Builder.node("p", {"class": "column column-2"});
		this.textInput = Builder.node("input", {maxlength: "100"});
		var boundFireUpdate = this.fireUpdateEvent.bindAsEventListener(this);
		Event.observe(this.textInput, "keyup", boundFireUpdate);
		columnTwo.insert(this.textInput);
		
		return columnTwo;
	},
	
	getElement: function() {
		return this.element;
	},
	
	setValue: function(value) {
		if (this.textInput) {
			this.textInput.setValue(value);
		}
	},

	getValue: function() {
		if (this.textInput) {
			return this.textInput.getValue().escapeHTML();
		}
	},
	
	setType: function(value) {
		if (this.type) {
			this.type.setValue(value);
		}
	},

	getType: function() {
		if (this.type) {
			return this.type.getValue();
		}
	},
	
	getQueryString: function(doHighlight) {
		var result = this.getValue();
		return result;
	},
	
	fireUpdateEvent: function(event) {
		if (this.advancedSearch) {
			var memo = {};
			var typing;
			if (event && event.type == "keyup") {				
				typing = true;
			}
			this.advancedSearch.doUpdate(typing);
		}
	},
	
	lowerBooleans: function(value) {
		var BOOLEANS = [{pattern: /\s+AND\s+/g, replacement: " and "}, 
		                {pattern: /\s+OR\s+/g, replacement: " or "}, 
		                {pattern: /\s+NOT\s+/g, replacement: " not "}];
		
		for (var i=0; i < BOOLEANS.size(); i++) {
			value = value.replace(BOOLEANS[i].pattern, BOOLEANS[i].replacement);
		}
		
		return value;
	},
	
	focus: function() {
		this.textInput.focus();
	},
	
	buildDQLComponent: function(value, outputType, needsParens) {
		var result = "";
		if (outputType == AdvancedSearchController_AS_QUERY_OUTPUT_SERVICES) {
			result = value;
		} else {
			if (!value.strip().empty()) {
				switch (this.getType()) {
				case AdvancedSearchController_AS_SEARCH_TYPE_TITLE:
					result = this.highlightProperty(AdvancedSearchController_DQL_FIELD_TITLE, value, outputType, needsParens);
					break;
				case AdvancedSearchController_AS_SEARCH_TYPE_AUTHOR:
					result = this.highlightProperty(AdvancedSearchController_DQL_FIELD_AUTHOR, value, outputType, needsParens);
					break;
				case AdvancedSearchController_AS_SEARCH_TYPE_SERIES:
					result = this.highlightProperty(AdvancedSearchController_DQL_FIELD_SERIES, value, outputType, needsParens);
					break;
				case AdvancedSearchController_AS_SEARCH_TYPE_SUBJECT:
					result = this.highlightProperty(AdvancedSearchController_DQL_FIELD_SUBJECT, value, outputType, needsParens);
					break;
				case AdvancedSearchController_AS_SEARCH_TYPE_NOTE:
					result = this.highlightProperty(AdvancedSearchController_DQL_FIELD_NOTE, value, outputType, needsParens);
					break;
				case AdvancedSearchController_AS_SEARCH_TYPE_KEYWORD:
				default:
					result = value;
				break;
				}
			}
		}
		return result;
	},
	
	highlightProperty: function(prefix, value, doHighlight, needsParens) {
		var result = "";
		var leftParen = (needsParens ? "(" : "");
		var rightParen = (needsParens ? ")" : "");
		
		if (doHighlight) {
			result = "<span class=\"queryProperty\">" + prefix + ":" + leftParen + 
				"</span>" + value + "</span><span class=\"queryProperty\">" + rightParen + "</span>";
		} else {
			result = prefix + ":" + leftParen  + value + rightParen;
		}
		return result;
	},
	
	getLineType: function() {
		return -1;
	},
	
	setTabOrder: function(tabIndex) {
		this.type.tabIndex = tabIndex++;
		this.textInput.tabIndex = tabIndex++;
		return tabIndex;
	}
});