<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%
    ViewClassListForm form = (ViewClassListForm)request.getAttribute(ViewClassListForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>    

<base:form action="/circulation/servlet/handleviewclasslistform.do">
    <base:outlinedTable id="<%=ViewClassListForm.TABLE_CLASS_LIST%>" borderColor="#c0c0c0" width="95%">
        <tr>
            <td colspan="4" class="tdAlignRight">
                <base:closeButton/>
            </td>
        </tr>
        <tr>
            <td class="SmallColHeading">Name</td>
            <td class="SmallColHeading">Barcode</td>
            <td class="SmallColHeading">Homeroom</td>
            <td class="SmallColHeading">Grade Level</td>
        </tr>
        <logic:iterate indexId="flipper" id="row" name="<%=form.FORM_NAME%>" property="currentAssigned" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
            <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                <% // Display item here %>
                <td class="ColRow"><%= form.buildPatronLink(row, request, response) %></td>
                <base:td clazz="ColRow" filtered="false">
                    <%
                        if (!form.getStore().getSiteID().equals(row.getSitePatronBySiteIDVO(form.getStore().getSiteID(), true).getSiteID())) {
                    %>    
                        <font color="#cc0000">[<%=ResponseUtils.filter(row.getSitePatronBySiteIDVO(form.getStore().getSiteID(), true).getSiteShortName())%>]</font>
                    <%
                        }
                    %>
                    <%=ResponseUtils.filter(row.getSitePatronBySiteIDVO(form.getStore().getSiteID(), true).getPatronBarcode())%>
                </base:td>
                <base:td clazz="ColRow" filtered="true"><%=row.getSitePatronBySiteIDVO(form.getStore().getSiteID(), true).getHomeroom()%></base:td>
                <base:td clazz="ColRow" filtered="true"><%=row.getGradeLevel()%></base:td>
            </tr>
        </logic:iterate>
        <logic:equal property="addFootnote" name="<%=form.FORM_NAME%>" value="true">
        <tr>
            <td class="Instruction" colspan="4" align="center" width="100%">
            <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="Instruction" colspan="4" align="center">
            An off-site patron can only check out textbooks using the "To Patron" tab.
            </td>
        </tr>
        </logic:equal>
    </base:outlinedTable>
</base:form>

