<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WPESearchForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.DigitalResourceSearchForm"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>

<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.TitlePeekManager"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.DigitalProviderValue"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%><script language="JavaScript" type="text/javascript">
<!--

    function processCheckboxes(isChecked) {
        var field = document.<%=DigitalResourceSearchForm.FORM_NAME%>.elements
          for (j = 0; j < field.length; j++){
            if (field[j].type == 'checkbox' ) {
                field[j].checked = isChecked;
            }
        }
        return false;

    }

    function openWindow(url,name,features) {
       var win = window.open(url,name,features);
    }
// -->
</script>
 
<%
    DigitalResourceSearchForm form = (DigitalResourceSearchForm)request.getAttribute(DigitalResourceSearchForm.FORM_NAME);
    request.setAttribute("parentFormName", DigitalResourceSearchForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String focusControl = "";
     if ( form.getList() == null && form.getProviders().size() > 0) {
         focusControl = DigitalResourceSearchForm.FIELD_SEARCH_STRING;
     }
     boolean nonResults = form.getProviders().size() > 0 && ( form.getList() == null || form.getList().size() == 0);
    %>

<c:set var="form" value="<%= form %>"/>

<base:form action="/cataloging/servlet/handledigitalresourcesearchform.do" focus="<%=focusControl%>">

<% if (form.getErrors().size() > 0) { %>
    <table width="100%">
        <tr>
            <td>
                <base:messageBox strutsErrors="true"/>
            </td>
        </tr>
    </table>
<% } %>
<% if (nonResults) { %>
<base:outlinedTable id="<%=DigitalResourceSearchForm.TABLE_MAIN%>"  borderColor="#C0C0C0" >
    <% if(form.getList() != null && form.getList().size() == 0) { %>
    <tr>
        <td colspan="3">
            <base:messageBox filterMessage="false" showWarningIcon="false" message="<%=form.getNoResultsMessage()%>"/>
        </td>
    </tr>
    <%} %>

    <tr>
        <td colspan="3" align="center">
            <table width="0%"><%-- force this cell's table to take minimum space for centering purposes --%>
                <tr >
                    <td nowrap class="TableHeading tdAlignRight"> <%=MessageHelper.formatMessage("digitalresourcesearch_FindDigitalResources")%></td>
                    <td align="center" nowrap class="TableHeading">
                        <% if (form.getProviders().size() > 0) { %>
                            <html:text property="<%=DigitalResourceSearchForm.FIELD_SEARCH_STRING%>" size="60"/>
                        <% } %>
                    </td>
                    <td nowrap class="ColRow">
                        &nbsp;<br/>
                        <% if (form.getProviders().size() > 0) { %>
                            <base:genericShowHideButton
                                absbottom="true"    
                                src="/buttons/large/search.gif"
                                alt='<%= MessageHelper.formatMessage("search") %>'
                                name="<%=DigitalResourceSearchForm.BUTTON_SEARCH%>"/>
                        <% } %>
                    </td>
                </tr>
            </table>
        </td>
    </tr>

    <tr>
        <td nowrap colspan="3">
        <img border="0" src="/images/icons/general/line.gif" width="100%" height="1"></td>
    </tr>

    <tr>
        <td>
            <table>
                <tr>
                    <td valign="top">
                    
                        <input type="image" src='<%= UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/selectallicon.gif") %>' onclick="processCheckboxes(true); return false;" width="20" height="15"  border="0" alt='<%= MessageHelper.formatMessage("selectAll") %>' title='<%= MessageHelper.formatMessage("selectAll") %>' name="<%=DigitalResourceSearchForm.BUTTON_SELECT_ALL%>"/> 
                        <input type="image" src='<%= UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/clearallicon.gif") %>' onclick="processCheckboxes(false); return false;" width="17" height="15"  border="0" alt='<%= MessageHelper.formatMessage("clearAll") %>' title='<%= MessageHelper.formatMessage("clearAll") %>' name="<%=DigitalResourceSearchForm.BUTTON_CLEAR_ALL%>"/> 
                    </td>
                    <td   colspan="2" class="TableHeading2"> <%=MessageHelper.formatMessage("digitalresourcesearch_LimitYourSearchTo")%></td>
                </tr>
            </table>
        </td>
    </tr>
   
    <tr>
        <td align="center" colspan="3">
            <table id = "<%=DigitalResourceSearchForm.TABLE_PROVIDERS%>" width="100%" cellpadding="2" cellspacing="0" >
                 <% Iterator<DigitalProviderValue> iter =  form.getProviders().iterator();
                    while(iter.hasNext()){
                    DigitalProviderValue vo = iter.next();
                    %>
                <tr >
                    <td align="center">
                        <% if (vo.isSelected()) { %>
                            <input type="checkbox" name='<%=DigitalResourceSearchForm.FIELD_PROVIDER_ID_PREFIX + vo.getId()+ "_" +  vo.getProviderType()%>' value="on" checked="checked"/>
                        <% } else { %>
                            <input type="checkbox" name='<%=DigitalResourceSearchForm.FIELD_PROVIDER_ID_PREFIX + vo.getId()+ "_" +  vo.getProviderType()%>' value="on"/>
                        <% } %>
                    </td>
                    <td valign="top">
                        <img src="<%=JSPHelper.getDigitalResourcesProviderImageLink(vo, store.getSiteCustomerNumber(), false, TitlePeekManager.IMAGE_APPID_DESTINY)%>"
                            width="50" height="50"
                            alt="<%=ResponseUtils.filter(vo.getName()) %>"
                            title="<%=ResponseUtils.filter(vo.getName()) %>"/>
                     </td>
                    <td class="Instruction tdAlignLeft" valign="middle">
                        <b>
                        <% if (! StringHelper.isEmptyOrWhitespace(vo.getUrl())) { %>
                            <a href="javascript:openWindow('<%= vo.getUrl() %>','dcpi_result','width=800,height=600,scrollbars=1,location=0')">
                            <%=ResponseUtils.filter(vo.getName())%>
                            </a>
                        <% } else { %>
                            <%=ResponseUtils.filter(vo.getName())%>
                        <% } %>
                        </b><%= vo.getDescription() == null ? "" : ": " + ResponseUtils.filter(vo.getDescription())%>
                    </td>
                </tr>
                <% } %>    
            </table>           
        </td>    
    </tr>
    
    <tr>
        <td align="center" colspan="3" class="Instruction">
            <base:image src="/icons/general/selectallicon.gif" width="20" height="15"  alt='<%= MessageHelper.formatMessage("selectAll") %>'/><%=MessageHelper.formatMessage("digitalresourcesearch_SelectAll")%>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <base:image src="/icons/general/clearallicon.gif" width="17" height="15"  alt='<%= MessageHelper.formatMessage("clearAll") %>'/><%=MessageHelper.formatMessage("digitalresourcesearch_ClearAll")%>
        </td>
    </tr>
     <tr>
        <td class="TableHeading" colspan="3">
        <base:imageLine height="1" width="100%" vspace="5" />
        </td>
    </tr>

    <% if (form.canShowDCPISetupLink()) { %>
        <tr>
            <td colspan="3" class="SmallColHeading" align="center" valign="middle">
                <a id="<%= DigitalResourceSearchForm.LINK_SETUP_DCPI%>" href="javascript:openWindow('<%= form.getDCPISetupURL() %>','setup_dcpi','width=800,height=600,scrollbars=1,location=0')">
                    <base:image src="/icons/general/edit.gif" alt='<%= MessageHelper.formatMessage("digitalresourcesearch_SetUpDigitalResources") %>'/>
                    <%=MessageHelper.formatMessage("digitalresourcesearch_SetUpDigitalResourceProviders")%>
                </a>
            </td>
        </tr>
    <% } %>
</base:outlinedTable>

<% } else {
        if (form.getProviders().size() == 0) {
            if (form.canShowDCPISetupLink()) { %>
                <tr>
                    <td colspan="3" class="SmallColHeading" align="center" valign="middle">
                        <a id="<%= DigitalResourceSearchForm.LINK_SETUP_DCPI%>" href="javascript:openWindow('<%= form.getDCPISetupURL() %>','setup_dcpi','width=800,height=600,scrollbars=1,location=0')">
                            <base:image src="/icons/general/edit.gif" alt='<%= MessageHelper.formatMessage("digitalresourcesearch_SetUpDigitalResources") %>'/>
                            <%=MessageHelper.formatMessage("digitalresourcesearch_SetUpDigitalResourceProviders")%>
                        </a>
                    </td>
                </tr>
        <% }
        } else { %>
            <jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />
    
            <html:hidden property="<%=DigitalResourceSearchForm.FIELD_SEARCH_STRING%>"/>
    
             <%Iterator<DigitalProviderValue> iter =  form.getProviders().iterator();
            while(iter.hasNext()){
                DigitalProviderValue vo = iter.next();
                if (vo.isSelected()) {
                %>
                    <html:hidden property='<%=DigitalResourceSearchForm.FIELD_PROVIDER_ID_PREFIX + vo.getId()+ "_" +  vo.getProviderType()%>' value="true"/>
            <%  }
            }
        }
    } %>
    

</base:form>


