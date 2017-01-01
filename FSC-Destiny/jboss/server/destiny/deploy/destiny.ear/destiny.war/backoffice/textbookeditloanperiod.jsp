<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SystemDateSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<%
	TextbookEditLoanPeriodForm form = (TextbookEditLoanPeriodForm)request.getAttribute(TextbookEditLoanPeriodForm.FORM_NAME);

%>
<base:form action="/backoffice/servlet/handletextbookeditloanperiodform.do" focus="<%=TextbookEditLoanPeriodForm.FIELD_TEXTBOOK_LOAN_DESCRIPTION%>">

    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_WAS_DEFAULT_LOAN_PERIOD%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_PERIOD_ID%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_ORIGINAL_DESC%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>"/>
    
    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_DATE_FROM_OLD%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_DATE_TO_OLD%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_DATE_DUE_OLD%>"/>
    
    <html:hidden property="<%=TextbookEditLoanPeriodForm.PARAM_DISTRICT_MODE%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_CONFIRM_DUPS%>"/>
    <html:hidden property="<%=TextbookEditLoanPeriodForm.DO_NOT_CLEAR_CRUMB %>"/>

    <% if (form.isConfirmStartEndDup()) { %>
        <base:messageBox>
            <tr>
                <td class = "ColRowBold">These Class Start and End dates are already in use by the following loan periods:</td>
            </tr>
            <tr>
                <td class = "ColRow" align = "center">
                    <table>
                    <tr>
                        <td class = "ColRow">
                            <ul>
                                <% Iterator<String> it = form.getDuplicateLoanPeriods().iterator();
                                    while (it.hasNext()) {
                                %>
                                        <li><%= it.next() %></li>
                                <%
                                    }
                                %> 
                             </ul>
                        </td>
                    </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td class = "ColRow">Loan periods with duplicated class start and end dates may give you unexpected results<br/>
                        when uploading class schedule changes.<br/><br/>
                </td>
            </tr>
            <tr>
                <td class = "ColRow" align = "center">Save this loan period anyway?</td>
            </tr>
            <tr>
                <td align = "center"><base:yesNo/></td>
            </tr>
        </base:messageBox>
    <% } else if ((form.getErrors() == null || form.getErrors().size() == 0) && form.getNumberOfClassSections() != 0 && form.hasDatesChanged() && !form.isDistMode()) { %>
    <base:messageBox>
        <tr>
            <td class = "ColRow"><ul><li>Class sections that will be updated: <%= form.getNumberOfClassSections() %></li></ul></td>
       </tr>
       <tr>
            <td class = "ColRowBold">Are you sure you want to change this loan period?</td>
       </tr>
        <tr>
            <td align="center"><base:yesNo></base:yesNo></td>
        </tr>
    </base:messageBox>
    
    <% } %>

    <base:outlinedTable id="<%=TextbookEditLoanPeriodForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="ColRowBold tdAlignRight">*&nbsp;Description</td>
            <td><html:text property="<%=TextbookEditLoanPeriodForm.FIELD_TEXTBOOK_LOAN_DESCRIPTION%>" size="28" maxlength='<%=""+SystemDateSpecs.MAX_SIZE_SYSTEM_DATE_DESCRIPTION%>'/></td>
            <td>
                <base:saveButton/>
           </td>
        </tr>
        
        <logic:equal name="backoffice_servlet_TextbookEditLoanPeriodForm" property="defaultAllowed" value="true" scope="request" >
        <tr>
            <td>&nbsp;</td>
            <td nowrap>
                <logic:equal name="backoffice_servlet_TextbookEditLoanPeriodForm" property="<%=TextbookEditLoanPeriodForm.FIELD_WAS_DEFAULT_LOAN_PERIOD%>" value="true" scope="request" >
                    <html:hidden property="defaultTextbookLoanPeriod" value="true"/>
                    <base:image src="/icons/general/check_19.gif" width="19" height="16" alt="Default Loan Period"/>
                    <span class="ColRow">Default Loan Period</span>
                </logic:equal>

                <logic:equal name="backoffice_servlet_TextbookEditLoanPeriodForm" property="<%=TextbookEditLoanPeriodForm.FIELD_WAS_DEFAULT_LOAN_PERIOD%>" value="false" scope="request" >
                    <html:checkbox property="defaultTextbookLoanPeriod">
                    <span class="ColRow">Make this the default</span>
                    </html:checkbox>
                </logic:equal>
            </td>
            <td>
                <base:cancelButton/>
            </td>
        </tr>
	    </logic:equal>
        <logic:equal name="backoffice_servlet_TextbookEditLoanPeriodForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.TEXTBOOK)%>" scope="request" >
            <html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_DUE_DATE_MODE%>" value="<%=String.valueOf(TextbookEditLoanPeriodForm.DUE_DATE_MODE_SPECIFIED)%>"/>
            <tr>
                <td class="ColRowBold tdAlignRight">*&nbsp;Checkouts Start</td>
                <td colspan="2">
                    <html:text property="<%=TextbookEditLoanPeriodForm.FIELD_CHECKOUTS_START%>" size="3" maxlength="3"/>
                    &nbsp;<span class="ColRowBold">days before class starts</span>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">*&nbsp;Class Starts</td>
                <td colspan="2">
                    <base:dateRange 
                        dateFrom="<%=form.getDateFrom()%>"
                        dateTo="<%=form.getDateTo()%>"
                        promptTo="*&nbsp;Class Ends"
                        multiline="true"
                    />
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">*&nbsp;Due</td>
                <td colspan="2">
                    <base:date 
                        buttonName = "<%=TextbookEditLoanPeriodForm.BUTTON_TEXTBOOKS_DUE_DATE%>"
                        fieldName = "<%=TextbookEditLoanPeriodForm.FIELD_TEXTBOOKS_DUE%>"
                        dateValue = "<%=form.getDateDue()%>"
                        altText = "Change Due"
                    />
                </td>
            </tr>
        </logic:equal>     
	    <logic:equal name="backoffice_servlet_TextbookEditLoanPeriodForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.ASSET)%>" scope="request" >
	        <tr>
	        	<td>&nbsp;</td>
	        	<td class="ColRowBold">Choose desired loan interval</td>
	        	<td>
                	<base:cancelButton/>
	            </td>
	        </tr>	
	        <tr>
	            <td>&nbsp;</td>
	            <td colspan="2" class="ColRowBold"><html:radio property="<%=TextbookEditLoanPeriodForm.FIELD_DUE_DATE_MODE%>" value="<%=String.valueOf(TextbookEditLoanPeriodForm.DUE_DATE_MODE_SPECIFIED)%>"></html:radio>
				    <base:date 
				        buttonName = "<%=TextbookEditLoanPeriodForm.BUTTON_TEXTBOOKS_DUE_DATE%>"
				        fieldName = "<%=TextbookEditLoanPeriodForm.FIELD_TEXTBOOKS_DUE%>"
				        dateValue = "<%=form.getDateDue()%>"
				        altText = "Change Resources Due"
				    />
	            </td>
	        </tr>
	        <tr>
	            <td>&nbsp;</td>
	            <td colspan="2" class="ColRowBold"><html:radio property="<%=TextbookEditLoanPeriodForm.FIELD_DUE_DATE_MODE%>" value="<%=String.valueOf(TextbookEditLoanPeriodForm.DUE_DATE_MODE_FIXED)%>">
				   <html:text property="<%=TextbookEditLoanPeriodForm.FIELD_DAYS_FIXED%>" size="10" maxlength="3"/> days </html:radio>
	            </td>
	        </tr>
	        <tr>
	            <td>&nbsp;</td>
	            <td colspan="2" class="ColRow"><html:radio property="<%=TextbookEditLoanPeriodForm.FIELD_DUE_DATE_MODE%>" value="<%=String.valueOf(TextbookEditLoanPeriodForm.DUE_DATE_MODE_UNLIMITED)%>"><b><%=SystemDateSpecs.UNLIMITED_DESCRIPTION%></b> (no return date)</html:radio></td>
	        </tr>
	    </logic:equal>
	    <logic:equal name="backoffice_servlet_TextbookEditLoanPeriodForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.MEDIA)%>" scope="request" >
    		<html:hidden property="<%=TextbookEditLoanPeriodForm.FIELD_DUE_DATE_MODE%>" value="<%=String.valueOf(TextbookEditLoanPeriodForm.DUE_DATE_MODE_FIXED)%>"/>
	        <tr>
	            <td class="ColRowBold tdAlignRight">*&nbsp;Loan&nbsp;Period</td>
	            <td class="ColRowBold">
				   <html:text property="<%=TextbookEditLoanPeriodForm.FIELD_DAYS_FIXED%>" size="10" maxlength="3"/>&nbsp;<%=form.buildMaxLoanPeriodString()%>&nbsp;days
	            </td>
	            <td>
	            	<base:cancelButton/>
            	</td>
	        </tr>
	        <tr>
	            <td class="ColRowBold tdAlignRight">*&nbsp;Can&nbsp;be&nbsp;extended</td>
	            <td colspan="2" class="ColRowBold">
				   <html:text property="<%=TextbookEditLoanPeriodForm.FIELD_TIMES_EXTENDED%>" size="10" maxlength="3"/> times
	            </td>
	        </tr>
	    </logic:equal>
        <tr>
          <td class="Instruction tdAlignRight">* = Required Field</td>
          <td class="ColRow" colspan="2">&nbsp;</td>
        </tr>
	    

    </base:outlinedTable>
</base:form>
