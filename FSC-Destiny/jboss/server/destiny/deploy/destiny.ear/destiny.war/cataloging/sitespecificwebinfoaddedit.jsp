<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.SiteSpecificWebInfoAddEditForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseFileUploadForm" %>
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
    SiteSpecificWebInfoAddEditForm form = (SiteSpecificWebInfoAddEditForm)request.getAttribute(SiteSpecificWebInfoAddEditForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlesitespecificwebinfoaddeditform.do" focus="<%=SiteSpecificWebInfoAddEditForm.FIELD_URL%>">
<html:hidden property="<%= SiteSpecificWebInfoAddEditForm.PARM_ACTION %>"/>
<html:hidden property="<%= SiteSpecificWebInfoAddEditForm.PARM_BIB_ID %>"/>
<html:hidden property="<%= SiteSpecificWebInfoAddEditForm.PARM_SITE_ID %>"/>
<html:hidden property="<%= SiteSpecificWebInfoAddEditForm.PARM_WEBINFO_ID %>"/>

	<base:outlinedTable  borderColor="#c0c0c0"  width="100%">
		<tr>
			<td valign="top" width="100%">

               <table id="" width="100%" cellpadding="5" cellspacing="0">
                    <tr>
                        <td>
                           <table id="<%=SiteSpecificWebInfoAddEditForm.TABLE_VALUES %>" >
                            <tr>
                                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("sitespecificwebinfoaddedit_SitespecificUrl") %></td>
                                <td>
                                    <html:text property="<%=SiteSpecificWebInfoAddEditForm.FIELD_URL%>" size="100" maxlength="2048"/>
                                </td>                   
                            </tr>
                            <tr>
                                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("sitespecificwebinfoaddedit_Description") %></td>
                                <td>
                                    <html:text maxlength="512" size="100" property="<%=SiteSpecificWebInfoAddEditForm.FIELD_DESCRIPTION%>"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="Instruction"><%= MessageHelper.formatMessage("sitespecificwebinfoaddedit_RequiredField") %></td>
                                <td>&nbsp;</td>
                            </tr>
                           </table>
                        </td>
                        <td valign="top" class="ColRowBold tdAlignRight">
                            <base:showHideTag id="onSave">
                                <table name="<%=SiteSpecificWebInfoAddEditForm.TABLE_BUTTONS%>">
                                    <tr>
                                        <td>
                                            <base:saveButton onclick="hideElementonSave()"/> 
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <base:cancelButton/> 
                                        </td>
                                    </tr>
                                </table>
                            </base:showHideTag>
                        
                        </td>
                    </tr>
                </table>
            </td>
       </tr>
       
	</base:outlinedTable>
</base:form>
<!-- end of page -->
