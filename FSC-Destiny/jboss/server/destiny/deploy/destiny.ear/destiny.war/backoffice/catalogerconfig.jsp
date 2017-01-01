<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.CatalogerConfigForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.util.FollettEBookSpecs"%>

<%
   CatalogerConfigForm form = (CatalogerConfigForm)request.getAttribute(CatalogerConfigForm.FORM_NAME); 
%>


<base:messageBox strutsErrors="true"/>
<base:outlinedTable id="<%=CatalogerConfigForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="98%" cellpadding="0" cellspacing="0">

    <tr>
        <base:sectionHeading tdContent="width='100%' valign='top'" heading='<%=MessageHelper.formatMessage("catalogerconfig_DistrictCatalogedDigitalResources") %>'/>
        <td class="tdAlignRight">
           <base:link id="<%=CatalogerConfigForm.ID_EDIT_DIGITAL_RESOURCE%>" page="/backoffice/servlet/presentcatalogeddigitalresourcesform.do">
               <base:image src="/buttons/large/edit.gif" alt='<%=MessageHelper.formatMessage("catalogerconfig_EditDigitalResource")%>'/>
           </base:link>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table id ="<%=CatalogerConfigForm.TABLE_DIGITAL_RESOURCES%>">
                <tr>
                    <td class="ColRow">
                        <ul><li><%=MessageHelper.formatMessage("catalogerconfig_ProvidersDefined0", form.gimmeVendorDefinedCount()) %></li></ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr><td class="ColRow" colspan="2">&nbsp;</td></tr>
    
    <% if (!LocaleHelper.isInternationalProduct() && !form.checkForFollettShelf()) { %>
    <tr>
        <base:sectionHeading tdContent="width='100%' valign='top'" heading='<%=MessageHelper.formatMessage("catalogerconfig_DistrictEbookPolicy") %>'/>
        <td class="tdAlignRight">
           <base:link id="<%=CatalogerConfigForm.ID_EDIT_EBOOK_POLICY%>" page="/backoffice/servlet/presentdistrictebookpolicyform.do">
               <base:image src="/buttons/large/edit.gif" alt='<%=MessageHelper.formatMessage("catalogerconfig_EditEbookPolicy")%>'/>
           </base:link>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table id ="<%=CatalogerConfigForm.TABLE_EBOOK_POLICY%>">
                <tr>
                    <td class="ColRow">
                        <ul>
                        <li><%=form.gimmeLoanPeriodData() %></li>
                        <li><%=MessageHelper.formatMessage("catalogerconfig_CheckoutLimit0", form.gimmeCheckOutLimit()) %></li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr><td class="ColRow" colspan="2">&nbsp;</td></tr>
    <% } %>
    <tr>
        <base:sectionHeading tdContent="width='100%' valign='top'" heading='<%=MessageHelper.formatMessage("catalogerconfig_PreferredDescriptiveCatForm") %>'/>
        <td class="tdAlignRight">
           <base:link id="<%=CatalogerConfigForm.ID_EDIT_PREFERRED_CAT_FORM%>" page="/backoffice/servlet/presentpreferreddescriptivecatalogingform.do">
               <base:image src="/buttons/large/edit.gif" alt='<%=MessageHelper.formatMessage("catalogerconfig_EditPreferredDescriptiveCatForm")%>'/>
           </base:link>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table id ="<%=CatalogerConfigForm.TABLE_PREFERRED_CAT_FORM%>">
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%=form.gimmePreferredCatForm() %></li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
</base:outlinedTable>
