<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs" %>
<%@ page import="org.apache.struts.action.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.MarcVO" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="form" name="<%=TextbookDetailForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm" />
<c:set var="form" value="<%=request.getAttribute(TextbookDetailForm.FORM_NAME)%>"/>
<tr> 
   <td valign="top">
    <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_OUTLINE%>" border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr>
        <td valign="top" width="100%">
        <table width="100%"><tr><td valign="top">
            <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_HEADER%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    
                    <td valign="top" width="100%">
                        <!-- Title information -->
                        <table id="<%=TextbookDetailForm.TABLE_TEXTBOOK_DETAIL%>" cellpadding="2" cellspacing="0">
                            <%= form.getTitleInformation() %>
                            <tr>
                              <td colspan="2" align="center"><base:imageLine height="1" width="100%"/></td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table> <!-- end of the titleHeader table-->
        </td>
    </tr>
    <tr>
      <td>
        <table id="<%=TextbookDetailForm.TABLE_SUPPLEMENTS%>" width="100%">
        <tr>
            <bean:size id="listSize" name="<%=TextbookDetailForm.FORM_NAME%>" property="supplementsList"/>
            <logic:notEqual name="listSize" value="0">
            <td>
            <% int count = 0; %>
            <logic:iterate id="record" name="<%=TextbookDetailForm.FORM_NAME%>" property="supplementsList" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
                <table id="<%=TextbookDetailForm.TABLE_SUPPLEMENTS_DETAILS + count%>" width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="ColRowBold">
                       <%=form.outputTitleAndDetail(request, response, record) %>
                    </td>
                    <td class="ColRowBold tdAlignRight">
                        <% if (!form.isDistrictUser() || form.isDistrictUserInStateContext()) { %>
                            <%=form.outputHighLevelAvailability(record) %>
                        <% } %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                       <base:imageSpacer width="15" height="1"/>
                       <% if (record.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_TEACHERS_EDITION) {%>
                              Teacher's Edition
      						  <base:bibTypeIcon rec="<%= record %>" alt="Teacher's Edition"/>
                       <% } else if (record.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_KIT) {%>
                              Resource Kit
                              <base:bibTypeIcon rec="<%= record %>" alt="Resource Kit"/>
                       <% } %>
                    </td>
                    <td class="ColRow tdAlignRight">
                        <%=form.outputOffsiteAvailability(record) %>
                    </td>
                </tr>
                <tr>
                    <td width="100%" colspan="2" valign="top">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                </table>

            <% count++; %>
            </logic:iterate>
            </td>
            </logic:notEqual>
            <logic:equal name="listSize" value="0">
              <td align="center" class="SmallColHeading">There are no supplements attached to this textbook.</td>
            </logic:equal>
            </tr>
        </table>
      </td>
    </tr>

        <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="displayTopLink" value="true">
        <tr>
            <td  class="SmallColRow tdAlignRight" vAlign="bottom">
                <a class="DetailLink" href="#TheTop">Top</a>
            </td>
        </tr>
        </logic:equal>
    </table>
        <td valign="top" class="tdAlignRight">
            <!-- Action Button table -->
            <% if(form.getPreviousBibID() != null || form.getNextBibID() != null || form.isAddEditDeleteable()) { %>
                <table id="<%=TextbookDetailForm.TABLE_ACTION_ICONS%>" border="0" cellpadding="2" cellspacing="0">
                    <base:spanIfAllowed permissions='<%=new Permission[]{Permission.CAT_ADD_TEXTBOOK}%>'>
                        <c:if test="${form.addEditDeleteable}">                            
                           <tr>
                                <td class="tdAlignRight">
                                    <base:link page='<%= form.getAddTeachersEditionLink() %>' id="<%=TextbookDetailForm.ID_LINK_ADD_TEACHERS_EDITION%>">
                                        <base:image src="/buttons/large/addteachersedition.gif" alt="<%=TextbookDetailForm.LINK_ADD_TEACHERS_EDITION%>"/>
                                    </base:link>
                                </td>
                            </tr>
                        </c:if>
                        <c:if test="${form.addEditDeleteable}">                                       
                            <tr>
                                <td class="tdAlignRight">
                                    <base:link permission='<%= Permission.CAT_ADD_TEXTBOOK %>' page='<%= form.getAddResourceKitLink() %>' id="<%=TextbookDetailForm.ID_LINK_ADD_RESOURCE_KIT%>">
                                        <base:image src="/buttons/large/resourcekit.gif" alt="<%=TextbookDetailForm.LINK_ADD_RESOURCE_KIT%>"/>
                                    </base:link>
                                </td>
                            </tr>
                        </c:if>
                     </base:spanIfAllowed>
                     <tr>
                        <td nowrap>
                        <% if(form.getPreviousBibID() != null) { %>
                            <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=TextbookDetailForm.ID_PREVIOUS_TITLE%>">
                            <base:image src="/icons/general/previouslonger.gif" width="44" height="26" alt="<%=TextbookDetailForm.LINK_PREVIOUS_TITLE%>"/>
                            </base:link>
                        <% } else { %>
                            <base:imageSpacer width="44" height="26"/>
                        <% } %>
                        <% if(form.getNextBibID() != null) { %>
                            <base:link page='<%= form.getNextRecordLink() %>' id="<%=TextbookDetailForm.ID_NEXT_TITLE%>">
                            <base:image src="/icons/general/nextlonger.gif" width="44" height="26" alt="<%=TextbookDetailForm.LINK_NEXT_TITLE%>"/>
                            </base:link>
                        <% } else { %>
                            <base:imageSpacer width="44" height="26"/>
                        <% } %>
                        </td>
                     </tr>                
                </table>
            <% } %>
          </td>
        </tr>
      </table>
   </td>
</tr>



