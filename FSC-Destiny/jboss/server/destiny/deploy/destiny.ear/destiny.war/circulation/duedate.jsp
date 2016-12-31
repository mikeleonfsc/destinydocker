<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.SpecialDueDateState" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SystemDateSpecs" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.util.CollectionType"%><base:messageBox strutsErrors="true"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        submitScopeChange();
        return false;
      }
      return true;
    }  
  
    function submitCalendar(month, day, year)
    {
        //If the day is NULL, then submit the form with no day. This will
        //tell the servlet to advance/goback another month
        if (day != -1) {
            document.forms["<%=DueDateForm.FORM_NAME%>"].elements["<%=DueDateForm.PARAM_DAY%>"].value = day;
        }

        //Set the other params based on what was passed
        document.forms["<%=DueDateForm.FORM_NAME%>"].elements["<%=DueDateForm.PARAM_MONTH%>"].value = month;
        document.forms["<%=DueDateForm.FORM_NAME%>"].elements["<%=DueDateForm.PARAM_YEAR%>"].value  = year;

        //Submit the form - NOTE no name of the action.
        document.<%=DueDateForm.FORM_NAME%>.<%=DueDateForm.FIELD_SUBMIT_TYPE%>.value = "<%=DueDateForm.SUBMIT_TYPE_CALENDAR%>";
        document.forms["<%=DueDateForm.FORM_NAME%>"].submit();
    }
    function submitLoanPeriod()
    {
        //Submit the form - NOTE no name of the action.
        document.<%=DueDateForm.FORM_NAME%>.<%=DueDateForm.FIELD_SUBMIT_TYPE%>.value = "<%=DueDateForm.SUBMIT_TYPE_LOAN_PERIOD%>";
        document.forms["<%=DueDateForm.FORM_NAME%>"].submit();
    }
    function submitScopeChange() {
        document.<%=DueDateForm.FORM_NAME%>.<%=DueDateForm.FIELD_SUBMIT_TYPE%>.value = "<%=DueDateForm.SUBMIT_TYPE_SCOPE_CHANGE%>";
        document.<%=DueDateForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:form action="/circulation/servlet/handleduedateform.do">
<html:hidden property="<%= DueDateForm.FIELD_SUBMIT_TYPE %>"/>
<html:hidden property="previousBarcode" />
<html:hidden property="selectedDueDate" />
<html:hidden property="renewal"/>
<html:hidden property="collectionType"/>
<html:hidden property="initialDueDateType"/>
<html:hidden property="<%=DueDateForm.FIELD_CHECKOUT_FORMAT%>"/>
<html:hidden property="<%=DueDateForm.FIELD_ALLOW_SELECT_TEXTBOOK_LOAN_PERIOD%>"/>
<html:hidden property="<%=DueDateForm.PARAM_DISABLE_RADIOS%>"/>
<html:hidden property="<%=DueDateForm.FIELD_CHECKOUT_VIA_ISBN_COPY_ID%>"/>

<input type="hidden" name="specialduedate" value="1">

<input type="hidden" name="<%=DueDateForm.PARAM_MONTH%>" value="">
<input type="hidden" name="<%=DueDateForm.PARAM_DAY%>" value="">
<input type="hidden" name="<%=DueDateForm.PARAM_YEAR%>" value="">

<% DueDateForm form = (DueDateForm)request.getAttribute(DueDateForm.FORM_NAME); %>

<table border="0" cellpadding="2" width="95%">
<tr>
	<td class="TableHeading" valign="top"><%=form.getHeading()%>
	</td>
    <td class="ColRowBold tdAlignRight" valign="bottom">
        <base:showHideTag id="onSave">
            <base:saveButton onclick="hideElementonSave()" name="<%=DueDateForm.BUTTON_SAVE%>" />
            <br>
            <base:cancelButton name="<%=DueDateForm.BUTTON_CANCEL%>"/>
        </base:showHideTag>
    </td>
</tr>
<tr>
	<td colspan="2"><img src="/images/icons/general/line.gif" border="0" height="1" width="100%"/></td>
</tr>
<tr>
    <logic:equal name="<%=DueDateForm.FORM_NAME%>" property="<%=DueDateForm.PARAM_DISABLE_RADIOS%>" value="false" scope="request">
    <td valign="top">
        <table id="<%=DueDateForm.TABLE_DUE_DATE_OPTIONS%>" border="0" cellpadding="2">
        <tr>
            <td class="ColRow"><html:radio property="<%=DueDateForm.FIELD_DUE_DATE_OPTION%>" value="<%=Integer.toString(SpecialDueDateState.SCOPE_SELECTED)%>"/></td>
            <td class="ColRow" colspan="2">
            	<% if (StringHelper.isEmpty(form.getSelectedDueDate())) { %>
            		<%= MessageHelper.formatMessage("duedate_SelectedDateUnlimited") %>
            	<% } else { %>
            		<%= MessageHelper.formatMessage("duedate_SelectedDate") %>
            	    <span onKeyPress="return trapEnter(event);">            	
            		   <html:text property="formattedSelectedDueDate" size="10" maxlength="10"/>
            		</span>
        		<% } %>
            	&nbsp;
            	<html:select property="<%= DueDateForm.FIELD_DUE_DATE_SCOPE %>" onchange="submitScopeChange()">
                	<html:option value="<%=Integer.toString(SpecialDueDateState.SCOPE_SESSION)%>"><%= MessageHelper.formatMessage("duedate_UntilLogout") %></html:option>
                	<logic:equal name="<%=DueDateForm.FORM_NAME%>" property="renewal" value="false" scope="request">
	                	<% if (form.getCheckoutFormat() == BaseCircForm.CHECKOUTFORMAT_TO_PATRON ||
                               form.getCheckoutFormat() == BaseCircForm.CHECKOUTFORMAT_TO_CLASS ) { %>
	                    	<html:option value="<%=Integer.toString(SpecialDueDateState.SCOPE_RECEIVER)%>"><%= MessageHelper.formatMessage("duedate_ForThisPatron") %></html:option>
						<% } else if (form.getCheckoutFormat() == BaseCircForm.CHECKOUTFORMAT_TO_DEPARTMENT) { %>
	                    	<html:option value="<%=Integer.toString(SpecialDueDateState.SCOPE_RECEIVER)%>"><%= MessageHelper.formatMessage("duedate_ForThisDepartment") %></html:option>
	                    <% } else if (form.getCheckoutFormat() == BaseCircForm.CHECKOUTFORMAT_TO_TEACHER) { %>	
	                    	<html:option value="<%=Integer.toString(SpecialDueDateState.SCOPE_RECEIVER)%>"><%= MessageHelper.formatMessage("duedate_ForThisTeacher") %></html:option>
	                    <% } else { %>	
	                    	<html:option value="<%=Integer.toString(SpecialDueDateState.SCOPE_RECEIVER)%>"><%= MessageHelper.formatMessage("duedate_ForThisLocation") %></html:option>
	                    <% }  %>	
                    </logic:equal>
                    <html:option value="<%=Integer.toString(SpecialDueDateState.SCOPE_ITEM)%>"><%= MessageHelper.formatMessage("duedate_ForThisItem") %></html:option>
                </html:select>
            </td>
        </tr>
        <tr>
            <td class="ColRow"><html:radio property="<%=DueDateForm.FIELD_DUE_DATE_OPTION%>" value="<%=Integer.toString(SpecialDueDateState.SCOPE_DEFAULT)%>"/></td>
            <bean:define id="formattedDefaultDueDate" name="<%= DueDateForm.FORM_NAME %>" property="formattedDefaultDueDate"/>
            <td class="ColRow" colspan="2"><%= MessageHelper.formatMessage("duedate_DefaultDate", formattedDefaultDueDate) %></td>
        </tr>
        </table>

    </td>
    <td>
    </logic:equal>
    <logic:equal name="<%=DueDateForm.FORM_NAME%>" property="<%=DueDateForm.PARAM_DISABLE_RADIOS%>" value="true" scope="request">
       <html:hidden property="formattedSelectedDueDate"/>
    <td align="center">
    </logic:equal>
        <%
            SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
            Long siteID = (Long)store.getProperty(LoginFacadeSpecs.SITE_ID);
        %>
        <table id="<%=DueDateForm.TABLE_SUB_CALENDAR%>">
        <tr>
        <td valign="top">

                </td>
                    </tr><tr>
                <td valign="top">
                    <%=
                    form.getCalendar().create(form.getFirstOfMonth(), siteID, application, request, response, true, false)
                    %>
                </td>
        </tr>
        <logic:equal name="<%=DueDateForm.FORM_NAME%>" property="<%=DueDateForm.FIELD_ALLOW_SELECT_TEXTBOOK_LOAN_PERIOD%>" value="true" scope="request">
            <tr>
                <td valign="bottom" class="ColRow">
                    <bean:define id="loanPeriods" name="<%= DueDateForm.FORM_NAME %>" property="<%= DueDateForm.FIELD_LOAN_PERIOD_LIST %>"/>

                    <%
                        String labelProperty = "displayableDescriptionWithDueDate";
                        if (form.getCollectionType() == CollectionType.TEXTBOOK) {
                            labelProperty = "displayableDueDate";
                        }
                    %>

                    <html:select onchange="submitLoanPeriod()" property="<%= DueDateForm.FIELD_LOAN_PERIOD_ID %>">
                        <html:options collection="loanPeriods" property="systemDateID" labelProperty="<%=labelProperty %>"/>
                    </html:select>
                    &nbsp;
                    <logic:equal name="<%=DueDateForm.FORM_NAME%>" property="allowAEDPolicies" value="true" scope="request">
                        <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%= DueDateForm.BUTTON_NAME_OTHER_LOAN_PERIOD %>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                    </logic:equal>
                </td>
            </tr>

        </logic:equal>

        </table>

    </td>
</tr>
</table>

</base:form>
