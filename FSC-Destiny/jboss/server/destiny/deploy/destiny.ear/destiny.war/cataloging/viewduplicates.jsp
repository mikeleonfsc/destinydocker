<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.BibImportBean"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.TitleImageTag" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<bean:define id="sortOptions" name="cataloging_servlet_ViewDuplicatesForm" property="sortOptions"/>
<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    ViewDuplicatesForm form = (ViewDuplicatesForm)request.getAttribute( "cataloging_servlet_ViewDuplicatesForm" );
    String bestPrompt = form.getCollectionType() == CollectionType.ASSET  ? "Best resource" : MessageHelper.formatMessage("viewduplicates_BestTitle");
%>
<!-- ONLY display the table if there was results passed -->
<base:form action="/cataloging/servlet/handleviewduplicatesform.do" styleId="keywordSearch">
    <html:hidden property="<%=ViewDuplicatesForm.FIELD_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=BibImportBean.MERGE_URL_PARAM_BIB_ID_NEW%>"/>
    <html:hidden property="<%=BibImportBean.MERGE_URL_PARAM_BIB_ID_EXISTING%>"/> 

<logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
</logic:equal>

<logic:present name="cataloging_servlet_ViewDuplicatesForm" property="bestTitle" scope="request" >
    <logic:equal name="cataloging_servlet_ViewDuplicatesForm" property="action" value="ConfirmMerge">
        <base:imageSpacer width="1" height="3"/>
        <%
            String message = "<ul><li>";
            if (form.getCollectionType() == CollectionType.ASSET) {
               message += MessageHelper.formatMessage("viewduplicates_AllOfTheItemsOnThisList");
            } else {
                if (form.getbibnew() != null) {
                    message += MessageHelper.formatMessage("viewduplicates_AllOfTheCopiesAndIsbnsOnThisList");
                } else {
                   message += MessageHelper.formatMessage("viewduplicates_AllOfTheCopiesOnThisList");
                }
            }
            
            message += "</ul>";
               
        %>
        <base:messageBox showWarningIcon="true" message="<%=message%>" filterMessage="false">
            <tr>
                <td align="center" class="ColRowBold" colspan="2"><%= MessageHelper.formatMessage("viewduplicates_WeRecommendThatYouPrintThisPageForYourRecords") %></td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("viewduplicates_AreYouSureYouWantToProceed") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%= ViewDuplicatesForm.BUTTON_NAME_CONFIRM_MERGE_YES %>"
                        buttonNoName="<%= ViewDuplicatesForm.BUTTON_NAME_CONFIRM_MERGE_NO %>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
</logic:present>

<%
    int itemsInList = 0; // assume nothing to show

    if (request.getAttribute("MyKeywordList") != null) {

        itemsInList = form.getTotalCount(); // if nonzero, paint results

        // If we have results, display a result.
%>
            <base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0" id="<%=ViewDuplicatesForm.TABLE_MAIN%>">
            <tr>
                <td class="ColRowBold" colspan="2"><%=form.outputHeader()%></td>
                <td class="tdAlignRight">
                    <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                        <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=ViewDuplicatesForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/></base:link>
                    </logic:equal>
                    <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
                        &nbsp;
                    </logic:equal>
                </td>
            </tr>

            <tr>
                <td>
                    <%
                    String name = MessageHelper.formatMessage("viewduplicates_Titles");
                    if (form.getCollectionType()==CollectionType.ASSET) {
                    	name = "Resources";
                    }
                    %>
                    <base:searchSummary searchType="<%=name%>" startOfSet='1'
                        endOfSet= '<%="" + ( itemsInList )%>'
                        totalInSet = '<%="" + ( itemsInList )%>'
                        tooManyHits = 'false'
                        />
                </td>
                <td align="center">
                    <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                        <html:hidden property="descend"/>
                        <html:hidden property="dateDescend"/>
                        <html:hidden property="lastSortType"/>
                        
                        <logic:notPresent name="<%= ViewDuplicatesForm.FORM_NAME %>" property="<%=BibImportBean.MERGE_URL_PARAM_BIB_ID_NEW%>">
                        <logic:notEqual name="<%= ViewDuplicatesForm.FORM_NAME %>" property="<%= ViewDuplicatesForm.PARAM_COLLECTION_TYPE %>" value='<%= ""+CollectionType.ASSET %>'>
	                        <span class="SmallColHeading"><%= MessageHelper.formatMessage("viewduplicates_SortBy") %></span>
	                        <html:select property="sort" styleClass="SmallColRow">
	                            <html:options collection="sortOptions" property="stringCode" labelProperty="stringDesc"/>
	                        </html:select>
                            <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true" alt='<%= MessageHelper.formatMessage("go") %>' name="<%= BaseSearchResultsForm.BUTTON_CHANGE_SORT %>" />
	                    </logic:notEqual>
                        </logic:notPresent>
                    </logic:equal>
                    <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
                        &nbsp;
                    </logic:equal>
                </td>
                <td class="SmallColHeading tdAlignRight">
                    &nbsp;
                </td>
            </tr>

<%
            if(itemsInList > 0) {
%>
            <tr><td colspan="3">
            <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                	<base:imageLine height="2" width="100%"/>
            </logic:equal>
            <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
                <hr>
            </logic:equal>
            <html:hidden property="totalCount" value='<%= "" + itemsInList %>' />
            </td></tr>
            <tr><td colspan="3">
            <table id="keywordTable" width="100%" cellspacing="0" cellpadding="4">
<%
                int sequence = 0;
%>
                <logic:iterate id="rec" name="<%= ViewDuplicatesForm.FORM_NAME %>" property="list" type="com.follett.fsc.destiny.session.cataloging.data.BestKeywordSearchRecord">

                   <logic:equal name="<%= ViewDuplicatesForm.FORM_NAME %>" property="<%= ViewDuplicatesForm.PARAM_COLLECTION_TYPE %>" value='<%= ""+CollectionType.ASSET %>'>
	                    <tr >
							<td class="ColRow" valign="top">
								<base:titleImage rec="<%= rec %>" printerFriendly="<%= form.isPrinterFriendly() %>"/>
							</td>
	                        <td width="100%" valign="top">
	                            <table width="100%" id="<%= (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + (sequence++)) %>">
	                                <tr>
	                                   <td class="ColRowBold" valign="top">
	                                        <%= form.outputTitleAndDetail(request, response, rec) %>
	                                   </td>
	                                   <td valign="top" class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("viewduplicates_Items", Long.valueOf(rec.getCopyCount().longValue())) %>
                                       </td>
	                                </tr>
	                                <tr>
	                                    <td class="ColRow" valign="top">
                       					    <bean:write name="rec" property="assetTypeDescription"/>
                       					</td>
	                                    <td class="tdAlignRight">
	                                        <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                                                <base:genericButton src="/buttons/small/remove_70.gif" alt='<%= MessageHelper.formatMessage("remove") %>'
	                                                name="<%=ViewDuplicatesForm.BUTTON_NAME_REMOVE_SELECTED+rec.getRecID()%>"/>
	                                        </logic:equal>
	                                        <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
	                                            &nbsp;
	                                        </logic:equal>
	                                    </td>
	                                </tr>
	                                <tr>
	                                    <td colspan="2" class="tdAlignRight">
	                                        <nobr>
	                                        <% if (!form.isPrinterFriendly()) { %>
	                                            <span class="FormElement"><html:radio name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.FIELD_NAME_BEST_TITLE%>" value='<%=""+rec.getRecID()%>' onclick="this.form.submit()"/>
	                                            </span>
	                                            <span class="ColRow">&nbsp;<%=bestPrompt%></span>
	                                        <% } else if (rec.getRecID().equals(form.getBestTitle())) { %>
	                                            <span class="ColRow"><%=bestPrompt%></span>
	                                        <% } else { %>
	                                            &nbsp;
	                                        <% } %>
	                                        </nobr>
	                                    </td>
	                                </tr>
	                            </table>
	                        </td>
	                    </tr>
                   </logic:equal>                
                   <logic:notEqual name="<%= ViewDuplicatesForm.FORM_NAME %>" property="<%= ViewDuplicatesForm.PARAM_COLLECTION_TYPE %>" value='<%= ""+CollectionType.ASSET %>'>
	                    <tr>
	                         <td class="ColRow" valign="top">
                            	<%=TitleImageTag.getTitlePeekImage(store, rec, form.isPrinterFriendly())%>
	                        </td>
	                        <td width="100%" valign="top">
	                            <table width="100%" id="<%= (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + (sequence++)) %>">
	                                <tr>
	                                    <td class = "ColRowBold" colspan="2">
	                                        <%= form.outputTitleAndDetail(request, response, rec) %>
	                                    </td>
	                                    <td class = "ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("viewduplicates_Copies", Long.valueOf(rec.getCopyCount().longValue())) %>
	                                    </td>
	                                </tr>
	                                <tr>
	                                    <td align="Center" class="ColRow">
	                                        <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                                                <base:bibTypeIcon rec="<%= rec %>" printerFriendly="<%= form.isPrinterFriendly() %>"/>
	                                        </logic:equal>
	                                        <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
	                                            [&nbsp;<%= form.outputMaterialTypeText(rec) %>&nbsp;]
	                                        </logic:equal>
	                                    </td>
	                                    <td class="ColRow">
	                                        <bean:write name="rec" property="author" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                                        <bean:write name="rec" property="displayableLCCN" />&nbsp;&nbsp;&nbsp;&nbsp;
	                                        <%=BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN())%>&nbsp;&nbsp;<%= MessageHelper.formatMessage("viewduplicates_ControlNumber", rec.getRecID().toString()) %>
	                                    </td>
	                                    <td class="tdAlignRight">
                                        
                                            <%boolean printedButton = false; %>
                                            <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                                               
                                               <logic:notPresent name="<%= ViewDuplicatesForm.FORM_NAME %>" property="<%=BibImportBean.MERGE_URL_PARAM_BIB_ID_NEW%>">
                                                <%printedButton = true; %>
                                                <base:genericButton src="/buttons/small/remove_70.gif" alt='<%= MessageHelper.formatMessage("remove") %>'
                                                    name="<%=ViewDuplicatesForm.BUTTON_NAME_REMOVE_SELECTED+rec.getRecID()%>"/>
                                              </logic:notPresent>
                                            </logic:equal>
                                            <%if (printedButton) {%>
                                                &nbsp;
                                            <%} %>
                                   
	                                    </td>
	                                </tr>
	                                <tr>
	                                    <td class="SmallColHeading" align="Center">
	                                        <bean:write name="rec" property="sourceName" />&nbsp;
	                                    </td>
	                                    <td class="ColRow">
	                                        <bean:write name="rec" property="publisher260a" />&nbsp;
	                                        <bean:write name="rec" property="publisher" />&nbsp;
	                                        <bean:write name="rec" property="pubYear" /><logic:notEmpty name="rec" property="pubYear">.</logic:notEmpty>&nbsp;
	                                        <bean:write name="rec" property="edition" />&nbsp;
	                                        <bean:write name="rec" property="extent" />
	                                    </td>
	                                    <td class="tdAlignRight">
	                                        <nobr>
	                                        <% if (!form.isPrinterFriendly()) { %>
	                                            <span class="FormElement"><html:radio name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.FIELD_NAME_BEST_TITLE%>" value='<%=""+rec.getRecID()%>' onclick="this.form.submit()"/>
	                                            </span>
	                                            <span class="ColRow">&nbsp;<%= MessageHelper.formatMessage("viewduplicates_BestTitle") %></span>
	                                        <% } else if (rec.getRecID().equals(form.getBestTitle())) { %>
	                                            <span class="ColRow"><%= MessageHelper.formatMessage("viewduplicates_BestTitle") %></span>
	                                        <% } else { %>
	                                            &nbsp;
	                                        <% } %>
	                                        </nobr>
	                                    </td>
	                                </tr>
	                            </table>
	                        </td>
	                    </tr>
                   </logic:notEqual>                
                
                    <tr>
                        <td width="100%" colspan="2">
                            <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                                <base:imageLine height="2" width="100%"/>
                            </logic:equal>
                            <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
                                <hr>
                            </logic:equal>
                        </td>
                    </tr>
                </logic:iterate>

            <!-- end the table now... -->
            </table>


<%
            } else {
                // We have no results.
%>
            <table id="<%= ViewDuplicatesForm.TABLE_NO_MATCHES %>" width="100%" cellspacing="0" cellpadding="4">
                <tr>
                    <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewduplicates_NoResults") %></td>
                </tr>
            </table>
<%
            }
%>

            <table width="100%" cellspacing="0" cellpadding="4" id="<%= BaseSearchResultsForm.TABLE_PAGING_FOOTER %>">
                <tr>
                    <td>
                        <base:searchSummary searchType="<%= name %>" startOfSet='1'
                            endOfSet= '<%="" + ( itemsInList )%>'
                            totalInSet = '<%="" + ( itemsInList )%>'
                            tooManyHits = 'false'
                            />
                    </td>
                    <td class="tdAlignRight">
                        <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                            <base:genericButton src="/buttons/large/merge.gif" name="<%= ViewDuplicatesForm.BUTTON_NAME_SUBMIT %>" alt='<%=MessageHelper.formatMessage("merge")%>'/>
                        </logic:equal>
                        <logic:equal name="<%=ViewDuplicatesForm.FORM_NAME%>" property="<%=ViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
                            &nbsp;
                        </logic:equal>
                    </td>
                </tr>
            </table>
        </td>
        </tr>
        </base:outlinedTable>

<%
    }
%>

</base:form>

