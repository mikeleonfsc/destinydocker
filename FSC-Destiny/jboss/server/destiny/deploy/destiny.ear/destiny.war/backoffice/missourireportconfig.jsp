<%@page import="com.follett.fsc.common.MessageHelper"%>
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
    MissouriReportConfigForm form = (MissouriReportConfigForm)request.getAttribute(MissouriReportConfigForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.MOReportsPrefixClientValue"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlemissourireportconfigform.do">
    <base:outlinedTableAndTabsWithinThere id="<%=MissouriReportConfigForm.TABLE_MAIN%>" tabs="<%=form.getTabs()%>" selectedTab="<%=form.getSelectedTab()%>">
    <html:hidden property="<%=MissouriReportConfigForm.FIELD_YEAR_THRESHOLD %>"/>
    <html:hidden property="<%=MissouriReportConfigForm.FIELD_DEWEY_CATEGORY %>"/>
    <tr>
        <td colspan="2" class="TableHeading"><%=MessageHelper.formatMessage("missourireportsummary_MissouriStateReport")%></td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine/></td>
    </tr>
    <tr>
        <td colspan="2" class="TableHeading2">Configure Call Number Prefixes</td>
    </tr>
    <tr>
        <td colspan="2">
            <table cellspacing="0" cellpadding="4" width="100%" id="<%=MissouriReportConfigForm.TABLE_PREFIX_LIST%>">
            <tr>
                <td class="ColRowBold" align="center">Prefixes with Dewey</td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_FICTION)%></td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_VISUAL)%></td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE)%></td>
                <td class="ColRowBold" align="center"><%=MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE)%></td>
            </tr>
            <% for (MOReportsPrefixClientValue prefix : form.getDeweyPrefixes()) {
                   String prefixStr = ResponseUtils.filter(prefix.getPrefix());
                   String encodedStr = prefix.getTextEncodedPrefix();
                   String checkedFicStr = "";
                   String checkedVisStr = "";
                   String checkedRefStr = "";
                   String checkedDontStr = "";
                   switch (prefix.getReportType()) {
                        case MOReportsFacadeSpecs.REPORT_TYPE_FICTION:
                            checkedFicStr = "checked=\"checked\"";
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
                   } %>
                <tr>
                    <td class="ColRow" align="center"><%=prefixStr%></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_FICTION%>" <%=checkedFicStr%>/></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_VISUAL%>" <%=checkedVisStr%>/></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE%>" <%=checkedRefStr%>/></td>
                    <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE%>" <%=checkedDontStr%>/></td>
                </tr>
            <% } %>
            <% if (form.getNonDeweyPrefixes() != null) { %>
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
                <% for (MOReportsPrefixClientValue prefix : form.getNonDeweyPrefixes()) {
                        String prefixStr = ResponseUtils.filter(prefix.getPrefix());
                        String encodedStr = prefix.getTextEncodedPrefix();
                        String checkedFicStr = "";
                        String checkedVisStr = "";
                        String checkedRefStr = "";
                        String checkedDontStr = "";
                        switch (prefix.getReportType()) {
                            case MOReportsFacadeSpecs.REPORT_TYPE_FICTION:
                                checkedFicStr = "checked=\"checked\"";
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
                        } %>
                    <tr>
                        <td class="ColRow" align="center"><%=prefixStr%></td>
                        <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_FICTION%>" <%=checkedFicStr%>/></td>
                        <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_VISUAL%>" <%=checkedVisStr%>/></td>
                        <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE%>" <%=checkedRefStr%>/></td>
                        <td class="ColRow" align="center"><input type="radio" name="<%=MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr%>" value="<%=MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE%>" <%=checkedDontStr%>/></td>
                    </tr>
                <% } %>
            <% } // if nonDeweyPrefixes != null %>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine/></td>
    </tr>
    <% if (form.getStore().isDistrictUser()) { %>
        <tr>
            <td class="ColRow" align="center" colspan="2">These settings will only be applied to new sites.*</td>
        </tr>
    <% } %>
    <tr>
        <td class="ColRow" align="center" colspan="2"><base:genericButton name="<%=MissouriReportConfigForm.BUTTON_SAVE_SETUP %>" src="/buttons/large/savesetup.gif" alt="Save"/></td>
    </tr>
    <% if (form.getStore().isDistrictUser()) { %>
        <tr>
            <td colspan="2"><base:imageLine/></td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2" align="center">
                *Apply these settings at
                <base:selectSite name="<%=MissouriReportConfigForm.FIELD_APPLY_TO_SITEID %>" includeAllLibraries="true" collectionType="<%=CollectionType.LIBRARY %>"/>
                &nbsp;&nbsp;&nbsp;
                <base:genericButton name="<%= MissouriReportConfigForm.BUTTON_PUSH%>" src="/buttons/large/push.gif" absbottom="true" alt="Push"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><span class="ColRowBold">Note:</span> <span class="ColRow">Pushing configuration options does not save them as the defaults for the new sites.</span></td>
        </tr>
    <% } else { %>
        <html:hidden property="<%=MissouriReportConfigForm.FIELD_APPLY_TO_SITEID %>"/>
    <% } %>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
