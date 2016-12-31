<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleSearchVO"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.destiny.entity.data.ProgramLineVO"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ManageProgramsVO"%><tr>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%
    OrderRequestEditForm form = (OrderRequestEditForm) request.getAttribute(OrderRequestEditForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    String bgColor = "#FFFFFF";
    if (!form.isPrinterFriendly()) {
        bgColor = FlipperTag.ROW_GRAY;
    }
    ManageProgramsVO vo = form.getProgramList();
%>
<html:hidden property="<%=OrderRequestEditForm.PARAM_SHOW_MORE_ID%>"/>

    <tr>
        <td colspan = "2">
            <table width = "100%" border="0" cellspacing="0" cellpadding="3" id="<%=OrderRequestEditForm.TABLE_PROGRAM_RESULTS%>">
                <% if (vo == null || vo.getProgramLine() == null || vo.getProgramLine().size() == 0) { %>
                <tr>
                    <td class="ColRow">No programs defined.</td>
                </tr>
                <% } else { %>
                <tr>
                  <td class="SmallColHeading">
                      Program
                  </td>
                </tr>
                    <%
                       Iterator<ProgramLineVO> iter = form.getProgramList().getProgramLine().iterator();
                       int counter = 0;
                       while (iter.hasNext()) {
                       boolean preOrder = false;
                       ProgramLineVO rec = iter.next();
                           String additionalFontData = "";
                           String additionalEndFontData = "";
                           if (counter % 2 == 0) {
                    %>
                    <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                    <%     } else { %> 
                    <tr width="100%">
                    <%     } %>
                        <td class="ColRow">
                            <%= ResponseUtils.filter(rec.getProgramName()) %>
                            <%
                                if (rec.getProgramID().equals(form.getShowMoreID()) && rec.getNumberOfTitles() > 0) {
                            %>
                                <base:genericButton
                                    src="/buttons/small/showless.gif" absbottom="true"
                                    alt="Show less"
                                    name='<%=OrderRequestEditForm.BUTTON_SHOW_LESS_PREFIX + rec.getProgramID()%>' />
                            <%
                                } else if (rec.getNumberOfTitles() > 0) {
                            %>
                                <base:genericButton
                                    src="/buttons/small/showmore.gif" absbottom="true"
                                    alt="Show more"
                                    name='<%=OrderRequestEditForm.BUTTON_SHOW_MORE_PREFIX + rec.getProgramID()%>' />
                            <%
                                }
                            %>                             
                        </td>
                        
                </tr>    
                <%
                     if (rec.getProgramID().equals(form.getShowMoreID())) {
                 %>
                    <tr><td colspan="2">
                    <table width="95%" align="center" id="<%=OrderRequestEditForm.TABLE_ASSIGNED_TITLES%>" cellpadding="3" cellspacing="0">
                        <%
                            int innerCounter = 0;
                            if (innerCounter % 2 == 0) {
                        %>
                        <tr width="100%">
                        <%
                            } else {
                        %> 
                        <tr width="100%">
                        <%
                            }
                        %>
                            <td class="SmallColHeading" valign="top">
                            <A name='<%="anchor_" + rec.getProgramID()%>'></A>
                                Title        
                            </td>
                            <td class="SmallColHeading" valign="top">
                                Grade        
                            </td>
                            <td class="SmallColHeading" valign="top">
                                ISBN<br>Edition        
                            </td>
                            <td class="SmallColHeading" valign="top">
                                State/Textbook ID        
                            </td>
                            <td class="SmallColHeading" valign="top" align="center">
                                Estimated<br>Enrollment        
                            </td>
                            <%if(!form.allProgramTitlesSelected()) { %>
                                <td class="SmallColHeading" valign="top" align="center">
                                    Quantity<br><%=(store.isStateContext() ? "Ordered" : "Requested")%>       
                                </td>
                                <td align="center" valign="top">
                                    <base:genericButton src="/buttons/small/select.gif" absbottom="true" 
                                        alt="<%=OrderRequestEditForm.ALT_SELECT%>" name='<%=OrderRequestEditForm.BUTTON_PREORDER_SELECT%>'/>
                                </td>                            
                            <% } else { %>
                                <td class="SmallColHeading" valign="top" colspan="2" align="center">
                                    Quantity<br><%=(store.isStateContext() ? "Ordered" : "Requested")%>       
                                </td>
                            <% } %>
                        </tr>
                        <%
                            Iterator<ManageProgramsVO.ProgramTitleInfo> innerIter = form.getProgramList()
                                                    .getTitleInfo().iterator();
                            while (innerIter.hasNext()) {
                                ManageProgramsVO.ProgramTitleInfo info = innerIter.next();
                                if (form.isQuantityInvalid(info.getBibID()) || (form.isPreorder() && form.isEstimatedEnrollmentInvalid(info.getBibID()))) {
                                    additionalFontData = "<font color=\"#CC0000\">";
                                    additionalEndFontData = "</font>";
                                } else {
                                    additionalFontData = "";
                                    additionalEndFontData = "";
                                }
                                if (++innerCounter % 2 == 1) {
                        %>
                        <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                        <%
                            } else {
                        %> 
                        <tr width="100%">
                        <%
                            }
                        %>
                            <td class="ColRow" valign="baseline">
                            
                           <%= form.getTitleIconInfomation(info) %>
                                <a href="javascript:viewTitle(<%=info.getBibID()%>);">
                            <%=additionalFontData%>
                            <%=StringHelper.isEmptyOrWhitespace(info.getTitle()) ? "&nbsp;" : ResponseUtils.filter(info.getTitle())%>
                            <%=additionalEndFontData%>
                        </a>  
                            </td>
                            <td class="ColRow" valign="baseline">
                                <%=additionalFontData%>
                                <%=StringHelper.isEmptyOrWhitespace(info.getGrade()) ? "&nbsp;" : info.getGrade()%>        
                            </td>
                            <td class="ColRow" valign="middle">
                                <%=additionalFontData%>
                                <%=StringHelper.isEmptyOrWhitespace(info.getIsbnEdition())
                                        ? "&nbsp;"
                                        : info.getIsbnEdition()%>     
                                <%=additionalEndFontData%>
                            </td>
                            <td class="ColRow" valign="baseline">
                                <%=additionalFontData%>
                                <%=StringHelper.isEmptyOrWhitespace(info.getStateTextbookID())
                                        ? "&nbsp;"
                                        : ResponseUtils.filter(info.getStateTextbookID())%>       
                                <%=additionalEndFontData%>
                            </td>
                            
                            <% if (form.getOrderVO().lookupBibID(info.getBibID()) == null) { %>
                                <td class="ColRow" valign="baseline" align="center">
                                <% if (store.isStateContext() || info.isRestricted()) { %>
                                    0
                                    <html:hidden property="<%=OrderRequestEditForm.FIELD_ESTIMATED_ENROLLMENT_PREFIX + info.getBibID()%>" value="0"/>
                                <% } else { %>
                                    <input type="text" name="<%=OrderRequestEditForm.FIELD_ESTIMATED_ENROLLMENT_PREFIX + info.getBibID()%>" 
                                        onkeypress="trapEnterKey(event, <%=info.getBibID()%>)" size="4" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_ENROLLMENT)%>" 
                                        value='<%=form.gimmePreOrderEstimatedEnrollment(info.getBibID(), "")%>'/>                            
                                <% } %>
                                </td>
                                <td class="ColRow" valign="baseline" align="center">
                                <% if (!info.isRestricted()) { %>
                                <% if (store.isStateContext()) { %>
                                    <input type="text" name="<%=OrderRequestEditForm.FIELD_QUANTITY_ORDERED_PREFIX + info.getBibID()%>" 
                                        onkeypress="trapEnterKey(event, <%=info.getBibID()%>)" size="4" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_QUANTITY)%>" 
                                        value="<%=form.gimmePreOrderQuantityRequested(info.getBibID())%>"/>
                                <% } else { %>                    
                                    <input type="text" name="<%=OrderRequestEditForm.FIELD_QUANTITY_REQUESTED_PREFIX + info.getBibID()%>" 
                                        onkeypress="trapEnterKey(event, <%=info.getBibID()%>)" size="4" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_QUANTITY)%>" 
                                        value="<%=form.gimmePreOrderQuantityRequested(info.getBibID())%>"/>
                                <% } %>                
                                <% } else { %>  
                                    <% if (store.isStateContext()) { %>
                                        <html:hidden property="<%=OrderRequestEditForm.FIELD_QUANTITY_ORDERED_PREFIX + info.getBibID()%>" value="0"/>              
                                    <% } else { %>
                                        <html:hidden property="<%=OrderRequestEditForm.FIELD_QUANTITY_REQUESTED_PREFIX + info.getBibID()%>" value="0"/>
                                    <% } %>
                                    <font color = "#CC0000">Restricted</font>
                                <% } %>
                                </td>
                            <% } else { %>
                                <td class="SmallColHeading" valign="top" align="center" colspan="2">
                                    Currently Selected
                                </td>
                            <% } %>
                            <td align="center" valign="top">
                                &nbsp;
                            </td>
                        </tr>
                        <%
                            }   
                        %>                        
                    </table>
                    </td></tr>  
                    <%
                          }
                      %>                
                <%
                           counter++;
                       } 
                    } %> 
                   
            </table>
        </td>
    </tr>
