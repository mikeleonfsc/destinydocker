<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PickListParamsVO"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PickListSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= MediaPickListForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.circulation.servlet.MediaPickListForm"/>

<base:form action="/circulation/servlet/handlemediapicklistform.do">
    <base:outlinedTable borderColor="#c0c0c0" id="<%=MediaPickListForm.TABLE_OUTLINE%>" width="100%">

    <tr>
        <td class="TableHeading" colspan="2">Create a Pick List for Bookings...</td>
    </tr>
    <tr>
        <td class="Instruction" colspan="2">
		    <img border="0" src="/images/icons/general/line.gif" width="100%" height="1">
		</td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            That need to be picked<br>on or before
        </td>
        <td class="ColRowBold">
			<base:date 
			    buttonName = "<%=MediaPickListForm.BUTTON_DATE %>"
			    fieldName = "<%=MediaPickListForm.FIELD_PICKED_TO%>"
			    dateValue = "<%=form.getPickToDate()%>"
			    altText="<%= MediaPickListForm.ALT_DATE%>"
			/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            To be&nbsp;
         </td>
        <td class="ColRowBold">
             <html:select property="<%=MediaPickListForm.FIELD_DELIVERY_METHOD%>">
                <html:option value='<%="" + HoldSpecs.DELIVERY_METHOD_SHIP_IT %>'><%=HoldSpecs.MEDIA_DELIVERY_TYPE_SHIP_FOR_PICKLIST_DISPLAYABLE %></html:option>
                <html:option value='<%="" + HoldSpecs.DELIVERY_METHOD_PATRON_PICKUP%>'><%=HoldSpecs.MEDIA_DELIVERY_TYPE_PICKUP_FOR_PICKLIST_DISPLAYABLE%></html:option>
             </html:select>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRowBold">
            <html:checkbox property='<%= MediaPickListForm.FIELD_INCLUDE_PREVIOUSLY_UNAVAILABLE%>'>Include 
			previously unavailable items
			</html:checkbox>
		</td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
			<html:radio property="<%= MediaPickListForm.FIELD_CHOOSE_COPIES %>" value="<%= String.valueOf(PickListParamsVO.CHOOSE_COPIES_MANUALLY) %>"/>
		</td>
        <td class="ColRowBold">
        	Let me choose the copies
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
			<html:radio property="<%= MediaPickListForm.FIELD_CHOOSE_COPIES %>" value="<%= String.valueOf(PickListParamsVO.CHOOSE_COPIES_AUTOMATICALLY) %>"/>
		</td>
        <td class="ColRowBold">
        	Choose the copies for me
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            Group by&nbsp;
         </td>
        <td class="ColRowBold">
             <html:select property="<%=MediaPickListForm.FIELD_GROUP_BY%>">
                <html:option value='<%="" + PickListSpecs.GROUP_BY_DONT_GROUP%>'>Don't Group</html:option>
                <html:option value='<%="" + PickListSpecs.GROUP_BY_SITE%>'>Site</html:option>
                <html:option value='<%="" + PickListSpecs.GROUP_BY_ZONE%>'>Zone</html:option>
                <html:option value='<%="" + PickListSpecs.GROUP_BY_ZONE_AND_SITE%>'>Zone / Site</html:option>
             </html:select>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold" align="center" colspan="2">
            <br>
            <base:genericShowHideButton src="/buttons/large/pickcopies.gif" name="<%=MediaPickListForm.BUTTON_PICK_COPIES%>" alt="Pick Copies" elementID="pickCopies"/>
		</td>
    </tr>
    </base:outlinedTable>   
</base:form>

