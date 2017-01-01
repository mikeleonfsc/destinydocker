<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="form" name="<%=EditLeaderForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.EditLeaderForm"/>
<BR>
<base:form action="/cataloging/servlet/handleeditleaderform.do">
    <html:hidden property="<%=EditLeaderForm.FIELD_AUTHORITY%>"/>
    <html:hidden property="<%=EditLeaderForm.PARM_AUTHORITY_ID%>"/>
    <base:outlinedTable borderColor="#C0C0C0" id="<%=EditLeaderForm.TABLE_MAIN%>">
        <tr>
            <td align="center" colspan="2" class="TableHeading">
            <bean:write name="<%=EditLeaderForm.FORM_NAME%>" property="<%=EditLeaderForm.FIELD_TITLE_STRING%>"/>
            </td>
        </tr>
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_RecordStatus") %></td>
            <td class="FormElement">
            <%
                TreeMap map = form.getRecordStatusMap();
                Iterator iter = map.entrySet().iterator();
                Map.Entry entry = null;
            %>
            <html:select property="<%=EditLeaderForm.FIELD_RECORD_STATUS%>">
            <%
                while (iter.hasNext()) {
                    entry = (Map.Entry)iter.next();
            %>
                   <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
            <%
                };
            %>
            </html:select>
            </td>
        </tr>
        <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="<%=EditLeaderForm.FIELD_AUTHORITY %>" value="true">
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_TypeOfRecord") %></td>
            <td class="FormElement">
            <%=MessageHelper.formatMessage("editleader_ZAuthorityRecord")%>
            </td>
        </tr>
        </logic:equal>
        <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="<%=EditLeaderForm.FIELD_AUTHORITY %>" value="false">
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_TypeOfRecord") %></td>
            <td class="FormElement">
            <%
                map = form.getRecordTypeMap();
                iter = map.entrySet().iterator();
                entry = null;
            %>
            <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="fromTemplate" value="true">
                <bean:write name="<%= EditLeaderForm.FORM_NAME%>" property="recordTypeDescription"/>
            </logic:equal>
            <logic:notEqual name="<%=EditLeaderForm.FORM_NAME%>" property="fromTemplate" value="true">
	            <html:select property="<%=EditLeaderForm.FIELD_RECORD_TYPE%>">
	            <%
	                while (iter.hasNext()) {
	                    entry = (Map.Entry)iter.next();
	            %>
	                   <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
	            <%
	                };
	            %>
	            </html:select>
            </logic:notEqual>
            
            </td>
        </tr>
        </logic:equal>
        <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="<%=EditLeaderForm.FIELD_AUTHORITY %>" value="false">
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_BibliographicLevel") %></td>
            <td class="FormElement">
            <%
                map = form.getBibLevelMap();
                iter = map.entrySet().iterator();
                entry = null;
            %>
            
            
            <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="fromTemplate" value="true">
                <bean:write name="<%= EditLeaderForm.FORM_NAME%>" property="bibLevelDescription"/>
            </logic:equal>
            <logic:notEqual name="<%=EditLeaderForm.FORM_NAME%>" property="fromTemplate" value="true">
	            <html:select property="<%=EditLeaderForm.FIELD_BIB_LEVEL%>">
	            <%
	                while (iter.hasNext()) {
	                    entry = (Map.Entry)iter.next();
	            %>
	                   <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
	            <%
	                };
	            %>
	            </html:select>
            </logic:notEqual>
            
            </td>
        </tr>
        </logic:equal>
        <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="<%=EditLeaderForm.FIELD_AUTHORITY %>" value="false">
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_TypeOfControl") %></td>
            <td class="FormElement">
            <%
                map = form.getControlTypeMap();
                iter = map.entrySet().iterator();
                entry = null;
            %>
            <html:select property="<%=EditLeaderForm.FIELD_CONTROL_TYPE%>">
            <%
                while (iter.hasNext()) {
                    entry = (Map.Entry)iter.next();
            %>
                   <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
            <%
                };
            %>
            </html:select>
            </td>
        </tr>
        </logic:equal>
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_EncodingLevel") %></td>
            <td class="FormElement">
            <%
                map = form.getEncodingLevelMap();
                iter = map.entrySet().iterator();
                entry = null;
            %>
            <html:select property="<%=EditLeaderForm.FIELD_ENCODING_LEVEL%>">
            <%
                while (iter.hasNext()) {
                    entry = (Map.Entry)iter.next();
            %>
                   <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
            <%
                };
            %>
            </html:select>
            </td>
        </tr>
        <logic:equal name="<%=EditLeaderForm.FORM_NAME%>" property="<%=EditLeaderForm.FIELD_AUTHORITY %>" value="false">
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editleader_CatalogingForm") %></td>
            <td class="FormElement">
            <%
                map = form.getCatalogingFormMap();
                iter = map.entrySet().iterator();
                entry = null;
            %>
            <html:select property="<%=EditLeaderForm.FIELD_CATALOGING_FORM%>">
            <%
                while (iter.hasNext()) {
                    entry = (Map.Entry)iter.next();
            %>
                   <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
            <%
                };
            %>
            </html:select>
            </td>
        </tr>
        </logic:equal>
        <tr>
            <td colspan="2" align="center" class="ColRowBold">
                <base:showHideTag id="onOK">
                    <base:okButton onclick="hideElementonOK()"/>
                    &nbsp;
                    <base:cancelButton/>
                </base:showHideTag>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
