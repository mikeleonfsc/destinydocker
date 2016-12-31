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

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>


<%
    String formName = BibliographyForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handlebibliographyform.do";
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    BibliographyForm form = (BibliographyForm)request.getAttribute(formName);
%>
<bean:define id="bibTypeList" name="<%=formName%>" property="<%=BibliographyForm.FIELD_BIB_TYPE_LIST%>"/>

<base:form action="<%=formAction%>" enctype="multipart/form-data">

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">

    <html:hidden property="<%=BaseSaveableReportForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=BaseSaveableReportForm.PARAM_REPORT_NAME%>"/>

    <base:outlinedTableAndTabsWithinThere id="<%=BibliographyForm.TABLE_MAIN%>" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName() %>" tabs="<%=form.getTabs()%>">
        <tr>
            <td colspan="2" class="TableHeading" nowrap>
                <%=ResponseUtils.filter(form.getReportHeading())%>
            </td>
        </tr>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
     <base:isDistrictUser>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("bibliography_For") %></td>
            <td class="ColRow">
                <base:selectSite 
                    submitOnChange="true" 
                    name="<%=BibliographyForm.FIELD_REPORT_SITE_ID%>" 
                    selectedSiteID="<%=form.getReportSiteID().toString()%>" 
                    includeAllLibraries="false"
                    includeLibrarySites="true"
                    includeTextbookSites="false"
                    includeMediaSites="false"
                    includeAssetSites="false"
                    />
            </td>
        </tr>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
     </base:isDistrictUser>
     <base:isNotDistrictUser>
        <html:hidden property="<%=BasePatronReportForm.FIELD_REPORT_SITE_ID%>" value="<%=store.getSiteID().toString()%>"/>
     </base:isNotDistrictUser>
        <tr>
            <td colspan="2">
             <table width="100%">
              <tr>
                  <td>
                      &nbsp;
                  </td>
                  <td>
                    <base:TitleSelectionRange 
                        selectBy="<%=form.getSelectBy()%>" 
                        dateMode="<%=form.getDateMode()%>"
                        dateField="<%=form.getDateField()%>"
                        showBarcodeFileUploadButton="false"
                        selectByOnChangeFieldName="selectByChanged"
                        excludedOptions="<%=form.getExcludedOptions()%>"
                        includeBriefRecordOptions="false"
                        showBookListItButton="false"
                        disableBookListOptionForDistrictUser="false"
                        formName ="<%=BibliographyForm.FORM_NAME %>"
                        selectedListIDFieldName = "<%=BibliographyForm.FIELD_SELECTED_LISTID %>"
                        selectFrom = "<%=form.getSelectFrom() %>"
                        selectTo = "<%=form.getSelectTo() %>"
                        />
                  </td>
              </tr>
              </table>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("bibliography_MaterialType") %></td>
            <td class="ColRow" width="100%">
                <html:select property="<%=BibliographyForm.FIELD_BIB_TYPE%>">
                    <html:options collection="bibTypeList" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap="nowrap"><%= MessageHelper.formatMessage("bibliography_PublicationYear") %></td>
            <td class="ColRow" width="100%">
                <html:text size="4" maxlength="4" property="<%=BibliographyForm.FIELD_PUB_YEAR_START%>"/>&nbsp;<%=MessageHelper.formatMessage("bibliography_To") %>&nbsp;<html:text size="4" maxlength="4" property="<%=BibliographyForm.FIELD_PUB_YEAR_END%>"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("bibliography_SortBy") %></td>
            <td class="ColRow">
                <html:select property="<%=BibliographyForm.FIELD_SORT_BY%>">
                    <html:option value="<%=String.valueOf(SortHelper.SORTBYCALLNUMBERAUTHORTITLE)%>"><%= MessageHelper.formatMessage("bibliography_CallNumberAuthor") %></html:option>
                    <html:option value="<%=String.valueOf(SortHelper.SORTBYAUTHOR)%>"><%= MessageHelper.formatMessage("bibliography_AuthorTitle") %></html:option>
                    <html:option value="<%=String.valueOf(SortHelper.SORTBYTITLE)%>"><%= MessageHelper.formatMessage("bibliography_TitleAuthor") %></html:option>
                </html:select>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("bibliography_ReportTitle") %></td>
            <td class="ColRow">
                <html:text property="<%=BibliographyForm.FIELD_REPORT_TITLE%>" size="20" maxlength="50"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap>
                &nbsp;
            </td>
            <td nowrap class="ColRow">
                <html:checkbox property="<%=BibliographyForm.FIELD_INCLUDE_NOTES%>"/><%= MessageHelper.formatMessage("bibliography_ShowNotes") %></td>
        </tr>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr><td colspan="2" class="ColRowBold" align="center">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=BibliographyForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=BibliographyForm.BUTTON_SAVE_AND_RUN%>" alt='<%=MessageHelper.formatMessage("saveAndRun")%>' src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=BibliographyForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup")%>'/>
                            </td>
                            <td>
                                <base:reportButton/>
                            </td>
                        </c:otherwise>
                    </c:choose>                    
                </tr>
            </table>
        </td></tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
