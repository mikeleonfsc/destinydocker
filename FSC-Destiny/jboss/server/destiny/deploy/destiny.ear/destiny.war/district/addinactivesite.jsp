<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>

<%
    AddInactiveSiteForm form = (AddInactiveSiteForm)request.getAttribute(AddInactiveSiteForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handleaddinactivesiteform.do" focus="<%=AddInactiveSiteForm.FIELD_SITE_NAME %>" method="post">

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="siteTable" width="100%">

        <tr>
            <td class="FormLabel tdAlignRight">
                Inactive&nbsp;Site&nbsp;Name
            </td>
            <td>
                <html:text property="<%=AddInactiveSiteForm.FIELD_SITE_NAME %>" size="40" maxlength='<%= "" + com.follett.fsc.destiny.entity.ejb3.InactiveSiteSpecs.MAX_LENGTH_SITENAME %>' />
            </td>
        </tr>
        
        <tr>
            <td class="FormLabel tdAlignRight">
                Site&nbsp;Type
            </td>
            <td>
                <base:selectSiteType name="<%=AddInactiveSiteForm.FIELD_SITETYPE_ID%>" selectedSiteTypeID="<%=form.getSiteTypeID()%>"  mode="<%=LookupSpecs.MODE_EDIT%>" includeForMediaSites="false" includeForLibrarySites="true" includeForTextbookSites="true"  includeForAssetSites="false"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <base:saveButton/>&nbsp;&nbsp;<base:cancelButton/>
            </td>
        </tr>
        
        

        </base:outlinedTable>
        </td>
    </tr>
</table>

</base:form>
