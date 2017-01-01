/* myQuestList.js */
Class.create({

initialize: function(optionArray) {
	this.options = Object.extend({
		resultsDivID: null,
		rowClass: 'myQuestFriendsItem',
		showDateGroups: true,
		todayStr: null,
		emptyStr: null,
		todayGroupHeaderStr: null
    }, optionArray);
	this.results = $(this.options.resultsDivID);
	this.results.show();
},

removeRow: function(id, msg, afterFunk) {
	var obj = $$("." + this.options.rowClass + "[rowid=" + id + "]")[0];
	var result = obj; 
	
	if (obj) {
		if (msg) {
			var messageElement = obj.cloneNode(true);
			messageElement.down(".column3").innerHTML = "<p class=\"myQuestRowMessage\">" + msg + "</p>";
			
			var previousElement = obj.previous();
			if (previousElement) {
				Element.insert(previousElement, {after: messageElement});
			} else {
				previousElement = obj.up();
				Element.insert(previousElement, {top: messageElement});
			}
			obj.remove();
			
			var myFunk = function() {
				result = this._removeRowFromDOM(messageElement);
	        	if (afterFunk) {
	        		afterFunk(obj);
	        	}
			};
			
			var myOtherFunk = function() {
				if (messageElement && (messageElement.up(".myQuestDateGroup") || messageElement.up(".myQuestUpdatesResultsClass"))) {
			        Effect.BlindUp(messageElement, { duration: 0.5, 
			            afterFinish: myFunk.bind(this)
			        });
				} else {
					// our clone object no longer exists in the search results (i.e. user must have redone a search before
					//   we could remove it), so call the afterFunk if it's defined (usually this will readd it to the DOM)
					if(afterFunk){
						afterFunk(obj);
					}
				}
			};
			
			window.setTimeout(myOtherFunk.bind(this), 3000);
		} else {
			var myFunk = function() {
	        	result = this._removeRowFromDOM(obj);
	        	if (afterFunk) {
	        		afterFunk(result);
	        	}
			};
			
	        Effect.BlindUp(obj.id, { duration: 0.5, 
	            afterFinish: myFunk.bind(this)
	        });
		}
	}
    return result;
},

_removeRowFromDOM: function(obj) {
	if (
		(obj.previous() != null && obj.previous().hasClassName("activityDateStamp")) &&
        (obj.next() == undefined || !obj.next().hasClassName("myQuestItem"))
       ) {
		 var dateStamp = obj.previous();
		 if (dateStamp.previous() != null && dateStamp.previous().hasClassName("myQuestDateGroupElement") && 
		    (obj.next() == undefined || obj.next().hasClassName("myQuestDateGroupElement"))) {
			// If we are the LAST element within a date group, then remove it from the DOM too
			 dateStamp.previous().remove();
		 }
		 // If we are the LAST element within a dateStamp 'group' (it's really our sibling), then
		 //  remove it from the DOM too
		obj.previous().remove();
    }	

	if (obj.up('.myQuestDateGroup') && obj.up('.myQuestDateGroup').childElements().length == 1 && document.getElementById("myQuestEarlierPostControlLink") == null) {
		obj.up('.myQuestDateGroup').insert("<span class=\"noDataMessage\">" + this.options.emptyStr + "</span>");
	}
	
	return obj.remove();
},

addRow: function(object) {
	var rowID = object.getAttribute("rowid");
	var obj = $$("." + this.options.rowClass + "[rowid=" + rowID + "]")[0];
	if (!obj) {
		// If we do not have TODAY listed in the list of dates, add it
		if (this.results.down().down().hasClassName("noDataMessage")) {
			// We have no friends right now, but, we're adding one, so remove the 'no friends' message
			this.results.down().down().remove();
		}
		
		if (this.options.showDateGroups) {
			if (this.results.down().down() == null || 
			    this.results.down().down().down().innerHTML != MessageHelper.format("myQuestController_today")) {
				// Today does not exist at all in the section, so we need to add the date header
	            var todayStamp = 
	                Builder.node("p", {"class": "activityDateStamp"},
	                    [Builder.node("span", {"class": "dateStampContext"}, MessageHelper.format("myQuestController_today")),
	                     Builder.node("em", {"class": "dateStampFormatted"}, this.options.todayStr)
	                    ]
	                );
	            
	            Element.insert(this.results.down(),{top: todayStamp});
	        }
			
			Element.insert(this.results.down().down(),{after: object});
		} else {
			Element.insert(this.results.down(), {top: object});
		}
		
		Effect.BlindDown(object.id, {duration: 0.5});
	}
}

});