<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page import="org.apache.struts.Globals" %>
<%@ page import="org.apache.struts.taglib.TagUtils"%>
<%@ page import="org.apache.struts.action.ActionMessages"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<script language="JavaScript">
<!--
    function viewNotes() {
        document.<%=OrderRequestEditBackordersForm.FORM_NAME%>.<%=OrderRequestEditBackordersForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED%>.value = "true";
        document.<%=OrderRequestEditBackordersForm.FORM_NAME%>.submit();
    }
      
//-->
</script>

<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="form" type="com.follett.fsc.destiny.client.cataloging.servlet.OrderRequestEditBackordersForm"/>

<base:form action="/cataloging/servlet/handleorderrequesteditbackordersform.do">
<html:hidden property="<%=OrderRequestEditBackordersForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED%>"/>
<html:hidden property="<%=OrderRequestEditBackordersForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(form.getCollectionType())%>" />
<base:outlinedTable id="<%=OrderRequestEditBackordersForm.TABLE_MAIN %>" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading" valign="top">
            <%= form.getPageTitle() %>
        </td>
    </tr>
    <% if(!StringHelper.isEmpty(form.getTotalCopiesOnBackorder())) { %>
        <tr>
            <td class="ColRow" valign="top">
                <b><%=form.getCollectionType() == CollectionType.ASSET  ? "Number of items on backorder:" : "Number of copies on backorder:"%></b><font color="#CC0000">&nbsp;<%=form.getTotalCopiesOnBackorder()%></font>
            </td>
        </tr>
    <% } %>
    <%if(!StringHelper.isEmpty(form.getOrderVO().getOrderNumber())){ %>
        <tr>
            <td class="ColRow" valign="top">
                <b>Order #:</b>&nbsp;<%=form.getOrderVO().getOrderNumber() %>
            </td>
        </tr>
    <% } %>
    <%if(!StringHelper.isEmpty(form.getAddViewNoteLinkText())){ %>
        <tr>
            <td class="ColRow" valign="top">
                <base:image alt="View Note" src="/icons/general/notetransfer.gif"/>&nbsp;<a href="javascript:viewNotes();"><%=form.getAddViewNoteLinkText() %></a>
            </td>
        </tr>
    <% } %>
    
    <tr>
        <td valign="top" class="tdAlignRight">
            <base:genericButton src="/buttons/large/save.gif" name="<%=OrderRequestEditBackordersForm.BUTTON_SAVE %>"/>
            <base:genericButton src="/buttons/large/cancel.gif" name="<%=OrderRequestEditBackordersForm.BUTTON_CANCEL%>"/>
        </td>
    </tr>
    
    <% if(!StringHelper.isEmpty(form.getTotalCopiesOnBackorder())) { %>
    <tr>
       <c:choose>
          <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
            <base:sectionHeading heading='<%="Resources"%>' tdContent="width='100%'"/>
          </c:when>
          <c:otherwise>
            <base:sectionHeading heading='<%="Titles"%>' tdContent="width='100%'"/>
          </c:otherwise>
       </c:choose>
    </tr>
    <tr>
        <td>
        
            <table width="100%" border="0" cellspacing="0" cellpadding="3" id="<%=OrderRequestEditBackordersForm.TABLE_SELECTED%>">
                <tr>
                    <td class='SmallColHeading'>

                       <c:choose>
                          <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                            Resource
                          </c:when>
                          <c:otherwise>
                            Title
                          </c:otherwise>
                       </c:choose>

                    <br/>Price / Adoption Year</td>
                    <td class='SmallColHeading'>State / Textbook ID<br />
                    Publisher</td>
                    <td class='SmallColHeading' align="center">Backordered</td>
                    <td class='SmallColHeading' align="center"># to Cancel</td>
                </tr>
                <logic:iterate indexId="flipper" id="orderTitle" name="<%=OrderRequestEditBackordersForm.FORM_NAME%>" 
                    property="backorderTitleList" type="com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO">
                    <% if (orderTitle.calculateBackorderCount() > 0) {  %>
                        <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                            <td class="ColRow" valign="top">
                                <%=form.buildTitle(orderTitle) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%=form.buildStateTextbookID(orderTitle) %>
                            </td>
                            <td class="ColRow" valign="top" align="center">
                                <%=orderTitle.calculateBackorderCount() %>
                            </td>
                            <td class="ColRow" valign="top" align="center">
                                <input type="text" name="<%=OrderRequestEditBackordersForm.PARM_CANCEL_QUANTITY_PREFIX + orderTitle.getBibID()%>"
                                    size="4" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_QUANTITY)%>"/>
                            </td>
                        </tr>
                    <% } %>
                </logic:iterate>
            </table>
            </td>
    </tr>
    <%
        }
    %>
</base:outlinedTable>

</base:form>
