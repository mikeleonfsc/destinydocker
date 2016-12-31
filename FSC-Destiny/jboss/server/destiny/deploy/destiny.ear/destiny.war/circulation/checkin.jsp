<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<jsp:include page="/circulation/setsound.jsp"/>

<%
    CheckinForm form = (CheckinForm)request.getAttribute("circulation_servlet_CheckinForm");
    String focus = "barcode";
    boolean ajaxMode = form.isOperateInAjaxMode();
%>

<% if (ajaxMode) {
    String[] staticLibraries=form.getStaticLibraries();

    for (int i=0;i<staticLibraries.length;i++) {
    %>
            <script type="text/javascript" src="<%=staticLibraries[i] %>"></script>
    <% } %>
    <script type="text/javascript">
        function blockIsEmpty(block) {
        	var result=true;
        	var contents = block.text();
        	if (contents) {
            	var m = contents.match(/[^\s\r\n]/m);
                if (m) {result=false;}          	
        	}
        	return result;
        }
        function captureLinks(e) {
            var url=this.href;
            
            var rep = /handlecheckinform\.do|presentcheckinform\.do/;
            
        	if (url.match(rep)) {
        		url=url.replace(rep,'handlecheckindoprocessing.do');
            	loadBodyOfData('#<%=CheckinForm.BLOCK_MESSAGES%>',url+"&",false);
                $(this).closest('.checkinAjaxMessageBox').remove();
                barcodeFocus();
                return false;
        	}
        }
        function checkAjaxQueue() {
        	while (activeRequests < 2 && ajaxQueue.length > 0) {
        		var req = ajaxQueue.shift();
        		
                $.get(req.url,function(data) { populateData(req.block,data,req.overwrite); });
                activeRequests++;
        	}
        }
        function loadBodyOfData(intoBlock,url,overwrite) {
        	queuedRequests++;
            ajaxQueue.push({block:intoBlock,url:url,overwrite:overwrite});
            checkAjaxQueue();
        }
        function populateData(intoBlock,data,overwrite) {
            queuedRequests--;
            activeRequests--;
            checkAjaxQueue();
            var closeBoxName;
            var dataEntered;
            
            var c=data.match(/<!-- AJAXMode;ClearPreviousSelection -->/);
            if (c!==null) {
            	$("#<%=CheckinForm.BLOCK_SELECTIONS%>").closest('.checkinAjaxMessageBox').remove();
            }
            
            c=data.match(/<!-- AJAXMode;Entry="([^"]*)" -->/);
            if (c!==null) {
                dataEntered=c[1];
            }
            
            c=data.match(/<!-- AJAXMode;Forward="([^"]*)" -->/);
            if (c!==null) {
                queuedRequests=0;
                window.location.href = c[1];
                return true;
            }
            
            c=data.match(/<!-- AJAXMode;CloseBoxId="([^"]*)" -->/);
            if (c===null || c.length <= 0) {
            	// Page is not tagged as Ajax, display full-page
            	document.open();
            	document.write(data);
            	document.close();
            }else{
                closeBoxName=c[1];
                var b=data.match(/<body[^>]*>([\s\S]*)<\/body/im);
                if (b && b.length > 0) {
                    data=b[1];
                }
                if (closeBoxName != "CloseBoxTransactions") {
                    data = '<div id="'+closeBoxName+'" class="checkinAjaxMessageBox">' + data + '</div>';
                }
    
                if (overwrite) {
                    $(intoBlock).html(data);       
                }else{
                    $(intoBlock).prepend(data);       
                }

                if (blockIsEmpty($("#<%=CheckinForm.BLOCK_SELECTIONS%>"))) {
                	$("#<%=CheckinForm.BLOCK_SELECTIONS%>").remove();
                }
                if (dataEntered) {
                    $('#'+closeBoxName+' td:first').prepend("<div id=\"idMessageHeader\" class=\"SmallColRow checkinEntry\">User entered: "+dataEntered+"</div>");
                }
               	$("#"+closeBoxName+" a").bind("click", captureLinks);       
            }
            showHideCloseAll();
        }
        function populateDoProcessing(query) {
        	loadBodyOfData('#<%=CheckinForm.BLOCK_MESSAGES%>','/circulation/servlet/handlecheckindoprocessing.do'+query,
        	<%=String.valueOf(! form.isQueueMessagesOnScreen())%>);
        }
        function populateTransactions(query) {
        	loadBodyOfData('#<%=CheckinForm.BLOCK_TRANSACTION_LIST%>','/circulation/servlet/handlecheckintransactions.do'+query,true);
        }
        function removeClosebox(closeBox,closeIfMessage) {
            var close=true;
        	if (blockIsEmpty($('#'+closeBox)) || closeIfMessage) {
        	    $('#'+closeBox).remove();
                showHideCloseAll();
        	}
        }
        function handlecheckinformonsubmit() {
            var query ="?" + $('form[name="<%= CheckinForm.FORM_NAME %>"]').serialize();
            populateDoProcessing(query);
            if (closeBoxAfterOperation) {
                removeClosebox(closeBoxAfterOperation,true);
                closeBoxAfterOperation=null;
            }
            barcodeFocus();
            return false;
        }
        function barcodeFocus() {
            var barcodeField = document.forms["circulation_servlet_CheckinForm"].elements["barcode"];
            barcodeField.value="";
            barcodeField.focus();
        }
        function showHideCloseAll() {
        	if ($("#<%=CheckinForm.BLOCK_MESSAGES%>").html() != '') {
        		$("#<%=CheckinForm.BLOCK_CLEARBUTTON%>").show();
        	}else{
        		$("#<%=CheckinForm.BLOCK_CLEARBUTTON%>").hide();
            }
        	barcodeFocus();
        }
        function clearAll() {
        	$('#<%=CheckinForm.BLOCK_MESSAGES%>').html('');
        	showHideCloseAll();
        }
        
        var queuedRequests=0;
        var activeRequests=0;
        var closeBoxAfterOperation;
        var ajaxQueue=[];

        var chkevent = window.attachEvent ? 'onbeforeunload' : 'beforeunload'; /// make IE7, IE8 compitable
        var onExitEvent = window.attachEvent || window.addEventListener;
        
        onExitEvent(chkevent, function(e) { // For >=IE7, Chrome, Firefox
            if (queuedRequests > 0) {
                var confirmationMessage = "Please note...Check in processing is not yet complete and check ins may be lost. Do you want to continue?";
                (e || window.event).returnValue = confirmationMessage;
                return confirmationMessage;
            }
        });
       
    	$(document).ready(function() {
            populateTransactions(location.search);
            barcodeFocus();
      	});
    </script>
<% }else{ %>
    <script type="text/javascript">
    function handlecheckinformonsubmit() {
    	return true;
    }
    </script>
<% } %>
<script language="javascript">
    <!--
    function CopyConditionChanged(copyID) {
        var field = document.<%=CheckinForm.FORM_NAME%>.<%=CheckinForm.FIELD_CHANGE_CONDITION_COPYID%>;
        field.value = copyID;
        <% if (ajaxMode) { %>
            handlecheckinformonsubmit();
            //$(field).remove();
        <% } else { %>
            document.<%=CheckinForm.FORM_NAME%>.submit();
        <% } %>
    }
    function submitEmailCheckin(holdID) {
        var field = document.<%=CheckinForm.FORM_NAME%>.<%=CheckinForm.PARAMETER_EMAIL_HOLD_ID%>;
        field.value = holdID; 
        <% if (ajaxMode) { %>
            handlecheckinformonsubmit();
            //$(field).remove();
        <% } else { %>
             document.<%=CheckinForm.FORM_NAME%>.submit();
        <% } %>
    }
    // -->
</script>


<!-- Begin form -->
<base:form action="/circulation/servlet/handlecheckinform.do" focus="<%=focus %>" onsubmit="return handlecheckinformonsubmit();" disableIntercepter="true">

<html:hidden property="collectionType"/>
<html:hidden property="<%=CheckinForm.FIELD_CHANGE_CONDITION_COPYID%>"/>
<html:hidden property="<%=CheckinForm.PARAMETER_EMAIL_HOLD_ID%>"/>

    <% if (! ajaxMode) { %>
            <jsp:include page="/circulation/checkindoprocessing.jsp" />
    <% } %>
    
    <div id="<%=CheckinForm.BLOCK_SOUNDS%>"></div>

    <c:choose>
        <c:when test="<%= form.getComponentList() != null && ! form.getComponentList().isEmpty() %>">
            <html:hidden property="barcode" value=""/>
            <html:hidden property="inLibraryUse"/>
        </c:when>
        <c:when test="<%= form.getContainerList() != null && ! form.getContainerList().isEmpty() %>">
            <html:hidden property="barcode" value=""/>
            <html:hidden property="inLibraryUse"/>
        </c:when>
        <c:otherwise>
            <table border="0" cellspacing="0" cellpadding="0" id="<%=CheckinForm.TABLE_HEADER%>">
                <tr>
                    <td class="FormLabel">
                        <%=form.getFindLabel()%>
                    </td>
                    <td>
                        &nbsp;
                        <html:text property="barcode" maxlength="1000"/>
                    </td>
                    <td>
                        &nbsp;
                        <base:goButton/>
                    </td>
                    <td class="ColRow">
            
                        &nbsp;&nbsp;
                        <% if ((form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) && (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET )) { %>
                            <html:checkbox property="inLibraryUse"><bean:write name="<%= CheckinForm.FORM_NAME %>" property="inLibraryUsePrompt"/></html:checkbox>
                        <% } %>
                    </td>
                </tr>
            </table>
            <% if (ajaxMode && form.isQueueMessagesOnScreen()) { %>
	            <div id="<%=CheckinForm.BLOCK_CLEARBUTTON%>">
                	<a href="#" class="checkinAjaxCloseButton" onClick="clearAll();">
            	        <base:image alt="ClearAll" src="/buttons/large/ClearAllCheckin.gif"/>
        	        </a>
    	        <br/>
	            </div>
            <% } %>
        </c:otherwise>
    </c:choose>
    
    <% if (ajaxMode) { %>
        <div id="<%=CheckinForm.BLOCK_MESSAGES%>"></div>
    <% } else { %>
        <jsp:include page="/circulation/checkinselectionlists.jsp" />
    <% } %>

    <% if (form.getCollectionType() == CollectionType.LIBRARY) { %>
    <span class="SmallColRow">
        <a href="/circulation/servlet/presentlibrarystatisticstodayscheckinsform.do?collectionType=<%=form.getCollectionType()%>"   
                target="<%=LibraryStatisticsForm.TARGET_NAME%>" id="<%=LibraryStatisticsForm.ID_TODAYS_STATS_IN %>" >
        View Today's Checkins
        </a>
    </span>
    <% } %>


    
    <div id="<%=CheckinForm.BLOCK_TRANSACTION_LIST%>">
        <% if (!ajaxMode) { %>
            <jsp:include page="/circulation/checkintransactions.jsp" />
        <% } %>
    </div>
    
</base:form>
