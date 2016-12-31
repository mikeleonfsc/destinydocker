<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<jsp:include page="/circulation/setsound.jsp" />

<%
	CustomCircSoundsForm form = (CustomCircSoundsForm)request.getAttribute(CustomCircSoundsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecustomcircsoundsform.do" enctype="multipart/form-data">


<html:hidden property="<%=CustomCircSoundsForm.PARAM_UPLOADED_SOUND_PRESENT %>"/>
<html:hidden property="<%=CustomCircSoundsForm.PARAM_SOUND_TYPE %>"/>
<base:outlinedTable id="<%=CustomCircSoundsForm.TABLE_CUSTOM_SOUNDS%>" borderColor="#C0C0C0" width="95%">
    <tr>
        <td valign="top">
            <table cellpadding="3" cellspacing="6" >
                <tr>
                    <td class="TableHeading" colSpan="3">
                        <%= form.getTableHeading() %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("customcircsounds_CurrentSound") %></td>
                    <td colspan="2" valign="top">
                        <base:genericButton 
                            name="<%=CustomCircSoundsForm.BUTTON_PLAY_CURRENT%>" 
                            src="/buttons/small/play.gif" 
                            alt='<%= MessageHelper.formatMessage("play") %>' absbottom="true"
                        />
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("customcircsounds_NewSound") %></td>
                    <td class="ColRow" valign="top">
                        <html:file property="<%=CustomCircSoundsForm.FIELD_UPLOAD_FILE%>" size="30"/>&nbsp;
                        <c:if test="<%=form.isUploadedSoundPresent()%>">
                            <br><br><%= MessageHelper.formatMessage("customcircsounds_UploadedSound") %>&nbsp;<base:genericButton name="<%=CustomCircSoundsForm.BUTTON_PLAY_UPLOAD%>" src="/buttons/small/play.gif" alt='<%= MessageHelper.formatMessage("play") %>' absbottom="true"/>
                        </c:if>
                    </td>
                    <td valign="top" class="ColRow">
                        <base:showHideTag id="OnUpload"><base:genericButton name="<%=CustomCircSoundsForm.BUTTON_UPLOAD%>" src="/buttons/large/uploadsound.gif" alt='<%= MessageHelper.formatMessage("customcircsounds_UploadNewSound") %>' absbottom="true" onclick="hideElementOnUpload()"/></base:showHideTag>
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top" class="tdAlignRight">
            <table>
                <tr>
                    <td class="ColRow tdAlignRight" nowrap>
                        <base:showHideTag id="OnSave"><base:saveButton onclick="hideElementOnSave()"/></base:showHideTag>
                    </td>
                </tr>
                <c:if test="<%=form.isDisplayRestore() %>">
                    <tr>
                        <td class="tdAlignRight">
                            <base:showHideTag id="OnRestore">
                                <base:genericButton 
                                    name="<%=CustomCircSoundsForm.BUTTON_RESTORE%>" 
                                    src="/buttons/large/restore.gif" 
                                    alt='<%= MessageHelper.formatMessage("restore") %>' onclick="hideElementOnRestore()" 
                                />
                            </base:showHideTag>
                        </td>
                    </tr>
                </c:if>
                <tr>
                    <td class="tdAlignRight">
                        <base:showHideTag id="OnCancel">
                            <base:cancelButton onclick="hideElementOnCancel()"/>
                        </base:showHideTag>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTable>

<c:if test="<%=form.getSoundFile() != null%>">
    <script language="JavaScript">
    <!--
        setSound("<%=form.getSoundFile()%>");
    //-->
     </script>
</c:if>
</base:form>
