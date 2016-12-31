<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetEditDisplayableNameForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="fieldDropdown" name="<%= AssetEditDisplayableNameForm.FORM_NAME %>" property="descriptionFields"/>

<base:messageBox strutsErrors="true"/>

<%
    AssetEditDisplayableNameForm form = (AssetEditDisplayableNameForm)request.getAttribute(AssetEditDisplayableNameForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleasseteditdisplayablenameform.do">

<script language="JavaScript" type="text/javascript">
  <!--
    function submitLocalCheckbox() {
            document.<%=AssetEditDisplayableNameForm.FORM_NAME%>.submit();
    }
  // -->
</script>

	<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_INHERITED_FIELD1%>"/>
	<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_INHERITED_FIELD2%>"/>
	<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_INHERITED_FIELD3%>"/>
	<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_INHERITED_FIELD4%>"/>

	<base:outlinedTable id="<%= AssetEditDisplayableNameForm.TABLE_MAIN%>" borderColor="#c0c0c0">
		<tr>
			<td width="100%" valign="top">
				<table id="<%= AssetEditDisplayableNameForm.TABLE_INNER%>" cellpadding="3" width="100%">
					<tr>
						<td class="TableHeading" valign="top" colspan="2">Edit Displayable Name</td>
					</tr>
					<tr>
						<td colspan="2" valign="top">
							<base:imageLine width="100%" height="1" />
						</td>
					</tr>
					<% if (!form.isRootNode() && !form.getIsTextbookAsset()) { %>
						<tr>
							<td class="ColRow tdAlignRight">
								<html:checkbox property="<%= AssetEditDisplayableNameForm.FIELD_INHERITS %>" onclick="submitLocalCheckbox()"/>
							</td>
							<td class="ColRow">
								Inherit Name from &quot;<%=form.getInheritedName() %>&quot;
							</td>
						</tr>
					<% } %>
					<% if (form.isInherits()) { %>
						<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD1%>"/>
						<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD2%>"/>
						<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD3%>"/>
						<html:hidden property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD4%>"/>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 1
							</td>
							<td class="ColRow">
								<%= form.getInheritedComposite1FieldName() %>
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 2
							</td>
							<td class="ColRow">
								<%= form.getInheritedComposite2FieldName() %>
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 3
							</td>
							<td class="ColRow">
								<%= form.getInheritedComposite3FieldName() %>
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 4
							</td>
							<td class="ColRow">
								<%= form.getInheritedComposite4FieldName() %>
							</td>
						</tr>
					<% } else { %>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 1
							</td>
							<td class="ColRow">
	                            <html:select property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD1%>">
	                                <html:options collection="fieldDropdown" property="longID"
	                                              labelProperty="stringDesc"/>
	                            </html:select>
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 2
							</td>
							<td class="ColRow">
	                            <html:select property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD2%>">
	                                <html:options collection="fieldDropdown" property="longID"
	                                              labelProperty="stringDesc"/>
	                            </html:select>
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 3
							</td>
							<td class="ColRow">
	                            <html:select property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD3%>">
	                                <html:options collection="fieldDropdown" property="longID"
	                                              labelProperty="stringDesc"/>
	                            </html:select>
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Field 4
							</td>
							<td class="ColRow">
	                            <html:select property="<%=AssetEditDisplayableNameForm.FIELD_COMPOSITE_FIELD4%>">
	                                <html:options collection="fieldDropdown" property="longID"
	                                              labelProperty="stringDesc"/>
	                            </html:select>
							</td>
						</tr>
					<% } %>
				</table>
			</td>
			<td class="tdAlignRight" valign="top">
				<table id="<%= AssetEditDisplayableNameForm.TABLE_BUTTONS%>">
					<tr>
						<td class="tdAlignRight" valign="top">
							<base:okButton/><p/>
							<base:cancelButton/>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</base:outlinedTable>


</base:form>

