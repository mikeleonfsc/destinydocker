<%--
     circinfo.jsp

    Parameters:
        'printable' -- if true, will eliminate things that should not be output
            on a printed sheet of paper (e.x. links)
        'disableLinkFines' -- if true, will disable the 'Fines' link
        'patronPictReturnURL' is required - it is the calling servlets responsibility
            to set the displayPatronPicture value in the Session Store based on the URL
            value passed back if the Hide/show link is selected under the patron picture.

    ex:
        <jsp:include page="/circulation/circinfo.jsp" flush="true">
            <jsp:param name="disableLinkFines" value="true"/>
        </jsp:include>

--%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    // form can be null if this module was not included by the checkout form
    CheckoutForm form = (CheckoutForm)request.getAttribute(CheckoutForm.FORM_NAME);
    String formName = CheckoutForm.FORM_NAME;
    if ( form == null ) {
        form = (RenewForm)request.getAttribute(RenewForm.FORM_NAME);
        if ( form != null ) {
            formName = RenewForm.FORM_NAME;
        }
    }

    boolean showPrintReceipt = (form != null ); 
    boolean isTeacherMode = ( form != null ) ? form.isToTeacherMode() : false;
    boolean isClassMode = ( form != null ) ? form.isToClassMode() : false;
    boolean teacherMode = (isTeacherMode || isClassMode);

    PatronInfoBean pib = (PatronInfoBean)request.getAttribute("patronInfoBean");
    PatronInfoBean tib = (PatronInfoBean)request.getAttribute(CheckoutForm.PARAM_TEXTBOOK_TEACHER);
    if ( teacherMode ) {
%>
        
<%@page import="com.follett.fsc.common.StringHelper"%>

<bean:define id="textbookClassesID" name="<%=formName%>" property="textbookClasses"/>
<%
    }
%>

<%
    if (pib != null || tib != null) {
        if (!"true".equals(request.getParameter("hideBorderTable"))){
%>
            <table cellSpacing="1" cellPadding="0" width="95%" bgColor="#c0c0c0" border="0">
                <tr>
                    <td valign="top" width="100%" bgColor="#ffffff">
<%
        } else {
            if (request.getParameter("textbookMode") != null) {
%>
            <table width="100%">
                <tr><td>
                    <img src="/images/icons/general/line.gif" height="2" width="100%">
                </td></tr>
            </table>
<%
            }
        }

        if (!teacherMode) {
        	int collectionType = BibMasterSpecs.COLLECTION_TYPE_LIBRARY;
        	if ( form != null ) {
        		collectionType = form.getCollectionType();
        	}
            String siteName = request.getParameter("offSiteFineName");
            if (siteName == null) {
                siteName = "";
            }
%>
            <base:circPatronInfo formName="<%=formName%>" infoBean="<%=pib%>" showPrintReceipt="<%=showPrintReceipt%>" 
            	collectionType="<%=collectionType%>"
                abbreviatedView='<%="true".equals(request.getParameter(BaseCircPatronInfoTag.PARAM_USE_ABBREVIATED_VIEW))%>'
                addEditFineView='<%="true".equals(request.getParameter(BaseCircPatronInfoTag.PARAM_ADD_OR_EDIT_FINE_VIEW))%>'
                offSiteFineSiteName="<%= siteName %>"
                />
<%                
        } else {
            if (isClassMode) {
                if ( tib == null || tib.getPatronID() == null ) {
%>
                    <table width="100%" id="<%=CircTeacherInfoTag.TABLE_TEACHER_BOX%>">
                        <tr><td class="TableHeading"><%= MessageHelper.formatMessage("circinfo_Teacher") %></td></tr>
                    </table>
<%
                } else {
%>
                    <base:circTeacherInfo formName="<%=formName%>" infoBean="<%=tib%>"/>
<%
                }
            } else {
%>
                <base:circTeacherInfo formName="<%=formName%>" infoBean="<%=pib%>"/>
<%
           }


            if (isClassMode) {
%>
            <table width="100%">
                    <tr><td>
                        <img src="/images/icons/general/line.gif" height="2" width="100%">
                    </td></tr>
                </table>
<%
                if ( pib == null || pib.getPatronID() == null ) {
%>
                    <table width="100%" id="<%=CircPatronInfoTag.TABLE_PATRON_BOX_HEADER%>">
                        <tr><td class="TableHeading"><%= MessageHelper.formatMessage("circinfo_Student") %></td></tr>
                    </table>
<%
                }
                else {
                      String siteName = request.getParameter("offSiteFineName");
                      if (siteName == null) {
                          siteName = "";
                      }
%>
                      <base:circPatronInfo formName="<%=formName%>" infoBean="<%=pib%>" showPrintReceipt="<%=showPrintReceipt%>" 
                      collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>"
                      addEditFineView='<%="true".equals(request.getParameter(BaseCircPatronInfoTag.PARAM_ADD_OR_EDIT_FINE_VIEW))%>'
                      offSiteFineSiteName="<%= siteName %>"      
                      />

<%                }
            }
        }
    

        //************** This is code that applies to all screens ***************
        if (request.getParameter("showItemsOut") != null) {
%>
                <base:circCheckedOut formName="<%=formName%>"/>
                <base:circItemsOut formName="<%=formName%>"/>
<%
        } // end show items out table if param exists

        if (!"true".equals(request.getParameter("hideBorderTable"))) {
%>
        </td>
    </tr>
</table> <!-- end border table -->
<%
        }
    }   // end of null patron info bean or teacher info bean (i.e. current patron)
%>
