<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ResourceCheckoutSummaryJobParams"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ResourceCheckoutSummaryForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

%>

<bean:define id="form" name="<%= ResourceCheckoutSummaryForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.ResourceCheckoutSummaryForm" />
<bean:define id="limitByList" name="<%= ResourceCheckoutSummaryForm.FORM_NAME %>" property="limitList"/>
<bean:define id="sortByList" name="<%= ResourceCheckoutSummaryForm.FORM_NAME %>" property="sortList"/>

<base:form action="/backoffice/servlet/handleresourcecheckoutsummaryform.do">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="<%=ResourceCheckoutSummaryForm.TABLE_TEXTBOOK_MAIN%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" class="TableHeading">
            List resource checkouts...
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            For
        </td>
        <td class="ColRow">
            <base:isDistrictUser>
                    <base:selectSiteAndSiteType 
                        name="<%= ResourceCheckoutSummaryForm.FIELD_REPORT_SITE_ID%>"
                        selectedSiteID="<%=form.getReportSiteID()%>"
                        includeForLibrarySites="false"
                        includeForTextbookSites="false"
                        includeForAssetSites="true"
                        includeDistrictWarehouse="false"
                        includeAlternateSiteTypes="true"
                        includeOptGroups="true"
                        onChangeAction="this.form.submit(); return false;"
                    />
           </base:isDistrictUser>
           <base:isNotDistrictUser>
           <%=ResponseUtils.filter((String)store.getProperty(LoginFacadeSpecs.SITE_DISPLAY_NAME)) %>
            <html:hidden property="<%= ResourceCheckoutSummaryForm.FIELD_REPORT_SITE_ID %>"/>
           </base:isNotDistrictUser>
        </td>
    </tr>

		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top">Of Resource Type</td>
			<td vAlign="top" colspan="2">
		    	<base:assetTypesList formName="<%= ResourceCheckoutSummaryForm.FORM_NAME%>"/>
			</td>
		</tr>

    <%if (form.gimmeShowClassDropDown() ) { %>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">
                <nobr>Current Classes</nobr>
            </td>
            <td class="ColRow">
               <base:currentClasses name="<%=ResourceCheckoutSummaryForm.FIELD_CLASS_ID%>"
                        selectedClassID="<%=form.getClassID()%>"
                        siteID="<%=form.gimmeSelectedSiteID()%>"
                        submitOnChange="true"
                />

            </td>
        </tr>
        <logic:equal name="<%=ResourceCheckoutSummaryForm.FORM_NAME %>" property="allClassesDisplaying" value="true">
            <tr>
                <td class="ColRowBold tdAlignRight">Limit by</td>
                <td class="ColRowBold">
                <html:select property="<%= ResourceCheckoutSummaryForm.FIELD_CLASS_TYPE_ID %>">
                    <html:options collection="limitByList" property="longID" labelProperty="stringDesc"/>
                </html:select>
                </td>
            </tr>
            <tr>
                <td class="ColRow tdAlignRight">&nbsp;</td>
                <td class="ColRow">
                    From&nbsp;<html:text property="<%=ResourceCheckoutSummaryForm.FIELD_SEARCH_FROM %>" size="20" />
                    &nbsp;to&nbsp;<html:text property="<%=ResourceCheckoutSummaryForm.FIELD_SEARCH_TO %>" size="20" />
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">Sort by</td>
                <td class="ColRowBold">
                <html:select property="<%= ResourceCheckoutSummaryForm.FIELD_SORT_TYPE_ID %>">
                    <html:options collection="sortByList" property="longID" labelProperty="stringDesc"/>
                </html:select>
                </td>
            </tr>

        </logic:equal>
        <tr>
            <td class="ColRowBold tdAlignRight">Include</td>
            <td class="ColRowBold">
                <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_SHOW_PATRON_NAMES%>" />
                Names of Students without Resources
            </td>
        </tr>
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRowBold">
                <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_INCLUDE_TEACHER%>" />
                Teacher
            </td>
        </tr>
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRowBold">
                <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_INCLUDE_PERIOD%>" />
                Period
            </td>
        </tr>
        <logic:equal name="<%=ResourceCheckoutSummaryForm.FORM_NAME %>" property="allTemplatesAreTextbooks" value="true">
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRowBold">
                <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_INCLUDE_USER_DEFINED%>" />
                <%=form.gimmeResourceUDFFieldName() %>
            </td>
        </tr>
        </logic:equal>
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRowBold">
                <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_SHOW_OFFSITE_TITLES%>" />
                Off-site resources associated with the class
            </td>
        </tr>
            <tr>
                <td class="ColRow tdAlignRight">&nbsp;</td>
                <td class="ColRowBold">
                    <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_INCLUDE_PAGE_BREAK%>" />
                    Page Break
                </td>
            </tr>
            <tr>
                <td class="ColRow tdAlignRight">&nbsp;</td>
                <td class="ColRowBold">
                    <html:checkbox property="<%=ResourceCheckoutSummaryForm.FIELD_INCLUDE_SIGNATURE%>" />
                    Signature Line
                </td>
            </tr>

    <% } else { %>
	   <html:hidden property="<%= ResourceCheckoutSummaryForm.FIELD_SHOW_PATRON_NAMES %>"/>
	   <html:hidden property="<%= ResourceCheckoutSummaryForm.FIELD_SHOW_OFFSITE_TITLES %>"/>
    <% } %>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2" align="center"><base:reportButton/></td>
    </tr>
</base:outlinedTable>
</base:form>
