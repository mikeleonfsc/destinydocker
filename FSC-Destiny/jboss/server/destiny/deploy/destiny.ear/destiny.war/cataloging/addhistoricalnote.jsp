<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AddHistoricalNoteForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<base:messageBox strutsErrors="true"/>

<%
    AddHistoricalNoteForm form = (AddHistoricalNoteForm)request.getAttribute(AddHistoricalNoteForm.FORM_NAME);
%>


<base:form action="/cataloging/servlet/handleaddhistoricalnoteform.do" focus="<%= AddHistoricalNoteForm.FIELD_NOTE %>">
<html:hidden property="<%= AddHistoricalNoteForm.PARAM_SINGLE_ID_TO_PRINT %>"/>
<html:hidden property="<%= AddHistoricalNoteForm.PARAM_COPY_ID %>"/>
<html:hidden property="<%= AddHistoricalNoteForm.FIELD_TRAP_ENTER %>"/>
<html:hidden property="<%= AddHistoricalNoteForm.PARAM_BARCODE_TOO_LONG_TO_PRINT %>"/>

<base:outlinedTable id="<%=AddHistoricalNoteForm.TABLE_ADD_NOTE%>" borderColor="#C0C0C0">	
	<tr>
		<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addhistoricalnote_AddHistoricalNote") %></td>
  		<td>
 			<table id="<%=AddHistoricalNoteForm.TABLE_ADD_NOTE_TEXT_BOX%>" border="0" cellpadding="3" cellspacing="0">
 		    	<tr>
		        	<td>
                    <span onKeyPress="return trapEnterKey(event);">
		            	<html:text property='<%= AddHistoricalNoteForm.FIELD_NOTE %>' maxlength="120" size="60"/>
                    </span>
		        	</td>
		        </tr>
		    </table>
	    </td>
	</tr>
	<tr>
        <td align="center" colspan="2" class="ColRowBold">
            <base:showHideTag id="onSave">
     			<table id="<%=AddHistoricalNoteForm.TABLE_ADD_NOTE_BUTTON_HOUSE%>" border="0" cellpadding="3" cellspacing="0">
                    <tr>
        	 			<td class="tdAlignRight">
        	                   <base:genericButton src="/buttons/large/savenote.gif" onclick="hideElementonSave()" alt='<%=MessageHelper.formatMessage("saveNote") %>' name="<%= AddHistoricalNoteForm.BUTTON_SAVE_NOTE %>" />
        		        </td>
        				<td>
        		         	    <base:cancelButton name="<%= AddHistoricalNoteForm.BUTTON_CANCEL %>" />
        				</td>
                    </tr>
    			</table>
            </base:showHideTag>
		</td>
    </tr>
    
</base:outlinedTable>
</base:form>
<script language="JavaScript">
<!--
    function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=AddHistoricalNoteForm.FORM_NAME%>.<%=AddHistoricalNoteForm.FIELD_TRAP_ENTER%>.value = "true";
      }
    }
//-->
</script>
    
