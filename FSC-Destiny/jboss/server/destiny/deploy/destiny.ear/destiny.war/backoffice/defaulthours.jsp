<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DefaultHoursForm" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<%@page import="com.follett.fsc.common.TimestampHelper"%><base:messageBox strutsErrors="true"/>

<%
    DefaultHoursForm form = (DefaultHoursForm)request.getAttribute("backoffice_servlet_DefaultHoursForm");
%>


<logic:equal name="backoffice_servlet_DefaultHoursForm" property="displayConfirmation" value="true" scope="request" >
<base:form action="/backoffice/servlet/handledefaulthoursform.do" >
<br>
<html:hidden property="openTime" />
<html:hidden property="closedTime" />
        <%                         
            String[] messageText = new String[]{
                MessageHelper.formatMessage("defaulthours_AreYouSure")
            };
        
            String headerText =
                MessageHelper.formatMessage("defaulthours_ThisWillChange", form.getTodaysDate());
        %>

        <base:confirmBox showWarningIcon="true"
            header="<%=headerText%>"           
            messageText="<%=messageText%>"
          />
      
<br>
</base:form>
</logic:equal>

<SPAN class="Instruction"><%= MessageHelper.formatMessage("defaulthours_EnterYourSite") %></SPAN><br>
<SPAN class="Instruction"><%= MessageHelper.formatMessage("defaulthours_HoursNote", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) %></SPAN>
<base:form action="/backoffice/servlet/handledefaulthoursform.do" >
<table border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("defaulthours_Open") %></td>
        <td class="ColRow"><html:text property="openTime" size="10" maxlength="10"/></td>
        <td class="ColRow">&nbsp;</td>
    </tr>
    <tr>
        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("defaulthours_Closed") %></td>
        <td class="ColRow"><html:text property="closedTime" size="10" maxlength="10"/></td>
        <td class="ColRow">&nbsp;</td>
    </tr>
    <tr>
        <td class="ColRow" colspan="3" align="center">
            <base:saveButton />
            &nbsp;
            <base:closeButton />
        </td>
    </tr>
</table>
</base:form>
<br>
