<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetEditDepreciationForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.AssetTemplateSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    AssetEditDepreciationForm form = (AssetEditDepreciationForm)request.getAttribute(AssetEditDepreciationForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleasseteditdepreciationform.do">

<script language="JavaScript" type="text/javascript">
  <!--
    function submitLocalCheckbox() {
            document.<%=AssetEditDepreciationForm.FORM_NAME%>.submit();
    }
  // -->
</script>
	<base:outlinedTable id="<%= AssetEditDepreciationForm.TABLE_MAIN%>" borderColor="#c0c0c0">
		<tr>
			<td width="100%" valign="top">
				<table id="<%= AssetEditDepreciationForm.TABLE_INNER%>" cellpadding="3" width="100%">
					<tr>
						<td class="TableHeading" valign="top" colspan="2"><%= AssetEditDepreciationForm.PAGE_HEADER%></td>
					</tr>
					<tr>
						<td colspan="2" valign="top">
							<base:imageLine width="100%" height="1" />
						</td>
					</tr>
					<% if (!form.isRootNode()) { %>
						<tr>
							<td class="ColRow tdAlignRight">
								<html:checkbox property="<%= AssetEditDepreciationForm.FIELD_INHERITS %>" onclick="submitLocalCheckbox()"/>
							</td>
							<td class="ColRow">
								Inherit Depreciation Information from &quot;<%=form.getInheritedName() %>&quot;
							</td>
						</tr>
					<% } %>
					<% if (form.isInherits()) { %>
						<html:hidden property="<%=AssetEditDepreciationForm.FIELD_DEPRECIABLE_LIFE%>"/>
						<html:hidden property="<%=AssetEditDepreciationForm.FIELD_DEPRECIATION_CONVENTION%>"/>
						<logic:empty  name="<%= AssetEditDepreciationForm.FORM_NAME %>" property="<%=AssetEditDepreciationForm.FIELD_INHERITED_DEPRECIABLE_LIFE %>">
							<tr>
								<td>&nbsp;</td>
								<td class="ColRow">
									- Undefined -
								</td>
							</tr>
						</logic:empty>
						<logic:notEmpty  name="<%= AssetEditDepreciationForm.FORM_NAME %>" property="<%=AssetEditDepreciationForm.FIELD_INHERITED_DEPRECIABLE_LIFE %>">
							<tr>
								<td class="ColRowBold tdAlignRight">
									Depreciable Life
								</td>
								<td class="ColRow">
									<%= form.getInheritedDepreciableLife() %>&nbsp;years
								</td>
							</tr>
							<tr>
								<td class="ColRowBold tdAlignRight">
									Depreciation Convention
								</td>
								<td class="ColRow">
									<%= form.getInheritedDepreciationConventionDescription() %> 
								</td>
							</tr>
						</logic:notEmpty>
					<% } else { %>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Depreciable Life
							</td>
							<td class="ColRow">
	                            <html:text property="<%=AssetEditDepreciationForm.FIELD_DEPRECIABLE_LIFE%>" size="2" maxlength="2"/>&nbsp;years
							</td>
						</tr>
						<tr>
							<td class="ColRowBold tdAlignRight">
								Depreciation Convention
							</td>
							<td class="ColRow">
	                            <html:select property="<%=AssetEditDepreciationForm.FIELD_DEPRECIATION_CONVENTION%>">
									<html:option value='<%="" +AssetTemplateSpecs.DEPRECIATION_CONVENTION_HALF_YEAR%>'>
										<%=AssetTemplateSpecs.DEPRECIATION_CONVENTION_HALF_YEAR_DISPLAYABLE%>
									</html:option>
									<html:option value='<%="" +AssetTemplateSpecs.DEPRECIATION_CONVENTION_MID_MONTH%>'>
										<%=AssetTemplateSpecs.DEPRECIATION_CONVENTION_MID_MONTH_DISPLAYABLE%>
									</html:option>
									<html:option value='<%="" +AssetTemplateSpecs.DEPRECIATION_CONVENTION_MID_QUARTER%>'>
										<%=AssetTemplateSpecs.DEPRECIATION_CONVENTION_MID_QUARTER_DISPLAYABLE%>
									</html:option>
	                            </html:select>
							</td>
						</tr>
					<% } %>
				</table>
			</td>
			<td class="tdAlignRight" valign="top">
				<table id="<%= AssetEditDepreciationForm.TABLE_BUTTONS%>">
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

