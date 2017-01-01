<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastForm" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    ForecastForm form = (ForecastForm)request.getAttribute(ForecastForm.FORM_NAME);
    Long siteID = form.getStore().getSiteID();
    boolean districtMode = new Long(0).equals(siteID);
    boolean showGrey;
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    int totalInitial, totalForecasted;
    boolean showLine = false;
    String url = null;
%>

<base:form action="/backoffice/servlet/handleforecastform.do">
    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="confirmFinish" value="true">
        <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="allSectionsContainTextbooks" value="true">           
            <base:confirmBox 
                showWarningIcon="true" 
                header="Are you sure you want to finish this district forecast?"          
                noName="<%=ForecastForm.BUTTON_NO%>"
             />                
        </logic:equal>
        <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="allSectionsContainTextbooks" value="false">
          
             <%     
            String[] messageText = new String[]{"Are you sure you want to finish this district forecast?"};
            %>
            <base:confirmBox 
                showWarningIcon="true" 
                header="There are one or more sections without textbooks." 
                messageText="<%=messageText%>"
                noName="<%=ForecastForm.BUTTON_NO%>"/>
        </logic:equal>
    </logic:equal>
    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="confirmFinalize" value="true">
        <%                         
            String[] messageText = new String[]{"You will not be able to edit the forecast after it has been finalized."};                            
        %>
        
        <base:confirmBox 
            showWarningIcon="true"            
            header="Are you sure you want to finalize this forecast?"
            messageText="<%=messageText%>"
            noName="<%=ForecastForm.BUTTON_NO%>" 
            yesName="<%=ForecastForm.BUTTON_YES_FINALIZE%>"/>
    </logic:equal>
    <base:outlinedTable id="<%=ForecastForm.TABLE_FORECASTMAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="TableHeading">
            <bean:write name="<%=ForecastForm.FORM_NAME%>" property="pageHeader"/>
            <%if ( form.getFfPack().getFinalized() != null ) { %>
                <br>
                for <%= ResponseUtils.filter(form.getFfPack().getSiteName())%>
            <% } %>
            </td>
            <td class="tdAlignRight">
                <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
                    <% if (form.getDistrictForecastID() == null) { %>
                        <base:genericButton name="<%=ForecastForm.BUTTON_PREVIOUS%>" src="/icons/general/previouslonger.gif" alt="<%=ForecastForm.ALT_PREVIOUS%>"/>
                        &nbsp;<base:imageSpacer height="1" width="44"/>
                    <% } %>
                </logic:equal>
                <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="true">
                    <% if (!districtMode && form.getFinalizeTime()==null) { %>
                    <base:genericButton name="<%=ForecastForm.BUTTON_EDIT%>" src="/buttons/large/edit.gif" alt="<%=ForecastForm.ALT_EDIT%>"/>
                    <% } %>
                </logic:equal>
            </td>
        </tr>
        <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="true">
        <% if (!districtMode) { %>
            <% if (form.getDistrictForecastID() != null) { %>        
            <tr>
                <td colspan="2" class="tdAlignRight">
                    <base:genericButton name="<%=ForecastForm.BUTTON_FINISHED%>" src="/buttons/large/finished.gif" alt="<%=ForecastForm.ALT_FINISHED%>"/>
                </td>
            </tr>
            <% }else if(form.getFinalizeTime()==null){ %>
            <tr>
                <td colspan="2" class="tdAlignRight">
                    <base:genericButton name="<%=ForecastForm.BUTTON_FINALIZE%>" src="/buttons/large/finalizepartial.gif" alt="<%=ForecastForm.ALT_FINALIZE%>"/>
                </td>
            </tr>
            <%} %> 
        <% } %>
        </logic:equal>
    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
       <tr>
            <td colspan="2" class="tdAlignRight">
                <base:showHideTag id="onSave" classForText="ColRowBold">
                    <base:genericButton name="<%=ForecastForm.BUTTON_SAVE_AND_VIEW%>" src="/buttons/large/saveandview.gif" alt="<%=ForecastForm.ALT_SAVE_AND_VIEW%>" onclick="hideElementonSave()"/>
                </base:showHideTag>
            </td>
       </tr>
       <tr>
            <td class="ColRow">
                <span class="ColRowBold">Step 3 of 3:&nbsp;</span>
                        Update information.
            </td>
            <td class="tdAlignRight">
                <base:cancelButton/>
            </td>
        </tr>
         <tr>
            <td colspan="2">
                <base:imageLine height="2" vspace="4" width="100%"/>
            </td>
        </tr>
        <tr>
            <td class="SmallColHeading">
                <html:select
                    property="<%= ForecastForm.FIELD_INCREASE_PERCENTAGE_TOP%>">
                    <html:option value="true">Increase</html:option>
                    <html:option value="false">Decrease</html:option>
                </html:select>
                &nbsp;Forecasted Enrollment by <html:text property="<%=ForecastForm.FIELD_PERCENTAGE_TOP%>" size="3" maxlength="3"/>%
                <base:genericButton absbottom="true" name="<%=ForecastForm.BUTTON_UPDATE_DETAILS_TOP%>" 
                 src="/buttons/large/update.gif" alt="<%=ForecastForm.ALT_UPDATE%>"/>
           </td>
           <td class="tdAlignRight">
                <base:genericButton name="<%=ForecastForm.BUTTON_USE_INITIAL%>" 
                 src="/buttons/large/useinitial.gif" alt="<%=ForecastForm.ALT_USE_INITIAL%>"/>
            </td>
        </tr>
    </logic:equal>
    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="true">
       <tr>
            <td colspan="2" class="tdAlignRight">
                <base:closeButton withX="true"/>
            </td>
       </tr>
    </logic:equal>
        <tr>
            <td colspan="2" width="100%">
                <table id="<%=ForecastForm.TABLE_DETAIL_VIEW%>" width="100%" cellpadding="3" cellspacing="0">
                    <% int whichClass = 0; %>
                    <logic:iterate id="department" name="<%=form.FORM_NAME %>" property="departments" type="com.follett.fsc.destiny.session.backoffice.data.ForecastDepartmentClientValue">
                        <%showLine = false; %>
                        <% if (department.getSelectedClasses().size() > 0) { %>
                        <tr>
                            <base:sectionHeading printerFriendly="false" heading="<%=ResponseUtils.filter(department.getName())%>" tdContent="valign='middle'"/>
                            <td class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap colspan="6">&nbsp;</td>
                        </tr>
                        <logic:iterate id="classes" name="department" property="selectedClasses" type="com.follett.fsc.destiny.session.backoffice.data.ForecastClassClientValue">
                        <tr>
                            <td colspan="2">
                            <table id="<%=ForecastForm.TABLE_CLASS_DETAIL + (whichClass++) %>" border="0" cellspacing="0" cellpadding="0" width="100%">
                       <% if (showLine) { %>
                           <tr>
                            <td colspan="8"><base:imageLine/>
                            </td>
                           </tr>
                       <% } %>
                            <tr>
                                <td colspan="8" class="ColRowBold"><%=ResponseUtils.filter(classes.getName())%>&nbsp;
                                    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
                                        <base:genericButton absbottom="true"  name="<%=ForecastForm.BUTTON_ASSIGN_TEXTBOOK + ForecastForm.BUTTON_SPLITTER + ResponseUtils.filter(classes.getName()) + ForecastForm.BUTTON_SPLITTER + ResponseUtils.filter(department.getName())%>" src="/buttons/small/updateclasstextbooks.gif" alt="<%=ForecastForm.ALT_CLASS_TEXTBOOKS %>"/>
                                    </logic:equal>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" valign="bottom">
                                    &nbsp;
                                </td>
                                <td colspan="2" align="center" valign="bottom" class="SmallColHeading">Enrollment</td>
                                <td align="center" valign="bottom" class="SmallColHeading">Checkouts</td>
                                <td align="center" valign="bottom" class="SmallColHeading">Textbooks</td>
                                <td align="center" valign="bottom" class="SmallColHeading">Textbooks</td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td class="SmallColHeading" align="center">&nbsp;</td>
                                <td class="SmallColHeading" align="center">Section</td>
                                <td class="SmallColHeading" align="center">Initial</td>
                                <td class="SmallColHeading" align="center">Forecasted</td>
                                <td class="SmallColHeading" align="center">Start</td>
                                <td class="SmallColHeading" align="center">Due</td>
                                <td class="SmallColHeading" align="center">Assigned</td>
                                <td class="SmallColHeading">&nbsp;</td>
                            </tr>
                            
                            <% 
                            showGrey = true; 
                            totalForecasted = 0;
                            totalInitial = 0;
                            int sectionIndex = 0;
                            %>
                            
                            <logic:iterate id="sections" name="classes" property="sections" type="com.follett.fsc.destiny.session.backoffice.data.ForecastSectionClientValue">
                            
                            <% if (showGrey) { %>
                                    <tr bgcolor="#E8E8E8">
                                <% } else { %>
                                    <tr>
                                <% } 
                                showGrey = !showGrey;
                                totalForecasted += sections.getForecastedEnrollment();
                                totalInitial += sections.getInitialEnrollment();
                                %>
                                    <td class="ColRow">&nbsp;</td>
                                    <td class="ColRow" align="center"><%=ResponseUtils.filter(sections.getSuffix()) %></td>
                                    <td class="ColRow" align="center"><%=sections.getInitialEnrollment()%></td>
                                    <td class="ColRow" align="center">
                                        <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
                                            <input type="text" name="<%=ForecastForm.FIELD_FORECAST_PREFIX + sections.getSectionID()%>" size="4" maxlength="4" value="<%=sections.getForecastedEnrollment()%>">
                                        </logic:equal>
                                        <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="true">
                                            <%=sections.getForecastedEnrollment()%>
                                        </logic:equal>
                                    </td>
                                    <td class="ColRow" align="center"><%=lh.formatDate(sections.getStartTime())%></td>
                                    <td class="ColRow" align="center"><%=lh.formatDate(sections.getEndTime())%></td>
                                    <td class="ColRowBold" align="center">
                                        <%if( sections.getTextbooks().size() == 0) { %>
                                            <font color=#CC0000>0</font>
                                         <%  } else { %>
                                           <%= sections.getTextbooks().size()%>
                                         <%  }%>
                                    </td> 
                                    <td class="tdAlignRight">
                                <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
                                    <base:genericButton name="<%=ForecastForm.BUTTON_ASSIGN_TEXTBOOK + ForecastForm.BUTTON_SPLITTER + ResponseUtils.filter(classes.getName()) + ForecastForm.BUTTON_SPLITTER + ResponseUtils.filter(department.getName()) + ForecastForm.BUTTON_SPLITTER + (sectionIndex ++)%>" src="/buttons/small/updatesectiontextbooks.gif" alt="<%=ForecastForm.ALT_SECTION_TEXTBOOKS %>"/>
                                </logic:equal>
                                </tr>
                            </logic:iterate> <!--  end of section iterator -->
                            
                            <tr>
                                <td class="ColRowBold" colspan="2">Enrollment</td>
                                <td class="ColRowBold" align="center"><%=lh.formatNumber(totalInitial) %></td>
                                <td class="ColRowBold" align="center"><%=lh.formatNumber(totalForecasted) %></td>
                                <td class="ColRowBold" colspan="3">&nbsp;</td>
                            </tr>
                       <%if (!showLine ) {
                           showLine = true;
                       } %>
                            </table>
                            </td>
                        </tr>
                       </logic:iterate> <!-- end of class iterator -->
                       <% } %>
                    </logic:iterate> <!--  end of department iterator -->
                </table>
            </td>
        </tr>
    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
        <tr>
          <td colspan="8"><base:imageLine/>
          </td>
        </tr>
        <tr>
            <td class="SmallColHeading">
                <html:select
                    property="<%= ForecastForm.FIELD_INCREASE_PERCENTAGE_BOTTOM%>">
                    <html:option value="true">Increase</html:option>
                    <html:option value="false">Decrease</html:option>
                </html:select>
                &nbsp;Forecasted Enrollment by <html:text property="<%=ForecastForm.FIELD_PERCENTAGE_BOTTOM%>" size="3" maxlength="3"/>%
                <base:genericButton absbottom="true" name="<%=ForecastForm.BUTTON_UPDATE_DETAILS_BOTTOM%>" 
                 src="/buttons/large/update.gif" alt="<%=ForecastForm.ALT_UPDATE%>"/>
           </td>
           <td class="tdAlignRight">
                <base:genericButton name="<%=ForecastForm.BUTTON_USE_INITIAL%>" 
                 src="/buttons/large/useinitial.gif" alt="<%=ForecastForm.ALT_USE_INITIAL%>"/>
            </td>
        </tr>
    </logic:equal>
        
    </base:outlinedTable>
</base:form>

