<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    ForecastLimitersForm form = (ForecastLimitersForm)request.getAttribute(ForecastLimitersForm.FORM_NAME);
%>
<base:messageBox strutsErrors="true"/>

<%    
    SessionStoreProxy store  = SessionStoreProxy.getSessionStore(session, request); 
%>

<base:form action="/backoffice/servlet/handleforecastlimitersform.do">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

    <base:outlinedTable borderColor="#c0c0c0" id="<%=ForecastLimitersForm.TABLE_OUTER%>" width="95%">
            
        <tr>
            <td class="TableHeading" colspan="4">
               <%= form.getHeading() %>
            </td>
        </tr>
        <tr>
            <td colSpan="4" valign="top">
                <base:imageLine height="1" width="100%"/>
            </td>
        </tr>

        <tr>
            <td class="ColRowBold" colSpan="4" valign="top">
                Include the following...
            </td>
        </tr>
        <tr>
            <td><base:imageSpacer width="7" height="1"/></td>
            <td class="ColRowBold" vAlign="top">Site Types</td>
            <td class="ColRowBold" vAlign="top">
                <base:displayMultiColumnCheckboxes map="<%=form.getSiteTypeCheckboxList() %>" selectAll="<%=null %>" tableName="<%=ForecastLimitersForm.TABLE_SITE_TYPES_CHECKBOXES %>" fieldProperty="<%=ForecastLimitersForm.PARAM_SITE_TYPE_CHECKBOX_PREFIX %>"   ></base:displayMultiColumnCheckboxes>
            </td> 
            <td class="ColRowBold tdAlignRight" vAlign="bottom">
                <base:genericButton src="/buttons/small/selectall.gif" alt="Select All" name="<%= ForecastLimitersForm.BUTTON_SELECT_ALL_SITE_TYPES %>" /><br>
                <base:genericButton src="/buttons/small/clearall.gif" alt="Clear All" name="<%= ForecastLimitersForm.BUTTON_CLEAR_ALL_SITE_TYPES %>" />
            </td>
        </tr>   

        <tr>
            <td><base:imageSpacer width="7" height="1"/></td>
            <td colSpan="3" valign="top">
                <base:imageLine height="1" width="100%"/>
            </td>
        </tr>

        <tr>
            <td><base:imageSpacer width="7" height="1"/></td>
            <td class="ColRowBold" vAlign="top">Departments</td>
            <td class="ColRowBold" vAlign="top">
                <base:displayMultiColumnCheckboxes map="<%=form.getDepartmentCheckboxList() %>" selectAll="<%=null %>" tableName="<%=ForecastLimitersForm.TABLE_DEPARTMENT_CHECKBOXES %>" fieldProperty="<%=ForecastLimitersForm.PARAM_DEPARTMENT_CHECKBOX_PREFIX %>"   ></base:displayMultiColumnCheckboxes>
            </td> 
            <td class="ColRowBold tdAlignRight" vAlign="bottom">
                <base:genericButton src="/buttons/small/selectall.gif" alt="Select All" name="<%= ForecastLimitersForm.BUTTON_SELECT_ALL_DEPARTMENTS %>" /><br>
                <base:genericButton src="/buttons/small/clearall.gif" alt="Clear All" name="<%= ForecastLimitersForm.BUTTON_CLEAR_ALL_DEPARTMENTS %>" />
            </td>
        </tr>

        <tr>
            <td colSpan="4" valign="top">
                <base:imageLine height="1" width="100%"/>
            </td>
        </tr>

        <tr>
            <td align="center" class="ColRow" colspan="4">
                <base:showHideTag>
                    <base:okButton onclick="hideElement()"/>
                </base:showHideTag>
            </td>
        </tr>
        
    </base:outlinedTable>
</base:form>

