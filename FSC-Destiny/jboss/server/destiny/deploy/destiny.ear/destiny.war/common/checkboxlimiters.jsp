<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- This file has been renamed from partialinventorylimiters.jsp.  For early change history
see that file. --%>

<%
    String action = null;
    ILimitersForm form = (BaseCheckboxLimitersForm)request.getAttribute(CheckboxLimitersForm.FORM_NAME);
    
    if (form == null) {
        form = (BaseCheckboxLimitersForm)request.getAttribute(CircTypeSelectForm.FORM_NAME);
    }
    
    if (form == null) {
        form = (BaseCheckboxLimitersForm)request.getAttribute(HomeroomSelectForm.FORM_NAME);
    }
    if (form == null) {
        form = (BaseCheckboxLimitersForm)request.getAttribute(CopyCategoriesSelectForm.FORM_NAME);
    }
    if (form == null){
        form = (BaseCheckboxLimitersForm) request.getAttribute(PatronTypeSelectForm.FORM_NAME);
    }
    if (form == null){
        form = (BaseCheckboxLimitersForm) request.getAttribute(MaterialTypeSelectForm.FORM_NAME);
    }
    
    if (form == null) {
        action = "/common/servlet/handledepartmentlimitersform.do";
        form = (DepartmentLimitersForm)request.getAttribute(DepartmentLimitersForm.FORM_NAME);
    } else {
        action = ((BaseCheckboxLimitersForm) form).getFormAction();
    }
    
%>
<base:messageBox strutsErrors="true"/>

<%    
    SessionStoreProxy store  = SessionStoreProxy.getSessionStore(session, request); 
%>

<base:form action="<%=action%>">
    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <%if(form instanceof BaseCheckboxLimitersForm){ %>
        <html:hidden property="<%=BaseCheckboxLimitersForm.PARAM_DISTRICT_CIRC_HISTORICAL_REPORT%>"/>
    <%} %>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

    <base:outlinedTable borderColor="#c0c0c0" id="<%=CheckboxLimitersForm.TABLE_OUTER%>" width="95%">
        <tr>
            <td class="TableHeading" vAlign="top" width="33%"><%=form.getTableHeading() %></td>
            <td class="ColRowBold" vAlign="top">
                <table id="<%=BaseCheckboxLimitersForm.TABLE_LIMITER_BUTTONS%>" cellSpacing="2" cellPadding="4" border="0">
                    <tr>
                        <td class="ColRowBold" vAlign="bottom">
                            <base:genericButton 
                                name="<%= BaseCheckboxLimitersForm.BUTTON_SELECT_ALL %>" 
                                src="/buttons/small/selectall.gif"
                                alt='<%= MessageHelper.formatMessage("selectAll") %>'
                            />
                        </td>
                        <td class="ColRowBold" vAlign="bottom">
                            <base:genericButton 
                                name="<%= BaseCheckboxLimitersForm.BUTTON_CLEAR_ALL %>" 
                                src="/buttons/small/clearall.gif"
                                alt='<%= MessageHelper.formatMessage("clearAll") %>'
                            />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td vAlign="top" align="left" colspan="2">
                <table id="<%=BaseCheckboxLimitersForm.TABLE_INNER%>" cellSpacing=0 cellPadding=0 border=0>
                    <tr>
                        <td vAlign="top" align="left">
                            <base:displayMultiColumnCheckboxes map="<%=form.getCheckboxList() %>" selectAll="<%=form.isSelectAll() %>" tableName="<%=form.TABLE_LIMITER_CHECKBOXES %>" fieldProperty="<%=form.PARAM_CHECKBOX_PREFIX %>"   ></base:displayMultiColumnCheckboxes> 
                        </td>
                    </tr>
                </table>
            </td>
        </tr>   
        <%if(form instanceof CheckboxLimitersForm){ %>
            <logic:equal name="<%=CheckboxLimitersForm.FORM_NAME%>" property="<%= CheckboxLimitersForm.PARAM_IS_INCLUDE_CHECKED_OUT_VISIBLE %>" value="true">
                <tr>
                    <td colSpan="2">
                        <base:imageLine height="1" />
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colSpan="2">
                        <%= MessageHelper.formatMessage("checkboxlimiters_PleaseNoteItemsWillBeIncludedInInventory",form.getLimiterTypeDescription()) %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colSpan="2">
                        <html:checkbox property="<%=CheckboxLimitersForm.FIELD_INCLUDE_CHECKED_OUT%>"/>
                            <%= MessageHelper.formatMessage("checkboxlimiters_AlsoIncludeItemsThatHaveBeenCheckedOut",form.getLimiterTypeDescription()) %>
                        <base:helpTag helpFileName="d_include_checked-out_items_in_inventory_AM.htm"/>
                    </td>
                </tr>
            </logic:equal>
        <%} %>
        <tr>
            <td colSpan="2" valign="top">
                <img height="1" src="/images/icons/general/line.gif" width="100%">
            </td>
        </tr>
            
        <tr>
            <td align="center" class="ColRow" colspan="2">
                <base:showHideTag>
                    <base:genericButton 
                        name="<%= CheckboxLimitersForm.BUTTON_OK %>" 
                        src="/buttons/large/ok.gif"
                        alt='<%= MessageHelper.formatMessage("ok") %>'
                        onclick="hideElement()"
                    />
                </base:showHideTag>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
