<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%=TagAEForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.TagAEForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletagaeform.do" focus="i1">


<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<html:hidden property="<%=TagAEForm.FIELD_TAG_DESCRIPTION%>"/>
<html:hidden property="subfieldEditCount"/>
<html:hidden property="tagNum"/>
<html:hidden property="tagID"/>

<base:outlinedTable borderColor='#c0c0c0' width="95%">
<%
        String  helpText = form.getHelpTextToInclude(request);
%>
    <tr> <td>
    <table id="<%=TagAEForm.TABLE_TAG_EDIT%>" width="" border="0">

    <tr>
        <td class="FormLabel" colspan="7">
                <bean:write name="<%=TagAEForm.FORM_NAME%>" property="<%=TagAEForm.FIELD_TAG_DESCRIPTION%>"/>
            <%
                if(!StringHelper.isEmpty(helpText)) {
            %>
                 <a href="#Helpview"><base:image src="/icons/general/taghelp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("tagedit_FormatGuidelines") %>'/></a>
            <%
                }
            %>
        </td>
    </tr>

    <tr>
        <td valign="bottom" class="SmallColHeading" colspan="3"><%= MessageHelper.formatMessage("tagedit_Indicators") %></td>

        <td valign="bottom" class="SmallColHeading" colspan="3"><%= MessageHelper.formatMessage("tagedit_Subfields") %></td>

        <td valign="bottom" class="FormLabel">
            <base:genericButton alt='<%= MessageHelper.formatMessage("addSubfield") %>' name="<%=TagAEForm.BUTTON_NAME_ADD_SUBFIELD%>" src="/buttons/large/addsubfield.gif"/>
        </td>
    </tr>

    <!-- this goes in a loop-->
    <%
        int pos;

        for(pos = 0; pos < form.getSubfieldEditCount();pos++) {
    %>
    <!-- This is comm to being the first and not the first subfield -->
        <tr>
            <td class="SmallColHeading tdAlignRight">
                <base:imageSpacer width="1" height="1"/>
            </td>
    <%
            if(pos == 0) {
    %>
    <!-- This is the first subfield so display the indicators -->
            <td class="FormElement tdAlignRight">
                <html:text property="<%=TagAEForm.FIELD_INDICATOR_1%>" size="1" maxlength="1"/>
            </td>

            <td class="FormElement tdAlignRight">
                <html:text property="<%=TagAEForm.FIELD_INDICATOR_2%>" size="1" maxlength="1"/>
            </td>
    <%
            } else {
    %>
    <!-- This is not the first subfield so do not display the indicators -->
            <td class="FormElement tdAlignRight" colspan="2">
            </td>
    <%
            }
    %>
    <!-- This is comm to being the first and not the first subfield -->
            <td class="ColRow tdAlignRight">
                <input type="text" name="sC<%=""+pos%>" size="1" maxlength="1"
                    value="<%=form.getSubfieldCode(pos)%>"/>
            </td>

            <td class="ColRow tdAlignRight">
                <input type="text" name="sD<%=""+pos%>" size="47"
                    value="<%= ResponseUtils.filter(form.getSubfieldData(pos))%>"/>
            </td>

<%
            if(form.getSubfieldEditCount() > 1) {
%>
                <td class="ColRow tdAlignRight">
                    <base:genericButton alt='<%=MessageHelper.formatMessage("tagedit_DeleteSubfield") %>' src="/icons/general/delete.gif" name="delete<%=pos%>"/>
                </td>
<%
            }
%>
            <td class="ColRow tdAlignRight">
            </td>
        </tr>
    <%
        }
    %>
    <!-- end if loop -->
        <tr>
            <td colspan="7" align="center" class="FormElement">
              <html:submit property="submit">
              <%
                if(form.getTagID() == null) {
              %><%= MessageHelper.formatMessage("tagedit_AddTag") %><%
                } else {
              %><%= MessageHelper.formatMessage("tagedit_UpdateTag") %><%
                }
              %>
              </html:submit>
              <html:cancel><%= MessageHelper.formatMessage("tagedit_Cancel") %></html:cancel>
            </td>
        </tr>
    </table>
    <%
        if(!StringHelper.isEmpty(helpText)) {
    %>
    <table border="0" width="100%" id="<%=TagAEForm.TABLE_TAG_HELP_TEXT%>">

        <tr>
            <td class="FormElement" colspan="4">
                <!-- include help text here -->
                <base:link linkName="Helpview"/>
                <%=helpText%>
            </td>
        </tr>

        <tr>
            <td class="FormElement" colspan="4">
                <base:imageLine width="100%" height="1"/>
            </td>
        </tr>
        <tr>
            <td align="center">
                <a href="#TheTop"><base:image src="/icons/general/top.gif" height="16" width="19" alt='<%= MessageHelper.formatMessage("tagedit_TopOfPage") %>'/></a>
            </td>
            <td align="center" class="SmallColHeading"><%= MessageHelper.formatMessage("tagedit_RRepeatable") %></td>
            <td align="center" class="SmallColHeading"><%= MessageHelper.formatMessage("tagedit_NRNotRepeatable") %></td>
            <td align="center" class="SmallColHeading"><%= MessageHelper.formatMessage("tagedit_LeftBlank") %></td>
        </tr>
    </table>
    <%
        }
    %>
</base:outlinedTable>

</base:form>
