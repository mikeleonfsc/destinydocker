<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.ejb.SessionStoreSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.ImportantInformationAndNewsTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.session.district.remote.NoticesHelper"%>
<%@ page language="java"%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>


<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    //can be turned off globally or permissions
    if(ImportantInformationAndNewsTag.showNews(store)){ %> 
    <%
    String newsURL = NoticesHelper.getFollettNewsURL(); //https:destinynews.fsc.follett.com
    %>
    
<link href="<%=newsURL%>/inc/jquery.fancybox.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=newsURL%>/inc/jquery.js"></script>
<script type="text/javascript" src="<%=newsURL%>/inc/jquery.fancybox.js"></script>
<script type="text/javascript">
       $(document).ready(function(){
    	   if(typeof $('.fancybox').fancybox == 'function') {
              $('.fancybox').fancybox({
        	   autoDimensions: false,
        	   height: 600,
        	   width: 800,
                        afterClose : function() {
                        	$("#follettNewsBigBox").remove();
                            return;
                        }
                });
    	   }
       })
 </script>
<%

     //check permission
        String megaphoneIcon = "/icons/general/megaphone.png";
        LocaleHelper lh = UserContext.getMyContextLocaleHelper();
        String megaphonePath =  lh.getLocalizedImagePath(megaphoneIcon);
        if(ImportantInformationAndNewsTag.showNewNewsIcon(store)) {
    %>
           <%-- large box, message has NOT been read --%>
            <a href="/common/servlet/presentnewsredirectform.do"
                class="new-messages fancybox" data-fancybox-type="iframe" target="_blank"
                title="Follett News" id="follettNewsBigBox"> <span class="message-icon"><base:image
                        src="<%=megaphoneIcon%>" hspace="1" vspace="2" /></span> <span
                class="new-message-title">New Message(s)</span> <span class="read-messages">Read</span>
            </a>
    
    <% }  else { %>
           <%-- small megaphone, message has been read --%>
            <span class="BreadcrumbBold"
                style="float: right; margin-right: 230px; line-height: 23px; font-size: 0.8em">
                <a href="/common/servlet/presentnewsredirectform.do"
                data-fancybox-type="iframe" class="fancybox processingNeeded"
                target="_blank" style="margin-bottom: 15px" id="follettNewsSmallLink"> <base:image
                        src="<%=megaphoneIcon%>" hspace="1" vspace="2" align="absbottom" /><span style="color:#FFFFFF;">Messages</span>
            </a>
            </span>
    <%}
}%>
