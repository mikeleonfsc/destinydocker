<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.data.HomeroomAEDValue"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HomeroomSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.YesNoTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
	HomeroomAEDForm form = (HomeroomAEDForm)request.getAttribute(HomeroomAEDForm.FORM_NAME);
    String focusField = (form.getDeleteHomeroomID() != null) ? YesNoTag.BUTTON_NAME_NO : HomeroomAEDForm.FIELD_DESCRIPTION;
%>


<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=HomeroomAEDForm.FORM_NAME%>.<%=HomeroomAEDForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>

<base:form action="/backoffice/servlet/handlehomeroomaedform.do" focus="<%= focusField%>">

    <html:hidden property="<%= HomeroomAEDForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
    <html:hidden property="<%= HomeroomAEDForm.FIELD_FROM_NAV %>" />

    <logic:equal name="<%= HomeroomAEDForm.FORM_NAME %>" property="action" value="<%= HomeroomAEDForm.ACTION_DELETE %>">
        <html:hidden property="<%= HomeroomAEDForm.FIELD_DELETE_HOMEROOM_ID %>"/>
            <%String reassignMessage = form.getReassignMessageText(); %>
            <base:messageBox  showRedBorder="<%=!StringHelper.isEmpty(reassignMessage) %>">
                <% if (!StringHelper.isEmpty(reassignMessage) ) { %>
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("homeroomaed_HomeroomWillBeDeleted", ResponseUtils.filter(form.getNameToDelete())) %></td>
                </tr>
                <tr>
                    <td> &nbsp;</td>
                    <bean:define id="associatedList" name="<%= HomeroomAEDForm.FORM_NAME %>" 
                        property="<%= HomeroomAEDForm.FIELD_REASSIGN_LIST %>"/>
    
                    <td class="ColRowBold" align="center">
                        <%= reassignMessage %>
                        <BR><%= MessageHelper.formatMessage("homeroomaed_ChangeTheHomeroomTo") %>&nbsp;
                        <html:select property="<%= HomeroomAEDForm.FIELD_REASSIGN_TO_ID %>">
                            <html:options collection="associatedList" property="homeroomID" labelProperty="homeroomName"/>
                        </html:select>
                    </td>
                </tr>
                <%} %>
                
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("homeroomaed_AreYouSureYouWantToDelete", ResponseUtils.filter(form.getNameToDelete())) %></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" align="center" class="ColRow">
                        <base:yesNo 
                            buttonYesName="<%=HomeroomAEDForm.BUTTON_CONFIRM_DELETE%>"
                        />
                    </td>
                </tr>
            </base:messageBox>

    </logic:equal>



<%-- 
	The following code adjust the alignment of the table when 
	displayed from a location that doesn't support the level2menu.
--%>
<base:outlinedTable id="<%=HomeroomAEDForm.TABLE_MAIN%>" borderColor="#C0C0C0" 
    width="95%">
    <html:hidden property="<%=HomeroomAEDForm.FIELD_HOMEROOM_ID %>"/>
    <html:hidden property="<%=HomeroomAEDForm.FIELD_SELECTED_PATRONID %>"/>
    <tr>
        <td>
            <table id="<%=HomeroomAEDForm.TABLE_EDIT %>" width="100%" cellpadding="3" cellspacing="0">
            <tr>
                <td class="ColRowBold tdAlignRight">
				<logic:equal name="<%= HomeroomAEDForm.FORM_NAME %>" property="editing" value="false"><%= MessageHelper.formatMessage("homeroomaed_AddHomeroom") %>&nbsp;</logic:equal>
				<logic:equal name="<%= HomeroomAEDForm.FORM_NAME %>" property="editing" value="true"><%= MessageHelper.formatMessage("homeroomaed_EditHomeroom") %>&nbsp;</logic:equal>
				</td>
				
				<td>
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%= HomeroomAEDForm.FIELD_DESCRIPTION %>" size="40" maxlength='<%= ""+HomeroomSpecs.LENGTH_HOMEROOM %>'/>
                </span>
                </td>
                
                <td align="center" class="ColRowBold">
                    <base:showHideTag id="onSave">                    
                        <base:saveButton absbottom="true"/>
                    	&nbsp;
                        <logic:notEqual name="<%= HomeroomAEDForm.FORM_NAME %>" property="<%= HomeroomAEDForm.FIELD_FROM_NAV %>" value="Y">
                            <base:genericButton absbottom="true" alt='<%= MessageHelper.formatMessage("close") %>' name="<%=HomeroomAEDForm.BUTTON_CLOSEX%>" src="/buttons/large/closex.gif" />
                        </logic:notEqual>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
              <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("homeroomaed_Supervisor") %></td>
              <td colspan="2">
                <table id="<%=HomeroomAEDForm.TABLE_SELECTED_PATRON%>">
                    <tr>
                    <td class="ColRow">
                      <%=ResponseUtils.filter(form.getSelectedPatronName()) %>
                    </td>
                    <td class="ColRow">
                      <base:genericButton alt='<%= MessageHelper.formatMessage("select") %>' name="<%=HomeroomAEDForm.BUTTON_SELECT%>" src="/buttons/large/selectplus.gif" />
                      <logic:present name="<%= HomeroomAEDForm.FORM_NAME %>" property="selectedPatronID">
                      &nbsp;&nbsp;
                      <base:genericButton alt='<%= MessageHelper.formatMessage("clear") %>' name="<%=HomeroomAEDForm.BUTTON_CLEAR%>" src="/buttons/large/clear.gif" />
                      </logic:present>
                    </td>
                    </tr>
                 </table>
              </td>
           </tr>
           </table>
       </td>
   </tr>
              
<tr>
    <td width="100%">
        <base:imageLine height="1" width="100%"/>
    </td>
</tr>

<tr>
	<td class="TableHeading"><%= MessageHelper.formatMessage("homeroomaed_CurrentHomerooms") %></td>
</tr>

<tr><td>
    <table id=<%= HomeroomAEDForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
    <%
    //List is a list of value objects
    Collection list = form.getResultList();
    if ( list.size() == 0) { %>
        <tr>
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("homeroomaed_ThereAreNoHomerooms") %></td>
        </tr>
           
    <% } else {
        Iterator iter = ObjectHelper.getIterator(list);
    %>
        <tr>
            <td class="SmallColHeading"><%= MessageHelper.formatMessage("homeroomaed_Homeroom") %></td>
            <td class="SmallColHeading"><%= MessageHelper.formatMessage("homeroomaed_Supervisor") %></td>
            <td class="SmallColHeading"><%= MessageHelper.formatMessage("homeroomaed_Email1") %></td>
            <td class="SmallColHeading"><%= MessageHelper.formatMessage("homeroomaed_Email2") %></td>
            <td class="SmallColHeading">&nbsp;</td>
        </tr>
            
        
    <%
        while (iter.hasNext()) {
            HomeroomAEDValue value = (HomeroomAEDValue) iter.next();
        %>
        <base:flipper key="HomeroomAED">
                <td class="ColRow"><%= ResponseUtils.filter(value.getHomeroomName())%></td>
    			<td class="ColRow"><%= ResponseUtils.filter(value.getPatronName())%></td>
    			<td class="ColRow"><%=ResponseUtils.filter(value.getPatronEmail1())%></td>
                <td class="ColRow"><%= ResponseUtils.filter(value.getPatronEmail2())%></td>
                <td class="ColRow tdAlignRight">
                    <base:link page='<%= "/backoffice/servlet/handlehomeroomaedform.do?action=" 
                        +  HomeroomAEDForm.ACTION_EDIT + "&homeroomID=" + value.getHomeroomID()%>' id="<%=HomeroomAEDForm.ID_PREFIX_EDIT + value.getHomeroomID() %>">
                        <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("homeroomaed_Edit", ResponseUtils.filter(value.getHomeroomName())) %>' />
                    </base:link>
                    &nbsp;
                    <base:link page='<%= "/backoffice/servlet/handlehomeroomaedform.do?action=" 
                        +  HomeroomAEDForm.ACTION_DELETE + "&homeroomID=" + value.getHomeroomID() %>' id="<%=HomeroomAEDForm.ID_PREFIX_DELETE + value.getHomeroomID() %>">
                        <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("homeroomaed_Delete", ResponseUtils.filter(value.getHomeroomName())) %>' />
                    </base:link>
                </td>
          </base:flipper>
        <% } %>
    <% } %>
        </table>
    </td>
</tr>
</base:outlinedTable>
</base:form>
