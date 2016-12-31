<%@page import="org.apache.struts.util.ResponseUtils"%>
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


<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="java.util.Iterator"%>


<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.common.StringStringLookup"%>

<%@page import="com.follett.fsc.destiny.client.cataloging.data.SubfieldEditContainer"%>

<%
    String formName = request.getParameter("formName");
    BaseTagEditForm form = (BaseTagEditForm)request.getAttribute(formName);
    boolean bibTag = "true".equals(request.getParameter("bibTag"));
%>

    <html:hidden property="<%=BaseTagEditForm.FIELD_CHANGED_ADD_SUBFIELD %>" value="false"/>
    <table width="100%" border="0" cellspacing="2" cellpadding="2">
        <tr>
            <td class="TableHeading"><%=(form.isAddingTag() 
                ? MessageHelper.formatMessage("basetagedit_AddingTag01", MarcHelper.getFormattedTagNumber(form.getTagToEdit().getTagNumber()), form.gimmeTagDescription()) 
                    : MessageHelper.formatMessage("basetagedit_EditingTag01", MarcHelper.getFormattedTagNumber(form.getTagToEdit().getTagNumber()), form.gimmeTagDescription())) %> 
             </td>
            <td class="tdAlignRight">
                <base:showHideTag id="onSaveHeader">
                    <% if(bibTag) { %>
                    <base:genericButton alt='<%= MessageHelper.formatMessage("ok") %>' src="/buttons/large/ok.gif" onclick="hideElementonSaveHeader()" name="<%=BaseTagEditForm.ID_BUTTON_KEEP %>" />
                    <% } else { %>
                    <base:genericButton alt='<%= MessageHelper.formatMessage("save") %>' src="/buttons/large/save.gif" onclick="hideElementonSaveHeader()" name="<%=BaseTagEditForm.ID_BUTTON_KEEP %>" />
                    <% } %>
                    &nbsp;
                    <base:cancelButton name="<%=BaseTagEditForm.ID_BUTTON_CANCEL %>" />
                </base:showHideTag>
            </td>
        </tr>
        
        <tr>
            <td colspan="2">
                <table id="<%=BaseTagEditForm.TABLE_SUBFIELDS %>" cellspacing="2" cellpadding="2">
                    <tr id="<%=BaseTagEditForm.HEADING_INDICATOR_INFO%>"><td colspan="2" class="TableHeading2"><%=MessageHelper.formatMessage("basetagedit_IndicatorInformation")%></td></tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            <%=form.gimmeIndicatorDescription(0)%>:
                        </td>
                        <td colspan="4">
                            <%=JSPHelper.renderDropDown(BaseTagEditForm.FIELD_INDICATOR_1, null, form.gimmeIndicatorDropdown(0), String.valueOf(form.getTagToEdit().getFirstIndicator())) %>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            <%=form.gimmeIndicatorDescription(1)%>:
                        </td>
                        <td colspan="4">
                            <%=JSPHelper.renderDropDown(BaseTagEditForm.FIELD_INDICATOR_2, null, form.gimmeIndicatorDropdown(1), String.valueOf(form.getTagToEdit().getSecondIndicator())) %>
                        </td>
                    </tr>
                    <tr><td colspan="5" class="Instruction">&nbsp;</td></tr>
                    <tr id="<%=BaseTagEditForm.HEADING_SUBFIELD_INFO%>"><td colspan="2" class="TableHeading2"><%=MessageHelper.formatMessage("basetagedit_SubfieldInformation")%></td></tr>
                    <% 
                        Iterator<SubfieldEditContainer> subIter = form.getSubfields().iterator();
                        int offset = 0;
                        while(subIter.hasNext()) {
                            SubfieldEditContainer thisSub = subIter.next();
                    %>
                    <tr>
                       <td id="<%=BaseTagEditForm.TD_SUBFIELD_DESCRIPTION_PREFIX + offset%>" class="ColRowBold tdAlignRight"><%=thisSub.description %></td>    
                       <td id="<%=BaseTagEditForm.TD_SUBFIELD_DATA_PREFIX + offset%>">
                           <% if(thisSub.control || thisSub.dropdown) { %>
                               <span class="ColRow"><%=ResponseUtils.filter(thisSub.subData) %></span>
                           <% } else if(thisSub.optionlist) { %>
                              <%= JSPHelper.renderDropDown(BaseTagEditForm.FIELD_SUBFIELD_DATA_PREFIX + offset, null, 
                                  form.gimmeDropdownList(thisSub.subCode, thisSub.subData), thisSub.subData, null, null, null)%>                           
                           <% } else  { %>
                               <input type="text" value="<%=ResponseUtils.filter(thisSub.subData) %>" name="<%=BaseTagEditForm.FIELD_SUBFIELD_DATA_PREFIX + offset%>" size="40" maxlength="9000"/>
                           <% } %>
                       </td>
                       <td>
                           <% if(subIter.hasNext()) { %>
                               <base:genericButton alt='<%=MessageHelper.formatMessage("basetagedit_MoveDown")%>' src="/icons/general/showmore.gif" name="<%=BaseTagEditForm.ID_BUTTON_MOVE_DOWN_PREFIX + offset %>" />
                           <% } else {%>
                               &nbsp;    
                           <% } %>
                       </td>
                       <td>
                           <% if(offset > 0) { %>
                               <base:genericButton alt='<%=MessageHelper.formatMessage("basetagedit_MoveUp")%>' src="/icons/general/showless.gif" name="<%=BaseTagEditForm.ID_BUTTON_MOVE_UP_PREFIX + offset %>" />    
                           <% } else {%>
                               &nbsp;    
                           <% } %>
                       </td>
                       <td>
                           <% if(thisSub.required) { %>
                               &nbsp;    
                           <% } else {%>
                           <base:genericButton alt='<%=MessageHelper.formatMessage("basetagedit_Remove")%>' src="/icons/general/x.gif" name="<%=BaseTagEditForm.ID_BUTTON_REMOVE_PREFIX + offset %>" />    
                           <% } %>
                       </td>
                    </tr>
                    <% 
                            if(thisSub.dropdown) {
                               MarcRulesTagIndicatorElement tie = form.gimmeSubfieldDropdownList(thisSub.subCode);
                               if(tie != null) {
                                   %>
                                       <tr>
                                           <td class="Instruction tdAlignRight"><%=tie.getName() %></td>
                                           <td><%= JSPHelper.renderDropDown(BaseTagEditForm.FIELD_CONTROL_PREFIX + tie.getPosition(), null, tie.buildSelectOptionList(String.valueOf(thisSub.subData.charAt(tie.getPosition()))), String.valueOf(thisSub.subData.charAt(tie.getPosition())), null, "Instruction", null)%></td>
                                           <td colspan="3">&nbsp;</td>
                                       </tr>
                                   <%
                                   
                               }
                                
                            } else if(thisSub.control) {
                               Iterator<MarcRulesTagIndicatorElement> ctrlIter = form.gimmeControlList().iterator();
                               while(ctrlIter.hasNext()) {
                                   MarcRulesTagIndicatorElement tie = ctrlIter.next();
                                   List<StringStringLookup> lookupList = tie.buildSelectOptionList(String.valueOf(thisSub.subData.charAt(tie.getPosition())));
                                   %>
                                       <tr>
                                           <td class="Instruction tdAlignRight"><%=tie.getName() %></td>
                                           <td><%= JSPHelper.renderDropDown(BaseTagEditForm.FIELD_CONTROL_PREFIX + tie.getPosition(), null, tie.buildSelectOptionList(String.valueOf(thisSub.subData.charAt(tie.getPosition()))), String.valueOf(thisSub.subData.charAt(tie.getPosition())), null, "Instruction", null)%></td>
                                           <td colspan="3">&nbsp;</td>
                                       </tr>
                                   <%
                               }
                            } 
                            offset++;
                        }
                    %>    
               </table>
            </td>
        </tr>
        
        <% if (!form.gimmeSubfieldDropdown().isEmpty()) { %>
        <tr><td colspan="2" class="Instruction">&nbsp;</td></tr>
        <tr>
            <td colspan="2" align="center" class="ColRow">
            <% if(form.getRdaElement() != null) { %>
                <script language="javascript"> 
                <!-- 
                function changeSubfield() { 
                   document.<%=formName%>.<%=BaseTagEditForm.FIELD_CHANGED_ADD_SUBFIELD%>.value = "true"; 
                   document.<%=formName%>.submit(); 
                } 
                // --> 
                </script>            
                
                <%=MessageHelper.formatMessage("basetagedit_AddSubfield")%> 
                <%=JSPHelper.renderDropDown(BaseTagEditForm.FIELD_ADD_SUBFIELD, "changeSubfield()", form.gimmeSubfieldDropdown(), form.getAddSubfield()) %> 
                <%=MessageHelper.formatMessage("basetagedit_Contents")%>
                 
                <% if("a".equals(form.getAddSubfield())) { %>
                      <%= JSPHelper.renderDropDown(BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA, null, 
                          form.gimmeDropdownList('a', null), null, null, null, null)%>                           
                <% } else if("b".equals(form.getAddSubfield())) { %>
                      <%= JSPHelper.renderDropDown(BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA, null, 
                          form.gimmeDropdownList('b', null), null, null, null, null)%>                           
                <% } else  { %>
                    <input type="text" value="" name="<%=BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA%>" size="20" maxlength="9000"/>
                <% } %>
            <% } else { %>
                <%=MessageHelper.formatMessage("basetagedit_AddSubfield")%> 
                <%=JSPHelper.renderDropDown(BaseTagEditForm.FIELD_ADD_SUBFIELD, null, form.gimmeSubfieldDropdown(), form.getAddSubfield()) %> 
                <%=MessageHelper.formatMessage("basetagedit_Contents")%>
                <input type="text" value="" name="<%=BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA%>" size="20" maxlength="9000"/>
            <% }  %>
            <base:genericButton absbottom="true" alt='<%= MessageHelper.formatMessage("add") %>' src="/buttons/small/add.gif" name="<%=BaseTagEditForm.ID_BUTTON_ADD_SUB %>" />
           </td>
        </tr>
        <% }  %>
        
    </table>
