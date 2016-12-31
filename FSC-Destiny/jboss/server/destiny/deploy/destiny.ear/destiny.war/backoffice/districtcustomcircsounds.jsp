<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %> 

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<jsp:include page="/circulation/setsound.jsp" />

<%
    DistrictCustomCircSoundsForm form = (DistrictCustomCircSoundsForm)request.getAttribute(DistrictCustomCircSoundsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handledistrictcustomcircsoundsform.do" enctype="multipart/form-data">
<center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />

<html:hidden property="<%=DistrictCustomCircSoundsForm.PARAM_UPLOADED_SOUND_PRESENT %>"/>
<html:hidden property="<%=DistrictCustomCircSoundsForm.PARAM_SOUND_TYPE %>"/>
<base:outlinedTable id="<%=DistrictCustomCircSoundsForm.TABLE_CUSTOM_SOUNDS%>" borderColor="#C0C0C0" width="95%" align="center">
    <tr>
        <td valign="top">
            <table cellpadding="3" cellspacing="6" >
                <tr>
                    <td class="TableHeading" colSpan="3">
                        <%= form.getTableHeading() %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">
                        Current Sound
                    </td>
                    <td colspan="2" valign="top">
                        <base:genericButton 
                            name="<%=DistrictCustomCircSoundsForm.BUTTON_PLAY_CURRENT%>" 
                            src="/buttons/small/play.gif" 
                            alt="Play Current Sound" absbottom="true"
                        />
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" vAlign="top">
                        New Sound
                    </td>
                    <td class="ColRow" valign="top">
                        <html:file property="<%=DistrictCustomCircSoundsForm.FIELD_UPLOAD_FILE%>" size="30"/>&nbsp;
                        <c:if test="<%=form.isUploadedSoundPresent()%>">
                            <br><br>Uploaded Sound&nbsp;<base:genericButton name="<%=DistrictCustomCircSoundsForm.BUTTON_PLAY_UPLOAD%>" src="/buttons/small/play.gif" alt="Play Uploaded Sound" absbottom="true"/>
                        </c:if>
                    </td>
                    <td valign="top" class="ColRow">
                        <base:showHideTag id="OnUpload"><base:genericButton name="<%=DistrictCustomCircSoundsForm.BUTTON_UPLOAD%>" src="/buttons/large/uploadsound.gif" alt="Upload New Sound" absbottom="true" onclick="hideElementOnUpload()"/></base:showHideTag>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
     <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
     </tr>
    <tr>
        <td class="ColRow" align="center">
            These settings will only be applied to new sites.
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRow">
            <base:showHideTag id="OnSave">
                <base:saveButton onclick="hideElementOnSave"/>
               <c:if test="<%=form.isDisplayRestore() %>">
                     <base:genericButton 
                        name="<%=DistrictCustomCircSoundsForm.BUTTON_RESTORE%>" 
                        src="/buttons/large/restore.gif" 
                        alt="Restore Default Sound" onclick="hideElementOnSave()" />
                </c:if>
                <base:cancelButton onclick="hideElementOnSave()"/>
            </base:showHideTag>
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
