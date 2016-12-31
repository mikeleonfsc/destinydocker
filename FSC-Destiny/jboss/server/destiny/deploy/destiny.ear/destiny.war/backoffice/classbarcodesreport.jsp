<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ClassBarcodesReportForm" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronSelectForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<script language="JavaScript" type="text/javascript">
  <!--

    function changeSelectTeacherOption() {
        document.<%=ClassBarcodesReportForm.FORM_NAME %>.submit();
    }
  // -->
</script>
<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= ClassBarcodesReportForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.ClassBarcodesReportForm"/>

<base:form action="/backoffice/servlet/handleclassbarcodesreportform.do">
<base:outlinedTable id="<%=ClassBarcodesReportForm.TABLE_NAME%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
<bean:define id="selectedTeacherOptions" name="<%= ClassBarcodesReportForm.FORM_NAME %>" property="selectedTeacherOptions"/>
<bean:define id="sectionList" name="<%= ClassBarcodesReportForm.FORM_NAME %>" property="sectionList"/>
<html:hidden property="<%= ClassBarcodesReportForm.PARAM_TEACHER_PATRON_ID %>"/>
    <tr>
        <td colspan="2" class="TableHeading">List class barcodes...</td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="middle">Include</td>
        <td class="ColRow" valign="middle">
        <table id="<%=ClassBarcodesReportForm.TABLE_TEACHER%>" cellpadding="5" cellspacing="0">
            <tr>
            <td>
                <html:select onchange="changeSelectTeacherOption()" property="<%= ClassBarcodesReportForm.FIELD_OPTION_SELECTED_TEACHER %>">
                    <html:options collection="selectedTeacherOptions" property="longID" labelProperty="stringDesc"/>
                </html:select>
            </td>
            <logic:equal name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%= ClassBarcodesReportForm.FIELD_OPTION_SELECTED_TEACHER %>" value='<%= "" + ClassBarcodesReportForm.OPTION_SELECTED_TEACHER_SPECIFIC %>'>
                <td class="ColRow">
                    <bean:write name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%=ClassBarcodesReportForm.FIELD_SELECTED_TEACHER_NAME %>" filter="true"/>
                </td>
                <td>
                    <base:link 
                        page='<%="/backoffice/servlet/presentpatronselectform.do?"
                            + PatronSelectForm.PARAM_TO_RETURN + "=" + ClassBarcodesReportForm.PARAM_RESTORED_TEACHER_PATRON_ID
                            + "&" + PatronSelectForm.PARAM_SHOW_ONLY_MY_PATRONS + "=false"
                            + "&" + PatronSelectForm.FIELD_ONLY_MY_PATRONS + "=true"
                            + "&" + PatronSelectForm.PARAM_FIND_TEACHERS_WITH_CLASSES_ONLY + "=true"%>'>
                        <base:image src="/buttons/large/selectplus.gif" alt="<%=ClassBarcodesReportForm.ALT_SELECT_TEACHER %>" />
                    </base:link>
                </td>
            </logic:equal>
            <logic:equal name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%= ClassBarcodesReportForm.FIELD_OPTION_SELECTED_TEACHER %>" value='<%= "" + ClassBarcodesReportForm.OPTION_SELECTED_TEACHER_ALL %>'>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </logic:equal>
            </tr>
        </table>
        </td>
    </tr>   
    <tr>
        <td class="ColRowBold tdAlignRight">Sections</td>
        <td class="ColRow">
            <logic:equal name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%= ClassBarcodesReportForm.FIELD_OPTION_SELECTED_TEACHER %>" value='<%= "" + ClassBarcodesReportForm.OPTION_SELECTED_TEACHER_SPECIFIC %>'>
                <logic:equal name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%= ClassBarcodesReportForm.FIELD_SELECTED_TEACHER_NAME %>" value='<%= "" + ClassBarcodesReportForm.TEACHER_NAME_UNDEFINED %>'>
                    -- Click Select to choose a Teacher --
                </logic:equal>
                <logic:notEqual name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%= ClassBarcodesReportForm.FIELD_SELECTED_TEACHER_NAME %>" value='<%= "" + ClassBarcodesReportForm.TEACHER_NAME_UNDEFINED %>'>
                    <html:select property="<%= ClassBarcodesReportForm.FIELD_SECTION_SELECTED_ID %>">
                    <html:option value='<%="" + ClassBarcodesReportForm.OPTION_SECTION_SELECT_VALUE%>'><%=ClassBarcodesReportForm.OPTION_SECTION_SELECT%></html:option>
                    <html:options collection="sectionList" property="longID" labelProperty="stringDesc"/>
                    </html:select>&nbsp;
                </logic:notEqual>
            </logic:equal>
            <logic:equal name="<%=ClassBarcodesReportForm.FORM_NAME%>" property="<%= ClassBarcodesReportForm.FIELD_OPTION_SELECTED_TEACHER %>" value='<%= "" + ClassBarcodesReportForm.OPTION_SELECTED_TEACHER_ALL %>'>
                Starting on 
                <base:dateRange 
                    dateFrom="<%=form.getDateFrom()%>"
                    dateTo="<%=form.getDateTo()%>"
                    hideButtonsForMac = "true"/>
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">&nbsp;
        </td>
        <td class="ColRow" nowrap>
            <html:checkbox property="<%= ClassBarcodesReportForm.FIELD_INCLUDE_BARCODE %>" /> Include barcode number
        </td>
    </tr>   
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">&nbsp;
        </td>
        <td class="ColRow" nowrap>
            <html:checkbox property="<%= ClassBarcodesReportForm.FIELD_INCLUDE_CIRC_COMMANDS %>" /> Include Textbook Circulation command barcodes
        </td>
    </tr>   
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
