/* questerror.js */
Class.create(BaseController, {
	init: function() {
		this.errors = this.data.errors;
		this.messages = this.data.messages;
		if (this.hasErrors() || this.hasMessages()) {
			this.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).show();
		} else {
			this.hide();
		}
	},
	
	getErrors: function() {
		return this.errors;
	},
	
	hasErrors: function() {
		var result = false;
		if(this.errors && this.errors.length > 0) {
			result = true;
		}
		return result;
	},

	hasMessages: function() {
		var result = false;
		if(this.messages && this.messages.length > 0) {
			result = true;
		}
		return result;
	},
	
	clearMessages: function() {
		this.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).update("");
		this.elementMap.get(QuestErrorController_DIV_ERROR_MESSAGE).hide();
	}
});