<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.HoldNoticesForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.HoldNoticesReportJobParams" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>

<base:messageBox strutsErrors="true"/>

<bean:define id="sortIDs" name="<%=HoldNoticesForm.FORM_NAME%>" property="sortedIDList"/>

<%
    HoldNoticesForm form = (HoldNoticesForm) request.getAttribute(HoldNoticesForm.FORM_NAME);
%>

<script type="text/javascript">
// <![CDATA[
function display(obj,id1,id2) {
    txt = obj.options[obj.selectedIndex].value;
    document.getElementById(id1).style.display = 'none';
    document.getElementById(id2).style.display = 'none';
    
    if ( txt.match(<%=HoldNoticesReportJobParams.OPTION_HOMEROOM%>) ) {
       document.getElementById('display_homeroom').style.display = 'block';
       document.getElementById('print_homeroom').style.display = 'none';
       document.getElementById('printHomeRoom').checked = false;
    } else {
       document.getElementById('display_nonhomeroom').style.display = 'block';
       document.getElementById('print_homeroom').style.display = 'table-row';
    }
}

function newdistribution() {
    document.forms["<%=HoldNoticesForm.FORM_NAME%>"].elements["<%=HoldNoticesForm.FIELD_SEND_TO_EMAIL_1%>"].value = true; // default = send to email1
	document.<%=HoldNoticesForm.FORM_NAME%>.submit();    	
}

function toggleHomeroomRow()
{
    document.<%=HoldNoticesForm.FORM_NAME%>.submit();       
}
    
// ]]>
</script>    

<base:form action="/backoffice/servlet/handleholdnoticesform.do">

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" alt="" value="true"  name="trapEnterKey">
<html:hidden property="<%=HoldNoticesForm.PARAM_ALLOW_EMAIL%>"/>

<base:outlinedTable id="<%=HoldNoticesForm.TABLE_OUTLINE%>" borderColor='#C0C0C0'>
<tr>
<td>
<table id="<%=HoldNoticesForm.TABLE_HOLD_NOTICES%>">
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap><%=MessageHelper.formatMessage("holdnotices_SelectAmpSortBy")%></td>
        <td class="ColRow"  colspan="2">
        <table id="<%=HoldNoticesForm.TABLE_SELECT_BY_HOUSE%>">
        <tr>
        <td>
            <html:select onchange="display(this,'display_homeroom','display_nonhomeroom');" property="groupByField">
                <html:options collection="sortIDs" property="stringCode"
                    labelProperty="stringDesc"/>
            </html:select>
            
        <td id="display_nonhomeroom" style="<%=form.gimmeHomeroomDisplay(false)%>" nowrap>&nbsp;<%=MessageHelper.formatMessage("holdnotices_From")%>&nbsp;<html:text property="<%=HoldNoticesForm.FIELD_RANGE_FROM%>" size="9" maxlength="<%=HoldNoticesForm.LENGTH_RANGE_FIELD%>"/>
                    &nbsp;<%=MessageHelper.formatMessage("holdnotices_To")%>&nbsp;
                    <html:text property="<%=HoldNoticesForm.FIELD_RANGE_TO%>" size="9" maxlength="<%=HoldNoticesForm.LENGTH_RANGE_FIELD%>"/>
        </td>
        
        
        <td id="display_homeroom" style="<%=form.gimmeHomeroomDisplay(true)%>" class="ColRow" nowrap>&nbsp;<%=MessageHelper.formatMessage("holdnotices_From")%>&nbsp;
        <base:homeroomBySiteDropDown 
        currentSelection="<%=form.getHomeroomIDFrom() %>"
        showOnlyAssignedHomerooms="true"
        displayNameForNoHomeroom='<%=MessageHelper.formatMessage("holdnotices_AnyHomeroom") %>'
        fieldName="<%=HoldNoticesForm.FIELD_HOMEROOM_ID_FROM %>"/>
        
                    &nbsp;<%=MessageHelper.formatMessage("holdnotices_To")%>&nbsp;
        <base:homeroomBySiteDropDown 
        currentSelection="<%=form.getHomeroomIDTo() %>"
        showOnlyAssignedHomerooms="true"
        displayNameForNoHomeroom='<%=MessageHelper.formatMessage("holdnotices_AnyHomeroom") %>'
        fieldName="<%=HoldNoticesForm.FIELD_HOMEROOM_ID_TO %>"/>
        </td>            
    </tr>
</table>
</td>
    </tr>
    
    <tr id="print_homeroom" <%=form.getGroupByField().equals("7") ? "style=\'display:none\'" : ""%>>
        <td>&nbsp;</td>
        <td class="ColRow" colspan=2>
            <html:checkbox property="<%=HoldNoticesForm.FIELD_PRINT_HOMEROOM%>" styleId="<%=HoldNoticesForm.FIELD_PRINT_HOMEROOM%>">Print Homeroom</html:checkbox>
        </td>
    </tr>
    <tr>    
        <td>&nbsp;</td>
        <td class="ColRow" colspan="2">
            <html:checkbox property="<%=HoldNoticesForm.FIELD_DISPLAY_TITLE%>"><%=MessageHelper.formatMessage("holdnotices_DisplayTitleForLibraryMaterials") %></html:checkbox>
        </td>
    </tr>    
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("holdnotices_Message")%></td>
        <td class="ColRow" colspan="2" nowrap>
           <html:text property="<%=HoldNoticesForm.FIELD_SALUTATION%>" size="9" maxlength="32"/>&nbsp;<%=MessageHelper.formatMessage("holdnotices_PatronsName")%></td>
    </tr>
    <tr>
        <td class="ColRow">&nbsp;</td>
        <td class="ColRow" colspan="2"> <%-- message is 1024 MAX --%>
            <html:textarea property="<%=HoldNoticesForm.FIELD_MESSAGE%>" rows="4" cols="40"/>
        </td> 
    </tr>
<logic:equal name="<%=HoldNoticesForm.FORM_NAME%>" property="<%=HoldNoticesForm.PARAM_ALLOW_EMAIL%>" value="true">
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("holdnotices_Distributed")%></td>
        <td colspan="2" class="ColRow">
            <table id='<%=HoldNoticesForm.TABLE_DISTRIBUTED%>'>
                <tr>
                    <td colspan="3">
                        <html:radio onclick="newdistribution()" property="<%=HoldNoticesForm.FIELD_DISTRIBUTED%>" value='<%="" + HoldNoticesReportJobParams.DISTRIBUTE_INTERNALLY%>'/><%=MessageHelper.formatMessage("holdnotices_Internally")%><br>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">           
                        <html:radio onclick="newdistribution()" property="<%=HoldNoticesForm.FIELD_DISTRIBUTED%>" value='<%="" + HoldNoticesReportJobParams.DISTRIBUTE_EMAIL%>'/><%=MessageHelper.formatMessage("holdnotices_ViaEmail")%>
                    </td>                  
                </tr>
                
            <logic:equal name="<%=HoldNoticesForm.FORM_NAME%>" property="<%=HoldNoticesForm.FIELD_DISTRIBUTED%>" value="1">
                   <tr>
                    <td class="tdAlignLeft" colspan=3>
                        <b><%=MessageHelper.formatMessage("holdnotices_ProvideSenderInformation")%></b>
                    </td>
                   </tr>
                  
                   <tr>
                       <td class="tdAlignRight"><%=MessageHelper.formatMessage("holdnotices_DisplayName")%></td>
                       <td colspan=2><html:text property="<%=HoldNoticesForm.FIELD_REPLY_TO_DISPLAY_NAME%>" size="30" maxlength="128"/></td>
                   </tr>
                   <tr>
                       <td class="tdAlignRight"><%=MessageHelper.formatMessage("holdnotices_Email")%></td>
                       <td >
                            <html:text property="<%=HoldNoticesForm.FIELD_REPLY_TO_EMAIL%>" size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' />
                       </td>
                       <td>
                            <base:genericButton src="/buttons/large/testemail.gif" name="<%= HoldNoticesForm.BUTTON_NAME_TEST_EMAIL %>" alt='<%= MessageHelper.formatMessage("testEmail") %>' absbottom="false"/>
                         &nbsp;<base:helpTag helpFileName="d_email_sender_info.htm"/>
                       </td>
                   </tr>
                   
                   <tr>
                       <td class="tdAlignRight" valign="top"><%=MessageHelper.formatMessage("holdnotices_SendTo")%></td>
                       <td class="tdAlignLeft" valign="top">
                           <table id="<%=HoldNoticesForm.TABLE_RECIPIENT%>" border="0" cellpadding="0" cellspacing="0">
                               <tr><td><html:checkbox property="<%=HoldNoticesForm.FIELD_SEND_TO_EMAIL_1%>" ><%=MessageHelper.formatMessage("holdnotices_Email1")%></html:checkbox></td></tr>
                               <tr><td><html:checkbox property="<%=HoldNoticesForm.FIELD_SEND_TO_EMAIL_2%>" ><%=MessageHelper.formatMessage("holdnotices_Email2")%></html:checkbox></td></tr>
                               <% if( form.isShowHomerooms() ) { %>
                               <tr>
                                    <td valign="top"><html:checkbox onclick="toggleHomeroomRow()" property="<%=HoldNoticesForm.FIELD_SEND_TO_HOMEROOM%>" ><%=MessageHelper.formatMessage("holdnotices_Homeroom")%></html:checkbox></td>
                               </tr>
                                   <% if( form.isSendToHomeroom() ) { %>
                                   <tr>
                                       <td style="padding-left: 1.5em;"><%=form.getSelectedHomerooms()%></td>
                                   </tr>
                                   <% } %>
                               <% } else { %>
                                    <tr><td><%=MessageHelper.formatMessage("HoldNoticesForm_NoHomeroomsAvailable")%>
                                    </td></tr>                               
                               <% } %>
                           </table>
                       </td>
                       <td valign="top">
                          <% if( form.isSendToHomeroom() ) { %>
                          <table>
                          <tr><td>&nbsp;</td></tr>
                          <tr><td>&nbsp;</td></tr>
                          <tr><tr><td>
                            <base:genericButton absbottom="false" name="<%=HoldNoticesForm.BUTTON_UPDATE%>" src="/buttons/large/update.gif" alt='<%=MessageHelper.formatMessage("update") %>'/>
                          </td></tr>
                          </table>
                          <% } %>
                       </td>
                   </tr>
                </logic:equal>
<logic:equal name="<%=HoldNoticesForm.FORM_NAME%>" property="<%=HoldNoticesForm.FIELD_DISTRIBUTED%>" value="0">
    <html:hidden property="<%=HoldNoticesForm.FIELD_SEND_TO_EMAIL_1%>"/>
</logic:equal>                   
           </table>
        </td>
    </tr>
    </logic:equal>

<logic:equal name="<%=HoldNoticesForm.FORM_NAME%>" property="<%=HoldNoticesForm.PARAM_ALLOW_EMAIL%>" value="false">
    <html:hidden property="<%=HoldNoticesForm.FIELD_DISTRIBUTED%>"/>
</logic:equal>

    
    <tr>
      <td colspan="3" align="center" class="ColRow">
          <base:noticeButton/>
      </td>
    </tr>
</table>
</td>
</tr>
</base:outlinedTable>
</base:form>
