
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PatronInfoBean" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<jsp:include page="/circulation/setsound.jsp"/>

<base:messageBox strutsErrors="true"/>

<%
    BookNowForm form = (BookNowForm)request.getAttribute( BookNowForm.FORM_NAME );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    PatronInfoBean pib = BaseCircForm.createPatronInfoBean(store, store.getCurrentPatronID());
    request.setAttribute("patronInfoBean", pib);

%>

<script language="JavaScript">
<!--
    window.focus();
    function submitCalendar(month, day, year)
    {
        //If the day is NULL, then submit the form with no day. This will
        //tell the servlet to advance/goback another month
        if (day != -1) {
            document.<%=BookNowForm.FORM_NAME%>.<%=BookNowForm.PARAM_DAY%>.value = day;
        }

        //Set the other params based on what was passed
        document.<%=BookNowForm.FORM_NAME%>.<%=BookNowForm.PARAM_MONTH%>.value = month;
        document.<%=BookNowForm.FORM_NAME%>.<%=BookNowForm.PARAM_YEAR%>.value  = year;

        //Submit the form - NOTE no name of the action.
        document.<%=BookNowForm.FORM_NAME%>.<%=BookNowForm.FIELD_SUBMIT_TYPE%>.value = "<%=BookNowForm.SUBMIT_TYPE_CALENDAR%>";
        document.<%=BookNowForm.FORM_NAME%>.submit();
    }

    function setAutoBookChanged() {
        //alert('Autobook changed');
    	document.<%=BookNowForm.FORM_NAME%>.<%=BookNowForm.FIELD_AUTOBOOK_CHANGED%>.value = "true";
        document.<%=BookNowForm.FORM_NAME%>.submit();
    }
    
//-->
</script>


<base:form action="/circulation/servlet/handlebooknowform.do" focus="<%=form.getFocus()%>">
    
    <html:hidden property="<%=BookNowForm.PARAM_COPYID%>"/>
    <html:hidden property="<%=BookNowForm.PARAM_COPYBIBID%>"/>
    <input type="hidden" name="<%=BookNowForm.PARAM_MONTH%>" value="">
    <input type="hidden" name="<%=BookNowForm.PARAM_DAY%>" value="">
    <input type="hidden" name="<%=BookNowForm.PARAM_YEAR%>" value="">
    <html:hidden property="<%=BookNowForm.FIELD_SUBMIT_TYPE %>"/>
    <html:hidden property="<%=BookNowForm.FIELD_LAST_SEARCH_STRING %>"/>
    <html:hidden property="<%=BookNowForm.FIELD_AUTOBOOK_CHANGED %>" value="false"/>
    
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BookNowForm.BUTTON_TRAP_ENTER%>">
    
    <% if ( !StringHelper.isEmpty(form.getBlockMessages())) {%>
            <jsp:include page="/circulation/trapbarcodescan.jsp" />
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <bean:write name="<%= BookNowForm.FORM_NAME %>" property="blockedCopy"/> Transaction blocked:
                <%= form.getBlockMessages()%>
                <html:hidden property="<%=BasePatronListForm.PARAM_BOOKING_CHECKOUT_BARCODE%>"/>
                <p align="center">Do you want to complete this transaction?</p>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center" colspan="2">
                <base:showHideTag id="onBlock">
                <html:hidden property="<%=BookNowForm.PARAMS_OVERRIDE_BLOCK_LEVEL%>"/>
                <html:submit property="<%=BookNowForm.BUTTON_OVERRIDE_YES%>"  onclick="hideElementonBlock()">Yes</html:submit>&nbsp;<html:submit property="<%=BookNowForm.BUTTON_OVERRIDE_NO%>">No</html:submit>
                </base:showHideTag>
            </td>
        </tr>
        </base:messageBox>
    <br>
    <% } %>
    
    <table width="95%" id="<%=BookNowForm.TABLE_HEADER%>">
      <tr>
            <td>
                <table id="<%=BookNowForm.TABLE_SEARCH_ME%>" border="0" cellspacing="10" cellpadding="0" width="100%">
                    <tr>
                        <td class="FormLabel">
                            Find Copy
                         &nbsp;
                            <html:text size="30" property="<%=BookNowForm.FIELD_SEARCH_STRING%>" />
                           &nbsp;
                            <base:goButton/>
                        </td>
                         <td class="tdAlignRight">
                                <base:cancelButton/>
                         </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold" align="left">
                           &nbsp;&nbsp;&nbsp;
                            <html:checkbox property="<%=BookNowForm.FIELD_CHECKBOX_AUTOBOOK%>" onclick="setAutoBookChanged()"/>
                            Accept "Book to" date if there are no issues                         
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

	<!-- Show found titles or copies after a search -->
    <logic:equal name="circulation_servlet_BookNowForm" property="<%=BookNowForm.PARAMS_FOUND_TITLES%>" value="true" scope="request">
        <img src="/images/icons/general/line.gif" height="2" width="95%">
         <table width="95%">
         	<logic:notPresent name="<%= BookNowForm.FORM_NAME %>" property="bibID">
			<jsp:include page="/common/titlelist.jsp">
				<jsp:param name="formName" value="circulation_servlet_BookNowForm"/>
			</jsp:include>
			</logic:notPresent>
        </table>
        <br>
	</logic:equal>

	<!-- Show found copies after a search -->
    <logic:equal name="circulation_servlet_BookNowForm" property="<%=BookNowForm.PARAMS_FOUND_COPIES%>" value="true" scope="request">
        <img src="/images/icons/general/line.gif" height="2" width="95%">
        <table table id="<%=BookNowForm.TABLE_SEARCH_RESULTS%>" width="95%" cellspacing="0" cellpadding="4">
    	  <base:copyChooser formName="circulation_servlet_BookNowForm" property="list" baseUrl="<%=form.getCopyChooserBaseLink()%>" />
        </table>
        <br>
	</logic:equal>
	

    <!--  begin main table -->
    <base:outlinedTable width="95%" borderColor="#c0c0c0">
	<tr><td>
	
	<!-- Display the patron info box -->
    <jsp:include page="/circulation/circinfo.jsp" flush="true">
    	<jsp:param name="hideBorderTable" value="true"/>
        <jsp:param name="useAbbreviatedView" value="true"/>
    </jsp:include>

    <!-- end of included file -->
    <% if(form.getCopyID() != null) { %>
        <table id="<%=BookNowForm.TABLE_COPY_SECTION %>" width="100%">
            <tr>
                <base:sectionHeading  printerFriendly="false"  heading="Booking" tdContent="width='100%' colspan='2' valign='top'" />
            </tr>
            <tr>
               <td valign="top" width="100%">
                  <table id="<%=BookNowForm.TABLE_BIB_INFO %>">
                    <tr> 
                        <td>
                          <bean:write property="bibMaterialTypeImgTag" name="<%=BookNowForm.FORM_NAME%>" filter="false"/>
                        </td>
                        <td class="TableHeading">
                          <%=ResponseUtils.filter(form.getTitle())%>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow"> <!-- bib author-->
                          <%=ResponseUtils.filter(form.getAuthor())%>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap><span class="ColRowBold">Book from
                            <font color="#cc0000"><bean:write name="circulation_servlet_BookNowForm" property="displayableFromDate"/></font>
                            to </span>
                            <html:text property="<%=BookNowForm.FIELD_BOOK_TO_DATE%>" size="9" maxlength="10"/>
                            &nbsp;
                            <base:genericButton absbottom="true" src="/buttons/large/ok.gif" name="<%= BookNowForm.BUTTON_OK %>" alt="OK"/>
                        </td>                      
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow tdAlignRight"><%=form.buildMaxLoanPeriodString()%>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                      <td class="ColRow">
                        <base:spanIfAllowed permission="<%=Permission.CIRC_OVERRIDE_MEDIA_POLICIES%>">
                            <html:checkbox property="<%=BookNowForm.FIELD_OVERRIDE_MEDIA_POLICY%>"/>Override media policy
                        </base:spanIfAllowed>
                      </td>
                    </tr>
                                        
                  </table>
               </td>
              <base:bookingCalendar formName="<%= BookNowForm.FORM_NAME %>" patronID="<%= store.getCurrentPatronID() %>"/>
              <!-- booking calendar ends the table.  -->
              </td>
           </tr>
        </table>
    <% }  %>

	<!-- Display buttons -->
    <% if (form.hasBookedItems()) { %>
    <table width="100%">
        <tr valign="top">
            <td>
                <table id="<%=BookNowForm.TABLE_HOLD_BOX_TITLE%>" cellpadding="2" cellspacing="2" width="100%">
                    <tr>
                        <!-- box header and special information -->
                        <base:sectionHeading  printerFriendly="false"  heading="Booked" tdContent="width='100%' valign='top'" />
                        <td class="ColRow tdAlignRight" nowrap="nowrap">
                        <base:genericButton src="/buttons/small/labelsforpickup.gif" name="<%=BookNowForm.BUTTON_LABELS_FOR_PICKUP %>" alt="<%=BookNowForm.ALT_LABELS_FOR_PICKUP%>"/>
                        <base:genericButton src="/buttons/small/packinglistlabels.gif" name="<%=BookNowForm.BUTTON_PACKINGLIST_AND_LABELS %>" alt="<%=BookNowForm.ALT_PACKINGLIST_AND_LABELS%>"/>
                        </td>
                    </tr>

                </table>
            </td>
        </tr>
        <tr>
            <td width="100%">
                <table id="<%=BookNowForm.TABLE_BOOK_DETAIL%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                    <tr>
                        <td>
                        <base:circMediaItemsOut formName="<%=BookNowForm.FORM_NAME%>"/>
                        </td>
                        
                    </tr>   
                </table>

               <!-- end box body -->
            </td>
        </tr>
        <tr valign="top">
            <td class="ColRow tdAlignRight">
                <base:genericButton src="/buttons/small/labelsforpickup.gif" name="<%=BookNowForm.BUTTON_LABELS_FOR_PICKUP %>" alt="<%=BookNowForm.ALT_LABELS_FOR_PICKUP%>"/>
                <base:genericButton src="/buttons/small/packinglistlabels.gif" name="<%=BookNowForm.BUTTON_PACKINGLIST_AND_LABELS %>" alt="<%=BookNowForm.ALT_PACKINGLIST_AND_LABELS%>"/>
            </td>
        </tr>      
        
    </table>
	<% } %>
    
	</td></tr>
	</base:outlinedTable>
	
</base:form>

<logic:present name="<%= BookNowForm.FORM_NAME %>" property="soundFile" scope="request" >
	<script language="JavaScript">
    
		<!--
        setSound("<bean:write name="<%=BookNowForm.FORM_NAME%>" property="soundFile"/>");
		//-->
	 </script>
</logic:present>
