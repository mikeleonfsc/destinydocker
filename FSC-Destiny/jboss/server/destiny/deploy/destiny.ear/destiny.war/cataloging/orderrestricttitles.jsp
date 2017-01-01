<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="java.util.List"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderDistrictSitesValue"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.StateParticipatingSiteVO"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.OrdersListForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.OrderRestrictTitlesForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleSearchVO"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO"%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>
<%
    OrderRestrictTitlesForm form = (OrderRestrictTitlesForm)request.getAttribute(OrderRestrictTitlesForm.FORM_NAME);
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:form action="/cataloging/servlet/handleorderrestricttitlesform.do" focus="<%=OrderRestrictTitlesForm.FIELD_SEARCH_STRING%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
    <bean:define id="searchTypes" name="<%= OrderRestrictTitlesForm.FORM_NAME %>" property="searchTypes"/>
    <html:hidden property="<%=OrderRestrictTitlesForm.HIDDEN_PREVIOUS_SEARCH_STRING%>"/>
    <html:hidden property="<%=OrderRestrictTitlesForm.HIDDEN_PREVIOUS_SEARCH_TYPE%>"/>
    <html:hidden property="<%=OrderRestrictTitlesForm.PARAM_VIEW_BIB_ID%>"/>
    <html:hidden property="<%=OrderRestrictTitlesForm.PARAM_SEARCH_EXECUTED%>"/>
    <html:hidden property="<%=OrderRestrictTitlesForm.FIELD_TRAP_ENTER_PRESSED%>" value="false"/>
    
    <script language="JavaScript">
    <!--
    
        function trapEnter(e) {
            var whichCode = (window.Event) ? e.which : e.keyCode;
            if (e.keyCode == 13) {
                document.<%=OrderRestrictTitlesForm.FORM_NAME%>.<%=OrderRestrictTitlesForm.FIELD_TRAP_ENTER_PRESSED%>.value="true";
            }
            return whichCode;
        }
    
        function viewTitle(bibID) {
            document.<%=OrderRestrictTitlesForm.FORM_NAME%>.<%=OrderRestrictTitlesForm.PARAM_VIEW_BIB_ID%>.value = bibID;
            document.<%=OrderRestrictTitlesForm.FORM_NAME%>.submit();
        }
    
    //-->
    </script>
<base:outlinedTableAndTabsWithinThere id="<%=OrderRestrictTitlesForm.TABLE_MAIN %>" borderColor="#c0c0c0" selectedTab="<%=OrdersListForm.TAB_RESTRICTED_TITLES%>" tabs="<%=form.getTabs()%>" width="100%">

    <tr>
        <td class="TableHeading"><%=OrderRestrictTitlesForm.PAGE_TITLE %></td>
    </tr>
    <tr>
        <td valign="bottom" nowrap class="ColRowBold">
            <span onKeyPress="return trapEnter(event);">
        
           Find&nbsp;
           <html:text property="<%=OrderRestrictTitlesForm.FIELD_SEARCH_STRING%>" size="21"/>            
            in &nbsp;
            <html:select property="<%=OrderRestrictTitlesForm.FIELD_SEARCH_TYPE%>">
                <html:options collection="searchTypes" property="stringCode" labelProperty="stringDesc"/>
            </html:select >&nbsp;<base:goButton absbottom="true"/>
            
            </span>
        </td>
    </tr>
    <% OrderTitleSearchVO vo = form.getSearchResults();
        if(vo != null) { %>
            <tr>
              <td class="SmallColHeading" align="left">
                  Searched <%=form.getSearchTypeAsString()%> for &quot;<%=JSPHelper.filterHtmlAndNulls(vo.getSearchTerm())%>&quot;
              </td>
            </tr>
            <tr>
              <td class="TableHeading">
                  <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
              </td>
            </tr>
        
            <% if(vo.getResults() != null && vo.getResults().size() > 0) { 
                List<OrderTitleVO> list = vo.getResults();
            %>
                <tr>
                    <td>
                        <table id="<%=OrderRestrictTitlesForm.TABLE_SEARCH %>" width="100%" cellpadding="2" cellspacing="0">
                            <tr>
                                <td class='SmallColHeading'>Title<br/>Price / Adoption Year</td>
                                <td class='SmallColHeading'>ISBN<br/>Edition</td>
                                <td class='SmallColHeading'>State / Textbook ID<br/>Publisher</td>
                                <td class='SmallColHeading' align="center" valign="middle">Restricted</td>
                                <td>&nbsp;</td>
                            </tr>
                        
                            <%
                                request.setAttribute("flipper", Boolean.FALSE);
                                
                                for (int i = 0; i < list.size(); i++) {
                                    OrderTitleVO rec = vo.getResults().get(i);
                            %>
                                    <base:flipper key="flipper" >
                                        <td class="ColRow" valign="top">
                                            <%= form.buildBibTypeIcon(rec) %>
                                            <a href="javascript:viewTitle(<%=rec.getBibID()%>);">
                                            <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %></a><br/>
                                            <% if (rec.getReplacementPrice() != null) { %>
                                                <%=lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                            <% } %>
                                            
                                            <% if (rec.getAdoptionYear() != null) { %>
                                                Adoption Year:&nbsp;<%= rec.getAdoptionYear() %>
                                            <% } %>
                                        </td>
                                        <td class="ColRow" valign="top">
                                            <%=JSPHelper.filterHtmlAndNulls(rec.getDisplayableIsbnStrippedOfPrefix()) %><br/>
                                            <%=JSPHelper.filterHtmlAndNulls(rec.getEdition()) %>
                                        </td>
                                        <td class="ColRow" valign="top">
                                            <%=JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID()) %><br/>
                                            <%=JSPHelper.filterHtmlAndNulls(rec.getPublisher()) %>
                                        </td>
                                        <td class="ColRow" valign="middle" align="center">
                                            <%if(rec.isRestricted()) { %>
                                                <base:image src="/icons/general/lock.gif" alt="Restricted"/>
                                            <% } else { %>
                                                &nbsp;
                                            <% } %>                                                
                                        </td>
                                        <td class="ColRow" align="right">
                                            <% if(rec.isRestricted()) { %>
                                                <base:genericButton absbottom="true" name="<%=OrderRestrictTitlesForm.BUTTON_UNRESTRICT_SEARCH_TITLE_PREFIX + rec.getBibID()%>"
                                                    src="/buttons/small/unrestrict.gif" alt="<%=OrderRestrictTitlesForm.ALT_UNRESTRICT_TITLE %>"/>
                                            <% } else { %>
                                                <base:genericButton absbottom="true" name="<%=OrderRestrictTitlesForm.BUTTON_RESTRICT_SEARCH_TITLE_PREFIX + rec.getBibID()%>"
                                                    src="/buttons/small/restrict.gif" alt="<%=OrderRestrictTitlesForm.ALT_RESTRICT_TITLE %>"/>
                                            <% } %>
                                        </td>
                                    </base:flipper>
                             <% } %>
                        </table>
                    </td>
                </tr>
            <% } else { %>
                <tr>
                    <td class="ColRow">No matches found.</td>
                </tr>
            <% } %>
        <% } %>    
    
    <tr>
        <base:sectionHeading heading="Restricted Titles" tdContent="width='100%'"/>
    </tr>
    <% List<OrderTitleVO> restrictedTitles = form.getRestrictedTitles();  
       if (restrictedTitles != null && !restrictedTitles.isEmpty()) { %>
        <tr>
            <td>
                <table id="<%=OrderRestrictTitlesForm.TABLE_DETAIL %>" width="100%" cellpadding="2" cellspacing="0">
                    <tr>
                        <td class='SmallColHeading'>Title<br/>Price / Adoption Year</td>
                        <td class='SmallColHeading'>ISBN<br/>Edition</td>
                        <td class='SmallColHeading'>State / Textbook ID<br/>Publisher</td>
                        <td class='SmallColHeading' align="center" valign="middle">Restricted</td>
                        <td>&nbsp;</td>
                    </tr>
                
                    <%
                        request.setAttribute("flipper", Boolean.FALSE);
                        for (int i = 0; i < restrictedTitles.size(); i++) {
                            OrderTitleVO rec = restrictedTitles.get(i);
                    %>
                            <base:flipper key="flipper" >
                                <td class="ColRow" valign="top">
                                    <%= form.buildBibTypeIcon(rec) %>
                                    <a href="javascript:viewTitle(<%=rec.getBibID()%>);">
                                    <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %></a><br/>
                                    <% if (rec.getReplacementPrice() != null) { %>
                                        <%=lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                    <% } %>
                                    
                                    <% if (rec.getAdoptionYear() != null) { %>
                                        Adoption Year:&nbsp;<%= rec.getAdoptionYear() %>
                                    <% } %>
                                </td>
                                <td class="ColRow" valign="top">
                                    <%=JSPHelper.filterHtmlAndNulls(rec.getDisplayableIsbnStrippedOfPrefix()) %><br/>
                                    <%=JSPHelper.filterHtmlAndNulls(rec.getEdition()) %>
                                </td>
                                <td class="ColRow" valign="top">
                                    <%=JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID()) %><br/>
                                    <%=JSPHelper.filterHtmlAndNulls(rec.getPublisher()) %>
                                </td>
                                <td class="ColRow" valign="middle" align="center">
                                    <%if(rec.isRestricted()) { %>
                                        <base:image src="/icons/general/lock.gif" alt="Restricted"/>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>                                                
                                </td>
                                <td class="ColRow" align="right">
                                    <base:genericButton absbottom="true" name="<%=OrderRestrictTitlesForm.BUTTON_UNRESTRICT_TITLE_PREFIX + rec.getBibID()%>"
                                        src="/buttons/small/unrestrict.gif" alt="<%=OrderRestrictTitlesForm.ALT_UNRESTRICT_TITLE %>"/>
                                </td>
                            </base:flipper>
                     <% } %>
                </table>
            </td>
        </tr>
    <% } else { %>
        <tr>
            <td align="center" class="ColRowBold">No titles are restricted.</td>
        </tr>
    <% } %>
</base:outlinedTableAndTabsWithinThere>  

</base:form>
    
