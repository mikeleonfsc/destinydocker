<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronSearchForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<bean:define id="patronSearchForm" name="<%= PatronSearchForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.PatronSearchForm" />
<base:messageBox strutsErrors="true"/>

<%
    PatronSearchForm form = (PatronSearchForm)request.getAttribute(PatronSearchForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
%>


<base:form action="/backoffice/servlet/handlepatronsearchform.do" focus="<%=PatronSearchForm.FIELD_SEARCH_STRING%>">

<html:hidden property="sort" value='<%= "" + SortHelper.SORTBYLASTNAME %>'/>

<logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
   <table cellpadding="2" cellspacing="0" border="0" width="100%">
		<tr>
		  <td class="ColRowBold" valign="top" width="10%" nowrap><%=MessageHelper.formatMessage("patronsearch_FindPatron") %></td>
		  
		  <td valign="top" class="ColRowBold" >
		     <html:text property="<%= PatronSearchForm.FIELD_SEARCH_STRING %>"  size="24"/>
			 <%=MessageHelper.formatMessage("patronsearch_In") %>
			 <base:selectPatronByType name="<%=PatronSearchForm.FIELD_SEARCH_TYPE%>" selected='<%="" + form.getSearchType()%>'/>
			 <base:genericButton src="/buttons/large/search.gif" alt='<%= MessageHelper.formatMessage("search")%>' name="<%= PatronSearchForm.BUTTON_SEARCH %>" />
	      </td>
    	</tr>	       
		   
	    <tr>
	      <td>&nbsp;</td>
	      <td class="ColRow"><html:checkbox property="<%= PatronSearchForm.FIELD_ONLY_MY_SITE %>"/><%=MessageHelper.formatMessage("patronsearch_OnlyMyPatrons") %></td>
		</tr>
   </table>
</logic:equal>

</base:form>

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
        <logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
            <tr>
                <td class="ColRow">
                    <bean:write name="<%= PatronSearchForm.FORM_NAME %>" property="searchSummary"/>
                </td>
                <td class="ColRow tdAlignRight">
                    <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=PatronSearchForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/></base:link>
                <td>
            </tr>
        </logic:equal>
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <base:searchSummary searchType='<%=MessageHelper.formatMessage("patronsearch_Patrons")%>'
                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                    totalInSet = '<%=String.valueOf(itemsInList)%>'
                />
            </td>
            <td class="ColRow tdAlignRight">
                <logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
                    <base:pageListOutput formName="<%= PatronSearchForm.FORM_NAME %>" />
                </logic:equal>
                <logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="true">
                    &nbsp;
                </logic:equal>
            </td>
        </tr>
    </table>

    
<logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
<hr>
</logic:equal>

    <table id="PatronFindTable" width="100%" cellspacing="0" cellpadding="4" border="0">
        <logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="true">
            <tr>
                <td class="SmallColHeading" colspan="4">&nbsp;</td>
            </tr>
        </logic:equal>

        <logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
            <tr>
                <td class="SmallColHeading">
                <%
                    int strSort = form.getSort();
        
                    if (strSort == SortHelper.SORTBYFIRSTNAME) {
                %>
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_First")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYFIRSTNAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Middle")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYMIDDLENAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Last")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYLASTNAME %>' />
                <%
                    } else if (strSort == SortHelper.SORTBYMIDDLENAME) {
                %>
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Middle")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYMIDDLENAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Last")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYLASTNAME %>' />
                        ,
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_First")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYFIRSTNAME %>' />
                <%
                    } else {
                %>
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Last")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYLASTNAME %>' />
                        ,
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_First")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYFIRSTNAME %>' />
                        <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Middle")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYMIDDLENAME %>' />
                <%
                    }
                %>
                </td>
                <td class="SmallColHeading"><base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Barcode")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYBARCODE %>' /></td>
        
                <% if (form.isOnlyMySite()) { %>
                    <td class="SmallColHeading">&nbsp;</td>
                <% } else { %>
                    <td class="SmallColHeading"><base:sortHeaderOutput description='<%=MessageHelper.formatMessage("patronsearch_Site")%>' formName="<%= PatronSearchForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYSITESHORTNAME_PATRONS%>' /></td>
                <% } %>
                <td class="SmallColHeading">&nbsp;</td>
            </tr>
        </logic:equal>
        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= PatronSearchForm.FORM_NAME %>" property="list" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
        	<tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                <% // Display item here %>
                <base:td clazz="ColRow" filtered="true"><%= form.getPatronName(row) %></base:td>
                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronBarcode(store, row, null)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%= SitePatronHelper.getPatronSiteName(store, row, null) %></base:td>
                <base:td clazz="ColRow" filtered="false"><%= form.getPatronLinks(row) %></base:td>
            </tr>
        </logic:iterate>
    </table>

<logic:equal name='<%= PatronSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
<hr>
</logic:equal>





    <table width="100%" cellspacing="0" cellpadding="2">
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <base:searchSummary searchType='<%=MessageHelper.formatMessage("patronsearch_Patrons")%>'
                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                    totalInSet = '<%=String.valueOf(itemsInList)%>'
                />
                                
            </td>
        </tr>
    </table>
    
    
    
    
    
<%
    }
%>


