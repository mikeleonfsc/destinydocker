<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.AuthorityListItem" %>
<%@ page import="java.util.Iterator" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%
    AuthoritySearchForm form = (AuthoritySearchForm)request.getAttribute( AuthoritySearchForm.FORM_NAME );
    String browsePrev = form.getBrowsePrevious();
    String browseNext = form.getBrowseNext();
    boolean havePrevNextButtons = !StringHelper.isEmpty(browsePrev); // if have previous we assume have next

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleauthoritysearchform.do" focus="searchString">

    <logic:equal name="<%= AuthoritySearchForm.FORM_NAME %>" property="deleteAuthorityConfirm" value="true">
        <html:hidden property="authID" />
        <html:hidden property="arrowString" />
        
           <%     
            String[] messageText = new String[]{MessageHelper.formatMessage("authoritysearch_AreYouSureYouWantToDeleteThisAuthorityRecord")};
            %>
        <base:confirmBox showWarningIcon="true" 
            header='<%=MessageHelper.formatMessage("authoritysearch_ThisAuthorityRecordWillBeDeleted" )%>'   
            messageText="<%=messageText%>"        
            yesName="<%=AuthoritySearchForm.BUTTON_CONFIRM_YES%>"
            noName="<%=AuthoritySearchForm.BUTTON_CONFIRM_NO%>"
          />
    </logic:equal>

    <table border="0" cellspacing="3" cellpadding="0" id=<%=AuthoritySearchForm.TABLE_HEADER%> width="90%">
        <tr>
             <td>
                <table border="0" cellspacing="3" cellpadding="0">
                <tr>
                <td class="ColRowBold"><%= MessageHelper.formatMessage("authoritysearch_Find") %>&nbsp;<html:text property="<%= AuthoritySearchForm.FIELD_SEARCHSTRING %>" size="30" maxlength="120"/>&nbsp;
                </td>
                <td>
                    <base:goButton/>
                </td>
                </tr>
                </table>
            </td>
            <td class="tdAlignRight">
                <table border="0" cellspacing="3" cellpadding="0">
                  <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("authoritysearch_New") %>&nbsp;<html:select property='<%= "" +AuthoritySearchForm.FIELD_ADD_OPTION %>'>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_PERSONAL_NAME%>'><%= MessageHelper.formatMessage("authoritysearch_PersonalName") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_CORPORATE_NAME%>'><%= MessageHelper.formatMessage("authoritysearch_CorporateName") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_MEETING_NAME%>'><%= MessageHelper.formatMessage("authoritysearch_MeetingName") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_UNIFORM_SERIES_TITLE%>'><%= MessageHelper.formatMessage("authoritysearch_UniformSeriesTitle") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_CHRONOLOGICAL_TERM%>'><%= MessageHelper.formatMessage("authoritysearch_ChronologicalTerm") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_TOPICAL_TERM%>'><%= MessageHelper.formatMessage("authoritysearch_TopicalTerm") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_GEOGRAPHIC_TERM%>'><%= MessageHelper.formatMessage("authoritysearch_GeographicName") %></html:option>
                        <html:option value='<%= "" +AuthorityMarc.TEMPLATE_GENRE_FORM%>'><%= MessageHelper.formatMessage("authoritysearch_GenreForm") %></html:option>
                    </html:select>&nbsp;
                    </td>
                    <td>
                        <base:genericButton alt='<%= MessageHelper.formatMessage("add") %>' absbottom="true" src="/buttons/small/add.gif" name="<%=AuthoritySearchForm.ID_BUTTON_ADD%>"/>
                    </td>
                  </tr>
                </table>
            </td>
        </tr>
    </table>

    <logic:equal name='<%= AuthoritySearchForm.FORM_NAME %>'
        property="results" value="true">

            <base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0">
                <tr>
                <td>
                    <table id="<%=AuthoritySearchForm.TABLE_RESULTS_HEADER_1%>" width="100%">
                        <tr>
                            <td width="21">
                                <%if(havePrevNextButtons) {%>
                                    <base:link page='<%= form.getPreviousLink(request, response) %>' id="<%=AuthoritySearchForm.ID_BUTTON_PREVIOUS %>">
                                        <base:image src="/icons/general/previous.gif" width="21" height="26" alt='<%=MessageHelper.formatMessage("authoritysearch_Previous", browsePrev) %>' />                                        
                                    </base:link>
                                <%}%>
                            </td>
                            <td class="ColRowBold">
                            <%= MessageHelper.formatMessage("authoritysearch_AuthorityHeadingsClosestTo_searchstring",ResponseUtils.filter(form.getTrueSearchString())) %>
                            </td>
                            <td class="tdAlignRight" width="21">
                                <%if(havePrevNextButtons) {%>
                                    <base:link page='<%= form.getNextLink(request, response) %>' id="<%=AuthoritySearchForm.ID_BUTTON_NEXT %>">
                                        <base:image src="/icons/general/next.gif" width="21" height="26" alt='<%=MessageHelper.formatMessage("authoritysearch_Next", browseNext) %>' />
                                    </base:link>
                                <%}%>
                            </td>
                        </tr>
                    </table>
                </td>
                </tr>

                <tr>
                <td>

        <table id="<%= AuthoritySearchForm.TABLE_RESULTS %>" cellpadding="3" cellspacing="0" border="0" width="100%">
        <%  int size = form.getAuthorityList().getList().size(); %>
        <%  if ( size == 0 ) { %>
            <tr>
	            <td class="ColRowBold"><%= MessageHelper.formatMessage("authoritysearch_NoMatchesFound") %></td>
            </tr>
        <%  } else { %>
                                                                                                                             
	        <logic:iterate id="row" name="<%= AuthoritySearchForm.FORM_NAME %>" property="authorityList.list" type="com.follett.fsc.destiny.session.cataloging.data.AuthorityListItem">
			    <tr>
			        <td colspan="3" valign="top">
			            <base:imageLine height="1" width="100%" />
			        </td>
			    </tr>
			    
	        	<tr>
	                <%-- Display item here --%>

	                <td class="ColRowBold" valign="top">
	                	<%= form.getViewLink(row) %>
	                </td>
	
	                <td class="ColRow" valign="top"><%= row.getAuthorityType() %> </td>
	                <td class="ColRow tdAlignRight" valign="top">
    	                <A href="<%=form.getDeleteLink(row) %>" id="<%=AuthoritySearchForm.ID_BUTTON_DELETE + row.getAuthorityID()%>">
    	                   <base:image src="/buttons/small/delete.gif" alt='<%= MessageHelper.formatMessage("delete") %>' />
                       </A>
                   </td>
                </tr>

                <%-- pump out tracing tags --%> 
                <% 
                	Iterator itr = row.getTracingDisplay().iterator();
                	while ( itr.hasNext() ) { 
                     String data = (String) itr.next(); 
                %>
		                <tr>
		                    <td class="ColRow" colspan="2">&nbsp;
			                    <%= data %>  <%-- comes back pre HTML ready --%>
		                    </td>
		                </tr>
				<% } %>		                
	        </logic:iterate>
        <%  } %>
        </table> 

                </td>
                </tr>


                <tr>
                <td>
                    <table id="<%=AuthoritySearchForm.TABLE_RESULTS_HEADER_2%>" width="100%">
                        <tr>
                            <td width="21">
                                <%if(havePrevNextButtons) {%>
                                    <base:link page='<%= form.getPreviousLink(request, response) %>' id="<%=AuthoritySearchForm.ID_BUTTON_PREVIOUS %>">
                                        <base:image src="/icons/general/previous.gif" width="21" height="26" alt='<%=MessageHelper.formatMessage("authoritysearch_Previous", browsePrev) %>' />
                                    </base:link>
                                <%}%>
                            </td>
                            <td class="ColRowBold">&nbsp;
                            </td>
                            <td class="tdAlignRight" width="21">
                                <%if(havePrevNextButtons) {%>
                                    <base:link page='<%= form.getNextLink(request, response) %>' id="<%=AuthoritySearchForm.ID_BUTTON_NEXT %>">
                                        <base:image src="/icons/general/next.gif" width="21" height="26" alt='<%=MessageHelper.formatMessage("authoritysearch_Next", browseNext) %>' />
                                    </base:link>
                                <%}%>
                            </td>
                        </tr>
                    </table>
                </td>
                </tr>
        </base:outlinedTable>
    </logic:equal>
</base:form>
