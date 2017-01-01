<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.SetupDcpiAccessForm"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.DcpiSetupAccessVO"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>

<script language="JavaScript" type="text/javascript">
  <!--
   function openWindow(url,name,features) {
         var win = window.open(url,name,features);
   }
  // -->
</script>

<%
   SetupDcpiAccessForm form = (SetupDcpiAccessForm)request.getAttribute(SetupDcpiAccessForm.FORM_NAME); 
%>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.DigitalResourceSearchForm"%><base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlesetupdcpiaccessform.do">

<base:outlinedTable id="<%=SetupDcpiAccessForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="98%" cellpadding="5" cellspacing="0">
    <tr><td colspan="4" class="TableHeading"><%=MessageHelper.formatMessage("setupdcpiaccess_SetupDigitalResourceAccess") %></td></tr>
    <% 
        List<DcpiSetupAccessVO> list = form.gimmeVOList();
        if ( list.size() == 0 ) { %>
            <tr>
                <td colspan="3" class="SmallColHeading" align="center" valign="middle">
                    <%=MessageHelper.formatMessage("setupdcpiaccess_ThereAreNoDigitalResourceProvidersAvailable")%>
                </td>
            </tr>        
            <tr>
                <td colspan="3" class="SmallColHeading" align="center" valign="middle">
                    <a id="<%= SetupDcpiAccessForm.LINK_SETUP_DCPI%>" href="javascript:openWindow('<%= form.getDCPISetupURL() %>','setup_dcpi','width=800,height=600,scrollbars=1,location=0')">
                        <base:image src="/icons/general/edit.gif" alt="<%=SetupDcpiAccessForm.ALT_SETUP_DCPI%>"/>
                        <%=MessageHelper.formatMessage("setupdcpiaccess_SetUpDigitalResourceProviders") %>
                    </a>
                </td>
            </tr>
        <% } else { %>
            <%if(form.getExpandedSection() != null){%>
                <tr>
                <td class="ColRow">&nbsp;</td>
                <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("setupdcpiaccess_Staff")%></td>
                <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("setupdcpiaccess_Student")%></td>
                <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("setupdcpiaccess_Guest")%></td>
                </tr>
            <%} %>
            <% 
                Iterator<DcpiSetupAccessVO> itr = list.iterator();
                while ( itr.hasNext() ) {
                    DcpiSetupAccessVO vo = itr.next(); %>
                    <base:flipper key="dcpisetup">
                        <% if(vo.getMemberName() != null && vo.getName() == null){ %>
                            <td class="ColRowBold" colspan="4">
                                <%=form.getCollapsibleControls(vo.getMemberGUID(), vo.getMemberGUID().equals(form.getExpandedSection()) ) %>                    
                                <%=ResponseUtils.filter(vo.getMemberName()) %>
                            </td>
                        <%}else{%>
                        <%=JSPHelper.renderHidden(SetupDcpiAccessForm.FIELD_HIDDEN_GUID, vo.getGUID()) %>
                        <%if(vo.getMemberGUID().equals(form.getExpandedSection())){%>
                            <td class="ColRowBold">&nbsp;&nbsp;&nbsp;<%=ResponseUtils.filter(vo.getName()) %>
                            <td class="ColRowBold" align="center"><%=JSPHelper.renderCheckbox(SetupDcpiAccessForm.FIELD_PREFIX_STAFF + vo.getGUID(), vo.isAllowStaff())%>
                            <td class="ColRowBold" align="center"><%=JSPHelper.renderCheckbox(SetupDcpiAccessForm.FIELD_PREFIX_STUDENT + vo.getGUID(), vo.isAllowStudent())%>
                            <td class="ColRowBold" align="center"><%=JSPHelper.renderCheckbox(SetupDcpiAccessForm.FIELD_PREFIX_GUEST + vo.getGUID(), vo.isAllowGuest())%>
                            <%}else{ %>
                            <%=JSPHelper.renderHidden(SetupDcpiAccessForm.FIELD_PREFIX_STAFF + vo.getGUID(), new Boolean(vo.isAllowStaff())) %>
                            <%=JSPHelper.renderHidden(SetupDcpiAccessForm.FIELD_PREFIX_STUDENT + vo.getGUID(), new Boolean(vo.isAllowStudent())) %>
                            <%=JSPHelper.renderHidden(SetupDcpiAccessForm.FIELD_PREFIX_GUEST + vo.getGUID(), new Boolean(vo.isAllowGuest())) %>
                            <% } %>
                        <%} %>
                    
                    </base:flipper>
            <%
            }
            %>
                
            <tr><td colspan="4"><base:imageLine/></td></tr>
            
            <tr>
                <td colspan="4" align="center">
                    <base:showHideTag>
                        <base:saveButton onclick="hideElement()"/><base:cancelButton/>
                    </base:showHideTag>
                </td>
            </tr>
        
        <% } %>
    
    

</base:outlinedTable>

</base:form>
