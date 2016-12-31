<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%=AssetTemplateRollupPreviewForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.AssetTemplateRollupPreviewForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleassettemplaterolluppreviewform.do">
    <base:outlinedTable id="<%=AssetTemplateRollupPreviewForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="TableHeading" vAlign="top"><%=AssetTemplateRollupPreviewForm.PAGE_TITLE%>...</td>
            <td class="tdAlignRight">
                <base:closeButton/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" width="100%" colSpan="2">
                <span style="font-weight: 400">
                    The resource types shown below with a <base:image src="/icons/general/selectedlevel.gif" width="18" height="16"/> are the primary headings under which data could roll-up in your report.
                    The actual report output will be based on the Resource Type selections made in your report configuration and the organization
                    of your resource collection.
                </span>
            </td>
        </tr>
        <tr>
            <td width="100%" colSpan="2">
                 <base:assetTypeSelector assetTree="<%=form.getAssetTree()%>" supressCheckboxesAndButtons="true" rollupLevel="<%=form.getRollupValue()%>"/>
            </td>
        </tr>   
    </base:outlinedTable>
</base:form>
