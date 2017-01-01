<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" type="PatronStatisticsReportOptionsForm"/>

<base:form action="/backoffice/servlet/handlepatronstatisticsreportoptionsform.do">
    <html:hidden property="<%=PatronStatisticsReportOptionsForm.FIELD_LAST_SITE_ID%>"/>
    
	<base:outlinedTable id="<%=BasePatronReportForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
	    <tr>
	        <td colspan="3" class="TableHeading" nowrap><%=MessageHelper.formatMessage("patronstatisticsreportoptions_ListPatronStatistics") %></td>
	    </tr>
	    <tr>
	        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
	    </tr>
    <base:isDistrictUser>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_For") %></td>
            <td class="ColRow" colspan="2">
                <base:selectSite 
                    submitOnChange="true" 
                    name="<%=BasePatronReportForm.FIELD_REPORT_SITE_ID%>" 
                    selectedSiteID='<%= (form.getReportSiteID() != null) ? form.getReportSiteID().toString() : null %>'
                    includeLibrarySites="true"
        			includeTextbookSites="true"
        			includeMediaSites="true"
        			includeAssetSites="true"
		            mode="<%=SelectSiteTag.MODE_MEDIA%>"
                    includeDistrictWarehouse="false"
                    />
            </td>
        </tr>
	    <tr>
	        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
	    </tr>
    </base:isDistrictUser>
    <base:isNotDistrictUser>
        <html:hidden property="<%=BasePatronReportForm.FIELD_REPORT_SITE_ID%>"/>
    </base:isNotDistrictUser>
	    <tr>
	        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_ForPatronActivity") %></td>
	        <td class="ColRow" colspan="2"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_From") %>&nbsp;<base:dateRange 
					dateFrom="<%=form.getDateFrom()%>"
					dateTo="<%=form.getDateTo()%>"
				/>
            </td>
        </tr>
	    <tr>
	        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_CirculationsOf") %></td>
            <td class="ColRow" colspan="2">
                <logic:equal name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="mediaSite" value="false">
                    <logic:equal name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="displayDropdown" value="true">
                        <bean:define id="circsOfList" name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" 
                            property="<%=PatronStatisticsReportOptionsForm.FIELD_CIRCULATIONS_OF_LIST%>"/>
                        <html:select property="<%=PatronStatisticsReportOptionsForm.FIELD_CIRCULATIONS_OF%>">
                            <html:options collection="circsOfList" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </logic:equal>
                </logic:equal>
    
                <logic:equal name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="displayDropdown" value="false">
                    <html:hidden property="circsOf"/>
                    <bean:write name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="circsOfDisplayable"/>&nbsp;
                </logic:equal>
            </td>
        </tr>
	    <tr>
	        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_Show") %></td>
	        <td class="ColRow" colspan="2">
                <html:select property="<%=PatronStatisticsReportOptionsForm.FIELD_REPORT_TYPE%>">
                  <html:option value="<%=String.valueOf(PatronStatisticsJobParams.REPORT_TYPE_SUMMARY)%>">
                  <%=MessageHelper.formatMessage("patronstatisticsreportoptions_SummaryOnly")%>
                  </html:option>
                  <html:option value="<%=String.valueOf(PatronStatisticsJobParams.REPORT_TYPE_DETAIL)%>">
                  <%=MessageHelper.formatMessage("patronstatisticsreportoptions_Details")%>
                  </html:option>
                </html:select>
            </td>
        </tr>
            <bean:define id="userDefinedTypesList" name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="userDefinedTypesList"/>
            <bean:define id="userDefinedTypesListWithBlank" name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="userDefinedTypesListWithBlank"/>
        <tr><td colspan="3"><base:imageLine height="1" width="100%"/></td></tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_GroupBy") %></td>
           <td class="ColRowBold" colspan="2" valign="middle" nowrap>
              <html:select property="<%=PatronStatisticsReportOptionsForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN%>">
              <html:options collection="userDefinedTypesList" property="stringSortable"
                    labelProperty="stringItem"/></html:select>
           </td>
       </tr>
       <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_ThenBy") %>&nbsp;</td>
            <td class="ColRowBold"  colspan="2" valign="middle" nowrap>
              <html:select property="<%=PatronStatisticsReportOptionsForm.FIELD_GROUP_BY_SECONDARY_DROPDOWN%>">
              <html:options collection="userDefinedTypesListWithBlank" property="stringSortable"
                    labelProperty="stringItem"/></html:select>
            </td>
        </tr>
       <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_ThenBy") %>&nbsp;</td>
            <td class="ColRowBold" colspan="2" valign="middle" nowrap>
              <html:select property="<%=PatronStatisticsReportOptionsForm.FIELD_GROUP_BY_THIRD_DROPDOWN%>">
              <html:options collection="userDefinedTypesListWithBlank" property="stringSortable"
                    labelProperty="stringItem"/></html:select>
            </td>
        </tr>
       <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_AndFinallyBy") %>&nbsp;</td>
            <td class="ColRowBold" colspan="2" valign="middle" nowrap>
              <html:select property="<%=PatronStatisticsReportOptionsForm.FIELD_GROUP_BY_FOURTH_DROPDOWN%>">
              <html:options collection="userDefinedTypesListWithBlank" property="stringSortable"
                    labelProperty="stringItem"/></html:select>
            </td>
        </tr>
	    <tr>
	        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
	    </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_PatronTypes") %></td>
            <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_Statuses") %></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_OnlyIncludeTheFollowing") %></td>
            <td valign="top" class="ColRow">
                <logic:iterate id="patronType" name="<%=PatronStatisticsReportOptionsForm.FORM_NAME%>" property="patronTypesList"
                    type="com.follett.fsc.destiny.session.backoffice.data.StringWithSortableVO">
                    <html:multibox property="<%=PatronStatisticsReportOptionsForm.FIELD_PATRON_TYPE_LIMITER %>"
                        value="<%=patronType.getStringItem() %>">
                    </html:multibox><bean:write name="patronType" property="stringItem"/><br>
                </logic:iterate>
            </td>
            <td valign="top" class="ColRow">
                <html:checkbox name="backoffice_servlet_PatronStatisticsReportOptionsForm" property="<%= PatronStatisticsReportOptionsForm.FIELD_INCLUDE_ACTIVE %>"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_Active") %></html:checkbox><br>
                <html:checkbox name="backoffice_servlet_PatronStatisticsReportOptionsForm" property="<%= PatronStatisticsReportOptionsForm.FIELD_INCLUDE_RESTRICTED %>"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_Restricted") %></html:checkbox><br>
                <html:checkbox name="backoffice_servlet_PatronStatisticsReportOptionsForm" property="<%= PatronStatisticsReportOptionsForm.FIELD_INCLUDE_INACTIVE %>"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_Inactive") %></html:checkbox><br>
            </td>
        </tr>
	    <tr>
	        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    <tr>
            <td class="ColRowBold" align="center" colspan="3"><%=MessageHelper.formatMessage("patronstatisticsreportoptions_DeletedPatronsWillNotBeIncludedInTheReport") %></td>
        </tr>
		<tr>
    		<td colspan="3" class="ColRowBold" align="center">
    		    <base:reportButton/>
    		</td>
		</tr>
   </base:outlinedTable>

</base:form>
