<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="org.apache.struts.util.ResponseUtils"%>

<%
    MissouriTimeSensitiveDeweyReportsConfigForm form = (MissouriTimeSensitiveDeweyReportsConfigForm)request.getAttribute(MissouriTimeSensitiveDeweyReportsConfigForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.MOReportsPrefixClientValue"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlemissouritimesensitivedeweyreportsconfigform.do">
    <base:outlinedTableAndTabsWithinThere id="<%=MissouriTimeSensitiveDeweyReportsConfigForm.TABLE_MAIN%>" tabs="<%=form.getTabs()%>" selectedTab="<%=form.getSelectedTab()%>">
    <tr>
        <td colspan="2" class="TableHeading">Configure Call Number Prefixes</td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Older and Newer counts based on</td>
        <td><span class="ColRow"><html:text property="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_YEAR_THRESHOLD %>" size="2" maxlength="2"/></span> <span class="ColRowBold">year threshold</span></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Default Time-Sensitive Dewey Decimal Category</td>
        <td class="ColRow">
            <html:select property="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_DEWEY_CATEGORY%>">
                  <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_PREK3_6)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_PREK3_6_STRING%></html:option>
                  <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_MIDDLE)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_MIDDLE_STRING%></html:option>
                  <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_HIGH)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_HIGH_STRING%></html:option>
                  <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_K12)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_K12_STRING%></html:option>
            </html:select>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine/></td>
    </tr>
    <tr>
        <td colspan="2">
            <table cellspacing="0" cellpadding="4" width="100%" id="<%=MissouriTimeSensitiveDeweyReportsConfigForm.TABLE_PREFIX_LIST%>">
            <tr>
                <td class="ColRowBold" align="center">Prefixes with Dewey</td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL)%></td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_VISUAL)%></td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE)%></td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE)%></td>
            </tr>
            <%
                for (MOReportsPrefixClientValue prefix : form.getDeweyPrefixes()) {
                        String prefixStr = ResponseUtils.filter(prefix.getPrefix()); 
                        String encodedStr = prefix.getTextEncodedPrefix();
                        String checkedProfStr = "";
                        String checkedVisStr = "";
                        String checkedRefStr = "";
                        String checkedDontStr = "";
                        switch (prefix.getReportType()) {
                            case MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL:
                                checkedProfStr = "checked=\"checked\"";
                                break;
                            case MOReportsFacadeSpecs.REPORT_TYPE_VISUAL:
                                checkedVisStr = "checked=\"checked\"";
                                break;
                            case MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE:
                                checkedDontStr = "checked=\"checked\"";
                                break;
                            default:
                                checkedRefStr = "checked=\"checked\"";
                                break;
                        }
            %>
            <tr>
                <td class="ColRow" align="center"><%=prefixStr%></td>
                <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL%>" <%=checkedProfStr%>/></td>
                <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_VISUAL%>" <%=checkedVisStr%>/></td>
                <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE%>" <%=checkedRefStr%>/></td>
                <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE%>" <%=checkedDontStr%>/></td>
            </tr>
            <%
                }
            %>
            
            <%
                            if (form.getNonDeweyPrefixes() != null) {
                        %>
                <tr>
                    <td colspan="5"><base:imageLine/></td>
                </tr>
                <tr>
                    <td class="ColRowBold" align="center">Prefixes w/o Dewey</td>
                    <td class="ColRowBold" align="center">&nbsp;</td>
                    <td class="ColRowBold" align="center">&nbsp;</td>
                    <td class="ColRowBold" align="center">&nbsp;</td>
                    <td class="ColRowBold" align="center">&nbsp;</td>
                </tr>
                <%
                    for (MOReportsPrefixClientValue prefix : form.getNonDeweyPrefixes()) {
                                String prefixStr = ResponseUtils.filter(prefix.getPrefix());
                                String encodedStr = prefix.getTextEncodedPrefix();
                                String checkedProfStr = "";
                                String checkedVisStr = "";
                                String checkedRefStr = "";
                                String checkedDontStr = "";
                                switch (prefix.getReportType()) {
                                    case MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL:
                                        checkedProfStr = "checked=\"checked\"";
                                        break;
                                    case MOReportsFacadeSpecs.REPORT_TYPE_VISUAL:
                                        checkedVisStr = "checked=\"checked\"";
                                        break;
                                     case MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE:
                                        checkedRefStr = "checked=\"checked\"";
                                        break;
                                    default:
                                        checkedDontStr = "checked=\"checked\"";
                                        break;
                                }
                %>
                <tr>
                    <td class="ColRow" align="center"><%=prefixStr%></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL%>" <%=checkedProfStr%>/></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_VISUAL%>" <%=checkedVisStr%>/></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE%>" <%=checkedRefStr%>/></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE%>" <%=checkedDontStr%>/></td>
                </tr>
                <%
                    }
                %>
            <%
                } // if nonDeweyPrefixes != null
            %>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine/></td>
    </tr>
    <%
        if (form.getStore().isDistrictUser()) {
    %>
    <tr>
        <td class="ColRow" align="center" colspan="2">These settings will only be applied to new sites.*</td>
    </tr>
    <%
        }
    %>
    <tr>
        <td class="ColRow" align="center" colspan="2"><base:genericButton name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.BUTTON_SAVE_SETUP %>" src="/buttons/large/savesetup.gif" alt="Save"/></td>
    </tr>
    <%
        if (form.getStore().isDistrictUser()) {
    %>
    <tr>
        <td colspan="2"><base:imageLine/></td>
    </tr>
    <tr>
        <td class="ColRow" colspan="2" align="center">*Apply these settings at <base:selectSite name="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_APPLY_TO_SITEID %>" includeAllLibraries="true" collectionType="<%=CollectionType.LIBRARY %>"/>&nbsp;&nbsp;&nbsp;<base:genericButton name="<%= MissouriTimeSensitiveDeweyReportsConfigForm.BUTTON_PUSH%>" src="/buttons/large/push.gif" absbottom="true" alt="Push"/></td>
    </tr>
    <tr>
        <td colspan="2" align="center"><span class="ColRowBold">Note:</span> <span class="ColRow">Pushing configuration options does not save them as the defaults for the new sites.</span></td>
    </tr>
    <%
        } else {
    %>
        <html:hidden property="<%=MissouriTimeSensitiveDeweyReportsConfigForm.FIELD_APPLY_TO_SITEID %>"/>
    <% } %>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
