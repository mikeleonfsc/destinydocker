/* baseAutoComplete.js */
Class.create(Autocompleter.Base, {
	
initialize: function($super, textFieldID, suggestionsID, options) {
	var mergedOptions = Object.extend({
        onShow: function(element, update) {
			// Still need to override this method because Prototype wants to absolutely position the element and assign 
			// values to the left and top attributes.
            Effect.Appear(update,{duration:0.15});
        }
    }, options);
	this.textFieldID = textFieldID;
	this.suggestionsID = suggestionsID;
	this.mergedOptions = mergedOptions;	

},
startMe: function() {	
	this.baseInitialize(this.textFieldID, this.suggestionsID, this.mergedOptions);
},
// We need to be able to handle timeout exceptions while performing autocomplete
// Exceptions from the server are returned as a 500 error
onComplete: function($super, request) {
    if (request.transport.status != 500) {
        $super(request);
    }
}

});