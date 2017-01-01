<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>


<base:messageBox strutsErrors="true"/>

<%
    SectionInfoForm form = (SectionInfoForm) request.getAttribute(SectionInfoForm.FORM_NAME);
%>

<br>

<base:form action="/backoffice/servlet/handlesectioninfoform.do" focus="<%= SectionInfoForm.FIELD_SECTION %>">

    <html:hidden property="<%=SectionInfoForm.PARAM_SECTION_ID%>"  />
    <html:hidden property="<%=SectionInfoForm.PARAM_CLASS_ID%>"  />
    <html:hidden property="<%=SectionInfoForm.FIELD_CLASS_NAME%>"  />
    <html:hidden property="<%=SectionInfoForm.FIELD_CATALOG_DESIGNATION%>"  />
    <html:hidden property="<%=SectionInfoForm.PARAM_DROPDOWN_SUBMIT%>" value="false" />

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <span class="Instruction">* = Required Field</span>
    <base:outlinedTable id="<%=SectionInfoForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">
        <tr><td>
            <table id="<%= SectionInfoForm.TABLE_OUTSIDE %>" border="0" cellspacing="5" cellpadding="0" width="100%">
                <tr>
                  <td class="ColRowBold" colspan="2">
                    <bean:write name="<%= SectionInfoForm.FORM_NAME %>" property="<%= SectionInfoForm.FIELD_CLASS_NAME %>"/>
                    (<bean:write name="<%= SectionInfoForm.FORM_NAME %>" property="<%= SectionInfoForm.FIELD_CATALOG_DESIGNATION %>"/>)
                  </td>
                </tr>
                <tr>
                  <td colspan="3"><base:imageLine width="100%" height="1"/></td>
                </tr>
                <tr>
                  <td colspan="2">
                    <table id="<%= SectionInfoForm.TABLE_MAIN %>" border="0" cellspacing="5" cellpadding="0" width="100%">
                        <% if(form.getStore().isDistrictUser()) { %>
                        <tr>
                            <td valign="middle" class="ColHeading tdAlignRight" nowrap>* Site</td>
                             <% if(form.getStore().isTextbookSite() && form.getStore().isAssetSite()) { %>
                                <td valign="bottom" class="ColRow" colspan="2">
                                    <base:selectSite name="<%= SectionInfoForm.PARAM_SITE_ID %>" 
                                    includeAssetSites="true" includeTextbookSites="true" useSelectASite="true" selectedSiteID='<%="" + form.getSiteID() %>' 
                                    includeDistrictWarehouse="false"
                                    onChangeAction="submitDropDown()"/>
                                </td>
                             <% } else if(form.getStore().isTextbookSite()) { %>
                                <td valign="bottom" class="ColRow" colspan="2">
                                    <base:selectSite name="<%= SectionInfoForm.PARAM_SITE_ID %>" 
                                    includeTextbookSites="true" useSelectASite="true" selectedSiteID='<%="" + form.getSiteID() %>' 
                                    includeDistrictWarehouse="false"
                                    onChangeAction="submitDropDown()"/>
                                </td>
                            <% } else if (form.getStore().isAssetSite()) { %>
                                <td valign="bottom" class="ColRow" colspan="2">
                                    <base:selectSite name="<%= SectionInfoForm.PARAM_SITE_ID %>" 
                                    includeAssetSites="true" useSelectASite="true" selectedSiteID='<%="" + form.getSiteID() %>' 
                                    includeDistrictWarehouse="false"
                                    onChangeAction="submitDropDown()"/>
                                </td>
                            <% } %>  
                        </tr>
                        <% } else { %>
                            <html:hidden property="<%=SectionInfoForm.PARAM_SITE_ID%>"  />
                        <% } %>    
                        <tr>
                            <td valign="middle" class="ColHeading tdAlignRight" nowrap>* Section</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:text property="<%= SectionInfoForm.FIELD_SECTION %>" size="15" maxlength="100"/>
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" class="ColHeading tdAlignRight" nowrap>Loan Period</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <bean:define id="loanPeriods" name="<%= SectionInfoForm.FORM_NAME %>" property="<%= SectionInfoForm.FIELD_LOAN_PERIOD_LIST %>"/>
        
                                <html:select property="<%= SectionInfoForm.FIELD_LOAN_PERIOD_ID %>">
                                    <html:options collection="loanPeriods" property="systemDateID" labelProperty="displayableDescriptionWithDueDate"/>
                                </html:select>
                                &nbsp;
                                <base:spanIfAllowed permissions="<%=new Permission[]{Permission.BACK_OFFICE_TEXTBOOK_AED_LOAN_POLICIES, Permission.BACK_OFFICE_ASSET_AED_LOAN_POLICIES}%>">
                                    <base:genericButton src="/buttons/large/other.gif" name="<%= SectionInfoForm.BUTTON_NAME_OTHER_LOAN_PERIOD %>" alt="Other Loan Period"/>
                                </base:spanIfAllowed>
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" class="ColHeading tdAlignRight" nowrap>* Period</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:text property="<%= SectionInfoForm.FIELD_PERIOD %>" size="2" maxlength="2"/>
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" class="ColHeading tdAlignRight" nowrap>* Meets</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_SUN %>"/> Sunday
                            </td>
                        </tr>
                        <tr>
                            <td valign="bottom" class="ColHeading tdAlignRight">&nbsp;</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_MON %>"/> Monday
                            </td>
                        </tr>
                        <tr>
                            <td valign="bottom" class="ColHeading tdAlignRight">&nbsp;</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_TUE %>"/> Tuesday
                            </td>
                        </tr>
                        <tr>
                            <td valign="bottom" class="ColHeading tdAlignRight">&nbsp;</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_WED %>"/> Wednesday
                            </td>
                        </tr>
                        <tr>
                            <td valign="bottom" class="ColHeading tdAlignRight">&nbsp;</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_THU %>"/> Thursday
                            </td>
                        </tr>
                        <tr>
                            <td valign="bottom" class="ColHeading tdAlignRight">&nbsp;</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_FRI %>"/> Friday
                            </td>
                        </tr>
                        <tr>
                            <td valign="bottom" class="ColHeading tdAlignRight">&nbsp;</td>
                            <td valign="bottom" class="ColRow" colspan="2">
                                <html:checkbox property="<%= SectionInfoForm.FIELD_SAT %>"/> Saturday
                            </td>
                         </tr>
                    </table>
                  </td>
                  <td valign="top" rowspan="2" class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()" name="<%= SectionInfoForm.BUTTON_NAME_SAVE %>" /><br>
                            <base:cancelButton onclick="hideElementonSave()" name="<%= SectionInfoForm.BUTTON_NAME_CLOSE %>" />
                        </base:showHideTag>
                  </td>
                </tr>
            </table>
        </td></tr>
    </base:outlinedTable>
</base:form>

<script language="javascript">
<!--
function submitDropDown() {
        document.<%=SectionInfoForm.FORM_NAME%>.<%=SectionInfoForm.PARAM_DROPDOWN_SUBMIT%>.value = 'true';
        document.<%=SectionInfoForm.FORM_NAME%>.submit();
}
// -->
</script>

