<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TransferReceiveForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.StringHelper"%><base:messageBox strutsErrors="true"/>

<%
    TransferReceiveForm form = (TransferReceiveForm) request.getAttribute(TransferReceiveForm.FORM_NAME);

    String focus = "";
    boolean isFilterOn = form.isFilterOn();
    if (form.notAllowingBarcodeAssignment()) {
        focus = TransferReceiveForm.FIELD_NUMBER_OF_COPIES_TO_PROCESS;
    } else {
        if (form.isShowStartingCopyBarcode()) {
            if (form.isAssignNextBarcode()) {
                // don't assign a focus
            } else {
                focus = TransferReceiveForm.FIELD_STARTING_COPY_BARCODE;
            }
        } else if (!isFilterOn) {
            focus = TransferReceiveForm.FIELD_NUMBER_OF_COPIES_TO_PROCESS;
        }
    }
%>

<bean:define id="conditions" name="<%=TransferReceiveForm.FORM_NAME%>" property="conditionOptions"/>

<base:form action="/cataloging/servlet/handletransferreceiveform.do" focus="<%=focus%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=TransferReceiveForm.BUTTON_TRAP_ENTER%>">

  	<html:hidden property="<%=TransferReceiveForm.FIELD_TRANSFER_ID%>"/>
  	<html:hidden property="<%=TransferReceiveForm.FIELD_BIB_ID%>"/>
  	<html:hidden property="<%=TransferReceiveForm.ATTRIBUTE_UNRECEIVED_COPIES%>"/>
	<html:hidden property="<%=TransferReceiveForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_STATE_TRANSFER%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_RECEIVE_TITLE%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_CONSUMABLE%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_NEVERBARCODE%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_HIDDEN_SUBMIT%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_WITHOUT_BARCODES%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_BUNDLE%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_PURCHASE_PRICE_EDITABLE%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_BUDGET_CATEGORY_EDITABLE%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_SHOW_EXTENDED_FORM%>"/>
    
    <html:hidden property="runJobAlways" />

    <bean:define id="budgetCategoryList" name="<%=TransferReceiveForm.FORM_NAME%>" property="budgetCategoryList"/>
    <bean:define id="fundingSourceList" name="<%=TransferReceiveForm.FORM_NAME%>" property="fundingSourceList"/>

    <logic:equal  name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_COLLECTION_TYPE%>" value='<%="" + CollectionType.ASSET%>'>
  		<html:hidden property="<%=TransferReceiveForm.PARAM_ORIGINAL_DEPARTMENT_ID%>"/>
	  	<html:hidden property="<%=TransferReceiveForm.PARAM_ORIGINAL_HOME_LOCATION_ID%>"/>
  		<html:hidden property="<%=TransferReceiveForm.PARAM_ORIGINAL_CUSTODIAN_ID%>"/>
  		<html:hidden property="<%=TransferReceiveForm.PARAM_SITEDEPT_ID%>"/>
  		<html:hidden property="<%=TransferReceiveForm.PARAM_CUSTODIAN_ID%>"/>
  		<html:hidden property="<%=TransferReceiveForm.PARAM_HOME_LOCATION_ID%>"/>
  		<html:hidden property="<%=TransferReceiveForm.FIELD_TRANSFER_DATE%>"/>
  		<html:hidden property="<%=TransferReceiveForm.FIELD_FROM_SITE_NAME%>"/>
	</logic:equal>  	
    <%
  	        if (isFilterOn && !TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_ID.equals(form.getReceiveAsCopyStatus())) {
  	    %>
        <base:barcodeFilterWarning/>
    <%
        }
    %>
    <jsp:include page="/circulation/trapbarcodescan.jsp"/>
    <base:outlinedTable id="<%=TransferReceiveForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
    <tr>
        <td class="TableHeading" colSpan="2">
            Receive Items from 
            <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.FIELD_FROM_SITE_NAME%>"/>
        	(<bean:write name="<%=TransferReceiveForm.FORM_NAME%>"  property="<%=TransferReceiveForm.FIELD_TRANSFER_DATE%>"/>)
        </td>
    </tr>
    <logic:equal  name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_COLLECTION_TYPE%>" value='<%="" + CollectionType.ASSET%>'>
	    <tr>
	        <td COLSPAN="2">
	        	<table id="<%=TransferReceiveForm.TABLE_SUB_HEADER%>" border="0" cellpadding="0" width="100%">			
					<tr>
						<TD class="ColRowBold" nowrap>
				  			Assign the following values to these items:
				  			&nbsp; 
                            <base:genericButton src="/buttons/large/assignto.gif" name="<%=TransferReceiveForm.BUTTON_ASSIGN_TO%>" alt="Assign values"/>
				  			<logic:equal name="<%=TransferReceiveForm.FORM_NAME%>"  property="clearButton" value="true">
                                <base:genericButton src="/buttons/large/clear.gif" name="<%=TransferReceiveForm.BUTTON_CLEAR_ASSIGN_TO%>" alt="Clear"/>
				  			</logic:equal>
				  			
				  		</TD>
					</tr>    			
					<tr>
						<TD nowrap>
							<span class="ColRowBold">Custodian:</span>&nbsp;<span class="ColRow"><bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_CUSTODIAN%>" /></span>
						</td>
					</tr>    			
					<tr>
					    <TD nowrap>
					    	<span class="ColRowBold">Home Location:</span>&nbsp;<span class="ColRow"><bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_HOME_LOCATION%>" /></span>
						</TD>						
					</tr>
					<tr>
					    <TD nowrap>
					    	<span class="ColRowBold">Department:</span>&nbsp;<span class="ColRow"><bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_DEPARTMENT%>" /></span>
						</TD>						
					</tr>					
				</table>
			</td>
		</tr>
	</logic:equal>       
   
    <%
                  if (form.getCollectionType() == CollectionType.ASSET) {
              %>
        <tr>
        <td class="ColRowBold tdAlignRight">Description</td>
        <td class="ColRow">
            <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.FIELD_RECEIVE_TITLE%>"/>
        </td>
        </tr>
    <%
        } else {
    %>
        <tr>
        <td class="ColRowBold" colspan = "2"><%=form.gimmeIcons()%>
            <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.FIELD_RECEIVE_TITLE%>"/>
        <br>
        <%=form.gimmeTitleInfo()%>
        </td>
        </tr>
        
    <%
                }
            %>
       
    <tr>
        <td class="ColRowBold tdAlignRight">
        	Total <%=(form.getCollectionType() == CollectionType.TEXTBOOK ? "Copies" : "Items")%>
        </td>
        <td class="ColRow">
        <%
                    if (form.isUnlimitedCopyResource()) {
               %> 
			<%=TransferReceiveForm.LOCAL_UNLIMITED_TEXT%>
 <%           
     } else {
 %>
			<base:localeNumberTag number="<%=form.gimmeUnbarcodedCount()%>"/>
 
 <%
     }
 %>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=(form.getCollectionType() == CollectionType.TEXTBOOK ? "Copies" : "Items")%> to Receive</td>
        <td class="ColRow">
                <%
                    if (form.isUnlimitedCopyResource()) {
                %> <html:hidden
                    name="<%=TransferReceiveForm.FORM_NAME%>"
                    property="<%=TransferReceiveForm.FIELD_NUMBER_OF_COPIES_TO_PROCESS%>"
                    value="1"/>
                    <%=TransferReceiveForm.LOCAL_UNLIMITED_TEXT%>
<%
     } else {
 %> 
                 <html:text
                    disabled="<%=isFilterOn
                            && !form.getReceiveAsCopyStatus().equals(
                                TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_ID)%>"
                    name="<%=TransferReceiveForm.FORM_NAME%>"
                    property="<%=TransferReceiveForm.FIELD_NUMBER_OF_COPIES_TO_PROCESS%>"
                    size="14" /> <%
     }
 %>
            </td>
    </tr>
    <%
        if (form.notAllowingBarcodeAssignment()) {
    %>
        <html:hidden property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>"/>
        <tr>
            <td class="ColRowBold tdAlignRight">Barcodes</td>
                <td class="ColRow"><%=form.retrieveStaticTextForNotAllowingBarcodeAssignment()%></td>
        </tr>
    <%
        } else {
    %>
        <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="stateTransferToMemberSite" value="true">
            <html:hidden property="<%=TransferReceiveForm.FIELD_ASSIGN_NEXT_BARCODE%>"/>
            <tr>
                <td class="ColRowBold tdAlignRight">Barcodes</td>
                <td class="ColRow" nowrap>
                    <html:select onchange="dropDownSubmit();" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>">
                        <html:option value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_ID)%>"><%=TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_DISPLAYABLE%></html:option>
                        <html:option value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_ID)%>"><%=TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_DISPLAYABLE%></html:option>
                    </html:select>
        		</td>
            </tr>
            <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>" value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_ID)%>">
            <tr>
                <td class="ColRowBold tdAlignRight">Starting barcode</td>
                <td class="ColRow" nowrap>
                    <html:text property="<%=TransferReceiveForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%="" + CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
                    <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
                 </td>
    
             </tr>
            </logic:equal>
        </logic:equal>
        
        <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.FIELD_STATE_TRANSFER%>" value="false">
            <tr>
                <td class="ColRowBold tdAlignRight">Barcodes</td>
                <td class="ColRow" nowrap>
                    <html:select onchange="dropDownSubmit();" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>">
                        <html:option value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_ID)%>"><%=TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_DISPLAYABLE%></html:option>
                        <html:option value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_ID)%>"><%=TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_DISPLAYABLE%></html:option>
                    </html:select>
        		</td>
            </tr>
            
            <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>" value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_ID)%>">
                <tr>
                    <logic:notEqual  name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_COLLECTION_TYPE%>" value='<%="" + CollectionType.ASSET%>'>
                        <td class="tdAlignRight">&nbsp;</td>
                    </logic:notEqual>
                    <logic:equal  name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_COLLECTION_TYPE%>" value='<%="" + CollectionType.ASSET%>'>
                        <td class="ColRowBold tdAlignRight">Assign Barcodes</td>
                    </logic:equal>    
                    <td class="ColRow" nowrap>
                        <html:radio property="<%=TransferReceiveForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="false"
                            onclick='<%="document." + TransferReceiveForm.FORM_NAME + "."
                                        + TransferReceiveForm.FIELD_STARTING_COPY_BARCODE + ".focus();"%>'>
                            Starting barcode
                        </html:radio>
                        <html:text property="<%=TransferReceiveForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%="" + CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                            onfocus='<%="document." + TransferReceiveForm.FORM_NAME + "."
                                    + TransferReceiveForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'/>
                        <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="tdAlignRight">&nbsp;</td>
                    <td class="ColRow">
                    	<html:radio disabled="<%=isFilterOn%>"  property="<%=TransferReceiveForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="true"
                          	onclick='<%="document." + TransferReceiveForm.FORM_NAME + "."
                                        + TransferReceiveForm.FIELD_STARTING_COPY_BARCODE + ".value = \'\'"%>'>
                        	Assign next barcode
                            <% if (!isFilterOn && !(StringHelper.isEmpty(form.getNextDisplayableResourceBarcode())) && form.getCollectionType() == CollectionType.ASSET) { %>
                            &nbsp;&nbsp;&nbsp;&nbsp;[Next: <%=form.getNextDisplayableResourceBarcode()%>]
                            <% } %>
                        </html:radio>
                    </td>
                </tr>
            </logic:equal>
        </logic:equal>
    
        <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>" value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_ASSIGN_BARCODE_ID)%>">
        <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="showPrintLabelsCheckbox" value="true">
            <tr>
                <td class="tdAlignRight"><html:checkbox property="<%=TransferReceiveForm.FIELD_PRINT_LABELS%>"></html:checkbox></td>
                <td class="ColRowBold">
                Print labels    
                </td>
            </tr>
        </logic:equal>
        </logic:equal>
        <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_SHOW_EXTENDED_FORM%>" value="<%=String.valueOf(true)%>">
                <logic:equal  name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>" value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_ID)%>">        
                    <html:hidden property="<%=TransferReceiveForm.PARAM_HOME_LOCATION_ID%>"/>                
                    <html:hidden property="<%=TransferReceiveForm.FIELD_CONDITION%>"/> 
                    <% if (!form.isStateStaticFields()) { %>
                        <% if (form.isPurchasePriceEditable()) { %>
                            <tr>
                                <td class="ColRowBold tdAlignRight">
                                    Purchase Price
                                </td>
                                <td>
                                    <html:text property="<%=TransferReceiveForm.FIELD_PURCHASE_PRICE%>" size="14" maxlength="14"/>
                                </td>
                                
                            </tr>
                            <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                </tr><td>&nbsp;</td><td class="Instruction">Items with an incoming purchase price will keep the purchase price.</td>
                            <%} else { %>
                                </tr><td>&nbsp;</td><td class="Instruction">Copies with an incoming purchase price will keep the purchase price.</td>
                            <%} %>
                        <%} else { %>
                            <tr>
                                <td class="ColRowBold tdAlignRight">
                                    Purchase Price
                                </td>
                                <td class="ColRow">
                                    <%=form.getPurchasePrice()%>
                                    <html:hidden property="<%=TransferReceiveForm.FIELD_PURCHASE_PRICE%>"/> 
                                </td>
                                
                            </tr>
                        <%} %>
                        <% if (form.isBudgetCategoryEditable()) { %>
                            <tr>
                              <td class="FormLabel tdAlignRight">
                                Budget Category
                              </td>
                              <td class="ColRow">
                                    <html:select property="<%=TransferReceiveForm.FIELD_BUDGET_CATEGORY_ID%>">
                                      <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                                    &nbsp;
                                <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TransferReceiveForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
                              </td>
                            </tr>
                            <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                </tr><td>&nbsp;</td><td class="Instruction">Items with an incoming budget category will keep the budget category.</td>                    
                            <%} else { %>
                                </tr><td>&nbsp;</td><td class="Instruction">Copies with an incoming budget category will keep the budget category.</td>                    
                            <%} %>                    
                        <%} else { %>
                            <tr>
                                <td class="ColRowBold tdAlignRight">
                                    Budget Category
                                </td>
                                <td class="ColRow">
                                    <%=form.gimmeDisplayableBudgetCategory()%>
                                    <html:hidden property="<%=TransferReceiveForm.FIELD_BUDGET_CATEGORY_ID%>"/> 
                                </td>
                                
                            </tr>
                        <%} %>
                    <% } %>
                </logic:equal>
        
                <logic:notEqual  name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>" value="<%=String.valueOf(TransferReceiveForm.OPTION_RECEIVE_WITHOUT_BARCODE_ID)%>">        
                        <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.FIELD_STATE_TRANSFER%>" value="false">
                        <% if (!form.isStateStaticFields()) { %>
                            <% if (form.isPurchasePriceEditable()) { %>
                                <tr>
                                    <td class="ColRowBold tdAlignRight">
                                        Purchase Price
                                    </td>
                                    <td>
                                        <html:text property="<%=TransferReceiveForm.FIELD_PURCHASE_PRICE%>" size="14" maxlength="14"/>
                                    </td>
                                    
                                </tr>
                                 <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                    </tr><td>&nbsp;</td><td class="Instruction">Items with an incoming purchase price will keep the purchase price.</td>
                                <%} else { %>
                                    </tr><td>&nbsp;</td><td class="Instruction">Copies with an incoming purchase price will keep the purchase price.</td>
                                <%} %>
                            <%} else { %>
                                <tr>
                                    <td class="ColRowBold tdAlignRight">
                                        Purchase Price
                                    </td>
                                    <td class="ColRow">
                                        <%=form.getPurchasePrice()%>
                                        <html:hidden property="<%=TransferReceiveForm.FIELD_PURCHASE_PRICE%>"/> 
                                    </td>
                                    
                                </tr>
                            <%} %>
                        <%} %>
                       </logic:equal>
                    
                        <% if(!form.getSessionStore().isStateContext()){ %>
                            <tr>
                                <td class="ColRowBold tdAlignRight">
                                    Assign Location
                                </td>
                                <td>
                                    <%= JSPHelper.renderDropDown(TransferReceiveForm.PARAM_HOME_LOCATION_ID, null, form.getLocationList(), form.getHomeLocationID()) %>
                                </td>
                            </tr>
                        <%} %>
                        
                        <% if (form.getCollectionType() == CollectionType.ASSET && form.isTextbookAsset()) { %>
                            <% if (form.isFundingSourceEditable()) { %>
                                <tr>
                                  <td class="FormLabel tdAlignRight">
                                    Funding Source
                                  </td>
                                  <td class="ColRow">
                                        <html:select property="<%=TransferReceiveForm.FIELD_FUNDING_SOURCE_ID%>">
                                          <html:options collection="fundingSourceList" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                  </td>
                                </tr>
                            <%} else { %>
                                <tr>
                                    <td class="ColRowBold tdAlignRight">
                                        Funding Source
                                    </td>
                                    <td class="ColRow">
                                        <%=form.gimmeDisplayableFundingSource()%>
                                        <html:hidden property="<%=TransferReceiveForm.FIELD_FUNDING_SOURCE_ID%>"/> 
                                    </td>
                                    
                                </tr>
                            <%} %>
                        <% } %>
                        
                        <% if (!form.isStateStaticFields() && (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET && form.isTextbookAsset())) { %>
                            <% if (form.isBudgetCategoryEditable()) { %>
                                <tr>
                                  <td class="FormLabel tdAlignRight">
                                    Budget Category
                                  </td>
                                  <td class="ColRow">
                                        <html:select property="<%=TransferReceiveForm.FIELD_BUDGET_CATEGORY_ID%>">
                                          <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                        &nbsp;
                                    <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TransferReceiveForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
                                  </td>
                                </tr>
                                 <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                    </tr><td>&nbsp;</td><td class="Instruction">Items with an incoming budget category will keep the budget category.</td>                    
                                <%} else { %>
                                    </tr><td>&nbsp;</td><td class="Instruction">Copies with an incoming budget category will keep the budget category.</td>                    
                                <%} %>
                            <%} else { %>
                                <tr>
                                    <td class="ColRowBold tdAlignRight">
                                        Budget Category
                                    </td>
                                    <td class="ColRow">
                                        <%=form.gimmeDisplayableBudgetCategory()%>
                                        <html:hidden property="<%=TransferReceiveForm.FIELD_BUDGET_CATEGORY_ID%>"/> 
                                    </td>
                                    
                                </tr>
                            <%} %>
                        <% } %>
                        <tr>
                          <td class="ColRowBold tdAlignRight">Condition</td>
                          <td class="ColRow">
                          <html:select property="<%=TransferReceiveForm.FIELD_CONDITION%>">
                            <html:options collection="conditions" property="longID" labelProperty="stringDesc"/>
                          </html:select>
                          </td>
                        </tr>
                        
                </logic:notEqual>
            </logic:equal>
    <% } %>
    <tr>
        <td colspan="2" class="ColRowBold" align="center" valign="top">
        <%
        String receivingMsg = "Please wait... receiving copies. Process MUST complete.";
        if (form.getCollectionType() == CollectionType.ASSET) {
            receivingMsg = "Please wait... receiving items. Process MUST complete.";
        }
        %>
            <base:showHideTag textToShowWhenHidden="<%=receivingMsg %>">
            <base:genericButton name="Receive" alt="Receive" src="/buttons/large/receivebig.gif" onclick="hideElement()"/>
            <base:cancelButton/>
            </base:showHideTag>
        </td>
    </tr>
    </base:outlinedTable>
</base:form>

<script language="JavaScript">
<!--
function dropDownSubmit() {
    document.<%=TransferReceiveForm.FORM_NAME%>.<%=TransferReceiveForm.FIELD_HIDDEN_SUBMIT%>.value = "true";
    document.<%=TransferReceiveForm.FORM_NAME%>.submit();
}
//-->
</script>

