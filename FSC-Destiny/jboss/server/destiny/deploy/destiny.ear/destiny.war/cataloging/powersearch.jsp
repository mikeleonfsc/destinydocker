<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    boolean isMediaSiteUser = store.isMediaBookingUser();
    boolean allowReadingAndInterestLevel = store.isAllowReadingLevelAndInterestLevelSearches();
    PowerSearchVO vo = (PowerSearchVO)request.getAttribute("powerSearchVO");
%>
    <bean:define id="powerSearchTypesList" name="<%=vo.getFormName()%>" property="powerSearchTypesList"/>
    <bean:define id="advancedSearchOptions1" name="<%=vo.getFormName()%>" property="advancedSearchOptions1"/>
    <bean:define id="advancedSearchOptions2" name="<%=vo.getFormName()%>" property="advancedSearchOptions2"/>
    <bean:define id="advancedSearchOptions3" name="<%=vo.getFormName()%>" property="advancedSearchOptions3"/>
    <bean:define id="readingProgramOptions" type="java.util.Collection" name="<%=vo.getFormName()%>" property="<%= PowerSearchVO.PARAM_READING_PROGRAM_OPTIONS %>"/>
    <bean:define id="lexileCodeList" name="<%=vo.getFormName()%>" property="lexileCodeList"/>
    <bean:define id="fountasAndPinnellList" name="<%=vo.getFormName()%>" property="fountasAndPinnellList"/>
    <bean:define id="interestGradeLevelList" name="<%=vo.getFormName()%>" property="interestGradeLevelList"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
        document.<%=vo.getFormName()%>.<%=PowerSearchVO.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=vo.getFormName()%>.submit();
    }
  // -->
</script>

    <table id="<%=PowerSearchVO.TABLE_ADVANCED_SEARCH%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
            <td class="FormLabel tdAlignRight">
                <html:select property="<%= PowerSearchVO.FIELD_INDEX_TYPE_1 %>" onchange="submitDropDown()">
                    <html:options collection="powerSearchTypesList" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
            <td>
                <html:text property="<%= PowerSearchVO.FIELD_SEARCH_TERM_1 %>" size="35" maxlength="80"/>
            </td>
            <td class="FormElement">
                <html:select property="<%= PowerSearchVO.FIELD_WORD_PHRASE_SELECT_1 %>">
                    <html:options collection="advancedSearchOptions1" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
              
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="FormLabel">
                <html:radio property="<%= PowerSearchVO.FIELD_BOOLEAN_OPERATOR_1 %>" value="<%= String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_AND) %>" onclick="submitDropDown()"/><%= MessageHelper.formatMessage("powersearch_AND") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <html:radio property="<%= PowerSearchVO.FIELD_BOOLEAN_OPERATOR_1 %>" value="<%= String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_OR) %>" onclick="submitDropDown()"/><%= MessageHelper.formatMessage("powersearch_OR") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <html:radio property="<%= PowerSearchVO.FIELD_BOOLEAN_OPERATOR_1 %>" value="<%= String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_NOT) %>" onclick="submitDropDown()"/><%= MessageHelper.formatMessage("powersearch_NOT") %></td>
		    <td><base:helpTag helpFileName="d_boolean_and_or_not_power_srch.htm"/></td>
        </tr>
              
        <tr>
            <td class="FormLabel tdAlignRight">
                <html:select property="<%= PowerSearchVO.FIELD_INDEX_TYPE_2 %>" onchange="submitDropDown()">
                    <html:options collection="powerSearchTypesList" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
            <td>
                <html:text property="<%= PowerSearchVO.FIELD_SEARCH_TERM_2 %>" size="35" maxlength="80"/>
            </td>
            <td class="FormElement">
                <html:select property="<%= PowerSearchVO.FIELD_WORD_PHRASE_SELECT_2 %>">
                    <html:options collection="advancedSearchOptions2" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
              
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="FormLabel">
                <html:radio property="<%= PowerSearchVO.FIELD_BOOLEAN_OPERATOR_2 %>" value="<%= String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_AND) %>" onclick="submitDropDown()"/><%= MessageHelper.formatMessage("powersearch_AND") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <html:radio property="<%= PowerSearchVO.FIELD_BOOLEAN_OPERATOR_2 %>" value="<%= String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_OR) %>" onclick="submitDropDown()"/><%= MessageHelper.formatMessage("powersearch_OR") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <html:radio property="<%= PowerSearchVO.FIELD_BOOLEAN_OPERATOR_2 %>" value="<%= String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_NOT) %>" onclick="submitDropDown()"/><%= MessageHelper.formatMessage("powersearch_NOT") %></td>
            <td>&nbsp;</td>
        </tr>
              
        <tr>
            <td class="FormLabel tdAlignRight">
                <html:select property="<%= PowerSearchVO.FIELD_INDEX_TYPE_3 %>" onchange="submitDropDown()">
                    <html:options collection="powerSearchTypesList" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
            <td>
                <html:text property="<%= PowerSearchVO.FIELD_SEARCH_TERM_3 %>" size="35" maxlength="80"/>
            </td>
            <td class="FormElement">
                <html:select property="<%= PowerSearchVO.FIELD_WORD_PHRASE_SELECT_3 %>">
                    <html:options collection="advancedSearchOptions3" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                &nbsp;
            </td>
        </tr>

        <base:selectAward awardGroupID="<%=vo.getAwardGroupID()%>" awardNameID="<%=vo.getAwardNameID()%>" onchange="submitDropDown()" fromBasicSearch="false" fromVisualSetup="true" helpFileName="d_limiter_award_winners_visual_search_setup.htm" />
        <% if ( allowReadingAndInterestLevel ) { %>
            <tr>
                <td align="center" colspan="3">
                    <table width="100%">
                        <tr>
                            <td class="FormLabel tdAlignRight">
                                <%= MessageHelper.formatMessage("powersearch_ReadingLevel") %>
                            </td>
                            <td class="ColRow tdAlignLeft" >
                                <%= MessageHelper.formatMessage("powersearch_From") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_READING_GRADE_LEVEL_FROM %>" size="5" maxlength="4"/>
                                &nbsp;<%= MessageHelper.formatMessage("powersearch_To") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_READING_GRADE_LEVEL_TO %>" size="5" maxlength="4"/>
                            </td>
                        </tr>
                    </table>
                </td>                                 
            </tr>
            <% if (!LocaleHelper.isInternationalProduct()) { %>
                <tr>
                    <td align="center" colspan=3>
                        <table width="100%">
                            <tr>        
                                <td class="FormLabel tdAlignRight" valign="top">
                                    <%= MessageHelper.formatMessage("powersearch_InterestLevel") %>
                                </td>
                                <td class="ColRow tdAlignLeft" >
                                    <%= MessageHelper.formatMessage("powersearch_From") %>&nbsp;
                                    <html:select property="<%= PowerSearchVO.FIELD_INTEREST_GRADE_LEVEL_FROM %>">
                                        <html:options collection="interestGradeLevelList" property="longID"
                                                      labelProperty="stringDesc"/>
                                    </html:select>&nbsp;&nbsp;<base:helpTag helpFileName="d_interest_grade_level_power_srch.htm"/>
                                    <br/><br/>
                                    <%= MessageHelper.formatMessage("powersearch_To") %>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <html:select property="<%= PowerSearchVO.FIELD_INTEREST_GRADE_LEVEL_TO %>">
                                        <html:options collection="interestGradeLevelList" property="longID"
                                                      labelProperty="stringDesc"/>
                                    </html:select>
                                </td>
                            </tr>
                        </table>
                    </td>             
                </tr>
            <% } %>
        <% } %>

<!-- ARRC goes here -->
<!-- Show only if reading programs enabled. -->
    
<% if (vo.isReadingProgramOptionsEmpty() || isMediaSiteUser) { %>
        <html:hidden property="<%= PowerSearchVO.FIELD_READING_PROGRAM_TYPE %>" value='<%= "" + PowerSearchVO.READING_PROGRAM_NONE %>'/>
<% } else { %>
        <tr>
            <td colspan="3" align="center">
                <table id="<%=PowerSearchVO.TABLE_READING_PROGRAM_LEXILE%>" border="0" cellpadding="3" style="border-collapse: collapse">
                    <tr>
                        <td align="center" class="ColRowBold" nowrap><%= MessageHelper.formatMessage("powersearch_ReadingPrograms") %></td>
                        <td class="tdAlignLeft">
                            <html:select property="<%= PowerSearchVO.FIELD_READING_PROGRAM_TYPE %>" onchange="submitDropDown()">
                                <html:options collection="readingProgramOptions" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td>
                            <base:image src="/icons/general/readingprogrambasic.gif" width="80" height="38" align="absbottom"/>
                            <base:helpTag helpFileName="d_limiter_reading_program_visual_search_setup.htm"/>
                        </td>
                    </tr>
    <% if (vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_AR || vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_RC) { %>
                    <tr>
                        <% if (vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_AR) { %>
                             <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("powersearch_ARLevel") %></td>
                         <%} else {%>
                              <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("powersearch_RCLevel") %></td>
                         <%} %>
                        <td valign="bottom" colspan="2" class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("powersearch_From") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_READING_LEVEL_FROM %>" size="5"/>
                            &nbsp;<%= MessageHelper.formatMessage("powersearch_To") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_READING_LEVEL_TO %>" size="5"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("powersearch_PointValue") %></td>
                        <td valign="bottom" colspan="2" class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("powersearch_From") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_POINT_VALUE_FROM %>" size="5"/>
                            &nbsp;<%= MessageHelper.formatMessage("powersearch_To") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_POINT_VALUE_TO %>" size="5"/>
                        </td>
                    </tr>
    <% } else if (vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_LEXILE) { %>
                    <tr>
                        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("powersearch_LexileMeasure") %></td>
                        <td valign="bottom" colspan="2" class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("powersearch_From") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_LEXILE_FROM %>" size="5" maxlength="4"/>
                            &nbsp;<%= MessageHelper.formatMessage("powersearch_To") %>&nbsp;<html:text property="<%= PowerSearchVO.FIELD_LEXILE_TO %>" size="5" maxlength="4"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight" valign="bottom">&nbsp;</td>
                        <td valign="bottom" colspan="2" class="ColRow tdAlignLeft">
                            <html:select property="<%= PowerSearchVO.FIELD_LEXILE_CODE %>">
                                <html:options collection="lexileCodeList" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                    </tr>
    <% } else if (vo.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_FOUNTAS_AND_PINNELL) {  %>
                    <tr>
                        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("powersearch_FountasPinnell") %></td>
                        <td valign="bottom" colspan="2" class="ColRow tdAlignLeft">
                            <%= MessageHelper.formatMessage("powersearch_From") %>&nbsp;
                            <html:select property="<%= PowerSearchVO.FIELD_FOUNTAS_PINNELL_FROM %>">
                                <html:options collection="fountasAndPinnellList" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>
                            &nbsp;<%= MessageHelper.formatMessage("powersearch_To") %>&nbsp;
                            <html:select property="<%= PowerSearchVO.FIELD_FOUNTAS_PINNELL_TO %>">
                                <html:options collection="fountasAndPinnellList" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>
                            </td>
                        </tr>
    <% } %>
                </table> <!-- End of Table PowerSearchVO.TABLE_READING_PROGRAM_LEXILE -->       
            </td>
        </tr>
<% } %>
    </table> <!-- End of Table PowerSearchVO.TABLE_ADVANCED_SEARCH -->       
                
                
