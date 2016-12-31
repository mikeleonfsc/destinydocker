<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.FineEstimateReturn" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.FineEstimateResult" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
	EstimatedFineForm form = (EstimatedFineForm)request.getAttribute(EstimatedFineForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    FineEstimateReturn fine = form.getFineEstimateReturn();
%>

<%
    if (printerFriendly) {
%>
    
<%@page import="com.follett.fsc.common.consortium.UserContext"%><script language="Javascript" type="text/javascript">
    <!--
    function submitFormNotPrinterFriendlyForIE() {
        document.forms["<%=EstimatedFineForm.FORM_NAME%>"].elements["<%=EstimatedFineForm.FIELD_PATRON_ID%>"].value="<%=form.getPatronID()%>";
        document.forms["<%=EstimatedFineForm.FORM_NAME%>"].elements["<%=EstimatedFineForm.FIELD_PRINTER_FRIENDLY%>"].value="false";
        document.forms["<%=EstimatedFineForm.FORM_NAME%>"].submit();
    }
    //-->
    </script>
<%
    }
%>

<base:form action="/circulation/servlet/handleestimatedfineform.do">
    <input type="hidden" name="<%=EstimatedFineForm.FIELD_PATRON_ID%>"/>
    <input type="hidden" name="<%=EstimatedFineForm.FIELD_PRINTER_FRIENDLY%>"/>
    <base:outlinedTable borderColor='#C0C0C0' id="outlinedTable" width="98%">
        <tr>
            <td class="TableHeading"><%= MessageHelper.formatMessage("estimatedfine_CurrentFineEstimate") %></td>
            <td class="tdAlignRight">
<%
            if (!printerFriendly) {
%>
                    <a href="/circulation/servlet/presentestimatedfineform.do?patronID=<%=form.getPatronID()%>&printerFriendly=true" id="<%=EstimatedFineForm.ID_PRINT %>">
                        <base:image src='/buttons/large/printit.gif' alt='<%= MessageHelper.formatMessage("printIt") %>'/>
                    </a>
<%
            }
%>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <table id="<%=EstimatedFineForm.TABLE_ESTIMATED_FINE_BOX%>" width="100%" cellspacing="0" cellpadding="2">
                    <tr>
                        <td class="ColRowBold">
						<%= MessageHelper.formatMessage("estimatedfine_OverduesFor",fine.getPatronName(), fine.getPatronBarcode())%>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <table id="<%=EstimatedFineForm.TABLE_ESTIMATED_FINE_LIST_BOX%>" width="100%" cellspacing="0" cellpadding="2">
                                <tr valign="top">
                                    <td class="ColRowBold"><%= MessageHelper.formatMessage("estimatedfine_DueDate") %></td>
                                    <td class="ColRowBold"><%= MessageHelper.formatMessage("estimatedfine_Title") %></td>
                                    <td class="ColRowBold"><%= MessageHelper.formatMessage("estimatedfine_Barcode") %></td>
                                    <td class="ColRowBold"><%= MessageHelper.formatMessage("estimatedfine_Estimated") %></td>
                                </tr>
                                <logic:iterate id="fineResult" name="<%=EstimatedFineForm.FORM_NAME%>"
                                               property="list" type="FineEstimateResult">
                                    <tr valign="top">
                                        <td class="ColRow"><%=form.formattedDate(fineResult.getDueDate())%></td>
                                        <td class="ColRow"><%=fineResult.getTitle()%></td>
                                        <td class="ColRow"><%=form.formattedOffsiteShortName(fineResult.getSiteShortName(), fineResult.getSiteID(), printerFriendly)%>
                                            <%=fineResult.getDisplayableBarcode()%></td>
                                        <td class="ColRow"><%=form.formattedCurrency(fineResult.getAmount(), fineResult.getSiteID())%></td>
                                    </tr>
                                </logic:iterate>
                                <tr><td class="ColRow">&nbsp;</td></tr>
                                <tr><td class="ColRow">&nbsp;</td></tr>
                                <tr>
                                    <td class="ColRowBold tdAlignRight" colspan="3"><%= MessageHelper.formatMessage("estimatedfine_TotalEstimatedFines") %>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                    <td class="ColRowBold"><%=form.formattedCurrency(fine.getTotalAmount(), null)%></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td class="tdAlignRight">
<%
                        if (!printerFriendly) {
%>
                                <a href="javascript:window.close();" class="detailLink">
                                    <img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/buttons/large/close.gif")%>' border="0" alt='<%= MessageHelper.formatMessage("close") %>'>
                                </a>
<%
                        }
%>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>

</base:form>

<%
    if (printerFriendly) {
%>
    <script language="Javascript" type="text/javascript">
    <!--
    if (document.all) { //ie
        window.onafterprint=function(){window.submitFormNotPrinterFriendlyForIE(); return false;}
    }
    window.print();
    if (document.all) { //ie
        ; //resubmit done in submitFormNotPrinterFriendlyForIE
    } else if (document.layers) { //netscape
        document.<%=EstimatedFineForm.FORM_NAME%>.<%=EstimatedFineForm.FIELD_PATRON_ID%>.value="<%=form.getPatronID()%>";
        document.<%=EstimatedFineForm.FORM_NAME%>.<%=EstimatedFineForm.FIELD_PRINTER_FRIENDLY%>.value="false";
        document.<%=EstimatedFineForm.FORM_NAME%>.submit();
    } else if (document.getElementById) { //other
        document.<%=EstimatedFineForm.FORM_NAME%>.<%=EstimatedFineForm.FIELD_PATRON_ID%>.value="<%=form.getPatronID()%>";
        document.<%=EstimatedFineForm.FORM_NAME%>.<%=EstimatedFineForm.FIELD_PRINTER_FRIENDLY%>.value="false";
        document.<%=EstimatedFineForm.FORM_NAME%>.submit();
    }
    //-->
    </script>
<%
    }
%>
