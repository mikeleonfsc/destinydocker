<%@page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetDescriptionDetailForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    AssetDescriptionDetailForm form = (AssetDescriptionDetailForm)request.getAttribute(AssetDescriptionDetailForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleassetdescriptiondetailform.do">
<base:outlinedTableAndTabsWithinThere id="<%=AssetDescriptionDetailForm.TABLE_MAIN%>"  selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td valign="top" width="100%">
            <table id="<%=AssetDescriptionDetailForm.TABLE_ASSETDETAILS%>" border="0" cellpadding="3" cellspacing="0" width="100%">
                <tr>
                    <td width="100%">
                        <table id="<%=AssetDescriptionDetailForm.TABLE_ASSETDETAILS_INNER%>" width="100%">
                           <tr>
                                <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="textbookAsset" value="false">
                                <td class="TableHeading">
                                    <bean:write name="<%= AssetDescriptionDetailForm.FORM_NAME %>" property="assetDescription"/>
                                </td>
                                </logic:equal>
                                <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="textbookAsset" value="true">
                                   <%=form.renderTextbookAsset() %>
                                </logic:equal>
                           </tr>
                            <bean:size id="listSize" name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="supplementsList"/>
                            <logic:notEqual name="listSize" value="0">
                               <tr>
                                  <td>
                                <% int count = 0; %>
                                <logic:iterate id="record" name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="supplementsList" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
                                    <table id="<%=AssetDescriptionDetailForm.TABLE_SUPPLEMENTS_DETAILS + count%>" width="100%" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td class="ColRowBold">
                                           <%=form.outputTitleAndDetail(request, record) %>
                                        </td>
                                        <td class="ColRowBold tdAlignRight">
                                            <% if (!form.isDistrictUser()) { %>
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
                               </tr>
                           </logic:notEqual>
                            <logic:equal name="listSize" value="0">
                              <td align="center" class="SmallColHeading">There are no supplements attached to this resource.</td>
                            </logic:equal>
                        </table>
                    </td>
                    <td class="tdAlignRight" valign="top">
                        <table border="0">
                            <tr>
                                <td>
                                    <base:link permission='<%= Permission.CAT_ASSET_ADD_ASSET %>' page='<%= form.getAddTeachersEditionLink() %>' id="<%=AssetDescriptionDetailForm.ID_LINK_ADD_TEACHERS_EDITION%>">
                                            <base:image src="/buttons/large/addteachersedition.gif" alt="<%=AssetDescriptionDetailForm.LINK_ADD_TEACHERS_EDITION%>" />
                                    </base:link>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <base:link permission='<%= Permission.CAT_ASSET_ADD_ASSET %>' page='<%= form.getAddResourceKitLink() %>' id="<%=AssetDescriptionDetailForm.ID_LINK_ADD_RESOURCE_KIT%>">
                                            <base:image src="/buttons/large/resourcekit.gif" alt="<%=AssetDescriptionDetailForm.LINK_ADD_RESOURCE_KIT%>" />
                                    </base:link>
                                </td>
                            </tr>
                            <tr>
                                <td class="Instruction" nowrap>
                                <% if(form.getPreviousBibID() != null) { %>
                                    <base:link page='<%= form.getPreviousRecordLink() %>'>
                                    <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26" alt="<%=AssetDescriptionDetailForm.LINK_PREVIOUS_ASSET%>" />
                                    </base:link>
                                <% } else { %>
                                    <base:imageSpacer width="44" height="26" />
                                <% } %>
                                <% if(form.getNextBibID() != null) { %>
                                    <base:link page='<%= form.getNextRecordLink() %>'>
                                    <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26" alt="<%=AssetDescriptionDetailForm.LINK_NEXT_ASSET%>" />
                                    </base:link>
                                <% } else { %>
                                    <base:imageSpacer width="44" height="26"/>
                                <% } %>
                                </td>
                            </tr>
                            
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

