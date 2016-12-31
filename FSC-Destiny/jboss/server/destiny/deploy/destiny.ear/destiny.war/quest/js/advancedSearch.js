/* advancedSearch.js */
Class.create({
	initialize: function() {
	},
	
	init: function(controller) {
		if (controller) {
			this.json_data = controller.data;
			this.controller = controller;
		}
		this._buildElement();
		
		this.allLines = [];
		this.exactLines = [];
		this.anyLines = [];
		this.notAnyLines = [];
		this.limiters = [];
		
		this.addAllLine();
		this.addExactLine();
		this.addAnyLine();
		this.addNotAnyLine();
		this.addLimiter();
		
		this.refreshDialog();
	},
	
	_buildElement: function() {
		this.element = Builder.node("div", {id: "advSearch-FilterWrapper"});
		
		var resetColumn3 = Builder.node("p", {"class": "column column-3"});
		var resetRow = Builder.node("div", {"class": "advSearch-FilterRow"}, 
				[Builder.node("p", {"class": "column column-1"}),
				 Builder.node("p", {"class": "column column-2"}),
				 resetColumn3]
		);
		var resetButton = Builder.node("a", {"id": "advSearch-ResetForm","class": "advSearch-ResetForm", href: "#", alt: MessageHelper.format("advancedSearchDataValue_resetAdvancedSearch"), 
			title: MessageHelper.format("advancedSearchDataValue_resetAdvancedSearch")}, [Builder.node("em", {}, MessageHelper.format("advancedSearchDataValue_reset"))]);
		resetColumn3.insert(resetButton);
		this.element.insert(resetRow);
		
		this.errorDiv = Builder.node("h1", {id: "advancedSearchErrors", style: "display: none;"});
		this.element.insert(this.errorDiv);
		
		var headerOne = Builder.node("h2", {}, MessageHelper.format("advancedSearchDataValue_showMeEverythingThatHas"));
		this.element.insert(headerOne);
		
		this.allLineWrapper = Builder.node("div", {"class": "advSearch-Group" + AdvancedSearchController_AS_LINE_TYPE_ALL});
		this.element.insert(this.allLineWrapper);
		this.exactLineWrapper = Builder.node("div", {"class": "advSearch-Group" + AdvancedSearchController_AS_LINE_TYPE_EXACT});
		this.element.insert(this.exactLineWrapper);
		this.anyLineWrapper = Builder.node("div", {"class": "advSearch-Group" + AdvancedSearchController_AS_LINE_TYPE_ANY});
		this.element.insert(this.anyLineWrapper);
		
		var headerTwo = Builder.node("h2", {}, MessageHelper.format("advancedSearchDataValue_butIDontWant"));
		this.element.insert(headerTwo);
		this.notAnyLineWrapper = Builder.node("div", {"class": "advSearch-Group" + AdvancedSearchController_AS_LINE_TYPE_NOT});
		this.element.insert(this.notAnyLineWrapper);
		
		var headerThree = Builder.node("h2", {}, MessageHelper.format("advancedSearchDataValue_limitMySearchTo"));
		this.element.insert(headerThree);
		this.limiterWrapper = Builder.node("div", {"class": "advSearch-Group" + AdvancedSearchController_AS_LINE_TYPE_LIMITER});
		this.element.insert(this.limiterWrapper);
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(outputType) {
		var result = "";
		if (! outputType) {
			outputType = AdvancedSearchController_AS_QUERY_OUTPUT_SEARCH;
		}
		
		for (var i=0; i < this.allLines.size(); i++) {
			result = this._addToQueryString(result, this.allLines[i].getQueryString(outputType));
		}
		for (var i=0; i < this.exactLines.size(); i++) {
			result = this._addToQueryString(result, this.exactLines[i].getQueryString(outputType));
		}
		for (var i=0; i < this.anyLines.size(); i++) {
			result = this._addToQueryString(result, this.anyLines[i].getQueryString(outputType));
		}
		for (var i=0; i < this.notAnyLines.size(); i++) {
			result = this._addToQueryString(result, this.notAnyLines[i].getQueryString(outputType));
		}
		for (var i=0; i < this.limiters.size(); i++) {
			result = this._addToQueryString(result, this.limiters[i].getQueryString(outputType));
		}
		
		if (result.empty() && outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED) {
			result = MessageHelper.format("advancedSearchDataValue_asYouUseTheOptionsBelow");
		}
		
		return result;
	},
	
	truncateEmptyRows: function() {
		var linesTemp = this.allLines;
		for (var i=0; i < linesTemp.size(); i++) {
			if (linesTemp[i].getQueryString().empty() && this.allLines.size() > 1) {
				linesTemp[i].getElement().remove();
				this.allLines = this.allLines.without(linesTemp[i]);
			}
		}

		var linesTemp = this.exactLines;
		for (var i=0; i < linesTemp.size(); i++) {
			if (linesTemp[i].getQueryString().empty() && this.exactLines.size() > 1) {
				linesTemp[i].getElement().remove();
				this.exactLines = this.exactLines.without(linesTemp[i]);
			}
		}

		var linesTemp = this.anyLines;
		for (var i=0; i < linesTemp.size(); i++) {
			if (linesTemp[i].getQueryString().empty() && this.anyLines.size() > 1) {
				linesTemp[i].getElement().remove();
				this.anyLines = this.anyLines.without(linesTemp[i]);
			}
		}
		
		var linesTemp = this.notAnyLines;
		for (var i=0; i < linesTemp.size(); i++) {
			if (linesTemp[i].getQueryString().empty() && this.notAnyLines.size() > 1) {
				linesTemp[i].getElement().remove();
				this.notAnyLines = this.notAnyLines.without(linesTemp[i]);
			}
		}

		var linesTemp = this.limiters;
		for (var i=0; i < linesTemp.size(); i++) {
			if (linesTemp[i].getType() == AdvancedSearchController_AS_LIMITER_CHOOSE && this.limiters.size() > 1) {
				linesTemp[i].getElement().remove();
				this.limiters = this.limiters.without(linesTemp[i]);
			}
		}
		
		this.refreshDialog();
	},
	
	refreshDialog: function() {
		var tabIndex = 100;
		for (var i=0; i < this.allLines.size(); i++) {
			tabIndex = this.allLines[i].setTabOrder(tabIndex);
			if (i == this.allLines.size()-1) {
				this.allLines[i].showAddRow();
			} else {
				this.allLines[i].hideAddRow();
			}
		}
		for (var i=0; i < this.exactLines.size(); i++) {
			tabIndex = this.exactLines[i].setTabOrder(tabIndex);
			if (i == this.exactLines.size()-1) {
				this.exactLines[i].showAddRow();
			} else {
				this.exactLines[i].hideAddRow();
			}
		}
		for (var i=0; i < this.anyLines.size(); i++) {
			tabIndex = this.anyLines[i].setTabOrder(tabIndex);
			if (i == this.anyLines.size()-1) {
				this.anyLines[i].showAddRow();
			} else {
				this.anyLines[i].hideAddRow();
			}
		}
		for (var i=0; i < this.notAnyLines.size(); i++) {
			tabIndex = this.notAnyLines[i].setTabOrder(tabIndex);
			if (i == this.notAnyLines.size()-1) {
				this.notAnyLines[i].showAddRow();
			} else {
				this.notAnyLines[i].hideAddRow();
			}
		}
		for (var i=0; i < this.limiters.size(); i++) {
			this.limiters[i].updateTypes();
			tabIndex = this.limiters[i].setTabOrder(tabIndex);
			if (i == this.limiters.size()-1 && this.limiters[i].getNumberOfTypeOptions() > 2) {
				this.limiters[i].showAddRow();
			} else {
				this.limiters[i].hideAddRow();
			}
		}
	},
	
	canSearchWithOnlyTheseLimiters: function() {
		var result = false;
		
		for (var i = 0; i < this.limiters.size(); i ++) {
			switch (this.limiters[i].getType()) {
				case AdvancedSearchController_AS_LIMITER_AR:
				case AdvancedSearchController_AS_LIMITER_RC:
					if (this.limiters[i].getValue() != null) {
						result = true;
					}
					break;
				default:
					break;
			}
		}
		return result;
	},

	_addToQueryString: function(queryString, fragment) {
		if (! fragment.empty()) {
			if (! queryString.empty()) {
				queryString +=  " ";
			}
			queryString += fragment;
		}
		
		return queryString;
	},
	
	fireUpdateEvent: function(event) {		
		var typing;
		if (event && event.type == "keyup") {				
			typing = true;
		}
		this.doUpdate(typing);				
	},	
	
	addLine: function(type) {
		switch(type) {
			case AdvancedSearchController_AS_LINE_TYPE_ALL :
				this.addAllLine();
				break;
			case AdvancedSearchController_AS_LINE_TYPE_EXACT :
				this.addExactLine();
				break;
			case AdvancedSearchController_AS_LINE_TYPE_ANY :
				this.addAnyLine();
				break;
			case AdvancedSearchController_AS_LINE_TYPE_NOT :
				this.addNotAnyLine();
				break;
			case AdvancedSearchController_AS_LINE_TYPE_LIMITER :
				this.addLimiter();
				break;
			default:
		}
		
		this.refreshDialog();
	},

	removeLine: function(event, type) {
		switch(type) {
			case AdvancedSearchController_AS_LINE_TYPE_ALL :
				this.allLines = this._removeLine(event, this.allLines, type);
				if (this.allLines.size() == 0) {
					this.addAllLine();
				}
				break;
			case AdvancedSearchController_AS_LINE_TYPE_EXACT :
				this.exactLines = this._removeLine(event, this.exactLines, type);
				if (this.exactLines.size() == 0) {
					this.addExactLine();
				}
				break;
			case AdvancedSearchController_AS_LINE_TYPE_ANY :
				this.anyLines = this._removeLine(event, this.anyLines, type);
				if (this.anyLines.size() == 0) {
					this.addAnyLine();
				}
				break;
			case AdvancedSearchController_AS_LINE_TYPE_NOT :
				this.notAnyLines = this._removeLine(event, this.notAnyLines, type);
				if (this.notAnyLines.size() == 0) {
					this.addNotAnyLine();
				}
				break;
			case AdvancedSearchController_AS_LINE_TYPE_LIMITER :
				this.limiters = this._removeLine(event, this.limiters, type);
				if (this.limiters.size() == 0) {
					this.addLimiter();
				}
				break;
			default:
		}
		
		this.fireUpdateEvent();
		this.refreshDialog();
	},
	
	hasLimiter: function(limiterType) {
		var result = false;
		
		for (var i = 0; i < this.limiters.length; i ++) {
			if (this.limiters[i].getType() == limiterType) {
				result = true;
				break;
			}
		}
		return result;
	},
	
	_removeLine: function(event, lines, type) {
		var lineToRemove;
		for (var i=0; i < lines.size() && ! lineToRemove; i++) {
			var element = event.element();
			element = Utility.upToClass(element, "advSearch-RemoveFilterRow");
			if (lines[i].removeRow.identify() == element.identify()) {
				lineToRemove = lines[i];
			}
		}
		
		lineToRemove.getElement().remove();
		lines = lines.without(lineToRemove);
		
		return lines;
	},
	
	addAllLine: function() {
		var line = new AdvancedSearchAllLine(this);
		this.allLines.push(line);
		this.allLineWrapper.insert(line.getElement());
		line.focus();
	},
	
	addExactLine: function() {
		var line = new AdvancedSearchExactLine(this);
		this.exactLines.push(line);
		this.exactLineWrapper.insert(line.getElement());
		line.focus();
	},
	
	addAnyLine: function() {
		var line = new AdvancedSearchAnyLine(this);
		this.anyLines.push(line);
		this.anyLineWrapper.insert(line.getElement());
		line.focus();
	},
	
	addNotAnyLine: function() {
		var line = new AdvancedSearchNotLine(this);
		this.notAnyLines.push(line);
		this.notAnyLineWrapper.insert(line.getElement());
		line.focus();
	},
	
	addLimiter: function() {
		var limiter = new this.AdvancedSearchLimiters(this);
		this.limiters.push(limiter);
		this.limiterWrapper.insert(limiter.getElement());
		limiter.focus();
	},
	
	getLimiterJSON: function() {
		var result = [];
		for (var i = 0; i < this.limiters.length; i ++) {
			switch (this.limiters[i].getType()) {
				case AdvancedSearchController_AS_LIMITER_AR:
				case AdvancedSearchController_AS_LIMITER_RC:
				case AdvancedSearchController_AS_LIMITER_LOCATION:
					var limiterValue = this.limiters[i].getValue();
					if (limiterValue != null) {
						result.push(eval(limiterValue));
					}
					break;
				default:
					break;
			}
		}
		return Object.toJSON(result);
	},
	
	cleanup: function() {
		this.errorDiv.update("");
		this.errorDiv.hide();
	},	
	
	doUpdate: function(typing) {
		var updateInternal = this._updateInternal.bind(this);
		
		if (typing) {
			if (this.typingTimeout) {
				this.typingTimeout.stopTimeout();	
			} 
			
			this.typingTimeout = new Timeout(AdvancedSearchController_ASL_DEFAULT_TYPING_TIMEOUT, updateInternal);	
		} else {
			updateInternal();
		}
	},
	
	_updateInternal: function() {
		this.header = this.controller.elementMap.get(AdvancedSearchController_DIV_ADVANCED_SEARCH_QUERY);
		this.header.update(this.getQueryString(AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED));
	},
	
	AdvancedSearchLimiters: Class.create({
	initialize: function(advancedSearch) {
		this.advancedSearch = advancedSearch;		
		this._buildElement();
		
		this.inputObject = null;
	},

	_buildElement: function() {
		this.element = Builder.node("div", {"class": "advSearch-FilterRow"});
	
		this.columnOne = Builder.node("p", {"class": "column column-1"});
		this.element.insert(this.columnOne);
		this.type = Builder.node("select", {}, this._getSelectableTypes());
		
		var boundFireUpdate = this.changeType.bindAsEventListener(this);
		this.columnOne.insert(this.type);
		Event.observe(this.type, "change", boundFireUpdate);
		this.setType(AdvancedSearchController_AS_LIMITER_CHOOSE);
		
		this.columnTwo = Builder.node("p", {"class": "column column-2"});
		this.element.insert(this.columnTwo);
		
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
	
	_getSelectableTypes: function() {
		var options = [];
		options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_CHOOSE}, MessageHelper.format("advancedSearchDataValue_choose")));
		if (this.advancedSearch.json_data.useAcceleratedReader && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_AR) && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_RC)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_AR}, MessageHelper.format("advancedSearchDataValue_acceleratedReader")));
		}
		if (!this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_CALL_NUMBER)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_CALL_NUMBER}, MessageHelper.format("advancedSearchDataValue_callNumber")));
		}
		if (!this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_FORMAT)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_FORMAT}, MessageHelper.format("advancedSearchDataValue_format")));
		}
		if (this.advancedSearch.json_data.useFountasAndPinnell == true && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_FP)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_FP}, MessageHelper.format("advancedSearchDataValue_fountasAndPinnell")));
		}
		if (this.advancedSearch.json_data.useInterestAndReadingLevels && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_INTEREST) ) {
			// Per BSmith on 8/26/2010 we are not including the interest level limiter in I18N product
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_INTEREST}, MessageHelper.format("advancedSearchDataValue_interestLevel")));
		}
		if (this.advancedSearch.json_data.useLexile == true && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_LEXILE)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_LEXILE}, MessageHelper.format("advancedSearchDataValue_lexile")));
		}
		if (this.advancedSearch.json_data.useLocationLimiter == true && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_LOCATION)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_LOCATION}, MessageHelper.format("advancedSearchDataValue_location")));
		}
		if (this.advancedSearch.json_data.useReadingCounts && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_AR) && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_RC)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_RC}, MessageHelper.format("advancedSearchDataValue_readingCounts")));
		}
		if (this.advancedSearch.json_data.useInterestAndReadingLevels && !this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_READING_LEVEL)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_READING_LEVEL}, MessageHelper.format("advancedSearchDataValue_readingLevel")));
		}
		if (!this.advancedSearch.hasLimiter(AdvancedSearchController_AS_LIMITER_YEAR)) {
			options.push(Builder.node("option", {value: AdvancedSearchController_AS_LIMITER_YEAR}, MessageHelper.format("advancedSearchDataValue_year")));
		}
		return options;
	},
	
	updateTypes: function() {
		var oldType = this.getType();
		
		this.type.childElements().each(function(i, idx) {
			i.remove();
		});
		var newChildren = this._getSelectableTypes(); 
		for (var i = 0; i < newChildren.length; i ++) {
			this.type.appendChild(newChildren[i]);
		}
		this.setType(oldType);
	},

	hideAddRow: function() {
		this.addRow.setStyle({"visibility": "hidden"});
	},
	
	showAddRow: function() {
		this.addRow.setStyle({"visibility": "visible"});
	},

	getElement: function() {
		return this.element;
	},

	changeType: function(event) {
		if (this.inputObject) {
			this.inputObject.getElement().remove();
		}
		
		switch(this.getType()) {
		case AdvancedSearchController_AS_LIMITER_LOCATION:
			this.inputObject = new this.AdvancedSearchLocationLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_FORMAT:
			this.inputObject = new this.AdvancedSearchFormatLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_CALL_NUMBER:
			this.inputObject = new this.AdvancedSearchCallNumberLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_YEAR:
			this.inputObject = new this.AdvancedSearchYearLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_AR:
			this.inputObject = new this.AdvancedSearchReadingProgramLimiter(this, AdvancedSearchController_AS_LIMITER_AR);
			break;
		case AdvancedSearchController_AS_LIMITER_FP:
			this.inputObject = new this.AdvancedSearchFountasPinnellLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_INTEREST:
			this.inputObject = new this.AdvancedSearchInterestLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_LEXILE:
			this.inputObject = new this.AdvancedSearchLexileLimiter(this);
			break;
		case AdvancedSearchController_AS_LIMITER_RC:
			this.inputObject = new this.AdvancedSearchReadingProgramLimiter(this, AdvancedSearchController_AS_LIMITER_RC);
			break;
		case AdvancedSearchController_AS_LIMITER_READING_LEVEL:
			this.inputObject = new this.AdvancedSearchReadingLevelLimiter(this);
			break;
		default:
			this.inputObject = null;
			break;
		}
		
		if (this.inputObject) {
			this.columnTwo.update(this.inputObject.getElement());
		}
		
		this.fireUpdateEvent(event);
		this.advancedSearch.refreshDialog();
	},
	
	fireUpdateEvent: function(event) {
		if (this.advancedSearch) {
			var typing;
			if (event && event.type == "keypress") {
				typing = true;
			}
			this.advancedSearch.doUpdate(typing);
		}
	},
	
	focus: function() {
		this.type.focus();
	},
	
	setValue: function(value) {
		if (this.inputObject) {
			this.inputObject.setValue(value);
		}
	},

	getValue: function() {
		var result = "";
		if (this.inputObject) {
			result = this.inputObject.getValue();
		}
		return result;
	},
	
	setType: function(value) {
		if (this.type) {
			this.type.setValue(value);
		}
	},

	setType_TestOnly: function(value) {
		this.setType(value);
		this.changeType();
	},

	getType: function() {
		if (this.type) {
			return this.type.getValue();
		}
	},
	
	getQueryString: function(outputType) {
		var result = "";
		if (outputType != AdvancedSearchController_AS_QUERY_OUTPUT_SERVICES && this.inputObject) {
			result = this.inputObject.getQueryString(outputType == AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED);
		}
		return result;
	},
	
	getLineType: function() {
		return AdvancedSearchController_AS_LINE_TYPE_LIMITER;
	},
	
	getNumberOfTypeOptions: function() {
		return this.type.options.length;
	},
	
	setTabOrder: function(tabIndex) {
		this.type.tabIndex = tabIndex++;
		if (this.inputObject) {
			tabIndex = this.inputObject.setTabOrder(tabIndex);
		}
		return tabIndex;
	},
	
	AdvancedSearchReadingLevelLimiter: Class.create({
		initialize: function(limiters) {
			this.limiters = limiters;
			this._buildElement();
		},
		
		_buildElement: function() {
		 	this.element = Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_from"));
		 	this.textInputFrom = Builder.node("input", {type: "text", "class": "advSearch-RangeInput", maxlength:"4"}, "");
		 	this.textInputTo = Builder.node("input", {type: "text", "class": "advSearch-RangeInput", maxlength:"4"}, "");
		 	this.element.insert(this.textInputFrom);
		 	this.element.insert(Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")));
		 	this.element.insert(this.textInputTo);
	
		 	if (this.limiters) {
				var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
				Event.observe(this.textInputFrom, "keypress", boundFireUpdate);
				Event.observe(this.textInputTo, "keypress", boundFireUpdate);
		 	}
		},
		
		getElement: function() {
			return this.element;
		},
		
		getQueryString: function(doHighlight) {
			var result = "";
			var json = this.getValue();
			if (json.from.length > 0 || json.to.length > 0) {
				var field = AdvancedSearchController_DQL_FIELD_READINGLEVEL;
				if (doHighlight) {
					result = "<span class=\"queryProperty\">" + field + ":[</span><span class=\"queryValue\">" + json.from + "</span><span class=\"queryBoolean\"> TO </span><span class=\"queryValue\">" + json.to + "</span><span class=\"queryProperty\">]</span>";
				} else {
					result = field + ":[" + json.from + " TO " + json.to + "]";
				}
			}
			return result;
		},
		
		setValue: function(from, to) {
			this.textInputFrom.value = from;
			this.textInputTo.value = to;
		},
		
		getValue: function() {
			var from = this.textInputFrom.value;
			var to = this.textInputTo.value;
			if (from.length > 0 && to.length ==0) {
				to = "20.0";
			}
			if (from.length == 0 && to.length > 0) {
				from = "0.0";
			}
			
			if (from.length > 0 && to.length > 0 &&
				Utility.isNumber(from) && Utility.isNumber(to) &&
				eval(from.escapeHTML()) > eval(to.escapeHTML())) {
				return {from: to.escapeHTML(), to: from.escapeHTML()};
			} else {
				return {from: from.escapeHTML(), to: to.escapeHTML()};
			}
		},
		
		setTabOrder: function(tabIndex) {
			this.textInputFrom.tabIndex = tabIndex++;
			this.textInputTo.tabIndex = tabIndex++;
			return tabIndex;
		}
	}),

  AdvancedSearchLocationLimiter:  Class.create({
	initialize: function(limiters) {
		this.limiters = limiters;
		this._buildElement();
	},
	
	_buildElement: function() {
		var locs = this.limiters.advancedSearch.json_data.locations;		
		var options = [];		
		var defaultKey = $H(this.limiters.advancedSearch.json_data.locations[0]).keys()[0];
		
		for (var i = 0; i < locs.length; i ++) {
			var element = $H(this.limiters.advancedSearch.json_data.locations[i]);
			var key = element.keys()[0];
			options.push(Builder.node("option", {value: key}, element.get(key)));
		}
		
		this.selectBox = Builder.node("select", {}, options);
		this.selectBox.setValue(defaultKey);
		this.element = Builder.node("span", {}, this.selectBox);
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		return result;
	},
	
	setValue: function(val) {
		this.selectBox.setValue(val);
	},
	
	getValue: function() {
		return {type: AdvancedSearchController_AS_LIMITER_LOCATION, siteTypeID: this.selectBox.getValue()};
	},
	
	setTabOrder: function(tabIndex) {
		this.selectBox.tabIndex = tabIndex++;
		return tabIndex;
	}
}),

AdvancedSearchFormatLimiter: Class.create({
	initialize: function(limiters) {
		this.limiters = limiters;
		this.isIntegrated = this.limiters.advancedSearch.json_data.isIntegratedShelf;
		this._buildElement();
	},
	
	_buildElement: function() {					
		var options = [];		
		var mats = this.limiters.advancedSearch.json_data.materialTypes;
		
		options.push(Builder.node("option", {value: "-1"}, MessageHelper.format("advancedSearchDataValue_anyFormat")));
		
		for (var i = 0; i < mats.length; i ++) {
			var element = $H(this.limiters.advancedSearch.json_data.materialTypes[i]);
			var key = element.keys()[0];
			options.push(Builder.node("option", {value: key}, element.get(key)));
		}
		
		this.selectBox = Builder.node("select", {}, options);
		this.selectBox.setValue("-1");
		
		if (this.isIntegrated == "1")
		{
			this.checkboxOnlyFolletteBook = Builder.node("input",
					{type: "checkbox", name:"searchOnlyFolletteBook", id: "searchOnlyFolletteBook", "style": "width:12px", value: "yes"});
			var searchOnlyFollettDiv = Builder.node("div",
													{"id" : "searchOnlyFolletEbookID", "style": "display:none", "class": "label"},
													[Builder.node("div",
																	{},
																	[this.checkboxOnlyFolletteBook, MessageHelper.format("advancedSearchDataValue_limitToFolletteBooks")])
																	]);
		}
		
		if(this.isIntegrated == "1")
		{
			var controls = [];
			controls.push(Builder.node("div",{},this.selectBox));
			controls.push(searchOnlyFollettDiv);
			this.element = Builder.node("div",
					{},
					controls);
		}
		else
		{
			this.element = Builder.node("div",
					{},
					Builder.node("div",{},this.selectBox));
		}
		
	 	if (this.limiters) {
			var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
			Event.observe(this.selectBox, "change", boundFireUpdate);
			if(this.isIntegrated == "1") {
				Event.observe(this.checkboxOnlyFolletteBook, "click", boundFireUpdate);
				
				Event.observe(this.selectBox, "change", function showOnlyFolletEbooks()
				{
					if(this.getValue() == 'ebook')
					{
						searchOnlyFollettDiv.show();
					} 
					else
					{
						searchOnlyFollettDiv.hide();
					}
				});
			}
	 	}
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		
		if (this.getValue() != "-1") {
			var field = AdvancedSearchController_DQL_FIELD_FORMAT;
			if (doHighlight) {
				result = "<span class=\"queryProperty\">" + field + ":</span> <span class=\"queryValue\">" + this.getValue() + "</span>";
				if (this.getValue() == 'ebook' && this.isIntegrated == "1" && this.checkboxOnlyFolletteBook.checked) {				
					result += "<span class=\"queryValue\">" + " " + AdvancedSearchController_FIELD_FORMAT_LIMIT_TO_FOLLETT_EBOOKS + "</span>";
				}
			} else {	
				result = field + ":" + this.getValue();
				if (this.getValue() == 'ebook' && this.isIntegrated == "1" && this.checkboxOnlyFolletteBook.checked) {
					result += " " + AdvancedSearchController_FIELD_FORMAT_LIMIT_TO_FOLLETT_EBOOKS;
				}
			}
		}
		
		return result;
	},
	
	setValue: function(val) {
		this.selectBox.selectedIndex = val;
	},
	
	getValue: function() {
		return this.selectBox.getValue();
	},
	
	setTabOrder: function(tabIndex) {
		this.selectBox.tabIndex = tabIndex++;
		if(this.getValue() == 'ebook' && this.isIntegrated == "1")
		{
			this.checkboxOnlyFolletteBook.tabIndex = tabIndex++;
		}
		return tabIndex ;
	}
}),

 AdvancedSearchFountasPinnellLimiter: Class.create({
	initialize: function(limiters) {
		this.limiters = limiters;
		this._buildElement();
	},
	
	_buildElement: function() {
		var fp = this.limiters.advancedSearch.json_data.fountasPinnellValues;
		var defaultFrom = $H(this.limiters.advancedSearch.json_data.fountasPinnellValues[0]).keys()[0];
		var optionsFrom = [];			
		var optionsTo = [];			
		
		var key;
		for (var i = 0; i < fp.length; i ++) {
			var element = $H(this.limiters.advancedSearch.json_data.fountasPinnellValues[i]);
			key = element.keys()[0];
			optionsFrom.push(Builder.node("option", {value: key}, element.get(key)));
			optionsTo.push(Builder.node("option", {value: key}, element.get(key)));
		}
		
		this.selectBoxFrom = Builder.node("select", {}, optionsFrom);
		this.selectBoxFrom.setValue(defaultFrom);
		this.selectBoxTo = Builder.node("select", {}, optionsTo);
		this.selectBoxTo.setValue(key);
	 	this.element = Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_from"));
	 	this.element.insert(this.selectBoxFrom);
	 	this.element.insert(Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")));
	 	this.element.insert(this.selectBoxTo);
	 	
	 	if (this.limiters) {
			var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
			Event.observe(this.selectBoxFrom, "change", boundFireUpdate);
			Event.observe(this.selectBoxTo, "change", boundFireUpdate);
	 	}
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		var json = this.getValue();
		if (json.from.length > 0 || json.to.length > 0) {
			var field = AdvancedSearchController_DQL_FIELD_FOUNTASPINNELL;
			if (doHighlight) {
				result = "<span class=\"queryProperty\">" + field + ":[</span><span class=\"queryValue\">" + json.from + "</span><span class=\"queryBoolean\"> TO </span><span class=\"queryValue\">" + json.to + "</span><span class=\"queryProperty\">]</span>";
			} else {
				result = field + ":[" + json.from + " "+ this.limiters.advancedSearch.json_data.toNoColon_string +" " + json.to + "]";
			}
		}
		return result;
	},
	
	setValue: function(from, to) {
		this.selectBoxFrom.setValue(from);
		this.selectBoxTo.setValue(to);
	},
	
	getValue: function() {
		if (this.selectBoxFrom.selectedIndex > this.selectBoxTo.selectedIndex) {
			return {from: this.selectBoxTo.getValue(), to: this.selectBoxFrom.getValue()};
		} else {
			return {from: this.selectBoxFrom.getValue(), to: this.selectBoxTo.getValue()};
		}
	},
	
	setTabOrder: function(tabIndex) {
		this.selectBoxFrom.tabIndex = tabIndex++;
		this.selectBoxTo.tabIndex = tabIndex++;
		return tabIndex;
	}
}),


AdvancedSearchInterestLimiter:  Class.create({
	initialize: function(limiters) {
		this.limiters = limiters;
		this._buildElement();
	},
	
	_buildElement: function() {
		var interests = this.limiters.advancedSearch.json_data.interestLevels;		
		var optionsFrom = [];
		var optionsTo = [];
		var defaultFrom = $H(this.limiters.advancedSearch.json_data.interestLevels[0]).keys()[0];
		
		for (var i = 0; i < interests.length; i ++) {
			var element = $H(this.limiters.advancedSearch.json_data.interestLevels[i]);
			var key = element.keys()[0];
			optionsFrom.push(Builder.node("option", {value: key}, element.get(key)));
			optionsTo.push(Builder.node("option", {value: key}, element.get(key)));
		}
		
		this.selectBoxFrom = Builder.node("select", {}, optionsFrom);
		this.selectBoxFrom.setValue(defaultFrom);
		this.selectBoxTo = Builder.node("select", {}, optionsTo);
		this.selectBoxTo.setValue(key);
		this.element = Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_from"));
		this.element.insert(this.selectBoxFrom);
		this.element.insert(Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")));
		this.element.insert(this.selectBoxTo);
		
	 	if (this.limiters) {
			var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
			Event.observe(this.selectBoxFrom, "change", boundFireUpdate);
			Event.observe(this.selectBoxTo, "change", boundFireUpdate);
	 	}
	},
	
	getElement: function() {
		return this.element;
	},
	
	setValue: function(from, to) {
		this.selectBoxFrom.setValue(from);
		this.selectBoxTo.setValue(to);
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		var json = this.getValue();
		if (json.from.length > 0 || json.to.length > 0) {
			var field = AdvancedSearchController_DQL_FIELD_INTERESTLEVEL;
			if (doHighlight) {
				result = "<span class=\"queryProperty\">" + field + ":[</span><span class=\"queryValue\">" + json.from + "</span><span class=\"queryBoolean\"> TO </span><span class=\"queryValue\">" + json.to + "</span><span class=\"queryProperty\">]</span>";
			} else {
				result = field + ":[" + json.from + " "+ this.limiters.advancedSearch.json_data.toNoColon_string +" " + json.to + "]";
			}
		}
		return result;
	},
	
	getValue: function() {
		if (this.selectBoxFrom.selectedIndex > this.selectBoxTo.selectedIndex) {
			return {from: this.selectBoxTo.getValue(), to: this.selectBoxFrom.getValue()};
		} else {
			return {from: this.selectBoxFrom.getValue(), to: this.selectBoxTo.getValue()};
		}
	},
	
	setTabOrder: function(tabIndex) {
		this.selectBoxFrom.tabIndex = tabIndex++;
		this.selectBoxTo.tabIndex = tabIndex++;
		return tabIndex;
	}
}),

AdvancedSearchYearLimiter: Class.create({
	initialize: function(limiters) {
		this.limiters = limiters;
		this._buildElement();
	},
	
	_buildElement: function() {
		this.element = Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_yearColon"));
		this.textInput = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "4"});
		this.element.insert(this.textInput);
		
		this.radio1 = Builder.node("input", {"class": "advSearch-RadioInput", type: "radio", value: AdvancedSearchController_DQL_FIELD_PUBYEAR, name: "AdvYearRadioGroup", checked: "checked"});
		this.radio2 = Builder.node("input", {"class": "advSearch-RadioInput", type: "radio", value: AdvancedSearchController_DQL_FIELD_BEFORE, name: "AdvYearRadioGroup"});
		this.radio3 = Builder.node("input", {"class": "advSearch-RadioInput", type: "radio", value: AdvancedSearchController_DQL_FIELD_AFTER, name: "AdvYearRadioGroup"});
		
		this.element.insert(Builder.node("label", {}, [this.radio1, MessageHelper.format("advancedSearchDataValue_during")]));
		this.element.insert(Builder.node("label", {}, [this.radio2, MessageHelper.format("advancedSearchDataValue_before")]));
		this.element.insert(Builder.node("label", {}, [this.radio3, MessageHelper.format("advancedSearchDataValue_after")]));
		
	 	if (this.limiters) {
			var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
			Event.observe(this.radio1, "click", boundFireUpdate);
			Event.observe(this.radio2, "click", boundFireUpdate);
			Event.observe(this.radio3, "click", boundFireUpdate);
			Event.observe(this.textInput, "keypress", boundFireUpdate);
	 	}
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		
		if (this.getValue().year.length > 0) {
			if (doHighlight) {
				result = "<span class=\"queryProperty\">" + this.getValue().option + ":</span> <span class=\"queryValue\">" + this.getValue().year + "</span>";
			} else {
				result = this.getValue().option + ":" + this.getValue().year;
			}
		}
		
		return result;
	},
	
	setValue: function(year, checkRadio) {
		switch (checkRadio) {
		case 1:
			this.radio1.checked = true;
			this.radio2.checked = false;
			this.radio3.checked = false;
			break;
		case 2:
			this.radio1.checked = false;
			this.radio2.checked = true;
			this.radio3.checked = false;
			break;
		case 3:
			this.radio1.checked = false;
			this.radio2.checked = false;
			this.radio3.checked = true;
			break;
		default:
			break;
		}
		this.textInput.setValue(year);
	},
	
	getValue: function() {
		var optionValue = "";
		if (this.radio1.checked) {
			optionValue = this.radio1.value;
		}
		if (this.radio2.checked) {
			optionValue = this.radio2.value;
		}
		if (this.radio3.checked) {
			optionValue = this.radio3.value;
		}
		return {year: this.textInput.getValue().escapeHTML(), option: optionValue};
	},
	
	setTabOrder: function(tabIndex) {
		this.textInput.tabIndex = tabIndex++;
		this.radio1.tabIndex = tabIndex++;
		this.radio2.tabIndex = tabIndex++;
		this.radio3.tabIndex = tabIndex++;
		
		return tabIndex;
	}
}),

AdvancedSearchLexileLimiter: Class.create({
	initialize: function(limiters) {
		this.limiters = limiters;
		this._buildElement();
	},
	
	_buildElement: function() {
		var lexiles = this.limiters.advancedSearch.json_data.lexileCodes;
		var options = [];
		var defaultLexile = $H(this.limiters.advancedSearch.json_data.lexileCodes[0]).keys()[0];
		
		for (var i = 0; i < lexiles.length; i ++) {
			var element = $H(this.limiters.advancedSearch.json_data.lexileCodes[i]);
			var key = element.keys()[0];
			options.push(Builder.node("option", {value: key}, element.get(key)));
		}
		
		this.selectBox = Builder.node("select", {}, options);
		this.selectBox.setValue(defaultLexile);
		
		this.inputFrom = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "5"});
		this.inputTo = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "5"});
		
		
		this.element = Builder.node("div", {}, [
            Builder.node("div", {}, [
 		        Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_from")),
 		        this.inputFrom,
		        Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")),
		        this.inputTo]),
            Builder.node("div", {}, this.selectBox)
		    ]);
		
	 	if (this.limiters) {
			var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
			Event.observe(this.selectBox, "change", boundFireUpdate);
			Event.observe(this.inputFrom, "keypress", boundFireUpdate);
			Event.observe(this.inputTo, "keypress", boundFireUpdate);
	 	}
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		var json = this.getValue();
		
		if (json.code != 0) {
			var field = AdvancedSearchController_DQL_FIELD_LEXILECODE;
			if (doHighlight) {
				result += "<span class=\"queryProperty\">" + field + ":</span><span class=\"queryValue\">" + json.code + "</span>"; 
			} else {
				result += field + ":" + json.code; 
			}
		}
		
		if (json.from.length > 0 && json.to.length > 0) {
			var field = AdvancedSearchController_DQL_FIELD_LEXILEMEASURE;
			if (doHighlight) {
				result += "<span class=\"queryProperty\">" + field + ":[</span><span class=\"queryValue\">" + json.from + "</span><span class=\"queryBoolean\"> TO </span><span class=\"queryValue\">" + json.to + "</span><span class=\"queryProperty\">]</span>"; 
			} else {
				result += field + ":[" + json.from + " TO " + json.to + "]"; 
			}
		}
		return result;
	},
	
	setValue: function(from, to, code) {
		this.inputFrom.value = from;
		this.inputTo.value = to;
		this.selectBox.selectedIndex = code;
	},
	
	getValue: function() {
		var from = this.inputFrom.value;
		var to = this.inputTo.value;
		if (from.length > 0 && to.length ==0) {
			to = "9999";
		}
		if (from.length == 0 && to.length > 0) {
			from = "0";
		}
		
		if (from.length > 0 && to.length > 0 &&
			Utility.isNumber(from) && Utility.isNumber(to) &&
			eval(from.escapeHTML()) > eval(to.escapeHTML())) {
			return {from: to.escapeHTML(), to: from.escapeHTML(), code: this.selectBox.getValue()};
		}
		return {from: from.escapeHTML(), to: to.escapeHTML(), code: this.selectBox.getValue()};
	},
	
	setTabOrder: function(tabIndex) {
		this.inputFrom.tabIndex = tabIndex++;
		this.inputTo.tabIndex = tabIndex++;
		this.selectBox.tabIndex = tabIndex++;
		
		return tabIndex;
	}
}),

AdvancedSearchCallNumberLimiter: Class.create({
	initialize: function(limiters) {
	this.limiters = limiters;
	this._buildElement();
},

_buildElement: function() {
	
	this.inputFrom = Builder.node("input", {"class": "advSearch-RangeInput"});
	this.inputTo = Builder.node("input", {"class": "advSearch-RangeInput"});
	
	
	this.element = Builder.node("div", {}, [
	                                        Builder.node("div", {}, [
	                                                                 Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_from")),
	                                                                 this.inputFrom,
	                                                                 Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")),
	                                                                 this.inputTo])
	                                                                 ]);
	
	if (this.limiters) {
		var boundFireUpdate = this.limiters.fireUpdateEvent.bindAsEventListener(this.limiters);
		Event.observe(this.inputFrom, "keypress", boundFireUpdate);
		Event.observe(this.inputTo, "keypress", boundFireUpdate);
	}
},

getElement: function() {
	return this.element;
},

getQueryString: function(doHighlight) {
	var result = "";
	var json = this.getValue();
	
	if (json.from.length > 0 && json.to.length > 0) {
		var field = AdvancedSearchController_DQL_FIELD_CALLNUMBER;
		if (doHighlight) {
			result += "<span class=\"queryProperty\">" + field + ":[</span><span class=\"queryValue\">" + json.from + "</span><span class=\"queryBoolean\"> TO </span><span class=\"queryValue\">" + json.to + "</span><span class=\"queryProperty\">]</span>"; 
		} else {
			result += field + ":[" + json.from + " TO " + json.to + "]"; 
		}
	}
	return result;
},

setValue: function(from, to) {
	this.inputFrom.value = from;
	this.inputTo.value = to;
},

getValue: function() {
	var from = this.inputFrom.value;
	var to = this.inputTo.value;
	if (from.length > 0 && to.length ==0) {
		to = "[ANY]";
	}
	if (from.length == 0 && to.length > 0) {
		from = "[ANY]";
	}
	
	if (from.length > 0 && to.length > 0 &&
			Utility.isNumber(from) && Utility.isNumber(to) &&
			eval(from.escapeHTML()) > eval(to.escapeHTML())) {
		return {from: to.escapeHTML(), to: from.escapeHTML()};
	}
	return {from: from.escapeHTML(), to: to.escapeHTML()};
},

setTabOrder: function(tabIndex) {
	this.inputFrom.tabIndex = tabIndex++;
	this.inputTo.tabIndex = tabIndex++;
	
	return tabIndex;
}
}),

AdvancedSearchReadingProgramLimiter: Class.create({
	initialize: function(limiters, type) {
		this.limiters = limiters;
		this._buildElement();
		this.type = type;
	},
	
	_buildElement: function() {
		this.levelFrom  = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "5", value: this.limiters.advancedSearch.json_data.zero_string});
		this.levelTo = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "5", value: this.limiters.advancedSearch.json_data.twenty_string});
		this.pointFrom  = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "5", value: this.limiters.advancedSearch.json_data.zero_string});
		this.pointTo = Builder.node("input", {"class": "advSearch-RangeInput", maxlength: "5", value: this.limiters.advancedSearch.json_data.onethirty_string});
		
		this.element = Builder.node("div", {}, [
            Builder.node("div", {}, [
 		        Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_levelFrom")),
 		        this.levelFrom,
		        Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")),
		        this.levelTo]),
	        Builder.node("div", {}, [
                 Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_pointValueFrom")),
                 this.pointFrom,
                 Builder.node("span", {"class": "label"}, MessageHelper.format("advancedSearchDataValue_to")),
                 this.pointTo]),
		    ]);
	},
	
	getElement: function() {
		return this.element;
	},
	
	getQueryString: function(doHighlight) {
		var result = "";
		return result;
	},
	
	setValue: function(pointFrom, pointTo, levelFrom, levelTo, type) {
		this.pointFrom.value = pointFrom;
		this.pointTo.value = pointTo;
		this.levelFrom.value = levelFrom;
		this.levelTo.value = levelTo;
		this.type = type;
	},
	
	getValue: function() {
		var result = null;
		
		if ((! this.pointFrom.getValue().empty() && ! this.pointTo.getValue().empty()) ||
			(! this.levelFrom.getValue().empty() && ! this.levelTo.getValue().empty())) {
			result = {type: this.type,
				points: {from: this.pointFrom.getValue().escapeHTML(), to: this.pointTo.getValue().escapeHTML()}, 
			    level: {from: this.levelFrom.getValue().escapeHTML(), to: this.levelTo.getValue().escapeHTML()}};
		}
		return result;
	},
	
	setTabOrder: function(tabIndex) {
		this.levelFrom.tabIndex = tabIndex++;
		this.levelTo.tabIndex = tabIndex++;
		this.pointFrom.tabIndex = tabIndex++;
		this.pointTo.tabIndex = tabIndex++;
		
		return tabIndex;
	}
  })
})
});