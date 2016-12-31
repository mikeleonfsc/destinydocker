<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ItemStatusReportForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="siteLimiterList" name="<%= ItemStatusReportForm.FORM_NAME %>" property="siteLimiterList" />
<bean:define id="sortResultsByList" name="<%= ItemStatusReportForm.FORM_NAME %>" property="sortResultsByList" />


<base:messageBox strutsErrors="true"/>

<%
    ItemStatusReportForm form = (ItemStatusReportForm)request.getAttribute(ItemStatusReportForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleitemstatusreportform.do" focus="<%=form.getFocusField()%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=ItemStatusReportForm.TRAP_ENTER_KEY %>">

<html:hidden property="<%= ItemStatusReportForm.FIELD_SITE_LIMITER_CHANGED %>"/>
<html:hidden property="<%= ItemStatusReportForm.FIELD_PRICE_MODE_CHANGED %>"/>
<html:hidden property="<%= ItemStatusReportForm.PARAM_DEPT_ALL_SELECTED %>"/>
<html:hidden property="<%= ItemStatusReportForm.PARAM_LOC_ALL_SELECTED %>"/>

<base:outlinedTable id="<%= ItemStatusReportForm.TABLE_ITEM_STATUS%>" borderColor='#c0c0c0' width="97%" cellpadding="0" cellspacing="2">
    <tr>
        <td class="TableHeading">Item Status
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <logic:equal name="<%=ItemStatusReportForm.FORM_NAME%>" property="<%=ItemStatusReportForm.PARAM_IS_DISTRICT_USER%>" value="true">
        <tr>
            <td align="center">
                <table id="<%=ItemStatusReportForm.TABLE_SELECT_SITE_LIMITER %>">
                    <tr>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        For &nbsp;
                    </td>
                    <td class="ColRow">
                        <html:select property="<%=ItemStatusReportForm.FIELD_SITE_LIMITER%>" onchange="siteLimiterSelected()">
                            <html:options collection="siteLimiterList" property="longID"
                                           labelProperty="stringDesc"/>
                        </html:select>
                    </td>
                    </tr>
                 </table>
             </td>
        </tr>
        <tr>
            <td colspan="2">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>
    </logic:equal>
    
    <tr>
        <td align="center">
            <table id="<%= ItemStatusReportForm.TABLE_SELECT_LIMITERS %>" cellpadding="0" cellspacing="5">
                <tr>
                    <td class="ColRowBold tdAlignLeft" colspan="3">
                            Include items with the following...
                        <br><br>
                    </td>
                </tr>
                
                <tr>
                    <td class="ColRowBold tdAlignLeft" nowrap valign="top">
                        Resource Types
                    </td>
                    <td nowrap valign="top" colspan="2">
                        <base:assetTypesList formName="<%= ItemStatusReportForm.FORM_NAME%>" tableWidth="100"/>
                    </td>
                </tr>
                
                <tr>
                    <td class="ColRowBold tdAlignLeft" nowrap valign="top">
                        Custodian
                    </td>
                    <td nowrap valign="top" colspan="2">
                        <base:custodiansList formName="<%= ItemStatusReportForm.FORM_NAME%>" tableWidth="100"/>
                    </td>
                </tr>

                <tr>
                    <td class="ColRowBold tdAlignLeft" nowrap valign="top">
                        Department
                    </td>
                    <td nowrap valign="top" colspan="2">
                        <base:departmentsList formName="<%= ItemStatusReportForm.FORM_NAME%>" tableWidth="100"/>
                    </td>
                </tr>

                <logic:notEqual name="<%=ItemStatusReportForm.FORM_NAME%>" property="<%= ItemStatusReportForm.FIELD_SITE_LIMITER %>" value='<%= "" + ConfigSiteSpecs.SITE_ID_MY_DISTRICT%>'>
                    <tr>
                        <td class="ColRowBold tdAlignLeft" nowrap valign="top">
                            Home Location
                        </td>
                        <td nowrap valign="top" colspan="2">
                            <base:locationsList formName="<%= ItemStatusReportForm.FORM_NAME%>" tableWidth="100"/>
                        </td>
                    </tr>
                </logic:notEqual>

                <tr>
                    <td class="ColRowBold" nowrap valign="top">
                        Funding Source
                    </td>
                    <td nowrap valign="top" colspan="2">
                        <base:fundingSourcesList formName="<%= ItemStatusReportForm.FORM_NAME%>" tableWidth="100"/>
                    </td>
                </tr>
        
                <tr>
                    <td class="ColRowBold tdAlignLeft" nowrap>
                        Purchase Price 
                    </td>
                    <td class="ColRow">
                        <html:select onchange="showHidePrice()" property="<%=ItemStatusReportForm.FIELD_PURCHASE_PRICE_MODE%>">
                              <html:option value="<%=String.valueOf(ItemStatusReportForm.PRICE_MODE_GREATER_THAN_OR_EQUAL_TO)%>">Greater than or equal to</html:option>
                              <html:option value="<%=String.valueOf(ItemStatusReportForm.PRICE_MODE_LESS_THAN)%>">Less than</html:option>
                              <html:option value="<%=String.valueOf(ItemStatusReportForm.PRICE_MODE_NO_PRICE)%>">No purchase price</html:option>
                        </html:select>&nbsp;
                    </td>
                    <logic:notEqual name="<%=ItemStatusReportForm.FORM_NAME%>" property="<%= ItemStatusReportForm.FIELD_PURCHASE_PRICE_MODE %>" value='<%= "" + ItemStatusReportForm.PRICE_MODE_NO_PRICE%>'>
                        <td class="ColRow">
                            <html:text property="<%=ItemStatusReportForm.FIELD_PURCHASE_PRICE%>" size="10" maxlength="10"/>
                        </td>
                    </logic:notEqual>
                </tr>
                
                <tr>
                    <!-- turn on all checkboxes -->
                    <td class="ColRowBold tdAlignRight" vAlign="top">Status</td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                    
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_APPROVED_FOR_DISPOSAL%>"></html:checkbox>
                        Approved for Disposal
                    </td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_NO_LONGER_IN_USE%>"></html:checkbox>
                        No Longer in Use
                    </td>
                    
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_AVAILABLE%>"></html:checkbox>
                        Available
                    </td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_OUT_FOR_REPAIRS%>"></html:checkbox>
                        Out for Repairs
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
                    <td vAlign=top class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_AVAILABLE_FOR_PARTS%>"></html:checkbox>
                        Available for Parts
                    </td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_READY_FOR_DISPOSAL%>"></html:checkbox>
                        Ready for Disposal
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_CHECKED_OUT%>"></html:checkbox>
                        Checked Out
                    </td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_RETIRED%>"></html:checkbox>
                        Retired
                    </td>
                    
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_IN_TRANSIT%>"></html:checkbox>
                        In Transit
                    </td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_RETURNED_TO_VENDOR%>"></html:checkbox>
                        Returned to Vendor
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_IN_USE%>"></html:checkbox>
                        In Use
                    </td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_STOLEN%>"></html:checkbox>
                        Stolen
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
                    <td vAlign="top" class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=ItemStatusReportForm.FIELD_STATUS_LOST%>"></html:checkbox>
                        Lost
                    </td>
                    <td>&nbsp;</td>
                </tr>
                
            </table>
        </td>
        
        <tr>
            <td>
                <base:imageLine height="1" width="100%"/>
            </td>
        </tr>
        
        <tr>
            <td align="center">
                <table id="<%=ItemStatusReportForm.TABLE_SORT_RESULTS_BY %>">
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap>
                            Sort results by &nbsp;
                        </td>
                        <td class="ColRow tdAlignLeft">
                            <html:select property="<%=ItemStatusReportForm.FIELD_SORT_RESULTS_BY%>">
                                <html:options collection="sortResultsByList" property="longID"
                                               labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap>
                            Show &nbsp;
                        </td>
                        <td class="ColRow tdAlignLeft">
                            <html:select property="<%=ItemStatusReportForm.FIELD_SHOW%>">
                                <html:option value="<%=Integer.toString(ItemStatusReportForm.SHOW_SUMMARY_ONLY)%>"> 
                                    <%=ItemStatusReportForm.SHOW_SUMMARY_ONLY_TEXT%>
                                </html:option>
                                <html:option value="<%=Integer.toString(ItemStatusReportForm.SHOW_DETAIL)%>"> 
                                    <%=ItemStatusReportForm.SHOW_DETAIL_TEXT%>
                                </html:option>
                            </html:select>
                        </td>    
                    </tr>
                 </table>
             </td>
        </tr>
        <tr>
            <td colspan="2">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>
        <tr>
            <td align="center" class="ColRowBold">
                <base:reportButton/>
            </td>
    </tr>
        
</base:outlinedTable>

</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function siteLimiterSelected() {
    document.<%=ItemStatusReportForm.FORM_NAME%>.<%=ItemStatusReportForm.FIELD_SITE_LIMITER_CHANGED%>.value = "true";
    document.<%=ItemStatusReportForm.FORM_NAME%>.submit();
}

function showHidePrice() {
    document.<%=ItemStatusReportForm.FORM_NAME%>.<%=ItemStatusReportForm.FIELD_PRICE_MODE_CHANGED%>.value = "true";
    document.<%=ItemStatusReportForm.FORM_NAME%>.submit();
}

//-->
</script>

