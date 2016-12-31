<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>                
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<%@page import="com.follett.fsc.destiny.util.DestinySystemProperties"%><base:messageBox strutsErrors="true"/>

<%
    GeneralPurposeTestingForm form = (GeneralPurposeTestingForm)request.getAttribute(GeneralPurposeTestingForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>


<jsp:include page="/common/destinyescape.jsp" />
<script language="JavaScript" type="text/javascript">
  <!--
  function generateDeepLink() {
      //Set the variables dynamically based on the current values on the form
      var ctrlnum = document.backoffice_servlet_GeneralPurposeTestingForm.ctrlNumber.value;
      var ctxName = document.backoffice_servlet_GeneralPurposeTestingForm.ctxName.value;
      //Build the URL based on the fields in the form
      var url = '/rest/sysctrl/search/?ctrlnum=' + destinyEscape(ctrlnum) + '&contextName=' + ctxName;

      //Open the new window
      window.open(url, '_marcView').focus();                   
  }
  // -->
</script>


<base:form action="/backoffice/servlet/handlegeneralpurposetestingform.do">
    <html:hidden property="<%= GeneralPurposeTestingForm.FIELD_CTX_NAME %>"/>
    <base:outlinedTable width="100%" id="<%=GeneralPurposeTestingForm.TABLE_DEEP_LINK_INFO %>">
        <tr>
           <td>
              Settings for VALID_SYSTEM_CONTROL_PREFIXES = <%=form.gimmeControlPrefixes() %>
           </td>
        </tr>
        <tr>
           <td>
              Settings for SYSTEM_CONTROL_SEARCH_SITE_SHORT_NAMES = <%=form.gimmeSupportedControlSiteShortNames() %>
           </td>
        </tr>
        <tr>
           <td>
              <b>Download Deep Linked MARC record</b>
           </td>
        </tr>
        <tr>
            <td class="ColRow">
                Perform deep link search for 
                <html:text property="<%=GeneralPurposeTestingForm.FIELD_CTRL_NUMBER%>" size="20" maxlength="50"/>
                &nbsp;
                <a href="javascript:generateDeepLink()">
                <base:image align="absbottom" src="/buttons/large/go.gif" alt="Go" name="Go"/>
                </a>
            </td>
        </tr>
        <tr>
           <td>
              <b>View Deep Linked MARC record</b>
           </td>
        </tr>
        <tr>
            <td class="ColRow">
                Perform deep link search for 
                <html:text property="<%=GeneralPurposeTestingForm.FIELD_SEARCH_NUMBER%>" size="20" maxlength="50"/>
                and view record.&nbsp;
                <base:goButton/>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
               <%=form.renderOutMarcRecord()%>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
