<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page
    import="com.follett.fsc.destiny.client.cataloging.servlet.AssetPowerSearchForm"%>
<%@ page
    import="com.follett.fsc.destiny.client.cataloging.servlet.AssetSearchNavigationForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="java.util.List"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<base:messageBox strutsErrors="true" />
<%
    AssetPowerSearchForm form = (AssetPowerSearchForm) request
					.getAttribute(AssetPowerSearchForm.FORM_NAME);

			List keywordList = (List) request.getAttribute("MyKeywordList");
			boolean haveResults = (keywordList != null)
					&& (keywordList.size() > 0);
			String focusControl = AssetPowerSearchForm.FIELD_KEYWORD_TEXT;
			if (haveResults) {
				// we don't want to focus on anything in the form if we've got results or if we aren't displaying search criteria
				focusControl = "";
			}

			request.setAttribute("parentFormName",
					"cataloging_servlet_AssetPowerSearchForm");
%>
<base:form action="/cataloging/servlet/handleassetpowersearchform.do"
    styleId="keywordList" focus="<%=focusControl%>">

    <jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />
    <a name="refinesearch"></a>
    
    <jsp:include page="/cataloging/assetpowersearchcommon.jsp" flush="true" />
</base:form>

<logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="searchCriteriaChanged" value="true">
<script>
location.hash='refinesearch';
</script>
</logic:equal>
<logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="searchCriteriaChanged" value="false">
<script>
location.hash='topofpage';
</script>
</logic:equal>


