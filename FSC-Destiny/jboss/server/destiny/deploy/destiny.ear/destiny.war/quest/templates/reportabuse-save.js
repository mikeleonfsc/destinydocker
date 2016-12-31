/* reportabuse-save.js */
Class.create(BaseController, {
    init: function() {
		var dialog = Registry.lookup("ReportAbuseController.ReportAbuseDialog");
		if (dialog && dialog.modal && Object.isFunction(dialog.modal.animatedSubmit)) {
			dialog.modal.animatedSubmit(this.data.sentMessage, 2.0);
		}
    },

    registerEvents: function() {
    }
    
});