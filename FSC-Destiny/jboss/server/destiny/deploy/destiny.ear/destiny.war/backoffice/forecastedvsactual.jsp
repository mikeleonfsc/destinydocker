<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastedVSActualForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    ForecastedVSActualForm form = (ForecastedVSActualForm)request.getAttribute(ForecastedVSActualForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

    <base:outlinedTable id="<%=ForecastedVSActualForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
    
        <tr>
            <td class="TableHeading"><%= ResponseUtils.filter(form.getForecastTitle()) %></td>
            <td class="tdAlignRight">
                <%if(!form.isPrinterFriendly()){%>
                    <base:link page='<%="/backoffice/servlet/presentforecastedvsactualform.do?" + ForecastedVSActualForm.PARAM_PRINTER_FRIENDLY + "=true&" + ForecastedVSActualForm.PARAM_FORECAST_ID + "=" + form.getForecastID()%>' target="printerFriendly" id="<%=ForecastedVSActualForm.ID_PRINTER_FRIENDLY %>"><base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></base:link>
                <%} %>
           </td>
        </tr>
        <tr>
            <td colspan="2" class="TableHeading">
                <%if (!form.isPrinterFriendly() ) {%>
                   <base:imageLine height="2"/>
                <% } else { %> 
                    <hr>
                <% } %>
            </td>
        </tr>
        <tr>
            <td colspan="2" width="100%">
            <%if(form.getTextbookList().size()==0){ %>
                <span class="ColRowBold">
                    <center>
                    There are no textbooks associated with this forecast.
                    </center>
                </span>
            <%}else{ %>
                <table id="<%=ForecastedVSActualForm.TABLE_BIB%>" width="100%" cellpadding="3" cellspacing="0">
                    <tr>
                        <td colspan="3">&nbsp;</td>
                        <td class="SmallColHeading" colspan="2" align="center"><U>Current Inventory</U></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr> 
                        <td class="SmallColHeading">Textbook</td>
                        <td class="SmallColHeading" align="center">Beginning</td>
                        <td class="SmallColHeading" align="center">Peak Need</td>
                        <td class="SmallColHeading" align="center">Local</td>
                        <td class="SmallColHeading" align="center">Offsite</td>
                        <td class="SmallColHeading">&nbsp;</td>
                    </tr>
                        <% int flipper = 0; 
                            String bgColor = "";
                        %>
                        <logic:iterate id="textbookList" name="<%=ForecastedVSActualForm.FORM_NAME %>" property="textbookList" type="com.follett.fsc.destiny.session.backoffice.data.ForecastedVSActualTextbookVO">
                            <% if ( ( flipper & 1 ) == 0 ) {
                                    bgColor = "bgColor=\"#E8E8E8\"";
                                }
                                else {
                                    bgColor = "";
                                }
                        %>
                            <tr <%=bgColor %> valign="top">
                               <td class="ColRowBold">
                                   <%if(!form.isPrinterFriendly() && store.canViewAny(new Permission[]{Permission.CAT_ADD_TEXTBOOK, 
                                        Permission.CAT_EDIT_TEXTBOOK, Permission.CAT_TEXTBOOK_SEARCH})){ %>
                                   <base:link page='<%="/cataloging/servlet/presenttextbookdetailform.do?" + BaseTitleDetailForm.PARAMETER_VIEW_TYPE +"=" + BaseTitleDetailForm.VIEW_TYPE_DETAILS + "&" + BaseTitleDetailForm.FIELD_BIBID + "=" + textbookList.getBibID()%>'>
                                      <%= ResponseUtils.filter(textbookList.getTitle()) %>
                                   </base:link>
                                   <%}else{ %>
                                       <%= ResponseUtils.filter(textbookList.getTitle()) %>
                                   <%}%>                                   
                               </td>
                               <td class="ColRow" align="center">
                                   <%=lh.formatDate(textbookList.getEarliestStartDate())%>
                               </td>
                               <td class="ColRow" align="center">
                                   <%= lh.formatNumber(textbookList.getPeakNeed()) %>
                               </td>
                               <td class="ColRow" align="center">
                                   <%if(!form.isPrinterFriendly() && store.canViewAny(new Permission[]{Permission.CAT_ADD_TEXTBOOK, 
                                        Permission.CAT_EDIT_TEXTBOOK, Permission.CAT_TEXTBOOK_SEARCH})){ %>
                                   <base:link page='<%="/cataloging/servlet/presenttextbookdetailform.do?" + BaseTitleDetailForm.PARAMETER_VIEW_TYPE +"=" + BaseTitleDetailForm.VIEW_TYPE_COPIES + "&" + BaseTitleDetailForm.FIELD_BIBID + "=" + textbookList.getBibID()%>'>
                                       <%= lh.formatNumber(textbookList.getInventoryLocalCopies()) %>
                                   </base:link>
                                   <%}else{%>
                                   <%= lh.formatNumber(textbookList.getInventoryLocalCopies()) %>
                                   <%} %>
                               </td>
                               <td class="ColRow" align="center">
                                   <%if(!form.isPrinterFriendly() 
                                        && store.canViewAny(new Permission[]{Permission.CAT_ADD_TEXTBOOK, 
                                            Permission.CAT_EDIT_TEXTBOOK, 
                                            Permission.CAT_TEXTBOOK_SEARCH})
                                        && store.canView(Permission.CAT_SHOW_OFFSITE_AVAIL_TEXTBOOK) )
                                       { %>
                                   <base:link page='<%="/cataloging/servlet/presenttextbookdetailform.do?" + BaseTitleDetailForm.PARAMETER_VIEW_TYPE +"=" + BaseTitleDetailForm.VIEW_TYPE_COPIES + "&" + BaseTitleDetailForm.FIELD_BIBID + "=" + textbookList.getBibID() + "#OffsiteCopies"%>'>
                                       <%= lh.formatNumber(textbookList.getInventoryOffsiteCopies()) %>
                                   </base:link>
                                   <%}else{%>
                                   <%= lh.formatNumber(textbookList.getInventoryOffsiteCopies()) %>
                                   <%} %>
                               </td>
                               <td class="SmallColRow" align="center" nowrap>
                                   <%if(!form.isPrinterFriendly()){ %>
                                        <c:url var="url" value="${form.baseURL}">
                                            <c:param name="showMoreBibID" value="${textbookList.bibID}"/>
                                        </c:url>
                                        <c:if test="${textbookList.showMore == true}">
                                           <a class="detailLink" href="${url}">Show&nbsp;Less&nbsp;<base:image src="/icons/general/showless.gif" /></a> 
                                        </c:if>
                                        <c:if test="${textbookList.showMore == false}">
                                           <a class="detailLink" href="${url}">Show&nbsp;More&nbsp;<base:image src="/icons/general/showmore.gif" /></a> 
                                        </c:if>
                                   <%} %>
                               </td>
                          </tr>
                          <%if ( !StringHelper.isEmpty(textbookList.getISBN() ) ) { %>
                          <TR <%=bgColor %>>
                            <td class="SmallColRow" colspan="6">
                                &nbsp;(<%=ResponseUtils.filter(textbookList.getISBN()) %>)
                             </td>
                          </TR>
                          <% } 
                          flipper++;
                          %>
                          <%if ( textbookList.isShowMore() ) { %>
                          <TR <%=bgColor %>>
                            <td class="ColRow" colspan="6" width="100%">
                                <TABLE width="100%" id="<%=ForecastedVSActualForm.TABLE_SECTION + textbookList.getBibID()%>">
                                    <TR <%=bgColor %>>
                                        <TD class="SmallColHeading"><base:imageSpacer width="20" height="1"/></TD>
                                        <TD class="SmallColHeading">Class</TD>
                                        <TD class="SmallColHeading">Section #</TD>
                                        <TD class="SmallColHeading" align="center">Checkouts Start</TD>
                                        <TD class="SmallColHeading" align="center">Textbooks Due</TD>
                                        <TD class="SmallColHeading" align="center">Copies Requested</TD>
                                    </TR>
                                     <logic:iterate id="sectionList" name="textbookList" property="sections" type="com.follett.fsc.destiny.session.backoffice.data.ForecastedVSActualSectionsVO">
                                    <TR <%=bgColor %>>
                                        <TD class="SmallColHeading"><base:imageSpacer width="20" height="1"/></TD>
                                        <TD class="ColRow"><%=ResponseUtils.filter(sectionList.getClassName())%></TD>
                                        <TD class="ColRow"><%=ResponseUtils.filter(sectionList.getSuffix())%></TD>
                                        <TD class="ColRow" align="center"><%=lh.formatDate(sectionList.getStartTime())%></TD>
                                        <TD class="ColRow" align="center"><%=lh.formatDate(sectionList.getEndTime())%></TD>
                                        <TD class="ColRow" align="center"><%=lh.formatNumber(sectionList.getForecastedEnrollment())%></TD>
                                    </TR>
                                    </logic:iterate>
                                 </table>
                             </td>
                          </TR>
                          <%} %>
                      </logic:iterate>
                </table>
                <%} %><!--end of if for textbook count  -->
            </td>
        </tr>
    </base:outlinedTable>

