<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TextbookAssignBarcodesForm form = (TextbookAssignBarcodesForm)request.getAttribute(TextbookAssignBarcodesForm.FORM_NAME);
    boolean isFilterOn = form.isFilterOn();
%>


<%@page import="com.follett.fsc.common.StringHelper"%>
<base:messageBox strutsErrors="true"/>

<bean:define id="conditions" name="<%=TextbookAssignBarcodesForm.FORM_NAME%>" property="conditionOptions"/>
<bean:define id="budgetCategoryList" name="<%= TextbookAssignBarcodesForm.FORM_NAME %>" property="budgetCategoryList"/>
<base:form action="/cataloging/servlet/handletextbookassignbarcodesform.do" focus="<%=TextbookAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=TextbookAssignBarcodesForm.BUTTON_TRAP_ENTER%>">
<html:hidden property="<%=TextbookAssignBarcodesForm.FIELD_BIBID%>"/>
<html:hidden property="<%=TextbookAssignBarcodesForm.ATTRIBUTE_COPIES_WITHOUT_BARCODES%>"/>
<html:hidden property="<%=TextbookAssignBarcodesForm.FIELD_STATE_TEXTBOOK%>"/>
<html:hidden property="<%=TextbookAssignBarcodesForm.FIELD_RESET%>"/>

<%
    if (isFilterOn) {
%>
    <base:barcodeFilterWarning/>
<%
    }
%>

<base:outlinedTable borderColor='#c0c0c0' width="100%" id="<%=TextbookAssignBarcodesForm.TABLE_MAIN%>">
   <tr>
        <td class="TableHeading" colSpan="2">Barcode Copies</td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
          	Title
        </td>
        <td class="ColRow">
         	<bean:write name="<%=TextbookAssignBarcodesForm.FORM_NAME%>" property="<%=TextbookAssignBarcodesForm.FIELD_TITLE%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
        	Copies without Barcodes
        </td>
        <td class="ColRow">
			<base:localeNumberTag number="<%=form.getCopiesWithoutBarcodes()%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Copies to Barcode</td>
        <td class="ColRow">
			<html:text disabled="<%=isFilterOn%>" name="<%=TextbookAssignBarcodesForm.FORM_NAME%>" property="<%=TextbookAssignBarcodesForm.FIELD_COPIES_TO_BARCODE%>" size="14" />
        </td>
    </tr>
    <logic:equal name="<%=TextbookAssignBarcodesForm.FORM_NAME%>" property="<%=TextbookAssignBarcodesForm.FIELD_STATE_TEXTBOOK%>" value="false">
        <tr>
            <td class="ColRowBold tdAlignRight">Assign Barcodes</td>
            <td class="ColRow" nowrap>
                <html:radio property="<%=TextbookAssignBarcodesForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="false"
                    onclick='<%="document." + TextbookAssignBarcodesForm.FORM_NAME + "." + TextbookAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE + ".focus();"%>'>
                    Starting barcode
                </html:radio>
                <html:text property="<%=TextbookAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                    onfocus='<%="document." + TextbookAssignBarcodesForm.FORM_NAME + "." + TextbookAssignBarcodesForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'/>
                <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="tdAlignRight">&nbsp;</td>
            <td class="ColRow">
            	<html:radio disabled="<%=isFilterOn%>"  property="<%=TextbookAssignBarcodesForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="true"
                  	onclick='<%="document." + TextbookAssignBarcodesForm.FORM_NAME + "." + TextbookAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE + ".value = \'\'"%>'>
                	Assign next barcode
                    <%
                        if (!isFilterOn && !(StringHelper.isEmpty(form.getNextDisplayableBarcode()))) {
                    %>
                    &nbsp;&nbsp;&nbsp;&nbsp;[Next: <%=form.getNextDisplayableBarcode()%>]
                    <%
                        }
                    %>
                </html:radio>
            </td>
        </tr>
    </logic:equal>
    
    <logic:equal name="<%=TextbookAssignBarcodesForm.FORM_NAME%>" property="<%=TextbookAssignBarcodesForm.FIELD_STATE_TEXTBOOK%>" value="true">
        <tr>
            <td class="ColRowBold tdAlignRight">Assign Barcodes</td>
            <td class="ColRow" nowrap>
                <html:text property="<%=TextbookAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
                <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
            </td>
        </tr>
    </logic:equal>
    <logic:equal name="<%=TextbookAssignBarcodesForm.FORM_NAME%>" property="showPrintLabelsCheckbox" value="true">
        <tr>
            <td class="tdAlignRight"><html:checkbox property="<%=TextbookAssignBarcodesForm.FIELD_PRINT_LABELS%>"></html:checkbox></td>
            <td class="ColRowBold">
            Print labels    
            </td>
        </tr>
    </logic:equal>
        
        <tr>
            <td class="ColRowBold tdAlignRight">
                Purchase Price
            </td>
            <td>
                <%if (form.getDisplayPrice() == null){ %>
                    <html:text property="<%= TextbookAssignBarcodesForm.FIELD_PURCHASE_PRICE %>" size="14" maxlength="14"/>
                <%}else{ %>
                    <span class="ColRow"> <%=form.getDisplayPrice() %> </span>
                    <html:hidden property="<%=TextbookAssignBarcodesForm.FIELD_PURCHASE_PRICE%>"/> 
                <%} %>
            </td>
        </tr>
       </tr><td>&nbsp;</td><td class="Instruction">Copies with an incoming purchase price will keep the purchase price.</td>   
       <tr>
              <td class="ColRowBold tdAlignRight">Assign Location</td>
              <td class="ColRow">
              <base:selectLocation name="<%= TextbookAssignBarcodesForm.PARAM_HOME_LOCATION_ID %>" includeNone="true" selectedLocationID="<%=form.getHomeLocationID()%>"/>
              &nbsp;
              <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=TextbookAssignBarcodesForm.BUTTON_LOCATION_OTHER%>" alt="Other..."/>
              </td>
         </tr>
        <% if (!form.isBudgetCategoryStatic()) { %>
        <tr>
          <td class="FormLabel tdAlignRight">
            Assign Budget Category
          </td>
          <td class="ColRow">
                <%if (form.getDisplayBudgetCategory() == null){ %>
                    <html:select property="<%= TextbookAssignBarcodesForm.FIELD_BUDGET_CATEGORY_ID %>">
                      <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                    &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookAssignBarcodesForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
                <%}else{ %>
                    <%=form.getDisplayBudgetCategory() %>
                    <html:hidden property="<%=TextbookAssignBarcodesForm.FIELD_BUDGET_CATEGORY_ID%>"/> 
                <%} %>            
          </td>
        </tr><td>&nbsp;</td><td class="Instruction">Copies with an incoming budget category will keep the budget category.</td>
        <tr>
        </tr>        
        <% } %>
        <tr>
          <td class="ColRowBold tdAlignRight">Condition</td>
          <td class="ColRow">
          <html:select property="<%=TextbookAssignBarcodesForm.FIELD_CONDITION%>">
            <html:options collection="conditions" property="longID" labelProperty="stringDesc"/>
          </html:select>
          </td>
        </tr>
    <tr>
        <td class="ColRow tdAlignRight" >
            <base:genericButton name="<%=TextbookAssignBarcodesForm.BUTTON_ASSIGN%>" src="/buttons/large/assignbig.gif" alt="Assign"/>
        </td>
        <td class="ColRow" valign="top">
            <base:cancelButton/>
        </td>
        
    </tr>
</base:outlinedTable>
</base:form>


