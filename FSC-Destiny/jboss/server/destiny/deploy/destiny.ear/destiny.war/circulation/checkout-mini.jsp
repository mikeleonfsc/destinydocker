<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PatronInfoBean" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<jsp:include page="/circulation/setsound.jsp"/>
<jsp:include page="/circulation/renewallsummary.jsp"/>


<%
    CheckoutForm form = (CheckoutForm)request.getAttribute(CheckoutForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    String focusControl;
    String blockMessages = (String) request.getAttribute("blocklist");

    if ( blockMessages == null ) {
        focusControl = "searchString";
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }
%>

<base:form action="/circulation/servlet/handlecheckoutform.do" focus="<%=focusControl%>">
    <html:hidden property="collectionType"/>
    <html:hidden property="actionOnCopyList"/>
    <html:hidden property="toTeacherMode"/>
    <html:hidden property="toClassMode"/>
    <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="true"/>
    <INPUT type="hidden" name="<%= CheckoutForm.BUTTON_NAME_CHANGE_TEXTBOOK_CLASS%>" value="">


<%
    if ( form.getTransferCopyList() != null ) {
%>
        <base:imageSpacer width="1" height="3"/>
        <center>
        <base:messageBox>
        <base:transferOnScan formName="<%=CheckoutForm.FORM_NAME%>"></base:transferOnScan>
        </base:messageBox>
        </center>
<% } %>        

<%
    if ( blockMessages != null ) {
%>

<jsp:include page="/circulation/trapbarcodescan.jsp"/>

        <span onKeyPress="return trapBarcodeScan(event);">
                <br>
                <base:messageBox>
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                            <html:hidden property="blockMessages"/>
                            <html:hidden property="renewAll"/>
                            <input type="hidden" name="previousBarcode" value='<%=request.getAttribute("previousBarcode")%>'>
                                Transaction blocked:
                                <p align="center">Do you want to complete this transaction?</p>
                                <p align="center"><html:submit property="overrideblocks">Yes</html:submit>&nbsp;<html:submit property="cancelcheckout">No</html:submit></p>
                    </td>
                </tr>
                </base:messageBox>
            <br>
        </span>

<%
    }
%>

<%
    if ( blockMessages == null || !store.canViewAny(CheckoutForm.OVERIDE_PERMS, form.getCollectionType())) {
%>
    <logic:equal name="circulation_servlet_CheckoutForm" property="copyNotFound" value="true" scope="request" >
        <br>
        <base:messageBox>
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                    <html:hidden property="previousBarcode" />
                    <p align="center">Copy "<bean:write name="circulation_servlet_CheckoutForm" property="previousBarcodeDisplayable"/>" is not cataloged.</p>
            </td>
        </tr>
        </base:messageBox>
    <br>
    </logic:equal>
<%
        if (form.getComponentList() != null && !form.getComponentList().isEmpty()) {
%>
            <br>
            <base:messageBox>
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                        <p align="center">Components included.</p>
                </td>
            </tr>
            </base:messageBox>
            <br>
        <% } %>
    <% } %>
    <%
    if ( blockMessages == null || !store.canViewAny(CheckoutForm.OVERIDE_PERMS, form.getCollectionType())) {
    %>
        <base:circFindBoxMini
			searchString="<%=form.getSearchString()%>"
			findBoxLabel="<%=form.getFindBoxLabel()%>"
			renderTeacherButton="<%=form.isRenderFindTeacherButton()%>"
			renderGoButton="<%=form.isRenderGoButton()%>"
			renderPatronButton="<%=form.isRenderFindPatronButton()%>"
			renderStudentButton="<%=form.isRenderFindStudentButton()%>"
			renderCopyButton="true"
			collectionType="<%=form.getCollectionType()%>"
        />
    <%
    } else {
    %>
    <html:hidden property="searchString" />
    <%
    }
    
if (request.getAttribute("patronlist") != null) {
    %>
        <tr><td>    
            <jsp:include page="/circulation/patronlist.jsp">
                <jsp:param name="formName" value="<%= CheckoutForm.FORM_NAME %>"/>
                <jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
            </jsp:include>
            <br>
        </td></tr>  

<% } else {%>  
<html:hidden property="copyInCrumb" />
<%
    /** @todo Refactor if nessary */
    boolean isTeacherMode = ( form != null ) ? form.isToTeacherMode() : false;
    boolean isClassMode = ( form != null ) ? form.isToClassMode() : false;
    boolean teacherMode = (isTeacherMode || isClassMode);

    PatronInfoBean pib = (PatronInfoBean)request.getAttribute("patronInfoBean");
    PatronInfoBean tib = (PatronInfoBean)request.getAttribute(CheckoutForm.PARAM_TEXTBOOK_TEACHER);
    if ( teacherMode ) {
%>
        <bean:define id="textbookClassesID" name="<%=CheckoutForm.FORM_NAME%>" property="textbookClasses"/>
<% } %>
    
    
<%
    //miniDestiny doesnt allow circulation accross the district 
    if ((pib!=null && !pib.isVisitor()) || (tib != null && !tib.isVisitor())) { %>
            <table cellSpacing="1" cellPadding="0" width="95%" border="0">
                <tr>
                    <td valign="top" width="100%">
                       <table width="100%">
                          <tr>
                             <td><img src="/images/icons/general/line.gif" height="1" width="100%"></td>
                          </tr>
                       </table>
<%

        if (!teacherMode) {
%>
            <base:circPatronInfoMini pib="<%=pib%>" collectionType="<%=form.getCollectionType()%>" teacherMode="false" selectedClassID="<%=new Long(0)%>"/>
<%
        } else {
            if (isClassMode) {
                if ( tib == null || tib.getPatronID() == null ) {
%>
                       <table width="100%" id="<%=CircPatronInfoMiniTag.TABLE_TEACHER_INFO_HEADER%>">
                          <tr><td class="TableHeading2">Teacher?</td></tr>
                       </table>
<%
                } else {
%>
                    <base:circPatronInfoMini pib="<%=tib%>" collectionType="<%=form.getCollectionType()%>" teacherMode="true" selectedClassID="<%=form.getTextbookClassSectionID()%>"/>
<%
                }
            } else {
%>
                <base:circPatronInfoMini pib="<%=pib%>" collectionType="<%=form.getCollectionType()%>" teacherMode="true" selectedClassID="<%=form.getTextbookClassSectionID()%>"/>
<%          }

            if (isClassMode) { %>
                       <table width="100%">
                          <tr>
                             <td><img src="/images/icons/general/line.gif" height="2" width="100%"></td>
                          </tr>
                       </table>
<%
                if ( pib == null || pib.getPatronID() == null ) {
%>
                       <table width="100%" id="<%=CircPatronInfoMiniTag.TABLE_PATRON_INFO_HEADER%>">
                          <tr><td class="TableHeading2">Student?</td></tr>
                       </table>
<%
                }
                else {
%>
                      <base:circPatronInfoMini pib="<%=pib%>" collectionType="<%=form.getCollectionType()%>" teacherMode="false" selectedClassID="<%=new Long(0)%>"/>
<%
                }
            }
        }

        //************** This is code that applies to all screens ***************
        CopyInfoBean cib = (CopyInfoBean)request.getAttribute("copyInfoBean");
        if (cib!=null) {
%>
                <base:copyInfoMini cib="<%=cib%>" displayMode="<%=CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_CHECK_OUT%>"/>
<%      } %>         

                    </td>
                 </tr>
              </table>
<%
    }   // end of null patron info bean or teacher info bean (i.e. current patron)
    // end of !isVisitor patch for the offsite patron or teacher
%>

<!--  CHANGE AFTER FINISHED DEBUGGING -->
<% } %>
</base:form>
<logic:present name="circulation_servlet_CheckoutForm" property="soundFile" scope="request" >

<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CheckoutForm" property="soundFile"/>");
//-->
 </script>
</logic:present>
