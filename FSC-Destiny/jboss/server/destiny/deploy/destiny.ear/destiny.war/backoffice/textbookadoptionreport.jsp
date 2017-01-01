<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseSaveableReportForm"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookAdoptionReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.TextbookConditionReportJob" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.TextbookAdoptionReportJobParams" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<% 
    TextbookAdoptionReportForm form = (TextbookAdoptionReportForm) request.getAttribute(TextbookAdoptionReportForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handletextbookadoptionreportform.do">
<html:hidden property="<%=TextbookAdoptionReportForm.FIELD_ACTION%>"/>
<html:hidden property="<%=TextbookAdoptionReportForm.FIELD_JOB_SPEC_ID%>"/>
<html:hidden property="<%=TextbookAdoptionReportForm.PARAM_REPORT_NAME%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTableAndTabsWithinThere id="<%=TextbookAdoptionReportForm.TABLE_TEXTBOOK_ADOPTION_REPORT%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getName()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td colspan="2" class="TableHeading">
            List textbook adoption information....
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Select &amp; sort by</nobr>
        </td>
        <td class="ColRow">
            <html:select property="<%=TextbookAdoptionReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=TextbookAdoptionReportJobParams.SELECT_SORT_BY_TITLE%>">Title</html:option>
                <html:option value="<%=TextbookAdoptionReportJobParams.SELECT_SORT_BY_PUBLISHER%>">Publisher</html:option>
                <html:option value="<%=TextbookAdoptionReportJobParams.SELECT_SORT_BY_VENDOR%>">Vendor</html:option>
            </html:select>
            &nbsp;from&nbsp;
            <html:text property="<%=TextbookAdoptionReportForm.FIELD_SELECT_AND_SORT_BY_FROM%>" size="9" maxlength="<%=TextbookAdoptionReportForm.LENGTH_RANGE_FIELD%>"/>
            &nbsp;to&nbsp;
            <html:text property="<%=TextbookAdoptionReportForm.FIELD_SELECT_AND_SORT_BY_TO%>" size="9" maxlength="<%=TextbookAdoptionReportForm.LENGTH_RANGE_FIELD%>"/>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Show</nobr>
        </td>
        <td class="ColRow">
            <html:radio property="<%=TextbookAdoptionReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=TextbookAdoptionReportJobParams.SHOW_DETAILS_TITLES_ONLY%>">Titles only</html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%=TextbookAdoptionReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=TextbookAdoptionReportJobParams.SHOW_DETAILS_ALL_COPIES%>">Titles and all copies</html:radio>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Limit by</nobr>
        </td>
        <td class="ColRow">
            <html:select property="<%=TextbookAdoptionReportForm.FIELD_LIMIT_BY%>">
                <html:option value="<%=TextbookAdoptionReportJobParams.LIMITER_STATE_ADOPTION%>">State Adoption</html:option>
                <html:option value="<%=TextbookAdoptionReportJobParams.LIMITER_DISTRICT_ADOPTION%>">District Adoption</html:option>
                <html:option value="<%=TextbookAdoptionReportJobParams.LIMITER_END_ADOPTION%>">End Adoption</html:option>
            </html:select>
            &nbsp;from&nbsp;
            <html:text property="<%=TextbookAdoptionReportForm.FIELD_LIMIT_BY_FROM%>" size="9" maxlength="<%=TextbookAdoptionReportForm.LENGTH_LIMIT_FIELD%>"/>
            &nbsp;to&nbsp;
            <html:text property="<%=TextbookAdoptionReportForm.FIELD_LIMIT_BY_TO%>" size="9" maxlength="<%=TextbookAdoptionReportForm.LENGTH_LIMIT_FIELD%>"/>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="3" align="center">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=TextbookAdoptionReportForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=TextbookAdoptionReportForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=TextbookAdoptionReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
                            </td>
                            <td>
                                <base:reportButton/>
                            </td>
                        </c:otherwise>
                    </c:choose>                    
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
