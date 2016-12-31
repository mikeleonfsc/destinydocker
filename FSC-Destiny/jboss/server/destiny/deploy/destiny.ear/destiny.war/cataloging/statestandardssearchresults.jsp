<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.statestandards.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="form" name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" type="StateStandardsSearchResultsForm"/>

<base:messageBox strutsErrors="true"/>

<%
int itemsInList = form.getTotalCount();
int currentPage = PageCalculator.getCurrentPage(form);
int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );

String borderColor="#C0C0C0";
if (form.isPrinterFriendly()) {
    borderColor="#FFFFFF";
}
%>

<base:outlinedTable borderColor='<%=borderColor%>' width="100%" cellpadding="0" id="<%=StateStandardsSearchResultsForm.TABLE_MAIN%>">
<tr>
    <td>
        <table id="<%=StateStandardsSearchResultsForm.TABLE_PAGING_HEADER%>" width="100%">
        <tr>
            <td colspan="2">
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                    <span class="ColRowBold">Searching <bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="siteType"/></span>&nbsp;
                </logic:equal>
                <span class="ColRowBold"><br>
                <bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" filter="false" property="state"/> &gt;
                <bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" filter="false" property="subject"/> &gt;
                <bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" filter="false" property="grade"/>
                for &quot;<bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="searchTerm"/>&quot;
                </span>&nbsp;
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                        <span class="SmallColRow">[<a href='<bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="refineLink" filter="false"/>'>Refine your search</a>]</span>
                </logic:equal>
            </td>
            <td noWrap class="tdAlignRight" valign="top">
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                    <logic:notEqual name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=BaseListForm.PARM_TOTAL_COUNT%>" value="0">
                        <a href='<bean:write name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="printerFriendlyLink" filter="false"/>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image alt="Printer Friendly" src="/buttons/small/printerfriendly.gif" align="absbottom"/></a>
                    </logic:notEqual>
                </logic:equal>&nbsp;
            </td>
        </tr>
        <tr vAlign="bottom">
            <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                <td colspan="2">
                    <base:searchSummary searchType="Standards" startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
                        endOfSet= "<%=String.valueOf(itemsToPrint)%>"
                        totalInSet = "<%=String.valueOf(form.getTotalCount())%>"
                        tooManyHits = "false"/>
                </td>
            </logic:equal>
            <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="true">
                <td align="center" class="ColRowBold" colspan="2">
                    No matches found. Please try using other search terms.
                </td>
            </logic:equal>
            <td noWrap class="SmallColHeading tdAlignRight">
                <logic:equal name="form" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                    <base:pageListOutput formName="<%=StateStandardsSearchResultsForm.FORM_NAME%>"/>
                </logic:equal>&nbsp;
            </td>
        </tr>
        </table>
    </td>
</tr>
<tr>
<td>
<logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
<logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
    <base:imageLine height="2" width="100%"/>
</logic:equal>
</logic:equal>
</td>
</tr>
<% int count=0; %>
<logic:iterate name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.ATTRIBUTE_LIST%>" id="result" type="com.follett.fsc.destiny.util.statestandards.StateSearchHitElement">
<tr>
    <td>
        <table width="100%" id="<%=StateStandardsSearchResultsForm.TABLE_KEYWORD_RESULTS + count%>">
        <tr>
            <td>
                <logic:iterate name="result" property="navEntries" id="nav" type="com.follett.fsc.destiny.util.statestandards.StateSearchNavEntryElement">
                    <span class="NaventryBold"><bean:write name="nav" property="description" filter="false" />:</span>
                    <span class="Naventry"><bean:write name="nav" property="data" filter="false" />&nbsp;&gt;</span>
                </logic:iterate>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold">
                <bean:write name="result" filter="false" property="description"/>
                <bean:write name="result" property="stateStandardNumber"/>
                <%
                    String link = form.getSubmitLink() + "?ssOID=" + result.getOID() + "&"+
                        BaseSearchResultsForm.FIELD_DO_NOT_SAVE_SEARCH_HISTORY+
                        "="+Boolean.TRUE;
                %>
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                    <base:link styleClass="DetailLink" page="<%=link%>" permission="<%=Permission.CAT_STATE_STANDARD_SEARCH%>" id="<%=StateStandardsSearchResultsForm.ID_BUTTON_FIND %>">
                        <bean:write name="result" filter="false" property="data" filter="false" />&nbsp;
                            <base:image src="/buttons/small/finditover.gif" alt="Find It"/>
                    </base:link>
                </logic:equal>
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                    <bean:write name="result" filter="false" property="data" />&nbsp;
                </logic:equal>
            </td>
        </tr>
        <tr>
            <td>
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                    <base:imageLine width="100%" height="2"/>
                </logic:equal>
                <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                    &nbsp;
                </logic:equal>
            </td>
        </tr>
        </table>
    </td>
</tr>
<% count++; %>
</logic:iterate>
<tr>
    <td>
        <!-- Hitlist Footer -->
        <table width="100%" id="<%=StateStandardsSupportingWebSitesForm.TABLE_PAGING_FOOTER %>">
            <tr>
                <td>
                    <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                        <base:searchSummary searchType="Standards" startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
                            endOfSet= "<%=String.valueOf(itemsToPrint)%>"
                            totalInSet = "<%=String.valueOf(form.getTotalCount())%>"
                            tooManyHits = "false"/>
                    </logic:equal>
                    <logic:equal name="<%=StateStandardsSearchResultsForm.FORM_NAME%>" property="<%=StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="true">
                        &nbsp;
                    </logic:equal>
                </td>
                <td noWrap class="SmallColHeading tdAlignRight">
                    <logic:equal name="form" property="<%=StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                        <base:pageListOutput formName="<%=StateStandardsSearchResultsForm.FORM_NAME%>" topOfPageLinks="false"/>
                    </logic:equal>&nbsp;
                </td>
            </tr>
        </table>
    </td>
</tr>
</base:outlinedTable>
