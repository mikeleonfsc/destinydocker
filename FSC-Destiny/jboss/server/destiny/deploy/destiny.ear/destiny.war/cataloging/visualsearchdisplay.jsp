<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.VisualSearchDisplayForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AdvancedSearchRedirectorForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>

<c:set var="form" value="<%=request.getAttribute(VisualSearchDisplayForm.FORM_NAME)%>" />
<%  VisualSearchDisplayForm form = (VisualSearchDisplayForm)request.getAttribute( "cataloging_servlet_VisualSearchDisplayForm" );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlevisualsearchdisplayform.do">
<html:hidden property="<%=BaseListForm.PARAM_ELEMENTARY_MODE%>"/>
<c:choose>
 <c:when test="<%=form.showTabs() %>">    
  <base:outlinedTableWithTabsForBaseSearch 
  id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
  borderColor="#C0C0C0" selectedTab="<%=VisualSearchDisplayForm.ID_TAB_VISUAL_SEARCH%>" 
  tabs="<%=(Tab[])store.getAdvanceSearchTabArray()%>" 
  top10Link="<%=form.getTopTenTitles()%>"
  searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_VISUAL)%>" 
  >    
    <tr>
        <td align="center">    
            <table id="<%= VisualSearchDisplayForm.TABLE_VISUAL_SEARCH_ITEMS%>" cellpadding="2" cellspacing="0" border="0" width="100%">
                <tr>
                <%
                    int count = 0;
                    
                    List list = form.getElements();
                    Iterator itr = list.iterator();
            
                        while ( itr.hasNext() ) {
                            if ((count % 4) == 0) {
                    %>      </tr><tr>  <%
            
                            }
                            VisualSearchDisplayForm.VisualSearchElement element = (VisualSearchDisplayForm.VisualSearchElement)itr.next();
                            count++;
                    %>
                            <td width="25%" align="center"><table cellpadding="0" border="0" cellspacing="0">
                                <tr><td align="center"><a href="<%=element.url%>" id="<%=element.name%>" <%=element.targetString%>><img src="<%=element.imageName%>" alt="<%=element.name%>" title="<%=element.name%>" width="80" border="0" height="72"></a></td></tr>
                                <tr><td align="center" class="ColHeading"><%=ResponseUtils.filter(element.name)%></td></tr>
                            </table></td>
                    <%
                        }
                
                    if ( count == 0 ) {
                        out.println("<td class='ColRowBold' align='center'>"+ MessageHelper.formatMessage("visualsearchdisplay_NoVisualSearchesAreAvailable") +"</td>");                        
                    }
                %>
                </tr>
            </table>
        </td>
     </tr>
   </base:outlinedTableWithTabsForBaseSearch>    
  </c:when>
  <c:otherwise>
    <base:outlinedTable id="<%= VisualSearchDisplayForm.TABLE_VISUAL_SEARCH_ITEMS%>" cellpadding="5" width="100%" borderColor="#C0C0C0">
            <tr><td colspan="4" width="100%">
            <table id="<%= VisualSearchDisplayForm.TABLE_VISUAL_MY_SEARCHES %>" width="100%" cellpadding="2" cellspacing="0" border="0">
                <tr>
                    <td>
                    <%if ( !StringHelper.isEmpty(form.getTopTenTitles() ) ) { 
                        out.println(form.getTopTenTitles());    
                    } %>
                    </td>
                    <td class="tdAlignRight">
                    <c:if test="${form.displayMySearches}">
                        <a href="/cataloging/servlet/presentsearchhistoryform.do?searchGroupID=<%=SearchHistorySpecs.SEARCH_GROUP_VISUAL %>" id="<%=VisualSearchDisplayForm.ID_LINK_VISUAL_MY_SEARCHES %>">
                            <base:image  alt='<%= MessageHelper.formatMessage("mySearches") %>' src="/buttons/small/mysearches.gif"/>
                        </a>
                    </c:if>
                     
                    </td>
                </tr>
            </table>
            </td></tr>
        <tr>
        <%
            List list = form.getElements();
            Iterator itr = list.iterator();
            int count = 0;
    
                while ( itr.hasNext() ) {
                    if ((count % 4) == 0) {
            %>      </tr><tr>  <%
    
                    }
                    VisualSearchDisplayForm.VisualSearchElement element = (VisualSearchDisplayForm.VisualSearchElement)itr.next();
                    count++;
            %>
                    <td width="25%" align="center"><table cellpadding="0" border="0" cellspacing="0">
                        <tr><td align="center"><a href="<%=element.url%>" <%=element.targetString%>><img src="<%=element.imageName%>" alt="<%=element.name%>" title="<%=element.name%>" width="80" border="0" height="72"></a></td></tr>
                        <tr><td align="center" class="ColHeading"><%=ResponseUtils.filter(element.name)%></td></tr>
                    </table></td>
            <%
                }
        %>
        </tr>   
    </base:outlinedTable>
  </c:otherwise>
</c:choose>
 
</base:form>
