/* limiterhistoryelement.js */
Class.create(BaseController, {
    init: function() {
		var limiterHistory = Registry.lookup("LimiterController.History");
		limiterHistory.notifyHistoryLoaded(this.data);
    },

    registerEvents: function() {
    }
});