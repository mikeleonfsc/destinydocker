<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookupList" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="form" name="<%=CRWImportReportForm.FORM_NAME%>" />

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    CRWImportReportForm crwForm = (CRWImportReportForm)request.getAttribute("backoffice_servlet_CRWImportReportForm");
%>
<base:messageBox strutsErrors="true"/> 
<base:form action="/backoffice/servlet/handlecrwimportreportform.do" enctype="multipart/form-data">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWImportReportForm.BUTTON_TRAP_ENTER%>">
<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWImportReportForm.TABLE_MAIN_TABLE%>" >
    
    <td>
        <td width="100%">
            <table width="95%">
                <tr>
                    <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("crw_importreport_ImportReportBuilderSetup") %></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">*<%= MessageHelper.formatMessage("crw_importreport_ReportSetupFile") %></td>
                    <td>
                        <html:file property="<%=CRWImportReportForm.FIELD_UPLOAD_FILE%>" size="20"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_importreport_NameImportedReport") %></td>
                    <td>
                         <html:text property="<%=CRWImportReportForm.FIELD_REPORT_NAME%>" maxlength="30" size="30" />
                    </td>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td class="Instruction"><%= MessageHelper.formatMessage("crw_importreport_RequiredField") %></td>
                </tr>
                
            </table>
        </td>        
        <td valign="top" class="ColRowBold tdAlignRight">
            <base:showHideTag id="onImport">
                <table id="<%=CRWImportReportForm.TABLE_MAIN_TABLE_BUTTONS %>" cellSpacing=0 cellPadding=5 >
                   <tr>
                        <td noWrap class="tdAlignRight" >
                             <base:genericButton src="/buttons/large/importreport.gif"  
                                alt='<%=MessageHelper.formatMessage("import") %>' 
                                name="<%= CRWImportReportForm.BUTTON_NAME_IMPORT %>"
                                onclick="hideElementonImport()"/>
    
                          </td>
                                    
                   </tr>
                   <tr>
                         <td noWrap class="tdAlignRight" >
                            <base:cancelButton name="<%= CRWImportReportForm.BUTTON_NAME_CANCEL %>"/>   
                         </td>
                  </tr>
                                 
                </table>
            </base:showHideTag>
        </td>     
     </tr>           
</base:outlinedTable>

</base:form>
