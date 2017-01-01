<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<base:messageBox strutsErrors="true"/>

<%
    RenewByDateForm form = (RenewByDateForm) request.getAttribute(RenewByDateForm.FORM_NAME);
    Tab[] tabbs = form.getTab(form.getSearchOption(), form.getSelectedTab());
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LinkedList renewList = store.getRenewTransactionList();
    String blockMessages = (String)request.getAttribute("blocklist");
    String focusControl = ((blockMessages == null) && (!form.isForGlobal())) ?
    		RenewByDateForm.FIELD_OLD_DATE :
    	    // block messages are showing or this is global update.
    	    // we do not want a control to have focus to prevent
    	    // a barcode scan from submitting the form.
    		"";
%>

<base:outlinedTableAndTabsWithinThere id="<%=RenewByDateForm.TABLE_RENEW%>"
                                      selectedTab="<%=form.getSelectedTab()%>" tabs="<%=tabbs%>"
                                      tabClass="<%=form.getTabClass()%>">
  <tr>
    <td valign="top" width="100%">
      <base:form action="/circulation/servlet/handlerenewbydateform.do" focus="<%=focusControl%>">
        <html:hidden property="<%=RenewByDateForm.FIELD_FOR_GLOBAL%>"/>
        <table width="100%" border="0" cellspacing="0" cellpadding="0" align="center">
          <tr>
            <td valign="top" width="100%">
              <table width="100%" border="0" cellspacing="0" cellpadding="0" align="center">
                <logic:equal name="<%=RenewByDateForm.FORM_NAME%>" property="<%=RenewByDateForm.FIELD_FOR_GLOBAL%>" value="false">
                  <tr>
                    <td align="center">
                      <table border="0" cellspacing="0" cellpadding="0" align="center" id="<%=RenewByDateForm.TABLE_HEADER%>">
                        <tr>
                          <td class="FormLabel tdAlignRight">Find all Textbooks with due date&nbsp;</td>
                          <td nowrap>
                            <base:date buttonName = "<%=RenewByDateForm.BUTTON_CALENDAR_OLD%>"
                                       fieldName = "<%=RenewByDateForm.FIELD_OLD_DATE%>"
                                       dateValue = "<%=form.getOldDueDate()%>"
                                       altText = "Current due date"/>
                          </td>
                        </tr>
                        <tr>
                          <td class="FormLabel tdAlignRight">Assign new due date&nbsp;</td>
                          <td nowrap>
                            <base:date buttonName = "<%=RenewByDateForm.BUTTON_CALENDAR_NEW%>"
                                       fieldName = "<%=RenewByDateForm.FIELD_NEW_DATE%>"
                                       dateValue = "<%=form.getNewDueDate()%>"
                                       altText = "Desired due date"/>
                          </td>
                        </tr>
                      </table>
                    </td>
                  </tr>
                </logic:equal>
                <logic:equal name="<%=RenewByDateForm.FORM_NAME%>" property="<%=RenewByDateForm.FIELD_FOR_GLOBAL%>" value="true">
                  <bean:define id="assets" name="<%= RenewByDateForm.FORM_NAME %>" property="assetTreeOptionList" />
                  <tr>
                    <td align="center">
                      <table border="0" cellspacing="0" cellpadding="0" align="center" id="<%=RenewByDateForm.TABLE_HEADER%>">
                        <tr>
                          <td class="FormLabel tdAlignRight">Renew all&nbsp;</td>
                          <td nowrap>
                            <html:select property="<%=RenewByDateForm.FIELD_ASSET_TEMPLATE_ID %>">
                              <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                          </td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                          <td nowrap class="FormLabel" align="center" colspan="2">
                            Assign new due date&nbsp;
                            <base:date buttonName = "<%=RenewByDateForm.BUTTON_CALENDAR_NEW%>"
                                       fieldName = "<%=RenewByDateForm.FIELD_NEW_DATE%>"
                                       dateValue = "<%=form.getNewDueDate()%>"
                                       altText = "Desired due date"/>
	                      </td>
	                    </tr>
                      </table>
                    </td>
                  </tr>
                  <tr><td><img src="/images/icons/general/line.gif" width="100%" vspace="6" border="0" height="1"></td></tr>
                  <tr>
                    <td align="center">
                      <table border="0" cellspacing="0" cellpadding="0" align="center">
	                    <tr>
	                      <td align="center" colspan="2">
	                        <table>
	                          <tr><td class="FormLabel tdAlignLeft" colspan="2">Limit by...</td></tr>
	                          <tr><td colspan="2">&nbsp;</td></tr>
                              <tr>
                                <td class="FormLabel tdAlignRight">Displayable&nbsp;Name/Title&nbsp;</td>
                                <td class="FormLabel tdAlignLeft"><html:text property="<%=RenewByDateForm.FIELD_TITLE%>" maxlength="1000" size="40"/></td>
	                          </tr>
                              <tr>
                                <td class="FormLabel tdAlignRight">ISBN&nbsp;</td>
                                <td class="FormLabel tdAlignLeft"><html:text property="<%=RenewByDateForm.FIELD_ISBN%>" maxlength="1000" size="40"/></td>
                              </tr>
                              <tr>
                                <td class="FormLabel tdAlignRight">Include&nbsp;Unlimited&nbsp;</td>
                                <td class="FormLabel tdAlignLeft"><html:checkbox property="<%=RenewByDateForm.FIELD_UNLIMITED%>"/></td>
                              </tr>
                              <tr>
                                <td class="FormLabel tdAlignRight">Due&nbsp;date&nbsp;</td>
                                <td class="FormLabel tdAlignLeft" nowrap>
                                  <base:date buttonName = "<%=RenewByDateForm.BUTTON_CALENDAR_OLD%>"
                                             fieldName = "<%=RenewByDateForm.FIELD_OLD_DATE%>"
                                             dateValue = "<%=form.getOldDueDate()%>"
                                             altText = "Current due date"/>
                                </td>
                              </tr>
	                        </table>
	                      </td>
	                    </tr>
	                  </table>
	                </td>
	              </tr>
                </logic:equal>
                <tr><td width="100%"><img src="/images/icons/general/line.gif" width="100%" vspace="6" border="0" height="1"></td></tr>
              </table>
            </td>
          </tr>
          <tr>
            <td width="100%">
              <table width="100%" border="0" cellspacing="0" cellpadding="0" align="center" id="<%=RenewByDateForm.TABLE_PREVIEW_WORDING%>">
                <tr><td class="FormLabel" align="center">
                  <logic:equal name="<%=RenewByDateForm.FORM_NAME%>" property="<%=RenewByDateForm.FIELD_FOR_GLOBAL%>" value="false">
                    You must preview the results before updating textbook due dates.
                  </logic:equal>
                  <logic:equal name="<%=RenewByDateForm.FORM_NAME%>" property="<%=RenewByDateForm.FIELD_FOR_GLOBAL%>" value="true">
                    You must preview the results before updating due dates.
                  </logic:equal>
                </td></tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                  <td class="ColRow" align="center">
                    Before proceeding, you should have a current backup of your database.  <%=GenericForm.getLastBackupDisplayMsg(false)%>
                  </td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr><td valign="baseline" align="center" class="ColRow">
                  <base:genericButton src="/buttons/large/preview2.gif" name="<%=RenewByDateForm.BUTTON_PREVIEW%>" alt="<%=RenewByDateForm.BUTTON_PREVIEW_ALT_TEXT%>"/>
                </td></tr>
              </table>
            </td>
          </tr>
        </table>
      </base:form>
    </td>
  </tr>
</base:outlinedTableAndTabsWithinThere>
