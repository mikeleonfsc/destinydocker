/* modalDialog.js */
Class.create({

initialize: function(optionArray) {
	this.options = optionArray;
	this.visible = false;
	this.backgroundDiv = new Element("div", {id: this.options.id + "_background"});
	
	var alternateContent = $(this.options.alternateContentDiv);
	if (alternateContent) {
		this.contentDiv = alternateContent;
		this.contentExists = true;
	} else {
        this.contentDiv = new Element("div", {id: this.options.id, style: "display: none"});
		this.contentExists = false;
	}
    
    this.backgroundDiv.setStyle({
        position: "absolute",
        top: "0px",
        left: "0px",
        width: "100%",
        zIndex: this.options.zIndex,
        backgroundColor: "black",
        filter: "alpha(opacity=60)",
        MozOpacity: 0.6,
        opacity: 0.6,
        display: "none"
    }); 
          
    if (this.options.height && this.options.height.length > 0) {
        this.contentDiv.setStyle({
            height: this.options.height + (Object.isNumber(this.options.height) ? "px" : "")
        });
    }
    if (this.options.width && this.options.width.length > 0) {
        this.contentDiv.setStyle({
            width: this.options.width + (Object.isNumber(this.options.width) ? "px" : "")
        });
    }
    if (this.options.border && this.options.border.length > 0) {
        this.contentDiv.setStyle({
            border: this.options.border
        });
    }
    if (this.options.backgroundColor) {
        this.contentDiv.setStyle({
            backgroundColor: this.options.backgroundColor
        });
    }
    
    var position = "fixed";
    if (Utility.getIEVersion() == 6) {
    	position = "absolute";
    }

    this.contentDiv.setStyle({
    	zIndex: (eval(this.options.zIndex) + 1),
    	position: position,
    	top: "50%",
    	left: "50%",
    	margin: "0px 0px 0px 0px"
    });
    
    this.addDivsToDOM();
    this.showLoading();
},

showLoading: function() {
	this.contentDiv.update(new Element("img", {"src": "/images/icons/general/spacer.gif", "class": "loading"}));
	this.show();
},

addDivsToDOM: function(event) {
    $(document.body).insert(this.backgroundDiv);
    if (this.contentExists) {
    	this.contentDiv = this.contentDiv.remove();
    }
    $(document.body).insert(this.contentDiv);	
    
    this.contentDiv.setStyle({
        opacity: "1.0"
        });
    
    if (this.options.hideOnOutsideClick) {
    	var boundHandler = this.closeDialog.bindAsEventListener(this);
        Event.observe(this.backgroundDiv.identify(), "click", boundHandler); 
    }      
},

centerDialog: function() {
	if (this.visible) {
		var dialogWidth = this.contentDiv.getWidth();
		var dialogHeight = this.contentDiv.getHeight();
		
		var offseter = document.viewport.getScrollOffsets().top;
		if(Utility.getIEVersion() != 6){
		  offseter = 0;
		}
	
		var height = document.viewport.getHeight();
		var width = document.viewport.getWidth();
		var topper = (-dialogHeight/2) + offseter;
		if (height < dialogHeight) {
		    topper = -(height/2);
		}
	
	    this.contentDiv.setStyle({
	        marginTop: topper + "px",
	        marginLeft: (-dialogWidth/2) + "px"
	    });
	}
},

setOverlayStyle: function() {
    var scrollHeight;
    if (window.innerHeight && window.scrollMaxY) {  
        scrollHeight = window.innerHeight + window.scrollMaxY;
    } else if (document.body.scrollHeight > document.body.offsetHeight){ 
        scrollHeight = document.body.scrollHeight;
    } else { 
        scrollHeight = document.body.offsetHeight;
    }

    var clientHeight;
    if (self.innerHeight) { 
        clientHeight = self.innerHeight;
    } else if (document.documentElement && document.documentElement.clientHeight) { 
        clientHeight = document.documentElement.clientHeight;
    } else if (document.body) { 
        clientHeight = document.body.clientHeight;
    }   

    var pageHeight = scrollHeight;
    if(scrollHeight < clientHeight){
        pageHeight = clientHeight;
    }
        
    this.backgroundDiv.setStyle({
        height: pageHeight + "px"
    });	
},

update: function(content) {
	this.contentDiv.update(content);
	this.show();
},

show: function() {
    this.visible = true;
    this.setOverlayStyle();
    this.centerDialog();
    this.backgroundDiv.show();
    this.contentDiv.show();
},

hide: function() {
    this.backgroundDiv.hide();
    this.contentDiv.hide();
    this.visible = false;	
},

reset: function() {
    this.contentDiv.firstDescendant().setStyle({"height": null, "width": null, "marginLeft": null});
    
    var messageDiv = $("messageDivForModalDialog");
    if (messageDiv){
        messageDiv.remove();
    } 
    var hideMeDiv = Utility.downToClass(this.contentDiv, "classModalDialogShrinkyToHide");
    if (hideMeDiv) {
        hideMeDiv.removeAttribute('style');
        hideMeDiv.show();
    }
},

animatedSubmit: function(message, duration) {
	var divToMorph = this.contentDiv.firstDescendant();
	
	var myDuration = duration || 0.8;
	var myWidth = divToMorph.getWidth() / 2;
	var myHeight = divToMorph.getHeight() / 2;
	var myMargin = myWidth / 2;
    var messageDivString = "<div id=\"messageDivForModalDialog\" style=\"display: none\" class=\"classShrinkyMessage\" ></div>";
    var hideMeDiv = Utility.downToClass(this.contentDiv, "classModalDialogShrinkyToHide");

    if (hideMeDiv) {
	    hideMeDiv.insert({before: messageDivString});
	    var innerWidth = hideMeDiv.getWidth() / 2;
	    var innerHeight = hideMeDiv.getHeight() / 2;
	    
	    $("messageDivForModalDialog").setStyle({
	        height: hideMeDiv.getHeight() + "px",
	        width: hideMeDiv.getWidth() + "px"
	    });
	    
	    $("messageDivForModalDialog").update(message);       
	    hideMeDiv.hide();
	    $("messageDivForModalDialog").show();
           
		if (Utility.getIEVersion() > -1) {
               myMargin = 0;
           }
           
		new Effect.Morph($("messageDivForModalDialog"), {
		    style: {height: "40px", 
		            padding: "1px 1px 15px 1px"}, 
		            duration: 0.5
		});    

		var boundHide = this.animatedHide.bind(this,this.contentDiv, myDuration);
		boundHide.delay(myDuration);
    }
},

animatedHide: function(contentDiv, duration) {
	if (Object.isElement(contentDiv) && contentDiv.visible()) {
		if (this.visible) {
			var me = this;
			new Effect.Fade(contentDiv, {
				duration: 0.5,
				afterFinish: function() {
				me.closeDialog();
			}});
		} else {
			this.closeDialog();
		}
	}
},

closeDialog: function() {
    this.hide();
    this.contentDiv.fire("modal:close");
    this.contentDiv.remove();
    this.backgroundDiv.remove();
}

});