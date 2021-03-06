/* myquestcommentadd.js */
Class.create(BaseController, {
	init: function() {		
		var json = this.data;
		if (json.updateID) {
	        var myTemp = $$(".auditID[value=" + json.addCommentButtonID + "]")[0];
	        var temp = Utility.upToClass(myTemp, "myQuestUpdatesItem");
	        Utility.downToClass(temp, "conversationID").writeAttribute("value", json.conversationID);
	        var commentSection = Utility.downToClass(temp, "commentSectionWrapper");
	        
	        if (json.addCommentButtonID && !commentSection.visible()) {
	            var temp2 = $$(".myQuestAddCommentWrapper[index=" + json.addCommentButtonID + "]")[0];
	            Effect.SlideUp(temp2.up());
	        }
	        if (json.commentData) {
	            var html = ReusableTemplates.load("MyQuestMiniCommentTemplate", json.commentData);
	            if (commentSection.visible()) {
	                var lastDisplayable = $$("li.lastDisplayable")[0];
	                if (lastDisplayable) {
	                    var ul = Utility.upToClass(lastDisplayable, "myQuestCommentsDisplayed");
	                    ul.insert(html);     
	                    var addCommentBox = $$(".myQuestAddCommentBox[index=" + json.addCommentButtonID + "]")[0];
	                    if (addCommentBox) {
	                        addCommentBox.activate();
	                    }
	                }
	                
	                var numbers = Utility.downToClass(temp, "myQuestAddCommentCharValue");
	                numbers.innerHTML = 255;
	                
	                var commentCount = Utility.downToClass(temp, "commentCount");
	                if (commentCount) {
	                    var count = eval(commentCount.innerHTML);
	                    commentCount.innerHTML = count+1;
	                }
	            } else {
	                var toolbar = Utility.downToClass(temp, "myQuestUpdatesToolbar");
	                var hasViewAllComments = Utility.downToClass(toolbar, MyQuestUpdatesController_CLASS_MYQUEST_VIEW_ALL_COMMENT) != undefined;
	                if (!hasViewAllComments) {
	                	Element.insert(toolbar.down(), {after: ' | <a href="#" id="" class="' + MyQuestUpdatesController_CLASS_MYQUEST_VIEW_ALL_COMMENT + '" onclick="return false;">' + MessageHelper.format("myQuestUpdatesController_viewAllComments") + '</a> | <a href="#" id="" class="' + MyQuestUpdatesController_CLASS_MYQUEST_REPORT_ABUSE + '" onclick="return false;">'+MessageHelper.format("myQuestUpdatesController_reportAbuse")+'</a>'});
	                }
	            }
	        }
	    }
 	},
	
	registerEvents: function() { 		 		
 	}
 	
});