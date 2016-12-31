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
    FindAssetForm form = (FindAssetForm)request.getAttribute(FindAssetForm.FORM_NAME);
%>

<br>

<base:form action="/cataloging/servlet/handlefindassetform.do" focus="<%=FindAssetForm.FIELD_SEARCH_STRING%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=FindAssetForm.BUTTON_TRAP_ENTER%>">

<html:hidden property = "<%= FindAssetForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED %>" />
<html:hidden property = "<%= FindAssetForm.FIELD_DOING_TRANSFER_SEARCH %>" />
<html:hidden property = "<%= form.PARAM_WHERE_WAS_ENTER %>" />
<input type="hidden" name="<%=form.PARAM_ENTER_PRESSED%>" />


<base:outlinedTable id="<%=FindAssetForm.TABLE_MAIN%>" borderColor="#C0C0C0">
        
	    <tr>
	    <td colspan="2" valign="top">
           <table cellpadding="2" cellspacing="0" border="0" width="100%" id="<%=FindAssetForm.TABLE_SEARCH %>">
        	    <tr>
                  <bean:define id="assets" name="cataloging_servlet_FindAssetForm" property="assetTreeOptionList" />
        	      <td class="ColRowBold" valign="bottom" width="10%" nowrap="true">Find&nbsp; 
                            <% if (form.isDisplayDropdown()) { %>
                                
                                    <html:select property="<%=form.FIELD_TEMPLATE_ID%>" onchange="submitOnTemplateChange()">
                                        <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                            <% } else { %>
                                    <%= form.getAssetTreeOptionList().getString(0)%>
                                <html:hidden property="<%= form.FIELD_TEMPLATE_ID %>"/>
                                   
                            <%} %>
                                &nbsp; by
        	      </td>
                  <td class="ColRowBold" nowrap="true" valign="bottom" >
                     <% if (form.isAssetTemplateTextbook()) { %>
                           <%=form.outputTextbookDropdown()%>
                     <% } else { %>
                           <%=form.outputResourceDropdown()%>
                      <%} %>
                     <html:text property="<%= FindAssetForm.FIELD_SEARCH_STRING %>" size="21" onkeypress="return trapEnterKey(event, 0);"/>
                     <base:goButton absbottom="true"/>
        	      </td>
	       
	       	      <td valign="top" class="tdAlignRight">
                    <base:closeButton/>
	              </td>
                </tr>	       
	       
        	    <tr>
        	      <td>&nbsp;</td>
        	      <td class="ColRow"><html:checkbox property="<%= FindAssetForm.FIELD_ONLY_MY_SITE %>"/>Only my resources</td>
        	    </tr>
	       </table>
	    </td>
	    </tr>
        <% if (form.getSearchList() != null && form.getSearchList().size() > 0) { %>
            <tr>
                <td class = "SmallColHeading tdAlignRight" colspan = "3"  nowrap = "nowrap"><%= form.buildPageLinks() %></td>
            </tr>             
        <% } %>
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentSearchList()%>
        </td></tr>
        
        <% if (form.getSearchList() != null && form.getSearchList().size() > 0) { %>
            <tr>
                <td class = "SmallColHeading tdAlignRight" colspan = "3"  nowrap = "nowrap"><%= form.buildPageLinks() %></td>
            </tr>             
        <% } %>

    </base:outlinedTable>
</base:form>

<%-- <%= form.buildJavaScriptForPageChange() %> --%>

<script language="JavaScript" type="text/javascript">
      <!--        
        function trapEnterKey(e, fld) {
          var whichCode = (window.Event) ? e.which : e.keyCode;
          if (whichCode == 13) {
             document.<%=form.FORM_NAME%>.<%=form.PARAM_ENTER_PRESSED%>.value = "true";
             document.<%=form.FORM_NAME%>.<%=form.PARAM_WHERE_WAS_ENTER%>.value=fld;                       
          }
          return whichCode;
        }
        
        
        function submitOnTemplateChange() {
            document.<%=form.FORM_NAME%>.<%=form.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
            document.<%=form.FORM_NAME%>.submit();
        }
      // -->
    </script>
