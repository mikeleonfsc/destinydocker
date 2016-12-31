<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.DefinePreorderPeriodForm"%>
<%
    DefinePreorderPeriodForm form = (DefinePreorderPeriodForm)request.getAttribute(DefinePreorderPeriodForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%><base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handledefinepreorderperiodform.do" method="post">
<html:hidden property="<%= DefinePreorderPeriodForm.PARAM_PREORDERCONFIG_ID%>"/>
<% if (form.isSaveConfirmation()) { %>
        <base:messageBox>
            <tr>
                <td class="ColRowBold" align="center" colspan="2">
                    Are you sure you want the Pre-order period to run from <%=form.getStartDate()%> to <%=form.getEndDate()%>?
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
<% } %>
    <base:outlinedTable id="<%=DefinePreorderPeriodForm.TABLE_MAIN%>"  borderColor="#C0C0C0" width="100%">
        <tr>
            <td class="TableHeading">
                Define your Pre-order period for
                    <%=form.getAdoptionYear() %>
                adoption year
            </td>
            <td class="tdAlignRight">
                <base:saveButton/>
            </td>
        </tr>
        <tr>
            <td>
                <table id="<%=DefinePreorderPeriodForm.TABLE_DATES%>">
                    <tr>
                    <td class = "ColRowBold tdAlignRight" nowrap="nowrap">*Starts</td>
                    <td class = "ColRow">
                    <% if(form.isShowStartDate()) { %>
                        <base:date
                            buttonName = "<%=DefinePreorderPeriodForm.BUTTON_START_DATE%>"
                            fieldName = "<%=DefinePreorderPeriodForm.FIELD_START_DATE%>"
                            dateValue = "<%=form.getStartDate()%>"
                            altText = "Change Start date"/>
                    <% } else { %>
                        <html:hidden property="<%=DefinePreorderPeriodForm.FIELD_START_DATE%>" />
                        <bean:write name="<%=DefinePreorderPeriodForm.FORM_NAME %>" property="<%=DefinePreorderPeriodForm.FIELD_START_DATE%>"/>
                    <% } %>
                    </td>
                </tr>
                <tr>
                    <td class = "ColRowBold tdAlignRight" nowrap="nowrap">Ends</td>
                    <td class = "ColRow">
                    <% if(form.isShowEndDate()) { %>
                        <base:date
                            buttonName = "<%=DefinePreorderPeriodForm.BUTTON_END_DATE%>"
                            fieldName = "<%=DefinePreorderPeriodForm.FIELD_END_DATE%>"
                            dateValue = "<%=form.getEndDate()%>"
                            altText = "Change End date"/>
                            
                    <% } else { %>
                        <html:hidden property="<%=DefinePreorderPeriodForm.FIELD_END_DATE%>" />
                        <bean:write name="<%=DefinePreorderPeriodForm.FORM_NAME %>" property="<%=DefinePreorderPeriodForm.FIELD_END_DATE%>"/>
                    <% } %>
                            
                    </td>
                </tr>
                <tr>
                    <td class = "Instruction" nowrap="nowrap" colspan="2">
                        * Sites will be able to create their Pre-orders starting on this date.
                    </td>
                </tr>
             </table>
           </td>
           <td class="tdAlignRight" valign="top">
                <base:cancelButton/>
           </td>
       </tr>
    </base:outlinedTable>
</base:form>
