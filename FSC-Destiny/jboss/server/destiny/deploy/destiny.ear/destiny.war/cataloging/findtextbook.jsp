<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>


<base:messageBox strutsErrors="true"/>

<%
    FindTextbookForm form = (FindTextbookForm)request.getAttribute(FindTextbookForm.FORM_NAME);
%>

<br>

<base:form action="/cataloging/servlet/handlefindtextbookform.do" focus="<%=FindTextbookForm.FIELD_SEARCH_STRING%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=FindTextbookForm.BUTTON_TRAP_ENTER%>">

<html:hidden property="<%=FindTextbookForm.PARM_CURRENT_SEARCH_STRING%>"/>
<html:hidden property="<%=FindTextbookForm.PARM_CURRENT_SEARCH_TYPE%>"/>


<base:outlinedTable id="<%=FindTextbookForm.TABLE_MAIN%>" borderColor="#C0C0C0">
        
	    <tr>
	    <td colspan="2" valign="top">
           <table cellpadding="2" cellspacing="0" border="0" width="100%" id="<%=FindTextbookForm.TABLE_SEARCH %>">
        	    <tr>
        	      <td class="ColRowBold" valign="top" width="10%" nowrap>Find Textbook</td>
        	      
                  <td valign="top" class="ColRowBold" >
                     <html:text property="<%= FindTextbookForm.FIELD_SEARCH_STRING %>"  size="21"/>
                     in 
                     <%=form.outputTextbookDropdown()%>
                     <base:goButton absbottom="true"/>
        	      </td>
	       
	       	      <td valign="top" class="tdAlignRight">
                    <base:closeButton/>
	              </td>
                </tr>	       
	       
        	    <tr>
        	      <td>&nbsp;</td>
        	      <td class="ColRow"><html:checkbox property="<%= FindTextbookForm.FIELD_ONLY_MY_SITE %>"/>Only my textbooks</td>
        	    </tr>
	       </table>
	    </td>
	    </tr>
        
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentSearchList()%>
        </td></tr>

    </base:outlinedTable>
</base:form>


