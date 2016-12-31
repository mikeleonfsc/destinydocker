<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigSiteInfoForm" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%
    SiteConfigSiteInfoForm form = (SiteConfigSiteInfoForm)request.getAttribute(SiteConfigSiteInfoForm.FORM_NAME);
%>


<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigBaseForm"%><base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handlesiteconfigsiteinfoform.do" enctype="multipart/form-data" method="post">
<html:hidden property="prevCustomerNumber" />
<html:hidden property="currentLogoFileName" />
<html:hidden property="<%=SiteConfigSiteInfoForm.PARAM_ORIGINAL_RPS %>" />
<html:hidden property="<%=SiteConfigSiteInfoForm.PARAM_ORIGINAL_ARE %>" />
<html:hidden property="<%=SiteConfigSiteInfoForm.PARAM_ORIGINAL_RCE %>" />
<base:outlinedTableAndTabsWithinThere id="<%=SiteConfigSiteInfoForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTabID="<%=SiteConfigBaseForm.ID_TAB_SITE_INFO %>" selectedTab='<%=MessageHelper.formatMessage("siteconfigbase_TabSiteInfo") %>' tabs="<%=form.getTabs()%>" width="100%">
    <tr>
        <td>
            <jsp:include page="/district/siteinfo.jsp" flush="true" />
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
