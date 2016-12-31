<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    SectionTeacherForm form = (SectionTeacherForm)request.getAttribute(SectionTeacherForm.FORM_NAME);
%>

<br>

<base:form action="/backoffice/servlet/handlesectionteacherform.do" focus="<%=SectionBaseForm.FIELD_SEARCH_STRING%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=SectionBaseForm.BUTTON_TRAP_ENTER%>">
<html:hidden property="<%=SectionBaseForm.PARM_SECTION_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_STRING%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_TYPE%>"/>
<html:hidden property="<%=SectionBaseForm.FIELD_ONLY_MY_SITE%>"/>


    <% if ( form.isPromptForReplace() ) {%>
    
        <base:messageBox showRedBorder="true">
        <html:hidden property="<%= SectionBaseForm.PARM_ASSIGN_TO_CLASSID %>"/>
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center">
               <%=form.outputAssignPrompt()%>
            </td>
        </tr>
        <tr valign="center">
            <td colspan="2" class="ColRowBold" align="center">
               Do you wish to continue?
            </td>
        </tr>
    
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRowBold">
                <base:showHideTag id="onConfirm">
                    <html:submit property="<%= SectionBaseForm.BUTTON_CONFIRM_ASSIGN %>" onclick="hideElementonConfirm()">
                      Yes
                    </html:submit>
                    <html:submit property="<%= SectionBaseForm.BUTTON_NO %>" onclick="hideElementonConfirm()">
                      No
                    </html:submit>
                </base:showHideTag>
            </td>
        </tr>
        </base:messageBox>
    
    <%} %>
    

    <base:outlinedTable id="<%=SectionInfoForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">


        <tr><td class="ColRowBold" colspan="2" width="100%">
        <bean:write 
            name="<%= SectionTeacherForm.FORM_NAME %>" 
            property="header"/>
        </td></tr>
        
	    <tr>
	        <td class="ColRowBold" colspan="2" width="100%"><base:imageLine height="1" width="100%"/></td>
	    </tr>
        
	    <tr>
	    <td valign="top" class="ColRowBold">Find Teacher
        <html:text property="<%= SectionTeacherForm.FIELD_SEARCH_STRING %>"  size="24"/>
        in 
        <base:selectPatronByType name="<%=SectionTeacherForm.FIELD_SEARCH_TYPE%>" selected='<%="" + form.getSearchType()%>' returnAllEvenIfWeFindAMatchByBarcode="true"/>
        <base:goButton absbottom="true"/>
	    </td>
	    <td valign="top" class="tdAlignRight">
            <base:okButton name="<%=SectionBaseForm.BUTTON_CLOSE%>"/>
	    </td>
	    </tr>

        <tr><td width="100%" colspan="2">
        <%=form.outputCurrentSearchList()%>
        </td></tr>


        <tr><td colspan="2" width="100%">
        <%=form.outputCurrentlyAssigned(true)%>
        </td></tr>
    </base:outlinedTable>
</base:form>


