<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ZSourceSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true"/>

<%
    ZSourceAEForm form = (ZSourceAEForm)request.getAttribute( ZSourceAEForm.FORM_NAME);
%>

<%
    String testResult = form.getTestResult();
    if (!StringHelper.isEmpty(testResult)) {
%>
<base:outlinedTable id="<%=ZSourceAEForm.TABLE_TEST_MESSAGE%>">
    <tr>
        <td align="center" class="ColRow"><%=testResult%></td>
    </tr>
</base:outlinedTable>
<%
    }
%>

<base:form action="/cataloging/servlet/handlezsourceaeform.do" focus="<%=ZSourceAEForm.FIELD_SOURCE_NAME%>">
<html:hidden property="<%=ZSourceAEForm.FIELD_SOURCEID%>"/>
<base:outlinedTable id="<%= ZSourceAEForm.TABLE_EDIT %>" borderColor="#C0C0C0">
    <tr>
        <td valign="top" colspan="2"><span class="TableHeading2"><%=form.getActionDescription()%></span><br><span class="Instruction">* = <%=MessageHelper.formatMessage("zsourceae_RequiredField") %></span></td>
        <td valign="top" class="ColRowBold tdAlignRight" rowspan="2">
            <base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()" name="<%=ZSourceAEForm.BUTTON_SAVE%>"/><br><base:cancelButton name="<%=ZSourceAEForm.BUTTON_CANCEL%>"/>
            </base:showHideTag>
        </td>
    </tr>
    <tr>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap><span class="FormLabel">*</span> <%=MessageHelper.formatMessage("zsourceae_UserdefinedSourceName") %></td>
        <td valign="top"><html:text property="<%=ZSourceAEForm.FIELD_SOURCE_NAME%>" size="10" maxlength="<%=String.valueOf(ZSourceSpecs.MAX_SOURCE_LENGTH)%>"/></td>
    </tr>
    <tr>
        <td valign="top" class="tdAlignRight" nowrap colspan="3"><base:imageLine height="2" width="100%" vspace="1"/></td>
    </tr>
    <tr>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap><span class="FormLabel">*</span> <%=MessageHelper.formatMessage("zsourceae_DomainNameOrIpAddress") %></td>
        <td valign="top"><html:text property="<%=ZSourceAEForm.FIELD_HOST_NAME%>" size="30" maxlength="<%=String.valueOf(ZSourceSpecs.MAX_HOST_LENGTH)%>"/></td>
        <td valign="top" class="ColRowBold tdAlignRight" rowspan="2">
            <base:showHideTag id="onTest">
                <base:genericButton src="/buttons/large/testzsource.gif" onclick="hideElementonTest()" name="<%=ZSourceAEForm.BUTTON_TEST%>" alt='<%=MessageHelper.formatMessage("zsourceae_TestZsource") %>'/>
            </base:showHideTag>
        </td>
    </tr>
    <tr>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap><span class="FormLabel">*</span> <%=MessageHelper.formatMessage("zsourceae_PortNumber") %></td>
        <td valign="top"><html:text property="<%=ZSourceAEForm.FIELD_PORT%>" size="10" maxlength="10"/></td>
    </tr>
    <tr>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("zsourceae_DatabaseName") %></td>
        <td valign="top"><html:text property="<%=ZSourceAEForm.FIELD_DATABASE_NAME%>" size="30" maxlength="<%=String.valueOf(ZSourceSpecs.MAX_DATABASE_LENGTH)%>"/></td>
        <td valign="top" class="tdAlignRight">&nbsp;</td>
    </tr>
    <tr>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("zsourceae_Username") %></td>
        <td valign="top"><html:text property="<%=ZSourceAEForm.FIELD_USER_NAME%>" size="30" maxlength="<%=String.valueOf(ZSourceSpecs.MAX_USER_LENGTH)%>"/></td>
        <td valign="top" class="tdAlignRight">&nbsp;</td>
    </tr>
    <tr>
        <td valign="top" class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("zsourceae_Password") %></td>
        <td valign="top"><html:text property="<%=ZSourceAEForm.FIELD_PASSWORD%>" size="30" maxlength="<%=String.valueOf(ZSourceSpecs.MAX_PASSWORD_LENGTH)%>"/></td>
        <td valign="top" class="tdAlignRight">&nbsp;</td>
    </tr>
</base:outlinedTable>
</base:form>
