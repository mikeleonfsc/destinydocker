<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag" %>

<base:messageBox strutsErrors="true"/>

<base:form action="/consortium/servlet/handleeditconsortiumgroupform.do" focus="<%=EditConsortiumGroupForm.FIELD_GROUPNAME%>" method="post">
<html:hidden property="groupID"/>
<html:hidden property="breadCrumbText"/>
<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="siteTable" width="100%">
        <tr>
            <td class="FormLabel tdAlignRight" nowrap>
                Group Name
            </td>
            <td>
              <html:text property="<%=EditConsortiumGroupForm.FIELD_GROUPNAME%>" size="30" maxlength="50"/>
            </td>
        </tr>

        <tr>
            <td class="FormLabel tdAlignRight" nowrap>
                Sort Order
            </td>
            <td>
                <html:text property="<%=EditConsortiumGroupForm.FIELD_SORTORDER%>" size="5" maxlength="3"/>
            </td>
        </tr>
        </base:outlinedTable>
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="onSave">
            <base:saveButton onclick="hideElementonSave()"/>
            &nbsp;
            <base:cancelButton />
        </base:showHideTag>
    </td>
</tr>
</table>
</base:form>
