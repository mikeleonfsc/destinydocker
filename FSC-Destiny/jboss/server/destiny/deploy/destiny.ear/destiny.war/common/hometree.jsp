<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.data.*"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    HomeTreeForm form = (HomeTreeForm)request.getAttribute("common_servlet_HomeTreeForm");
    String topPath = form.getTopPath(request); 
%>
<base:outlinedTable borderColor="#c0c0c0" align="<%=form.getTableAlignment(request)%>">
<tr>
<td>

<logic:equal name='<%= HomeTreeForm.FORM_NAME %>' property="deleteGroup" value="true">
<base:form action='<%= topPath + "/servlet/handlehometreeform.do"%>'>
<html:hidden property="groupID"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("hometree_AreYouSureYouWantToDeleteThisGroupAndAllItsLinks") %>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo
                    buttonYesName="<%= HomeTreeForm.BUTTON_NAME_DELETE_GROUP_CONFIRM_YES %>"
                    buttonNoName="<%= HomeTreeForm.BUTTON_NAME_DELETE_GROUP_CONFIRM_NO %>"
                 />
            </td>
        </tr>
    </base:messageBox>
</base:form>
</logic:equal>


<logic:equal name='<%= HomeTreeForm.FORM_NAME %>' property="deleteLink" value="true">
<base:form action='<%= topPath + "/servlet/handlehometreeform.do"%>'>
<html:hidden property="linkID"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("hometree_AreYouSureYouWantToDeleteThisLink") %>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo
                    buttonYesName="<%= HomeTreeForm.BUTTON_NAME_DELETE_LINK_CONFIRM_YES %>"
                    buttonNoName="<%= HomeTreeForm.BUTTON_NAME_DELETE_LINK_CONFIRM_NO %>"
                 />
            </td>
        </tr>
    </base:messageBox>
    </center>
</base:form>
</logic:equal>



<table id=<%=HomeTreeForm.TABLE_MAIN%> border="0" cellpadding="1" cellspacing="0" width="100%">
<tr>
    <td class="ColRowBold" width="100%"><%= MessageHelper.formatMessage("hometree_IntroductoryText") %></td>
    <td class="tdAlignRight" width="100%" NOWRAP>
        <base:link page='<%= topPath + "/servlet/presentedithomegroupform.do"%>' id="<%=HomeTreeForm.ID_ADD_GROUP %>">
            <base:image src="/icons/general/addgroup.gif" width="40" height="16" alt='<%= ResponseUtils.filter(MessageHelper.formatMessage("hometree_AddGroup"))%>'/>
        </base:link>
<logic:equal name='<%= HomeTreeForm.FORM_NAME %>' property="enableAddLinkButton" value="true">
        &nbsp;
        <base:link page='<%= topPath + "/servlet/presentedithomelinkform.do"%>' id="<%=HomeTreeForm.ID_ADD_LINK %>">
            <base:image src="/icons/general/addlink.gif" width="40" height="16"  alt='<%= ResponseUtils.filter(MessageHelper.formatMessage("hometree_AddLink"))%>'/>
        </base:link>
</logic:equal>
        &nbsp;
    </td>
    <td width="100%" class="tdAlignRight" nowrap>
        <base:link page='<%= topPath + "/servlet/presentedithomeheaderform.do"%>' id="<%=HomeTreeForm.ID_EDIT_INTRO %>">
            <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt='<%= ResponseUtils.filter(MessageHelper.formatMessage("hometree_EditIntroductoryText")) %>'/>
        </base:link>
        <base:imageSpacer width="40" height="16"/>
    </td>
</tr>


<%
        List list = form.getList();
        Iterator iter = list.iterator();
        int flipper = 0;
        while (iter.hasNext()) {
            HomeGroupTreeItem item = (HomeGroupTreeItem)iter.next();
                if ( ( flipper & 1 ) == 0 ) {
                    out.println("<tr bgcolor=\"#E8E8E8\" valign=\"top\">");
                }
                else {
                    out.println("<tr valign=\"top\">");
                }
                flipper++;
                if (!(item instanceof HomeGroupTreeLinkItem)) {
%>
            <td class="TableHeading2" colspan="2" width="100%">
                <base:image  src="/icons/general/linksection.gif" align="absbottom" width="25" height="16"/>&nbsp;<%= ResponseUtils.filter(item.getDescription()) %>
            </td>
            <td nowrap class="tdAlignRight" width="100%">
                <base:link page='<%= topPath+"/servlet/presentedithomegroupform.do?groupID=" + item.getId().toString() %>' id="<%=HomeTreeForm.ID_EDIT_GROUP_PREFIX + item.getId().toString()%>">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("hometree_Edit0", ResponseUtils.filter(item.getDescription())) %>'/>
                </base:link>
                <base:link page='<%= topPath+"/servlet/handlehometreeform.do?deleteGroup=true&groupID="+ item.getId().toString() %>' id="<%=HomeTreeForm.ID_DELETE_GROUP_PREFIX + item.getId().toString() %>">
                    <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("hometree_Delete0", ResponseUtils.filter(item.getDescription())) %>'/>
                </base:link>
            </td>

<%
                } else {
                    HomeGroupTreeLinkItem linkItem = (HomeGroupTreeLinkItem) item;
%>
            <td width="100%" class="ColRow" colspan="2">
                <ul><li>
                <a href="<%= linkItem.getUrl() %>" target="_window" ><%= ResponseUtils.filter(linkItem.getDescription()) %></a>
                </li></ul>
            </td>
            <td nowrap class="tdAlignRight" width="100%">
                <base:link page='<%= topPath+"/servlet/presentedithomelinkform.do?linkID=" + linkItem.getId().toString() %>' id="<%=HomeTreeForm.ID_EDIT_LINK_PREFIX + linkItem.getId().toString() %>">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("hometree_Edit0", linkItem.getDescription()) %>'/>
                </base:link>
                <base:link page='<%= topPath+"/servlet/handlehometreeform.do?deleteLink=true&linkID=" + linkItem.getId().toString() %>' id="<%=HomeTreeForm.ID_DELETE_LINK_PREFIX + linkItem.getId().toString() %>">
                    <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("hometree_Delete0", linkItem.getDescription()) %>'/>
                </base:link>
            </td>
<%
                }
%>
        </tr>
<%
        }
%>

<tr>
<td colspan="3" align="center" width="100%">
&nbsp;
<P>
    <base:link page='<%=form.getReturnTo(request)%>' id="<%=HomeTreeForm.ID_CLOSE %>">
    <base:image src="/buttons/large/close.gif" alt='<%=MessageHelper.formatMessage("close")%>' />
    </base:link>
</td>
</tr>

<tr>
<td colspan="3" align="center" width="100%">
<img src="/images/icons/general/line.gif" height="2" width="95%">
</td>
</tr>

<tr>
    <td colspan="3" align="center" width="100%">

        <table id="<%=HomeTreeForm.TABLE_LEGEND %>" border="0" width="100%" cellspacing="0" cellpadding="3" align="center">
        <tr valign="top">
            <td valign="top" class="Instruction" align="center">
                <base:image src="/icons/general/addgroup.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("hometree_AddGroup") %>'/>= <%= MessageHelper.formatMessage("hometree_AddGroup") %></td>
            <td valign="top" class="Instruction" align="center">
                <base:image src="/icons/general/addlink.gif" width="40" height="16"  alt='<%= MessageHelper.formatMessage("hometree_AddLink") %>'/>= <%= MessageHelper.formatMessage("hometree_AddLink") %></td>
            <td valign="top" class="Instruction" align="center">
                <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt='<%= MessageHelper.formatMessage("hometree_Edit") %>'/>= <%= MessageHelper.formatMessage("hometree_Edit") %></td>
            <td valign="top" class="Instruction" align="center">
                <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("hometree_Delete") %>'/>= <%= MessageHelper.formatMessage("hometree_Delete") %></td>
        </tr>
        </table>

    </td>
</tr>


</table>

</td>
</tr>
</base:outlinedTable>
