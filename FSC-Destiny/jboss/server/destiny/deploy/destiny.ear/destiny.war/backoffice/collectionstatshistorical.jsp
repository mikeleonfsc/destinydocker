<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.CollectionStatsJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %> 
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    CollectionStatsHistoricalForm form = (CollectionStatsHistoricalForm)request.getAttribute(CollectionStatsHistoricalForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
%>

<c:set var="form" value="${requestScope.form}"/>

<base:messageBox strutsErrors="true"/>

<bean:define id="myResourceList" name="<%=CollectionStatsHistoricalForm.FORM_NAME%>" property="<%=CollectionStatsHistoricalForm.PARAM_MY_RESOURCE_LIST%>" type="com.follett.fsc.destiny.util.lookup.LongStringLookupList"/>

<base:form action="/backoffice/servlet/handlecollectionstatshistoricalform.do">

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">

    <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=CollectionStatsHistoricalForm.PARAM_REPORT_NAME%>"/>

    <input type="hidden" name="clearCircTypeList" />

    <base:outlinedTableAndTabsWithinThere id="<%=CollectionStatsHistoricalForm.TABLE_MAIN%>" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName() %>" tabs="<%=form.getTabs()%>">
        <tr>
            <td colspan="3" class="TableHeading" nowrap>
                <%=ResponseUtils.filter(form.getReportHeading())%>
            </td>
        </tr>
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
    
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_Circulations") %></td>
            <td class="ColRow" colspan="2"><%= MessageHelper.formatMessage("collectionstatshistorical_From") %>&nbsp;<base:dateRange 
                    dateFrom="<%=form.getDateFrom()%>"
                    dateTo="<%=form.getDateTo()%>"
                />
            </td>
        </tr>
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
    
        <% if (!store.isDistrictUser()) { %>
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_Show") %></td>
                <td class="ColRow" colspan="2">
                    <bean:define id="showList" name="<%=CollectionStatsHistoricalForm.FORM_NAME%>" 
                        property="<%=CollectionStatsHistoricalForm.PARAM_SHOW_OPTION_LIST%>"/>
                    <html:select property="<%=CollectionStatsHistoricalForm.FIELD_SHOW_OPTION%>" onchange="this.form.submit(); return false;">
                        <html:options collection="showList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                </td>
            </tr>
        <% } else { %>
            <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_SHOW_OPTION%>"/>        
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_For") %></td>
                <td>
                    <base:selectSiteAndSiteType 
                        name="<%= CollectionStatsHistoricalForm.FIELD_SITE_ID%>" 
                        selectedSiteID="<%=form.getReportSiteID()%>"
                        includeForLibrarySites="true"
                        includeForTextbookSites="false"
                        onChangeAction="this.form.clearCircTypeList.value=true; this.form.submit(); return false;" 
                    />
                </td>
            </tr>
        <% } %>
    
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_OrganizedBy") %></td>
            <td class="ColRow" colspan="2">
                <bean:define id="organizedList" name="<%=CollectionStatsHistoricalForm.FORM_NAME%>" 
                    property="<%=CollectionStatsHistoricalForm.PARAM_ORGANIZED_BY_OPTION_LIST%>"/>
                <html:select property="<%=CollectionStatsHistoricalForm.FIELD_ORGANIZE_OPTION%>" onchange="this.form.submit(); return false;">
                    <html:options collection="organizedList" property="longID" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        
        <tr>
            <% if (form.getOrganizeOption() != CollectionStatsJobParams.ORGANIZEDBY_COPY_CATEGORY) { %>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_CallNumbers") %></td>
            <td valign="top" class="ColRow"><%= MessageHelper.formatMessage("collectionstatshistorical_From") %>&nbsp;<html:text property="<%=CollectionStatsHistoricalForm.FIELD_FROM_CALLNUMBER%>" size="9" maxlength="10"/>&nbsp;
                <%=MessageHelper.formatMessage("collectionstatshistorical_To") %>&nbsp;
                <html:text property="<%=CollectionStatsHistoricalForm.FIELD_TO_CALLNUMBER%>" size="9" maxlength="10"/>
            </td>
        </tr>
        
        <tr>
            <td>&nbsp;</td>
            <td class="Instruction"><%= MessageHelper.formatMessage("collectionstatshistorical_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3Digi") %></td>
        </tr>
    
        <% if (store.isDistrictUser()) { %>
        <tr>
            <td>&nbsp;</td>
            <td valign="top" class="ColRow">
                <html:checkbox property="<%= CollectionStatsHistoricalForm.FIELD_USE_CALL_NUMBER_PREFIX_MAP %>" /><%= MessageHelper.formatMessage("collectionstatshistorical_UseCallNumberPrefixMap") %><base:genericButton
                       name="<%= CollectionStatsHistoricalForm.BUTTON_UPDATE_CALL_NUMBER_PREFIX_MAP%>"
                       src="/buttons/large/update.gif"
                       alt='<%= MessageHelper.formatMessage("update")%>'
                       onclick="submit"/>
            </td>
        </tr>
        <% } %>
    
    <% if (form.getShowOption() != CollectionStatsJobParams.SHOW_TYPE_TITLE_COPY_DETAILS) { %>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_ONLY_SHOW_CIRCS%>"/>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_CIRC_OPTION%>"/>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_CIRC_NUMBER%>"/>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_IncrementByDewey") %></td>
            <td class="ColRow" colspan="2">
                <bean:define id="deweyList" name="<%=CollectionStatsHistoricalForm.FORM_NAME%>" 
                    property="<%=CollectionStatsHistoricalForm.PARAM_DEWEY_LIST%>"/>
                <html:select property="<%=CollectionStatsHistoricalForm.FIELD_DEWEY_INCREMENT%>">
                    <html:options collection="deweyList" property="longID" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
    <% } %>
    <% } %>
    <% if (form.getShowOption() == CollectionStatsJobParams.SHOW_TYPE_TITLE_COPY_DETAILS) { %>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_DEWEY_INCREMENT%>"/>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_LimitCopies") %></td>
            <td class="ColRow" colspan="2">
                <html:checkbox property="<%=CollectionStatsHistoricalForm.FIELD_ONLY_SHOW_CIRCS%>"/><%= MessageHelper.formatMessage("collectionstatshistorical_OnlyShowCopiesWithCirculations") %><bean:define id="circOptionList" name="<%=CollectionStatsHistoricalForm.FORM_NAME%>" 
                    property="<%=CollectionStatsHistoricalForm.PARAM_CIRC_OPTION_LIST%>"/>
                <html:select property="<%=CollectionStatsHistoricalForm.FIELD_CIRC_OPTION%>">
                    <html:options collection="circOptionList" property="longID" labelProperty="stringDesc"/>
                </html:select>
                <html:text property="<%=CollectionStatsHistoricalForm.FIELD_CIRC_NUMBER%>" size="5" maxlength="3"/>&nbsp;
            </td>
        </tr>
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
    <% } else { %>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_CIRC_OPTION%>"/>
    <% } %>
    
    <% if (form.getOrganizeOption() != CollectionStatsJobParams.ORGANIZEDBY_COPY_CATEGORY) { %>
    
    <% if (((form.canSeeMyResourceListDropDown()) || ! form.isMediaUser()) 
        && form.getShowOption() != CollectionStatsJobParams.SHOW_TYPE_TITLE_COPY_DETAILS) {%>
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
    <% } %>
    
    <% if (form.canSeeMyResourceListDropDown()) {%>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_ResourceList") %></td>
            <td colspan="2" nowrap>
                <html:select property="<%=CollectionStatsHistoricalForm.FIELD_SELECTED_LISTID%>">
                    <html:options collection="myResourceList" property="longID" labelProperty="stringDesc"/>
                </html:select>
                <base:spanIfAllowed 
                    permissions="<%=new Permission[] {store.isMediaBookingUser() ? Permission.CAT_ACCESS_BOOKLIST_MEDIA : Permission.CAT_ACCESS_BOOKLIST}%>">
                    <base:genericButton name="<%=CollectionStatsHistoricalForm.BUTTON_VIEW_LIST%>" src="/buttons/large/viewlist.gif" 
                        alt='<%= MessageHelper.formatMessage("viewList") %>' absbottom="true"></base:genericButton>
                </base:spanIfAllowed>                
            </td>
        </tr>
    <% } else {%>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_SELECTED_LISTID%>" value="<%=MyListSelectTag.SELECT_A_LIST_ID.toString() %>"/>    
    <% } %>
    
    <% if(! form.isMediaUser()){ %>        
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_CirculationTypes") %></td>
            <td colspan="2">
            <base:circTypesList formName="<%=CollectionStatsHistoricalForm.FORM_NAME%>"/>
            </td>
        </tr>
        <% } %>
        
    <% } else { %>
        <html:hidden property="<%=CollectionStatsHistoricalForm.FIELD_DEWEY_INCREMENT%>"/>
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("collectionstatshistorical_CopyCategories") %></td>
                <td colspan="2">
                <base:copyCategoriesList formName="<%=CollectionStatsHistoricalForm.FORM_NAME%>"/>
                </td>
            </tr>
    <% } %>
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <base:reportOutputType selectedValue="<%=form.getOutputType()%>" />
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center" colspan="3">
                <bean:write name="<%=CollectionStatsHistoricalForm.FORM_NAME%>" property="warningText" />&nbsp;
            </td>
        <tr>
            <td colspan="3" align="center">
                <table>
                    <tr>
                        <c:choose>
                            <c:when test="<%=CollectionStatsHistoricalForm.ACTION_RUN.equals(form.getAction()) %>">
                                <td valign="top">
                                    <base:genericButton name="<%=CollectionStatsHistoricalForm.BUTTON_SAVE_AND_RUN%>" alt='<%=MessageHelper.formatMessage("saveAndRun")%>' src="/buttons/large/saveandrun.gif"/>
                                </td>
                                <td>
                                    <base:cancelButton/>
                                </td>
                            </c:when>
                            <c:otherwise>
                                <td valign="top">
                                    <base:genericButton name="<%=CollectionStatsHistoricalForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup")%>'/>
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

