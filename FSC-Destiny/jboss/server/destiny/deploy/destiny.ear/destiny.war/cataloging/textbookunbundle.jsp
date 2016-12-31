<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.TextbookUnbundleForm"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%
    TextbookUnbundleForm form = (TextbookUnbundleForm) request.getAttribute(TextbookUnbundleForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
%>

<%@page import="java.util.Iterator"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.BundledTitleVO"%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletextbookunbundleform.do" focus="<%=TextbookUnbundleForm.FIELD_NUMBER_TO_UNBUNDLE%>" enctype="multipart/form-data">

<html:hidden property="<%=TextbookUnbundleForm.FIELD_BIB_ID%>"/>
<html:hidden property="<%=TextbookUnbundleForm.FIELD_STORED_NUMBER_TO_UNBUNDLE%>"/>

<logic:equal name="<%=TextbookUnbundleForm.FORM_NAME%>" property="<%=TextbookUnbundleForm.FIELD_SHOW_UNBUNDLE_MESSAGE%>" value="true">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="Copies without barcodes will be created for each title listed below.">
            <%if(form.getBundledTitlesList().size() > 0){ %>
                <tr>
                   <td colspan="2">
                      <table cellspacing="5">
                         <tr>
                            <td class="SmallColHeading" valign="top">
                               Title
                            </td>
                            <td class="SmallColHeading" valign="top" align="Center">
                               Quantity
                            </td>
                         </tr>
                         <%
                            Iterator<BundledTitleVO> btIter = form.getBundledTitlesList().iterator();
                            while(btIter.hasNext()) {
                               BundledTitleVO btvo = btIter.next();
                         %>
                         <tr>
                            <td class="ColRow" valign="top">
                               <%=btvo.getTitle() %>
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                   <%=form.determineTotalQuantity(btvo.getQuantity()) %>
                                </td>
                             </tr>
                            <% }%> 
                          </table>
                       </td>
                    </tr>
                 <% 
                }else{%>
                 <tr>
                    <td>
                       &nbsp;
                    </td>
                    <td class="ColRow" align="center">
                       No titles have been assigned to this bundle.
                    </td>
                </tr>
                <%} %>
        <tr>
        <%if( store.isStateContext() ){ %>
            <td valign="baseline" align="center" class="ColRowBold" colspan="2">This process is not reversible.
            </td>
        
        <%} else { %>
            <td valign="baseline" align="center" class="ColRowBold" colspan="2">This process is not reversible. You will not be able to return the items as a bundle at a later date.
            </td>
            <%} %>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRowBold" colspan="2">Do you want to continue?
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=TextbookUnbundleForm.BUTTON_NAME_BUNDLE_YES%>"
                    buttonNoName="<%=TextbookUnbundleForm.BUTTON_NAME_BUNDLE_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=TextbookUnbundleForm.TRAP_ENTER_KEY %>">

<base:outlinedTable id="<%=TextbookUnbundleForm.TABLE_MAIN%>" borderColor="<%=FlipperTag.ROW_GRAY%>" align="center" width="100%">
    <tr>
        <td class="TableHeading" valign="top" colspan="2">
            Unbundle Copies
        </td>
    </tr>
    <tr>
        <td class="ColRowBold" valign="top" colspan="2">
            <%=form.getBundleTitle() %>
        </td>
    </tr>
    <%if(form.getBundledTitlesList().size() > 0){ %>
            <tr>
               <td>
                  <table id="<%=TextbookUnbundleForm.TABLE_ASSIGNED_TITLES%>">
                     <tr>
                        <td class="SmallColHeading" valign="top">
                           Assigned Titles
                        </td>
                        <td class="SmallColHeading tdAlignRight" valign="top">
                           Quantity
                        </td>
                     </tr>
                    <%
                       Iterator<BundledTitleVO> iter = form.getBundledTitlesList().iterator();
                       while(iter.hasNext()) {
                           BundledTitleVO btvo = iter.next();
                    %>
                    <tr>
                        <td class="ColRow" valign="top">
                           <%=btvo.getTitle() %>
                        </td>
                        <td class="ColRow tdAlignRight" valign="top">
                           <%=btvo.getQuantity() %>
                        </td>
                    </tr>
                    <%
                       }
                    %>
                  </table>
               </td>
            </tr>
            <%}else{ %>
            <tr>
                <td>
                   &nbsp;
                </td>
                <td class="ColRow">
                   No titles have been assigned to this bundle.
                </td>
            </tr>
            <%} %>
    <tr>
       <td colspan="2">
          <base:imageLine />
       </td>
    </tr>
    <tr>
       <td colspan="2">
          <table align="Center" id="<%=TextbookUnbundleForm.TABLE_COPIES_TO_UNBUNDLE%>">
             <tr>
                <td class="ColRowBold tdAlignRight">Copies</td>
                <td class="ColRow"><%=form.gimmeCopyCountAsString() %></td>
             </tr>
             <tr>
                <td class="ColRowBold tdAlignRight">Copies to Unbundle</td>
                <td class="ColRow">
                <html:text property="<%=TextbookUnbundleForm.FIELD_NUMBER_TO_UNBUNDLE %>" size="4"/>
                </td>
             </tr>
             <tr>
                <td class="tdAlignRight">
                <base:genericButton name="<%=TextbookUnbundleForm.BUTTON_UNBUNDLE %>" src="/buttons/large/unbundle.gif" alt="Unbundle" ></base:genericButton>
                </td>
                <td><base:cancelButton/></td>
             </tr>
          </table>
       </td>
    </tr>
</base:outlinedTable>
</base:form>
