<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="form" name="<%=TextbookDetailForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm" />
<c:set var="form" value="<%=request.getAttribute(TextbookDetailForm.FORM_NAME)%>"/>
<tr>
   <td valign="top">
    <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_OUTLINE%>" border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr>
        <td valign="top" width="100%">
        <table width="100%"><tr><td valign="top">
            <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_HEADER%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    <td valign="top">
                        <table id="<%=TextbookDetailForm.TABLE_TITLE_PEEK%>" cellSpacing="0" cellPadding="0" width="100%" border="0">
                        <tr>
                            <td valign="top" align="center">
                                <!-- TitlePeek image -->
                                
                                <%
                                    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
                                %>
                                <%=form.getTitlePeekLink(store, true)%>
                             </td>
                        </tr>
                        </table>
                        
                    </td>
                    <td valign="top" width="100%">


                        <!-- Title information -->
                       
                        
                        <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_DETAIL%>" cellpadding="2" cellspacing="0">
                            <%= form.getTitleInformation() %>
                        </table>
                      

                        <!-- Copy availability information -->
                        <table id="<%=TextbookDetailForm.TABLE_COPY_AVAIL%>" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <table id="<%=TextbookDetailForm.TABLE_COPIES_SUMMARY%>" cellpadding="6" cellspacing="0">
                                    <tr>
                                        <%form.outputAvailabilityInfo(out, request);%>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        </table>

                        <!-- Summary of notes -->
                        <%= form.getNoteSummary() %>

                    </td>
                </tr>
            </table> <!-- end of the titleHeader table-->
        </td>
    </tr>
    <tr>
        <td valign="top">
            <%=form.getSupplementInfo(request)%>

            <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="canDoBookList" value="true">
                <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                    <table id="<%=TextbookDetailForm.TABLE_MY_LIST_SELECT%>" align="center">
	                    <tr>
	                        <td colspan="2" align="center">
	                            <base:myListSelect name="<%= TextbookDetailForm.FIELD_LIST_ID %>" submitOnChange="true" prompt="Selected List:" dropDownClass="SmallColRow"/>&nbsp;
	                            
	                            <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
	                                <base:link page='<%= form.getAddToMyListLink() %>' id="<%=TextbookDetailForm.ID_ADD_TO_MYLIST%>">
	                                <base:image src="/buttons/small/addtothislist.gif" align="absbottom"  alt="Add to this List" />
	                                </base:link>
	                            </logic:notEqual>
	                            <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
	                                <%= form.buildInMyListLink() %>
	                            </logic:equal>
	                        </td>
	                    </tr>
                    </table>
                </logic:equal>
            </logic:equal>

            <%=form.getDetailsNavTable()%>
            <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="showAllTitleInfo" value="true">
	            <%=form.getExploreTable(request)%>
	        </logic:equal>

            <%=form.getPublicationTable()%>
            <%=form.getComponentsTable()%>
            
            <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="showAllTitleInfo" value="true">
	            <%=form.getAdditionalInformationTable()%>
                <%=form.getAdoptionInformation()%>
	        </logic:equal>

            <%=form.getBundledTitleTable()%>
            <%=form.getBundlesContainingTitleTable()%>
	        
        </td>
    </tr>

    <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="displayTopLink" value="true">
    <tr>
        <td  class="SmallColRow tdAlignRight" vAlign="bottom">
            <a class="DetailLink" href="#TheTop">Top</a>
        </td>
    </tr>
    </logic:equal>

    </table>
    </td>
        <td valign="top" class="ColRowBold tdAlignRight">
            <!-- Action Button table -->
            <base:showHideTag id="onSave">
            <table id="<%=TextbookDetailForm.TABLE_ACTION_ICONS%>" border="0" cellpadding="2" cellspacing="0">

                <base:spanIfAllowed permissions='<%=new Permission[]{Permission.CAT_ADD_TEXTBOOK, Permission.CAT_EDIT_TEXTBOOK, Permission.CAT_DELETE_TEXTBOOK}%>'>
                    <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="saveTitleLink" value="">
                        <tr>
                            <td class="tdAlignRight">
                                    <base:link page='<%= form.getSaveTitleLink() %>' id="<%=TextbookDetailForm.ID_LINK_SAVE_TEXTBOOK%>">
                                <base:image src="/buttons/large/savetitle.gif" onClick="hideElementonSave()" alt="<%=TextbookDetailForm.LINK_SAVE_TEXTBOOK%>"/>
                                    </base:link>
                            </td>
                        </tr>
                    </logic:notEqual>

                        <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="editLink" value="">
                            <tr>
                                <td class="tdAlignRight">
                                        <c:if test="${form.addEditDeleteable}">
                                    <base:link permission='<%= Permission.CAT_EDIT_TEXTBOOK %>' page='<%= form.getEditLink() %>' id="<%=TextbookDetailForm.ID_LINK_EDIT_TEXTBOOK%>">
                                            <base:image src="/buttons/large/edittitle.gif" alt="<%=TextbookDetailForm.LINK_EDIT_TEXTBOOK%>"/>
                                    </base:link>
                                        </c:if>
                                </td>
                            </tr>
                        </logic:notEqual>

                        <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="deleteLink" value="">
                            <tr>
                                <td class="tdAlignRight">
                                        <c:if test="${form.addEditDeleteable}">
                                    <base:link permission="<%= Permission.CAT_DELETE_TEXTBOOK %>" page='<%= form.getDeleteLink() %>' id="<%=TextbookDetailForm.ID_LINK_DELETE_TEXTBOOK%>">
                                            <base:image src="/buttons/large/deletetitle.gif" alt="<%=TextbookDetailForm.LINK_DELETE_TEXTBOOK%>"/>
                                    </base:link>
                                        </c:if>
                                </td>
                            </tr>
                        </logic:notEqual>
                        <% if (form.canShowBundleButton()){ %>   
                            <tr>
                                <td class="tdAlignRight">
                                        <base:link page='<%= form.getBundleLink() %>' id="<%=TextbookDetailForm.ID_LINK_CREATE_BUNDLE %>">
                                        <base:image src="/buttons/large/bundle.gif" alt="<%=TextbookDetailForm.LINK_BUNDLE_IMAGE%>"/>
                                        </base:link>
                                </td>
                            </tr>
                        <%} %>    
                        <tr>
                            <td>
                                <base:imageSpacer width="10" height="10"/>
                            </td>
                        </tr>
                </base:spanIfAllowed>

                <% if (form.canAddCopy()) { %>
                <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="addCopyLink" value="">
                    <tr>
                        <td class="tdAlignRight">
                            <base:link page='<%= form.getAddCopyLink() %>' id="<%=TextbookDetailForm.ID_LINK_ADD_COPY%>">
                            <base:image src="/buttons/large/addcopies.gif" alt="<%=TextbookDetailForm.LINK_ADD_COPY%>"/>
                            </base:link>
                        </td>
                    </tr>
                </logic:notEqual>
                <% } %>
                <base:isNotDistrictUser>
                    <base:spanIfAllowed permission='<%=Permission.BACK_OFFICE_AED_CLASSES%>'>
                        <% if (!store.isStateContext() && !form.isStateTextbookBundle()) { %>   
                            <tr>
                                <td class="tdAlignRight">
                                    <base:link page='<%= form.getClassInfoLink() %>' id="<%=TextbookDetailForm.ID_LINK_CLASS_INFO%>">
                                    	<base:image src="/buttons/large/classinfo.gif" alt="<%=TextbookDetailForm.LINK_CLASS_INFO%>"/>
                                	</base:link>
                            	</td>
                            </tr>  
                        <% } %>                   
                    </base:spanIfAllowed>
                </base:isNotDistrictUser>
                <base:spanIfAllowed permission='<%=Permission.CAT_EDIT_TEXTBOOK%>'>
                    <c:if test="${form.addEditDeleteable}">   
                        <tr>
                            <td class="tdAlignRight">
                                <% if ( !form.isTsquaredRecord() ) { %>
                                    <base:link page='<%="/common/servlet/presenteditimageform.do?objectID=" + form.getBibID()%>' id="<%=TextbookDetailForm.ID_COVER_IMAGE%>">
                                    <base:image src="/buttons/large/coverimage.gif" alt="<%=TextbookDetailForm.LINK_COVER_IMAGE%>"/>
                                    </base:link>
                                <% } else { %>
                                    &nbsp;
                                <% } %>
                            </td>
                        </tr>
                        
                        <c:if test="<%= !StringHelper.isEmpty(form.getEditComponentsLink()) %>">
                            <tr>
                                <td class="tdAlignRight">
                                    <base:link permission='<%= Permission.CAT_EDIT_TEXTBOOK %>' page='<%= form.getEditComponentsLink() %>' id="<%=TextbookDetailForm.ID_LINK_EDIT_COMPONENTS%>">
                                        <base:image src="/buttons/large/components.gif" alt="<%=TextbookDetailForm.LINK_EDIT_COMPONENTS%>"/>
                                    </base:link>
                                </td>
                            </tr>
                        </c:if>
                    </c:if> 
                    <% if (store.isStateContext() && form.isStateTextbookBundle()) { %>   
                        <tr>
                            <td>
                                <base:imageSpacer width="10" height="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="tdAlignRight">
                                <base:link page='<%= form.getManageBundleLink() %>' id="<%= TextbookDetailForm.ID_LINK_MANAGE_BUNDLES%>">
                                    <base:image src="/buttons/large/titles.gif" alt="<%=TextbookDetailForm.LINK_MANAGE_BUNDLE_IMAGE%>"/>
                                </base:link>
                            </td>
                        </tr>  
                    <%} %>    
                </base:spanIfAllowed>
                <base:spanIfAllowed permission='<%=Permission.CAT_AED_TEXTBOOK_DIGITAL_RESOURCES%>'>
                        <c:if test="${form.displayingDigitalContent}">
                            <% if (form.displayAddDigitalContentButton()) { %>
                                <tr>
                                    <td class="tdAlignRight">
                                        <base:link page='<%= form.gimmeUpdateDigitalResourcesLink() %>' id='<%=TextbookDetailForm.ID_DIGITAL_RESOURCES %>'>
                                        <base:image src="/buttons/large/updatedigital.gif" alt='<%=MessageHelper.formatMessage("addDigitalContent") %>'/>
                                        </base:link>
                                    </td>
                                </tr>
                            <% } %>
                        </c:if>
               </base:spanIfAllowed>
                    <% if (form.showUnBundleLink()) { %>   
                        <tr>
                            <td class="tdAlignRight">
                                <base:link page='<%= form.getUnBundleLink() %>' id="<%= TextbookDetailForm.ID_LINK_UNBUNDLE%>" >
                                    <base:image src="/buttons/large/unbundle.gif" alt="<%=TextbookDetailForm.LINK_UNBUNDLE%>"/>
                                </base:link>
                            </td>
                        </tr>  
                    <%} %>    
                                   
                                
                <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="previewFollettEBookLink" value="">
                <tr>
                    <td>
                        <base:imageSpacer width="10" height="10"/>
                    </td>
                </tr>
                <tr>
                    <td class="tdAlignRight">
                        <base:link page='<%= form.getPreviewFollettEBookLink() %>' target='_blank' id="<%=TextbookDetailForm.ID_LINK_FOLLETT_EBOOK_READ_ONLINE%>">
                        <base:image src="/buttons/large/ebook_read_online.gif" alt="<%=TextbookDetailForm.LINK_FOLLETT_EBOOK_READ_ONLINE%>"/>
                        </base:link>
                    </td>
                </tr>
                </logic:notEqual>

                <logic:notEqual name="<%=TextbookDetailForm.FORM_NAME%>" property="checkoutFollettEBookDownloadLink" value="">
                <tr>
                    <td class="tdAlignRight">
                        <base:link page='<%= form.getCheckoutFollettEBookDownloadLink() %>' id="<%=TextbookDetailForm.ID_LINK_FOLLETT_EBOOK_CHECKOUT_DOWNLOAD%>">
                        <base:image src="/buttons/large/ebook_checkout_download.gif" alt="<%=TextbookDetailForm.LINK_FOLLETT_EBOOK_CHECKOUT_DOWNLOAD%>"/>
                        </base:link>
                    </td>
                </tr>
                </logic:notEqual>

                <tr>
                    <td nowrap>
                    <% if(form.getPreviousBibID() != null) { %>
                        <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=TextbookDetailForm.ID_PREVIOUS_TITLE%>">
                        <base:image src="/icons/general/previouslonger.gif" width="44" height="26" alt="<%=TextbookDetailForm.LINK_PREVIOUS_TITLE%>"/>
                        </base:link>
                    <% } else { %>
                        <base:imageSpacer width="44" height="26"/>
                    <% } %>
                    <% if(form.getNextBibID() != null) { %>
                        <base:link page='<%= form.getNextRecordLink() %>' id="<%=TextbookDetailForm.ID_NEXT_TITLE%>">
                        <base:image src="/icons/general/nextlonger.gif" width="44" height="26" alt="<%=TextbookDetailForm.LINK_NEXT_TITLE%>"/>
                        </base:link>
                    <% } else { %>
                        <base:imageSpacer width="44" height="26"/>
                    <% } %>
                    </td>
                </tr>

            </table>
            </base:showHideTag>

        </td>
    </tr>

    </table>
  </td>
</tr>

