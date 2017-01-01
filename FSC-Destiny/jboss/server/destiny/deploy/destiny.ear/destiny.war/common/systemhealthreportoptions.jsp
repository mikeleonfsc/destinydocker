<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true" />
<base:form action="/common/servlet/handlesystemhealthreportoptionsform.do">
<base:outlinedTable width="95%" align='center' borderColor='#C0C0C0' cellpadding="3" id="<%=SystemHealthReportOptionsForm.TABLE_OPTIONS%>" >
    <tr class="TableHeading">
        <td colspan="2">Report Options...</td>
    </tr>
    <tr>
        <td>
            <table>
                <tr class="ColRowBold">
                    <td>
                        <html:checkbox property='<%=SystemHealthReportOptionsForm.FIELD_SEND_REPORTS%>'>Send system health data to Follett School Solutions, Inc.</html:checkbox>
                    </td>
                </tr>
                <tr class="Instruction">
                    <td>By selecting this option, statistical information regarding your Destiny server will be uploaded to Follett School Solutions, Inc. This information includes uptime and
                    bandwidth statistics, as well as browser version data. 
                    <base:helpTag helpFileName="d_system_statistical_data.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold" align="center">
                        <base:popupMessageTag messageFileName="d_system_reports_privacy_statement.htm" pageTitle="Privacy Statement"><font color="blue">Privacy Statement</font></base:popupMessageTag> 
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap="nowrap">
            <base:showHideTag id="Top">
                <base:saveButton onclick="hideElementTop()"/><br><base:cancelButton/>
            </base:showHideTag>
        </td>
    </tr>
</base:outlinedTable>
</base:form>



