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
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.OrderRestrictSitesForm"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderDistrictSitesValue"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.StateParticipatingSiteVO"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.OrdersListForm"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>
<%
    OrderRestrictSitesForm form = (OrderRestrictSitesForm)request.getAttribute(OrderRestrictSitesForm.FORM_NAME);
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<script type="text/javascript">
function submitOnClick() {
	document.<%=OrderRestrictSitesForm.FORM_NAME%>.submit();   
}
</script>
<base:form action="/cataloging/servlet/handleorderrestrictsitesform.do">

<base:outlinedTableAndTabsWithinThere id="<%=OrderRestrictSitesForm.TABLE_MAIN %>" borderColor="#c0c0c0" selectedTab="<%=OrdersListForm.TAB_RESTRICTED_SITES%>" tabs="<%=form.getTabs()%>" width="100%">
    <tr>
        <td class="TableHeading">Order Restrictions - Sites</td>
    </tr>
    <tr>
        <td class="ColRow" align="center">
            <table id="<%=OrderRestrictSitesForm.TABLE_HEADER %>" width="100%" cellpadding="0" cellspacing="0">
            
            <tr>
                <td width="1%" class="ColRowBold" align="center" nowrap>
                <base:selectDistrict 
                    name="<%=OrderRestrictSitesForm.FIELD_SELECTED_CONTEXT %>"
                    useArchive="false"
                    useSelectADistrict="true"
                    includeStateTextbookOffice="false"
                    submitOnChange="true"
                    selectedDistrictContext="<%=form.getSelectedContext() %>"
                    printerFriendly="false"
                    includeStatewide="true"
                />
                </td>
            </tr>
            </table>
        </td>
    </tr>

    <% if (! form.isSelectADistrict()) { %>   
        <tr>
            <td align="right" class="ColRowBold"><html:checkbox property="<%=OrderRestrictSitesForm.PARAM_RESTRICTED%>" onclick="submitOnClick()" /><label for="<%=OrderRestrictSitesForm.PARAM_RESTRICTED%>">Show only restricted sites</label></td>
        </tr>
    <% } %>
    
    <% if (form.getListDistricts() != null && !form.getListDistricts().isEmpty()) { %>
        <tr>
            <td><base:imageLine/></td>
        </tr>
        
        <tr>
            <td>
                <table id="<%=OrderRestrictSitesForm.TABLE_DETAIL %>" width="100%" cellpadding="2" cellspacing="0">
                    <%  List<OrderDistrictSitesValue> distList = form.getListDistricts();
                        if(! form.isSelectADistrict()){
                            for (int i = 0; i < distList.size(); i++) {
                                OrderDistrictSitesValue val = distList.get(i);
                                List<StateParticipatingSiteVO> siteList = val.getSiteList();
                            if  (form.isStateWide()) { %>
                                <tr>
                                    <td class = "TableHeading" colspan = "2"><%= val.getDistrictName() %></td>
                                </tr>
                            <% } %>
                            <tr>
                                <td class="SmallColHeading">Site</td>
                                <td class="SmallColHeading" align="center">Restricted</td>
                                <td>&nbsp;</td>
                            </tr>
                            <%
                                    request.setAttribute("flipper", Boolean.FALSE);
                                    for (int j = 0; j < siteList.size(); j++) {
                                        StateParticipatingSiteVO rec = siteList.get(j);
                                        
                            %>
                            <base:flipper key="flipper" >
                                <td class="ColRow" width="50%">
                                    <a name="<%=OrderRestrictSitesForm.ANCHOR_BASE%><%=rec.getStateSiteID()%>"></a>
                                    <%= JSPHelper.filterHtmlAndNulls(rec.getSiteName()) %></td>
                                <td align="center">
                                    <% if(rec.isRestrictOrder()){ %>
                                        <base:image src="/icons/general/lock.gif" alt="Restricted"/>
                                    <% } %>
                                </td>
                                <td align="right">
                                    <% if(!rec.isRestrictOrder()){ %>
                                        <base:link id="<%=(OrderRestrictSitesForm.LINK_RESTRICT_SITE_PREFIX + rec.getStateSiteID()) %>" href="<%=form.getRestrictLink(rec.getStateSiteID(),true) %>">
                                            <base:image src="/buttons/small/restrict.gif" alt="<%= OrderRestrictSitesForm.ALT_RESTRICT_SITE %>"/>
                                        </base:link>
                                    <% } else { %>
                                        <base:link id="<%=(OrderRestrictSitesForm.LINK_UNRESTRICT_SITE_PREFIX + rec.getStateSiteID()) %>" href="<%=form.getRestrictLink(rec.getStateSiteID(),false) %>">
                                            <base:image src="/buttons/small/unrestrict.gif" alt="<%= OrderRestrictSitesForm.ALT_UNRESTRICT_SITE %>"/>
                                        </base:link>
                                    <% } %>
                                </td>
                            </base:flipper>
                            <% } %>
                        <%  if  (form.isStateWide() && distList.size() < i-1) { %>
                        <tr>
                            <td colspan="2"><base:imageLine/></td>
                        </tr>
                        <% }
                        }%>
                <% } %>
                </table>
                
            </td>
        </tr>
    <% } else if (! form.isSelectADistrict()) { %>
        <tr>
            <td><base:imageLine/></td>
        </tr>
        <tr>
            <td align="center" class="ColRowBold">Based on your selection, there is nothing to display.</td>
        </tr>
    <% } %>
</base:outlinedTableAndTabsWithinThere>  

</base:form>
