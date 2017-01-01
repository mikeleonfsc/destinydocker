/* wishresult.js */
Class.create(BaseController, {
    init: function() {
		var wishDialog = Registry.lookup("WishController.WishDialog");
		if(this.data.errors && this.data.errors.length > 0) {
			wishDialog.populateErrors(this.data.errors);
		} else {
			//fancy close thingy goes here
			wishDialog.animateClose(this.data.thanks);
		}
    },

    registerEvents: function() {
    }   
});