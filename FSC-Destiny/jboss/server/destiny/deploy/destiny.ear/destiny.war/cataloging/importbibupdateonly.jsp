<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>
<%
    ImportBibForm form = (ImportBibForm)request.getAttribute("cataloging_servlet_ImportBibForm");
 %>

<base:form action="/cataloging/servlet/handleimportbibupdateonlyform.do" enctype="multipart/form-data">
  <html:hidden property="importPage"/>
  <html:hidden property="<%=ImportBibForm.PARAM_COLLECTION_TYPE%>"/>
    <base:outlinedTableAndTabsWithinThere tabs="<%= form.getTabs()%>" selectedTab="<%=ImportBibForm.ID_TAB_UPDATE_ONLY %>" borderColor="#C0C0C0" width="100%">
      <tr>
      <td>
        <table id="content" width="100%" border="0" cellspacing="2" cellpadding="2">
          <tr>
            <td colspan="2" class="ColRowBold"><%= MessageHelper.formatMessage("importbibupdateonly_PleaseNote") %></td>
          </tr>
          <tr>
            <td colspan="2" class="ColRow">
			<%= MessageHelper.formatMessage("importbibupdateonly_ToMatchTitleRecordsMustHaveTheSame") %>              
            </td>
          </tr>
          <tr>
            <td colspan="2" valign="top">
              <base:imageLine height="1" width="100%" />
            </td>
          </tr>
          <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("importbibupdateonly_ImportFile") %></td>
            <td><html:file property="<%=ImportBibForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
          </tr>
          <tr valign="top">
            <td class="tdAlignRight"><html:checkbox property="summaryBrief"></html:checkbox></td>
            <td class="ColRow"><%= MessageHelper.formatMessage("importbibupdateonly_LimitTheJobSummaryDetailsToErrorsAndWarningsClear") %></td>
          </tr>
          <tr>
            <td colspan="2" align="center" class="ColRowBold">
                <base:genericShowHideButton src="/buttons/large/import.gif" name="<%= ImportBibForm.BUTTON_IMPORT %>" alt='<%=MessageHelper.formatMessage("import")%>' elementID="<%=ImportBibForm.ID_BUTTON_IMPORT %>"/>
            </td>
          </tr>
        </table>
      </td>
      </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
