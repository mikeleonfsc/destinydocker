<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.PatronCircReportJob" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%=PatronCircReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm"/>

<%
SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
String siteName = ResponseUtils.filter((String)store.getProperty(LoginFacadeSpecs.SITE_DISPLAY_NAME));
%>

<base:form action="/backoffice/servlet/handlepatroncircreportform.do">

<html:hidden property="currentPage" value="<%= String.valueOf(PatronCircReportForm.PAGE_LIMIT) %>"/>
<html:hidden property="optionListCheckedOutOverdues"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="<%=PatronCircReportForm.TABLE_MAIN_TABLE%>" borderColor='#C0C0C0' cellpadding="3">
    <tr>
        <td colspan="4" align="center">
            <table id="<%=PatronCircReportForm.TABLE_WIZARD_HEADER%>">
                <tr>
                    <td><base:genericButton alt='<%=MessageHelper.formatMessage("patroncircreportlimit_Format") %>' src="/tabs/formatpassive.gif" name="<%=PatronCircReportForm.BUTTON_FORMAT%>"/></td>
                    <td><base:image src="/tabs/limitactive.gif" alt='<%=MessageHelper.formatMessage("patroncircreportlimit_Limit") %>'/></td>
                    <td><base:image src="/tabs/details.gif" alt='<%=MessageHelper.formatMessage("patroncircreportlimit_Detail") %>'/></td>
                </tr>
                <tr>
                    <td class="Instruction" align="center" colspan="3">
                    <bean:write name="<%=PatronCircReportForm.FORM_NAME%>" property="subtitle"/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="4"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="4"><%=MessageHelper.formatMessage("patroncircreportlimit_LimitTheResultsTo") %></td>
    </tr>
    
    <tr>
        <td colspan="4">
        <table border="0" cellspacing="0" width="100%" cellpadding="0" id="<%=PatronCircReportForm.TABLE_OUTER_LIMIT%>">
        <tr>
            <td valign="top">
    <table border="0" id="<%=PatronCircReportForm.TABLE_MY_PATRONS%>">
        <tr>        
            <td class="ColRowBold tdAlignRight" valign="middle"><%=MessageHelper.formatMessage("patroncircreportlimit_MyPatrons") %></td>
             <td colspan="2">
                <base:patronTypesList formName="<%= PatronCircReportForm.FORM_NAME %>" allowToSaveWithoutAnyPatronTypesSelected="true"/>
            </td>
        </tr>        

    <tr>
        <td class="ColRowBold">&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_LIMIT_BY_GRADUATING%>"/>
        </td>
        <td class="ColRow" width="100%"><%=MessageHelper.formatMessage("patroncircreportlimit_GraduatingIn") %>&nbsp;<html:text property="<%=PatronCircReportForm.FIELD_GRAD_YEAR%>" size="4" maxlength="4"/>
        </td>
              
    </tr>
            </table>
            </td>
            <td valign="top">
                <table border="0" id="<%=PatronCircReportForm.TABLE_ONLY%>">
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top"><nobr><%=MessageHelper.formatMessage("patroncircreportlimit_Status") %></nobr></td>
                    <td class="ColRow">
                        <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_ACTIVE %>"/>
                    </td>
                    <td class="ColRow" width="100%"><%=MessageHelper.formatMessage("patroncircreportlimit_Active") %></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
                    <td class="ColRow">
                        <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_INACTIVE %>"/>
                    </td>
                    <td class="ColRow" width="100%"><%=MessageHelper.formatMessage("patroncircreportlimit_Inactive") %></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
                    <td class="ColRow">
                        <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_RESTRICTED %>"/>
                    </td>
                    <td class="ColRow" width="100%"><%=MessageHelper.formatMessage("patroncircreportlimit_Restricted") %></td>
                </tr>
                </table>
            </td>
        </tr>
        </table>
        </td>
    </tr>

    <logic:notEqual name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS%>" >
        <tr>
            <td colspan="4">
                <table>
                    <tr>
                        <td class="ColRowBold tdAlignRight" valign="top"><nobr><%=MessageHelper.formatMessage("patroncircreportlimit_AlsoInclude") %></nobr></td>
                        <td valign="top">
                            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_VISITING_PATRONS%>"/>
                        </td>
                        <td valign="top" class="ColRow" width="100%">
                            <%=MessageHelper.formatMessage("patroncircreportlimit_PatronsOfOtherSites", siteName) %>&nbsp;<base:helpTag helpFileName="d_patrons_of_other_sites.htm"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </logic:notEqual>
    <tr>
        <td colspan="4"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
<logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="optionListCheckedOutOverdues" value='true' >
    <%
        boolean isFirst = true;
    %>
    <% if (form.isLibraryProductSupported()) { 
        isFirst = false;
    %>
        
            <tr>
                <td class="ColRowBold tdAlignRight" valign="middle" nowrap="nowrap"><%=MessageHelper.formatMessage("patroncircreportlimit_MyMaterials") %></td>
                <td width="100%" colspan="3">
                    <table>
                        <tr>
                            <td valign="middle" class="ColRow">
                                <% if ((form.isTextbookProductViewable() || form.isAssetProductViewable()) && (form.isCircTypesAllSelected() || form.noCircTypesSelected() )) { %><%=MessageHelper.formatMessage("patroncircreportlimit_Library") %> -<% } %>
                            <td>
                            <td>
                                <base:circTypesList formName="<%= PatronCircReportForm.FORM_NAME %>" allowToSaveWithoutAnyCircTypesSelected="true"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
    <%
    }
    %>
    <!-- Only show textbook checkbox if there are other product modes to also display -->
    <% if (form.isTextbookProductSupported() && !form.isTextbookOnlyProduct()) { %>
        <tr>
            <% if (!form.isLibraryProductSupported()) {%>
                <td class="ColRowBold tdAlignRight" valign="top" nowrap="nowrap"><%=MessageHelper.formatMessage("patroncircreportlimit_MyMaterials") %></td>
            <% } else { %>
                <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
            <% }%>
            <td class="ColRow">
                <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_TEXTBOOKS %>"/>
            </td>
            <td class="ColRow" colspan="2" width="100%"><%=MessageHelper.formatMessage("patroncircreportlimit_Textbooks") %></td>
        </tr>
    <% } else { %>
        <html:hidden property="<%= PatronCircReportForm.FIELD_INCLUDE_TEXTBOOKS %>"/>
    <% } %>

    <!-- Only show asset checkbox if there are other product modes to also display -->
    <% if (form.isAssetProductSupported()) { %>
        <tr>
            <% if (!form.isLibraryProductSupported() && !form.isTextbookProductSupported()) {%>
                <td class="ColRowBold tdAlignRight" valign="top" nowrap="nowrap"><%=MessageHelper.formatMessage("patroncircreportlimit_MyMaterials") %></td>
            <% } else { %>
                <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
            <% }%>
            <td class="ColRow" valign="top">
            <% if (form.isAssetSiteOnly()) { %>
                <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_ASSETS %>" disabled="true"/>
            <% } else { %>
                <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_ASSETS %>"/>
            <% } %>
            </td>
            <td class="ColRow" valign="top"><%=MessageHelper.formatMessage("patroncircreportlimit_Assets") %></td>
            <td width="100%" vAlign="top">
                <base:assetTypesList formName="<%= PatronCircReportForm.FORM_NAME%>"/>
            </td>
        </tr>
    <% } else { %>
        <html:hidden property="<%= PatronCircReportForm.FIELD_INCLUDE_ASSETS %>"/>
    <% } %>
    
</logic:equal>
<logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="optionListCheckedOutOverdues" value='false' >
    <html:hidden property="<%= PatronCircReportForm.FIELD_INCLUDE_TEXTBOOKS %>"/>
    <html:hidden property="<%= PatronCircReportForm.FIELD_INCLUDE_ASSETS %>"/>
</logic:equal>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><nobr><%=MessageHelper.formatMessage("patroncircreportlimit_AlsoInclude") %></nobr></td>
        <td valign="top">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_FOREIGN_ITEMS%>"></html:checkbox>
        </td>
        <td class="ColRow" colspan="2" valign="top" width="100%">
            <%=MessageHelper.formatMessage("patroncircreportlimit_TheMaterialsMyPatrons") %>&nbsp;<base:helpTag helpFileName="d_materials_my_patrons_have.htm"/>
        </td>
    </tr>
    <tr>
        <td colspan="4"><base:imageLine height="1" width="100%"/></td>
    </tr>


    <tr>
        <td class="ColRow" colspan="4" align="center"><base:genericButton src="/buttons/large/continue.gif" alt='<%=MessageHelper.formatMessage("continue") %>' name="<%=PatronCircReportForm.BUTTON_DETAILS%>" /></td>
    </tr>


</base:outlinedTable>

</base:form>
