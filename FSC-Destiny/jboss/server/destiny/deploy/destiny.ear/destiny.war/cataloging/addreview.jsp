<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.BibTypeFacadeBean"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>



<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>

<%
    AddReviewForm form = (AddReviewForm)request.getAttribute(AddReviewForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<script type="text/javascript">
<!--

var lastStickyStar = 0;
var stickyRating = '<%= MessageHelper.formatMessage("addreview_RateThisTitle") %>';
var redFont = '<%= MessageHelper.formatMessage("addreview_RateThisTitle") %>';

function doStarOver(star, unrated, ratePoor, rateFair, rateOk, rateGood, rateAwesome) {
    redFont = unrated;
    
    for (i=1; i <= star; i++) {
        document.getElementById("star" + i).src = '<%=lh.getLocalizedImagePath("/icons/general/starfull.gif")%>';
    }
    
    for (i=(star+1); i <= 5; i++) {
        document.getElementById("star" + i).src = '<%=lh.getLocalizedImagePath("/icons/general/starempty.gif")%>';
    }

    document.getElementById("ratingText").style.color = "black";
    if (star == 1) {
        document.getElementById("ratingText").innerHTML = ratePoor;
    } else if (star == 2) {
        document.getElementById("ratingText").innerHTML = rateFair;
    } else if (star == 3) {
        document.getElementById("ratingText").innerHTML = rateOk;
    } else if (star == 4) {
        document.getElementById("ratingText").innerHTML = rateGood;
    } else if (star == 5) {
        document.getElementById("ratingText").innerHTML = rateAwesome;
    } else{
        document.getElementById("ratingText").innerHTML = unrated;
        document.getElementById("ratingText").style.color = "#CC0000";
    } 
    
}

function doStarOut() {
    for (i=1; i <= lastStickyStar; i++) {
        document.getElementById("star" + i).src = '<%=lh.getLocalizedImagePath("/icons/general/starfull.gif")%>';
    }
    
    for (i = lastStickyStar + 1; i <= 5; i++) {
        document.getElementById("star" + i).src = '<%=lh.getLocalizedImagePath("/icons/general/starempty.gif")%>';
    }
    
    document.getElementById("ratingText").innerHTML = stickyRating;
    var textColor = "black";
    if (stickyRating == redFont) {
        textColor = "#CC0000";
    }
    document.getElementById("ratingText").style.color = textColor;
  
}

function doSetRating(rating) {
    document.forms["<%= AddReviewForm.FORM_NAME %>"].elements["<%= AddReviewForm.FIELD_RATING %>"].value = rating;
    lastStickyStar = rating;
    stickyRating = document.getElementById("ratingText").innerHTML;
}

-->
</script>

<base:form action="/cataloging/servlet/handleaddreviewform.do" enctype="multipart/form-data" method="post">

<c:if test="<%=form.getDeleteAttachment() != null && form.getDeleteAttachment().booleanValue()%>">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("addreview_AreYouCertain",form.getFileDisplayName())%>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=AddReviewForm.BUTTON_NAME_CONFIRM_DELETE_ATTACHMENT%>"
                    buttonNoName="<%=AddReviewForm.BUTTON_NAME_CANCEL_DELETE_ATTACHMENT%>"
                />
            </td>
        </tr>
    </base:messageBox>
</c:if>

    <base:outlinedTable borderColor="#C0C0C0" id='<%= AddReviewForm.TABLE_ADD_REVIEW %>' width="100%">

<html:hidden property="bibID" />
<html:hidden property="<%= AddReviewForm.PROPERTY_DCPI_RECORD_GUID %>" />
<html:hidden property="<%= AddReviewForm.PROPERTY_DCPI_SITE_ID %>" />
<html:hidden property="reviewID" />
<html:hidden property="<%= AddReviewForm.FIELD_RATING %>" />
<html:hidden property="<%= AddReviewForm.PROPERTY_FILE_NAME %>" />
        <tr valign="top">
            <td>
                <table>
                    <tr>
                        <td colspan="2" class="TableHeading"><%
                            out.print(form.getReviewID() == null ?  MessageHelper.formatMessage("addreview_Reviewing") : MessageHelper.formatMessage("addreview_EditingReview"));
                        %></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="TableHeading"><%=SearchResultsOutputListRenderer.getBibTypeIcon(form.getBibType(), form.isFollettEbook(), (form.isResoldShelfBib() ? new Long(form.getResoldMaterialType()) : null)) %> <%=form.getTitle()%></td>
                    </tr>
                    <tr>
                         <td class="TableHeading2" colspan="2"><%=form.getAuthor()%></td>
                    </tr>
                    <tr>


                    </tr>
                </table>
            </td>
            <td>
                <table width="100%">
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                          <c:choose>
                            <c:when test="<%=form.getReviewID()!= null%>">
                                <base:showHideTag id="onSave">
                                    <base:genericButton name="<%=SaveButtonTag.BUTTON_NAME%>" alt='<%=MessageHelper.formatMessage("approve")%>' src="/buttons/large/approve.gif" onclick="hideElementonSave()"/><br>
                                    <base:cancelButton/>
                                </base:showHideTag>
                            </c:when>
                            <c:otherwise>
                                <base:showHideTag id="onSave">
                                    <% if (!form.isDcpiError()) { %>
                                        <base:saveButton onclick="hideElementonSave()"/><br>
                                    <% } %>
                                    <base:cancelButton/>
                                </base:showHideTag>
                            </c:otherwise>
                        </c:choose>
                        </td>
                    </tr>
                </table>
            </td>
       </tr> 
       <tr>
           <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>    
       </tr>
       <% if (form.getReviewID() == null) {%>
            <% if (!form.isDcpiError()) { %>
            <tr>
                <td colspan="2">
                <table>
                    <tr>
                        <td class="ColRowBold" nowrap><%=MessageHelper.formatMessage("addreview_HowDoYouRateThisTitle")  %></td>
                        <td class="ColRowBold">
                        <table>
                            <tr>
                                <td style="cursor: pointer; cursor: hand;"><%=form.renderStar(1)%><%=form.renderStar(2)%><%=form.renderStar(3)%><%=form.renderStar(4)%><%=form.renderStar(5)%>
                                </td>
                                <td class="SmallColHeading" nowrap
                                    width="200px">&nbsp;<%=form.getRatingText()%>
                                </td>
                            </tr>
                        </table>
                        </td>
                    </tr>
                </table>
                </td>
            </tr>
           <% if (form.canSubmitComments()) { %>
                <tr>
                    <td colspan="2" class="ColRowBold"><%=MessageHelper.formatMessage("addreview_EnterYourCommentsBelow") %></td>
                </tr>
                <tr>
                  <td colspan="2"><html:textarea property='<%= AddReviewForm.FIELD_COMMENT %>' rows="6" cols="60" /></td> 
                </tr>
            <% } %>
            <% if (form.canUploadContent()) { %>
               <tr>
                   <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>    
               </tr>
               <tr>
                    <td colspan = "2">
                        <%if(form.isDisplayingDigitalContent()){ %>
                            <table id = "<%= AddReviewForm.TABLE_FILE_UPLOAD %>">
                                <tr>
                                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addreview_DisplayName")  %></td>
                                    <td><html:text property = "<%= AddReviewForm.FIELD_FILE_DISPLAY_NAME %>" maxlength="30" size="35"/></td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addreview_UploadFile")  %></td>
                                    <td><html:file property="<%= BaseFileUploadForm.FIELD_UPLOAD_FILE %>"/></td>
                                </tr> 
                            </table>
                        <%}%>
                    </td>
               </tr>
               <% } %>
            <%}%>
       <%} else { %>
            <% if (form.canEditContents()) { %>
                <tr>
                    <td colspan="2" class="ColRowBold"><%=MessageHelper.formatMessage("addreview_EnterYourCommentsBelow") %></td>
                </tr>
                <tr>
                  <td colspan="2"><html:textarea property='<%= AddReviewForm.FIELD_COMMENT %>' rows="6" cols="60" /></td> 
                </tr>
                <% if ((!StringHelper.isEmpty(form.getFileName())) && form.canUploadContent()) { %>
                   <tr>
                       <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>    
                   </tr>
                   <tr>
                    <td colspan = "2">
                        <table id = "<%= AddReviewForm.TABLE_FILE_UPLOAD %>">
                            <tr>
                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addreview_DisplayName")  %></td>
                                <td><html:text property = "<%= AddReviewForm.FIELD_FILE_DISPLAY_NAME %>" maxlength="30" size="35"/></td>
                            </tr>
                            <tr>
                            <%if(form.isDisplayingDigitalContent()){ %>
                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addreview_Attachment")  %></td>
                                <td class="ColRow"><%= form.buildDigitalResourceLink() %>&nbsp;&nbsp;<base:genericButton name="<%=AddReviewForm.BUTTON_NAME_DELETE_ATTACHMENT%>" alt='<%=MessageHelper.formatMessage("delete")%>' src="/buttons/small/delete_70.gif" onclick="hideElementonSave()" absbottom="true"/>
                                    <html:hidden property = "<%= AddReviewForm.PROPERTY_FILE_NAME %>"/>
                                </td>
                            <%}else{%>
                                <td>&nbsp;</td>
                                <td class="ColRow"><%= MessageHelper.formatMessage("addreview_DigitialContentNotViewable") %></td>
                            <%}%>
                            </tr>
                        </table>
                    </td>
                  </tr>
              <% } %>
          <% } %>
      <% } %>
        
       
    </base:outlinedTable>
</base:form>
