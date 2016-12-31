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
    MissouriReportForm form = (MissouriReportForm)request.getAttribute(MissouriReportForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlemissourireportform.do">
    <base:outlinedTableAndTabsWithinThere id="<%=MissouriReportForm.TABLE_MAIN%>" tabs="<%=form.getTabs()%>" selectedTab="<%=form.getSelectedTab()%>">
        <tr>
            <td class="TableHeading">Missouri State Report</td>
        </tr>
        <tr>
            <td width="100%">
                <table id="<%=MissouriReportForm.TABLE_OPTIONS%>" width="100%">
                    <% if (form.getStore().isDistrictUser()) { %>
                        <tr><td align="center"><table>
                        <tr>
                            <td class="ColRowBold tdAlignRight" valign="top">Site</td>
                            <td>
                                <base:selectSite
                                    selectedSiteID="<%=String.valueOf(form.getApplyToSiteID())%>"
                                    useSelectASite="true"
                                    name="<%=MissouriReportForm.FIELD_APPLY_TO_SITEID%>"
                                    collectionType="<%=CollectionType.LIBRARY%>"
                                    onChangeAction="submit()"/>
                            </td>
                        </tr>
                        </table></td></tr>
                        <% if ((form.getApplyToSiteID() != null) && (form.getApplyToSiteID().longValue() > 0)) { %>
                            <tr>
                                <td colspan="2"><base:imageLine/></td>
                            </tr>
                        <% } %>
                    <% } else { %>
                        <html:hidden property="<%=MissouriReportForm.FIELD_APPLY_TO_SITEID%>"/>
                    <% } %>
                    <% if ((form.getApplyToSiteID() != null) && (form.getApplyToSiteID().longValue() > 0)) { %>
                        <tr>
                            <td class="ColRow" align="center" colspan="2"><base:reportButton/></td>
                        </tr>
                        <tr>
                            <td colspan="2"><base:imageLine/></td>
                        </tr>
                    <% } %>
                </table>
            </td>
        </tr>
        <% if ((form.getApplyToSiteID() != null) && (form.getApplyToSiteID().longValue() > 0)) { %>
            <tr>
                <td width="100%">
                    <table id="<%=MissouriReportForm.TABLE_PREFIXES%>" width="100%">
                        <tr>
                            <td class="ColRowBold">This report includes:</td>
                        </tr>
                        <tr>
                            <td valign="top"><span class="ColRow">Dewey items with the following prefix(es):</span>
                            <span class="ColRow"><%=form.getIncludeDeweyPrefixes() %></span></td>
                        </tr>
                        <tr>
                            <td valign="top"><span class="ColRow">Non-Dewey items with the following prefix(es):</span>
                            <span class="ColRow"><%=form.getIncludeNonDeweyPrefixes() %></span></td>
                        </tr>
                    </table>
                </td>
            </tr>
        <% } %>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
