<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyEditQuickPickAEDForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickVO" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%
	CopyEditQuickPickAEDForm form = (CopyEditQuickPickAEDForm )request.getAttribute(CopyEditQuickPickAEDForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>


<base:form action="/cataloging/servlet/handlecopyeditquickpickaedform.do" focus="<%= CopyEditQuickPickAEDForm.FIELD_DESCRIPTION %>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true">
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    
    
    <logic:equal name="<%= CopyEditQuickPickAEDForm.FORM_NAME %>" property="action" value="<%= CopyEditQuickPickAEDForm.ACTION_DELETE %>">
        <html:hidden property="<%= CopyEditQuickPickAEDForm.FIELD_QUICKPICK_ID %>"/>	   
	    
        <base:messageBox showRedBorder="true">
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center"><%=form.getDeleteMessage()%></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo 
                    buttonYesName="<%=CopyEditQuickPickAEDForm.BUTTON_CONFIRM_DELETE%>"
                />
            </td>
        </tr>
   		</base:messageBox>
   	

    </logic:equal>
    

<!-- If I am editing, I need a hidden field -->
    <html:hidden property="<%=CopyEditQuickPickAEDForm.PARAM_CONTROL_NUM %>"/>
    <html:hidden property="<%=CopyEditQuickPickAEDForm.PARAM_COPY_EDIT_SITE_ID %>"/>
<logic:equal name="<%= CopyEditQuickPickAEDForm.FORM_NAME %>" property="editing" value="true">
    <html:hidden property="<%=CopyEditQuickPickAEDForm.FIELD_QUICKPICK_ID%>"/>
</logic:equal>
<%-- 
	The following code adjust the alignment of the table when 
	displayed from a location that doesn't support the level2menu.
--%>

<logic:equal name="<%= CopyEditQuickPickAEDForm.FORM_NAME %>" property="showAddEditControls" value="false">
    <html:hidden property="<%=CopyEditQuickPickAEDForm.FIELD_DESCRIPTION%>"/>
</logic:equal>
<logic:equal name="<%= CopyEditQuickPickAEDForm.FORM_NAME %>" property="showAddEditControls" value="true">
<tr>
    <td>
        <table id=<%= CopyEditQuickPickAEDForm.TABLE_EDIT %> width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td class="ColRowBold tdAlignRight">
				<logic:equal name="<%= CopyEditQuickPickAEDForm.FORM_NAME %>" property="editing" value="false">
                	<%= MessageHelper.formatMessage("copyeditquickpickaed_Add", form.getModeName())%>&nbsp;
				</logic:equal>
				<logic:equal name="<%= CopyEditQuickPickAEDForm.FORM_NAME %>" property="editing" value="true">
	                <%= MessageHelper.formatMessage("copyeditquickpickaed_Edit", form.getModeName())%>&nbsp;
				</logic:equal>
				</td>
				
				<td>
                    <html:text property="<%= CopyEditQuickPickAEDForm.FIELD_DESCRIPTION %>" size="40" maxlength="<%= form.getDescriptionMaxLength() %>"/>
                </td>
                
                <td align="center" class="ColRowBold">
                    <base:showHideTag id="onSave">                    
                    	<base:saveButton onclick="hideElementonSave()" name="<%= CopyEditQuickPickAEDForm.BUTTON_NAME_SAVE %>" />
                    	&nbsp;
                    	<base:cancelButton name="<%= CopyEditQuickPickAEDForm.BUTTON_NAME_CANCEL %>" />
                    </base:showHideTag>
                </td>
            </tr>
        </table>
    </td>
</tr>
</logic:equal>
<tr>
    <td>
        <base:imageLine height="1" width="100%"/>
    </td>
</tr>

<tr>
	<td>
		<table width="100%">
			<tr>
				<td class="TableHeading">
					<%= form.getHeadingText() %>
				</td>
			</tr>
		</table>
	</td>
</tr>

<tr><td>
    <table id=<%= CopyEditQuickPickAEDForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
    <%
    //List is a list of value objects
    Collection list = form.getResultList();
    Iterator iter = ObjectHelper.getIterator(list);
    int flipper = 0;
    QuickPickVO value = null;
    while (iter.hasNext()) {
        value = (QuickPickVO) iter.next();
        if ( ( flipper & 1 ) == 0 ) {
            out.println("<tr bgColor=\"#E8E8E8\">");
        }
        else {
            out.println("<tr>");
        }
        flipper++;
    %>
            <td class="ColRow"><%= ResponseUtils.filter(value.getName())%></td>
            <td class="ColRow tdAlignRight">
                <base:link page='<%= "/cataloging/servlet/handlecopyeditquickpickaedform.do?action=" +  CopyEditQuickPickAEDForm.ACTION_EDIT + "&quickPickID=" + value.getQuickPickID() + "&controlNum=" + value.getControlNum() + "&copyEditSiteID=" + form.getCopyEditSiteID() %>' id="<%=CopyEditQuickPickAEDForm.ID_EDIT + value.getQuickPickID() %>">
                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("copyeditquickpickaed_Edit", ResponseUtils.filter(value.getName())) %>'/>
                </base:link>
                &nbsp;
                <base:link page='<%= "/cataloging/servlet/handlecopyeditquickpickaedform.do?action=" +  CopyEditQuickPickAEDForm.ACTION_DELETE + "&quickPickID=" + value.getQuickPickID() + "&controlNum=" + value.getControlNum()+ "&copyEditSiteID=" + form.getCopyEditSiteID() %>' id="<%=CopyEditQuickPickAEDForm.ID_DELETE + value.getQuickPickID() %>">
                    <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("copyeditquickpickaed_Delete", ResponseUtils.filter(value.getName())) %>'/>
                </base:link>
            </td>
        </tr>
    <% } %>
    </table>
    </td>
</tr>
</base:form>
