<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.util.DestinyConfigProperties" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>


<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag"%>

<%
RemoveProductConfirmationForm form = (RemoveProductConfirmationForm)request.getAttribute(RemoveProductConfirmationForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handleremoveproductconfirmationform.do" 
    focus="<%=RemoveProductConfirmationForm.FIELD_PASSWORD %>" method="post">
<html:hidden property="<%=RemoveProductConfirmationForm.PARAM_COLLECTION_TYPE %>" />
<html:hidden property="<%=RemoveProductConfirmationForm.PARAM_SITE_NAME %>" />
<html:hidden property="<%=RemoveProductConfirmationForm.PARAM_SITE_ID_TO_CHANGE %>" />
<base:outlinedTable borderColor="#C0C0C0" cellspacing="0" cellpadding="3" align="center">
<tr><td align="center" class="ColRowBold"> <%=form.getProductNameToRemove()%> will be removed from <%=form.getSiteName()%>.</td></tr>
<tr><td align="center" class="ColRow">To continue, please enter the district administrator's password: </td></tr>
<tr>
    <td align="center" class="FormLabel">
          Password&nbsp;
          <input type="password" name="<%=RemoveProductConfirmationForm.FIELD_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>         
    </td>
</tr>

<tr>
    <td valign="baseline" align="center" class="ColRow" colspan="2">
        <base:okButton/>
        <base:cancelButton/>
    </td>
</tr>

</base:outlinedTable>

</base:form>
