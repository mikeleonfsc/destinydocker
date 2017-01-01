<%@ page language="java" %> 
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.StateTextbookNotificationForm"%>
<base:messageBox strutsErrors="true"/>
<%SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);%>

<%if (store.getProperty(StateTextbookNotificationForm.STORE_PROPERTY_STATE_INVENTORY_IN_PROGRESS ) != null )  {
    String message = (String)store.getProperty(StateTextbookNotificationForm.STORE_PROPERTY_STATE_INVENTORY_IN_PROGRESS );
    store.removeProperty(StateTextbookNotificationForm.STORE_PROPERTY_STATE_INVENTORY_IN_PROGRESS);
%>    
    <base:messageBox tableID="<%=StateTextbookNotificationForm.TABLE_STATE_WARNING %>">
        <tr valign="top">
            <td class="ColRowBold">State Textbook Inventory in Progress</td>
        </tr>
        <tr valign="top">
            <td class="ColRow"><%=message %></td>
        </tr>
    </base:messageBox>
<%
}    
%>
<%if (store.getProperty(StateTextbookNotificationForm.STORE_PROPERTY_STATE_PRE_ORDER_IN_PROGRESS ) != null )  {
    String message = (String)store.getProperty(StateTextbookNotificationForm.STORE_PROPERTY_STATE_PRE_ORDER_IN_PROGRESS );
    store.removeProperty(StateTextbookNotificationForm.STORE_PROPERTY_STATE_PRE_ORDER_IN_PROGRESS);
%>    
    <base:messageBox tableID="<%=StateTextbookNotificationForm.TABLE_STATE_PRE_ORDER_WARNING %>">
        <tr valign="top">
            <td class="ColRowBold">State Textbook Pre-order period is open</td>
        </tr>
        <tr valign="top">
            <td class="ColRow"><%=message %></td>
        </tr>
    </base:messageBox>
<%
}    
%>
