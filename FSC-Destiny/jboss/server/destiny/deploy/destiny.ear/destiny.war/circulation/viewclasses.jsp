<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>
<%@page import="com.follett.fsc.common.StringHelper"%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><c:set var="form" value="<%=request.getAttribute(ViewClassesForm.FORM_NAME)%>"/>

<%
    ViewClassesForm form = (ViewClassesForm)request.getAttribute(ViewClassesForm.FORM_NAME);
    String color = "#c0c0c0";
    String blockMessages = (String) request.getAttribute("blocklist");
    
    if(form.isPrintItMode()) {
        color = "";
    }

%>

<base:messageBox strutsErrors="true"/>

<base:form action="/circulation/servlet/handleviewclassesform.do">

<html:hidden property="<%=ViewClassesForm.PARAM_PATRON_ID %>" />
<html:hidden property="<%=ViewClassesForm.PARAM_ACTION %>" />
<html:hidden property="<%=ViewClassesForm.PARAM_COLLECTION_TYPE %>" />

<c:choose>
    <c:when test="<%=form.getComponentList() != null && ! form.getComponentList().isEmpty() %>">
            <br>
            <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                    <html:hidden property="<%=ViewClassesForm.FIELD_COMPONENT_COPY_ID %>" />
                    <html:hidden property="<%=ViewClassesForm.PARAM_BIB_ID %>" />
                    <base:textbookComponentKit componentList="<%=form.getComponentList() %>"/>
                </td>
            </tr>
            </base:messageBox>
            <br>
    </c:when>
    <c:when test="<%= blockMessages != null %>">
        <jsp:include page="/circulation/trapbarcodescan.jsp" />
        <span onKeyPress="return trapBarcodeScan(event);">
            <br>
            <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                    <html:hidden property="blockMessages" />
                    <html:hidden property="<%=ViewClassesForm.PARAM_BIB_ID %>" />
                    <%=MessageHelper.formatMessage("blockconfirm_TransactionBlocked")%><base:helpTag helpFileName="c_block_info_messages.htm"/>
                    <%= blockMessages%>
                    <p align="center"><%=MessageHelper.formatMessage("checkout_DoYouWantToCompleteThisTransaction")%></p>
                    <p align="center">
                        <html:submit property="overrideblocks"><%=MessageHelper.formatMessage("yes")%></html:submit>&nbsp;
                        <html:submit property="cancelcheckout"><%=MessageHelper.formatMessage("no")%></html:submit></p>
                </td>
            </tr>
            </base:messageBox>
            <br>
        </span>
    </c:when>
</c:choose>

    <base:outlinedTable id="<%=ViewClassesForm.TABLE_MAIN%>" borderColor="<%=color%>" width="95%" cellpadding="0" cellspacing="0">
        <tr>
        <%
            String classHeading = "Classes for " + form.getPatronName();
        %>
    
            <logic:equal name='<%= ViewClassesForm.FORM_NAME %>' property="printItMode" value="false" >
                <base:sectionHeading printerFriendly="false" heading="<%=classHeading %>" tdContent="valign='middle'"/>
                <td class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap>
                        <base:link page="<%= form.getPrintItLink() %>" target="printIt"><base:image src='/buttons/large/printit.gif' alt="Print It!"/></base:link>
                        <base:imageSpacer width="1" height="5"/>
                        <base:closeButton withX="true"/>
                </td>
            </logic:equal>
            
            <logic:equal name='<%= ViewClassesForm.FORM_NAME %>' property="printItMode" value="true" >
                <base:sectionHeading printerFriendly="true" heading="<%=classHeading %>" tdContent="valign='middle'"/>
                <td class="ColHeading tdAlignRight" nowrap>
                </td>
            </logic:equal>
        </tr>
        <tr>
            <td colspan="2">
                <table width="95%" align="center" id="<%=ViewClassesForm.TABLE_CLASSES%>" cellpadding="3" cellspacing="0">
                    <c:forEach var="clazz" items="${form.classes}">
                        <tr id="CLASSID_${clazz.classID}">
                            <td colspan="7" class="ColRow">
                	           <b>Period ${clazz.periodNumber}: ${clazz.className}</b>
                	           (${d:formatDate(clazz.startDate)} - ${d:formatDate(clazz.endDate)})
                               <c:if test="${form.store.siteID != clazz.classSiteID}">
                                    <font color='#cc0000'>[${clazz.classSiteShortName}]</font>
                               </c:if>
                            </td>
                        </tr>
                        <tr id="INFO_${clazz.classID}">
                            <td colspan="7" class="SmallColRow">
            	                Class ID: ${clazz.catalogDesignation}
                                <c:if test="${! empty clazz.sectionCatalogSuffix }">
                                    / Section: ${clazz.sectionCatalogSuffix}
                                </c:if>
                                <c:choose>
                                    <c:when test="${! empty clazz.teacherName }">
                                        (${clazz.teacherName})
                                    </c:when>
                                    <c:otherwise>
                                        (TBD)
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <c:if test="${empty clazz.copies}">
                            <tr id="HEADER">
                                <td class="SmallColHeading" colspan="7" align="center">
                                    <% if(form.getCollectionType() == CollectionType.ASSET) { %>
                                        No resources associated with this class.
                                    <% } %>
                                    <% if(form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                        No textbook title associated with this class.
                                    <% } %>
                                </td>
                            </tr>
                        </c:if>
                        <c:if test="${! empty clazz.copies}">
                    	    <tr id="HEADER" >
                                <td><IMG SRC="/images/icons/general/spacer.gif" width="15" height="1"></td>
                                
                                <td class="SmallColHeading">Due Date</td>
                                <% if(form.getCollectionType() == CollectionType.ASSET) { %>
                                    <td class="SmallColHeading">Displayable Name/Title</td>
                                <% } %>
                                <% if(form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                    <td class="SmallColHeading"><IMG SRC="/images/icons/general/spacer.gif" width="20" height="1">Title</td>
                                <% } %>
                                <td class="SmallColHeading">&nbsp;&nbsp;</td>
                                <td class="SmallColHeading">Group Name</td>
                                <td class="SmallColHeading">&nbsp;</td>
                                <td class="SmallColHeading">Price</td>
                                <td class="SmallColHeading">&nbsp;</td>
                                <td class="SmallColHeading">Checked Out</td>
                            </tr>
                            <% int flipper = 0; %>
                            <c:forEach var="txt" items="${clazz.copies}">
                                <tr id="TB_${clazz.classID}_${txt.bibID}" valign="top" <%= (((1 & flipper)==0 && !form.isPrintItMode())? "bgColor=\"#E8E8E8\"" : "" )%>>
                                    <td><IMG SRC="/images/icons/general/spacer.gif" width="15" height="1"></td>
                                    <td class="ColRow">
                                        <c:choose>
                                        <c:when test="${txt.consumable && txt.dateOut != null}">
                                            Consumable
                                        </c:when>
                                        <c:otherwise>
                                            ${d:formatDate(txt.copyDueDate)}
                                        </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td valign="top" class="ColRow" >
                                        <jsp:useBean id="txt" type="com.follett.fsc.destiny.session.circulation.data.CopyInfoBean"/>
                                        <% if(form.getCollectionType() == CollectionType.TEXTBOOK 
                                        || (form.getCollectionType() == CollectionType.ASSET && txt.isTemplateForTextbooksByBibID(txt.getBibID()))) { %>
                                        <logic:equal name='<%= form.FORM_NAME %>' property="printItMode" value="false" >
                                            <%=BibType.getBibTypeIcon(txt.isStateOwned(), txt.getMaterialType(), null, txt.getCollectionType(), Boolean.FALSE, null)%>&nbsp;
                                        </logic:equal>
                                        <logic:equal name='<%= form.FORM_NAME %>' property="printItMode" value="true" >
                                            <c:if test="${txt.stateOwned == true}">
                                                [<%=BibType.getStateBookShortDescription()%>]
                                            </c:if>
                                            [<%=BibType.getBibTypeShortDescription(txt.getMaterialType())%>]
                                        </logic:equal>
                                        <% } %>
                                        ${txt.copyTitle}
                                        <c:choose>
                                           <c:when test="${txt.consumable || txt.etextbook || txt.digitalMaterial}">
                                                <c:if test="${txt.copyDueDate != null}">
                                                <c:if test="${form.store.siteID != txt.copySiteID}">
                                                    <font color='#cc0000'>[${txt.siteShortName}]</font>
                                                </c:if>
                                                </c:if>
                                           </c:when>
                                           <c:otherwise>
                                                <c:if test="${txt.copyDueDate != null}">
                                                    <%= form.copyOrISBN(txt) %>
                                                </c:if>
                                           </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="SmallColHeading">&nbsp;&nbsp;</td>
                                    <td class="ColRow">
                                      <c:out value="${txt.textbookGroupName}"/>
                                    </td>
                                    <td class="SmallColHeading">&nbsp;&nbsp;</td>
                                    <td class="ColRow">
                                        ${d:formatPrice(txt.price, txt.currencyCode)}
                                    </td>
                                    <td class="SmallColHeading">&nbsp;&nbsp;</td>
                                    <td class="ColRow">
                                       <c:if test="${txt.dateOut != null}">
                                            ${d:formatDate(txt.dateOut)}
                                       </c:if>
                                      <logic:equal name='<%= ViewClassesForm.FORM_NAME %>' property="printItMode" value="false" >
                                           <c:if test="${txt.dateOut == null}">
                                              <c:if test="${txt.consumable && form.store.siteID == clazz.classSiteID}">
                                                 <% if (form.canDoConsumableCheckout()) { %>
                                                    <base:link id="<%=ViewClassesForm.PREFIX_CHECKOUT + txt.getBibID() %>" page="<%= form.gimmeCheckoutConsumableLink(txt.getBibID()) %>"><base:image src='/buttons/small/checkout.gif' alt="Check out"/></base:link>
                                                 <% } %>
                                              </c:if>
                                              <c:if test="${ (txt.etextbook || txt.digitalMaterial) && form.store.siteID == clazz.classSiteID}">
                                                 <base:link id="<%=ViewClassesForm.PREFIX_CHECKOUT + txt.getBibID() %>" page="<%= form.gimmeCheckouteTextbookLink(txt.getBibID()) %>"><base:image src='/buttons/small/checkout.gif' alt="Check out"/></base:link>
                                              </c:if>
                                              &nbsp;
                                           </c:if>
                                       </logic:equal>
                                    </td>
                                </tr>
                                <% flipper++; %>
                            </c:forEach>
                        </c:if>
                    </c:forEach>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>

<logic:present name="circulation_servlet_ViewClasses" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_ViewClasses" property="soundFile"/>");
//-->
 </script>
</logic:present>
