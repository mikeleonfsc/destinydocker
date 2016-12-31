<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.TransferSearchRecord"%>
<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleSearchVO"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.HTMLHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    OrderAddShipmentForm form = (OrderAddShipmentForm) request.getAttribute(OrderAddShipmentForm.FORM_NAME);

%>
<% if (!form.isPrinterFriendly()) { %>

<base:messageBox strutsErrors="true"/>
<% } %>

<base:form action="/cataloging/servlet/handleorderaddshipmentform.do" enctype="multipart/form-data">

<html:hidden property="<%=OrderAddShipmentForm.PARAM_ACTION %>" />
<html:hidden property="<%=OrderAddShipmentForm.PARAM_PAGE %>" />
<html:hidden property="<%=OrderAddShipmentForm.FIELD_TOTAL_COUNT %>" />
<html:hidden property="<%=OrderAddShipmentForm.PARAM_LAST_BIBID %>" />
<html:hidden property="<%=OrderAddShipmentForm.PARAM_LAST_COUNT_SELECTED %>" />
<html:hidden property="<%=OrderAddShipmentForm.PARAM_WHERE_WAS_ENTER %>" />
<html:hidden property="<%=OrderAddShipmentForm.FIELD_OLD_TRANSFER_SETTING%>"/>
<html:hidden property="<%=OrderAddShipmentForm.FIELD_ORDERNUM%>" />
<html:hidden property="<%=OrderAddShipmentForm.FIELD_ORDER_ID%>" />
<html:hidden property="<%=OrderAddShipmentForm.FIELD_TO_SITENAME%>" />
<html:hidden property="<%=OrderAddShipmentForm.FIELD_TO_SITEID%>" />
<html:hidden property="<%=OrderAddShipmentForm.PARAM_COLLECTION_TYPE %>" value="<%= String.valueOf(form.getCollectionType()) %>" />
<html:hidden property="<%=OrderAddShipmentForm.CHECKBOX_CREATE_PICK_LIST%>" value="on"/>

<input type="hidden" name="<%=OrderAddShipmentForm.PARAM_ENTER_PRESSED%>" />

<%!
    String getTitleColumnCaption(OrderAddShipmentForm form)
    {
      return form.getCollectionType() == CollectionType.ASSET ? "Resource" : "Title";
    }
%>

<% if (form.isPrinterFriendly()) { %>
    <table>
        <tr>
            <td colspan="2"></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignLeft">Ship To</td>
            <td class="ColRow" valign="top">
                <%=form.getToSiteName() %>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignLeft">Order #</td>
            <td class="ColRow" valign="top">
                <%=form.getOrderNum() %>
            </td>
        </tr>
    </table>
    <table width = "100%">
        <tr>
            <td class="SmallColHeading" colspan="2">
                <c:if test = "<%= form.getCurrentlySelectedTitles().size() > 0 %>" >
                    <%=form.getCollectionType() == CollectionType.ASSET ? "Resources currently selected" : "Titles currently selected" %>: <%= form.getCurrentlySelectedTitles().size() %>
                </c:if>
                <c:if test = "<%= form.getCurrentlySelectedTitles().size() == 0 %>" >
                    &nbsp;
                </c:if>
            </td>
        </tr>
        <tr>
            <td colspan = "4">
                <% List<TransferSearchRecord> list = form.getFoundTitles();
                 if (!list.isEmpty()) {%>
                <table id = "<%= OrderAddShipmentForm.TABLE_TITLE_SEARCH_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                    <tr>
                        <td class = "SmallColHeading"><%=getTitleColumnCaption(form)%></td>
                        <td align = "center" class = "SmallColHeading">Available to Ship<br/>(Unbarcoded)</td>
                        <td align = "center" class = "SmallColHeading"># needed<br/>to fulfill</td>
                        <td align = "center" class = "SmallColHeading"># to Ship</td>
                        <td>&nbsp;</td>
                    </tr>
                    <%
                        Iterator it = list.iterator();
                        boolean firstRow = true;
                        while (it.hasNext()) {
                            out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                            firstRow = false;
                        }
                    %>
                </table>
                <% } %>
            </td>
        </tr>
         <tr>
            <td colspan = "4">
                <%
                    List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                    if (list2.size() > 0) {
                %>
                <table id = "<%= OrderAddShipmentForm.TABLE_TITLE_CURRENTLY_SELECTED %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                    <tr>
                        <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                    </tr>
                    <tr>
                        <td class = "SmallColHeading">Title</td>
                        <td align = "center" class = "SmallColHeading">Available to Ship<br/>(Unbarcoded)</td>
                        <td align = "center" class = "SmallColHeading"># needed<br/>to fulfill</td>
                        <td align = "center" class = "SmallColHeading"># to Ship</td>
                        <td>&nbsp;</td>
                    </tr>
                    <%
                        Iterator it2 = list2.iterator();
                        boolean firstRow = true;
                        while (it2.hasNext()) {
                            out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                            firstRow = false;
                        }
                    %>
                </table>
                <% } %>
            </td>
        </tr>    
    </table>        
<% } else { %>
     <tr>
        <td>
            <table id="<%=OrderAddShipmentForm.TABLE_MAIN%>" width="100%" border="0" cellspacing="0" cellpadding="4">
                <tr>
                    <td colspan="2" class="TableHeading">
                    <%=form.getCollectionType() == CollectionType.ASSET ? "Ship Resources..." : "Ship Textbooks..." %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">To</td>
                    <td class="ColRow" valign="top">
                        <%=form.getToSiteName() %>
                    </td>             
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">Ship</td>
                    <td class="ColRowBold">
                        <html:select property="<%=OrderAddShipmentForm.FIELD_TRANSFER_BY%>"  onchange="this.form.submit(); return false;">
                            <html:option value='<%= "" +OrderAddShipmentForm.TRANSFER_BY_BARCODE%>'>by Barcode</html:option>
                            <html:option value = '<%= "" + OrderAddShipmentForm.TRANSFER_BY_COPY_COUNT %>'>
                                <%=form.getCollectionType() == CollectionType.ASSET ? "by Item Count" : "by Copy Count" %>
                            </html:option>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">Order #</td>
                    <td class="ColRow" valign="top">
                        <%=form.getOrderNum() %>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
            <logic:equal name="<%=OrderAddShipmentForm.FORM_NAME%>" property="<%=OrderAddShipmentForm.FIELD_TRANSFER_BY%>" value='<%= "" + OrderAddShipmentForm.TRANSFER_BY_BARCODE%>'>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <base:barcodeList barcodeType="<%= Barcode.BARCODETYPE_COPY %>"
                            formName="<%=OrderAddShipmentForm.FORM_NAME%>"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
            </logic:equal>
            <logic:equal name="<%=OrderAddShipmentForm.FORM_NAME%>" property="<%=OrderAddShipmentForm.FIELD_TRANSFER_BY%>" value='<%= "" + OrderAddShipmentForm.TRANSFER_BY_COPY_COUNT%>'>
                 <tr>
                    <td class="ColRowBold" colspan="2">&nbsp;</td>
                    <td class="tdAlignRight">
                        <base:link page='<%= form.buildPrinterFriendlyLink("/cataloging/servlet/handleorderaddshipmentform.do") %>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/small/printerfriendly.gif' alt="Printer Friendly" align="absbottom"/></base:link>
                    </td>       
                </tr>
                <tr>                           
                    <td class="SmallColHeading" colspan="2">
                        <c:if test="<%= form.getCurrentlySelectedTitles().size() > 0 %>" >
                            <%=form.getCollectionType() == CollectionType.ASSET ? "Resources currently selected" : "Titles currently selected" %>: <%= form.getCurrentlySelectedTitles().size() %>                         
                        </c:if>
                        <c:if test="<%= form.getCurrentlySelectedTitles().size() == 0 %>" >
                            &nbsp;
                        </c:if>
                    </td>    
                    <td class="ColRowBold tdAlignRight">
                        <base:genericShowHideButton src="/buttons/small/shipit.gif" 
                            name="<%= OrderAddShipmentForm.BUTTON_SHIP_IT%>" 
                            alt="<%= form.getCollectionType() == CollectionType.ASSET ? OrderAddShipmentForm.ALT_SHIP_ITEMS : OrderAddShipmentForm.ALT_SHIP_COPIES %>"
                            elementID="<%= OrderAddShipmentForm.BUTTON_SHIP_IT %>"/>   
                    </td>
                </tr>
                <c:if test="<%= form.getFoundTitles().size() > 0 %>">   
                    <tr>
                        <td class="SmallColHeading tdAlignRight" colspan="3" nowrap="nowrap"><%= form.buildPageLinks() %></td>
                    </tr>             
                </c:if>
                <tr>
                    <td colspan="3">
                        <% List<TransferSearchRecord> list = form.getFoundTitles();
                        if (!list.isEmpty()) { %>
                        <table id="<%= OrderAddShipmentForm.TABLE_TITLE_SEARCH_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width="100%">
                            <tr>
                                <td class="SmallColHeading"><%=getTitleColumnCaption(form)%></td>
                                <td align="center" class="SmallColHeading">Available to Ship<br/>(Unbarcoded)</td>
                                <td align="center" class="SmallColHeading"># needed<br/>to fulfill</td>
                                <td align="center" class="SmallColHeading"># to Ship</td>
                                <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                            </tr>
                            <% 
                                Iterator it = list.iterator();
                                boolean firstRow = true;
                                while (it.hasNext()) {
                                    out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                    firstRow = false;
                                }
                            %>
                            <tr>
                                <td colspan="3">&nbsp;</td>
                                <td class="SmallColHeading tdAlignRight" nowrap="nowrap"><%= form.buildPageLinks() %></td>
                            </tr>
                        </table>
                        <% } %>
                    </td>                            
                </tr>

                <tr>
                    <td colspan="3">
                        <% List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                        if (!list2.isEmpty()) { %>
                        <table id="<%= OrderAddShipmentForm.TABLE_TITLE_CURRENTLY_SELECTED %>" border="0" cellpadding="4" cellspacing="0" width="100%">
                            <tr>
                                <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan="4">&nbsp;&nbsp;<span class="SectionHeader">&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                            </tr>
                            <tr>
                                <td class="SmallColHeading"><%=getTitleColumnCaption(form)%></td>
                                <td align="center" class="SmallColHeading">Available to Ship<br/>(Unbarcoded)</td>
                                <td align="center" class="SmallColHeading"># needed<br/>to fulfill</td>
                                <td align="center" class="SmallColHeading"># to Ship</td>
                                <td>&nbsp;</td>
                            </tr>
                            <% 
                                Iterator it2 = list2.iterator();
                                boolean firstRow = true;
                                while (it2.hasNext()) {
                                    out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                    firstRow = false;
                                }
                            %>
                        </table>
                        <% } %>
                    </td>  
                </tr>  
            </logic:equal>
    
    
            <tr>
                <td colspan="3" align="center" class="ColRowBold">
                    Upon shipment, ownership will be immediately changed to the receiving site and an order packing list will be created in the Job Manager. 
                </td>
            </tr>
            <tr>
               <td colspan="3" align="center" class="ColRowBold">
                            <base:genericShowHideButton src="/buttons/small/shipit.gif" 
                                name="<%= OrderAddShipmentForm.BUTTON_SHIP_IT %>" 
                                alt="<%= form.getCollectionType() == CollectionType.ASSET ? OrderAddShipmentForm.ALT_SHIP_ITEMS : OrderAddShipmentForm.ALT_SHIP_COPIES %>"
                                elementID="<%= OrderAddShipmentForm.BUTTON_SHIP_IT %>"/>
                 </td>
             </tr>
         </table>
        </td>
      </tr>
<% } %>

</base:form>

<%= form.buildJavaScriptForPageChange() %>

                    
