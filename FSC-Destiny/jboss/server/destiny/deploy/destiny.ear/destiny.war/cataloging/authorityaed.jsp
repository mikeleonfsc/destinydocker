<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="<%=AuthorityAEDForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.AuthorityAEDForm" />

<base:form action="/cataloging/servlet/handleauthorityaedform.do" focus="<%= AuthorityAEDForm.TEXT_AUTHORIZED_HEADING %>">
<html:hidden property="<%=AuthorityAEDForm.PARM_FORM_ACTION%>"/>
<html:hidden property="<%=AuthorityAEDForm.PARM_TEMPLATE_TYPE%>"/>
<html:hidden property="authoritySubfieldCount"/>


<base:outlinedTable borderColor="#c0c0c0" width="95%">
<tr>
    <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td>
                        <table border="0" cellpadding="3" cellspacing="0" id="<%=AuthorityAEDForm.TABLE_AUTHORIZED_HEADING_TABLE%>">
                        <tr>
                            <td colspan="2" class="FormHeading"><%= MessageHelper.formatMessage("authorityaed_AuthorizedHeading") %></td>
                        </tr>
                        <tr>
                            <td class="ColRowBold tdAlignRight">
                                <%=form.getMarcVO().getAuthorizedTag().getLabel(0)%>
                            </td>
                            <td>
                                <html:text property="<%= AuthorityAEDForm.TEXT_AUTHORIZED_HEADING %>" size="30"/>
                            </td>
                        </tr>
                        <logic:greaterThan name="<%= AuthorityAEDForm.FORM_NAME %>" property="<%= AuthorityAEDForm.PROPERTY_COUNT %>" value="1">
                            <tr>
                                <td class="ColRowBold tdAlignRight">
                                    <%=form.getMarcVO().getAuthorizedTag().getLabel(1)%>
                                </td>
                                <td>
                                    <html:text property="<%= AuthorityAEDForm.TEXT_AUTHORIZED_HEADING2 %>" size="20"/>
                                </td>
                            </tr>
                            <logic:greaterThan name="<%= AuthorityAEDForm.FORM_NAME %>" property="<%= AuthorityAEDForm.PROPERTY_COUNT %>" value="2">
                                <tr>
                                    <td class="ColRowBold tdAlignRight">
                                        <%=form.getMarcVO().getAuthorizedTag().getLabel(2)%>
                                    </td>
                                    <td>
                                        <html:text property="<%= AuthorityAEDForm.TEXT_AUTHORIZED_HEADING3 %>" size="20"/>
                                    </td>
                                </tr>
                            </logic:greaterThan>
                        </logic:greaterThan>

                        <tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("authorityaed_Creates") %></td>
                            <td class="ColRow">
                                <html:checkbox property="<%= AuthorityAEDForm.CHECKBOX_IS_AUTHOR %>" /><%= MessageHelper.formatMessage("authorityaed_Author") %>&nbsp;
                                <html:checkbox property="<%= AuthorityAEDForm.CHECKBOX_IS_SUBJECT %>" /><%= MessageHelper.formatMessage("authorityaed_Subject") %>&nbsp;
                                <html:checkbox property="<%= AuthorityAEDForm.CHECKBOX_IS_SERIES %>" /><%= MessageHelper.formatMessage("authorityaed_SeriesCrossReferences") %>
                            </td>
                        </tr>
                        </table>
                    </td>
                </tr>
                </table>
            </td>
            <td valign="top" class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSave">
                    <table cellpadding="0" cellspacing="0" border="0" id="<%=AuthorityAEDForm.TABLE_SAVE_CANCEL_BUTTON_TABLE%>">
                    <tr>
                        <td>
                            <base:saveButton onclick="hideElementonSave()" name="<%=AuthorityAEDForm.ID_BUTTON_SAVE%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <base:cancelButton name="<%=AuthorityAEDForm.ID_BUTTON_CANCEL%>"/>
                        </td>
                    </tr>
                    </table>
                </base:showHideTag>
            </td>
        </table>

        <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td>
                        <table border="0" width="100%" cellpadding="3" cellspacing="0" id="<%=AuthorityAEDForm.TABLE_REFERENCED_FROM_TABLE%>">
                            <tr>
                                <td colspan="4">
                                    <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">
                                        <tr>
                                            <td valign="top" background="/images/icons/general/thickline.gif" nowrap="" colspan="3">
                                                <span class="ColRow">&nbsp;&nbsp;</span><span class="SectionHeader">
                                                    <%=MessageHelper.formatMessage("authorityaed_ReferencedFrom", "<b>", "</b>") %>
                                                </span>
                                            </td>                                        
                                            <td height="18">&nbsp;</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                                <% int row = 0; %>
                                <logic:iterate id="tracingTag" name="<%=AuthorityAEDForm.FORM_NAME%>" property="tracingTags" type="com.follett.fsc.destiny.util.marc.AuthorityMarcLineItem">
                                <% if (row > 0) { %>
                                <tr>
                                    <td colspan="4">
                                        <base:imageLine width="100%" height="2" vspace="1" />
                                    </td>
                                </tr>
                                <% } %>

                                <tr>
                                    <td class="ColRow tdAlignRight" valign="top" nowrap><%=tracingTag.getLabel(0)%></td>
                                    <td nowrap>

                                      <input type="text" name="<%=AuthorityAEDForm.buildTracingTypeFieldName(0, row)%>" size="30" value="<%=tracingTag.getValue(0)%>">
                                      &nbsp;

                                      <select name="<%=AuthorityAEDForm.buildSelectTypeName(row)%>">
                                        <% if (tracingTag.getType() == AuthorityMarcLineItem.TYPE_SEE){       %>
                                            <option value="<%=AuthorityMarcLineItem.TYPE_SEE%>" selected="selected"><%= MessageHelper.formatMessage("authorityaed_See") %></option>
                                            <option value="<%=AuthorityMarcLineItem.TYPE_SEE_ALSO%>"><%= MessageHelper.formatMessage("authorityaed_SeeAlso") %></option>
                                        <% } else { %>
                                            <option value="<%=AuthorityMarcLineItem.TYPE_SEE%>"><%= MessageHelper.formatMessage("authorityaed_See") %></option>
                                            <option value="<%=AuthorityMarcLineItem.TYPE_SEE_ALSO%>" selected="selected"><%= MessageHelper.formatMessage("authorityaed_SeeAlso") %></option>
                                        <% } %>
                                      </select>
                                    </td>
                                    <td valign="top">
                                        <base:genericButton src="/buttons/small/delete_70.gif" alt='<%= MessageHelper.formatMessage("delete") %>' name="<%=AuthorityAEDForm.buildDeleteXrefLinkName(row)%>"/>
                                    </td>
                                </tr>
                                <logic:greaterThan name="<%= AuthorityAEDForm.FORM_NAME %>" property="<%= AuthorityAEDForm.PROPERTY_COUNT %>" value="1">
                                    <tr>
                                        <td class="ColRow tdAlignRight" nowrap><%=tracingTag.getLabel(1)%></td>
                                        <td colspan="3">
                                          <input type="text" name="<%=AuthorityAEDForm.buildTracingTypeFieldName(1, row)%>" size="20" value="<%=tracingTag.getValue(1)%>">
                                        </td>
                                    </tr>
                                    <logic:greaterThan name="<%= AuthorityAEDForm.FORM_NAME %>" property="<%= AuthorityAEDForm.PROPERTY_COUNT %>" value="2">
                                        <tr>
                                            <td class="ColRow tdAlignRight" nowrap><%=tracingTag.getLabel(2)%></td>
                                            <td colspan="3">
                                              <input type="text" name="<%=AuthorityAEDForm.buildTracingTypeFieldName(2, row)%>" size="20" value="<%=tracingTag.getValue(2)%>">
                                            </td>
                                        </tr>
                                    </logic:greaterThan>
                                </logic:greaterThan>
                                <% row++; %>
                            </logic:iterate>
                        </table>

                </td>
            </tr>
            </table>
            </td>
            <td valign="top" class="tdAlignRight">
                <table border="0" cellpadding="0" cellspacing="0" id="<%=AuthorityAEDForm.TABLE_ADD_XREF_BUTTON_TABLE%>">
                <tr>
                    <td>
                        <base:genericButton src="/buttons/large/addxref.gif" alt='<%= MessageHelper.formatMessage("addXref") %>' name="<%=AuthorityAEDForm.ID_BUTTON_ADD_XREF%>"/>
                    </td>
                </tr>
                </table>

            </td>
        </tr>
        </table>


    </td>
</tr>
</base:outlinedTable>


</base:form>
