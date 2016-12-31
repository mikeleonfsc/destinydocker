<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    AssignTextbookToClassForm form = (AssignTextbookToClassForm)request.getAttribute(AssignTextbookToClassForm.FORM_NAME);
%>

<br>

<base:form action="/cataloging/servlet/handleassigntextbooktoclassform.do" focus="<%=SectionBaseForm.FIELD_SEARCH_STRING%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=SectionBaseForm.BUTTON_TRAP_ENTER%>">
    <html:hidden property="<%=AssignTextbookToClassForm.PARM_BIB_ID%>"/>
    <html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_STRING%>"/>
	<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_TYPE%>"/>

    <base:outlinedTable id="<%=AssignTextbookToClassForm.TABLE_MAIN%>" borderColor="#C0C0C0">
        
        <tr>
            <td class="ColRowBold" width="100%">
                <bean:write 
                    name="<%= AssignTextbookToClassForm.FORM_NAME %>" 
                    property="header"/>
            </td>
    	    <td valign="top" class="tdAlignRight">
                <base:closeButton withX="true" name="<%=SectionBaseForm.BUTTON_CLOSE%>"/>
    	    </td>
        </tr>
	    <tr>
	        <td class="ColRowBold" colspan="2" width="100%"><base:imageLine height="1" width="100%" /></td>
	    </tr>

	    <tr>
	    <td valign="top" class="ColRowBold" colspan="2">
            Find Class Section
            <html:text property="<%= SectionBaseForm.FIELD_SEARCH_STRING %>"  size="24" maxlength="1000"/>
            by 
            <%=form.outputDropDown()%>
            <base:goButton absbottom="true"/>
	    </td>
	    </tr>

        <tr><td width="100%" colspan="2">
        <%=form.outputCurrentSearchList()%>
        </td></tr>


        <tr><td colspan="2" width="100%">
        <%=form.outputCurrentlyAssigned(false)%>
        </td></tr>
        
    </base:outlinedTable>
</base:form>


