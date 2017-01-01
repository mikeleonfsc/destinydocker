<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.client.district.servlet.OneSearchDistrictPushForm"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true" />


<jsp:include page="/common/destinyescape.jsp" />
<script language="JavaScript" type="text/javascript">
  <!--
   function openWindow(url,name,features) {
         var win = window.open(url,name,features);
   }
  // -->
</script>
<%
    OneSearchDistrictPushForm form = (OneSearchDistrictPushForm)request.getAttribute(OneSearchDistrictPushForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String pushDownLink = "/district/servlet/handleonesearchdistrictpushform.do?action=push";
%>
<base:form action="/district/servlet/handleonesearchdistrictpushform.do">
    <html:hidden property="<%=OneSearchDistrictPushForm.FIELD_CONFIRM_PUSH %>"/>
    <html:hidden property="<%=OneSearchDistrictPushForm.FIELD_HIDDEN_CONFIG_URL %>" />

    <table border="0" cellspacing="0" cellpadding="3" align="center" width="100%">
        <tr>
            <td align="center">
        <% if (form.isConfirmPush()) { %>
            <base:messageBox showRedBorder="true">
                <tr>
                    <td align = "left" class = "ColRowBold"><base:image src = "/icons/general/caution.gif"/> Databases configured at <%= form.getSelectedSourceSiteName() %> will be pushed to the following sites: (Total Sites: <%= form.getReceivingSiteList().size() %>)
                    </td>
                </tr>
                <tr>
                    <td align = "left" class = "ColRowBold">
                    <%= form.getDisplayableReceivingSiteList() %>
                    </td>
                </tr>
                <tr>
                    <td class = "ColRowBold" align="center"> Databases that have not been configured at <%= form.getSelectedSourceSiteName() %> will not be changed at the receiving sites. 
                    </td>
                </tr>
                <tr>
                    <td align = "center" class = "ColRow">This process cannot be reversed.</td>
                </tr>
                <tr>
                    <td align = "center" class = "ColRow">Are you sure you want to proceed?</td>
                </tr>
                <tr>
                    <td align = "center">
                        <base:yesNo 
                            buttonYesName="<%=OneSearchDistrictPushForm.BUTTON_YES%>"
                            buttonNoName="<%=OneSearchDistrictPushForm.BUTTON_NO%>"
                        />
                    </td>
                </tr>
            </base:messageBox>
        <% } else if (form.isShowPushResults()) { %>
            <base:messageBox showRedBorder="true">
                <tr>
                    <td align = "left" class = "ColRowBold">
                    <%= form.getPushResultsMessages() %>
                    </td>
                </tr>
                <tr>
                    <td align = "center">
                        <base:showHideTag id="onOk">
                            <base:okButton/>
                        </base:showHideTag>
                    </td>
                </tr>
            </base:messageBox>
        <% } %>
        </td>
    </tr>
    <tr>
        <td>
                <base:outlinedTable id="<%=OneSearchDistrictPushForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="95%" cellpadding="3">
                    <tr>
                        <td class="MainHeader tdAlignLeft" colspan="2">Push One Search Database Configuration 
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                        <base:imageLine height="1" width="100%" vspace="5" />
                        </td>
                    </tr>
                    
                     <tr>
                        <td class="ColRow tdAlignLeft"  colspan="2">
                             This feature allows you to configure One Search Databases at a single site and push the configuration to other sites in the 
                             district. Database configurations at the source site will overwrite those configurations at the receiving sites. Databases that
                             have not been configured at the source site will remain unchanged at the receiving sites.

                        </td>
                    </tr>

                    <tr>
                      <td class="ColRowBold" align="right" valign="center" height="27px" >Select Source Site</td>
                      <td class="ColRowBold" align="left" valign="bottom" height="27px"><%=form.getSourceSiteDropDown()%>&nbsp;&nbsp;
                      <span>
                          <a id="<%= OneSearchDistrictPushForm.BUTTON_CONFIGURE%>" href="<%= form.getHiddenConfigUrl() %>">
                          <base:image align="bottom" src="/buttons/large/configure.gif" alt="<%=OneSearchDistrictPushForm.LINK_CONFIGURE_SITE%>"/>
                        </a>
                        </span>
                      </td>
                    </tr>

                    <tr>
                        <td class="ColRowBold" align="right" valign="center">Push Configuration to</td>
                        <td class="ColRowBold" align="left" valign="bottom" height="27px"><%=form.getPushToDropDown()%>
                    </tr>
                    <tr>
                        <td colspan="2">
                        <base:imageLine height="1" width="100%" vspace="5" />
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRow"  colspan="2" align="center">
                        <base:goButton>&nbsp;</base:goButton>
                        </td>
                    </tr>
                    
                    
                </base:outlinedTable>
            </td>
        </tr>
    </table>
</base:form>
