<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="form" name="<%=TextbookDetailForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm" />

<%
    Long bibIDNumber = form.getBibID();
    String bibType = form.getBibType();
    String bibID = null;
    if (bibIDNumber != null) {
        bibID = bibIDNumber.toString();
    }

int itemsInList = form.getTotalCount();
int currentPage = PageCalculator.getCurrentPage(form);
int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<tr>
   <td valign="top">
      <!-- mini-Title information -->
      
      
    <table width="100%" cellpadding="2" cellspacing="0">
        <tr>
            <td valign="top">
              <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_DETAIL_ON_COPIES_TAB%>" cellpadding="2" cellspacing="0">
                  <%= form.getTitleInformation() %>
              </table>                    
            </td>
            <td class="tdAlignRight" valign="top">
                <table id="<%=TextbookDetailForm.TABLE_ACTION_ICONS%>" cellpadding="2" cellspacing="0">
                    <% if (form.canAddCopy()) { %>
                    <tr>
                        <td>
                            <%= form.getAddCopyLinkForCopiesTab() %>
                        </td>
                    </tr>
                    <% } %>
                    <tr>
                        <td nowrap>
                            <% if(form.getPreviousBibID() != null) { %>
                                <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=TextbookDetailForm.ID_PREVIOUS_TITLE%>">
                                <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26" alt="<%=TextbookDetailForm.LINK_PREVIOUS_TITLE%>"/>
                                </base:link>
                            <% } else { %>
                                <base:imageSpacer width="44" height="26"/>
                            <% } %>
                            <% if(form.getNextBibID() != null) { %>
                                <base:link page='<%= form.getNextRecordLink() %>' id="<%=TextbookDetailForm.ID_NEXT_TITLE%>">
                                <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26" alt="<%=TextbookDetailForm.LINK_NEXT_TITLE%>"/>
                                </base:link>
                            <% } else { %>
                                <base:imageSpacer width="44" height="26"/>
                            <% } %>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
  </td>
</tr>

<tr>
    <td align="center"><base:imageLine height="1" width="100%"/></td>
</tr>
<tr>
    <td width="100%">
        <A NAME="copyTable"></A>
        <table id="<%=TextbookDetailForm.TABLE_COPY_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
            <tr>
                <td class="TableHeading2" colspan="5"><%= ResponseUtils.filter(form.getLocalCopyTableHeader(request)) %></td>
            </tr>
            <base:listOutput formName="<%=TextbookDetailForm.FORM_NAME%>" />
        </table>
    </td>
</tr>
<!-- if not a district user or in the state repository -->
<% if(!form.isDistrictUser() || store.isStateContext()){%>  
    <tr>
        <td colspan="2">
            <a name="OffsiteCopies"></a>
            <A name="<%=BaseTitleDetailForm.ANCHOR_OFF_SITE_COPIES %>"></A>
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    <tr>
        <td>
            <table id="<%=TextbookDetailForm.TABLE_OFFSITE_COPY_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                <% if(form.isSeeOffsiteCopies() || store.isStateContext()){%>  
                    <tr>
                        <td class="TableHeading2" colspan="5">Off-site Copies</td>
                    </tr>
                    <base:listOutput formName="<%=TextbookDetailForm.FORM_NAME%>" />
                <%}%>
            </table>
       </td>
    </tr>
<%}%>
<!-- end if not a district user or in the state repository -->
