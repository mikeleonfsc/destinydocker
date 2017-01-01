<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm) request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>

<bean:define id="shelfListOption" name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="<%= SiteConfigurationBaseForm.FIELD_INVENTORY_CHECK_SHELF_ORDER_OPTIONS %>"/>
<bean:define id="checkDeweyDiffs" name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="<%= SiteConfigurationBaseForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY_OPTIONS %>"/>

<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_INVENTORY_OPTIONS%>" width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcatinventoryoptions_LibraryInventoryOptions") %></td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <%=MessageHelper.formatMessage("siteconfigcatinventoryoptions_CheckShelfOrderBasedOn") %> 
                    <span class="ColRow">
                        <html:select property="<%= SiteConfigurationBaseForm.FIELD_CAT_INVENTORY_CHECK_SHELF_ORDER %>">
                            <html:options collection="shelfListOption" property="longID" labelProperty="stringDesc"/>
                        </html:select>&nbsp;<base:helpTag helpFileName="d_check_shelf_order.htm"/>
                    </span>  
                </td>     
            </tr>
    
            <tr>
                <td class="ColRowBold">
                    <%=MessageHelper.formatMessage("siteconfigcatinventoryoptions_AlsoIdentifyVariancesBetweenDeweyNumbers") %> 
                    <span class="ColRow">
                       <html:select property="<%= SiteConfigurationBaseForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY %>">
                         <html:options collection="checkDeweyDiffs" property="longID" labelProperty="stringDesc"/>
                       </html:select>&nbsp;<base:helpTag helpFileName="d_dewey_number_difference.htm"/>
                    </span>  
                </td>     
            </tr>
        </table>
    </td>
</tr>
