<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="java.util.Iterator"%>


<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.common.StringStringLookup"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.data.SubfieldEditContainer"%>

<base:messageBox strutsErrors="true"/>

<%
    BibliographicTagEditForm form = (BibliographicTagEditForm)request.getAttribute( BibliographicTagEditForm.FORM_NAME );
%>

<base:form action="/cataloging/servlet/handlebibliographictageditform.do">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=BaseTagEditForm.TRAP_ENTER_KEY %>">

<base:outlinedTable borderColor="#c0c0c0" width="95%">
<tr>
   <td>
        <jsp:include page="/cataloging/basetagedit.jsp">
            <jsp:param name="formName" value="<%= BibliographicTagEditForm.FORM_NAME %>"/>
            <jsp:param name="bibTag" value="true"/>
        </jsp:include>
  </td>
</tr>
</base:outlinedTable>

</base:form>
