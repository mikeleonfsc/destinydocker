<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookStatisticsReportForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>                
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@ page import="org.apache.struts.taglib.logic.PresentTag"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
    
    
<%@page import="com.follett.fsc.common.LocaleHelper"%><SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=TextbookStatisticsReportForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>

<!-- RUNS FOR BOTH TM DISTRICT TEXTBOOK STATISTICS AND RM DISTRICT TEXTBOOK STATISTICS ~AAS -->

<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="backoffice_servlet_TextbookStatisticsReportForm" type="TextbookStatisticsReportForm"/>
<%
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    TextbookStatisticsReportForm form1 = (TextbookStatisticsReportForm) request.getAttribute(TextbookStatisticsReportForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>	
    <logic:present name="<%=TextbookStatisticsReportForm.FORM_NAME%>" property="helpText">
        <bean:write name="<%=TextbookStatisticsReportForm.FORM_NAME%>" filter="false" property="helpText"/>
    </logic:present>
    
<base:form action="/backoffice/servlet/handletextbookstatisticsreportform.do" >
<table cellpadding="0" cellspacing="0" width="99%" border="1">
        <tr><td>
                <table width="100%">
                    <% if (!form1.isPrint()) { %>
                        <tr>
                            <td class="Breadcrumb" valign="top">
                                    <html:checkbox property="<%= TextbookStatisticsReportForm.CHECKBOX_GROUP_BY %>" value = "<%= TextbookStatisticsReportForm.SORT_ORDER_SITETYPE %>" onclick = "submitTheForm()"> Group sites by type</html:checkbox>
                            </td>
                            <td class="SmallColRow tdAlignRight" valign="top">
                                <base:link  page='<%= form1.getPrinterLink("/backoffice/servlet/handletextbookstatisticsreportform.do")%>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly" align="absbottom"/></base:link>
                            </td>
                        </tr>
                    <% } else { %>
                        <tr>
                            <td class="MainHeader" align="center">
                                    <%= form1.getPrinterFriendlyDistrictName() %>
                            </td>
                        </tr>
                        <tr>
                            <td class="SmallColHeading" align="center">
                                Textbook Statistics by Site
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" align="center">
                                <%= form1.getPrinterFriendlySubTitle() %>
                            </td>
                        </tr>
                    <% } %>
                 </table>
              </td>           
        </tr>
        <tr><td colspan="2">
    
    <% form.clearTotals(true); %>
    <table id="<%=TextbookStatisticsReportForm.TABLE_TEXTBOOK_INFO %>" frame="void" rules="all" cellspacing="0" cellpadding="3" align="center" bordercolor="#E8E8E8" width="100%">
       <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
            <td class="InverseSmallColHeading" valign="top">
                Site Name
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Total Textbooks
            </td>
            <td class="InverseSmallColHeading" valign="top">
            <% if (form.isAssetTextbooks()) {%>
                Total Items
            <% } else { %>
                Total Copies
            <% } %>
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Collection Value
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Total Patrons
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Current Checkouts
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Checked Out %
            </td>                
            <td class="InverseSmallColHeading" valign="top">
                Current Overdues
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Fines*
            </td>
            <td class="InverseSmallColHeading" valign="top">
                Fines Due*
            </td>
        </tr>
        <c:set var = "oldSiteTypeID" value = "0"/>
        <c:set var = "siteSortType" value = "<%= form.SORT_ORDER_SITETYPE %>"/>
        <c:set var = "firstTimeThrough" value = "1"/>
        <logic:iterate id="stat" name="<%=TextbookStatisticsReportForm.FORM_NAME%>" property="textbookStatsList" type="java.util.HashMap">
            <c:set var = "currentSiteTypeID" value = '<%= (Long)stat.get("SITETYPEID") %>'/>
            <c:if test = "${pageScope.form.sortOrder == siteSortType && currentSiteTypeID != oldSiteTypeID}"> 
                <c:if test = "${firstTimeThrough != 1}">
                    <tr>
                        <td class="ColRowBold tdAlignRight"><br/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalTextbooks() %>"/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalCopies() %>"/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeCurrencyTag price = "<%= form.getCollectionValue() %>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalPatrons() %>"/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getCurrentCheckouts() %>"/></td>
                        <td class="ColRowBold tdAlignRight"><%= form.getPctCheckedOut() %></td>
                        <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalOverdues() %>"/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalFines() %>"/></td>
                        <td class="ColRowBold tdAlignRight"><base:localeCurrencyTag price = "<%= form.getTotalFinesDue() %>" currencyCode="<%=lh.getFineCurrencyCharacterCode()%>"/></td>
                    </tr>
                    <% form.clearTotals(false); %>
                </c:if>
                <tr>
                    <td class="ColRowBold"><%= form.getSiteTypeDesc((Long)stat.get("SITETYPEID")) %></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>
                    <td><br/></td>                   
                </tr>
                <c:set var = "oldSiteTypeID" value = "${currentSiteTypeID}"/>
                <c:set var = "firstTimeThrough" value = "0"/>
            </c:if>
            <tr>
                <td class="Breadcrumb">
                    <%= stat.get("SITENAME")%>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    
                    <base:localeNumberTag number='<%=form.isAssetTextbooks() ? (Long)stat.get("ASSETCOUNTSTEXTBOOK") : (Long)stat.get("BIBCOUNTS")%>'/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    <base:localeNumberTag number='<%=form.isAssetTextbooks() ? (Long)stat.get("ITEMCOUNTSTEXTBOOK") : (Long)stat.get("COPYCOUNTS")%>'/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("COLLECTIONVALUE")%>' currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    <base:localeNumberTag number='<%=(Long)stat.get("PATRONCOUNTS")%>'/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    <base:localeNumberTag number='<%=form.isAssetTextbooks() ? (Long)stat.get("CURRENTCHECKOUTCOUNTSTEXTBOOK") : (Long)stat.get("CURRENTCHECKOUTCOUNTS")%>'/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    <%=form.isAssetTextbooks() ? form.getPercentCheckedOut((Long)stat.get("CURRENTCHECKOUTCOUNTSTEXTBOOK"), (Long)stat.get("ITEMCOUNTSTEXTBOOK")) :
                             form.getPercentCheckedOut((Long)stat.get("CURRENTCHECKOUTCOUNTS"), (Long)stat.get("COPYCOUNTS")) %>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    <base:localeNumberTag number='<%=form.isAssetTextbooks() ? (Long)stat.get("CURRENTOVERDUECOUNTSTEXTBOOK") : (Long)stat.get("CURRENTOVERDUECOUNTS")%>'/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    <base:localeNumberTag number='<%=(Long)stat.get("CURRENTFINECOUNTS")%>'/>
                </td>
                <td class="Breadcrumb tdAlignRight">
                    &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("TOTALFINESDUE")%>' currencyCode="<%=lh.getFineCurrencyCharacterCode()%>"/>
                </td>
                <% if (form.isAssetTextbooks()){ %>
                <% form.incrementTotals((Long)stat.get("ASSETCOUNTSTEXTBOOK"), (Long)stat.get("ITEMCOUNTSTEXTBOOK"), (Long)stat.get("COLLECTIONVALUE"), (Long)stat.get("PATRONCOUNTS"), (Long)stat.get("CURRENTCHECKOUTCOUNTSTEXTBOOK"), (Long)stat.get("CURRENTOVERDUECOUNTSTEXTBOOK"), (Long)stat.get("CURRENTFINECOUNTS"), (Long)stat.get("TOTALFINESDUE")); %>
                <% } else { %>
                <% form.incrementTotals((Long)stat.get("BIBCOUNTS"), (Long)stat.get("COPYCOUNTS"), (Long)stat.get("COLLECTIONVALUE"), (Long)stat.get("PATRONCOUNTS"), (Long)stat.get("CURRENTCHECKOUTCOUNTS"), (Long)stat.get("CURRENTOVERDUECOUNTS"), (Long)stat.get("CURRENTFINECOUNTS"), (Long)stat.get("TOTALFINESDUE")); %>
                <% } %>
            </tr>
        </logic:iterate>
        <c:if test = "${pageScope.form.sortOrder == siteSortType}">
            <tr>
                <td class="ColRowBold tdAlignRight"><br/></td>
                <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalTextbooks() %>"/></td>
                <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalCopies() %>"/></td>
                <td class="ColRowBold tdAlignRight"><base:localeCurrencyTag price = "<%= form.getCollectionValue() %>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/></td>
                <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalPatrons() %>"/></td>
                <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getCurrentCheckouts() %>"/></td>
                <td class="ColRowBold tdAlignRight"><%= form.getPctCheckedOut() %></td>
                <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalOverdues() %>"/></td>
                <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getTotalFines() %>"/></td>
                <td class="ColRowBold tdAlignRight"><base:localeCurrencyTag price = "<%= form.getTotalFinesDue() %>" currencyCode="<%=lh.getFineCurrencyCharacterCode()%>"/></td>
            </tr>
        </c:if>
        <tr>
            <td class="ColRowBold">District Total</td>
            <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getDistrictTotalTextbooks() %>"/></td>
            <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getDistrictTotalCopies() %>"/></td>
            <td class="ColRowBold tdAlignRight"><base:localeCurrencyTag price = "<%= form.getDistrictCollectionValue() %>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/></td>
            <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getDistrictTotalPatrons() %>"/></td>
            <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getDistrictCurrentCheckouts() %>"/></td>
            <td class="ColRowBold tdAlignRight"><%= form.getDistrictPctCheckedOut() %></td>
            <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getDistrictTotalOverdues() %>"/></td>
            <td class="ColRowBold tdAlignRight"><base:localeNumberTag number = "<%= form.getDistrictTotalFines() %>"/></td>
            <td class="ColRowBold tdAlignRight"><base:localeCurrencyTag price = "<%= form.getDistrictTotalFinesDue() %>" currencyCode="<%=lh.getFineCurrencyCharacterCode()%>"/></td>
        </tr>
        
    </table>
    </td></tr>
        <logic:equal name="backoffice_servlet_TextbookStatisticsReportForm" property="print" value="true">
            <tr>
                <td colspan="9" align="center" class="ColRow"><%=form1.getReportTimeFooter()%></td>
            </tr>
        </logic:equal>
</table>  
<p align="center" class="BreadcrumbBold">* Excludes patron specific fines.</p>
</base:form>
 
