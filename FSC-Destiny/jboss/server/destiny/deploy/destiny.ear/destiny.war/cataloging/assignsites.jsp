<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.session.district.data.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssignSitesForm.SiteVO"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssignSitesForm.SiteVO"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssignSitesForm.SiteVO.CheckState"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%@page import="org.apache.struts.util.ResponseUtils"%><base:messageBox strutsErrors="true"/>
<c:set var="cform" value="<%=request.getAttribute(ImportBibForm.FORM_NAME)%>"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    AssignSitesForm form = (AssignSitesForm)request.getAttribute("cataloging_servlet_AssignSitesForm");
%>

<base:form action="/cataloging/servlet/handleassignsitesform.do" enctype="multipart/form-data">
    <base:outlinedTable id="<%=AssignSitesForm.TABLE_MAIN%>"  borderColor="#C0C0C0" width="100%">
        <tr>
            <td colspan="2" class="TableHeading" valign="top"> <%=MessageHelper.formatMessage("assignsites_AssignAllIncomingFollettEbooksToTheFollowingSites") %></td>
            <td>&nbsp;</td>
            <td class="tdAlignRight">
                <base:genericButton src="/buttons/large/save.gif" alt='<%=MessageHelper.formatMessage("save") %>' name="<%=SaveButtonTag.BUTTON_NAME%>"/>
            </td>
        <tr>
        <tr>
            <td colspan="2" >&nbsp;</td>
            <td>&nbsp;</td>
            <td class="tdAlignRight">
                <base:genericButton src="/buttons/large/cancel.gif" alt='<%=MessageHelper.formatMessage("cancel") %>' name="<%=CancelButtonTag.BUTTON_NAME %>"/>
            </td>
        <tr>
            <td colspan="4">
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" width="80%" colspan="2">
                <%=MessageHelper.formatMessage("assignsites_Sites") %>
            </td>
            <td >
                <base:genericButton
                src="/buttons/small/selectall.gif"
                alt='<%= MessageHelper.formatMessage("selectAll")%>'
                name="<%= AssignSitesForm.BUTTON_SELECT_ALL %>"/>
            </td>
            <td >
                <base:genericButton
                src="/buttons/small/clearall.gif"
                alt='<%= MessageHelper.formatMessage("clearAll")%>'
                name="<%= AssignSitesForm.BUTTON_CLEAR_ALL %>"/>
            </td>
        </tr>
       <%
        int flipper = 0;
        List<AssignSitesForm.SiteVO> sitesList = form.getSites();
        Long lastSiteTypeID = null;
        AssignSitesForm.SiteVO site;
        AssignSitesForm.SiteVO siteType = null;
        DistrictTreeReturn dtr;
        Iterator itr = sitesList.iterator();
        boolean parentExpanded  = true; 
        
        while ( itr.hasNext() ) {
            site = (AssignSitesForm.SiteVO) itr.next();
            dtr = site.getDtr();
            Long siteTypeID = dtr.getSiteTypeID();
            if(dtr.getSiteID() == null){
                siteType = site;
            }
            
            
            parentExpanded = siteType.isExpanded();
            
            
            if(parentExpanded  || site.getDtr().getSiteID() == null){
                if ( ( flipper++ & 1 ) == 0 ) { %>
                   <tr bgcolor="#E8E8E8">
                <%}
                else { %>
                   <tr>
                <%} %>
                    <% if ( !StringHelper.isEmpty(dtr.getSiteName())) { %>
                            <td>
                            &nbsp;
                            </td>
                            
                            <td class="ColRow" colspan="2">
                            &nbsp;&nbsp;&nbsp;&nbsp;<%= dtr.getSiteName()%>
                            </td>
                        
                        
                            <td colspan="2" align="center">
                                <base:genericButton   
                                       src='<%= 
                                        ((site.getCheckState() == AssignSitesForm.SiteVO.CheckState.ALL))? "/icons/general/checked.gif" : "/icons/general/unchecked.gif" %>' 
                                       name="<%= AssignSitesForm.SITE_CHECKBOX_ + dtr.getSiteID() %>"/>
                            </td>
                    <% } else if(!StringHelper.isEmpty(dtr.getSiteTypeName()) && siteType.getSitesTotal() > 0) { %>
                        <td width="5%" class="tdAlignRight">
                            <%if(!parentExpanded){%>
                                <base:genericButton 
                                    src="/icons/general/plusAssets.gif" 
                                    alt='<%= MessageHelper.formatMessage("assignsites_Expand0", ResponseUtils.filter(dtr.getSiteTypeName()))%>' 
                                    name="<%= AssignSitesForm.BUTTON_EXPAND_ + dtr.getSiteTypeID() %>"/>
                            <% } else{ %>
                                <base:genericButton 
                                    src="/icons/general/minusAssets.gif" 
                                    alt='<%= MessageHelper.formatMessage("assignsites_Collapse0", ResponseUtils.filter(dtr.getSiteTypeName()))%>' 
                                    name="<%= AssignSitesForm.BUTTON_COLLAPSE_ + dtr.getSiteTypeID() %>"/>
                            <% } %>
                        </td>
                        <td class="ColRowBold">
                                <%= dtr.getSiteTypeName() %>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span id="<%=AssignSitesForm.SITE_TYPE_COUNTS + dtr.getSiteTypeID() %>" class="ColRow" style="font-weight:normal">&nbsp;&nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("assignsites_0of1", 
                                    Long.valueOf(site.getSitesSelected()), Long.valueOf(site.getSitesTotal()))%></span>
                        </td>
                        <td>
                        </td>
                        
                        <td colspan="2" align="center">
                            <%  
                                if(site.getSitesTotal() > 0){
                            if (site.getCheckState() == AssignSitesForm.SiteVO.CheckState.ALL) { %>
                                        <base:genericButton src="/icons/general/checked.gif" name="<%=AssignSitesForm.CHK_ALL + dtr.getSiteTypeID()%>"/>
                            <%  } else if (site.getCheckState() == AssignSitesForm.SiteVO.CheckState.NONE) { %>             
                                        <base:genericButton src="/icons/general/unchecked.gif" name="<%=AssignSitesForm.CHK_NONE + dtr.getSiteTypeID()%>"/>
                            <%  } else { // SOME %>             
                                        <base:genericButton src="/icons/general/partial.gif" name="<%=AssignSitesForm.CHK_SOME + dtr.getSiteTypeID()%>"/>
                            <%  }  
                            }else{ %>
                            &nbsp; 
                            <%} %> 
                        </td>
                    <% }else{
                        flipper++;
                    }
                    %>
            </tr>
            <%}
        }
        %>
</base:outlinedTable>
</base:form>
