<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
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
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

    AssetAssignBarcodesForm form = (AssetAssignBarcodesForm)request.getAttribute(AssetAssignBarcodesForm.FORM_NAME);
    boolean isFilterOn = form.isFilterOn();
    
    String focus = "";
    if (!AssetAssignBarcodesForm.RADIO_ASSIGN_NEXT_BARCODE.equals(form.getAssignNextBarcode())) {
        focus = AssetAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE;
    }
%>


<%@page import="com.follett.fsc.common.StringHelper"%>
<base:messageBox strutsErrors="true"/>

<bean:define id="budgetCategoryList" name="<%= AssetAssignBarcodesForm.FORM_NAME %>" property="budgetCategoryList"/>
<bean:define id="departmentList" name="<%= AssetAssignBarcodesForm.FORM_NAME %>" property="departmentList"/>
<bean:define id="fundingSourceList" name="<%= AssetAssignBarcodesForm.FORM_NAME %>" property="fundingSourceList"/>
<base:form action="/cataloging/servlet/handleassetassignbarcodesform.do" focus="<%=focus%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=AssetAssignBarcodesForm.BUTTON_TRAP_ENTER%>">
<html:hidden property="<%=AssetAssignBarcodesForm.FIELD_BIBID%>"/>
<html:hidden property="<%=AssetAssignBarcodesForm.ATTRIBUTE_COPIES_WITHOUT_BARCODES%>"/>
<html:hidden property="<%=AssetAssignBarcodesForm.FIELD_RESET%>"/>
<html:hidden property="<%=AssetAssignBarcodesForm.PARAM_COLLECTION_TYPE %>"/>

<%
    if (isFilterOn) {
%>
    <base:barcodeFilterWarning/>
<%
    }
%>

<base:outlinedTable borderColor='#c0c0c0' width="100%" id="<%=AssetAssignBarcodesForm.TABLE_MAIN%>">
   <tr>
        <td class="TableHeading" colSpan="2" >Barcode Items</td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
          	Resource
        </td>
        <td class="ColRow">
         	<bean:write name="<%=AssetAssignBarcodesForm.FORM_NAME%>" property="<%=AssetAssignBarcodesForm.FIELD_TITLE%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
        	 Items without Barcodes
        </td>
        <td class="ColRow">
			<base:localeNumberTag number="<%=form.getCopiesWithoutBarcodes()%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Items to Barcode</td>
        <td class="ColRow">
			<html:text disabled="<%=isFilterOn%>" name="<%=AssetAssignBarcodesForm.FORM_NAME%>" property="<%=AssetAssignBarcodesForm.FIELD_COPIES_TO_BARCODE%>" size="14" />
        </td>
    </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">Assign Barcodes</td>
            <td class="ColRow" nowrap>
                <html:radio
                    property="<%=AssetAssignBarcodesForm.FIELD_ASSIGN_NEXT_BARCODE%>"
                    value="<%=AssetAssignBarcodesForm.RADIO_EXPLICIT_BARCODE%>"
                    onclick='<%="document." + AssetAssignBarcodesForm.FORM_NAME + "." + AssetAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE + ".focus();"%>'>
                    Starting barcode
                </html:radio>
                <html:text property="<%=AssetAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                    onfocus='<%="document." + AssetAssignBarcodesForm.FORM_NAME + "." + AssetAssignBarcodesForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'/>
                <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="tdAlignRight">&nbsp;</td>
            <td class="ColRow">
            	<html:radio
                    property="<%=AssetAssignBarcodesForm.FIELD_ASSIGN_NEXT_BARCODE%>"
                    value="<%=AssetAssignBarcodesForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                    onclick='<%="document." + AssetAssignBarcodesForm.FORM_NAME + "." + AssetAssignBarcodesForm.FIELD_STARTING_COPY_BARCODE + ".value = \'\'"%>'>
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
        <tr>
            <td class="tdAlignRight"><html:checkbox property="<%=AssetAssignBarcodesForm.FIELD_PRINT_LABELS%>"></html:checkbox></td>
            <td class="ColRowBold">
            Print labels    
            </td>
        </tr>
        
        <tr>
            <td class="ColRowBold tdAlignRight">
                Purchase Price
            </td>
            <td>
                <%if (form.getDisplayPrice() == null){ %>
                    <html:text property="<%= AssetAssignBarcodesForm.FIELD_PURCHASE_PRICE %>" size="14" maxlength="14"/>
                <%}else{ %>
                    <span class="ColRow"> <%=form.getDisplayPrice() %> </span>
                    <html:hidden property="<%=AssetAssignBarcodesForm.FIELD_PURCHASE_PRICE%>"/> 
                <%} %>
                <span class="Instruction">*</span>
            </td>
        </tr>  
        <tr>
          <td class="FormLabel tdAlignRight">
            Assign Home Location
          </td>
          <td class="ColRow">
                <%if (form.getDisplayLocation() == null){ %>
                    <base:selectLocation name="<%= AssetAssignBarcodesForm.FIELD_LOCATION_ID %>" includeNone="true" selectedLocationID="<%=form.getLocationID()%>"/>
                    &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=AssetAssignBarcodesForm.BUTTON_LOCATION_OTHER%>" alt="Other"/>
                <%}else{ %>
                    <%=form.getDisplayLocation() %>
                    <html:hidden property="<%=AssetAssignBarcodesForm.FIELD_LOCATION_ID%>"/> 
                <%} %><span class="Instruction">*</span>            
          </td>
        </tr> 
        <% if (form.isTextbookAsset()) { %>
            <tr>
              <td class="FormLabel tdAlignRight">
                Assign Budget Category
              </td>
              <td class="ColRow">
                    <%if (form.getDisplayBudgetCategory() == null){ %>
                        <html:select property="<%= AssetAssignBarcodesForm.FIELD_BUDGET_CATEGORY_ID %>">
                          <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                        &nbsp;
                <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=AssetAssignBarcodesForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
                    <%}else{ %>
                        <%=form.getDisplayBudgetCategory() %>
                        <html:hidden property="<%=AssetAssignBarcodesForm.FIELD_BUDGET_CATEGORY_ID%>"/> 
                    <%} %><span class="Instruction">*</span>            
              </td>
            </tr>        
        <% } %>
        <tr>
          <td class="FormLabel tdAlignRight">
            Assign Custodian
          </td>
          <td class="ColRow">
                <% form.buildCustodianField(out); %> 
          </td>
        </tr> 
        <tr>
          <td class="FormLabel tdAlignRight">
            Assign Department
          </td>
          <td class="ColRow">
                <%if (form.getDisplayDepartment() == null){ %>
                    <html:select property="<%= AssetAssignBarcodesForm.FIELD_DEPARTMENT_ID %>">
                      <html:options collection="departmentList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                    &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=AssetAssignBarcodesForm.BUTTON_DEPARTMENT_OTHER%>" alt="Other"/>
                <%}else{ %>
                    <%=form.getDisplayDepartment() %>
                    <html:hidden property="<%=AssetAssignBarcodesForm.FIELD_DEPARTMENT_ID%>"/> 
                <%} %><span class="Instruction">*</span>            
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Assign Funding Source
          </td>
          <td class="ColRow">
                <%if (form.getDisplayFundingSource() == null){ %>
                    <html:select property="<%= AssetAssignBarcodesForm.FIELD_FUNDING_SOURCE_ID %>">
                      <html:options collection="fundingSourceList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                    <% if(store.canView(Permission.CAT_MANAGE_ASSET_TEMPLATES)) { %>
                        &nbsp;
                        <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=AssetAssignBarcodesForm.BUTTON_FUNDING_SOURCE_OTHER%>" alt="Other"/>
                    <% } %>
                <%}else{ %>
                    <%=form.getDisplayFundingSource() %>
                    <html:hidden property="<%=AssetAssignBarcodesForm.FIELD_FUNDING_SOURCE_ID%>"/> 
                <%} %><span class="Instruction">*</span>            
          </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="Instruction">* Items will retain the existing value if already defined.</td> 
        </tr>
    <tr>
        <td class="ColRow tdAlignRight" >
            <base:genericButton name="<%=AssetAssignBarcodesForm.BUTTON_ASSIGN%>" src="/buttons/large/assignbig.gif" alt="Assign"/>
        </td>
        <td class="ColRow" valign="top">
            <base:cancelButton/>
        </td>
        
    </tr>
</base:outlinedTable>
</base:form>


