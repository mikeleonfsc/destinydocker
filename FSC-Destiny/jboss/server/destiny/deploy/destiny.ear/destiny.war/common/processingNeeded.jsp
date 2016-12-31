<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*, java.util.TreeMap" %>
<%@ page import="com.follett.fsc.destiny.util.language.*" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BasicSearchForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    try {
        SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
        int messageCount = store.getMessageCount();
        
        if (messageCount>0) {
        %>
            <span class="<%=BasicSearchForm.CLASS_PROCESSING_REQUIRED %>">
                <base:link title='<%=MessageHelper.formatMessage("processingNeeded")%>' page="/common/servlet/presentneedsprocessingform.do" id="<%=BasicSearchForm.ID_PROCESSING_REQUIRED %>"> 
                    <base:image src="/buttons/small/flag-red.png" hspace="1" vspace="2" align="absbottom"/>
                    <span class="<%=BasicSearchForm.CLASS_PROCESSING_REQUIRED_COUNTER%>">&nbsp;!&nbsp;</span>
                </base:link>
            </span>
        <%
        }
    } catch(Exception ex) {
        Logger logCat = Logger.getLogger( this.getClass() );
        logCat.warn("Unable to check messages from store.  ", ex);
    }

    
%>
