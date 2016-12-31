<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    String pageLevelHelpFile = (String)request.getAttribute(GenericForm.PAGE_HELP_FILE_NAME);
    String pageLevelHelpText = GenericForm.getPAGE_HELP_TOPIC();

    if (!StringHelper.isEmpty(pageLevelHelpFile)) {

%>

        <base:helpTag helpFileName="<%= pageLevelHelpFile %>" pageLevelHelpText="<%= pageLevelHelpText %>"/>

<%
    }
%>
