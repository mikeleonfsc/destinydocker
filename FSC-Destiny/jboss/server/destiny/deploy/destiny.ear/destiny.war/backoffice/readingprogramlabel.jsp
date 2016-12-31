<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ReadingProgramLabelForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>

<%@page import="com.follett.fsc.destiny.util.printing.PaperStockFactory"%>

<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>


<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.CopyLabelJobParams"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams.SortBy"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams.BasedOn"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams.ReadingProgram"%>

<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams.ReadingProgram"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams.ReadingProgram"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams.ReadingProgram"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%><base:messageBox strutsErrors="true"/>

<%
    ReadingProgramLabelForm form = (ReadingProgramLabelForm)request.getAttribute("backoffice_servlet_ReadingProgramLabelForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<c:set var="form" value="<%= form %>" />

<base:form action="/backoffice/servlet/handlereadingprogramlabelform.do" enctype="multipart/form-data">

<script language="JavaScript" type="text/javascript">
  <!--
    function submitReadingProgramChanged() { 
        document.<%=ReadingProgramLabelForm.FORM_NAME%>.<%=ReadingProgramLabelForm.PARAM_READING_PROGRAM_CHANGED%>.value = true;           
        document.<%=ReadingProgramLabelForm.FORM_NAME%>.submit();
    }
  // -->
</script>
<html:hidden property="<%= ReadingProgramLabelForm.PARAM_READING_PROGRAM_CHANGED%>" value="false"/>

<html:hidden property="<%= GenericForm.FIELD_COLLECTION_TYPE %>"/>
    
<base:outlinedTable id="<%=ReadingProgramLabelForm.TABLE_READING_PROGRAM_LABEL%>" borderColor='#C0C0C0'>

    <tr>
        <td colspan="2" class="TableHeading" nowrap>
            Create reading program labels...
        </td>
    </tr>
    
    <tr>
        <td align="center" colspan="2" class="ColRowBold">
            Subscribers to the Reading Program Services <b><i>MUST</i></b> process the Reading Program
             Service update to populate the Reading Program information into your data BEFORE
              printing the labels. <%= form.getReadingProgramLastUpdated() %>
        </td>
    </tr>
    
    <c:choose>
        <c:when test="<%= form.isDistrictUser() %>">
            <tr>
                <td class="ColRowBold tdAlignRight">
                    For
                </td>
                <td>
                    <base:selectSite 
                        name='<%= ReadingProgramLabelForm.FIELD_SITE_ID %>' 
                        selectedSiteID='<%=form.getSiteID().toString() %>' 
                        includeAllLibraries='false' 
                        submitOnChange='true'
                        includeLibrarySites="true"
                        includeTextbookSites="false"
                        includeMediaSites="false"
                        includeAssetSites="false"
                        />
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%= ReadingProgramLabelForm.FIELD_SITE_ID %>" value="<%= store.getSiteID().toString() %>"></html:hidden>
        </c:otherwise>      
    </c:choose>
    
    
    <tr>
        <td class="ColRowBold tdAlignRight">
            Reading Program
        </td>
        <td class="ColRow">
            <% for(ReadingProgram p : ReadingProgram.values()){ %>
                <html:radio property="<%=ReadingProgramLabelForm.FIELD_READING_PROGRAM.toString()%>" value="<%= p.toString() %>" onclick="submitReadingProgramChanged()">
                    <%= p.getLabel() %>
                </html:radio>
                <br>
            <% } %>
        </td>
    </tr>            
    <tr>
        <td class="ColRowBold tdAlignRight">
        Sort by
        </td>
        <td class="ColRow">
            <html:select property="<%=ReadingProgramLabelForm.FIELD_SELECT_SORT_BY%>">
                <html:option value="<%=SortBy.CALL_NUMBER.toString()%>" >Call Number</html:option>
                <html:option value="<%=SortBy.DATE_COPIES_ADDED.toString()%>">Date/Time Copies Added</html:option>
                <% if(!form.getReadingProgram().equalsIgnoreCase(ReadingProgram.LEXILE.toString())){%>
                    <html:option value="<%=SortBy.DATE_READING_PROGRAM_INFORMATION_ADDED_UPDATED.toString()%>">Date Reading Program Information Added/Updated</html:option>
                <% } %>
            </html:select>
        </td>    
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight">
        Based on
        </td>
        <td class="ColRow">
            <html:select  property="<%=ReadingProgramLabelForm.FIELD_SELECT_BASED_ON%>" onchange="this.form.submit()">
                <html:option value="<%=BasedOn.DATE_COPIES_ADDED.toString()%>" ><%= BasedOn.DATE_COPIES_ADDED.getDisplayable() %></html:option>
                <% if(!form.getReadingProgram().equalsIgnoreCase(ReadingProgram.LEXILE.toString())){%>
                    <html:option value="<%=BasedOn.DATE_READING_PROGRAM_INFORMATION_ADDED_UPDATED.toString()%>"><%= BasedOn.DATE_READING_PROGRAM_INFORMATION_ADDED_UPDATED.getDisplayable() %></html:option>
                <% } %>
                <html:option value="<%=BasedOn.BARCODE_LIST.toString()%>"><%= BasedOn.BARCODE_LIST.getDisplayable() %></html:option>
            </html:select>
            <base:helpTag helpFileName="d_based_on.htm"/>
        </td>    
    </tr>
 
    <% if(!BasedOn.BARCODE_LIST.toString().equals(form.getBasedOn())){ %>
        <tr>
            <td class="ColRowBold tdAlignRight">
                <%= (BasedOn.DATE_COPIES_ADDED.toString().equals(form.getBasedOn())) ? "Copies Added" : "Reading Program<br>Added/Updated" %>
            </td>
            <td>

            <table id="<%=ReadingProgramLabelForm.TABLE_DATE_COPIES_ADDED %>">
                <tr>
                    <td class="ColRow tdAlignRight">From</td>
                    <td class="ColRow">
                        <base:date 
                            buttonName = "<%= ReadingProgramLabelForm.BUTTON_FROM_DATE_ADDED %>"
                            fieldName = "<%= ReadingProgramLabelForm.FIELD_FROM_DATE_ADDED %>"
                            dateValue = "<%=form.getFromDateAdded()%>"
                            altText = "<%= ReadingProgramLabelForm.ALT_DATE_ADDED%>"
                         />
                    </td>
                    <% if(BasedOn.valueOf(form.getBasedOn()) != BasedOn.DATE_READING_PROGRAM_INFORMATION_ADDED_UPDATED){ %>
                        <td class="ColRow">
                            <base:time 
                                textFieldName="<%=ReadingProgramLabelForm.FIELD_FROM_TIME%>" 
                                timeValue="<%=form.getFromTime()%>" 
                            />
                        </td>
                    <% } %>
                 </tr>
                <tr>
                    <td class="ColRow tdAlignRight">To</td>
                    <td class="ColRow">
                        <base:date 
                            buttonName = "<%= ReadingProgramLabelForm.BUTTON_TO_DATE_ADDED %>"
                            fieldName = "<%= ReadingProgramLabelForm.FIELD_TO_DATE_ADDED %>"
                            dateValue = "<%=form.getToDateAdded()%>"
                            altText = "<%= ReadingProgramLabelForm.ALT_DATE_ADDED%>"
                         />
                    </td>
                    
                    <% if(BasedOn.valueOf(form.getBasedOn()) != BasedOn.DATE_READING_PROGRAM_INFORMATION_ADDED_UPDATED){ %>
                        <td class="ColRow">
                            <base:time 
                                textFieldName="<%=ReadingProgramLabelForm.FIELD_TO_TIME%>" 
                                timeValue="<%=form.getToTime()%>" 
                            />
                        </td>
                    <% } %>
                </tr>
            </table>
            </td>
        </tr>
        
    <% } else {%>
        
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;
            </td>
            <td nowrap>
               <base:barcodeList 
                   barcodeType="<%=Barcode.BARCODETYPE_COPY %>"
                   formName="<%=ReadingProgramLabelForm.FORM_NAME%>"/>
            </td>
        </tr>
    <% } %>
 
     <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight">
            Include
        </td>


        <td class="ColRow">
             <% if( ReadingProgram.ACCELERATED_READER.toString().equals(form.getReadingProgram()) ){ %>
                 <html:checkbox property="<%=ReadingProgramLabelForm.FIELD_INCLUDE_OPTIONS_AR_INTEREST_LEVEL%>" onclick="this.form.submit()">Accelerated Reader Interest Level</html:checkbox>
                 <br>
             <% } %>
             <html:checkbox disabled="<%= ReadingProgram.valueOf(form.getReadingProgram()) == ReadingProgram.LEXILE %>" onclick="this.form.submit()" property="<%=ReadingProgramLabelForm.FIELD_INCLUDE_OPTIONS_LEXILE_MEASURE%>">Lexile Measure</html:checkbox>
             <base:helpTag helpFileName="d_lexile_measure.htm"/>
             <br>
             <% if( !ReadingProgram.LEXILE.toString().equals(form.getReadingProgram()) ){ %>
                <html:checkbox property="<%=ReadingProgramLabelForm.FIELD_INCLUDE_OPTIONS_QUIZ_NUMBER%>" onclick="this.form.submit()">Quiz Number</html:checkbox>
             <% } %>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
        Label size
        </td>
        <td class="ColRow">
            <html:select  property="<%=ReadingProgramLabelForm.FIELD_IS_LARGE_LABEL_SIZE%>" onchange="this.form.submit()">
             <% if( form.getIncludeOptions().size() < 2){ %>
                <html:option value="false" >Reading Program SMALL label set - FSCFLR spine 48-up</html:option>
             <% } %>
             <% if( !ReadingProgram.LEXILE.toString().equals(form.getReadingProgram()) ){ %>
                <html:option value="true">Reading Program LARGE label - FSC 28-up</html:option>
             <% } %>
            </html:select>
        </td>    
    </tr>
        <tr>
        <td class="ColRowBold tdAlignRight">
        Start on label
        </td>
        <td>
        <html:text property="<%= ReadingProgramLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight" valign="baseline">
        Printer offset
        </td>
        <td class="ColRow" nowrap  valign="baseline">
            Horizontal:&nbsp;<html:text property="<%= ReadingProgramLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4" />
            &nbsp;&nbsp;&nbsp;Vertical:&nbsp;
            <html:text property="<%= ReadingProgramLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
    </tr>

    <tr>
        <td colspan = "2" align="center">
            <table >
                <tr><td colspan="2" align="center" class="ColRowBold"><%=BaseLabelForm.getMessageHelperAligningBarcodes()%></td></tr>
                <tr><td colspan="2" align="center" class="ColRow"><%=BaseLabelForm.getMessageAligningBarcodesForAssistance()%></td></tr>
            </table>
        </td>
    </tr>
    
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>

    <c:set var="recentJobs" value="${form.recentLabelJobs}" />
    <c:if test="${! empty recentJobs}">
    <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <tr>
        <td colspan="2" class="TableHeading">
            Your latest Reading Program Labels jobs
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
                    <table id="<%= ReadingProgramLabelForm.TABLE_LATEST_RPS_JOBS %>" width="95%" cellspacing="0">
                        <tr>
                            <c:if test="<%= store.isDistrictUserLoggedIn() %>">
                                <th class="ColRowBold">Site</th>
                            </c:if>
                            <th class="ColRowBold">Reading Program</th>
                            <th class="ColRowBold">Based On</th>
                            <th class="ColRowBold">From Date</th>
                            <th class="ColRowBold">To Date</th>
                        </tr>
                        <c:forEach items="${recentJobs}" var="params">
                            <jsp:useBean id="params" type="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramLabelJobParams" />
                            <base:flipper key="RecentLabelJobs">
                                <c:if test="<%= store.isDistrictUserLoggedIn() %>">
                                    <td class="ColRow" align="center"><%= (params.getExtraProperty("siteName") == null) ? "" : params.getExtraProperty("siteName") %></td>
                                </c:if>
                                <td class="ColRow" align="center"><c:out value="${params.readingProgram.label}" /></td>
                                <td class="ColRow" align="center"><c:out value="${params.basedOn.displayable}" /></td>
                                <td class="ColRow" align="center">${d:formatDate(params.fromTimestamp)}</td>
                                <td class="ColRow" align="center">${d:formatDate(params.toTimestamp)}</td>
                            </base:flipper>
                        </c:forEach>
                    </table>
            
        </td>
    </tr>
    </c:if>
   
 
</base:outlinedTable>
</base:form>
