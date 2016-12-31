<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.SearchResultsOutputListRenderer"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetItemEditForm"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetPowerSearchForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetPowerSearchForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetSearchNavigationForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.BarcodeHelper" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<base:messageBox strutsErrors="true"/>

<%
    AssetPowerSearchForm form = (AssetPowerSearchForm)request.getAttribute(AssetPowerSearchForm.FORM_NAME);
	String focus = form.isPrinterFriendly() ? "" : AssetPowerSearchForm.FIELD_KEYWORD_TEXT;
%>
<script language="JavaScript" type="text/javascript">
  <!--
  function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
      }
    }
  
    function onSearchTypeChange() {
        document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_SEARCH_TYPE_CHANGED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
    
    }
    
    function onLookInChange() {
        document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_LOOK_IN_CHANGED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
    
    }

    // -->
</script>

<base:form action="/cataloging/servlet/handleassetpowersearchform.do" focus="<%=focus%>">
    <bean:define id="sortTypes" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="sortTypes"/>

<%  if  (form.getTransferCopyList() != null) { %>
        <base:imageSpacer width="1" height="3"/>
        <center>
        <base:messageBox>
        <base:transferOnScan formName="<%=AssetPowerSearchForm.FORM_NAME%>"></base:transferOnScan>
        </base:messageBox>
        </center>
<% } %>
<%
    if (form.getList() == null) {	// we did not do a search
%>
	<html:hidden property="<%=AssetPowerSearchForm.PARM_SORT%>"/>
<%
    } else {	// we did a search
    if (form.getList().size() == 0) {	// our search had no results
        if  (form.getTransferCopyList() == null) { %>
            <base:messageBox>
                   <tr>
                       <td valign="baseline" class="Error">No matches found.<br/>Please try using other search terms or choose a different search.
                       </td>
                   </tr>
            </base:messageBox>
        <% }             

    } else {	// our search has results to display
        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        String bgcolor = form.isPrinterFriendly() ? "#FFFFFF" : "#C0C0C0";
%>


<base:outlinedTable width="95%" borderColor="<%=bgcolor%>">
	<tr>
		<td width="100%">
			<table id="<%=AssetPowerSearchForm.TABLE_SEARCH_HEADER%>" width="100%">
				<tr>
					<td class="ColRowBold">
						<bean:write name="<%=AssetPowerSearchForm.FORM_NAME%>" property="searchDescription"/>
					</td>
	
					<td class="ColRow tdAlignRight">
                        <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
			                <base:link page="<%=form.getPrinterFriendlyLink()%>" target="printerFriendly" id="<%=BaseSearchResultsForm.ID_PRINTER_FRIENDLY %>"><base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></base:link>
			            </logic:equal>
					</td>
				</tr>
			</table>
		</td>
	</tr>
    <a name="topofpage"></a>
    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
		<tr>
			<td class="SmallColRow">
	            [<a href="#refinesearch">Refine your search</a>]
			</td>
		</tr>
	</logic:equal>

<tr>
	<td>
		<table id="<%=AssetPowerSearchForm.TABLE_PAGINATION%>" width="100%">
			<tr>
				<td>
	                 <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet='<%="" + ( itemsToSkip + 1 )%>'
	                     endOfSet= '<%="" + ( itemsToPrint )%>'
	                     totalInSet = '<%="" + ( itemsInList )%>'
	                     tooManyHits = 'false'
	                     />
				</td>

				<td>
                    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
						<span class="SmallColHeading">Sort by </span>
					    <html:select property="<%=AssetPowerSearchForm.PARM_SORT%>" styleClass="SmallColRow">
					        <html:options collection="sortTypes" property="stringCode" labelProperty="stringDesc"/>
					    </html:select>
                        <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true" alt="Go!" name="<%=BaseSearchResultsForm.BUTTON_CHANGE_SORT%>" />
					</logic:equal>
                    <logic:notEqual name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
						&nbsp;
					</logic:notEqual>
				</td>

				<td class="SmallColHeading tdAlignRight">
                    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
				    	<base:pageListOutput formName="<%=AssetPowerSearchForm.FORM_NAME%>"/>
                    </logic:equal>
                    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="true">
				    	&nbsp;
                    </logic:equal>
				</td>
			</tr>
		</table>
	</td>
</tr>


	<tr>
		<td width="100%">
        <table id="<%=AssetPowerSearchForm.TABLE_KEYWORD%>" width="100%" border="0" cellspacing="0" cellpadding="0"><tr><td>
	<%
	    Long lastBibID = null;
			Iterator iter = form.getList().iterator();
			int prevRowType = -1;
			boolean flipper = true;
            boolean hasAssetHistoricalNotes = false;
			int tableIndex = 0;
			while (iter.hasNext()) {
			    KeywordSearchRecord rec = (KeywordSearchRecord)iter.next();
			    if (!rec.getRecID().equals(lastBibID)) {
			        lastBibID = rec.getRecID();
			        prevRowType = -1;	// force header
			        if (tableIndex > 0) {
	%>
		            	</table>	<!-- close itemsTable in progress -->
		            	</td>		<!-- close the items table cell/row -->
		            	</tr>
		            	</table>	<!-- close the title table  -->
		            <%
		                }
		            %>
				<table id="<%=AssetPowerSearchForm.TABLE_TITLE_PREFIX + tableIndex%>" cellspacing="0" cellpadding="0" width="100%">
				<logic:present name='<%=AssetPowerSearchForm.FORM_NAME%>' property="printerFriendlyLink">
					<tr>
						<td class="ColRow" colspan="6">
							<base:imageLine height="2" width="100%" />
						</td>
					</tr>
				</logic:present>
				<tr>
					<td valign="top">
						<base:titleImage rec="<%=rec%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
					</td>
					<td class="ColRowBold" valign="top" colspan="5" width="100%">
						<base:titleDetailHover rec="<%=rec%>" formName="<%=AssetPowerSearchForm.FORM_NAME%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
					</td>
				</tr>
				<tr>
					<td></td>
					<td class="ColRow" colspan="5">
						<%=rec.getAssetTypeDescription()%>
					</td>
				</tr>
                
                
                    <c:if test="<%= (AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID()))%>">
                    <tr>                    
                        <td class="ColRow" valign="top" nowrap colspan="5">
                                    &nbsp;&nbsp;
                                    <base:bibTypeIcon rec="<%=rec%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
                                    &nbsp;
                                <%=SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false)%>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=SearchResultsOutputListRenderer.getFilteredString(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()), true)%>
                                <%
                                    if (rec.getReplacementPrice() != null) {
                                %>
                                    &nbsp;&nbsp;<%=UserContext.getMyContextLocaleHelper().formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                <%
                                    }
                                %>
                        </td>
                    </tr>
                    
                        <tr>
                            <td class="ColRow" colspan="5">
                                <ul>
                                    <ul>
                                    <%
                                        boolean newLineNeeded = false;
                                    %>
                                        <%
                                            if ( !StringHelper.isEmpty(rec.getPublisher()) ) {
                                        %>
                                            <%=ResponseUtils.filter(rec.getPublisher())%>&nbsp;
                                            <%
                                                newLineNeeded = true;
                                            %>    
                                        <%
                                                }
                                            %> 
                                        <%
                                             if ( !StringHelper.isEmpty(rec.getPubYear()) ) {
                                         %>
                                            <%=ResponseUtils.filter(rec.getPubYear())%>&nbsp;
                                            <%
                                                newLineNeeded = true;
                                            %>
                                        <%
                                            }
                                        %> 
                                        <%
                                             if ( !StringHelper.isEmpty(rec.getEdition()) ) {
                                         %>
                                            <%=ResponseUtils.filter(rec.getEdition())%>
                                            <%
                                                newLineNeeded = true;
                                            %>
                                        <%
                                            }
                                        %> 
                                        
                                        <%
                                                                             if ( ! StringHelper.isEmpty(rec.getStateTextID()) ||
                                                                                                         ! StringHelper.isEmpty(rec.getGradeLevel())) {
                                                                         %>
                                        <%
                                            if (newLineNeeded) {
                                        %>
                                            <br>
                                        <%
                                            }
                                        %>
                                        <%
                                            newLineNeeded = false;
                                        %>
                                            <%
                                                if (! StringHelper.isEmpty(rec.getStateTextID())) {
                                            %><%= MessageHelper.formatMessage("titlelist_StateTextbookID") %>:<%=ResponseUtils.filter(rec.getStateTextID())%>&nbsp;
                                                <%
                                                    newLineNeeded = true;
                                                %>
                                            <%
                                                }
                                            %>
                                            <%
                                                if (! StringHelper.isEmpty(rec.getGradeLevel())) {
                                            %><%= MessageHelper.formatMessage("titlelist_Grades") %>:<%=ResponseUtils.filter(rec.getGradeLevel())%>
                                                <%
                                                    newLineNeeded = true;
                                                %>
                                            <%
                                                }
                                            %>
                          
                                        <%
                                                              }
                                                          %>
                                        
                                        <%
                                                                            if (! StringHelper.isEmpty(rec.getAdditionalInfo())) {
                                                                        %>
                                            <%
                                                if (newLineNeeded) {
                                            %>
                                                <br>
                                            <%
                                                }
                                            %>
                                            <%=ResponseUtils.filter(rec.getAdditionalInfo())%>
                                        <%
                                            }
                                        %>
                                    
                                    </ul>
                                </ul>
                            </td>
                        </tr>
                    </c:if>
                
                
                
                
				<tr>
					<td colspan="6">
						<table id="<%=AssetPowerSearchForm.TABLE_ITEMS_PREFIX + tableIndex%>" cellspacing="0" cellpadding="4" width="100%">
			<%
			    tableIndex++;
					    }
					    int rowType = -1;
					    if (!rec.isAssetSoftware()) {
					        rowType = 0;	// normal item (0)
					    } else {
					        rowType = (rec.getLicenseCount() != null ? 2 : 1);	// media (1) or license (2)
					    }
					    
					    if (rowType != prevRowType) {
					        prevRowType = rowType;
					        flipper = true;
					        // need header row
						    switch (rowType) {
						        case 0:	// normal item
			%>
			        		<tr valign="top">
			        			<td></td>
			        			<td class="SmallColHeading">
			        				Item Barcode
		        				</td>
			        			<td class="SmallColHeading">
			        				Status
		        				</td>
			        			<td class="SmallColHeading">
			        				Condition
		        				</td>
			        			<td class="SmallColHeading">
			        				<%=form.generateSiteOrLocationHeader()%>
		        				</td>
		        				<td class="Instruction tdAlignRight">
		        					<img src="/images/icons/general/spacer.gif" border="0" width="19" height="16"/>
		        					<img src="/images/icons/general/spacer.gif" border="0" width="19" height="16"/>
		        					<img src="/images/icons/general/spacer.gif" border="0" width="19" height="16"/>
		        					<img src="/images/icons/general/spacer.gif" border="0" width="19" height="16"/>
	        					</td>
			        		</tr>
			        	<%
			        	    break;
			        				        
			        				        case 1:	// media
			        	%>
			        		<tr>
			        			<td></td>
			        			<td class="SmallColHeading">
			        				Media Barcode
		        				</td>
			        			<td class="SmallColHeading">
			        				Status
		        				</td>
			        			<td class="SmallColHeading">
			        				Condition
		        				</td>
			        			<td class="SmallColHeading">
                                    <%=form.generateSiteOrLocationHeader()%>
		        				</td>
		        				<td>
		        					&nbsp;
	        					</td>
			        		</tr>
			        	<%
			        	    break;
			        				        
			        				        case 2:	// license
			        	%>
			        		<tr>
			        			<td></td>
			        			<td class="SmallColHeading">
			        				License Barcode
		        				</td>
			        			<td class="SmallColHeading">
			        				License Count
		        				</td>
			        			<td class="SmallColHeading">
			        				# Assigned
		        				</td>
			        			<td class="SmallColHeading">
			        				<%=form.generateSiteOrLocationHeader()%>
		        				</td>
		        				<td>
		        					&nbsp;
	        					</td>
			        		</tr>
			        	<%
			        	    break;
			        				    }
			        			    }
			        			    // output row item data
			        			    bgcolor = "#FFFFFF";
			        			    if (!form.isPrinterFriendly() && (flipper || hasAssetHistoricalNotes)) {
			        			    	bgcolor = "#E8E8E8";
			        			    }
			        			    flipper = !flipper;
			        			    switch (rowType) {
			        			        case 0:	// normal item
			        			        case 1:	// media
			        	%>
		        		<tr bgcolor="<%=bgcolor%>" valign="top">
		        			<td></td>
		        			<td class="ColRow">
		        				<%=rec.getCopyBarcode()==null ? "" : BarcodeHelper.getTruncatedBarcode(rec.getCopyBarcode())%>
	        				</td>
		        			<td class="ColRow">
		        				<%=form.buildAssetItemStatusLink(rec)%>
	        				</td>
		        			<td class="ColRow">
                                <%= CopySpecs.getAssetConditionAsString(rec.getCopyCondition().intValue())%>
	        				</td>
		        			<td class="ColRow">
                                <%=form.generateSiteOrLocationName(rec)%>
	        				</td>
	        				<td class="Instruction tdAlignRight">
	        					<%=form.buildCopyActionLinks(response, request, rec)%>
        					</td>
		        		</tr>
		        	<%
		        	    break;
		        			        
		        			        case 2:	// license
		        	%>
		        		<tr bgcolor="<%=bgcolor%>">
		        			<td></td>
		        			<td class="ColRow">
		        				<%=rec.getCopyBarcode()==null ? "" : BarcodeHelper.getTruncatedBarcode(rec.getCopyBarcode())%>
	        				</td>
		        			<td class="ColRow">
		        				<%=rec.getLicenseCount().longValue() == CopySpecs.ASSET_LICENSE_COUNT_UNLIMITED ? CopySpecs.ASSET_LICENSE_COUNT_UNLIMITED_DESC : rec.getLicenseCount().toString()%>
	        				</td>
		        			<td class="ColRow">
		        				<%=rec.getLicensesAssigned().toString() %>
	        				</td>
		        			<td class="ColRow">
		        				<%=form.generateSiteOrLocationName(rec)%>
	        				</td>
	        				<td class="Instruction tdAlignRight">
	        					<%=form.buildCopyActionLinks(response, request, rec) %>
        					</td>
		        		</tr>
		        	<%
		            break;
		    }
		    %>
                        <%
                            for (int i = 0; i < rec.getAssetHistoricalNotesList().size(); i++) {
                                hasAssetHistoricalNotes = true;
                                HistoricalNoteViewVO hNotes = rec.getAssetHistoricalNotesList().get(i);
                        %>
                        <tr>
                          <td>&nbsp;</td>
                            <td colspan="5">
                                <table id="hnTable" width="70%" style="margin-left:10px">
                                    <tr>
                                        <td class="ColRow" style="width:80px"><%=hNotes.getDisplayableDate()%></td>
                                        <td class="ColRow" style="width:330px"><%=ResponseUtils.filter(hNotes.getNote())%></td>
                                        <td class="ColRow">Added by <%=ResponseUtils.filter(hNotes.getUserName()+" ["+AssetItemEditForm.getSiteShortName(hNotes.getUserSiteID())+"]")%></td>
                                   </tr>
                                </table>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                        <%
		}
	%>
         	</table>	<!-- close itemsTable in progress -->
         	</td>		<!-- close the items table cell/row -->
         	</tr>
         	</table>	<!-- close the title table  -->
            
            </td></tr></table>
            
		</td>
	</tr>
	<logic:present name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendlyLink">
		<tr>
			<td class="ColRow" colspan="6">
				<base:imageLine height="2" width="100%" />
			</td>
		</tr>
<% if (tableIndex > 0) { %>
        <tr>
            <td colspan="6">
                <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="6">
                <base:imageLine height="2" width="100%"/>
            </td>
        </tr>        
<% } %>              
	</logic:present>
	<tr>
	<td>
		<table id="<%=AssetPowerSearchForm.TABLE_PAGING_FOOTER%>" width="100%">
			<tr>
				<td>
	                 <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
	                     endOfSet= '<%="" + ( itemsToPrint )%>'
	                     totalInSet = '<%="" + ( itemsInList )%>'
	                     tooManyHits = 'false'
	                     />
				</td>
				<td class="SmallColHeading tdAlignRight">
                    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
                        <base:pageListOutput formName="<%=AssetPowerSearchForm.FORM_NAME%>" topOfPageLinks="false" />                        
                    </logic:equal>
                    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="true">
				    	&nbsp;
                    </logic:equal>
				</td>
			</tr>
		</table>
	</td>
</tr>

</base:outlinedTable>
<%
	}	// end of search results found block
}	// end of search executed block
%>
    <a name="refinesearch"></a>
    <jsp:include page="/cataloging/assetpowersearchcommon.jsp" flush="true" />

</base:form>

<logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="searchCriteriaChanged" value="true">
<script>
location.hash='refinesearch';
</script>
</logic:equal >
<logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="searchCriteriaChanged" value="false">
<script>
location.hash='topofpage';
</script>
</logic:equal >


