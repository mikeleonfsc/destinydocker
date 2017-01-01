/* hold.js */
Class.create(BaseController, {
    init: function() {	
		this.modal.show();
	    
	    this.bibID = this.data.bibID;
	    //initialize bolding
	    if(this.bibID) {
	    	this.elementMap.get(HoldController_SPAN_ADD_HOLD_TITLE).addClassName(HoldController_CLASS_ADD_HOLD_TITLE);                   
	    }
    },

    registerEvents: function() {
        Event.observe(this.elementMap.get(HoldController_BUTTON_ADD_HOLD_CLOSE), "mousedown", this.closeDialog.bind(this));
        Event.observe(this.elementMap.get(HoldController_BUTTON_ADD_HOLD_CLOSE_BOTTOM), "mousedown", this.closeDialog.bind(this));
        Event.observe(this.elementMap.get(HoldController_BUTTON_ADD_HOLD_SAVE), "click", this.addHold.bind(this));
        Event.observe(this.elementMap.get(HoldController_FIELD_HOLD_QUANTITY), "keyup", this.forceNumeric.bind(this));
    },

    populateErrors: function(errors) {
    	var errorHTML = ReusableTemplates.load("GenericListTemplate", {list:errors});
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_ERRORS).update(errorHTML);
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_ERRORS).show();
    	this.elementMap.get(HoldController_BUTTON_ADD_HOLD_SAVE).disabled = false;
    	this.elementMap.get(HoldController_BUTTON_ADD_HOLD_SAVE).blur();
    },
    
    populateHoldMessage: function(message) {
    	var messageHTML = ReusableTemplates.load("GenericListTemplate", {list:message});
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_CLOSE_AREA).show();
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_MESSAGE).show(messageHTML);
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_MESSAGE).update(messageHTML);
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_ERRORS).hide();
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_QUANTITY).hide();
    	this.elementMap.get(HoldController_DIV_ADD_HOLD_SAVE_AREA).hide();
    },
    
    addHold: function(event) {
        this.elementMap.get(HoldController_BUTTON_ADD_HOLD_SAVE).disabled = true;                        
        var quantity = this.elementMap.get(HoldController_FIELD_HOLD_QUANTITY).getValue();
        var loadResult = false;
        loadResult = DAO.load({endpoint:"HoldController.HoldGranter", container: null, method:'post'}, this.bibID, quantity)
        if(!loadResult) {
        	this.elementMap.get(HoldController_BUTTON_ADD_HOLD_SAVE).disabled = false;                        
        }
    },

    closeDialog: function(event) {
            this.modal.closeDialog();
    },
    
    forceNumeric: function(event) {
    	var qtyField = this.elementMap.get(HoldController_FIELD_HOLD_QUANTITY);
    	var quantity = qtyField.getValue();
    	var newQuantity = "";
    	
    	for (var i = 0; i < quantity.length; i++) {
    		var aChar = quantity.substr(i, 1);
    		if (aChar  >= '0' && aChar <= '9') {
    			newQuantity = newQuantity + aChar;
    		}
    	}
  		qtyField.setValue(newQuantity);
    } 
});