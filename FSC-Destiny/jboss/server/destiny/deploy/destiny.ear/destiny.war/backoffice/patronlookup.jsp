<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><base:messageBox strutsErrors="true"/>

<%
    String formName = (String)request.getAttribute(PatronLookupForm.ATTRIBUTE_FORM_NAME);
    PatronLookupForm form = (PatronLookupForm)request.getAttribute(formName);
    List messageList = form.getHoldsMessage();
    if ( messageList != null && messageList.size() > 0 ) { %>

    <base:messageBox>
    <tr>
        <td valign="baseline" class="Error">
        <%=MessageHelper.formatMessage("patronlookup_TheFollowingActionsNeedToBeTaken") %>
        <ul>
        <% for ( int x = 0; x < messageList.size(); x++ ) { %>
            <li>
                <%= ResponseUtils.filter( ( String ) messageList.get( x ) ) %>
            </li>
        <% } %>
        </ul>
        </td>
     </tr>
     </base:messageBox>
<%
    }
%>
<%
    String focusString = form.isPrinterFriendly() ? "" : PatronLookupForm.FIELD_SEARCH;
%>

<script language="JavaScript" type="text/javascript">
<!--
function onlyMyPatronsChecked() {
    document.<%=formName%>.<%=PatronLookupForm.PARAM_ONLY_MY_PATRONS_CHANGED%>.value = "true";
    document.<%=formName%>.submit();
}

//-->
</script>

<base:form action="<%= form.getParentFormAction() %>" focus="<%= focusString%>">

<base:outlinedTable id="<%=PatronLookupForm.TABLE_OUTLINE %>" borderColor="#C0C0C0">
<tr><td> 
 
<html:hidden property="<%=PatronLookupForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>
<html:hidden property="<%= PatronLookupForm.PARAM_SHOW_ONLY_MY_PATRONS %>"/>
<html:hidden property="<%= PatronLookupForm.PARAM_FIND_TEACHERS_WITH_CLASSES_ONLY %>"/>
<html:hidden property="<%= PatronLookupForm.PARAM_SHOW_ONLY_PATRONS_PUBLISH_LISTS %>"/>
<html:hidden property="<%= PatronLookupForm.PARAM_INCLUDE_MEDIA_PATRONS_OVERRIDE %>"/>
<html:hidden property="<%= PatronLookupForm.PARAM_ONLY_MY_PATRONS_BIBLIONASIUM %>"/>

 
 <html:hidden property="sort" value='<%= "" + SortHelper.SORTBYLASTNAME %>'/>

<%
    if ( form instanceof InventorySelectCustodianForm ) {
%>
    <span class=TableHeading><%=MessageHelper.formatMessage("patronlookup_SelectCustodians") %></span>

    <html:hidden property="<%=InventorySelectCustodianForm.PARAM_CUSTODIANS_LIST_OUT%>"/>
    <html:hidden property="<%=InventorySelectCustodianForm.PARAM_SHOW_CUSTODIAN_LIMITER%>"/>
    <html:hidden property="<%=InventorySelectCustodianForm.PARAM_SHOW_LOCAL_PATRON_CHECKBOX%>"/>
    <html:hidden property="<%=InventorySelectCustodianForm.PARAM_IS_INCLUDE_CHECKED_OUT_VISIBLE%>"/>
    <html:hidden property="<%=InventorySelectCustodianForm.PARAM_SITE_ID%>"/>
    
<%
    }
%>
 
<logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
<table border="0" cellpadding="0" cellspacing="0">
<% if( form instanceof InventorySelectCustodianForm){ %>
<logic:equal name='<%= InventorySelectCustodianForm.FORM_NAME %>' property='<%= InventorySelectCustodianForm.PARAM_SHOW_CUSTODIAN_LIMITER %>' value="true">
<tr>
    <td class="FormLabel">
    <html:radio property="<%=InventorySelectCustodianForm.FIELD_CUSTODIAN_LIMITER%>" value="<%=InventorySelectCustodianForm.RADIO_ALL_CUSTODIANS%>"><%=MessageHelper.formatMessage("patronlookup_AllCustodians") %></html:radio>
    </td>
</tr>
</logic:equal>
<logic:notEqual name='<%= InventorySelectCustodianForm.FORM_NAME %>' property='<%= InventorySelectCustodianForm.PARAM_SHOW_CUSTODIAN_LIMITER %>' value="true">
    <html:hidden property="<%=InventorySelectCustodianForm.FIELD_CUSTODIAN_LIMITER%>"/>
</logic:notEqual>
<% } %>
<tr>
<td class="FormLabel">
<html:hidden property="action"/>
<% if( form instanceof InventorySelectCustodianForm){ %>
<logic:equal name='<%= InventorySelectCustodianForm.FORM_NAME %>' property='<%= InventorySelectCustodianForm.PARAM_SHOW_CUSTODIAN_LIMITER %>' value="true">
    <html:radio property="<%=InventorySelectCustodianForm.FIELD_CUSTODIAN_LIMITER%>" value="<%=InventorySelectCustodianForm.RADIO_FIND_PATRON%>">
    </html:radio>
</logic:equal>   
<% } %>
<%= form.getSearchPrompt() %>&nbsp;
</td>
<td class="ColRow" nowrap>
<html:text property="searchString" size="20" maxlength="90"/>&nbsp;<%=MessageHelper.formatMessage("patronlookup_In") %>&nbsp;
<%
    boolean selectOnlyMyPatrons = true; 
    if (form instanceof PatronSelectForm) {
        selectOnlyMyPatrons = ((PatronSelectForm) form).isOnlyMyPatrons();
    }
%>
<%  if  (form instanceof InventorySelectCustodianForm) { %>
    <base:selectPatronByType name="searchType" selected="<%=form.getSearchType()%>" onlyMyPatrons="<%=selectOnlyMyPatrons%>" siteID="<%=form.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
<%}else { %>
    <base:selectPatronByType name="searchType" selected="<%=form.getSearchType()%>" onlyMyPatrons="<%=selectOnlyMyPatrons%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
<%} %>
</td>
<td>
<base:genericButton src="/buttons/large/search.gif" alt='<%=MessageHelper.formatMessage("search") %>' name="<%= PatronLookupForm.BUTTON_SEARCH %>" />
<%  if  (form instanceof PatronSelectForm) { %>
    <base:cancelButton name="<%= PatronSelectForm.BUTTON_CANCEL %>" />
<% } %>
</td>
</tr>
<%  if  (form instanceof PatronSelectForm) { %>
    <html:hidden property="<%= PatronSelectForm.PARAM_TO_RETURN %>"/>
<%  } %>

<tr>
  <td>&nbsp;</td>
  <td class="ColRow">
<% if (form.isShowOnlyMyPatronsCheckbox()) { %>
   <html:checkbox property="<%= PatronSelectForm.FIELD_ONLY_MY_PATRONS %>" onclick="onlyMyPatronsChecked()"  disabled="<%=form.isDisableOnlyMyPatrons() %>" /><%=MessageHelper.formatMessage("patronlookup_OnlyMyPatrons") %><% } else if (form.isShowOnlyMyPatrons()) { %>
       &nbsp;
   <html:hidden property="<%= PatronSelectForm.FIELD_ONLY_MY_PATRONS %>" value="false"/>
<% } else { %>
    &nbsp;
    <html:hidden property="<%= PatronSelectForm.FIELD_ONLY_MY_PATRONS %>" value="true"/>
<% } %>
  </td>
  <td>
    &nbsp;
  </td>
</tr>




</table>
</logic:equal>



<%
    if (request.getAttribute("patronlist") != null) {
        List patronList = (List) request.getAttribute("patronlist");

        int itemsInList = patronList.size();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>

<html:hidden property="page" value='<%= "" + currentPage %>' />

    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
        <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
            <tr>
                <td class="ColRow">
                    <%= form.getSearchSummary() %>
                </td>
                <td class="ColRow tdAlignRight">
                    <logic:equal name='<%= form.getFormName() %>' property="showPrinterFriendly" value="true">
                        <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=PatronSelectForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/></base:link>
                    </logic:equal>
                <td>
            </tr>
        </logic:equal>
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <base:searchSummary searchType='<%=MessageHelper.formatMessage("patronlookup_Patrons")%>'
                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                    totalInSet = '<%=String.valueOf(itemsInList)%>'
                />
            </td>
            <td class="SmallColHeading tdAlignRight">
                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                    <base:pageListOutput formName="<%= form.getFormName() %>" />
                </logic:equal>
                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="true">
                    &nbsp;
                </logic:equal>
            </td>
        </tr>
    </table>
<logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
<hr>
</logic:equal>

    <table id="PatronFindTable" width="100%" cellspacing="0" cellpadding="4" border="0">
        <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="true">
            <tr>
                <td class="SmallColHeading" colspan="4">&nbsp;</td>
            </tr>
        </logic:equal>

        <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
            <tr>
                <td class="SmallColHeading">
                <%
                    int strSort = form.getSort();
        
                    if (strSort == SortHelper.SORTBYFIRSTNAME) {
                %>
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_First")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYFIRSTNAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Middle")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYMIDDLENAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Last")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYLASTNAME %>' />
                <%
                    } else if (strSort == SortHelper.SORTBYMIDDLENAME) {
                %>
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Middle")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYMIDDLENAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Last")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYLASTNAME %>' />
                        ,
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_First")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYFIRSTNAME %>' />
                <%
                    } else {
                %>
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Last")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYLASTNAME %>' />
                        ,
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_First")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYFIRSTNAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Middle")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYMIDDLENAME %>' />
                <%
                    }
                %>
                </td>
                <td class="SmallColHeading"><base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Barcode")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYBARCODE %>' /></td>
        
                <% if (form.isSearchingDistrictWide()) { %>
                    <td class="SmallColHeading"><base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronlookup_Site")%>' formName="<%= form.getFormName() %>" sort='<%= "" + SortHelper.SORTBYSITESHORTNAME_PATRONS%>' /></td>
                <% } else { %>
                    <td class="SmallColHeading">&nbsp;</td>
                <% } %>
                <td class="SmallColHeading">&nbsp;</td>
            </tr>
        </logic:equal>
        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= form.getFormName() %>" property="list" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
            <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+FlipperTag.ROW_GRAY+"\"" : "" )%> >
                <% // Display item here %>
                <base:td clazz="ColRow" filtered="true"><%= form.getPatronName(row) %></base:td>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronBarcode(row)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronSiteName(row)%></base:td>
                <td class="ColRow tdAlignRight"><%=form.getPatronLinks(row)%></td>
            </tr>
        </logic:iterate>

    </table>

<logic:equal name='<%=form.getFormName()%>' property="printerFriendly" value="false">
<%
    if  (!(form instanceof PatronSelectForm)) {
%>
<hr>
    <base:helpIcons buttonsToOutput='<%=form.getHelpIcons()%>'/>
<hr>
<%
    }
%>
    <table width="100%" cellspacing="0" cellpadding="2">
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <base:searchSummary searchType='<%=MessageHelper.formatMessage("patronlookup_Patrons")%>'
                    startOfSet ='<%="" + ( itemsToSkip + 1 )%>'
                    endOfSet   = '<%="" + ( itemsToPrint )%>'
                    totalInSet = '<%="" + ( itemsInList )%>'
                />
            </td>
            <td class="SmallColHeading tdAlignRight">
                <logic:equal name='<%=form.getFormName()%>' property="printerFriendly" value="false">
                    <base:pageListOutput formName="<%=form.getFormName()%>"  topOfPageLinks="false" />
                </logic:equal>
                <logic:equal name='<%=form.getFormName()%>' property="printerFriendly" value="true">
                    &nbsp;
                </logic:equal>
            </td>
        </tr>
    </table>
</logic:equal>

<%
    }
%>

<%
    if ( form instanceof InventorySelectCustodianForm ) {
%>
    <table id=<%=InventorySelectCustodianForm.TABLE_SELECTED%> width="100%">
        <tr>
            <td>&nbsp;
            </td>
        </tr>
        <tr>
            <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("patronlookup_CurrentlySelected")%>' tdContent="width='100%' colSpan='2'"/>
        </tr>
        <tr>
            <td colSpan="2">
                <table id=<%=InventorySelectCustodianForm.TABLE_CURRENTLY_ASSIGNED%> cellSpacing="0" cellPadding="2" 
                        width="100%" border="0">
                    <tr>
                    <logic:empty name="<%=InventorySelectCustodianForm.FORM_NAME%>" property="<%=InventorySelectCustodianForm.PARAM_SELECTED_CUSTODIANS_LIST%>">
                        <td class=SmallColHeading>&nbsp;
                        </td>
                        <td class=SmallColHeading align="center"><%=MessageHelper.formatMessage("patronlookup_NoCustodiansSelected") %></td>
                        <td class="tdAlignRight">&nbsp;
                        </td>
                    </logic:empty>
                    <logic:notEmpty name="<%=InventorySelectCustodianForm.FORM_NAME%>" property="<%=InventorySelectCustodianForm.PARAM_SELECTED_CUSTODIANS_LIST%>">
                        <td>
            <tr>
                <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronlookup_Name") %></td>
                <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronlookup_Barcode") %></td>
                <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronlookup_Site") %></td>
                <td class="SmallColHeading">&nbsp;</td>
            </tr>
        <logic:iterate indexId="flipper" id="rowSelected" name="<%=InventorySelectCustodianForm.FORM_NAME%>" property="<%=InventorySelectCustodianForm.PARAM_SELECTED_CUSTODIANS_LIST%>" type="com.follett.fsc.destiny.entity.ejb3.PatronVO">
            <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                <%
                    // Display item here
                %>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronNameUnsorted(rowSelected)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronBarcode(rowSelected)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%= form.getPatronSiteName(rowSelected) %></base:td>
                <td class="ColRow tdAlignRight"><%= form.getSelectedCustodianLinks(rowSelected) %></td>
            </tr>
        </logic:iterate>
                        </td>
                    </logic:notEmpty>
                    </tr>
                </table>
            </td>
        </tr>
        <logic:equal name="<%=InventorySelectCustodianForm.FORM_NAME%>" property="<%= InventorySelectCustodianForm.PARAM_IS_INCLUDE_CHECKED_OUT_VISIBLE %>" value="true">
            <tr>
                <td colSpan=2>
                    <base:imageLine height="1" width="100%"/>
                </td>
            </tr>
            <tr>
                <td colSpan=2 align="center">
                    <table id="pleaseNoteTable">
                        <tr>
                            <td class="ColRow">
                                <%=MessageHelper.formatMessage("patronlookup_PleaseNote") %>                         
                            </td>
                         </tr>
                    </table>
                    <table id="includeItemsTable">
                        <tr>
                            <td class="ColRow" valign="top">
                                <html:checkbox property="<%= InventorySelectCustodianForm.FIELD_INCLUDE_CHECKED_OUT %>"/>
                            </td>
                            <td class="ColRow" valign="top"><%=MessageHelper.formatMessage("patronlookup_AlsoIncludeItemsThatHaveBeenCheckedOut") %>
                                <base:helpTag helpFileName="d_include_checked-out_items_in_inventory_AM.htm"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </logic:equal>
        <tr>
            <td colSpan=2><base:imageLine height="1" width="100%"/>
            </td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <base:okButton name="<%= InventorySelectCustodianForm.BUTTON_OK %>" />
              <%  if  (form instanceof PatronSelectForm) { %>
                    &nbsp;
                    <base:cancelButton name="<%= PatronSelectForm.BUTTON_CANCEL %>" />
              <% } %>
                
            </td>
            
            
        </tr>
    </table>
<% 
    }
%>


</td></tr>
</base:outlinedTable>
</base:form>

