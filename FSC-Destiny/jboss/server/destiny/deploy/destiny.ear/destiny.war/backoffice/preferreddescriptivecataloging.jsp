<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.PreferredDescriptiveCatalogingForm"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<bean:define id="form" name="backoffice_servlet_PreferredDescriptiveCatalogingForm" type="com.follett.fsc.destiny.client.backoffice.servlet.PreferredDescriptiveCatalogingForm"/>
<bean:define id="periodTypes" name="<%=PreferredDescriptiveCatalogingForm.FORM_NAME%>" property="periodTypes"/>
<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<base:form action="/backoffice/servlet/handlepreferreddescriptivecatalogingform.do">

  <table align="center" width="95%"><tr><td>
    <base:outlinedTable borderColor='#C0C0C0'>
        <tr><td>
            <table id="circtypeinfo" border="0" cellspacing="2" cellpadding="2">
                <tr>
                    <td class="ColHeading tdAlignRight">
                        <%=MessageHelper.formatMessage("catalogerconfig_PreferredDescriptiveCatForm") %>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td class="ColRowBold" nowrap>
                        <html:radio property="<%=PreferredDescriptiveCatalogingForm.FIELD_PREFERRED_CATALOGING%>"
                                value="<%=PreferredDescriptiveCatalogingForm.PREFERRED_CATALOGING_DFFAULT_VALUE%>">
                            <%=MessageHelper.formatMessage("PreferredDescriptiveCatalogingForm_PreferredDescriptiveCatFormAARC2") %>
                        </html:radio>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold" nowrap>
                        <html:radio property="<%=PreferredDescriptiveCatalogingForm.FIELD_PREFERRED_CATALOGING%>"
                                value="<%=PreferredDescriptiveCatalogingForm.PREFERRED_CATALOGING_RDA_VALUE%>">
                            <%=MessageHelper.formatMessage("PreferredDescriptiveCatalogingForm_PreferredDescriptiveCatFormRDA") %>
                        </html:radio>
                    </td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" colspan="6">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>
                            <base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
             </table>
        </td></tr>
      </base:outlinedTable>
      </td></tr></table>
</base:form>

