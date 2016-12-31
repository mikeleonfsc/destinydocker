<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.DistrictEbookPolicyForm"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<bean:define id="form" name="backoffice_servlet_DistrictEbookPolicyForm" type="com.follett.fsc.destiny.client.backoffice.servlet.DistrictEbookPolicyForm"/>
<bean:define id="periodTypes" name="<%=DistrictEbookPolicyForm.FORM_NAME%>" property="periodTypes"/>
<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<base:form action="/backoffice/servlet/handledistrictebookpolicyform.do" focus="defaultLoanPeriod">

  <table align="center" width="95%"><tr><td>
    <base:outlinedTable borderColor='#C0C0C0'>
        <tr><td>
            <table id="circtypeinfo" border="0" cellspacing="2" cellpadding="2">
                <tr>
                    <td class="ColHeading tdAlignRight">
                        <%=MessageHelper.formatMessage("districtebookpolicy_DistricteBookLoanPolicy") %>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                 </tr>

                 <tr>
                    <td class="SmallColHeading tdAlignRight">Loan Period&nbsp;</td>
                    <td class="ColRow" nowrap>
                            <html:text property="<%=DistrictEbookPolicyForm.FIELD_DEFAULT_LOAN_PERIOD%>" size="4" maxlength="3"/> 
                        <html:select property="<%=DistrictEbookPolicyForm.FIELD_DEFAULT_PERIOD_TYPE%>">
                            <html:options collection="periodTypes" property="stringCode"
                                          labelProperty="stringDesc"/>
                         </html:select> 
                     </td>
                  </tr>
 
                <tr>
                    <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("districtebookpolicy_CheckoutLimit")%>&nbsp;</td>
                    <td class="ColRow" nowrap>
                       <html:text property="<%=DistrictEbookPolicyForm.FIELD_CHECKOUT_LIMIT%>" size="3" maxlength="3"/>
                    </td>
                  </tr>
                <tr>
                    <td>&nbsp;</td>
                 </tr>
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

