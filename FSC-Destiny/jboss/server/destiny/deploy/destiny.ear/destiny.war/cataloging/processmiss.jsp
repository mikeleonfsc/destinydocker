<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<bean:define id="searchOptions" name="cataloging_servlet_ProcessMissForm" property="searchOptions"/>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    ProcessMissForm form = (ProcessMissForm)request.getAttribute( "cataloging_servlet_ProcessMissForm" );
    String extraParams  = "&currentBibID=" + form.getCurrentBibID();
    
%>

<% if (form.gimmeTitleReplaced()) { %>
    <base:messageBox showRedBorder="true">
    <tr>
    <td valign="top">
        <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
    </td>
    <td>
        <span class="ColRowBold"><%= MessageHelper.formatMessage("processmiss_YourTitleHasBeenUpdated") %></span>
        <% if ( form.isDisplayNextButton() ) { %>
            <BR><BR>
            <span class="ColRow"><%= MessageHelper.formatMessage("processmiss_ClickTheArrowToViewTheNextMissedTitle") %></span>
        <% } %>
    </td>
    </tr>
    </base:messageBox>
<% } %>


<!-- ONLY display the table if there was results passed -->
<base:form action="/cataloging/servlet/handleprocessmissform.do" styleId="keywordSearch">
<% if ( form.getCurrentBibID() == null ) { %>
    <BR><BR>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("processmiss_ThereAreNoMissedRecordsToProcess") %>'/>

<% } else { %>

<html:hidden property="<%=ProcessMissForm.PARAM_CURRENT_BIBID%>"/>
<html:hidden property="<%=BaseListForm.PARM_PAGE%>"/>

<base:outlinedTable borderColor='#c0c0c0' width="95%" cellpadding="0" id="<%=ProcessMissForm.TABLE_MAIN%>">
  <tr>
      <td>
          <table width="100%" id="<%=ProcessMissForm.TABLE_SUBMAIN%>">
          <tr>
              <td>
                  <span class="TableHeading"><%= MessageHelper.formatMessage("processmiss_MissedTitle") %></span>
                  <span class="ColRow"><%= MessageHelper.formatMessage("processmiss_TitlesRemaining", Long.valueOf(form.getTitlesRemaining())) %></span>
              </td>
          </tr>
          <tr>
              <td>
                  <base:multiLineTitle record="<%=form.getTitleRecord()%>" extraParams="<%=extraParams%>"/>
              </td>
          </tr>
          <tr>
            <td>
               <table>
               <tr>
               <td class="FormLabel"><%= MessageHelper.formatMessage("processmiss_SearchBy") %><html:select property="<%=ProcessMissForm.FIELD_SEARCH_OPTION%>">
                    <html:options collection="searchOptions" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
                <html:text property="<%=ProcessMissForm.FIELD_KEYWORD_TEXT%>" size="21"/>
                </td>
                <td>
                <base:goButton/>
                </td>
                </tr>
                </table>
            </td>
          </tr>
          <tr>
              <td>
                <base:imageLine height="1" width="100%" />
              </td>
          </tr>
          <tr>
              <td>
                  <table width="100%" id="<%=ProcessMissForm.TABLE_RESULTS_HEADING%>">
                  <tr>
                      <td class="TableHeading"><%= MessageHelper.formatMessage("processmiss_AlliancePlusTitles") %><base:imageSpacer width="25" height="3"/>
                      </td>
                      <td class="ColRow">
                      <%=form.gimmeSearchDescription()%>
                      </td>
                  </tr>
                  <tr>
                      <td class="SmallColHeading" valign="top">
                          <%=form.gimmeSearchCounts()%>
                      </td>
                      <td class="SmallColHeading tdAlignRight">
                          <base:pageListOutput formName="cataloging_servlet_ProcessMissForm" />
                      </td>
                  </tr>
                  </table>
              </td>
          </tr>
          
          <tr>
              <td>
                <base:imageLine height="1" width="100%" />
              </td>
          </tr>
          <% if (form.gimmeAllianceList() == null || form.gimmeAllianceList().size() == 0 ) { %>
          <tr>
             <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("processmiss_NoMatchesFoundInAlliancePlus") %></td>
          </tr>
          <% } else { 
             for ( int x = 0; x < form.gimmeAllianceList().size(); x++ ) { %>
              <tr>
                 <td>
                  <base:multiLineTitle record="<%=(KeywordSearchRecord)form.gimmeAllianceList().get(x)%>" row="<%=x%>" showReplaceTitleButton="true"  extraParams="<%=extraParams%>"/>
                 </td>
              </tr>
              <tr>
                  <td>
                    <base:imageLine height="1" width="100%" />
                  </td>
              </tr>
          <%   } %>
              <tr>
                 <td>
                  <table width="100%" id="<%=ProcessMissForm.TABLE_SUBMAIN%>">
                  <tr>
                 
                  <td class="SmallColHeading" colspan="2" valign="top">
                      <%=form.gimmeSearchCounts()%>
                  </td>
                  <td class="SmallColHeading tdAlignRight">
                      <base:pageListOutput formName="cataloging_servlet_ProcessMissForm" topOfPageLinks="false"/>
                  </td>
                  </tr>
                  </table>
                  </td>
              </tr>
          <% } %>
          </table>
      </td>
      
      
      <% if (form.isDisplayNextButton()) { %>
      <td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("processmiss_GoToNext") %><br>
          <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("processmiss_ViewNextMissedTitle")%>' name="<%= ProcessMissForm.BUTTON_NAME_NEXT %>" />
      </td>
      <% } %>
  </tr>
</base:outlinedTable>        


<% } %>

</base:form>
<%-- dump out any -++ failure messages so AT's can look for them as well as customer support --%>
<!-- <%=request.getSession().getAttribute(ProcessMissForm.ATTR_ALLIANCE_SEARCH_MESSAGE)%> -->

