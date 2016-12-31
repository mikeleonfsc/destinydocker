<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="java.util.*"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.data.JobManagerClientVO"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.JobManagerForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.YesNoTag"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.remote.BibImportByControlNumJob"%>
<bean:define id="cform" name="cataloging_servlet_ImportBibRecentImportsForm" type="com.follett.fsc.destiny.client.cataloging.servlet.ImportBibRecentImportsForm"/>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    ImportBibRecentImportsForm form = (ImportBibRecentImportsForm)request.getAttribute("cataloging_servlet_ImportBibRecentImportsForm");

%>

<base:form action="/cataloging/servlet/handleimportbibrecentimportsform.do">


  <html:hidden property="page"/>
  <html:hidden property="collectionType"/>
  <html:hidden property="importJobID"/>

    <logic:equal name="<%= ImportBibRecentImportsForm.FORM_NAME %>" property="<%=ImportBibRecentImportsForm.FIELD_CONFIRM_DELETE_COPIES%>" value="true">
        <base:confirmBox showWarningIcon="true"
            noName="<%=YesNoTag.BUTTON_NAME_NO %>"
            messageText="<%=form.getConfirmMessageText()%>" />
    </logic:equal>
      
<base:outlinedTableAndTabsWithinThere tabs="<%= form.getTabs()%>" selectedTab="<%=ImportBibForm.ID_TAB_RECENT_IMPORTS %>" borderColor="#C0C0C0" width="100%">
<tr><td>
<table id="joblist" cellpadding="3" cellspacing="0" border="0" width="100%">
  <logic:equal name="cataloging_servlet_ImportBibRecentImportsForm" property="emptyHitList" value="false">

  <tr>
  <td colspan="2">
  
<%
    List hitList = form.getHitList();
    Iterator itr = hitList.iterator();
    int itemsInList = form.getTotalCount();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    if ( itemsToSkip + 1 > itemsInList ) {
        itemsToSkip = 0;
    }
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>
        
     <base:searchSummary searchType='<%=MessageHelper.formatMessage("importbibrecentimports_Jobs") %>' 
        startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
        endOfSet= "<%=String.valueOf(itemsToPrint)%>"
        totalInSet = "<%=String.valueOf(itemsInList)%>"
        tooManyHits = "false"/>
        
  </td>
  <td class="SmallColHeading"><A href="<%=form.getRefreshLink()%>" id="<%=ImportBibRecentImportsForm.ID_REFRESH_LIST %>"><%= MessageHelper.formatMessage("importbibrecentimports_RefreshList") %></A></td>
  <td colspan="4" class="SmallColHeading tdAlignRight"> 
     <base:pageListOutput formName="<%=ImportBibRecentImportsForm.FORM_NAME%>"/>
  </td>
  </tr>
  <tr>
  <td colspan="7" align="center">
    <base:imageLine height="2" width="100%"/>
  </td>
  </tr>
    <tr>
      <td class="SmallColHeading"><%= MessageHelper.formatMessage("importbibrecentimports_Job") %></td>
      <td class="SmallColHeading"><%= MessageHelper.formatMessage("importbibrecentimports_SubmittedBy") %></td>
      <td class="SmallColHeading"><%= MessageHelper.formatMessage("importbibrecentimports_Started") %></td>
      <% if (form.isDistrictMode()) { %>
          <td class="SmallColHeading"><%= MessageHelper.formatMessage("importbibrecentimports_Status") %>&nbsp;<base:helpTag helpFileName="d_viewing_job_summaries_district.htm"/></td>
      <% } else { %>
          <td class="SmallColHeading"><%= MessageHelper.formatMessage("importbibrecentimports_Status") %></td>
      <% } %>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    
<%
    while (itr.hasNext()) {
        JobManagerClientVO clientVO = (JobManagerClientVO) itr.next();
%>
        <base:flipper key="recentimports">
<%
        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(clientVO.getJobName());
        if ( form.isDistrictMode() && clientVO.getSiteShortName() != null ) {
            out.println("<BR>");
            out.println("[" + ResponseUtils.filter(clientVO.getSiteShortName()) + "]");
        }
        out.println("</td>");

        // Colrow removed because on inherited div within form
        out.println("<td valign=\"top\">");
        out.println(clientVO.getSubmitterName());
        out.println("</td>");

        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(clientVO.getJobStartTime());
        out.println("</td>");

        // ColRow removed because on inherited div within form
        out.println("<td valign=\"top\">");
        out.println(clientVO.getDisplayableStatus());
        if ( form.isDistrictMode() ) {
           if ( !StringHelper.isEmpty(clientVO.getElapsedTime())) {
              out.println("<div class=\"Instruction\">");
              out.println(clientVO.getElapsedTime());
              out.println("</div>");
           }
        }
        out.println("</td>");

        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(clientVO.getLinkView());
        out.println("</td>");
%>
        <td class="ColRow tdAlignRight">    
            <base:spanIfAllowed permission="<%= Permission.CAT_DELETE_COPIES %>">
            <%-- J-TRAC 98-267 --%>
            <% if ( !BibImportByControlNumJob.class.getName().equals(clientVO.getJobClassName() ) ) { %>
                <base:genericButton
                  src="/buttons/small/removecopies.gif"
                  alt='<%= MessageHelper.formatMessage("deleteCopies") %>'
                  name="<%= JobManagerForm.BUTTON_DELETE_COPIES_BY_IMPORT_PREFIX + clientVO.getJobID() %>"
                  absbottom="true"
                  />
            <%} %>
                  <input type="hidden" name="<%=ImportBibRecentImportsForm.FIELD_JOB_NAME_PREFIX + clientVO.getJobID()%>" value="<%=clientVO.getJobName() %>"/>
                      
             </base:spanIfAllowed>&nbsp;
        </td>  
        </base:flipper>
<%
    }
%>

  <tr>
  <td colspan="2">
     <base:searchSummary searchType='<%=MessageHelper.formatMessage("importbibrecentimports_Jobs") %>' 
        startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
        endOfSet= "<%=String.valueOf(itemsToPrint)%>"
        totalInSet = "<%=String.valueOf(itemsInList)%>"
        tooManyHits = "false"/>
  </td>
  <td class="SmallColHeading"><A href="<%=form.getRefreshLink()%>" id="<%=ImportBibRecentImportsForm.ID_REFRESH_LIST %>"><%= MessageHelper.formatMessage("importbibrecentimports_RefreshList") %></A></td>
  <td colspan="4" class="SmallColHeading tdAlignRight"> 
     <base:pageListOutput formName="<%=ImportBibRecentImportsForm.FORM_NAME%>" topOfPageLinks="false"/>
  </td>
  </tr>
  <tr>
  <td colspan="7" align="center">
    <base:imageLine height="2" width="100%"/>
  </td>
  </tr>
  </logic:equal>
  <logic:equal name="cataloging_servlet_ImportBibRecentImportsForm" property="emptyHitList" value="true">
    <tr><td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("importbibrecentimports_ThereAreNoRecentImportJobsPresentlyAvailable") %></td></tr>
    <tr>
      <td class="SmallColHeading" align="center"><A href="<%=form.getRefreshLink()%>" id="<%=ImportBibRecentImportsForm.ID_REFRESH_LIST %>"><%= MessageHelper.formatMessage("importbibrecentimports_RefreshList") %></A></td>
    </tr>
  </logic:equal>
</table>
</td></tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

