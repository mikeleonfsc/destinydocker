<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.StateConfigurationForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
	StateConfigurationForm form = (StateConfigurationForm)request.getAttribute(StateConfigurationForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
%>


<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.StringHelper"%>



<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>


<base:outlinedTable id="<%=StateConfigurationForm.TABLE_MAIN%>" 
    borderColor="#C0C0C0"  width="95%">


<!-- Budget Categories -->
    <TR>
    <TD>
        <TABLE id="<%=StateConfigurationForm.TABLE_BUDGET_CATEGORIES%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td class="ColRowBold">
        Budget Categories
        <base:link id="<%=StateConfigurationForm.ID_LINK_EDIT_BUDGET_CATEGORIES %>" 
            page="/cataloging/servlet/presentbudgetcategoryaedform.do">
        <base:image        
             src="/icons/general/edit.gif" width="19" height="16" 
             alt="<%=StateConfigurationForm.ALT_EDIT_BUDGET_CATEGORIES %>" />							
        </base:link>
        </TD>
        </TR>

        <tr>
        <td class="ColRow">
        <%int length = form.getBudgetCategories().size();
        if ( length == 0 ) {
            out.println("There are no Budget Categories defined");
        } else {%>
        Total: <%=UserContext.getMyContextLocaleHelper().formatNumber(Long.valueOf(form.getBudgetCategories().size())) %>
        <% } %>
        </TD>
        </TR>
        </TABLE>
    </TD></TR>
    
    <!-- Freight Carriers -->
    <TR>
        <TD>
            <TABLE id="<%=StateConfigurationForm.TABLE_MANAGE_FREIGHT_CARRIERS%>" border="0" cellpadding="2" cellspacing="0">
                <tr>
                    <td class="ColRowBold">
                        Freight&nbsp;Carriers
                        <base:link id="<%=StateConfigurationForm.ID_LINK_EDIT_FREIGHT_CARRIERS %>" page="/cataloging/servlet/presentcarriersaedform.do?stayHereAfterSave=true">
                            <base:image        
                                src="/icons/general/edit.gif" width="19" height="16" 
                                alt="<%=StateConfigurationForm.ALT_MANAGE_FREIGHT_CARRIERS %>" />                            
                        </base:link>
                    </TD>
                </TR>
            </TABLE>
        </TD>
    </TR>
    
<!-- Grade Levels -->
    <TR>
    <TD>
        <TABLE id="<%=StateConfigurationForm.TABLE_GRADE_LEVELS%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td class="ColRowBold">
        Grade Levels
        <base:link id="<%=StateConfigurationForm.ID_LINK_EDIT_GRADE_LEVELS %>" 
            page="/backoffice/servlet/presentdefinegradelevelsform.do">
        <base:image        
             src="/icons/general/edit.gif" width="19" height="16" 
             alt="<%=StateConfigurationForm.ALT_DEFINE_GRADE_LEVELS %>" />							
        </base:link>
        </TD>
        </TR>
        </TABLE>
    </TD></TR>
<!-- Pre-Order Period -->
    <TR>
    <TD>
        <TABLE id="<%=StateConfigurationForm.TABLE_PRE_ORDER_PERIOD%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td class="ColRowBold">
        Pre-order Period
        <base:link id="<%=StateConfigurationForm.ID_LINK_EDIT_PRE_ORDER_PERIOD %>" 
            page="/backoffice/servlet/presentdefinepreorderperiodform.do">
        <base:image        
             src="/icons/general/edit.gif" width="19" height="16" 
             alt="<%=StateConfigurationForm.ALT_DEFINE_PRE_ORDER_PERIOD %>" />							
        </base:link>
        </TD>
        </TR>
        <%  String preOrderStatus = form.getPreorderConfigurationStatus();
            if(!StringHelper.isEmpty(preOrderStatus)) {            
        %>
        <tr>
        <td class="ColRow">
            Status: <%= preOrderStatus %>  
        </TD>
        </TR>
        <% } %>
        </TABLE>
    </TD></TR>

    <!-- Programs -->
    <TR>
        <TD>
            <TABLE id="<%=StateConfigurationForm.TABLE_PROGRAMS%>" border="0" cellpadding="2" cellspacing="0">
                <tr>
                    <td class="ColRowBold">
                        Programs
                        <base:link id="<%=StateConfigurationForm.ID_LINK_EDIT_PROGRAMS %>" page="/backoffice/servlet/presentprogramsaedform.do">
                            <base:image        
                                src="/icons/general/edit.gif" width="19" height="16" 
                                alt="<%=StateConfigurationForm.ALT_MANAGE_PROGRAMS %>" />                            
                        </base:link>
                    </TD>
                </TR>
            </TABLE>
        </TD>
    </TR>
    <!-- Site Shipping Information -->
    <TR>
        <TD>
            <TABLE id="<%=StateConfigurationForm.TABLE_BUDGET_CATEGORIES%>" border="0" cellpadding="2" cellspacing="0">
                <tr>
                    <td class="ColRowBold">
                        Site&nbsp;Shipping&nbsp;Information
                        <base:link id="<%=StateConfigurationForm.ID_LINK_EDIT_SITE_SHIPPING_INFORMATION %>" page="/backoffice/servlet/presentmanagesiteshippinginfoform.do">
                            <base:image        
                                src="/icons/general/edit.gif" width="19" height="16" 
                                alt="<%=StateConfigurationForm.ALT_EDIT_SITE_SHIPPING_INFORMATION %>" />                            
                        </base:link>
                    </TD>
                </TR>
            </TABLE>
        </TD>
    </TR>
    
	</base:outlinedTable>
