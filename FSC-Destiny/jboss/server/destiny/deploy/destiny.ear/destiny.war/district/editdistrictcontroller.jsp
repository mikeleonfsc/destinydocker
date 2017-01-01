<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>

<c:set var="cForm" value="<%=request.getAttribute(EditDistrictForm.FORM_NAME)%>"/>
<base:messageBox strutsErrors="true"/>

    <base:form action="/district/servlet/handleeditdistrictform.do" focus="<%= EditDistrictForm.SITE_OR_DISTRICT_NAME %>" method="post">

        <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=EditDistrictForm.BUTTON_TRAP_ENTER%>">

        <html:hidden property="breadcrumbText" />
        <html:hidden property="logoFileName" />
        <html:hidden property="imageFileName" />
        <html:hidden property="saveWPEValue" />
        <html:hidden property="prevCustomerNumber" />

    <table border="0" cellspacing="0" cellpadding="3" align="center">
    <tr>
        <td>
        <jsp:include page="/district/editdistrict.jsp" flush="true"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <base:showHideTag id="onSave">
                <c:choose>
                    <c:when test="${cForm.distributedAdd}">
                        <base:genericButton src="/buttons/large/next.gif" onclick="hideElementTop()" name="<%=EditDistrictForm.BUTTON_NEXT %>" alt="Next" />
                    </c:when>
                    <c:otherwise>
                        <base:saveButton onclick="hideElementTop()"/>
                    </c:otherwise>
                </c:choose>
                    &nbsp;<base:cancelButton/>
            </base:showHideTag>
        </td>
    </tr>
    </table>

    </base:form>
