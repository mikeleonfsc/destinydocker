<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%
    DistrictLimitTaskForm form = (DistrictLimitTaskForm)request.getAttribute(DistrictLimitTaskForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<logic:equal name="<%=DistrictLimitTaskForm.FORM_NAME%>" property="<%=DistrictLimitTaskForm.PARAM_SAVED_SETTINGS%>" value="true">
    <base:messageBox message="Your settings have been saved."/>
</logic:equal>


<base:form action="/district/servlet/handledistrictlimittaskform.do">
  <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
  <jsp:include page="/common/msdewarning.jsp" flush="true" />
  <table align="center" width="95%"><tr><td>
  <base:outlinedTable id="<%=DistrictLimitTaskForm.TABLE_MAIN%>" align="center" width="100%">
    <tr>
        <td class="TableHeading2" colspan="2">
            Prevent the following tasks from running between...
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap>
        The hours of
        </td>
        <td class="ColRow">
          <html:text property="<%=DistrictLimitTaskForm.FIELD_START_TIME%>" size="10" maxlength="10"/>
          &nbsp;and&nbsp;
          <html:text property="<%=DistrictLimitTaskForm.FIELD_END_TIME%>" size="10" maxlength="10"/>
          &nbsp;Note: Please enter time in your region format. Example: <%=form.getTimeExamples() %>
        </td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight">
        On
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_SUNDAY %>"/>Sunday&nbsp;
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_MONDAY %>"/>Monday&nbsp;
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_TUESDAY %>"/>Tuesday&nbsp;
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_WEDNESDAY %>"/>Wednesday&nbsp;
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_THURSDAY %>"/>Thursday&nbsp;
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_FRIDAY %>"/>Friday&nbsp;
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_SATURDAY %>"/>Saturday&nbsp;
        </td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight" colspan="2">&nbsp;
        </td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight">
            Tasks
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_DELETE_SITE%>"/>
          Delete a Site
        </td>
    </tr>  
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_EXTRACT_SITE%>"/>
          Extract a Site
        </td>
    </tr>  

    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_CHANGE_SITES_SITE_TYPE%>"/>
          Change a Site's Site Type
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_ACCESS_LEVELS_CONTROL%>"/>
          Change district control of Access Levels
        </td>
    </tr>  
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_COLLECTION_STATS%>"/>
          Obtain a Collection Statistics - Summary
          <base:helpTag helpFileName="t_limit_tasks_district.htm"/>
          <BR>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>Note</B>: Users will still be able to run the "Collection Statistics - Historical" report
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_PATRON_STATS%>"/>
          Obtain a Patron Statistics - Summary<BR>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>Note</B>: Users will still be able to run the "Patron Statistics - Historical" PDF report
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_MODIFY_HIDDEN%>"/>
          Modify the "Hidden" flag on Circulation Type
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_DELETE_CIRC_TYPE%>"/>
          Delete a Circulation Type
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
          <html:checkbox property="<%= DistrictLimitTaskForm.FIELD_RUN_REPORT_BUILDER%>"/>
          Run Report Builder reports<BR>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>Note</B>: Users will still be able to create and modify custom built reports.
        </td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight" colspan="2">&nbsp;
        </td>
    </tr>

    <tr>
        <td align="center" class="ColRowBold" colspan="2">
          It is recommended that the tasks listed above be prevented from running during normal circulation timeframes.
        </td>
    </tr>

    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()"/>
            </base:showHideTag>
        </td>
    </tr>
</base:outlinedTable>
</td></tr></table>

</base:form>

