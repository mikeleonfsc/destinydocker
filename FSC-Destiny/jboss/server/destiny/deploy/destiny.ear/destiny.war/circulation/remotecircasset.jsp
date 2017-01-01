<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<script type="text/javascript">
<!--
    function hideUnlimited() {
        if (document.layers) { //netscape
    		window.document['<%=RemoteCircForm.DIV_UNLIMITED%>'].visibility = 'hide';
    	} else if (document.all) { //ie
    		document.all['<%=RemoteCircForm.DIV_UNLIMITED%>'].style.visibility = 'hidden';
    	} else if (document.getElementById) { //other
    		document.getElementById('<%=RemoteCircForm.DIV_UNLIMITED%>').style.visibility = 'hidden';
    	}
        document.<%=RemoteCircForm.FORM_NAME%>.<%=RemoteCircForm.PARM_UNLIMITED%>.value = "false";
    }
//-->
</script>

<%
SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
RemoteCircForm form = (RemoteCircForm)request.getAttribute(RemoteCircForm.FORM_NAME);
%>
<base:form action="/circulation/servlet/handleremotecircform.do" enctype="multipart/form-data">
<html:hidden property="<%=RemoteCircForm.PARAM_COLLECTION_TYPE%>"/>
<html:hidden property="<%=RemoteCircForm.PARM_UNLIMITED%>"/>


    <base:outlinedTableAndTabsWithinThere id="<%=RemoteCircForm.TABLE_OUTLINE_REMOTE_CIRC%>" borderColor='#C0C0C0' width="100%"
            selectedTab="<%= RemoteCircForm.ID_TAB_ASSETS %>" tabs="<%=form.getTabs() %>">
        <tr valign="top">
            <td>
                <table width="100%" id="<%=RemoteCircForm.TABLE_IMPORT_REMOTE_CIRC%>">
                <tr>
                    <td class="FormLabel" colspan="3">
                        Upload Resource Circulation Information...
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight" nowrap>
                        Date of Transactions
                    </td>
                    <td nowrap colspan="2">
					    <base:date 
					        buttonName = "<%=RemoteCircForm.BUTTON_CALENDAR%>"
					        fieldName = "<%=RemoteCircForm.FIELD_DATE%>"
					        dateValue = "<%=form.getTransactionDate()%>"
					        altText = "Change Date of Transactions"
					    />
                    </td>
                </tr>


                <tr>
                    <td class="FormLabel tdAlignRight"  nowrap>
                        Make Check Outs Due
                    </td>
                    <td nowrap>
					    <base:date 
					        buttonName = "<%=RemoteCircForm.BUTTON_DUE_DATE%>"
					        fieldName = "<%=RemoteCircForm.FIELD_DATE_DUE%>"
					        dateValue = "<%=form.getDateDue()%>"
					        altText = "Change Check Out Due Date"
                            onChange = "hideUnlimited()"
					    />
                     </td>
                     <td class="ColRowBold" width="100%">
                        <div id="<%=RemoteCircForm.DIV_UNLIMITED %>">
                            <logic:equal name="<%= RemoteCircForm.FORM_NAME %>" property="<%= RemoteCircForm.PARM_UNLIMITED %>" value="true">
                                 <font color="#cc0000">
                                    Unlimited                             
                                 </font>
                            </logic:equal>
                            <logic:equal name="<%= RemoteCircForm.FORM_NAME %>" property="<%= RemoteCircForm.PARM_UNLIMITED %>" value="false">
                                    &nbsp;                             
                            </logic:equal>
                        </div>                        
                    </td>
                </tr>

                <tr>
                    <td class="FormLabel tdAlignRight" nowrap>Transaction File</td>
                    <td colspan="2"><html:file property="<%=RemoteCircForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                </tr>

<%
if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_ASSET)) {
%>
                <tr valign="top">
                    <td class="tdAlignRight"><html:checkbox property="<%=RemoteCircForm.FIELD_DISTRICT_TRANSACTIONS%>"></html:checkbox></td>
                    <td colspan="2" class="ColRow">File may contain check out transactions for any patron or location in the district.
                        <base:helpTag helpFileName="d_remotecircform_asset_offsitepatrons.htm"/>
                    </td>
                </tr>
<%
}
%>

                <tr valign="top">
                    <td class="tdAlignRight" valign="top"><html:checkbox property="<%=RemoteCircForm.FIELD_SUMMARY_BRIEF%>"></html:checkbox></td>
                    <td valign="top" colspan="2" class="ColRow">Limit the Job Summary details to errors and warnings (clear this option for a record of every transaction in the file).</td>
                </tr>

                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                        <base:showHideTag id="onUpload">
						<base:genericButton src="/buttons/large/uploadscans.gif" name="<%=RemoteCircForm.BUTTON_IMPORT%>" alt="Upload Transactions" onclick="hideElementonUpload()"/>
                        </base:showHideTag>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
