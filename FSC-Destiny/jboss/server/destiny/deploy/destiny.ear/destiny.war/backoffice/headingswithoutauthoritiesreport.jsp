<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=HeadingsWithoutAuthoritiesReportForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>

<bean:define id="form" name="<%=HeadingsWithoutAuthoritiesReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.HeadingsWithoutAuthoritiesReportForm" />

<base:form action="/backoffice/servlet/handleheadingswithoutauthoritiesreportform.do">

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<table width="95%" border="0" cellpadding="4" cellspacing="1" bgcolor="#c0c0c0">
<tbody><tr><td bgcolor="#ffffff" valign="top" width="100%">
<input type="hidden" name="reportSiteID" value="2019">


    <table id="<%=HeadingsWithoutAuthoritiesReportForm.TABLE_HEADINGS_WITHOUT_AUTHORITIES_REPORT%>" width="100%" cellpadding="5" cellspacing="0">

    <tbody><tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_ListHeadingsWithoutAuthorities") %></td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_SelectBy") %></nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_LIMIT_SELECT_BY%>">
                <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.SELECT_BY_TITLE%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_Title") %></html:option>
                <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.SELECT_BY_CREATE_DATE%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_DateTitleAdded") %></html:option>
                <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.SELECT_BY_DATE_UPDATED%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_DateTitleUpdated") %></html:option>
                <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.SELECT_BY_CALL_NUMBER%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_CallNumber") %></html:option>
            </html:select>
            <logic:equal name="<%=HeadingsWithoutAuthoritiesReportForm.FORM_NAME%>" property="<%=HeadingsWithoutAuthoritiesReportForm.PARAM_SHOW_DATE_FIELD%>" value="false">
                &nbsp;<%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_From") %>&nbsp;
                <html:text property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_SELECT_FROM%>" size="9" maxlength="<%=HeadingsWithoutAuthoritiesReportForm.LENGTH_RANGE_FIELD%>"/>
                &nbsp;<%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_To") %>&nbsp;
                <html:text property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_SELECT_TO%>" size="9" maxlength="<%=HeadingsWithoutAuthoritiesReportForm.LENGTH_RANGE_FIELD%>"/>
            </logic:equal>

            <logic:equal name="<%=HeadingsWithoutAuthoritiesReportForm.FORM_NAME%>" property="<%=HeadingsWithoutAuthoritiesReportForm.PARAM_SHOW_DATE_FIELD%>" value="true">
                <html:select property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_DATE_MODE%>">
                    <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.DATE_MODE_AFTER_THE_DATE%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_AfterTheDate") %></html:option>
                    <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.DATE_MODE_ON_THIS_DATE%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_OnTheDate") %></html:option>
                    <html:option value='<%="" + HeadingsWithoutAuthorityJobParams.DATE_MODE_BEFORE_THE_DATE%>'><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_BeforeTheDate") %></html:option>
                </html:select>
                &nbsp;:&nbsp;
                <base:date 
			        buttonName = "<%=HeadingsWithoutAuthoritiesReportForm.BUTTON_CALENDAR%>"
			        fieldName = "<%=HeadingsWithoutAuthoritiesReportForm.FIELD_DATE_FIELD%>"
			        dateValue = "<%=form.getDateField()%>"
			    />
                
            </logic:equal>
        </td>
    </tr>
    
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" height="31"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_Compare") %></td>
        <td class="ColRow" height="31">
                <html:checkbox property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_INCLUDE_SUBJECTS%>"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_BibliographicSubjectsAgainstAuthorityRecords") %></html:checkbox>

		</td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" height="31">
                <html:checkbox property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_INCLUDE_AUTHORS%>"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_BibliographicAuthorsAgainstAuthorityRecords") %></html:checkbox>

		</td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" height="31">
                <html:checkbox property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_INCLUDE_SERIES%>"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_BibliographicSeriesAgainstAuthorityRecords") %></html:checkbox>

		</td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" height="31"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_Include") %></td>
        <td class="ColRow" height="31">
                <html:checkbox property="<%=HeadingsWithoutAuthoritiesReportForm.FIELD_INCLUDE_TITLE_DETAILS%>"><%= MessageHelper.formatMessage("headingswithoutauthoritiesreport_TitleDetails") %></html:checkbox>

		</td>
    </tr>



    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2" align="center"><base:reportButton/></td>
    </tr>
</tbody></table>
<!-- end body table -->
</td></tr></tbody></table>



</base:form>
