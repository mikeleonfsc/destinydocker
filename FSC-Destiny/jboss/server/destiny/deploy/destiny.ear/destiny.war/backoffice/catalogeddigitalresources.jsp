<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.CatalogedDigitalResourcesForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.DigitalContentProviderVO"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
   CatalogedDigitalResourcesForm form = (CatalogedDigitalResourcesForm)request.getAttribute("backoffice_servlet_CatalogedDigitalResourcesForm"); 
%>


<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.DigitalContentProviderCountVO"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.YesNoTag"%>



<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.AEDigitalResourcesForm"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handlecatalogeddigitalresourcesform.do">

    <%if(form.isClickDeleteDigitalResource()){ %>
        <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=YesNoTag.BUTTON_NAME_NO%>">
        <html:hidden property="<%=CatalogedDigitalResourcesForm.PARAM_DIGITAL_RESOURCE_ID %>"/>    
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("catalogeddigitalresources_AreYouSureYouWantToDelete", ResponseUtils.filter(form.gimmeVendorName()))%></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>   
    <% } %>
<base:outlinedTable id="<%=CatalogedDigitalResourcesForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="100%">

    <tr>
        <td colspan="1" class="TableHeading" nowrap>
            <%=MessageHelper.formatMessage("catalogeddigitalresources_DistrictCatalogedDigitalResources") %>
        </td>
        <td class="tdAlignRight">
           <base:link id="<%=CatalogedDigitalResourcesForm.ID_BUTTON_ADD%>" page="/backoffice/servlet/presentaedigitalresourcesform.do">
               <base:image src="/buttons/large/add.gif" alt='<%=MessageHelper.formatMessage("catalogeddigitalresources_AddDigitalResource")%>'/>
           </base:link>
        </td>
    </tr>
    <tr>
        <td colspan="2" width="100%">
            <table id="<%=CatalogedDigitalResourcesForm.TABLE_DIGITAL_RESOURCES%>" width="100%" cellpadding="2" cellspacing="0">
            <%if(form.getDcpc() != null && form.getDcpc().size() > 0) {%>
                <tr>
                    <td colspan="3" width="100%"><base:imageLine/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("catalogeddigitalresources_Provider") %></td>
                    <td class="tdAlignRight">&nbsp;</td>
                </tr>
                <%Iterator<DigitalContentProviderCountVO> iter =  form.getDcpc().iterator();
                while(iter.hasNext()){
                    DigitalContentProviderCountVO vo = iter.next();
                    %>
                    <base:flipper key="key">
                    <td><%=form.gimmeImagePath(vo.getDigitalContentProviderVO()) %></td>
                    <td class="ColRow"><%=ResponseUtils.filter(vo.getDigitalContentProviderVO().getName())%></td>
                    <td class="tdAlignRight" nowrap="nowrap">
                        <base:link page='<%= "/backoffice/servlet/presentaedigitalresourcesform.do?" + AEDigitalResourcesForm.FIELD_DIGITAL_CONTENT_PROVIDER_ID + "=" + vo.getDigitalContentProviderVO().getDigitalContentProviderID() %>'>
                            <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("catalogeddigitalresources_Edit0", ResponseUtils.filter(vo.getDigitalContentProviderVO().getName())) %>'/>
                        </base:link>
                        &nbsp;
                        <base:link page='<%= form.gimmeDeleteDigitalResourcesLink(vo.getDigitalContentProviderVO().getDigitalContentProviderID())%>'>
                            <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("catalogeddigitalresources_Delete0", ResponseUtils.filter(vo.getDigitalContentProviderVO().getName()))%>'/>
                        </base:link>                    
                    </td>
                    </base:flipper>
                <% } %>               
                <tr>
                    <td colspan="3" width="100%"><base:imageLine/></td>
                </tr>
                <tr>
                    <td align="center" colspan="3">
                        <%
                        int buttons[] = new int[] {HelpIconsTag.ICON_EDIT_PROVIDER, HelpIconsTag.ICON_DELETE_PROVIDER};
                        %>                
                        <base:helpIcons buttonsToOutput="<%=buttons%>"></base:helpIcons>
                    </td>
                </tr>
                <tr><td colspan="3">&nbsp;</td></tr>
                <tr>
                    <td colspan="3" class="Instruction" align="center"><%=form.gimmeLastRunInformation()%></td>
                </tr>
            <%} else {%>
                <tr>
                    <td class="ColRowBold" align="center" width="100%"><%=MessageHelper.formatMessage("catalogeddigitalresources_NoDigitalCatalogedResources") %></td>
                </tr>
            <%} %>

            </table>  
        </td> 
    </tr>
</base:outlinedTable>
</base:form>

