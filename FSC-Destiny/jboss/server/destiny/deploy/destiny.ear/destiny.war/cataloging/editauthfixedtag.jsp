<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%@ page import="com.follett.fsc.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="form" name="<%=EditAuthFixedTagForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.EditAuthFixedTagForm"/>
<BR>
<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleeditauthfixedtagform.do">

    <base:outlinedTable borderColor="#C0C0C0" id="<%=EditAuthFixedTagForm.TABLE_MAIN%>">
        <tr>
            <td colspan="2">
               <table width="100%">
                  <tr>
                    <td class="TableHeading"><%= MessageHelper.formatMessage("editauthfixedtag_EditingTag008")%></td>
                    <td class="tdAlignRight">
                        <base:showHideTag id="onSaveHeader">
                            <base:genericButton alt='<%= MessageHelper.formatMessage("save") %>' src="/buttons/large/save.gif" onclick="hideElementonSaveHeader()" name="<%=EditAuthFixedTagForm.BUTTON_NAME_SAVE %>" />
                            &nbsp;
                            <base:cancelButton name="<%=EditAuthFixedTagForm.BUTTON_NAME_CANCEL %>" />
                        </base:showHideTag>
                    </td>
                    </tr>
               </table>
               
            </td>
        </tr>


        <logic:iterate id="fieldVO" name="<%=EditAuthFixedTagForm.FORM_NAME%>" property="tagFields" type="com.follett.fsc.destiny.util.marc.FixedMarcField" indexId="counter">
        <% if (fieldVO.getType() != FixedMarcField.TYPE_UNDEFINED && fieldVO.getType() != FixedMarcField.TYPE_CONSTANT) { %>
            <tr>
                <td valign="top" class="FormLabel tdAlignRight">
                    <%=fieldVO.getDescription()%>
                </td>
                <td class="FormElement">
                <% if (fieldVO.getType() == FixedMarcField.TYPE_DROP_DOWN) { %>
                    <select name='<%=EditAuthFixedTagForm.FIELD_NAME + "_" + counter%>'>
                        <%
                        String[][] options = fieldVO.getOptions();
                        for (int i = 0; i < options.length; i++) {
                            String desc = options[i][0];
                            String code = options[i][1];
                            String prefix;
                            String selected = "";

                            if (code.equals(fieldVO.getValue())) {
                                selected="selected";
                            }
                            if ( StringHelper.isEmpty(code.trim()) ) {
                                prefix = MessageHelper.formatMessage("editfixedtag_Blank") + " = ";
                            } else {
                                prefix = code + " = ";
                            }
                        %>
                            <option value="<%= code %>" <%=selected%>><%= prefix + desc %></option>
                        <%}  %>
                    </select>
                <% } else if (fieldVO.getType() == FixedMarcField.TYPE_CHECKBOXES) { %>
                        <table border="0" cellspacing="0" cellpadding="3">
                        <%
                        String[][] options = fieldVO.getOptions();
                        boolean tr = false;
                        for (int i = 0; i < options.length; i++) {
                            String desc = options[i][0];
                            String code = options[i][1];
                            if (StringHelper.contains(fieldVO.getValue(), code, false)) {
                        %>
                                <% if ( (i & 1) == 0) {
                                    out.println("<tr>");
                                    tr = true;
                                    }
                                %>

                                    <td class="FormElement tdAlignRight"><input type="checkbox" name='<%= EditAuthFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%= code %>" checked></td>
                                    <td class="FormElement"><%= desc %></td>
                                <% if ( (i & 1) == 1) {
                                    out.println("</tr>");
                                    tr = false;
                                    }
                                %>
                        <%  } else {  %>
                                <% if ( (i & 1) == 0) {
                                    out.println("<tr>");
                                    tr = true;
                                    }
                                %>
                                    <td class="FormElement tdAlignRight"><input type="checkbox" name='<%= EditAuthFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%= code %>"></td>
                                    <td class="FormElement"><%= desc %></td>
                                <% if ( (i & 1) == 1) {
                                    out.println("</tr>");
                                    tr = false;
                                    }
                                %>
                        <%  }
                        }
                        if ( tr) {
                            out.println("</tr>");
                        }

                        %>
                        </table>
                <% } else if (fieldVO.getType() == FixedMarcField.TYPE_TEXT) { %>
                        <table border="0" cellspacing="0" cellpadding="1">
                            <tr>
                                <td class="FormElement tdAlignRight" colspan="2">
                                <input type="text" name='<%= EditAuthFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%= fieldVO.getValue().trim() %>" maxLength="<%=fieldVO.getLength()%>" size="<%=fieldVO.getLength() + 3%>" ></td>
                            </tr>
                        </table>
                <% } else { %><%= MessageHelper.formatMessage("editfixedtag_NotImplementedYet", Long.valueOf(Integer.valueOf(fieldVO.getType()).longValue()))%>
                <% } %>
                </td>
            </tr>
        <% }  else  { /* handle the data for the undefined fields */ %>
            <input type="hidden" name='<%=EditAuthFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%=fieldVO.getValue()%>"/>
        <% } %>
        </logic:iterate>

    </base:outlinedTable>
</base:form>
