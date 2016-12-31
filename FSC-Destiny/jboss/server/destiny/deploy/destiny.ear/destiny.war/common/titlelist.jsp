<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="org.apache.struts.util.*" %>

<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopyVO" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.BarcodeHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.CopyClientValue"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>

<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<%
    String formName = request.getParameter("formName");
    String quantity = request.getParameter(HoldRequestForm.FIELD_QUANTITY);
    boolean showAvailability = false;
    if ( request.getParameter("showAvailability") != null ) {
        showAvailability = "true".equals(request.getParameter("showAvailability"));
    }
    boolean neverShowAvailability = false;
    if ( request.getParameter("neverShowAvailability") != null ) {
        neverShowAvailability = "true".equals(request.getParameter("neverShowAvailability"));
    }

    boolean renderLineAboveEachRow = false;
    String renderValue = request.getParameter("renderLineAboveEachRow");
    if ( renderValue != null ) {
        renderLineAboveEachRow = "true".equals(renderValue);
    }

    String selectURL = request.getParameter("selectURL");

    BaseListForm form = (BaseListForm)request.getAttribute(formName);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    Long storeSiteID = store.getSiteID();
    
    boolean districtUserLoggedInToDistrict = false;
    
    if (store.isDistrictUser() && ((storeSiteID == null) || (storeSiteID.longValue() == 0))) {
        districtUserLoggedInToDistrict = true;
    }
    
    boolean digitalResourceMode = false;
    if (form instanceof BaseSearchResultsForm) {
        digitalResourceMode = ((BaseSearchResultsForm) form).getDigitalContentMode() == AdvancedSearchQueryData.SEARCH_DIGITAL_RESOURCES_ALL;
    }
%>


<logic:equal name="<%=formName%>" property="printerFriendly" value="true">
<table width="100%" id="keywordTable" border="0" cellpadding="2" cellspacing="0">
</logic:equal>
<logic:iterate indexId="count" id="rec" name="<%=formName%>" property="list" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
    <logic:equal name="<%=formName%>" property="printerFriendly" value="false">
        <%
            if(renderLineAboveEachRow) {
        %>
        <tr>
            <td colspan="3">
                <base:imageLine height="2" vspace="1" />
            </td>
        </tr>
        <%
            }
        %>
    </logic:equal>
    <tr>
    
    <td class="ColRow" valign="top">
        <base:titleImage rec="<%=rec%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
    </td>

    <td id="<%=BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO_CELL+count %>" valign="top" width="100%"> <!-- Info Column  -->
        <%
                    if ( rec.getRelevancePercentage() != null ) {
                %>
            <!--REL=<%=rec.getRelevancePercentage().toString()%>-->
        <%
            }
        %>
                <table id="<%=BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + count%>" c border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">
                    <tr>
                        <td class="ColRowBold" colspan="2">
                            <a name='<%= "anchor_" + (! StringHelper.isEmptyOrWhitespace(rec.getDcpiRecordGUID()) ? rec.getDcpiRecordGUID() : rec.getRecID()) %>'></a>
                            <a name="<%=BaseTitleDetailForm.ANCHOR_TO_GO_TO_ON_RESTORE + (! StringHelper.isEmptyOrWhitespace(rec.getDcpiRecordGUID()) ? rec.getDcpiRecordGUID() : rec.getRecID())%>"></a>
                            <base:titleDetailHover
                                rec="<%=rec%>"
                                formName="<%=formName%>"
                                printerFriendly="<%=form.isPrinterFriendly()%>"
                                quantity="<%=quantity%>"
                                elementaryMode="<%=form.isElementaryMode()%>"
                                digitalResourceMode="<%= digitalResourceMode %>"
                                renderTitleDetailsButtonLink="false"
                                />
                            <!--<%=BaseSearchResultsForm.COMMENT_TITLE_LINE%>-->
                            &nbsp;&nbsp;<base:temporaryIcon temporary="<%=rec.isTemporary()%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
                        </td>
                    </tr>
                    <logic:equal name="rec" property="collectionType" value='<%=""+BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
                        <tr>
                            <td class="ColRow" valign="top" nowrap colspan="2">
                                <bean:write name="rec" property="assetTypeDescription"/>
                            </td>
                        </tr>
                    </logic:equal>
                    <tr>
                        <td class="ColRow" valign="top" nowrap>
                            <c:choose>
                                <c:when test="<%= (rec.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET || AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID()))%>">
                                    &nbsp;&nbsp;
                                    <base:bibTypeIcon rec="<%=rec%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
                                    &nbsp;
                                </c:when>
                                <c:otherwise>
                                    &nbsp;
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td class="ColRow" valign="top" width="100%">
                            <%
                                if (!store.isMediaBookingUser() && form!=null && form.isRenderMediaLocationInfo()) { 
                                                    if ( rec.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) {
                                                        out.print("<B>");
                                                        if ( store.getMediaSiteCount() > 1) {
                                                            out.print(ResponseUtils.filter(store.getMediaSiteTypeDescription()));
                                                        } else {
                                                            out.print(ResponseUtils.filter(store.getMediaSiteBrowseName()));
                                                        }
                                                        out.print("&nbsp;&nbsp;");                                                
                                                        out.println("</B>");
                                                    }
                                                }
                            %> 
                            <base:callNumber rec="<%=rec%>" printerFriendly="<%=form.isPrinterFriendly()%>" hideCallNumber="<%=form.isHideCallNumber()%>"/>
                            <%if(digitalResourceMode){  %>
                                <%=SearchResultsOutputListRenderer.getFilteredString(rec.getPublisher(), false)%>
                            <% } else { %>
                                <%=SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false)%>
                            <% } %>
                            <% if(form.isTextbook() || rec.isTextbookAsset()) { %>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=SearchResultsOutputListRenderer.getFilteredString(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()), true)%>
                                <%
                                    if (rec.getReplacementPrice() != null) {
                                %>
                                    &nbsp;&nbsp;<%=lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                <%
                                    }
                                %>
                            <% } %>
                        </td>
    
                    </tr>
                    <logic:equal name="<%=formName%>" property="textbook" value="false">
                        <%if(!StringHelper.isEmpty(rec.displaySubLocation())){ %>
                        <tr>
                            <td class="ColRow">&nbsp;</td>
                            <td class="ColRow"><%=rec.displaySubLocation()%></td>
                        </tr>
                        <%} %>                                
                    </logic:equal>
                                        
                    <% if (!StringHelper.isEmpty(rec.getSeriesDisplayable())) { %>
                    <tr>
                        <td class="ColRow">&nbsp;</td>
                        <td class="ColRow"><%= MessageHelper.formatMessage("titlelist_Series") %> <%= rec.getSeriesDisplayable() %></td>
                    </tr>
                    <% } %>
                    
                    <c:choose>
                    <c:when test="<%= (rec.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK || AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID()))%>">
                        <tr>
                            <td class="ColRow" colspan="2">
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
                    </c:when>
                    
                    <c:otherwise>
                        <%if(!StringHelper.isEmpty(rec.displayPubInfo())){ %>
                        <tr>
                            <td class="ColRow">&nbsp;</td>
                            <td class="ColRow"><%=rec.displayPubInfo()%></td>
                        </tr>
                        <%} %>                                
                    </c:otherwise>
                    </c:choose>                            
                    
                   
                    <base:readingAndInterestGradeLevelInfo rec="<%=rec%>"/>
                    <base:readingProgramInfo rec="<%=rec%>"/>
                    <base:lexileInfo rec="<%=rec%>"/>
                    <base:fountasPinnellInfo rec="<%=rec%>"/>
                    
                    <% if ((!form.isPrinterFriendly()) && (!rec.isShelfBib())) { %>
                        <c:if test="<%=rec.getReviewAverage() != null%>">
                            <tr>
                                <td class="ColRow">
                                    &nbsp;
                                </td>
                                <td class="ColRow">
                                    <base:reviewStars value="<%=rec.getReviewAverage().doubleValue()%>"/>
                                </td>
                                <td class="ColRow">&nbsp;</td>
                            </tr>
                        </c:if>
                    <% } %>
                    
                    <% if (rec.isDigitalMediaRecord()) { %>
                        <tr>
                            <td class="ColRow">&nbsp;</td>
                            <td class="ColRow" colspan="3"><%= SearchResultsOutputListRenderer.getFilteredString(rec.getSummary(), false) %></td>
                        </tr>
                    <% } %>
                    
                    <%
                                    if (form instanceof CategorySearchResultsForm) { 
                                            CategorySearchResultsForm f = (CategorySearchResultsForm)form;
                                            boolean isShowMore = (f.getShowMoreBibID() != null &&
                                                f.getShowMoreBibID().equals(rec.getRecID()));
                                            String copiesInCategoryKey = MessageHelper.formatMessage("titlelist_CopiesInThisCategory", new Long(rec.getCopyCount().longValue())); 
                                            if (form.getCollectionType() == CollectionType.ASSET) {
                                                copiesInCategoryKey = MessageHelper.formatMessage("titlelist_ItemsInThisCategory", new Long(rec.getCopyCount().longValue())); 
                                            }
                                %>
                            <tr>
                                <td colspan="3"><span class="ColRowBold"><%=copiesInCategoryKey%></span>
                                <span class="SmallColRow">
                                <%
                                    String baseURL = "/cataloging/servlet/handlecategorysearchresultsform.do" +
                                                        "?categoryID=" + f.getCategoryID() +
                                                        "&categoryDescription=" + f.getCategoryDescription() +
                                                        "&collectionType=" + f.getCollectionType() +
                                                        "&sort=" + f.getSort() +
                                                        "&descend=" + f.isDescend() +
                                                        "&dateDescend=" + f.isDateDescend() +
                                                        "&page=" + f.getPage() +
                                                        "&totalCount=" + f.getTotalCount();
                                                    String url = baseURL;
                                                    
                                                    if (!isShowMore) {
                                                        url += "&showMoreBibID=" + rec.getRecID() + "#anchor_" + rec.getRecID();
                                                    }
                                                    
                                                    if (!form.isPrinterFriendly()) {
                                %>
                                    <a href="<%=url%>" class="DetailLink">
                                        <%
                                            if (isShowMore) {
                                        %><%= MessageHelper.formatMessage("titlelist_ShowLess") %>&nbsp;<base:image src="/icons/general/showless.gif"  alt='<%= MessageHelper.formatMessage("titlelist_ShowLess") %>'/>
                                        <%
                                            } else {
                                        %><%= MessageHelper.formatMessage("titlelist_ShowMore") %>&nbsp;<base:image src="/icons/general/showmore.gif"  alt='<%= MessageHelper.formatMessage("titlelist_ShowMore") %>'/>
                                        <%
                                            }
                                        %>
                                    </a>
                                    <%
                                        }
                                    %>
                                </span>
                                </td>
                            </tr>
                            <%
                                if (rec.getCopyList() != null) { 
                                            String removeAllURL = baseURL +
                                                    "&showMoreBibID=" + rec.getRecID() +
                                                    "&bibIDToRemove=" + rec.getRecID() +
                                                    "&collectionType=" + f.getCollectionType();
                            %>
                                <tr>
                                    <td colspan="3">
                                    <table width="100%" id="<%=CategorySearchResultsForm.TABLE_COPY_LIST%>" cellspacing="0">
                                    <tr>
                                        <%
                                            if (form.getCollectionType() != CollectionType.ASSET &&
                                                                        form.getCollectionType() != CollectionType.TEXTBOOK) {
                                        %>
                                        <td class="SmallColHeading"><%=MessageHelper.formatMessage("titlelist_CallNumber")%></td>
                                        <%
                                            }
                                        %>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("titlelist_Barcode") %></td>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("titlelist_Status") %></td>
                                        <c:if test="<%=store.isDistrictUser() %>">
                                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("titlelist_Site") %></td>
                                        </c:if>
                                        <%
                                            if (form.getCollectionType() == CollectionType.ASSET) {
                                        %>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("titlelist_HomeLocation") %></td>
                                        <%
                                            }
                                        %>
                                        <%
                                            if (form.getCollectionType() == CollectionType.TEXTBOOK) {
                                        %>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("titlelist_Location") %></td>
                                        <%
                                            }
                                        %>
                                        <%
                                            if (!form.isPrinterFriendly()) {
                                        %>
                                        <td class="tdAlignRight"><base:link collectionType="<%=form.getCollectionType()%>" page="<%=removeAllURL%>" permissions="<%=new Permission[]{Permission.CAT_CREATE_ASSIGN_CATEGORIES, Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET, Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK}%>"><base:image src="/buttons/small/removeall.gif"  alt='<%= MessageHelper.formatMessage("removeAll") %>'/></base:link></td>
                                        <%
                                            }
                                        %>
                                    </tr>
                                <%
                                    for (int index = 0; index < rec.getCopyList().size(); index ++) { 
                                                    CopyClientValue c = (CopyClientValue)rec.getCopyList().get(index);
                                                    
                                                    String removeURL = baseURL + 
                                                        "&showMoreBibID=" + rec.getRecID() +
                                                        "&copyIDToRemove=" + c.getCopyID() +
                                                        "&collectionType=" + f.getCollectionType();
                                %>
                                    <tr <%=(( ( 1 & index)==0)? "bgColor=\"#E8E8E8\"" : "" )%>>
                                        <%
                                            if (form.getCollectionType() != CollectionType.ASSET &&
                                                                    form.getCollectionType() != CollectionType.TEXTBOOK) {
                                        %>
                                        <td class="ColRow"><%=HTMLFilterHelper.filter(c.getCallNumber())%></td>
                                        <%
                                            }
                                        %>
                                        <td class="ColRow"><%=c.getCopyBarcode() != null ? BarcodeHelper.getTruncatedBarcode(c.getCopyBarcode()) : ""%></td>
                                        <td class="ColRow"><%=CopySpecs.getCopyStatusAsString(c.getStatus())%></td>
                                        <c:if test="<%=store.isDistrictUser() %>">
                                            <td class="ColRow"><c:out value="<%=c.getSiteName() %>" /></td>
                                        </c:if>
                                        <% if (form.getCollectionType() == CollectionType.ASSET || form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                        <td class="ColRow"><%= StringHelper.isEmpty(c.getLocationDescription()) ? "" : c.getLocationDescription() %></td>
                                        <% } %>
                                        <% if (!form.isPrinterFriendly()) { %>
                                        <td class="tdAlignRight">
                                        <base:link collectionType="<%=form.getCollectionType()%>" page="<%= removeURL %>" permissions="<%= new Permission[]{Permission.CAT_CREATE_ASSIGN_CATEGORIES, Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET, Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK} %>"><base:image src="/buttons/small/remove_70.gif"  alt='<%= MessageHelper.formatMessage("remove") %>'/></base:link></td>
                                        <% } %>
                                    </tr>
                                <% } %>
                                    </table>
                                    </td>
                                </tr>
                        <% } %>
                    <% } %>
            </table>
        </td>
        <td id="<%=BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS_CELL+count %>" class="tdAlignRight" valign="top">
            <table id="<%=BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS  + count%>">
               <% for(String row : form.buildControlStatusTableRows(rec,pageContext)) { %>
                    <tr>
                    <%= row %>
                    </tr>
               <% } %>
            </table>
        </td>
    </tr>
    <logic:equal name="<%= formName %>" property="printerFriendly" value="false">
        <% if(!renderLineAboveEachRow) { %>
        <tr>
            <td colspan="3">
                <base:imageLine height="2" vspace="1" />
            </td>
        </tr>
        <% } %>
    </logic:equal>
</logic:iterate>
<logic:equal name="<%= formName %>" property="printerFriendly" value="true">
</table>
</logic:equal>
