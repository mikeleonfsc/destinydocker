<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag" %>

<base:messageBox strutsErrors="true"/>

<%
    EditConsortiumForm form = (EditConsortiumForm) request.getAttribute(EditConsortiumForm.FORM_NAME);
%>

<base:form action="/consortium/servlet/handleeditconsortiumform.do" enctype="multipart/form-data" focus="<%=EditConsortiumForm.FIELD_CONSORTIUM_NAME %>" method="post">
<html:hidden property="currentLogoFileName"/>

<table border="0" cellspacing="0" cellpadding="0" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="<%=EditConsortiumForm.TABLE_CONSORTIUM %>" width="100%">
            <tr>
                <td colspan="2">
                    <table id="nameTable" cellpadding="0" width="100%">
                        <tr>
                            <td valign="bottom" class="FormLabel tdAlignRight">
                                Name &nbsp;
                            </td>
                            <td valign="bottom">
                              <input type="text"
                              value='<%=form.getConsortiumName() == null ? "" : form.getConsortiumName() %>' 
                              name="<%=EditConsortiumForm.FIELD_CONSORTIUM_NAME%>" size="28" maxlength="50" autocomplete="off"/>&nbsp;
                            </td>
                            <td align="center" valign="bottom" class="ColRowBold">
                                <base:saveButton/>
                                &nbsp;
                                <base:cancelButton/>
                            </td>
                        </tr>                
                    </table>
                </td>
            </tr>
            <tr>
                <td colspan="2">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="2" valign="top">
                    <base:imageLine/>
                </td>
            </tr>            
            <tr>
                <td class="FormLabel tdAlignRight">
                    Current Password
                </td>
                <td>
                    <input type="password" name="<%=EditConsortiumForm.FIELD_CURR_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    New Password
                </td>
                <td>
                    <input type="password" name="<%=EditConsortiumForm.FIELD_NEW_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Confirm New Password
                </td>
                <td>
                    <input type="password" name="<%=EditConsortiumForm.FIELD_CONFIRM_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
                <tr>
                    <td valign="top" class="FormLabel tdAlignRight">
                        Welcome Page Image
                    </td>
                    <td>
                        <table id="<%= EditConsortiumForm.TABLE_CONSORTIUM_IMAGE %>" border="0" cellpadding="5" cellspacing="0">
                            <tr>
                                <td align="center" valign="top">
                                
                                   <img name="District Logo" alt="Welcome Page Image" title="Welcome Page Image" src="<bean:write name="<%= EditConsortiumForm.FORM_NAME %>" property="imageURL"/>" width="<%= EditConsortiumForm.LOGO_WIDTH %>" height="<%= EditConsortiumForm.LOGO_HEIGHT %>" border="1">
                                
                                </td>
                                 <td valign="top">
                                <base:helpTag helpFileName="t_add_consortium_welcome_page_image.htm"/>
                               </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td colspan="2">
                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td>
                                    <html:file property="<%= EditConsortiumForm.FIELD_UPLOAD_FILE %>"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <base:genericButton src="/buttons/large/preview2.gif" name="<%= EditConsortiumForm.BUTTON_NAME_PREVIEW %>" alt="Preview"/>
                                    &nbsp;
                                    <base:genericButton src="/buttons/large/clear.gif" name="<%= EditConsortiumForm.BUTTON_NAME_CLEAR %>" alt="Clear"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

        </base:outlinedTable>
    </td>
</tr>
</table>

</base:form>
