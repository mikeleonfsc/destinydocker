/* reportabuse.js */
Class.create(BaseController, {
    init: function() {
		this.modal.show();
		this.conversationID = this.data.conversationID;
		this.recommendationID = this.data.recommendationID;	
		var textarea = this.elementMap.get(ReportAbuseController_FIELD_ADD_REPORT_ABUSE_TEXT);
		textarea.focus();		
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(ReportAbuseController_BUTTON_REPORT_ABUSE_CLOSE), "mousedown", this.closeDialog.bind(this));
        Event.observe(this.elementMap.get(ReportAbuseController_BUTTON_REPORT_ABUSE_SAVE), "click", this._saveAction.bind(this));
		Event.observe(this.elementMap.get(ReportAbuseController_FIELD_ADD_REPORT_ABUSE_TEXT), "keyup", this.addReportAbuseNoteAsYouTypeListener.bindAsEventListener(this));
    },
    
    closeDialog: function() {
    	this.modal.closeDialog();
    },
    
    _saveAction: function (event, eventSource, ajaxObject) {
        var conversationID = this.conversationID;
        var recommendationID = this.recommendationID;
        
        var comments = this.elementMap.get(ReportAbuseController_FIELD_ADD_REPORT_ABUSE_TEXT).value;
        
        if (Object.isElement(this.elementMap.get(ReportAbuseController_BUTTON_REPORT_ABUSE_SAVE))) {
        	this.elementMap.get(ReportAbuseController_BUTTON_REPORT_ABUSE_SAVE).disable();
        }
        
        DAO.load({endpoint: "ReportAbuseController.Saver"}, conversationID, recommendationID, comments);
    },
    
	addReportAbuseNoteAsYouTypeListener: function (event) {
		var eventSource = Event.element(event);
		if (eventSource.hasClassName("myQuestAddReportAbuseNoteBox")) {
			var wrapper = Utility.upToClass(eventSource, "genericModuleContent");
			var numbers = Utility.downToClass(wrapper, "myQuestAddReportAbuseNoteCharValue");
			if (eventSource.value.length > 2048) {			
				eventSource.value = eventSource.value.substring(0, 2048);
			}
			if (eventSource.value.length > 2028) {
				numbers.addClassName("warnCharLeft");
			} 
			if (eventSource.value.length <= 2028 && numbers.hasClassName("warnCharLeft") ){
				numbers.removeClassName("warnCharLeft");
			}
			numbers.innerHTML = 2048 - eventSource.value.length;
		}
	}    
});