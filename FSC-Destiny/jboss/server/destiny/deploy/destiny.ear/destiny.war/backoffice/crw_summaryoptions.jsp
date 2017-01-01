<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>
<%@ page import="com.follett.fsc.common.StringObjectLookup"%>
<%@ page import="java.util.*"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.CRWCustomColumn"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.CRWColumn"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<c:set var="form" value="<%=request.getAttribute(CRWSummaryOptionsForm.FORM_NAME)%>"/>
<bean:define id="javaForm" name="backoffice_servlet_CRWSummaryOptionsForm" type="CRWSummaryOptionsForm"/>
<%
  CRWSummaryOptionsForm form = (CRWSummaryOptionsForm)request.getAttribute(CRWSummaryOptionsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecrwsummaryoptionsform.do" enctype="multipart/form-data">
<html:hidden name="<%=CRWSummaryOptionsForm.FORM_NAME%>" property="<%=CRWSummaryOptionsForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWSummaryOptionsForm.FORM_NAME%>" property="<%=CRWSummaryOptionsForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWSummaryOptionsForm.FORM_NAME%>" property="<%=CRWSummaryOptionsForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWSummaryOptionsForm.FORM_NAME%>" property="<%=CRWSummaryOptionsForm.PARAM_DUPLICATE_REPORT%>"/>

<SCRIPT LANGUAGE="JavaScript">
<!--    
function checkEm(values, suffix, value)
{
	var field = document.backoffice_servlet_CRWSummaryOptionsForm.elements
    for ( i = 0; i < values.length; i++ ) {
      for (j = 0; j < field.length; j++){
        if (field[j].type == 'checkbox' && field[j].name == values[i] + suffix) {
            field[j].checked = value;
            break;
        }
      }        
    }
    return false;
}
//  End -->
</script>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWSummaryOptionsForm.BUTTON_TRAP_ENTER_KEY %>">

<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWSummaryOptionsForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWSummaryOptionsForm.TABLE_MAIN_TABLE%>">

    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWSummaryOptionsForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        ${form.header}
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_summaryoptions_Previous")%>' name="<%=CRWSummaryOptionsForm.BUTTON_PREV%>"/>
                                    <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_summaryoptions_Next")%>' name="<%=CRWSummaryOptionsForm.BUTTON_NEXT%>"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="tdAlignRight">
                                    <base:cancelButton name="<%= CRWBaseForm.BUTTON_NAME_CANCEL %>" />
                                </td>
                            </tr>
                        </table>
                    </td>                    
                </tr>
                <tr>
                    <td>
                        <span class="ColRowBold">
                            ${form.currentStep}
                        </span>
                        <span class="ColRow"><%= MessageHelper.formatMessage("crw_summaryoptions_IndicateHowYouWantTheInformationInYourReportToBeSu") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" background="/images/icons/general/thickline.gif" valign="top">
                        &nbsp;&nbsp;<span class="SectionHeader"><%= MessageHelper.formatMessage("crw_summaryoptions_ReportSummaryOptions") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table width = "100%" id="<%=CRWSummaryOptionsForm.TABLE_REPORT_SUMMARY_OPTIONS_TABLE%>" cellspacing="0" cellpadding="0">
                           <tr>
                               <td>&nbsp;</td>
                               <td align="center" valign="top" class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("crw_summaryoptions_Count") %></td>
                               <td align="center" valign="top" class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("crw_summaryoptions_Total") %><br><%=form.renderSelectAllAndClearAllButtons(CRWSummaryOptionsForm.FIELD_SUFFIX_TOTAL) %></td>
                               <td align="center" valign="top" class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("crw_summaryoptions_Average") %><br><%=form.renderSelectAllAndClearAllButtons(CRWSummaryOptionsForm.FIELD_SUFFIX_AVERAGE) %></td>
                               <td align="center" valign="top" class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("crw_summaryoptions_SmallestValue") %><br><%=form.renderSelectAllAndClearAllButtons(CRWSummaryOptionsForm.FIELD_SUFFIX_MIN) %></td>
                               <td align="center" valign="top" class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("crw_summaryoptions_LargestValue") %><br><%=form.renderSelectAllAndClearAllButtons(CRWSummaryOptionsForm.FIELD_SUFFIX_MAX) %></td>
                           </tr>
                            <c:set var="trvalue" value = "bgColor=\"#E8E8E8\"" />                               
                            <c:choose>
                               <c:when test="${form.groupingAssigned}">
                                    <c:forEach items="${form.listOfSelectedGroupColumns}" var="section" varStatus="status">
                                        <jsp:useBean id="section" type="com.follett.fsc.common.StringStringLookup" beanName="section" />
                                        <tr ${trvalue}>
                                            <td class="ColRowBold"> ${section.stringDesc}
                                            </td>
                                            <td align="center">
                                               <base:customReportSummaryCheckbox fieldName="<%=CRWSummaryOptionsForm.FIELD_PREFIX + 
                                                        section.getStringCode() + CRWSummaryOptionsForm.FIELD_SUFFIX_GROUP_TOTAL %>" />
                                            </td>
                                            <td colspan="4">&nbsp;</td>
                                        </tr>
                                            
                                        <c:choose>
                                            <c:when test="${fn:length(trvalue) > 0}">
                                                <c:set var="trvalue" value = "" />
                                            </c:when>
                                            <c:otherwise>
                                                <c:set var="trvalue" value = "bgColor=\"#E8E8E8\"" />
                                            </c:otherwise>
                                        </c:choose>                                        
                                    </c:forEach>
                                </c:when>
                               <c:otherwise>
                                   <tr ${trvalue}>
                                       <td class="ColRowBold"><%= MessageHelper.formatMessage("crw_summaryoptions_Records") %></td>
                                       <c:set var="checked" value = "" />
                                       <c:if test="${form.params.totalRootLevel}">
                                           <c:set var="checked" value = "CHECKED" />
                                       </c:if>
                                       <td align="center">
                                            <base:customReportSummaryCheckbox fieldName="<%=CRWSummaryOptionsForm.FIELD_PREFIX + CRWSummaryOptionsForm.FIELD_SUFFIX_TOTAL_RECORDS %>" />
                                       </td>
                                       <td colspan="4">&nbsp;</td>
                                   </tr>
                                   <c:set var="trvalue" value = "" />
                               </c:otherwise>
                            </c:choose>
                            
                            <c:forEach items="${form.listOfSelectedSummaryColumns}" var="summarySection" varStatus="summaryStatus">
                                <jsp:useBean id="summarySection" type="com.follett.fsc.common.StringObjectLookup" beanName="summarySection" />
                                <c:if test="${summarySection.value.canSummarize}">
                                    <tr ${trvalue}>
                                        <td class="ColRowBold"><c:out value="${summarySection.value.headingText}"/></td>
                                        <td>&nbsp;</td>
                                        <c:choose>
                                            <c:when test="${summarySection.value.canSummarizeTotal}">
                                                <td align="center">
                                                    <base:customReportSummaryCheckbox fieldName="<%=CRWSummaryOptionsForm.FIELD_PREFIX + 
                                                        summarySection.getKey() + CRWSummaryOptionsForm.FIELD_SUFFIX_TOTAL%>" />
                                                </td>                                                        
                                            </c:when>
                                            <c:otherwise>
                                                <td>&nbsp;</td>
                                            </c:otherwise>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${summarySection.value.canSummarizeAverage}">
                                                <td align="center">
                                                    <base:customReportSummaryCheckbox fieldName="<%=CRWSummaryOptionsForm.FIELD_PREFIX + 
                                                        summarySection.getKey() + CRWSummaryOptionsForm.FIELD_SUFFIX_AVERAGE%>" />
                                                </td>                                                        
                                            </c:when>
                                            <c:otherwise>
                                                <td>&nbsp;</td>
                                            </c:otherwise>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${summarySection.value.canSummarizeMinimum}">
                                                <td align="center">
                                                    <base:customReportSummaryCheckbox fieldName="<%=CRWSummaryOptionsForm.FIELD_PREFIX + 
                                                        summarySection.getKey() + CRWSummaryOptionsForm.FIELD_SUFFIX_MIN%>" />
                                                </td>                                                        
                                            </c:when>
                                            <c:otherwise>
                                                <td>&nbsp;</td>
                                            </c:otherwise>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${summarySection.value.canSummarizeMaximum}">
                                                <td align="center">
                                                    <base:customReportSummaryCheckbox fieldName="<%=CRWSummaryOptionsForm.FIELD_PREFIX + 
                                                        summarySection.getKey() + CRWSummaryOptionsForm.FIELD_SUFFIX_MAX%>" />
                                                </td>                                                        
                                            </c:when>
                                            <c:otherwise>
                                                <td>&nbsp;</td>
                                            </c:otherwise>
                                        </c:choose>
                                    </tr>
                                    
                                    <c:choose>
                                        <c:when test="${fn:length(trvalue) > 0}">
                                            <c:set var="trvalue" value = "" />
                                        </c:when>
                                        <c:otherwise>
                                            <c:set var="trvalue" value = "bgColor=\"#E8E8E8\"" />
                                        </c:otherwise>
                                    </c:choose>                                        
                                </c:if>
                            </c:forEach>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
            <tr>
            <td>
                <base:imageLine/>
            </td>
            </tr>
            <tr>
            <td align="center">
            <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/>
            </td>
            </tr>    
</base:outlinedTable>
<SCRIPT LANGUAGE="JavaScript">
<!--    
<%=form.gimmeJavascriptCheckStuff()%>
//  End -->
</script>
</base:form>
