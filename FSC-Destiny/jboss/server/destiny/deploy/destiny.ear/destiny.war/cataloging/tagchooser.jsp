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

<bean:define id="form" name="<%=TagChooserForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.TagChooserForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletagchooserform.do" focus="<%=TagChooserForm.FIELD_INPUT_TAG%>">

<html:hidden property="changesMade" />
<html:hidden property="<%=TagChooserForm.FIELD_AUTHORITY %>" />
<html:hidden property="<%=TagChooserForm.FIELD_AUTHORITY_ID %>" />

    <base:outlinedTable borderColor='#C0C0C0' id="<%=TagChooserForm.TABLE_TAG_CHOOSER%>">
        <tr>
            <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("tagchooser_Insert") %>&nbsp;</td>
            <td class="FormElement">
                <html:text property="<%=TagChooserForm.FIELD_INPUT_TAG%>" size="5" maxlength="3"/>
            </td>
            <td class="FormLabel">
                <base:okButton/>
            </td>
         </tr>
         <tr>
             <td>
                 &nbsp;
             </td>
             <td>
            <%
                TreeMap map = form.getAvailableTags();
                Iterator iter = map.entrySet().iterator();
                Map.Entry entry = (Map.Entry)iter.next();
            %>
            <html:select property="<%=TagChooserForm.FIELD_SELECTED_TAG%>" size="14" value="">
                 <html:option value="<%= entry.getKey().toString() %>"><%= entry.getValue() %></html:option>
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
            <td class="FormLabel" valign="top">
                <base:cancelButton/>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
