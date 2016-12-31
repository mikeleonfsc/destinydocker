<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.HeadingsFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.HeadingsResultValue" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>



<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    FindHeadingsForm form = (FindHeadingsForm)request.getAttribute( FindHeadingsForm.FORM_NAME );
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlefindheadingsform.do" focus="<%= FindHeadingsForm.FIELD_SEARCHSTRING%>">
    <html:hidden property="<%=FindHeadingsForm.PARAM_TAG_ID%>"/>
    <html:hidden property="<%=FindHeadingsForm.PARAM_TAG_NUMBER%>"/>
    <html:hidden property="<%=FindHeadingsForm.PARAM_TAG_TYPE%>"/>
    <html:hidden property="<%=FindHeadingsForm.PARAM_RETURN_ACTION%>"/>
    <html:hidden property="<%=FindHeadingsForm.PARAM_SUPPRESS_WPE%>"/>
    <html:hidden property="<%=FindHeadingsForm.PARAM_SUPPRESS_8XXTAGS_FOR_SERIES_TAGTYPE%>"/>
    <html:hidden property="<%=FindHeadingsForm.PARAM_FORCE_BIBLIOGRAPHIC_HEADING_TYPE%>"/>
    <table border="0" cellspacing="3" cellpadding="0" id=<%=FindHeadingsForm.TABLE_HEADER%> width="90%">
        <tr>
            <td class="ColRowBold"><%= MessageHelper.formatMessage("findheadings_Find") %>&nbsp;<html:text property="<%= FindHeadingsForm.FIELD_SEARCHSTRING %>" size="30" maxlength="120"/>
                &nbsp;<%= MessageHelper.formatMessage("findheadings_In") %>&nbsp;
                 <logic:equal name="<%= FindHeadingsForm.FORM_NAME %>" property="forceBibliographicHeadingType" value="false">
                <html:select property='<%= "" +FindHeadingsForm.FIELD_HEADING_TYPE %>' onchange="submit()">
                    <html:option value='<%= "" +HeadingsFacadeSpecs.HEADING_TYPE_AUTHORITY%>'><%= MessageHelper.formatMessage("findheadings_AuthorityHeadings") %></html:option>
                    <html:option value='<%= "" +HeadingsFacadeSpecs.HEADING_TYPE_BIBLIOGRAPHIC%>'><%= MessageHelper.formatMessage("findheadings_BibliographicHeadings") %></html:option>
                </html:select>&nbsp;
                </logic:equal>
                 <logic:equal name="<%= FindHeadingsForm.FORM_NAME %>" property="forceBibliographicHeadingType" value="true"><%= MessageHelper.formatMessage("findheadings_BibliographicHeadings") %>&nbsp;</logic:equal>
                <base:goButton absbottom="true"/>
            </td>
        </tr>
    </table>
        
    <base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0">
        <tr><td>
            <table id="<%=FindHeadingsForm.TABLE_RESULTS_HEADER%>" width="100%" >
                <tr>
                    <td width="21">
                        <logic:equal name="<%= FindHeadingsForm.FORM_NAME %>" property="<%= FindHeadingsForm.ATTRIBUTE_HAVE_MULTIPLE_PAGES %>" value="true">
                            <base:link page='<%= form.getPreviousLink(request, response) %>' id="<%=FindHeadingsForm.ID_BUTTON_PREVIOUS %>">
                                <base:image src="/icons/general/previous.gif" alt='<%= MessageHelper.formatMessage("findheadings_Previous") %>'/>
                            </base:link>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold">
                        
                        
                        <bean:write name="<%= FindHeadingsForm.FORM_NAME %>" property="<%= FindHeadingsForm.ATTRIBUTE_SEARCH_HEADER_TEXT %>"/>
                    
                    
                    </td>
                    <td class="tdAlignRight" width="21">
                        <logic:equal name="<%= FindHeadingsForm.FORM_NAME %>" property="<%= FindHeadingsForm.ATTRIBUTE_HAVE_MULTIPLE_PAGES %>" value="true">
                            <base:link page='<%= form.getNextLink(request, response) %>' id="<%=FindHeadingsForm.ID_BUTTON_NEXT %>">
                                <base:image src="/icons/general/next.gif" alt='<%= MessageHelper.formatMessage("findheadings_Next") %>'/>
                            </base:link>
                        </logic:equal>
                    </td>
                </tr>
            </table>
        </td></tr>
        <tr>
            <td colspan="3" valign="top">
                <base:imageLine height="1" width="100%" />
        
            </td>
        </tr>

         <!-- Hitlist -->    
         <logic:equal name="<%= FindHeadingsForm.FORM_NAME %>" property="<%= FindHeadingsForm.ATTRIBUTE_HAVE_RESULTS %>" value="true">
            <tr><td><table id="<%= FindHeadingsForm.TABLE_RESULTS %>" cellpadding="5" cellspacing="0">
                <logic:iterate id="row" name="<%= FindHeadingsForm.FORM_NAME %>" property="<%= FindHeadingsForm.ATTRIBUTE_RESULTS %>" type="com.follett.fsc.destiny.session.cataloging.data.HeadingsResultValue">
                    <tr>
                        <td colspan="3" valign="top" class="ColRowBold">
                            <a href="<%= form.getRowLink(request, response, row) %>" class="DetailLink" id="<%=FindHeadingsForm.ID_BUTTON_SELECT %>">
                                <bean:write name="row" property="displayKey"/>
                                <logic:equal name="row" property="headingType" value='<%="" + HeadingsFacadeSpecs.HEADING_TYPE_BIBLIOGRAPHIC %>'>
                                    [<bean:write name="row" property="count"/>]
                                </logic:equal>
                                <base:image src="/buttons/small/select.gif" alt='<%= MessageHelper.formatMessage("select") %>'/>
                            </a>
                        </td>
                    </tr>
                </logic:iterate>
            </table></td></tr>
        </logic:equal>
         <logic:equal name="<%= FindHeadingsForm.FORM_NAME %>" property="<%= FindHeadingsForm.ATTRIBUTE_HAVE_RESULTS %>" value="false">
                <tr>
                    <td colspan="3" valign="top">
                        <table id="<%= FindHeadingsForm.TABLE_NO_MATCHES_MESSAGE %>">
                        <tr>
                            <td class="ColRowBold"><%= MessageHelper.formatMessage("findheadings_NoMatchesFound") %></td>
                        </tr>
                        </table>
                    </td>
                </tr>
        </logic:equal>

    </base:outlinedTable>
</base:form>
