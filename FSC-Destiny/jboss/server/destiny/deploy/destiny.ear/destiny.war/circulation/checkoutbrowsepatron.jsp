<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.BrowsePatronResult" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<%
    CheckoutBrowsePatronForm form = (CheckoutBrowsePatronForm)request.getAttribute("circulation_servlet_CheckoutBrowsePatronForm");
%>


<c:set var="form" value="<%=form%>"/>
<%
    String prevPointer = null;
    if (form.getPatrons() != null && form.getPatrons().size() > 0) { 
        prevPointer = ((form.getPatrons().get(0))).getPatronPointer();
    }

    String nextPointer = null;
    if (form.getPatrons().size() > 1) {
        nextPointer = ((form.getPatrons().get(form.getPatrons().size() - 1))).getPatronPointer();
}
%>
<base:form action="/circulation/servlet/handlecheckoutbrowsepatronform.do" focus="<%=CheckoutBrowsePatronForm.FIELD_JUMP_TO%>">
<html:hidden name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_PAGE_OFFSET%>" />
<html:hidden name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_DEFAULT_USERDEFINED_LABEL%>" />
<html:hidden name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_SITE_USERDEFINED_1%>" />
<html:hidden name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_SITE_USERDEFINED_2%>" />
<html:hidden name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_DISTRICT_CIRC_ALLOWED%>" />

<br>

<base:outlinedTable id="<%=CheckoutBrowsePatronForm.TABLE_MAIN%>" borderColor="#C0C0C0">
    <tr>
        <td>
            <table width="100%" cellspacing="0" cellpadding="4" border="0">
                <tr>
                    <td class="ColRowBold">
                        <%=MessageHelper.formatMessage("checkoutbrowsepatron_SortBy") %>
                        <html:select name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_SORT_BY%>" size="1">
                            <html:option value="<%=CheckoutBrowsePatronForm.OPTION_SORTBY_LAST %>"><%=MessageHelper.formatMessage("checkoutbrowsepatron_NameLast")%></html:option>
                            <html:option value="<%=CheckoutBrowsePatronForm.OPTION_SORTBY_FIRST %>"><%=MessageHelper.formatMessage("checkoutbrowsepatron_NameFirst")%></html:option>
                        </html:select>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("checkoutbrowsepatron_GoTo")%>
                        <html:text name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%= CheckoutBrowsePatronForm.FIELD_JUMP_TO %>" size="20"/>&nbsp;<base:goButton absbottom="true"/>
                        <br>
                        <c:if test="<%=form.isDistrictCircAllowed() %>">
                            &nbsp;&nbsp;<html:checkbox name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_LOCAL_PATRONS_ONLY %>"/><%=MessageHelper.formatMessage("checkoutbrowsepatron_OnlyMyPatrons")%>
                        </c:if>
                        <html:hidden property="<%=CheckoutBrowsePatronForm.FIELD_ACTIVE_PATRONS_ONLY_VALID%>" value="true"/>
                        &nbsp;&nbsp;<html:checkbox name="<%=CheckoutBrowsePatronForm.FORM_NAME%>" property="<%=CheckoutBrowsePatronForm.FIELD_ACTIVE_PATRONS_ONLY %>"/><%=MessageHelper.formatMessage("checkoutbrowsepatron_OnlyActivePatrons")%>
                    </td>
                    <td valign="top" class="ColRow tdAlignRight">
                        <base:closeButton withX="true"/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td><base:imageLine/></td>
    </tr>
    
    <tr>
        <td>
            <table width="100%" cellspacing="0" cellpadding="2" id="<%=CheckoutBrowsePatronForm.TABLE_PATRON_DATA %>">
                <tr>
                    <td colspan="4">
                    
                        <table id="topNav" class="SmallColRow" width="100%">
                            <tr>
                                <c:choose>
                                    <c:when test="<%=!StringHelper.isEmpty(prevPointer)%>">
                                        <td nowrap="true">
                                            <base:genericButton name="<%=CheckoutBrowsePatronForm.BUTTON_PREVIOUS %>" src="/icons/general/previouslonger.gif" alt="${prevPointer}"/>
                                        </td>
                                        <td width="100%" nowrap="true">
                                            <c:out value="<%=prevPointer%>"/> 
                                        </td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                    </c:otherwise>
                                </c:choose>
                                <c:if test="<%=!StringHelper.isEmpty(nextPointer)%>">
                                    <td class="tdAlignRight" width="100%" nowrap="true">
                                        <c:out value="<%=nextPointer%>"/>&nbsp;
                                    </td>
                                    <td nowrap="true">
                                        <base:genericButton name="<%=CheckoutBrowsePatronForm.BUTTON_NEXT%>"  alt="${nextPointer}" src="/icons/general/nextlonger.gif"/>
                                    </td>
                                </c:if>
                            </tr>
                        </table>
                        
                    </td>
                </tr>
                
                <c:if test="<%=!StringHelper.isEmpty(prevPointer) || !StringHelper.isEmpty(nextPointer)%>">
                    <tr>
                        <td colspan="4">
                            <base:imageLine/>
                        </td>
                    </tr>
                </c:if>
                
                <tr>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("checkoutbrowsepatron_Name") %></td>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("checkoutbrowsepatron_Barcode") %></td>
                    
                    <td class="SmallColHeading">
                        <c:choose>
                            <c:when test="<%=form.isSearchLocalPatronsOnly() && form.isDefaultUserDefinedLabel() %>">
                                <c:out value="<%=form.getSiteUserDefined1()%>"/>
                            </c:when>
                            <c:otherwise>
                                <%=MessageHelper.formatMessage("checkoutbrowsepatron_Homeroom") %>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    
                    <td class="SmallColHeading">
                        <c:choose>
                            <c:when test="<%=! form.isSearchLocalPatronsOnly() %>">
                                <%=MessageHelper.formatMessage("checkoutbrowsepatron_Site") %>
                            </c:when>
                            <c:when test="<%= form.isDefaultUserDefinedLabel() %>">
                                <c:out value="<%=form.getSiteUserDefined2()%>"/>
                            </c:when>
                            <c:otherwise>
                                <%=MessageHelper.formatMessage("checkoutbrowsepatron_GradeLevel") %>
                            </c:otherwise>
                        </c:choose>
                    </td>    
                </tr>
                
                <c:forEach var="patron" items="<%=form.getPatrons() %>" varStatus="status">
                  <c:choose>
                     <c:when test="${status.count % 2 == 1}">
                        <tr bgcolor="#E8E8E8" valign="top">
                     </c:when>
                     <c:otherwise>
                            <tr valign="top">
                     </c:otherwise>
                  </c:choose>             
                  <!-- tr -->
                    <c:set var="class" value="ColRow"/>
                    <c:if test="${patron.closestMatch}">
                        <c:set var="class" value="ColRowBold"/>
                    </c:if>
                     <td class="${class}">
                        <c:url value="/circulation/servlet/handlecheckoutform.do" var="patronLink">
                            <c:param name="patronid" value="${patron.patronID}" />
                            <c:param name="patronlist" value="1" />
                            <c:param name="<%=CheckoutForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="${form.searchLocalPatronsOnly}" />
                        </c:url>
                        <a href="${patronLink}" <c:if test="${patron.closestMatch}">name="theFocus"</c:if>>
                            <c:out value="${patron.patronName}"/>
                        </a>
                    </td>
                    <td class="${class}"><c:out value="${patron.barcode}"/></td>
                    
                    <c:choose>
                        <c:when test="<%=form.isSearchLocalPatronsOnly() && form.isDefaultUserDefinedLabel() %>">
                            <td class="${class}"><c:out value="${patron.userDefined1}"/></td>
                        </c:when>
                        <c:otherwise>
                            <td class="${class}"><c:out value="${patron.homeroom}"/></td>
                        </c:otherwise>
                    </c:choose>
                    <c:choose>
                        <c:when test="<%=! form.isSearchLocalPatronsOnly() %>">
                            <td class="${class}"><c:out value="${patron.siteShortName}"/></td>
                        </c:when>
                        <c:when test="<%= form.isDefaultUserDefinedLabel() %>">
                            <td class="${class}"><c:out value="${patron.userDefined2}"/></td>
                        </c:when>
                        <c:otherwise>
                            <td class="${class}"><c:out value="${patron.gradeLevel}"/></td>
                        </c:otherwise>
                    </c:choose>    
                    
                  </tr>
              </c:forEach>
              
                <c:if test="<%=!StringHelper.isEmpty(prevPointer) || !StringHelper.isEmpty(nextPointer)%>">
                    <tr>
                        <td colspan="4">
                            <base:imageLine/>
                        </td>
                    </tr>
                </c:if>

                <tr>
                    <td colspan="4">

                        <table id="bottomNav" class="SmallColRow" width="100%">
                            <tr>
                                <c:choose>
                                    <c:when test="<%=!StringHelper.isEmpty(prevPointer)%>">
                                        <td nowrap="true">
                                            <base:genericButton name="<%=CheckoutBrowsePatronForm.BUTTON_PREVIOUS %>" src="/icons/general/previouslonger.gif" alt="${prevPointer}"/>
                                        </td>
                                        <td width="100%" nowrap="true">
                                            <c:out value="<%=prevPointer%>"/> 
                                        </td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                    </c:otherwise>
                                </c:choose>
                                <c:if test="<%=!StringHelper.isEmpty(nextPointer)%>">
                                    <td class="tdAlignRight" width="100%" nowrap="true">
                                        <c:out value="<%=nextPointer%>"/>&nbsp;
                                    </td>
                                    <td nowrap="true">
                                        <base:genericButton name="<%=CheckoutBrowsePatronForm.BUTTON_NEXT%>"  alt="${nextPointer}" src="/icons/general/nextlonger.gif"/>
                                    </td>
                                </c:if>
                            </tr>
                        </table>

                    </td>
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
