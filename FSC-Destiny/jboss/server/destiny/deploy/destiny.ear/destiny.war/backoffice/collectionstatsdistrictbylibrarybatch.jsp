<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="form" name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" type="CollectionStatsDistrictByLibraryForm"/>
<bean:define id="scheduleOptions" name="<%= CollectionStatsDistrictByLibraryForm.FORM_NAME %>" property="scheduleOptions"/>
<bean:define id="scheduleTimes" name="<%= CollectionStatsDistrictByLibraryForm.FORM_NAME %>" property="scheduleTimes"/>

<table id="<%= CollectionStatsDistrictByLibraryForm.TABLE_BATCH %>" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td colspan="2" align="center" class="TableHeading">District Collection Statistics by Library Report - Batch Request</td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%" vspace="6"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold" width="11%">Schedule Report</td>
        <td>
            <html:select property="<%=CollectionStatsDistrictByLibraryForm.FIELD_SCHEDULE_OPTION%>">
                <html:options collection="<%=CollectionStatsDistrictByLibraryForm.FIELD_SCHEDULE_OPTIONS%>" property="stringCode" labelProperty="stringDesc"/>
            </html:select>
            <base:helpTag helpFileName="d_LM_dist_collections_batch_dropdowns.htm"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold">Report Run Time</td>
        <td>
            <html:select property="<%=CollectionStatsDistrictByLibraryForm.FIELD_SCHEDULE_TIME%>">
                <html:options collection="<%=CollectionStatsDistrictByLibraryForm.FIELD_SCHEDULE_TIMES%>" property="stringCode" labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%" vspace="6"/>
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <base:genericButton src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup")%>' name="<%=CollectionStatsDistrictByLibraryForm.BUTTON_SAVE_SETUP%>"/>
            <base:genericButton src="/buttons/large/saveandrun.gif" alt='<%=MessageHelper.formatMessage("saveAndRun")%>' name="<%=CollectionStatsDistrictByLibraryForm.BUTTON_SAVE_AND_RUN%>"/>
        </td>
    </tr>
    </td>
</table>
