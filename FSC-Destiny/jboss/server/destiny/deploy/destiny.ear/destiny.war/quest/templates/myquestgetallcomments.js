/* myquestgetallcomments.js */
Class.create(BaseController, {
	init: function() {	
	var json = this.data;
	    if (json) {
	    	this.auditID = eval(json.auditID);
		    json.record.canComment = json.canComment;
		    json.record.approvalNotRequired = json.approvalNotRequired;
	        var results = $("myQuestUpdatesResults");
	        if (this.commentBoxThing) {
	            this.commentBoxThing.hide();
	        }
	        
	        var updates = Registry.lookup("MyQuestUpdatesController.Loader");
	        updates.restoreOldAuditRow(results);
	        
	        this.insertNewAuditRow(results, json);
	                    
	        this.renderComments(json);	        
		    this.hideViewComments(json.canComment);
		    
	        // Need to re-get commentBoxThing so it points to the new comment box       
	        commentBoxThing = $(MyQuestUpdatesController_LI_MY_QUEST_ADD_COMMENT_BOX_PREFIX + this.auditID);
	        commentBoxThing.up().show();

		}
 	},
	insertNewAuditRow: function (results, json) {
	    var commentBoxThing = $(MyQuestUpdatesController_LI_MY_QUEST_ADD_COMMENT_BOX_PREFIX + this.auditID);
	    var currentRow = Utility.upToClass(commentBoxThing, "myQuestUpdatesItem");
	    
	    results.oldRow = currentRow;
	    
	    var ejs = new EJS ({url:json.record.template});
	    json.record.index = eval(json.auditID);
	    	
	    var newHTML = ejs.render(json.record);
	    Element.insert(currentRow, {before: newHTML});
	    this.auditID = json.record.auditID;
	    results.newAuditID = this.auditID;
	    currentRow.remove();
	},
	renderComments: function (json) {
	    var result = this.generateCommentsHTML(json);
	            
	    var commentList = $("commentSection" + this.auditID);
	    commentList.update(result.html);
	    commentList.show();
	    
	    var lastDisplayableThing = $$(".myQuestAddedCommentWrapper[commentID=" + result.lastDisplayable + "]")[0];
	    lastDisplayableThing.addClassName("lastDisplayable");
	},
	hideViewComments: function(canComment) {		
        var links = $("commentSection" + this.auditID).previous('.myQuestUpdatesToolbar');
        var html = "";
        if(canComment) {
        	html = "<a href='#' class='myQuestAddAComment' onclick='return false;'>Add a comment</a> | ";
        }
        html += "<a href='#' class='myQuestReportAbuse' onclick='return false;'>Report Abuse</a>";
        links.update(html);
	},
	generateCommentsHTML: function (json) {
	    var commentsLength = json.comments.length;
	    var DISPLAYABLE_COMMENT_LENGTH = 5;
	    var html = "";
	    if (commentsLength > DISPLAYABLE_COMMENT_LENGTH) {
	        var hiddenComments = "";
	        var viewAllDisplaySpan = "";
	        viewAllDisplaySpan += "<ul id='' class='myQuestCommentsWrapper myQuestCommentsCollapsed'>";
	        viewAllDisplaySpan += "<li id='' class='myQuestAddedCommentWrapper'>";
	        viewAllDisplaySpan += "<div id='' class='myQuestTextButtonWrapper myQuestTextButtonWrapperAsHeader'>";
	        viewAllDisplaySpan += "<a id='' class='myQuestTextButton icon iconExpandComments' href='#' onclick='return false;'>";
	        viewAllDisplaySpan += "<span id='' class='myQuestTextButtonInner'>";
	        viewAllDisplaySpan += "<span id='myQuestViewAllXCommentsLink' class='myQuestTextButtonInnerText'>";
	        viewAllDisplaySpan += MessageHelper.format("myQuestUpdatesController_viewAllCommentsX", "<span class='commentCount'>" + commentsLength + "</span>"); 
	        viewAllDisplaySpan += "</span>";
	        viewAllDisplaySpan += "</span></a></div></li></ul>";
	        html += viewAllDisplaySpan;
	        html += "<ul class='myQuestCommentsWrapper myQuestCommentsDisplayed commentHider' id='' style='display:none'>";
	        //loop for hidden rows
	        for (var i = 0;  i < commentsLength - DISPLAYABLE_COMMENT_LENGTH; i ++) {
	        	var miniHidden =ReusableTemplates.load("MyQuestMiniCommentTemplate", json.comments[i]);
	            hiddenComments += miniHidden;                   
	        }
	        html += hiddenComments;
	        html += "</ul>";
	    }
	    
	    html += "<ul class='myQuestCommentsWrapper myQuestCommentsDisplayed' id=''>";
	                           
	    var displayableRows = "";
	    var hiddenComments = "";
	    var displayableRows = new Array();
	    var lastDisplayable;
	    var startIdx = commentsLength - DISPLAYABLE_COMMENT_LENGTH;
	    //loop for displayable rows
	    if (startIdx < 0) {
	        startIdx = 0;
	    }
	    for (var i = startIdx;  i < commentsLength; i ++) {
	    	var minihtml = ReusableTemplates.load("MyQuestMiniCommentTemplate", json.comments[i]);
	        displayableRows[displayableRows.length] = minihtml;
	        if (i == (commentsLength - 1)) {
	            lastDisplayable = json.comments[i].commentID;   
	        }
	    }
	    for (j = 0; j < displayableRows.length ; j ++) {
	        html += displayableRows[j];
	    }
	    html += "</ul>";
	    
	    return {html: html, lastDisplayable: lastDisplayable};
	},
	
	expandComments: function(event) {
		var eventSource = Event.element(event);
		var icon = Utility.upToClass(eventSource,"iconExpandComments");
		if (icon) {
			var wrapper = Utility.upToClass(icon, "commentSectionWrapper");
			var hiddenComments = Utility.downToClass(wrapper, "commentHider");
			var controls = Utility.upToClass(icon, "myQuestCommentsCollapsed");
			if (controls) {
				controls.remove();
			}
			Effect.BlindDown(hiddenComments, {duration: .25});
		}
	},   
	
	registerEvents: function() { 
		var viewLink = $("myQuestViewAllXCommentsLink");
		if(viewLink) {
			Event.stopObserving("myQuestViewAllXCommentsLink");
			Event.observe(viewLink, "click", this.expandComments.bindAsEventListener(this));
		}
		//need to re-observe this title since we re-rendered it in insertNewAuditRow
		var link = $("titleDetailLink_" + this.data.record.auditID);
		if (link) {
			var titleDetailsMaster = Registry.lookup("TitleDetailsController.Master");
			var titleDetailsLoader = titleDetailsMaster.loadTitleDetails.bind(titleDetailsMaster, this.data.record.bibID, null);
			Event.observe("titleDetailLink_" + this.data.record.auditID, "mousedown", titleDetailsLoader);
		}
 	}
 	
});