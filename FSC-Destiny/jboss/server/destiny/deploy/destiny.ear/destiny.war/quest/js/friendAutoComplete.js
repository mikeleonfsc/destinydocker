Class.create({
	
initialize: function(options) {
	this.options = Object.extend({
		wrapperID: null,
		textFieldID: null,
		resultsID: null,
		loadingID: null,
		timeoutInMillis: 250
    }, options);

	this.inputField = $(this.options.textFieldID);
	this.results = $(this.options.resultsID);
	this.wrapper = $(this.options.wrapperID);
	this.loading = $(this.options.loadingID);
	
	this.inputField.activate();
	this.oldValue = this.inputField.getValue();

	Event.observe(this.inputField, "keyup", this.onKeyPress.bindAsEventListener(this));
},

onKeyPress: function(event) {
	if (this.timeout) {
		this.timeout.stopTimeout();
	}
    var searchTerm = this.inputField.getValue();
    if (!searchTerm || searchTerm.length < 3) {
        this.results.hide();
    	this.loading.hide();
        this.oldValue = '';
    } else if (searchTerm != this.oldValue) {
    	this.timeout = new Timeout(this.options.timeoutInMillis, this.fireAjaxCall.bind(this));
    }
},

fireAjaxCall: function() {
    var searchTerm = this.inputField.getValue();
    this.oldValue = searchTerm;
	this.loading.show();
	
	var r = Registry.lookup("MyQuestFriendsController.Loader");
	r.findFriends(searchTerm + "z");		
}
});
