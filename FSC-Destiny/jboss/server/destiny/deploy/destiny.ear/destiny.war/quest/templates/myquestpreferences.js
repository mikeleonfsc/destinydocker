/* myquestpreferences.js */
Class.create(BaseController, {
	init: function() {
		var loader = Registry.lookup("MyQuestController.Loader");
	    
		$("myQuestMainContentWrapper").className = "myQuestPref";	
 	},
	
	registerEvents: function() {
 		Event.observe('myQuestMainContent', "click", this.savePreference.bindAsEventListener(this));
 		
 	},
 	
 	savePreference: function(event) {
 		var eventSource = Event.element(event);
 		if (eventSource.hasClassName("myQuestPreferencesControler")) {
 			var sourceValue = eventSource.identify();
	        var value = $F(sourceValue); 				       
	        if (!value || value.empty() || value == "no") {
	            value = false;
	        } else {
	        	value = true;
	        }
	        // Show the 'saved' message and fade it out over 3 seconds.
	        var savedSpan = Utility.downToClass(eventSource.up().up(), "myQuestSavedAlert");
	        
	        if (!this.preferencesAnimations) {
	            this.preferencesAnimations = [];
	        }
	        if (this.preferencesAnimations[sourceValue]) {
	            this.preferencesAnimations[sourceValue].cancel();
	        }
	        savedSpan.show();
	        savedSpan.setStyle({opacity: 1});	        
	        this.preferencesAnimations[sourceValue] = new Effect.Fade(savedSpan, {duration: 3.0});
	        DAO.load({endpoint:"MyQuestPreferencesController.PreferenceUpdate",container:null},eventSource.getAttribute("name"), value )	        
 		}
    }
});