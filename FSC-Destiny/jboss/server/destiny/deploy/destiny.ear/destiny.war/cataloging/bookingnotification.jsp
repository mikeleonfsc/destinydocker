<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BookingNotificationForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlebookingnotificationform.do" focus="<%= BookingNotificationForm.FIELD_NOTE %>">
<html:hidden property="<%=BookingNotificationForm.PARAM_PATRON_ID%>"/>
<html:hidden property="<%=BookingNotificationForm.PARAM_HOLD_ID%>"/>

<base:outlinedTable id="<%=BookingNotificationForm.TABLE_MAIN%>" borderColor="#C0C0C0">
	<tr>
		<td class="ColRowBold tdAlignRight">Comment</td>
  		<td>
            <span onKeyPress="return trapEnterKey(event);">
      			<html:text property="<%= BookingNotificationForm.FIELD_NOTE %>" maxlength="200" size="80"/>
            </span>
	    </td>
	</tr>
	
	<tr align="center">
		<td class="ColRowBold" colspan="2">
 			<base:showHideTag id="onSave">
				<base:saveButton onclick="hideElementonSave()"/>
        		&nbsp;
				<base:cancelButton/>
			</base:showHideTag>
		</td>
		
		
    </tr>
    
    
</base:outlinedTable>
</base:form>

<script language="JavaScript">
<!--
    function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=BookingNotificationForm.FORM_NAME%>.<%=BookingNotificationForm.FIELD_TRAP_ENTER%>.value = "true";
      }
    }
//-->
</script>
    
