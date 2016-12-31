<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>


<%@page import="com.follett.fsc.destiny.client.common.PageCalculator"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>







<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><base:messageBox strutsErrors="true"/>

<%
    PatronListSelectForm form = (PatronListSelectForm) request.getAttribute(PatronListSelectForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
    String focusControl;
    focusControl = form.getFocus();
%>


<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=PatronListSelectForm.FORM_NAME%>.<%=PatronListSelectForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>

<base:form action="/backoffice/servlet/handlepatronlistselectform.do" focus="<%=focusControl%>">
    <html:hidden property="<%=PatronListSelectForm.PARAM_PATRONS_LIST_OUT%>" />
    <html:hidden property="<%=PatronListSelectForm.FIELD_LAST_SEARCH_STRING%>" />
    <html:hidden property="<%=PatronListSelectForm.PARAM_LAST_SITEID%>" />
    <html:hidden property="<%= PatronListSelectForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>    
    <base:outlinedTable id="<%=PatronListSelectForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="100%"> 
    
        <tr>
            <td colspan="2" class="TableHeading" nowrap>
                    <%=MessageHelper.formatMessage("patronlistselect_SelectPatrons") %>
            </td>
        </tr>
        <tr><td>
        <table border="0" cellpadding="0" cellspacing="0" width="100%" >
                <tr>
                    <td class="ColRow">
                        <%=MessageHelper.formatMessage("patronlistselect_FindPatronRecordsWith")%>&nbsp;
                        <span onKeyPress="return trapEnter(event);">
                            <html:text property="<%=PatronListSelectForm.FIELD_SEARCH_STRING %>" size="20" maxlength="90"/>&nbsp;<%=MessageHelper.formatMessage("patronlistselect_In")%>
                        </span>                        
                        <base:selectPatronByType name="<%=PatronListSelectForm.FIELD_SEARCH_TYPE %>" selected="<%=form.getSearchType()%>" onlyMyPatrons="true" siteID="<%=store.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                        &nbsp;<base:genericButton src="/buttons/large/search.gif" alt='<%=MessageHelper.formatMessage("patronlistselect_Search")%>' name="<%= PatronLookupForm.BUTTON_SEARCH %>" absbottom="true" />
                    </td>
                </tr>
    <%
                     List patronsList = form.getPatronsList();
                     if (patronsList != null && patronsList.size() > 0) {
    
                         int itemsInList = patronsList.size();
                         int currentPage = PageCalculator.getCurrentPage(form);
                         int itemsToSkip = PageCalculator.getFirstNumberInPage(currentPage, form.gimmeMaxRowsToDisplay(),
                             itemsInList);
                         int itemsToPrint = PageCalculator.getOnePastLastNumberInPage(currentPage,
                             form.gimmeMaxRowsToDisplay(), itemsInList);
    %>             
                             <tr>
                                <td colspan="2">
                                    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                                        <tr>
                                            <td class="ColRowBold">
                                                <%=form.getSearchSummary()%>
                                            </td>
                                       </tr>
                                       <tr>
                                            <td class="SmallColHeading">
                                             <a name="<%=BasePatronListForm.ANCHOR %>"></a>
                                                <%=form.gimmeCurrentlySelectedCountMessage()%>
                                            </td>
                                            <td class="SmallColHeading tdAlignRight">
                                               <base:pageListOutput formName="<%= PatronListSelectForm.FORM_NAME %>" />
                                            </td>
                                       </tr>
                                    </table>
                                 </td>
                             </tr>
                             <tr>
                                <td colspan="2">
                                <html:hidden property="page" value='<%= "" + currentPage %>' />
                                
                                    <table id="<%=UpdatePatronMergeDuplicatesForm.TABLE_PATRON_INFO_DETAIL%>" width="100%" cellspacing="0" cellpadding="4" border="0">
                                        <tr>
                                            <td class="SmallColHeading">
                                                <%=MessageHelper.formatMessage("patronlistselect_LastFirstMiddle")%>
                                            </td>
                                            <td class="SmallColHeading">
                                                <%=MessageHelper.formatMessage("patronlistselect_Barcode")%>
                                            </td>
                                            <td class="SmallColHeading">
                                                <%=PatronSpecs.getDistrictIDPrompt()%>
                                            </td>
                                            <base:isDistrictUser>
                                                <td class="SmallColHeading">
                                                    <%=MessageHelper.formatMessage("patronlistselect_Site")%>
                                                </td>
                                            </base:isDistrictUser>
                                            <td class="SmallColHeading">
                                                <%=MessageHelper.formatMessage("patronlistselect_PatronType")%>
                                            </td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= PatronListSelectForm.FORM_NAME %>" property="patronsList" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
                                            <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+ FlipperTag.ROW_GRAY +"\"" : "" )%> >
                                                <base:td clazz="ColRow" filtered="true"><%=form.getPatronName(row)%></base:td>
                                                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronBarcode(store, row, form.getLastSiteID())%></base:td>
                                                <base:td clazz="ColRow" filtered="true"><%=row.getDistrictID()%></base:td>
                                                <base:isDistrictUser>
                                                    <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronSiteName(store, row, form.getLastSiteID())%></base:td>
                                                 </base:isDistrictUser>
                                                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronTypeDescription(store, row, form.getLastSiteID())%></base:td>
                                                <td class="SmallColHeading tdAlignRight"><%=form.getPatronLinks(row)%></td>
                                            </tr>
                                        </logic:iterate>
                                    </table>
                                </td>
                            </tr>
                             
             
                               <tr>
                                    <td colspan="2" class="SmallColHeading tdAlignRight">
                                       <base:pageListOutput formName="<%= PatronListSelectForm.FORM_NAME %>" />
                                    </td>
                               </tr>
               
                    <%
                    } else {
                    %>
                             <tr>
                                <td colspan="2">
                                    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                                       <tr>
                                            <td class="SmallColHeading">
                                                <%=form.gimmeCurrentlySelectedCountMessage()%>
                                            </td>
                                       </tr>
                                         
                                    </table>
                                 </td>
                             </tr>
                   
                    <%
                    }
                    %>                
    
                             <tr>
                                <td colspan="2">
                                    <base:selectedPatronListOutput form="<%=form%>" />
                                </td>
                             </tr>
                             
                             
                   
            </table>
            
          </td></tr>
          <tr><td><base:imageLine height="1" width="100%" vspace="6"/></td></tr>
          <tr><td colspan="2" align="center"><base:genericButton src="/buttons/large/ok.gif" name="<%=PatronLabelForm.BUTTON_OK %>" alt='<%=MessageHelper.formatMessage("patronlistselect_Ok")%>'/></td></tr>
    </base:outlinedTable>

</base:form>



