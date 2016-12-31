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


<bean:define id="form" name="<%=EditFixedTagForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.EditFixedTagForm"/>
<BR>
<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleeditfixedtagform.do">

<script language="JavaScript" type="text/javascript">
  <!--
    function updateMaterial()
    {
        document.forms["<%=EditFixedTagForm.FORM_NAME%>"].elements["updateMaterialType"].value = "Update";
        // TitleEditForm.BUTTON_VALUE_UPDATE

        //Submit the form
        document.forms["<%=EditFixedTagForm.FORM_NAME%>"].submit();
    }
  //-->
</script>


    <html:hidden property="<%=EditFixedTagForm.PARAM_TAG_ID%>" />
    <html:hidden property="titleString" />
    <html:hidden property="<%=EditFixedTagForm.PARAM_TAG_NUMBER%>" />
    <html:hidden property="updateMaterialType"/>
    <html:hidden property="materialTypeSubmit"/>
    <html:hidden property="fromShelfBib"/>
    <html:hidden property="realTagNumber"/>
    <base:outlinedTable borderColor="#C0C0C0" id="<%=EditFixedTagForm.TABLE_MAIN%>">
        <tr>
            <td align="center" colspan="2" class="TableHeading">
            <bean:write name="<%=EditFixedTagForm.FORM_NAME%>" property="<%=EditFixedTagForm.FIELD_TITLE_STRING%>"/>
            </td>
        </tr>

        <%  String submitOption = "";
            if (form.isMaterialTypeSubmit()) {
                submitOption = "onchange=\"javascript:updateMaterial()\"";
            }
        %>

        <logic:iterate id="fieldVO" name="<%=EditFixedTagForm.FORM_NAME%>" property="tagFields" type="com.follett.fsc.destiny.util.marc.FixedMarcField" indexId="counter">
        <% if (fieldVO.getType() != FixedMarcField.TYPE_UNDEFINED && fieldVO.getType() != FixedMarcField.TYPE_CONSTANT) { %>
            <tr>
                <td valign="top" class="FormLabel tdAlignRight">
                    <%=fieldVO.getDescription()%>
                </td>
                <td class="FormElement">
                <% if (fieldVO.getType() == FixedMarcField.TYPE_DROP_DOWN) { %>
                    <select name='<%=EditFixedTagForm.FIELD_NAME + "_" + counter%>' <%=submitOption%>>
                        <%
                        submitOption = "";
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
                            boolean showOption = true;
                            
                          if (form.isFromShelfBib() && !StringHelper.contains("oqs", code) && (form.getRealTagNumber() == 8)  && (fieldVO.getStartPos() == 23)) {
                              showOption = false;
                          }

                             %>
                             
                             <% if (showOption) { %>
                                     <option value="<%= code %>" <%=selected%>><%= prefix + desc %></option>
                              <%} 
                         }  %>
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

                                    <td class="FormElement tdAlignRight"><input type="checkbox" name='<%= EditFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%= code %>" checked></td>
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
                                    <td class="FormElement tdAlignRight"><input type="checkbox" name='<%= EditFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%= code %>"></td>
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
                                <input type="text" name='<%= EditFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%= fieldVO.getValue().trim() %>" maxLength="<%=fieldVO.getLength()%>" size="<%=fieldVO.getLength() + 3%>" ></td>
                            </tr>
                        </table>
                <% } else { %><%= MessageHelper.formatMessage("editfixedtag_NotImplementedYet", Long.valueOf(Integer.valueOf(fieldVO.getType()).longValue()))%>
                <% } %>
                </td>
            </tr>
        <% }  else  { /* handle the data for the undefined fields */ %>
            <input type="hidden" name='<%=EditFixedTagForm.FIELD_NAME + "_" + counter%>' value="<%=fieldVO.getValue()%>"/>
        <% } %>
        </logic:iterate>
        <tr>
            <td colspan="2" align="center" class="FormLabel">
                <base:okButton/>
                &nbsp;
                <base:cancelButton/>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
