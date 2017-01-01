<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%><bean:define id="stateOIDs" name="<%=StateStandardsBrowseForm.FORM_NAME%>" property="stateOIDList"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlestatestandardsbrowseform.do">
<input type="hidden" name="<%=StateStandardsBrowseForm.BUTTON_CHANGE_SUBMIT%>" value="false"/>

<%
    StateStandardsBrowseForm form = (StateStandardsBrowseForm)request.getAttribute( StateStandardsBrowseForm.FORM_NAME );
%>

<table id="<%=StateStandardsBrowseForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="2" class="TableHeading">Search or Browse the Standards...</td>
    </tr>
    <tr>
        <td colspan="2">
            <table border="0" cellpadding="2" cellspacing="0">
                <tr>
                    <td valign="top" class="ColRowBold" nowrap>
                        For
                        <html:select property="<%=StateStandardsBrowseForm.FIELD_STATE_OID%>" onchange="this.form.submit()">
                            <html:options collection="stateOIDs" property="OID" labelProperty="name"/>
                        </html:select>
                    </td>
                    <td valign="top">
						<table  border="0" cellpadding="2" cellspacing="0">
							<base:searchLookin 
								parentForm="<%=form%>"  
								renderForAdvancedSearch="true"
								javascriptSubmitFunctionName="submitDropDown()"
								/>
								
						</table>
					</td>
                </tr>
            </table>
             <br>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=StateStandardsSearchForm.ID_TAB_BROWSE %>" 
             width="100%" borderColor="#C0C0C0" searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_STANDARDS) %>">
                <tr><td>
    <% if ( form.isDisplayTree()) { %>
                <table id="<%=StateStandardsBrowseForm.TABLE_BROWSE_TREE%>" width="100%" cellpadding="3" cellspacing="0">
                    <tr>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td><base:imageSpacer width="22" height="1"/></td>
                        <td width="90%"><base:imageSpacer width="100" height="1"/></td>
                    </tr>
                    <tr>
                        <td colspan="9" class="ColRowBold">
                            Browse Subject
                        </td>
                    </tr>
                    <logic:iterate id="node" name="<%= StateStandardsBrowseForm.FORM_NAME %>" property="<%= StateStandardsBrowseForm.FIELD_BROWSE_LIST %>" type="com.follett.fsc.destiny.client.cataloging.data.SSBrowseClientVO">
                    <tr>
                        <%= node.toString() %>
                    </tr>
                    </logic:iterate>
                </table>
    <% } %>
                </td></tr>
            </base:outlinedTableAndTabsWithinThere>

        </td>
    </tr>
</table>
</base:form>

<script language="javascript">
<!--
function submitDropDown() {
        document.<%=StateStandardsBrowseForm.FORM_NAME%>.<%=StateStandardsBrowseForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
        document.<%=StateStandardsBrowseForm.FORM_NAME%>.submit();
}
// -->
</script>


