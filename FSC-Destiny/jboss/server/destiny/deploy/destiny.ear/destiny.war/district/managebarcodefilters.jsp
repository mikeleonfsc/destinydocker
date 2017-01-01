<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="java.util.List" %>
<%@ page import="com.follett.fsc.destiny.session.common.data.ManageBarcodeFilteringVO" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    ManageBarcodeFiltersForm form = (ManageBarcodeFiltersForm)request.getAttribute(ManageBarcodeFiltersForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handlemanagebarcodefiltersform.do" method="post">
    <html:hidden property="siteID" />
    <logic:present name="<%= ManageBarcodeFiltersForm.FORM_NAME %>" property="<%= ManageBarcodeFiltersForm.PARAM_COLLECTION_TYPE_TO_REMOVE %>">
        <html:hidden property="<%= ManageBarcodeFiltersForm.PARAM_COLLECTION_TYPE_TO_REMOVE %>" />
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    WARNING! The <%=CollectionType.getDisplayable(form.getCollectionTypeToRemove().intValue())%> Manager barcode filter will be removed!
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRowBold">
                The Percentage Verified will be reset to zero.
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    Are you sure you want to delete this filter?<br>
                    <base:yesButton/>
                    <base:noButton name="<%=ManageBarcodeFiltersForm.BUTTON_NO %>"/>
                </td>
            </tr>
        </base:messageBox>
    </logic:present>
    

<table border="0" cellspacing="0" cellpadding="3" align="center" width="90%">
<tr>
    <td width="100%">
        <base:outlinedTable borderColor="#c0c0c0" id="<%=ManageBarcodeFiltersForm.TABLE_MAIN %>" width="100%">

        <tr>
            <td class="TableHeading" colspan="4">
                Manage Barcode Reconstruction Filters...
            </td>
            <td class="tdAlignRight">
                <base:closeButton/>
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="SmallColHeading">
                Product
            </td>
            <td class="SmallColHeading" align="center">
                Filtering?
            </td>
            <td class="SmallColHeading" align="center">
                Filter Created
            </td>
            <td class="SmallColHeading" align="center">
                Percentage Verified
            </td>
            <td class="SmallColHeading tdAlignRight">
                &nbsp;                
            </td>
        </tr>
            <% 
                List filterList = form.getFilterList();
                for(int i = 0; i < filterList.size(); i++){
                    ManageBarcodeFilteringVO vo = (ManageBarcodeFilteringVO) filterList.get(i);
                    if ((i & 1) == 0) {
                        out.println("<tr bgcolor=\"#E8E8E8\">");
                    } else {
                        out.println("<tr>");
                    } 
            %>
                    <td class="ColRow"><%= vo.getProductName() %>
                    </td>
                    <td class="ColRow" align="center"><%= vo.getFilteringEnabledAsString() %>
                    </td>
                    <td class="ColRow" align="center"><%= vo.getFilterCreatedOnAsString() %>
                    </td>
                    <td class="ColRow" align="center"><%= vo.getPercentVerified() %>
                    </td>
                    <td class="ColRow tdAlignRight">
                        <%
                            if(vo.isFilteringEnabled()){
                                out.println(JSPHelper.renderImageLink("/district/servlet/handlemanagebarcodefiltersform.do?"+ManageBarcodeFiltersForm.PARAM_SITE_ID+"=" + 
                                    form.getSiteID() + "&"+ManageBarcodeFiltersForm.PARAM_COLLECTION_TYPE_TO_EDIT+"=" + vo.getCollectionType(), 
                                    "/buttons/small/editsmall.gif", 
                                     null, null, ManageBarcodeFiltersForm.ALT_EDIT_FILTER, "absbottom", null));                              
                                out.println(JSPHelper.renderImageLink("/district/servlet/handlemanagebarcodefiltersform.do?"+ManageBarcodeFiltersForm.PARAM_SITE_ID+"=" + 
                                    form.getSiteID() + "&"+ManageBarcodeFiltersForm.PARAM_COLLECTION_TYPE_TO_REMOVE+"=" + vo.getCollectionType(), 
                                    "/buttons/small/remove_70.gif", 
                                     null, null, ManageBarcodeFiltersForm.ALT_REMOVE_FILTER, "absbottom", null));                              
                            } else { 
                                if (form.isOriginalFileExists(vo.getCollectionType())) {
                                        out.println(JSPHelper.renderImageLink("/district/servlet/handlemanagebarcodefiltersform.do?"+ManageBarcodeFiltersForm.PARAM_SITE_ID+"=" + 
                                    form.getSiteID() + "&"+ManageBarcodeFiltersForm.PARAM_COLLECTION_TYPE_TO_RESTORE+"=" + vo.getCollectionType(), 
                                    "/buttons/small/restoresmall.gif", 
                                        null, null, ManageBarcodeFiltersForm.ALT_RESTORE_FILTER, "absbottom", null));  
                                }
                                out.println(JSPHelper.renderImageLink("/district/servlet/presentaddbarcodefilterform.do?siteID="  + 
                                    form.getSiteID() + "&"+ManageBarcodeFiltersForm.PARAM_COLLECTION_TYPE+"=" + vo.getCollectionType(), 
                                    "/buttons/small/filter.gif", 
                                     null, null, ManageBarcodeFiltersForm.ALT_ADD_FILTER, "absbottom", null));  
                            }
                        %>
                    </td>
                </tr>
            <%
                }
            %>
            
            
        </base:outlinedTable>
        </td>
    </tr>
</table>

</base:form>
