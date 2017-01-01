<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TitleEditForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="rdaContentTypeID" name="<%=TitleEditForm.FORM_NAME%>" property="rdaContentTypes"/>
<bean:define id="rdaMediaTypeID" name="<%=TitleEditForm.FORM_NAME%>" property="rdaMediaTypes"/>
<bean:define id="rdaCarrierTypeID" name="<%=TitleEditForm.FORM_NAME%>" property="rdaCarrierTypes"/>

<base:messageBox strutsErrors="true"/>
<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
    SessionStoreProxy store = form.getSessionStore();
%>
<c:set var="form" value="<%=request.getAttribute(TitleEditForm.FORM_NAME)%>"/>

<base:form action="/cataloging/servlet/handletitleeditform.do" focus="<%=TitleEditForm.FIELD_RDA_CONTENT_TYPE%>">
<INPUT type="hidden" name="page" value="7">
<!-- space this similar to brief page -->
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">
  <jsp:include page="/cataloging/titleedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="rdaTypes"/>
  </jsp:include>
  <tr>
    <td>
<%-- This table can't be less than 100% or the tabs will be misaligned --%>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr>
            <td colspan="2">
                <table id="<%=TitleEditForm.TABLE_RDA_TYPES_PAGE%>" width="100%">
                    <tr>
                        <td>
                            <span class="FormLabel"><%= MessageHelper.formatMessage("titleeditrdatypes_Title") %>&nbsp;</span>
                            <span class="ColRow"><%=form.gimmeFullTitle() %></span>
                        </td>
                       <td class="tdAlignRight">
                            <base:genericButton 
                                name="<%=TitleEditForm.BUTTON_NAME_MARC_EDITOR%>" 
                                src="/buttons/large/usemarceditor.gif" 
                                alt='<%= MessageHelper.formatMessage("useMarcEditor") %>' absbottom="true"
                            />
                       </td>
                        
                    </tr>
                    <tr>
                      <td colspan="2">
                        <base:imageLine height="1" width="100%"/>
                      </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditrdatypes_ContentType") %>
                        </td>
                    </tr>
                    <tr>
                        <td class="FormLabel tdAlignRight" valign="top" width="33%">
                            <html:select property="<%=TitleEditForm.FIELD_RDA_CONTENT_TYPE%>">
                              <html:option value=""></html:option>
                              <html:options collection="rdaContentTypeID" property="stringDesc"
                                            labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td class="ColRowBold" valign="top">
                            <base:showHideTag id="onActionContent">
                                <base:genericButton src="/buttons/large/add.gif" onclick="hideElementonActionContent()" name="<%=TitleEditForm.BUTTON_NAME_ADD_RDA_CONTENT_TYPE%>" alt='<%= MessageHelper.formatMessage("titleeditrdatypes_AddContentType") %>'/><br>
                            </base:showHideTag>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <table id="<%=TitleEditForm.TABLE_RDA_CONTENT_TYPE_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="rdaContentTypeEmpty" value="true">
                                    <tr>
                                        <td class="FormLabel" colspan="2" align="center">&nbsp;</td>
                                    </tr>
                                </logic:equal>
                                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="rdaContentTypeEmpty" value="false">                
                <%
                                    List list = form.getListOfIDs(336);
                                    Iterator itr = list.iterator();
                
                                    while ( itr.hasNext()) {
                                        int id = (( Integer) itr.next()).intValue();
                
                                        String deleteButton = "deleteRDAContentType" + (StringHelper.rightMost( "0000" + id, 4 ));
                %>
                                        <base:flipper key="titleeditrdacontenttype">
                                            <td class="ColRow"><%= form.getRDAContentTypeTableEntry(id) %>&nbsp;</td>
                                            <td align="right">
                                                <c:if test="${form.rdaContentTypeListSize > 1}">
                                                    <base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditrdatypes_DeleteContentType") %>'/>
                                                </c:if>
                                            </td>
                                        </base:flipper>
                <%
                                    }
                %>
                                </logic:equal>
                            </table>
                        </td>
                    </tr>
                    <tr>
                      <td colspan="2">
                        <base:imageLine height="1" width="100%"/>
                      </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditrdatypes_MediaType") %>
                        </td>
                    </tr>
                    <tr>
                        <td class="FormLabel tdAlignRight" valign="top">
                            <html:select property="<%=TitleEditForm.FIELD_RDA_MEDIA_TYPE%>">
                              <html:option value=""></html:option>
                              <html:options collection="rdaMediaTypeID" property="stringDesc"
                                            labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td class="ColRowBold" valign="top">
                            <base:showHideTag id="onActionMedia">
                                <base:genericButton src="/buttons/large/add.gif" onclick="hideElementonActionMedia()" name="<%=TitleEditForm.BUTTON_NAME_ADD_RDA_MEDIA_TYPE%>" alt='<%= MessageHelper.formatMessage("titleeditrdatypes_AddMediaType") %>'/><br>
                            </base:showHideTag>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <table id="<%=TitleEditForm.TABLE_RDA_MEDIA_TYPE_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="rdaMediaTypeEmpty" value="true">
                                    <tr>
                                        <td class="FormLabel" colspan="2" align="center">&nbsp;</td>
                                    </tr>
                                </logic:equal>
                                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="rdaMediaTypeEmpty" value="false">                
                <%
                                    List list = form.getListOfIDs(337);
                                    Iterator itr = list.iterator();
                
                                    while ( itr.hasNext()) {
                                        int id = (( Integer) itr.next()).intValue();
                
                                        String deleteButton = "deleteRDAMediaType" + (StringHelper.rightMost( "0000" + id, 4 ));
                %>
                                        <base:flipper key="titleeditrdamediatype">
                                            <td class="ColRow"><%= form.getRDAMediaTypeTableEntry(id) %>&nbsp;</td>
                                            <td align="right">
                                                <base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditrdatypes_DeleteMediaType") %>'/>
                                            </td>
                                        </base:flipper>
                <%
                                    }
                %>
                                </logic:equal>
                            </table>
                        </td>
                    </tr>
                    <tr>
                      <td colspan="2">
                        <base:imageLine height="1" width="100%"/>
                      </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditrdatypes_CarrierType") %>
                        </td>
                    </tr>
                    <tr>
                        <td class="FormLabel tdAlignRight" valign="top">
                            <html:select property="<%=TitleEditForm.FIELD_RDA_CARRIER_TYPE%>">
                              <html:option value=""></html:option>
                              <html:options collection="rdaCarrierTypeID" property="stringDesc"
                                            labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td class="ColRowBold" valign="top">
                            <base:showHideTag id="onActionCarrier">
                                <base:genericButton src="/buttons/large/add.gif" onclick="hideElementonActionCarrier()" name="<%=TitleEditForm.BUTTON_NAME_ADD_RDA_CARRIER_TYPE%>" alt='<%= MessageHelper.formatMessage("titleeditrdatypes_AddCarrierType") %>'/><br>
                            </base:showHideTag>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <table id="<%=TitleEditForm.TABLE_RDA_CARRIER_TYPE_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="rdaCarrierTypeEmpty" value="true">
                                    <tr>
                                        <td class="FormLabel" colspan="2" align="center">&nbsp;</td>
                                    </tr>
                                </logic:equal>
                                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="rdaCarrierTypeEmpty" value="false">                
                <%
                                    List list = form.getListOfIDs(338);
                                    Iterator itr = list.iterator();
                
                                    while ( itr.hasNext()) {
                                        int id = (( Integer) itr.next()).intValue();
                
                                        String deleteButton = "deleteRDACarrierType" + (StringHelper.rightMost( "0000" + id, 4 ));
                %>
                                        <base:flipper key="titleeditrdacarriertype">
                                            <td class="ColRow"><%= form.getRDACarrierTypeTableEntry(id) %>&nbsp;</td>
                                            <td align="right">
                                                <c:if test="${form.rdaCarrierTypeListSize > 1}">
                                                    <base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditrdatypes_DeleteCarrierType") %>'/>
                                                </c:if>
                                            </td>
                                        </base:flipper>
                <%
                                    }
                %>
                                </logic:equal>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="Instruction"><%= MessageHelper.formatMessage("titleeditrdatypes_RequiredField") %></td>
        </tr>
      </base:outlinedTableAndTabsWithinThere>
      <tr>
        <td>
        <jsp:include page="titlefooter.jsp"/>
        </td>
      </tr>
    </td>
  </tr>
</table>

</base:form>
