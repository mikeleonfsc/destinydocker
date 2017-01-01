<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>




<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>



<%
	ComponentListForm form = (ComponentListForm)request.getAttribute(ComponentListForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<base:form action="/cataloging/servlet/handlecomponentlistform.do">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    
    <table id="<%=ComponentListForm.TABLE_MAIN%>" cellpadding="3" cellspacing="0" width="100%">
        <tr>
            <td align="center" class="TableHeading">
                <c:out value="<%=form.getBibTitle()%>"/>
            </td>
        </tr>
        <tr>
            <td align="center">
                <img src="/images/icons/general/line.gif" height="2" width="95%">
            </td>
        </tr>
        <tr>
            <td align="center"> 
                 <base:textbookComponentKit inMessageBox="false" componentList="<%=form.getComponentList() %>"/>
            </td>
        </tr>
        
    
    </table>
</base:form>
