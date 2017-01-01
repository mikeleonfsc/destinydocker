/* myquestfriends.js */
Class.create(BaseController, {
	init: function() {
		var loader = Registry.lookup("MyQuestController.Loader");
	
    	$("myQuestMainContentWrapper").className = "myQuestFriends";
    
    	this.friendSearch = new FriendFindAutoCompleter({
    		wrapperID: "myQuestMainContent",
    		textFieldID: "myQuestFindFriendInput",
    		resultsID: "myQuestFindFriendResults",
    		loadingID: "findFriendSearchInProgress"
    	});
    	this.elementMap.get(MyQuestFriendsController_IMG_FIND_FRIEND_SEARCH_IN_PROGRESS).hide();
		var todayStr = this.data.todayStr;		
		this.friendsSearchList = new MyQuestList({resultsDivID: 'myQuestFindFriendResults', todayStr: todayStr, emptyStr: MessageHelper.format("myQuestFriendsController_noMatches")});
        this.incomingRequestsList = new MyQuestList({resultsDivID: 'myQuestFriendsHeaderRequestsResults', todayStr: todayStr, emptyStr: MessageHelper.format("myQuestFriendsController_youHaveNoIncomingFriendRequests")});
        this.outgoingRequestsList = new MyQuestList({resultsDivID: 'myQuestFriendsHeaderSentRequestsResults', todayStr: todayStr, emptyStr: MessageHelper.format("myQuestFriendsController_youHaveNoOutgoingFriendRequests")});
        this.friendsList = new MyQuestList({resultsDivID: 'myQuestFriendsHeaderMyFriendsResults', showDateGroups: false, todayStr: todayStr, emptyStr: MessageHelper.format("myQuestFriendsController_youCurrentlyHaveNoFriendsDefined")});				
 	},	   
	registerEvents: function() { 		  		
 		Event.observe('myQuestMainContent', "click", this.determineAction.bindAsEventListener(this));
 		Event.observe("myQuestFindFriendInput", "click", this.startSearchBox.bindAsEventListener(this));
 		Event.observe(MyQuestFriendsController_IMG_FIND_FRIEND_CLEAR_SEARCH, "click", this.clearSearchBox.bindAsEventListener(this)); 		
 	}, 	
 	determineAction: function (event) {
 		if ($("myQuestMainContentWrapper").className == "myQuestFriends") {
	 		var eventSource = Event.element(event);
	 		var wrapper = event.target.up(".myQuestFriendsItem");
	 		if (wrapper) {
	 			var userID = wrapper.getAttribute("rowid");
		 		if (eventSource.hasClassName("myQuestControlDecline")) {
		 			wrapper.down(".myQuestControlWrapper").hide();
			        DAO.load({endpoint: "MyQuestFriendsController.RemoveFriend", container:null},userID, MyQuestController_MAPPING_FRIENDS);
		 		} else if (eventSource.hasClassName("myQuestControlAccept")) {
		 			wrapper.down(".myQuestControlWrapper").hide();
		 			DAO.load({endpoint: "MyQuestFriendsController.AddFriend", container:null},userID, MyQuestController_MAPPING_FRIENDS);
		 		}
	 		}
 		}
    },    
    removeFriendCallback: function (json) { 	
    	var loader = Registry.lookup("MyQuestFriendsController.Loader");
 		if (json.type == MyQuestFriendsController_TYPE_OUTGOING_REQUEST ) {
 			this.outgoingRequestsList.removeRow(json.userID);
 			var countSpan = $(MyQuestFriendsController_SPAN_OUTGOING_FRIENDS_COUNT );
 			var count = eval(countSpan.innerHTML);
 			countSpan.update(count-1);
 		} else if (json.type == MyQuestFriendsController_TYPE_INCOMING_REQUEST) {
 			if (this.incomingRequestsList) {        
 				this.incomingRequestsList.removeRow(json.userID);
 				var countSpan = $(MyQuestFriendsController_SPAN_INCOMING_FRIENDS_COUNT );
 				var count = eval(countSpan.innerHTML);
 				countSpan.update(count-1);
 			} 
 		} else if (json.type == MyQuestFriendsController_TYPE_FRIEND ) {
 			this.friendsList.removeRow(json.userID);
 			var countSpan = $(MyQuestFriendsController_SPAN_FRIENDS_COUNT );
 			var count = eval(countSpan.innerHTML);
 			countSpan.update(count-1);
 		} else {
 			this.friendsSearchList.removeRow(json.userID);
 		}  
 		if(json.inboxCount >= 0){
 			var menu = Registry.lookup("MyQuestController.Menu");        	
            $(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount); 			
 		}      
 	},
 	
 	addFriendCallback: function (json) {
        // This event will happen during both the add as friend via search results, and approve friend request
 		var loader = Registry.lookup("MyQuestFriendsController.Loader");
    	var me = this;
    	
        if (json.type == MyQuestFriendsController_TYPE_INCOMING_REQUEST ) {
            if (me.incomingRequestsList) { 
                var countSpan = $(MyQuestFriendsController_SPAN_INCOMING_FRIENDS_COUNT );
                var count = eval(countSpan.innerHTML);
                countSpan.update(count-1);
                me.incomingRequestsList.removeRow(json.userID, null, function(row) {                	                
                	var pic = Utility.downToClass(row, "myQuestAvatar");
                	if (pic != null && pic != undefined && json.pictureName) {
                		pic.innerHTML = "";
                		pic.innerHTML = "<img src=\""+ json.pictureName +"\" name='' id='' class='avatarImage avatarImage50' border='0'>" +
                						"<img src=\"/images/icons/general/spacer.gif\" id=\"\" class=\"blocker\" alt='' title='' width='0' height='0'>";
                	}                	
                    var controls = row.down('.column3');
                    if (controls != null && controls != undefined) {
                        controls.innerHTML = "";
                        controls.innerHTML =  "<div class=\"myQuestControlWrapper\"><p class=\"myQuestControls\"><em class=\"noLabel\"><br/>" + json.remove_string + "</em><em class=\"myQuestControlDecline\"></em></p></div>";
                    }
                    if (me.friendsList) {
                    	me.friendsList.addRow(row);
                         
                        countSpan = $(MyQuestFriendsController_SPAN_FRIENDS_COUNT);
                        count = eval(countSpan.innerHTML);
                        countSpan.update(count+1);
                    }
                });
            } 
        } else { 
            me.friendsSearchList.removeRow(json.userID, this.data.requestSent_string, function(row) {
                var controls = row.down('.column3');
                if (controls != null && controls != undefined) {
                    controls.innerHTML = "";
                    controls.innerHTML =  "<div class=\"myQuestControlWrapper\"><p class=\"myQuestControls\"><em class=\"noLabel\"><br/>"+ json.cancel_string +" </em><em class=\"myQuestControlDecline\"></em></p></div>";
                }
                
                var resultList = $(MyQuestFriendsController_ID_MYQUEST_FRIEND_RESULTS);
                if (resultList && resultList.down().down().innerHTML == json.noMatches_string) {
                    resultList.hide();
                    var inputThing = $(MyQuestFriendsController_ID_MYQUEST_FRIENDS_FINDER);
                    inputThing.value = json.searchForFriendsByName_string;
                    inputThing.activate();
                }
            
                if (me.outgoingRequestsList) {
                	me.outgoingRequestsList.addRow(row);
                    var countSpan = $(MyQuestFriendsController_SPAN_OUTGOING_FRIENDS_COUNT);
                    var count = eval(countSpan.innerHTML);
                    countSpan.update(count+1);
                }
            }); 
        }
        if(json.inboxCount >= 0){   
        	var menu = Registry.lookup("MyQuestController.Menu");        	
            $(MyQuestController_SPAN_MYQUEST_LEFT_INBOX_COUNT).update(json.inboxCount);
        }        
    },
    
    findFriends: function (searchTerm) {
        this.requestID = new Date().getTime();
        DAO.load({endpoint:"MyQuestFriendsController.FindFriends", container:null}, searchTerm, this.requestID);        
        
    },
    
    findFriendsCallback: function (json) {
        var results = $("myQuestFindFriendResults");
        var loading = $(MyQuestFriendsController_IMG_FIND_FRIEND_SEARCH_IN_PROGRESS );
        if (loading) {
            loading.hide();
        }
        if (results) {
            if (!results.visible()) {
                results.show();
            }                                               
            if (this.requestID == json.data.requestID) {
                if (json.data.error) {
                    results.innerHTML = "<div class='myQuestDateGroup'>" + json.data.error + "</div>";
                } else {
                    var ejs = new EJS ({url:json.data.template});
                    var html = ejs.render(json);
                    
                    results.innerHTML = html;
                }
            }
        }
    },
    startSearchBox: function (event) {
    	var i = $(MyQuestFriendsController_ID_MYQUEST_FRIENDS_FINDER);
    	if (i.getValue() == this.data.searchForFriendsByName_string) {
    		// only clear the default text
    		i.setValue('');
    		i.activate();
    	}
    },
    clearSearchBox: function (event) {
    	this.friendsSearchList.results.hide();
    	$("myQuestFindFriendInput").setValue(this.data.searchForFriendsByName_string);
    	$("myQuestFindFriendInput").activate();
    }
 	
});