<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>


<%@page import="com.follett.fsc.commons.string.StringHelper"%>
<c:set var="cForm" value="<%=request.getAttribute(EditDistrictForm.FORM_NAME)%>"/>

<%
    EditDistrictForm form  = (EditDistrictForm)request.getAttribute(EditDistrictForm.FORM_NAME);
    boolean isInternationalProduct = LocaleHelper.isInternationalProduct();
%>

        <tr>
            <c:choose>
                <c:when test="${cForm.distributedAdd}">
                    <td class="ColRowBold tdAlignRight">Services</td>
                </c:when>
                <c:otherwise>
                    <td>&nbsp;</td>
                </c:otherwise>
            </c:choose>
            <td class="FormLabel" nowrap valign="middle" colspan="2"> 
              <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_AOL_SEARCH %>" />
              &nbsp;Use Alliance Plus<SUP><FONT SIZE="-1">TM</FONT></SUP> Online
            </td>
        </tr>
        
        <tr>
            <td>&nbsp;</td>            
            <td class="FormLabel" nowrap valign="middle" colspan="2"> 
              <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_USE_DESTINY_ANALYTICS %>" />
              &nbsp;Use Destiny Analytics
            </td>
        </tr>        
        
        <% if (!isInternationalProduct) { %>
        <tr>
            <td>&nbsp;</td>
            <td class="FormLabel" nowrap valign="middle" colspan="2">
              <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_USE_OER %>" />
              &nbsp;Use Open Educational Resources (OER)
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="FormLabel" nowrap valign="middle" colspan="2">
              <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_SIF %>" />
              &nbsp;Use School's Interoperability Framework (SIF)
            </td>
        </tr>
        <% } %>
        

            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_Z3950 %>" />
                  &nbsp;Allow Z39.50 clients to search my database
                </td>
            </tr>
            
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_ALLOW_EASYBIB_EXPORT %>" />
                  &nbsp;Allow Destiny Discover users to export citations to EasyBib
                </td>
            </tr>
        
        
        <% if (!isInternationalProduct) { %>
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <base:showHideTag id="onAwardUpdate" showTextOnNewLine="false">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_AWARD_WINNERS %>" />
                  &nbsp;Award Winners
                  
                  &nbsp;&nbsp;
                  <% if ( form.isShowAwardUpdateButton() ) { %>
                  <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonAwardUpdate()" name="<%= BaseDestinyServicesForm.BUTTON_AWARD_WINNERS_UPDATE %>" alt="Update Now" />
                  <% } %>
                  </base:showHideTag>
                  
                </td>
            </tr>

        <logic:equal name="<%= EditDistrictForm.FORM_NAME %>" property="showAwardWinnersJobInfo" value="true">
        <tr>
            <td>&nbsp;</td>
            <td valign="middle" nowrap  colspan="2">
                <table id="<%= BaseDestinyServicesForm.TABLE_AWARD_WINNERS_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                    <logic:notEqual name="<%= EditDistrictForm.FORM_NAME %>" property="lastAwardWinnersRunTimeLink" value="">
                    <tr>
                        <td>
                            <base:imageSpacer width="25" height="1"/>
                        </td>
                        <td class="tdAlignRight">
                            Last Update Submitted:
                        </td>
                        <td>
                            <%= StringHelper.isEmptyOrWhitespace(form.getLastAwardWinnersRunTimeLink())?"&nbsp;":form.getLastAwardWinnersRunTimeLink() %>
                        </td>
                    </tr>
                    </logic:notEqual>
                    <tr>
                        <td>
                            <base:imageSpacer width="25" height="1"/>
                        </td>
                        <td class="tdAlignRight">
                            Next Scheduled Update:
                        </td>
                        <td>
                            <bean:write name="<%= EditDistrictForm.FORM_NAME %>" property="nextAwardWinnersRunTime"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <base:imageSpacer width="25" height="1"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        </logic:equal>
        <tr>
            <td>
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
                Days between Lexile updates <html:text property="<%=EditDistrictForm.FIELD_LEXILE_INTERVAL %>" size = "2" maxlength = "2"/>
            </td>
        </tr>
        
            <logic:equal name="<%= EditDistrictForm.FORM_NAME %>" property="showLexileJobInfo" value="true">
                <tr>
                    <td>&nbsp;</td>
                    <td valign="middle" nowrap  colspan="2">
                        <table id="<%= BaseDestinyServicesForm.TABLE_LEXILE_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                            <logic:notEqual name="<%= EditDistrictForm.FORM_NAME %>" property="lastLexileRunTimeLink" value="">
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Last Update Submitted:
                                </td>
                                <td>
                                    <%= form.getLastLexileRunTimeLink() %>
                                </td>
                            </tr>
                            </logic:notEqual>
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Next Scheduled Update:
                                </td>
                                <td>
                                    <bean:write name="<%= EditDistrictForm.FORM_NAME %>" property="nextLexileRunTime"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:equal>

        <tr>
            <td>
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
                Days between Fountas and Pinnell updates <html:text property="<%=EditDistrictForm.FIELD_FOUNTAS_INTERVAL %>" size = "2" maxlength = "2"/>
            </td>
        </tr>
        
            <logic:equal name="<%= EditDistrictForm.FORM_NAME %>" property="allowFountasAndPinnell" value="true">
                <tr>
                    <td>&nbsp;</td>
                    <td valign="middle" nowrap  colspan="2">
                        <table id="<%= BaseDestinyServicesForm.TABLE_FOUNTAS_PINNELL_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                            <logic:notEqual name="<%= EditDistrictForm.FORM_NAME %>" property="lastFountasAndPinnellRunTimeLink" value="">
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Last Update Submitted:
                                </td>
                                <td>
                                    <%= form.getLastFountasAndPinnellRunTimeLink() %>
                                </td>
                            </tr>
                            </logic:notEqual>
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Next Scheduled Update:
                                </td>
                                <td>
                                    <bean:write name="<%= EditDistrictForm.FORM_NAME %>" property="nextFountasAndPinnellRunTime"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:equal>
        
        
        
        <% } %>
        
