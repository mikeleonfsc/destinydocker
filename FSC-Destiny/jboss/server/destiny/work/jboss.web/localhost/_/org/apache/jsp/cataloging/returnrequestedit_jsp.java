package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.util.HTMLFilterHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.session.cataloging.data.ReturnTitleVO;
import com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs;
import com.follett.fsc.destiny.session.cataloging.data.ReturnTitleSearchVO;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag;
import com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord;
import java.util.Iterator;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.lookup.LongLongLookup;
import com.follett.fsc.destiny.util.Barcode;
import com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.destiny.entity.ejb3.EmailSpecs;

public final class returnrequestedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fonKeyPress_005fformName_005fbarcodeType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fReturnReceiveItem_005fstateContext_005fitemsWithBarcodes_005fitems_005fformName_005fexpandedID_005fcanReceiveUnbarcoded_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fonKeyPress_005fformName_005fbarcodeType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fReturnReceiveItem_005fstateContext_005fitemsWithBarcodes_005fitems_005fformName_005fexpandedID_005fcanReceiveUnbarcoded_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.release();
    _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor_005falign.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fonKeyPress_005fformName_005fbarcodeType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fReturnReceiveItem_005fstateContext_005fitemsWithBarcodes_005fitems_005fformName_005fexpandedID_005fcanReceiveUnbarcoded_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    ReturnRequestEditForm form = (ReturnRequestEditForm)request.getAttribute(ReturnRequestEditForm.FORM_NAME);
    boolean isUnsentOrSubmitted = (form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_UNSENT || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED) && !form.isPrinterFriendly();
    boolean isDenied = form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_DENIED;
    boolean isEditable = !form.getStore().isStateContext() && (form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_UNSENT || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED) && !form.isPrinterFriendly();
    boolean canModifyStateFields = form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED && !form.isPrinterFriendly();
    boolean isShowAdditionalHeader =  form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_APPROVED || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_COMPLETED;
    String focusControl = form.getOverrideFocusControl();
    
    String unsavedChangesStyle = "";
    if (form.isOrderEdited() || (form.isSaveConfirmNeeded() && form.getErrors().size() == 0 && !form.isSaveAndSendConfirmation())) {
        unsavedChangesStyle = "visibility: show; display: block";
    } else {
        unsavedChangesStyle = "visibility: hidden; display: none";
    }
    
    if(StringHelper.isEmptyOrWhitespace(focusControl)) {
        if(form.isDeleteConfirmation() || form.isDenyBibAndReturnConfirmation() || form.isDenyBibConfirmation() || form.isCompletedConfirmation() || form.isInWarehouseReturnConfirmation() ||
            form.isDenyReturnConfirmation() || form.isReceiveWithoutBarcodesConfirmation() || form.isSaveAndSendConfirmation() || form.isPrinterFriendly()) {
            focusControl = "";
        } else {
            if(form.getStore().isStateContext() && 
                form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE && form.isReceiveWithBarcode() && 
                form.getReturnVO().getTotalNumberOfCopiesWithBarcode() > 0) {
                if(form.getErrors().isEmpty()) {
                    focusControl = ReturnRequestEditForm.FIELD_RECEIVE_SCAN;
                }
            } else if(isEditable) {
                if(form.getTitlesToReturn() == ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES) {
                    focusControl = ReturnRequestEditForm.FIELD_SEARCH_STRING;
                } else {
                    focusControl = BarcodeListTag.FIELD_SCAN_ITEM;
                }
            } else if(canModifyStateFields) {
                focusControl = ReturnRequestEditForm.FIELD_NUM_BOXES;
            }
        }
    }
    boolean haveResults = false;
    ReturnTitleSearchVO searchVO = form.getSearchResults();
    if (searchVO != null) {
        List<ReturnTitleVO> recList = searchVO.getResults();
        haveResults = (recList != null) && (recList.size() > 0);
    }

      out.write("\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/returnrequestedit.jsp(78,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("searchTypes");
      // /cataloging/returnrequestedit.jsp(78,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("cataloging_servlet_ReturnRequestEditForm");
      // /cataloging/returnrequestedit.jsp(78,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("searchTypes");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object searchTypes = null;
      searchTypes = (java.lang.Object) _jspx_page_context.findAttribute("searchTypes");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /cataloging/returnrequestedit.jsp(79,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("carrierList");
      // /cataloging/returnrequestedit.jsp(79,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName( ReturnRequestEditForm.FORM_NAME );
      // /cataloging/returnrequestedit.jsp(79,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("carrierList");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object carrierList = null;
      carrierList = (java.lang.Object) _jspx_page_context.findAttribute("carrierList");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function trapEnter(e) {\r\n      var whichCode = (window.Event) ? e.which : e.keyCode;\r\n      if (e.keyCode == 13) {\r\n        document.");
      out.print(ReturnRequestEditForm.FORM_NAME);
      out.write('.');
      out.print(ReturnRequestEditForm.FIELD_TRAP_ENTER_PRESSED);
      out.write(".value=true;\r\n      }\r\n      return true;\r\n    }\r\n\r\n  function submitDropDown() {\r\n      document.");
      out.print(ReturnRequestEditForm.FORM_NAME);
      out.write('.');
      out.print(ReturnRequestEditForm.PARAM_DROPDOWN_SUBMITTED);
      out.write(".value = \"true\";\r\n      document.");
      out.print(ReturnRequestEditForm.FORM_NAME);
      out.write(".submit();\r\n  }\r\n\r\n  function hideElementApproveReturn() {\r\n\t    if (document.layers) { //netscape\r\n\t        window.document['divToHideApproveReturn'].visibility = 'none';\r\n            window.document['divToHideApproveReturn'].display = 'none';\r\n\t        window.document['divToShowApproveReturn'].visibility = 'show';\r\n            window.document['divToShowApproveReturn'].display = 'block';\r\n\t    } else if (document.all) { //ie\r\n\t        document.all['divToHideApproveReturn'].style.visibility = 'hidden';\r\n            document.all['divToHideApproveReturn'].style.display = 'none';\r\n\t        document.all['divToShowApproveReturn'].style.visibility = 'visible';\r\n            document.all['divToShowApproveReturn'].style.display = 'block';\r\n\t    } else if (document.getElementById) { //other\r\n\t        document.getElementById('divToHideApproveReturn').style.visibility = 'hidden';\r\n            document.getElementById('divToHideApproveReturn').style.display = 'none';\r\n\t        document.getElementById('divToShowApproveReturn').style.visibility = 'visible';\r\n");
      out.write("            document.getElementById('divToShowApproveReturn').style.display = 'block';\r\n\t    }\r\n\t}\r\n  function showEdited(e) {\r\n      var whichCode = (window.Event) ? e.which : e.keyCode;\r\n      if (e.keyCode != 9) {\r\n          document.");
      out.print(ReturnRequestEditForm.FORM_NAME);
      out.write('.');
      out.print(ReturnRequestEditForm.PARAM_ORDER_EDITED);
      out.write(".value = \"true\";\r\n          if (document.layers) { //netscape\r\n              window.document['divUnsavedChanges'].visibility = 'show';\r\n              window.document['divUnsavedChanges'].display = 'block';\r\n          } else if (document.all) { //ie\r\n              document.all['divUnsavedChanges'].style.visibility = 'visible';\r\n              document.all['divUnsavedChanges'].style.display = 'block';\r\n          } else if (document.getElementById) { //other\r\n              document.getElementById('divUnsavedChanges').style.visibility = 'visible';\r\n              document.getElementById('divUnsavedChanges').style.display = 'block';\r\n          }\r\n      }\r\n  }\r\n\t  \r\n\r\n//-->\r\n</script>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005fenctype_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/returnrequestedit.jsp(137,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlereturnrequesteditform.do");
      // /cataloging/returnrequestedit.jsp(137,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setStyleId("keywordList");
      // /cataloging/returnrequestedit.jsp(137,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      // /cataloging/returnrequestedit.jsp(137,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setEnctype("multipart/form-data");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
 if (!form.isPrinterFriendly()) { 
          out.write("\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"trapEnterKey\">\r\n");
 } 
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(141,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( ReturnRequestEditForm.FIELD_TRAP_ENTER_PRESSED );
          // /cataloging/returnrequestedit.jsp(141,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue("false");
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(142,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(ReturnRequestEditForm.FIELD_STATUS);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(143,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(ReturnRequestEditForm.FIELD_RECEIVE_WITH_BARCODE);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(144,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(ReturnRequestEditForm.PARAM_EXPAND_ID);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(145,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(ReturnRequestEditForm.PARAM_ORDER_EDITED);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(146,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(ReturnRequestEditForm.PARAM_JOB_ID);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(147,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(ReturnRequestEditForm.PARAM_SAVE_CONFIRM_NEEDED );
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(148,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(ReturnRequestEditForm.PARAM_DROPDOWN_SUBMITTED );
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n\r\n");
 if (form.isDeleteConfirmation()) { 
          out.write("\r\n        ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(151,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty( ReturnRequestEditForm.FIELD_TITLE_INDEX_TO_DELETE );
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write("\r\n        \r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(153,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td valign=\"top\">\r\n                    ");
              out.print( MessageBoxTag.getCAUTION_IMAGE_HTML() );
              out.write("\r\n                </td>\r\n                <td class=\"ColRowBold\">\r\n                    Are you sure you want to remove &quot;");
              out.print( ResponseUtils.filter(form.getTitleToDelete()) );
              out.write("&quot; from this return?\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_base_005fmessageBox_005f1, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write('\r');
          out.write('\n');
 } else if (form.isInWarehouseReturnConfirmation()) { 
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(169,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(169,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(169,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setMessage("Verify the number of boxes received in the warehouse (RMA: " + form.getReturnVO().getRma() + ")." );
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td></td>\r\n                <td align=\"center\">\r\n                    <table id=\"");
              out.print(ReturnRequestEditForm.TABLE_BOXES_RECEIVED );
              out.write("\">\r\n                        <tr>\r\n                            <td align=\"center\" class=\"ColRowBold\" colspan=\"1\">\r\n                                    Boxes Expected&nbsp;\r\n                            </td>\r\n                            <td align=\"center\" class=\"ColRowBold\" colspan=\"1\">\r\n                                    &nbsp;Received\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\" class=\"ColRow\" colspan=\"1\">\r\n                                    ");
              out.print(form.getReturnVO().getNumberOfBoxes() );
              out.write("&nbsp;\r\n                            </td>\r\n                            <td align=\"center\" class=\"ColRow\" colspan=\"1\">\r\n                                &nbsp;<input type=\"text\" maxlength=\"3\" size=\"5\" align=\"absbottom\" name=\"");
              out.print(ReturnRequestEditForm.FIELD_NUMBER_OF_BOXES_RECEIVED );
              out.write("\" value=\"");
              out.print(form.getReturnVO().getNumberOfBoxes());
              out.write("\"/>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                                ");
              //  base:okCancel
              com.follett.fsc.destiny.client.common.jsptag.OkCancelTag _jspx_th_base_005fokCancel_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OkCancelTag) _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OkCancelTag.class);
              _jspx_th_base_005fokCancel_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fokCancel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /cataloging/returnrequestedit.jsp(192,32) name = buttonOkName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fokCancel_005f0.setButtonOkName(ReturnRequestEditForm.BUTTON_INWAREHOUSE_RETURN_YES );
              int _jspx_eval_base_005fokCancel_005f0 = _jspx_th_base_005fokCancel_005f0.doStartTag();
              if (_jspx_th_base_005fokCancel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.reuse(_jspx_th_base_005fokCancel_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.reuse(_jspx_th_base_005fokCancel_005f0);
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    \r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f2);
          out.write('\r');
          out.write('\n');
 } else if (form.isReceiveWithoutBarcodesConfirmation()) { 
          out.write("\r\n    ");
 String message = form.getReceiveWithoutBarcodesConfirmationMessages();
    
        if(!StringHelper.isEmpty(message)) {
            message += "<br>";
        }
        message += "<center>Are you sure you want to receive the copies without barcodes for return (RMA: " + form.getReturnVO().getRma() + ")?</center>";
    
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(208,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f3.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(208,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f3.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(208,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f3.setMessage(message);
          int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
              // /cataloging/returnrequestedit.jsp(211,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f1.setButtonYesName(ReturnRequestEditForm.BUTTON_RECEIVE_WITHOUT_BARCODES_YES );
              int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
              if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f3);
          out.write('\r');
          out.write('\n');
 } else if (form.isSaveAndSendConfirmation()) { 
          out.write("\r\n\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(218,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f4.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(218,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f4.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(218,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f4.setMessage( "Please confirm that the copies you are returning are packed in boxes and are ready to be picked up by the shipper.<br>Box count: " + form.getNumBoxes());
          int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
              // /cataloging/returnrequestedit.jsp(221,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/send.gif");
              // /cataloging/returnrequestedit.jsp(221,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(ReturnRequestEditForm.BUTTON_SAVE_AND_SEND_CONFIRMATION );
              // /cataloging/returnrequestedit.jsp(221,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(ReturnRequestEditForm.ALT_SAVE_AND_SEND);
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("                \r\n                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
              // /cataloging/returnrequestedit.jsp(222,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/cancel.gif");
              // /cataloging/returnrequestedit.jsp(222,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName(ReturnRequestEditForm.BUTTON_CANCEL_CONFIRM );
              // /cataloging/returnrequestedit.jsp(222,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt("Cancel");
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f4);
          out.write('\r');
          out.write('\n');
 } else if (form.isDenyReturnConfirmation()) { 
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f5 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f5.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(227,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f5.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(227,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f5.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(227,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f5.setMessage("Are you sure you want to deny this return?");
          int _jspx_eval_base_005fmessageBox_005f5 = _jspx_th_base_005fmessageBox_005f5.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f2 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
              // /cataloging/returnrequestedit.jsp(230,20) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f2.setButtonNoName(ReturnRequestEditForm.BUTTON_DENY_RETURN_NO );
              // /cataloging/returnrequestedit.jsp(230,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f2.setButtonYesName(ReturnRequestEditForm.BUTTON_DENY_RETURN_YES );
              int _jspx_eval_base_005fyesNo_005f2 = _jspx_th_base_005fyesNo_005f2.doStartTag();
              if (_jspx_th_base_005fyesNo_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f2);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f5);
          out.write('\r');
          out.write('\n');
 } else if (form.isCompletedConfirmation()) { 
          out.write("\r\n    ");
 String message = form.getReceiveWithoutBarcodesConfirmationMessages();
    
        if(!StringHelper.isEmpty(message)) {
            message += "<br>";
        }
        
        if(form.getReturnVO().getTotalNumberOfCopiesWithoutBarcode() > 0 && form.getJobID() == null) {
            message += "<center>Are you sure you want to receive copies without barcodes and complete return (RMA: " + form.getReturnVO().getRma() + ")?</center>";
        } else {
            message += "<center>Are you sure you want to complete return (RMA: " + form.getReturnVO().getRma() + ")?</center>";
        }
    
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f6 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f6.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(250,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f6.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(250,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f6.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(250,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f6.setMessage(message );
          int _jspx_eval_base_005fmessageBox_005f6 = _jspx_th_base_005fmessageBox_005f6.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f3 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f6);
              // /cataloging/returnrequestedit.jsp(253,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f3.setButtonYesName(ReturnRequestEditForm.BUTTON_COMPLETED_YES );
              int _jspx_eval_base_005fyesNo_005f3 = _jspx_th_base_005fyesNo_005f3.doStartTag();
              if (_jspx_th_base_005fyesNo_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f3);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f6);
          out.write('\r');
          out.write('\n');
 } else if (form.isDenyBibConfirmation() || form.isDenyBibAndReturnConfirmation() ) { 
          out.write("\r\n        ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(259,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty(ReturnRequestEditForm.FIELD_NAME);
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write("\r\n        \r\n        ");
if (form.isDenyBibConfirmation()) { 
          out.write("\r\n            ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f7 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f7.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(262,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f7.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(262,12) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f7.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(262,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f7.setMessage( "Are you sure you want to deny '" + form.getDenyBibTitle() + "' for this return?");
          int _jspx_eval_base_005fmessageBox_005f7 = _jspx_th_base_005fmessageBox_005f7.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f4 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f7);
              // /cataloging/returnrequestedit.jsp(265,20) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f4.setButtonNoName(ReturnRequestEditForm.BUTTON_DENY_BIB_NO );
              // /cataloging/returnrequestedit.jsp(265,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f4.setButtonYesName(ReturnRequestEditForm.BUTTON_DENY_BIB_YES );
              int _jspx_eval_base_005fyesNo_005f4 = _jspx_th_base_005fyesNo_005f4.doStartTag();
              if (_jspx_th_base_005fyesNo_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f4);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f7);
          out.write("\r\n        ");
} else { 
            String message = "This is the last title to deny for this return. Denying this title will deny the return.<br/><center>Are you sure you want to deny this return?</center>";
          out.write("\r\n            ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f8 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f8.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(274,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f8.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(274,12) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f8.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(274,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f8.setMessage( message );
          int _jspx_eval_base_005fmessageBox_005f8 = _jspx_th_base_005fmessageBox_005f8.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f5 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f8);
              // /cataloging/returnrequestedit.jsp(277,20) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f5.setButtonNoName(ReturnRequestEditForm.BUTTON_DENY_RETURN_NO );
              // /cataloging/returnrequestedit.jsp(277,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f5.setButtonYesName(ReturnRequestEditForm.BUTTON_DENY_RETURN_YES );
              int _jspx_eval_base_005fyesNo_005f5 = _jspx_th_base_005fyesNo_005f5.doStartTag();
              if (_jspx_th_base_005fyesNo_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f5);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f8);
          out.write("\r\n        ");
 } 
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n\r\n");
 if (!form.isPrinterFriendly()) { 
          out.write("\r\n    <div id=\"divUnsavedChanges\" style=\"");
          out.print(unsavedChangesStyle);
          out.write("\">\r\n      ");

          String message = "Return has unsaved changes.</center>";
      
          out.write("\r\n      ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f9 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f9.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(292,6) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f9.setShowWarningIcon(true);
          // /cataloging/returnrequestedit.jsp(292,6) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f9.setFilterMessage(false);
          // /cataloging/returnrequestedit.jsp(292,6) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f9.setMessage(message);
          // /cataloging/returnrequestedit.jsp(292,6) name = tableID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f9.setTableID("");
          int _jspx_eval_base_005fmessageBox_005f9 = _jspx_th_base_005fmessageBox_005f9.doStartTag();
          if (_jspx_th_base_005fmessageBox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f9);
          out.write("\r\n    </div>\r\n ");
 } 
          out.write("\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(296,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(ReturnRequestEditForm.FORM_NAME );
          // /cataloging/returnrequestedit.jsp(296,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
          // /cataloging/returnrequestedit.jsp(296,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("false");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n    <table width=\"95%\">\r\n        <tr>\r\n            <td class=\"tdAlignRight\">\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/returnrequestedit.jsp(300,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setHref("/cataloging/servlet/handlereturnrequesteditform.do?" + GenericForm.BUTTON_PRINTER_FRIENDLY + "=true");
              // /cataloging/returnrequestedit.jsp(300,16) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
              // /cataloging/returnrequestedit.jsp(300,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId(GenericForm.ID_PRINTER_FRIENDLY );
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/returnrequestedit.jsp(301,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
                  // /cataloging/returnrequestedit.jsp(301,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("printable") );
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
              out.write("&nbsp;\r\n            </td>\r\n        </tr>\r\n    </table>\r\n");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
          out.write("\r\n\r\n");

String bgColor = "#FFFFFF";
if(!form.isPrinterFriendly()) {
    bgColor = FlipperTag.ROW_GRAY;
}

          out.write("\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor_005falign.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnrequestedit.jsp(315,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(ReturnRequestEditForm.TABLE_MAIN);
          // /cataloging/returnrequestedit.jsp(315,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor(bgColor );
          // /cataloging/returnrequestedit.jsp(315,0) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setAlign("center");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n        <td class=\"TableHeading\" valign=\"top\">\r\n            ");
              out.print(form.getReturnStatusAsString() );
              out.write(" Return\r\n            ");
 if (form.getStore().isStateContext()) { 
              out.write("\r\n                for ");
              out.print(ResponseUtils.filter(form.getReturnVO().getDistrictName()) );
              out.write(' ');
              out.write('-');
              out.write(' ');
              out.print( ResponseUtils.filter(form.getReturnVO().getSiteNameFull()) );
              out.write("\r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 if (isShowAdditionalHeader) {  
              out.write("\r\n    <tr>\r\n        <td class=\"ColRow\" valign=\"top\">\r\n            ");
 if(form.getStore().isStateContext()) { 
              out.write("\r\n                <b>Site:</b>&nbsp;");
              out.print(form.getReturnVO().getSiteName() );
              out.write("<br/>\r\n            ");
 } 
              out.write("\r\n            <b>RMA:</b>&nbsp;");
              out.print(form.getReturnVO().getRma() );
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
              out.write(" \r\n    ");
 if(!form.isPrinterFriendly()){  
              out.write("\r\n        ");
              out.print(form.getAddViewNoteLinkText() );
              out.write("\r\n    ");
 } 
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\" colspan=\"2\">\r\n            <IMG height=\"1\" vspace=\"1\" src=\"/images/icons/general/line.gif\" width=\"100%\">\r\n        </td>\r\n    </tr>\r\n    ");
              out.write("\r\n    <tr>\r\n        <td>\r\n            <table id=\"");
              out.print( ReturnRequestEditForm.TABLE_EDIT_FIELDS);
              out.write("\" align=\"center\">\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        ");
              out.print(form.showSiteRequiredFlag() ? "*" : "" );
              out.write(" Name\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (isEditable) { 
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(352,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty(ReturnRequestEditForm.FIELD_NAME);
              // /cataloging/returnrequestedit.jsp(352,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize("21");
              // /cataloging/returnrequestedit.jsp(352,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength("128");
              // /cataloging/returnrequestedit.jsp(352,28) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setOnkeypress("showEdited(event)");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getName()) );
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(355,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setProperty(ReturnRequestEditForm.FIELD_NAME);
              int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
              if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        ");
              out.print(form.showSiteRequiredFlag() ? "*" : "" );
              out.write(" Phone Number\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (isEditable) { 
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(365,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setProperty(ReturnRequestEditForm.FIELD_PHONE);
              // /cataloging/returnrequestedit.jsp(365,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setSize("21");
              // /cataloging/returnrequestedit.jsp(365,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setMaxlength("30");
              // /cataloging/returnrequestedit.jsp(365,28) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setOnkeypress("showEdited(event)");
              int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
              if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getPhone()) );
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(368,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f11.setProperty(ReturnRequestEditForm.FIELD_PHONE);
              int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
              if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        ");
              out.print(form.showSiteRequiredFlag() ? "*" : "" );
              out.write(" Fax\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (isEditable) { 
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(378,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setProperty(ReturnRequestEditForm.FIELD_FAX);
              // /cataloging/returnrequestedit.jsp(378,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setSize("21");
              // /cataloging/returnrequestedit.jsp(378,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setMaxlength("30");
              // /cataloging/returnrequestedit.jsp(378,28) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setOnkeypress("showEdited(event)");
              int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
              if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getFax()) );
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(381,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty(ReturnRequestEditForm.FIELD_FAX);
              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        Email\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (isEditable) { 
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(391,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setProperty(ReturnRequestEditForm.FIELD_EMAIL);
              // /cataloging/returnrequestedit.jsp(391,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setSize("21");
              // /cataloging/returnrequestedit.jsp(391,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setMaxlength("" + EmailSpecs.EMAIL_MAX_LENGTH );
              // /cataloging/returnrequestedit.jsp(391,28) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setOnkeypress("showEdited(event)");
              int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
              if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getEmail()) );
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(394,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f13.setProperty(ReturnRequestEditForm.FIELD_EMAIL);
              int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
              if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        ");
              out.print(form.showSiteRequiredFlag() ? "*" : "" );
              out.write(" Reason for Return\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (isEditable) { 
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(404,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setProperty(ReturnRequestEditForm.FIELD_REASON);
              // /cataloging/returnrequestedit.jsp(404,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setSize("21");
              // /cataloging/returnrequestedit.jsp(404,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setMaxlength("255");
              // /cataloging/returnrequestedit.jsp(404,28) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setOnkeypress("showEdited(event)");
              int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
              if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReason()) );
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(407,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f14.setProperty(ReturnRequestEditForm.FIELD_REASON);
              int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
              if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        ");
 if(form.getStatus() == ReturnsSpecs.STATUS_APPROVED || 
                              form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || 
                              form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                            ");
              out.print(form.showSiteRequiredFlag() || form.showStateRequiredFlag() ? "*" : "" );
              out.write(" # Boxes Expected\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(form.showSiteRequiredFlag() || form.showStateRequiredFlag() ? "*" : "" );
              out.write(" # Boxes\r\n                        ");
 } 
              out.write("\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (isEditable || (form.getStore().isStateContext() && canModifyStateFields)) { 
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(422,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setProperty(ReturnRequestEditForm.FIELD_NUM_BOXES);
              // /cataloging/returnrequestedit.jsp(422,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setSize("3");
              // /cataloging/returnrequestedit.jsp(422,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setMaxlength("3");
              // /cataloging/returnrequestedit.jsp(422,28) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setOnkeypress("showEdited(event)");
              int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
              if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(StringHelper.isEmptyOrWhitespace(form.getNumBoxes()) ? "" : form.getNumBoxes() );
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(425,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setProperty(ReturnRequestEditForm.FIELD_NUM_BOXES);
              int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
              if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
 if(form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || 
                      form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                        <tr valign=\"top\">\r\n                            <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                                # Boxes Received\r\n                            <td class=\"ColRow\">\r\n                                ");
              out.print(StringHelper.isEmptyOrWhitespace(form.getNumberOfBoxesReceived()) ? "" : form.getNumberOfBoxesReceived() );
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                ");
 } 
              out.write("\r\n                ");
 if ((!isEditable || (form.getStore().isStateContext() && canModifyStateFields)) && (form.getStatus() != ReturnsSpecs.STATUS_DENIED && form.getStatus() != ReturnsSpecs.STATUS_UNSENT) && (!StringHelper.isEmptyOrWhitespace(form.getCarrierName()) || !form.isPrinterFriendly())) { 
              out.write("\r\n                    <tr valign=\"top\">\r\n                        <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                            ");
              out.print(form.showStateRequiredFlag() ? "*" : "" );
              out.write(" Freight Carrier\r\n                        </td>\r\n                        <td class=\"ColRow\">\r\n                        ");
 if (form.getStore().isStateContext() && canModifyStateFields){ 
              out.write("\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(446,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty(ReturnRequestEditForm.FIELD_CARRIER_ID);
              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                ");
                  if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                            ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
              out.write("\r\n                            &nbsp;\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(450,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/other.gif");
              // /cataloging/returnrequestedit.jsp(450,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(450,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setName(ReturnRequestEditForm.BUTTON_CARRIER_OTHER);
              // /cataloging/returnrequestedit.jsp(450,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAlt("Other");
              int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
              out.write("\r\n                        ");
 } else {
              out.write("\r\n                            ");
              out.print(StringHelper.isEmptyOrWhitespace(form.getCarrierName()) ? "" : ResponseUtils.filter(form.getCarrierName()) );
              out.write("\r\n                        ");
 } 
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
 } 
              out.write("\r\n                ");
 if(form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                    <tr>\r\n                         <td class=\"ColRowBold tdAlignRight\">\r\n                            Copies Sent\r\n                         </td>\r\n                         <td class=\"ColRow\">\r\n                            ");
              out.print(form.getReturnVO().getTotalNumberOfCopies() );
              out.write("\r\n                         </td>\r\n                     </tr>\r\n                    <tr>\r\n                         <td class=\"ColRowBold tdAlignRight\">\r\n                            Copies Received\r\n                         </td>\r\n                         <td class=\"ColRow\">\r\n                            ");
              out.print(form.getReturnVO().getTotalNumberOfCopiesReceived() );
              out.write("\r\n                         </td>\r\n                     </tr>\r\n                 ");
 } 
              out.write("\r\n                \r\n                \r\n                ");
 if(form.showSiteRequiredFlag() || form.showStateRequiredFlag()) { 
              out.write("\r\n                <tr>\r\n                    <td>\r\n                        &nbsp;\r\n                    </td>\r\n                    <td class=\"Instruction\">\r\n                        * = Required ");
              out.print( form.showSiteRequiredFlag() ? "to send" : "to approve" );
              out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
 } 
              out.write("\r\n            </table>\r\n        </td>\r\n        \r\n        <td valign=\"top\" class=\"tdAlignRight\">\r\n        ");
 if(!form.isPrinterFriendly()) { 
              out.write("\r\n            <table cellpadding=\"3\">\r\n            ");
 if (isEditable) { 
              out.write("\r\n                <tr>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(496,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/saveandsend.gif");
              // /cataloging/returnrequestedit.jsp(496,20) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(496,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAlt( ReturnRequestEditForm.ALT_SAVE_AND_SEND );
              // /cataloging/returnrequestedit.jsp(496,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setName( ReturnRequestEditForm.BUTTON_SAVE_AND_SEND );
              int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
              out.write("\r\n                 </td>\r\n                 </tr>\r\n                 ");
 if(form.getStatus() == ReturnsSpecs.STATUS_UNSENT) { 
              out.write("\r\n                    <tr>\r\n                        <td class=\"tdAlignRight\">\r\n                           ");
              if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                 ");
 } 
              out.write("\r\n                 <tr>\r\n                     <td class=\"tdAlignRight\">\r\n                        ");
              if (_jspx_meth_base_005fcancelButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                     </td>\r\n                 </tr>\r\n            ");
 } else { 
              out.write("\r\n                ");
 if (form.getStatus() == ReturnsSpecs.STATUS_APPROVED && !form.isPrinterFriendly()) { 
              out.write("\r\n                    <tr>\r\n                    ");
 if(form.getStore().isStateContext() ) { 
              out.write("\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(516,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/inwarehouse.gif");
              // /cataloging/returnrequestedit.jsp(516,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(516,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setAlt( ReturnRequestEditForm.ALT_INWAREHOUSE );
              // /cataloging/returnrequestedit.jsp(516,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setName( ReturnRequestEditForm.BUTTON_INWAREHOUSE_RETURN );
              int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
              out.write("<br/>\r\n                        </td>\r\n                    ");
 } 
              out.write("            \r\n                    </tr>\r\n                ");
 } 
              out.write("\r\n            ");
 } 
              out.write("\r\n            ");
 if (form.getStore().isStateContext() && canModifyStateFields) { 
              out.write("\r\n                \r\n               ");
 if(form.isShowApproveButton()) { 
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">\r\n                    <div id=\"divToHideApproveReturn\">\r\n                        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(528,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/large/approve.gif");
              // /cataloging/returnrequestedit.jsp(528,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(528,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setAlt( ReturnRequestEditForm.ALT_APPROVE );
              // /cataloging/returnrequestedit.jsp(528,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setName( ReturnRequestEditForm.BUTTON_APPROVE );
              // /cataloging/returnrequestedit.jsp(528,24) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setOnclick("hideElementApproveReturn()");
              int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
              out.write("\r\n                    </div>\r\n                    <div id=\"divToShowApproveReturn\" style=\"visibility: hidden; display: none\">Please wait...</div>                    \r\n                   </td>\r\n               </tr>\r\n               ");
 } 
              out.write("\r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(536,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setSrc("/buttons/large/denyall.gif");
              // /cataloging/returnrequestedit.jsp(536,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(536,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setAlt( ReturnRequestEditForm.ALT_DENY_ALL );
              // /cataloging/returnrequestedit.jsp(536,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setName( ReturnRequestEditForm.BUTTON_DENY_ALL );
              int _jspx_eval_base_005fgenericButton_005f6 = _jspx_th_base_005fgenericButton_005f6.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
              out.write("\r\n                    </td>\r\n                </tr>\r\n                \r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
if(form.getStatus() == ReturnsSpecs.STATUS_SUBMITTED && form.getStore().isStateContext()) { 
              out.write("\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f7 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f7.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(543,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f7.setSrc("/buttons/large/close.gif");
              // /cataloging/returnrequestedit.jsp(543,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f7.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(543,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f7.setAlt( ReturnRequestEditForm.ALT_CLOSE );
              // /cataloging/returnrequestedit.jsp(543,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f7.setName( ReturnRequestEditForm.BUTTON_CLOSE );
              int _jspx_eval_base_005fgenericButton_005f7 = _jspx_th_base_005fgenericButton_005f7.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              if (_jspx_meth_base_005fcancelButton_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
} else if (form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE && form.getStore().isStateContext()){
              out.write("\r\n                <tr >\r\n                    <td class=\"tdAlignRight\">\r\n                    ");
 if(form.canShowCompletedButton()) { 
              out.write("\r\n                        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f8 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f8.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(553,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f8.setSrc("/buttons/large/completed.gif");
              // /cataloging/returnrequestedit.jsp(553,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f8.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(553,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f8.setAlt( ReturnRequestEditForm.ALT_COMPLETED );
              // /cataloging/returnrequestedit.jsp(553,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f8.setName( ReturnRequestEditForm.BUTTON_COMPLETED );
              int _jspx_eval_base_005fgenericButton_005f8 = _jspx_th_base_005fgenericButton_005f8.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f8);
              out.write("\r\n                    ");
 } 
              out.write("\r\n                   </td>\r\n               </tr>\r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f9 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f9.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(559,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f9.setSrc("/buttons/large/rmareport.gif");
              // /cataloging/returnrequestedit.jsp(559,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f9.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(559,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f9.setAlt( ReturnRequestEditForm.ALT_RUN_RMA_REPORT );
              // /cataloging/returnrequestedit.jsp(559,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f9.setName( ReturnRequestEditForm.BUTTON_RUN_RMA_REPORT );
              int _jspx_eval_base_005fgenericButton_005f9 = _jspx_th_base_005fgenericButton_005f9.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f9);
              out.write("\r\n                    </td>\r\n                </tr> \r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              if (_jspx_meth_base_005fcloseButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                </tr> \r\n           ");
} else if (form.getStore().isStateContext()) {
              out.write("\r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              if (_jspx_meth_base_005fcloseButton_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                </tr> \r\n           ");
} else if (!form.getStore().isStateContext() && !isUnsentOrSubmitted) {
              out.write("\r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                       ");
              if (_jspx_meth_base_005fcloseButton_005f2(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                </tr>\r\n           ");
} else { 
              out.write("\r\n                <tr>\r\n                    <td class=\"tdAlignRight\">\r\n                    &nbsp;\r\n                    </td>\r\n                </tr>\r\n           ");
} 
              out.write("\r\n       ");
 } else { 
              out.write("\r\n            <tr>\r\n                <td class=\"tdAlignRight\">\r\n                &nbsp;\r\n                </td>\r\n            </tr>\r\n       ");
 } 
              out.write("\r\n           </table> \r\n        \r\n       \r\n        </td>\r\n    </tr>\r\n");
 if (!form.isPrinterFriendly() && form.showCurrentlySelectedText()) { 
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" class=\"Instruction\">\r\n            This is the number of <b>boxes</b> that the shipper can expect to pick up. Do not put in the number of copies.\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        ");
              if (_jspx_meth_base_005fsectionHeading_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\" valign=\"bottom\">\r\n            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(609,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty(ReturnRequestEditForm.FIELD_TITLES_TO_RETURN );
              // /cataloging/returnrequestedit.jsp(609,12) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setOnchange("submitDropDown()");
              // /cataloging/returnrequestedit.jsp(609,12) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setStyleClass("ColRowBold");
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /cataloging/returnrequestedit.jsp(610,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( String.valueOf(ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES) );
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print(ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES_DISPLAYABLE);
                      int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
                  out.write("\r\n                ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /cataloging/returnrequestedit.jsp(611,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( String.valueOf(ReturnRequestEditForm.OPTION_UPLOAD_BARCODES) );
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print(ReturnRequestEditForm.OPTION_UPLOAD_BARCODES_DISPLAYABLE);
                      int evalDoAfterBody = _jspx_th_html_005foption_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
              out.write("&nbsp;\r\n            \r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(614,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(ReturnRequestEditForm.FORM_NAME);
              // /cataloging/returnrequestedit.jsp(614,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty(ReturnRequestEditForm.FIELD_TITLES_TO_RETURN);
              // /cataloging/returnrequestedit.jsp(614,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue( "" +ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES);
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <span class=\"ColRowBold\">Find&nbsp;");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/returnrequestedit.jsp(615,47) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f6.setProperty(ReturnRequestEditForm.FIELD_SEARCH_STRING );
                  // /cataloging/returnrequestedit.jsp(615,47) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f6.setSize("21");
                  int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
                  if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                  out.write("\r\n            in &nbsp;");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/returnrequestedit.jsp(616,21) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f2.setProperty(ReturnRequestEditForm.FIELD_SEARCH_TYPE);
                  int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                  if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                ");
                      if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
                  out.write("&nbsp;");
                  if (_jspx_meth_base_005fgoButton_005f0(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                    return;
                  out.write("&nbsp;</span>\r\n          </td>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(621,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(ReturnRequestEditForm.FORM_NAME);
              // /cataloging/returnrequestedit.jsp(621,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty(ReturnRequestEditForm.FIELD_TITLES_TO_RETURN);
              // /cataloging/returnrequestedit.jsp(621,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue( "" +ReturnRequestEditForm.OPTION_UPLOAD_BARCODES);
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <span class=\"ColRow\">Maximum ");
                  out.print("" + form.getMaxBarcodes() );
                  out.write(" barcodes per each list/file uploaded</span>\r\n            </td>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
              out.write("\r\n    </tr>\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(626,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName(ReturnRequestEditForm.FORM_NAME);
              // /cataloging/returnrequestedit.jsp(626,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty(ReturnRequestEditForm.FIELD_TITLES_TO_RETURN);
              // /cataloging/returnrequestedit.jsp(626,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue( "" +ReturnRequestEditForm.OPTION_UPLOAD_BARCODES);
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n        <td align=\"center\">\r\n           ");
                  //  base:barcodeList
                  com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag _jspx_th_base_005fbarcodeList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag) _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fonKeyPress_005fformName_005fbarcodeType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag.class);
                  _jspx_th_base_005fbarcodeList_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbarcodeList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /cataloging/returnrequestedit.jsp(629,11) name = barcodeType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f0.setBarcodeType( Barcode.BARCODETYPE_TEXTBOOKCOPY );
                  // /cataloging/returnrequestedit.jsp(629,11) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f0.setFormName(ReturnRequestEditForm.FORM_NAME);
                  // /cataloging/returnrequestedit.jsp(629,11) name = onKeyPress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f0.setOnKeyPress("showEdited(event)");
                  int _jspx_eval_base_005fbarcodeList_005f0 = _jspx_th_base_005fbarcodeList_005f0.doStartTag();
                  if (_jspx_th_base_005fbarcodeList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fonKeyPress_005fformName_005fbarcodeType_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fonKeyPress_005fformName_005fbarcodeType_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f0);
                  out.write("\r\n        </td>\r\n        </tr>\r\n        \r\n        <tr>\r\n            <td align=\"center\">\r\n                ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /cataloging/returnrequestedit.jsp(637,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f0.setId("UploadBarcodeScans");
                  int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f10 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f10.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                      // /cataloging/returnrequestedit.jsp(638,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setSrc("/buttons/large/uploadscans.gif");
                      // /cataloging/returnrequestedit.jsp(638,20) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setAbsbottom(true);
                      // /cataloging/returnrequestedit.jsp(638,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setName( ReturnRequestEditForm.BUTTON_UPLOAD_BARCODES );
                      // /cataloging/returnrequestedit.jsp(638,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setAlt("Upload");
                      // /cataloging/returnrequestedit.jsp(638,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setOnclick("hideElementUploadBarcodeScans()");
                      int _jspx_eval_base_005fgenericButton_005f10 = _jspx_th_base_005fgenericButton_005f10.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f10);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f10);
                      out.write("\r\n                ");
                      int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
              out.write("\r\n    \r\n    ");
 if (form.isExecutedSearch()) { 
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" class=\"SmallColHeading\">\r\n            Searched ");
              out.print(form.getSearchTypeAsString() );
              out.write(" for &quot;");
              out.print(JSPHelper.filterHtmlAndNulls(form.getSearchResults().getSearchTerm()) );
              out.write("&quot;\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"TableHeading\" colspan=\"2\">\r\n            <IMG height=\"1\" vspace=\"1\" src=\"/images/icons/general/line.gif\" width=\"100%\">\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan = \"2\">\r\n            <table width = \"100%\" border = \"0\"  cellspacing = \"0\" id = \"");
              out.print( ReturnRequestEditForm.TABLE_SEARCH_RESULTS );
              out.write("\">\r\n                ");
 if (!haveResults) { 
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        No matches found.\r\n                    </td>\r\n                </tr>\r\n                ");
 } else { 
              out.write("\r\n                <tr>\r\n                    <td class='SmallColHeading'>Title</td>\r\n                    <td class='SmallColHeading'>ISBN<br/>Edition</td>\r\n                    <td class='SmallColHeading'>State / Textbook ID<br/>Publisher</td>\r\n                    <td class='SmallColHeading' align=\"center\">Available<br/>Copies</td>\r\n                    <td>&nbsp;</td>\r\n                </tr>\r\n                ");

                Iterator<ReturnTitleVO> iter = form.getSearchResults().getResults().iterator();
                int counter = 0;
                while (iter.hasNext()) {
                    ReturnTitleVO rec = iter.next();
                    if (counter % 2 == 0) {
                
              out.write("\r\n                    <tr bgcolor=\"");
              out.print( FlipperTag.ROW_GRAY );
              out.write("\" width=\"100%\">\r\n                ");
 } else { 
              out.write(" \r\n                    <tr width=\"100%\">\r\n                ");
 } 
              out.write("\r\n                    <td class = \"ColRow\" valign=\"top\">\r\n                        ");
 if (form.isPrinterFriendly()) { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            <a href=\"/cataloging/servlet/presenttextbookdetailform.do?bibID=");
              out.print(rec.getBibID() );
              out.write("\" id=\"");
              out.print(ReturnRequestEditForm.ID_LINK_TITLE_DETAIL + rec.getBibID() );
              out.write("\">\r\n                                ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write("\r\n                            </a>\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                    <td class = \"ColRow\">");
              out.print(rec.getDisplayableIsbn() );
              out.write("<br/>");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getEdition()) );
              out.write("</td>\r\n                    <td class = \"ColRow\">");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID()));
              out.write("\r\n                    <br/>");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getPublisher()) );
              out.write("</td>\r\n                    <td class = \"ColRow\" align=\"center\" valign=\"top\">");
              out.print(rec.getCopiesAvailable() );
              out.write("</td>\r\n                    <td align=\"center\" valign=\"top\">\r\n                    ");
 if (!form.isPrinterFriendly()) { 
              out.write("\r\n                        ");
 if (!rec.isSelected()) { 
              out.write("\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f11 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f11.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(699,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f11.setSrc("/buttons/small/select.gif");
              // /cataloging/returnrequestedit.jsp(699,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f11.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(699,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f11.setAlt( ReturnRequestEditForm.ALT_SELECT );
              // /cataloging/returnrequestedit.jsp(699,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f11.setName( ReturnRequestEditForm.BUTTON_SELECT_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f11 = _jspx_th_base_005fgenericButton_005f11.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f11);
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            <span class=\"SmallColHeading\">Currently Selected</span><br/>\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f12 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f12.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(702,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f12.setSrc("/buttons/small/editsmall.gif");
              // /cataloging/returnrequestedit.jsp(702,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f12.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(702,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f12.setAlt( ReturnRequestEditForm.ALT_EDIT );
              // /cataloging/returnrequestedit.jsp(702,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f12.setName( ReturnRequestEditForm.BUTTON_EDIT_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f12 = _jspx_th_base_005fgenericButton_005f12.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f12);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    ");
 } else { 
              out.write("\r\n                        &nbsp;\r\n                    ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>    \r\n                ");
 counter++;
                    } 
              out.write(" \r\n                ");
 } 
              out.write(" \r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
 } 
              out.write('\r');
              out.write('\n');
 } 
              out.write("\r\n\r\n");
 if (form.getReturnVO().getNumberOfTitles() > 0 || (form.getReturnVO().getTitleList().size() > 0 && form.getStatus() == ReturnsSpecs.STATUS_DENIED)) { 
              out.write("\r\n\r\n        ");
 if (form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE) {
              out.write("\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(721,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName(ReturnRequestEditForm.FORM_NAME );
              // /cataloging/returnrequestedit.jsp(721,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
              // /cataloging/returnrequestedit.jsp(721,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("false");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write(" \r\n            ");
                  out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\" width=\"100%\" colspan = \"2\"> \r\n                    <table id = \"");
                  out.print( ReturnRequestEditForm.TABLE_CHOOSE_RECEIVE_BARCODE_MODE );
                  out.write("\"  border=\"1\" frame=\"hSides\" width=\"100%\" style=\"border-collapse: collapse\" bordercolor=\"#C0C0C0\" cellspacing=\"1\" cellpadding=\"2\">\r\n                        <tr>\r\n                            ");
                  //  c:choose
                  org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                  _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                  if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      // /cataloging/returnrequestedit.jsp(728,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f0.setTest( form.isReceiveWithBarcode());
                      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                    <td class=\"ColRowBold\" align=\"center\" width=\"50%\">\r\n                                        ");
                          if (_jspx_meth_base_005fimage_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                            return;
                          out.write("&nbsp;");
                          out.print(form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITH_BARCODES_STATE :  ReturnRequestEditForm.HEADER_WITH_BARCODES_SITE );
                          out.write("\r\n                                    </td>\r\n                                    <td class=\"ColRow\" align=\"center\" onclick = \"changeReceivingMode(false); return false;\">\r\n                                        <a href = \"\" onclick = \"changeReceivingMode(false); return false;\" style = \"text-decoration:none; color:black\">");
                          out.print(form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_STATE : ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_SITE );
                          out.write("</a>\r\n                                    </td>\r\n                                ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                      out.write("\r\n                                ");
                      //  c:otherwise
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                    <td class=\"ColRow\" align=\"center\" width=\"50%\" onclick = \"changeReceivingMode(true); return false;\">\r\n                                        <a href = \"\" onclick = \"changeReceivingMode(true); return false;\" style = \"text-decoration:none; color:black\">");
                          out.print(form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITH_BARCODES_STATE : ReturnRequestEditForm.HEADER_WITH_BARCODES_SITE);
                          out.write("</a>\r\n                                    </td>\r\n                                    <td class=\"ColRowBold\" align=\"center\">\r\n                                        ");
                          if (_jspx_meth_base_005fimage_005f2(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                            return;
                          out.write("&nbsp;");
                          out.print(form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_STATE : ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_SITE);
                          out.write("\r\n                                    </td>                            \r\n                                ");
                          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                      out.write("\r\n                            ");
                      int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                  out.write("\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n        ");
                  out.write("\r\n            </tr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
              out.write("\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(751,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName(ReturnRequestEditForm.FORM_NAME );
              // /cataloging/returnrequestedit.jsp(751,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty("printerFriendly");
              // /cataloging/returnrequestedit.jsp(751,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue("true");
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\" width=\"100%\" colspan = \"2\">\r\n                    ");
if(form.getStore().isStateContext()) { 
                  out.write("\r\n                        ");
if(form.isReceiveWithBarcode()) { 
                  out.write("\r\n                            ");
                  out.print( ReturnRequestEditForm.HEADER_WITH_BARCODES_STATE );
                  out.write("\r\n                        ");
 } else { 
                  out.write("\r\n                            ");
                  out.print( ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_STATE );
                  out.write("\r\n                        ");
 } 
                  out.write("\r\n                    ");
 } else { 
                  out.write("\r\n                        ");
if(form.isReceiveWithBarcode()) { 
                  out.write("\r\n                            ");
                  out.print( ReturnRequestEditForm.HEADER_WITH_BARCODES_SITE );
                  out.write("\r\n                        ");
 } else { 
                  out.write("\r\n                            ");
                  out.print( ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_SITE );
                  out.write("\r\n                        ");
 } 
                  out.write("\r\n                    ");
 } 
                  out.write("\r\n                </td>\r\n            </tr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
              out.write(" \r\n<a name=\"Hello\"></a>                 \r\n                ");
if(form.isReceiveWithBarcode()) { 
              out.write("\r\n                    ");
if(form.getReturnVO().getTotalNumberOfCopiesWithBarcode() > 0 && form.getStore().isStateContext() && !form.isPrinterFriendly()) { 
              out.write("\r\n                        <tr>\r\n                            <td colspan=\"2\" align=\"center\">\r\n                                <table>\r\n                                    <tr>\r\n                                        <td class=\"ColRowBold tdAlignRight\" valign=\"center\" nowrap>Scan or enter one-at-a-time</td>\r\n                                        <td colspan=\"2\" valign=\"center\">\r\n                                            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr>\r\n                                            <td>\r\n                                            <span onKeyPress=\"return trapEnter(event);\">\r\n                                                ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(782,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setProperty( ReturnRequestEditForm.FIELD_RECEIVE_SCAN );
              // /cataloging/returnrequestedit.jsp(782,48) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setSize("20");
              int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
              if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
              out.write("\r\n                                            </span>\r\n                                            </td>\r\n                                            <td valign=\"top\">&nbsp;");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f13 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f13.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(785,67) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f13.setSrc("/buttons/large/receivebig.gif");
              // /cataloging/returnrequestedit.jsp(785,67) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f13.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(785,67) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f13.setName( ReturnRequestEditForm.BUTTON_RECEIVE_SCAN );
              // /cataloging/returnrequestedit.jsp(785,67) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f13.setAlt("Receive");
              int _jspx_eval_base_005fgenericButton_005f13 = _jspx_th_base_005fgenericButton_005f13.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f13);
              out.write("</td>\r\n                                            </tr></table>\r\n                                        </td>\r\n                                    </tr>\r\n                                    \r\n                                    <tr valign=\"top\">\r\n                                        <td valign=\"top\" class=\"ColRowBold tdAlignRight\" nowrap>Or upload a file of barcodes</td>\r\n                                        <td valign=\"top\">\r\n                                            ");
              //  html:file
              org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
              _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(793,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ffile_005f0.setProperty( ReturnRequestEditForm.FIELD_UPLOAD_FILE );
              // /cataloging/returnrequestedit.jsp(793,44) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ffile_005f0.setSize("20");
              int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
              if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
              out.write("\r\n                                            &nbsp;\r\n                                        </td>\r\n                                        <td class=\"ColRowBold\" valign=\"middle\">\r\n                                        ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(797,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f1.setId("UploadScans");
              int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                                ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f14 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                  // /cataloging/returnrequestedit.jsp(798,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f14.setSrc("/buttons/large/uploadscans.gif");
                  // /cataloging/returnrequestedit.jsp(798,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f14.setAbsbottom(true);
                  // /cataloging/returnrequestedit.jsp(798,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f14.setName( ReturnRequestEditForm.BUTTON_UPLOAD );
                  // /cataloging/returnrequestedit.jsp(798,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f14.setAlt("Upload");
                  // /cataloging/returnrequestedit.jsp(798,48) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f14.setOnclick("hideElementUploadScans()");
                  int _jspx_eval_base_005fgenericButton_005f14 = _jspx_th_base_005fgenericButton_005f14.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f14);
                  out.write("\r\n                                        ");
                  int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                 </table>\r\n                            </td>\r\n                        </tr>\r\n                     ");
 } 
              out.write("\r\n                ");
 } 
              out.write("\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"tdAlignRight\">\r\n                        ");
if(form.getJobID() == null && !form.isReceiveWithBarcode() &&
                                form.getReturnVO().getTotalNumberOfCopiesWithoutBarcode() > 0 && 
                                form.getStore().isStateContext() && !form.isPrinterFriendly()) { 
              out.write("\r\n                        \r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f15 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f15.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(813,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f15.setSrc("/buttons/large/receivebig.gif");
              // /cataloging/returnrequestedit.jsp(813,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f15.setAlt(ReturnRequestEditForm.ALT_RECEIVE_WITHOUT_BARCODES );
              // /cataloging/returnrequestedit.jsp(813,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f15.setName( ReturnRequestEditForm.BUTTON_RECEIVE_WITHOUT_COPIES );
              int _jspx_eval_base_005fgenericButton_005f15 = _jspx_th_base_005fgenericButton_005f15.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f15);
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\">\r\n                        <table id=\"");
              out.print(ReturnRequestEditForm.TABLE_RECEIVED_ITEMS );
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"4\">\r\n                            ");
              //  base:ReturnReceiveItem
              com.follett.fsc.destiny.client.cataloging.jsptag.ReturnReceiveItemTag _jspx_th_base_005fReturnReceiveItem_005f0 = (com.follett.fsc.destiny.client.cataloging.jsptag.ReturnReceiveItemTag) _005fjspx_005ftagPool_005fbase_005fReturnReceiveItem_005fstateContext_005fitemsWithBarcodes_005fitems_005fformName_005fexpandedID_005fcanReceiveUnbarcoded_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.ReturnReceiveItemTag.class);
              _jspx_th_base_005fReturnReceiveItem_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fReturnReceiveItem_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(820,28) name = itemsWithBarcodes type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fReturnReceiveItem_005f0.setItemsWithBarcodes(form.isReceiveWithBarcode());
              // /cataloging/returnrequestedit.jsp(820,28) name = items type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fReturnReceiveItem_005f0.setItems(form.getReturnVO().getTitleList());
              // /cataloging/returnrequestedit.jsp(820,28) name = stateContext type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fReturnReceiveItem_005f0.setStateContext(form.getStore().isStateContext() );
              // /cataloging/returnrequestedit.jsp(820,28) name = expandedID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fReturnReceiveItem_005f0.setExpandedID(form.getExpandID() );
              // /cataloging/returnrequestedit.jsp(820,28) name = canReceiveUnbarcoded type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fReturnReceiveItem_005f0.setCanReceiveUnbarcoded(form.getJobID() == null );
              // /cataloging/returnrequestedit.jsp(820,28) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fReturnReceiveItem_005f0.setFormName(ReturnRequestEditForm.FORM_NAME);
              int _jspx_eval_base_005fReturnReceiveItem_005f0 = _jspx_th_base_005fReturnReceiveItem_005f0.doStartTag();
              if (_jspx_th_base_005fReturnReceiveItem_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fReturnReceiveItem_005fstateContext_005fitemsWithBarcodes_005fitems_005fformName_005fexpandedID_005fcanReceiveUnbarcoded_005fnobody.reuse(_jspx_th_base_005fReturnReceiveItem_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fReturnReceiveItem_005fstateContext_005fitemsWithBarcodes_005fitems_005fformName_005fexpandedID_005fcanReceiveUnbarcoded_005fnobody.reuse(_jspx_th_base_005fReturnReceiveItem_005f0);
              out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n\r\n    ");
 } else { 
              out.write(' ');
              out.write("\r\n\r\n\r\n\r\n   <tr>\r\n        ");
              //  base:sectionHeading
              com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
              _jspx_th_base_005fsectionHeading_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsectionHeading_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(835,8) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f1.setHeading(!form.showCurrentlySelectedText() ? "Returns" : "Currently Selected" );
              // /cataloging/returnrequestedit.jsp(835,8) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f1.setTdContent("colspan = '2' width = '100%'");
              int _jspx_eval_base_005fsectionHeading_005f1 = _jspx_th_base_005fsectionHeading_005f1.doStartTag();
              if (_jspx_th_base_005fsectionHeading_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f1);
              out.write("\r\n   </tr>\r\n   <tr>\r\n        <td colspan = \"2\">\r\n            <table width = \"100%\" border = \"0\"  cellspacing=\"0\" cellpadding=\"4\" id=\"");
              out.print( ReturnRequestEditForm.TABLE_SELECTED );
              out.write("\">\r\n             <tr>\r\n                <td class='SmallColHeading'>&nbsp;</td>\r\n                <td class='SmallColHeading'>&nbsp;</td>\r\n                <td class='SmallColHeading'>&nbsp; </td>\r\n                <td class='SmallColHeading'>&nbsp; </td>\r\n                ");
 String copyStatus = "--Returning--"; 
                if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) {
                    copyStatus = "--Received--";
                } 
              out.write("\r\n                <td class='SmallColHeading' align=\"center\" colspan=\"2\" valign=\"bottom\">");
              out.print(copyStatus );
              out.write("</td>\r\n                <td>&nbsp;</td>\r\n            </tr>\r\n            \r\n            <tr>\r\n                <td class='SmallColHeading'>Title</td>\r\n                <td class='SmallColHeading'>ISBN<br/>Edition</td>\r\n                <td class='SmallColHeading'>State / Textbook ID<br/>Publisher</td>\r\n                \r\n                <td class='SmallColHeading' align=\"center\">&nbsp;</td>\r\n                <td class='SmallColHeading' align=\"center\">With<br/>Barcodes</td>\r\n                <td class='SmallColHeading' align=\"center\">Without<br/>Barcodes</td>\r\n                <td>&nbsp;</td>\r\n            </tr>\r\n            ");

            Iterator<ReturnTitleVO> iter = form.getReturnVO().getTitleList().iterator();
            int counter = 0;
            int totalWith = 0;
            int totalWithout = 0;
            int totalWithReceived = 0;
            int totalWithoutReceived = 0;
            while (iter.hasNext()) {
                ReturnTitleVO rec = iter.next();
                
                if(rec.getStatus() != ReturnsSpecs.STATUS_BIB_DENIED || form.getStatus() != ReturnsSpecs.STATUS_COMPLETED) {
                    totalWith+= rec.getCopiesWithBarcode(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED);
                    totalWithReceived+= rec.getCopiesWithBarcodeReceived();
                    if (rec.getCopiesWithoutBarcode() != null){
                        totalWithout+= rec.getCopiesWithoutBarcode().intValue();
                    }
                    if (rec.getCopiesWithoutBarcodeReceived() != null){
                        totalWithoutReceived += rec.getCopiesWithoutBarcodeReceived().intValue();
                    }
                    if (counter % 2 == 0) {
                    
              out.write("\r\n                        <tr bgcolor=\"");
              out.print( FlipperTag.ROW_GRAY );
              out.write("\" valign=\"top\" width=\"100%\">\r\n                    ");
 } else { 
              out.write(" \r\n                        <tr width=\"100%\" valign=\"top\">\r\n                    ");
 } 
              out.write("\r\n                        <td class = \"ColRow\" valign=\"top\">\r\n                    ");
 if (form.isPrinterFriendly()) { 
              out.write("\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write("\r\n                    ");
 } else if (rec.isDeleted() && form.getStatus() != ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write(" <font color=\"#CC0000\">(Removed)</font>\r\n                     ");
 } else { 
              out.write("\r\n                        <a href=\"/cataloging/servlet/presenttextbookdetailform.do?bibID=");
              out.print(rec.getBibID() );
              out.write("\" id=\"");
              out.print(ReturnRequestEditForm.ID_LINK_TITLE_DETAIL + rec.getBibID() );
              out.write("\">\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write("\r\n                        </a>\r\n                     ");
 } 
              out.write("\r\n                        </td>\r\n                        <td class = \"ColRow\">");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getDisplayableIsbn()));
              out.write("<br/>");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getEdition()));
              out.write("</td>\r\n                        <td class = \"ColRow\">");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID()));
              out.write("<br/>");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getPublisher()));
              out.write("</td>\r\n                        <td class = \"ColRow\" align=\"center\" valign=\"top\">&nbsp;</td>\r\n                    \r\n                        ");
  boolean displayInRed = false;
                            if(rec.getCopiesWithBarcode() == 0 && (rec.getCopiesWithoutBarcode() == null || rec.getCopiesWithoutBarcode().intValue() == 0)) {
                                displayInRed = true;                        
                            }
                        
              out.write("\r\n                    <td class = \"ColRow\" align=\"center\" valign=\"top\">\r\n                        ");
if(displayInRed) { 
              out.write("\r\n                            <font color=\"#CC0000\">\r\n                        ");
 } 
              out.write("\r\n                            ");
if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                                ");
              out.print(rec.getCopiesWithBarcodeReceived() );
              out.write('/');
              out.print(rec.getCopiesWithBarcode(true) );
              out.write("\r\n                            ");
 } else {
              out.write("\r\n                                ");
              out.print(rec.getCopiesWithBarcode() );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                        ");
if(displayInRed) { 
              out.write("\r\n                            </font>\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                    <td class = \"ColRow\" align=\"center\" valign=\"top\">\r\n                        ");
if(displayInRed) { 
              out.write("\r\n                            <font color=\"#CC0000\">\r\n                        ");
 } 
              out.write("\r\n        \r\n                        ");
if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                            ");
              out.print(rec.getCopiesWithoutBarcodeReceived() == null ? "0" : rec.getCopiesWithoutBarcodeReceived() );
              out.write('/');
              out.print(rec.getCopiesWithoutBarcode() == null ? "0" : rec.getCopiesWithoutBarcode() );
              out.write("\r\n                        ");
 } else {
              out.write("\r\n                            ");
              out.print(rec.getCopiesWithoutBarcode() == null ? "0" : rec.getCopiesWithoutBarcode() );
              out.write("\r\n                        ");
 } 
              out.write("\r\n                        ");
if(displayInRed) { 
              out.write("\r\n                            </font>\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                    <td class = \"SmallColHeading\" align = \"center\" valign=\"top\" nowrap=\"nowrap\">\r\n                        <table>\r\n                    ");
 if (!form.isPrinterFriendly()) { 
              out.write("\r\n                        ");
 if (!rec.isDeleted()) { 
              out.write("\r\n                            ");
 if (rec.getStatus() == ReturnsSpecs.STATUS_BIB_DENIED) { 
              out.write("\r\n                                <tr align=\"center\">\r\n                                    <td>\r\n                                        Denied\r\n                                    </td>\r\n                                </tr>\r\n                                ");
 if(form.showViewButton(rec)) { 
              out.write("\r\n                                <tr align=\"center\">\r\n                                    <td>\r\n                                        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f16 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f16.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(948,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f16.setSrc("/buttons/small/viewsmall.gif");
              // /cataloging/returnrequestedit.jsp(948,40) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f16.setAbsbottom(false);
              // /cataloging/returnrequestedit.jsp(948,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f16.setAlt( ReturnRequestEditForm.ALT_VIEW_COPIES );
              // /cataloging/returnrequestedit.jsp(948,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f16.setName( ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f16 = _jspx_th_base_005fgenericButton_005f16.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f16);
              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                ");
 } 
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                ");
 if (form.getStore().isStateContext()){ 
              out.write("\r\n                                    ");
if(canModifyStateFields) { 
              out.write("\r\n                                        <tr align=\"center\">\r\n                                            <td>\r\n                                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f17 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f17.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(957,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f17.setSrc("/buttons/small/deny.gif");
              // /cataloging/returnrequestedit.jsp(957,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f17.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(957,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f17.setAlt( ReturnRequestEditForm.ALT_DENY );
              // /cataloging/returnrequestedit.jsp(957,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f17.setName( ReturnRequestEditForm.BUTTON_DENY_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f17 = _jspx_th_base_005fgenericButton_005f17.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f17);
              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        ");
 if(form.showViewButton(rec)) { 
              out.write("\r\n                                        <tr align=\"center\">\r\n                                            <td>\r\n                                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f18 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f18.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(963,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f18.setSrc("/buttons/small/viewsmall.gif");
              // /cataloging/returnrequestedit.jsp(963,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f18.setAbsbottom(false);
              // /cataloging/returnrequestedit.jsp(963,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f18.setAlt( ReturnRequestEditForm.ALT_VIEW_COPIES );
              // /cataloging/returnrequestedit.jsp(963,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f18.setName( ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f18 = _jspx_th_base_005fgenericButton_005f18.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f18);
              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        ");
 } 
              out.write("\r\n                                    ");
 } else { 
              out.write("\r\n                                        ");
 if(rec.getStatus() != ReturnsSpecs.STATUS_BIB_UNKNOWN) { 
              out.write("\r\n                                        <tr align=\"center\">\r\n                                           <td>\r\n                                                ");
              out.print(form.getBibStatusAsString(rec.getStatus()) );
              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        ");
 } 
              out.write("\r\n                                        ");
 if(form.showViewButton(rec)) { 
              out.write("\r\n                                        <tr align=\"center\">\r\n                                            <td>\r\n                                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f19 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f19.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(978,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f19.setSrc("/buttons/small/viewsmall.gif");
              // /cataloging/returnrequestedit.jsp(978,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f19.setAbsbottom(false);
              // /cataloging/returnrequestedit.jsp(978,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f19.setAlt( ReturnRequestEditForm.ALT_VIEW_COPIES );
              // /cataloging/returnrequestedit.jsp(978,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f19.setName( ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f19 = _jspx_th_base_005fgenericButton_005f19.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f19);
              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        ");
 } 
              out.write("\r\n                                    ");
 } 
              out.write("\r\n                                ");
} else { 
              out.write("\r\n                                    ");
if(isEditable) { 
              out.write("\r\n                                        ");
 if (!rec.isDeleted()) { 
              out.write("\r\n                                            <tr align=\"center\">\r\n                                                <td class=\"SmallColHeading\" nowrap>\r\n                                                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f20 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f20.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(988,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setSrc("/icons/general/edit.gif");
              // /cataloging/returnrequestedit.jsp(988,52) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(988,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setAlt( ReturnRequestEditForm.ALT_EDIT );
              // /cataloging/returnrequestedit.jsp(988,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setName( ReturnRequestEditForm.BUTTON_EDIT_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f20 = _jspx_th_base_005fgenericButton_005f20.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f20);
              out.write("\r\n                                                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f21 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f21.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(989,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setSrc("/icons/general/x.gif");
              // /cataloging/returnrequestedit.jsp(989,52) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(989,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setAlt( ReturnRequestEditForm.ALT_REMOVE );
              // /cataloging/returnrequestedit.jsp(989,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setName( ReturnRequestEditForm.BUTTON_REMOVE_PREFIX + counter );
              int _jspx_eval_base_005fgenericButton_005f21 = _jspx_th_base_005fgenericButton_005f21.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f21);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f21);
              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
 }  else {
              out.write("\r\n                                            <tr align=\"center\">\r\n                                                <td class=\"SmallColHeading\">\r\n                                                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f22 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f22.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(995,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setSrc("/icons/general/x.gif");
              // /cataloging/returnrequestedit.jsp(995,52) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(995,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setAlt( ReturnRequestEditForm.ALT_REMOVE );
              // /cataloging/returnrequestedit.jsp(995,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setName( ReturnRequestEditForm.BUTTON_REMOVE_PREFIX + counter );
              int _jspx_eval_base_005fgenericButton_005f22 = _jspx_th_base_005fgenericButton_005f22.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f22);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f22);
              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                         ");
 } 
              out.write("\r\n                                    ");
 } else { 
              out.write("\r\n                                        ");
 if(rec.getStatus() != ReturnsSpecs.STATUS_BIB_UNKNOWN) { 
              out.write("\r\n                                        <tr align=\"center\">\r\n                                            <td>\r\n                                                ");
              out.print(form.getBibStatusAsString(rec.getStatus()) );
              out.write("\r\n                                            </td>\r\n                                        </tr align=\"center\">\r\n                                        ");
 } 
              out.write("\r\n                                        ");
 if(form.showViewButton(rec)) { 
              out.write("\r\n                                        <tr align=\"center\">\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f23 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f23.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(1010,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f23.setSrc("/buttons/small/viewsmall.gif");
              // /cataloging/returnrequestedit.jsp(1010,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f23.setAbsbottom(false);
              // /cataloging/returnrequestedit.jsp(1010,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f23.setAlt( ReturnRequestEditForm.ALT_VIEW_COPIES );
              // /cataloging/returnrequestedit.jsp(1010,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f23.setName( ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f23 = _jspx_th_base_005fgenericButton_005f23.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f23);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f23);
              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        ");
 } 
              out.write("\r\n                                    ");
 } 
              out.write("                                \r\n                                ");
}  
              out.write("\r\n                            ");
}  
              out.write("\r\n                        ");
} else { 
              out.write("\r\n                            ");
 if ((form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED || 
                                   form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_UNSENT) && !form.getStore().isStateContext()) { 
              out.write("\r\n                            ");
 // per AT 24181, deleted titles in submitted returns should still be removeable 
              out.write("\r\n                                <tr align=\"center\">\r\n                                    <td class=\"SmallColHeading\">\r\n                                        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f24 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f24.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(1023,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f24.setSrc("/icons/general/x.gif");
              // /cataloging/returnrequestedit.jsp(1023,40) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f24.setAbsbottom(true);
              // /cataloging/returnrequestedit.jsp(1023,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f24.setAlt( ReturnRequestEditForm.ALT_REMOVE );
              // /cataloging/returnrequestedit.jsp(1023,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f24.setName( ReturnRequestEditForm.BUTTON_REMOVE_PREFIX + counter );
              int _jspx_eval_base_005fgenericButton_005f24 = _jspx_th_base_005fgenericButton_005f24.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f24);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f24);
              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            ");
} else if(form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                                    ");
 if(form.showViewButton(rec)) { 
              out.write("\r\n                                    <tr align=\"center\">\r\n                                        <td class=\"SmallColHeading\">\r\n                                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f25 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f25.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(1030,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f25.setSrc("/buttons/small/viewsmall.gif");
              // /cataloging/returnrequestedit.jsp(1030,44) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f25.setAbsbottom(false);
              // /cataloging/returnrequestedit.jsp(1030,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f25.setAlt( ReturnRequestEditForm.ALT_VIEW_COPIES );
              // /cataloging/returnrequestedit.jsp(1030,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f25.setName( ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f25 = _jspx_th_base_005fgenericButton_005f25.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f25);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f25);
              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
 } 
              out.write("\r\n                            ");
 } 
              out.write("\r\n                        ");
}  
              out.write("\r\n                    ");
 } else if(form.isPrinterFriendly()) { 
              out.write("\r\n                        ");
 if (rec.getStatus() == ReturnsSpecs.STATUS_BIB_DENIED) { 
              out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    Denied\r\n                                </td>\r\n                            </tr>\r\n                        ");
 } else if(rec.getStatus() == ReturnsSpecs.STATUS_BIB_APPROVED) { 
              out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    Approved\r\n                                </td>\r\n                            </tr>\r\n                        ");
 } 
              out.write("\r\n                    ");
 } 
              out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr> \r\n                ");
      counter++;
                    } }
                
              out.write(" \r\n                \r\n                ");
if(!isDenied) { 
              out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td>&nbsp;</td>\r\n                    <td class = \"ColRowBold\">Total</td>\r\n                    <td>&nbsp;</td>\r\n                    <td align=\"center\" class = \"ColRowBold\">\r\n                        ");
if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                            ");
              out.print(totalWithReceived );
              out.write('/');
              out.print(totalWith );
              out.write("\r\n                        ");
 } else {
              out.write("\r\n                            ");
              out.print(totalWith );
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                    <td align=\"center\" class = \"ColRowBold\">\r\n                        ");
if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { 
              out.write("\r\n                            ");
              out.print(totalWithoutReceived );
              out.write('/');
              out.print(totalWithout );
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              out.print(totalWithout );
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                    <td>&nbsp;</td>\r\n                </tr>\r\n                ");
 } 
              out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/returnrequestedit.jsp(1084,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName(ReturnRequestEditForm.FORM_NAME);
              // /cataloging/returnrequestedit.jsp(1084,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty("printerFriendly");
              // /cataloging/returnrequestedit.jsp(1084,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue("false");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write(" \r\n            ");
 if(!form.getStore().isStateContext() && (form.getStatus() == ReturnsSpecs.STATUS_UNSENT || form.getStatus() == ReturnsSpecs.STATUS_SUBMITTED)) { 
                  out.write("    \r\n                <tr>\r\n                    <td colspan=\"2\">\r\n                        ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
                    return;
                  out.write("\r\n                    </td>\r\n                </tr>     \r\n                <tr align=\"center\">\r\n                    <td  colspan=\"2\">\r\n                        ");
                  //  base:helpIcons
                  com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                  _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/returnrequestedit.jsp(1093,24) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
                  int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
                  if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                  out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
 } 
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
              out.write("\r\n    ");
} 
              out.write(' ');
              out.write("    \r\n");
 } 
              out.write("    \r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor_005falign.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor_005falign.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n\r\n<script language=\"javascript\">\r\n<!--\r\nfunction changeReceivingMode(receivingWithBarcodes) {\r\n    document.");
          out.print(ReturnRequestEditForm.FORM_NAME);
          out.write('.');
          out.print(ReturnRequestEditForm.FIELD_RECEIVE_WITH_BARCODE);
          out.write(".value = receivingWithBarcodes;        \r\n    document.");
          out.print(ReturnRequestEditForm.FORM_NAME);
          out.write(".submit();\r\n}\r\nfunction changeShowMoreLess(bibID) {\r\n    document.");
          out.print(ReturnRequestEditForm.FORM_NAME);
          out.write('.');
          out.print(ReturnRequestEditForm.PARAM_EXPAND_ID);
          out.write(".value = bibID;        \r\n    document.");
          out.print(ReturnRequestEditForm.FORM_NAME);
          out.write(".submit();\r\n}\r\n\r\n// -->\r\n</script>\r\n\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n\r\n\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /cataloging/returnrequestedit.jsp(81,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
    int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
    if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /cataloging/returnrequestedit.jsp(447,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("carrierList");
    // /cataloging/returnrequestedit.jsp(447,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /cataloging/returnrequestedit.jsp(447,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/returnrequestedit.jsp(508,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcancelButton_005f0.setAbsbottom(true);
    int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/returnrequestedit.jsp(545,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcancelButton_005f1.setAbsbottom(true);
    int _jspx_eval_base_005fcancelButton_005f1 = _jspx_th_base_005fcancelButton_005f1.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fcloseButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:closeButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
    _jspx_th_base_005fcloseButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcloseButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/returnrequestedit.jsp(564,24) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcloseButton_005f0.setWithX(false);
    int _jspx_eval_base_005fcloseButton_005f0 = _jspx_th_base_005fcloseButton_005f0.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcloseButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:closeButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
    _jspx_th_base_005fcloseButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcloseButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/returnrequestedit.jsp(570,24) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcloseButton_005f1.setWithX(false);
    int _jspx_eval_base_005fcloseButton_005f1 = _jspx_th_base_005fcloseButton_005f1.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fcloseButton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:closeButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
    _jspx_th_base_005fcloseButton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcloseButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/returnrequestedit.jsp(576,23) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcloseButton_005f2.setWithX(false);
    int _jspx_eval_base_005fcloseButton_005f2 = _jspx_th_base_005fcloseButton_005f2.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fsectionHeading_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sectionHeading
    com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
    _jspx_th_base_005fsectionHeading_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsectionHeading_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/returnrequestedit.jsp(605,8) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setPrinterFriendly(false);
    // /cataloging/returnrequestedit.jsp(605,8) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setHeading("Select Titles to Return");
    // /cataloging/returnrequestedit.jsp(605,8) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setTdContent("width='100%' colSpan='2'");
    int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
    if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /cataloging/returnrequestedit.jsp(617,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("searchTypes");
    // /cataloging/returnrequestedit.jsp(617,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("stringCode");
    // /cataloging/returnrequestedit.jsp(617,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /cataloging/returnrequestedit.jsp(618,32) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f0.setAbsbottom(true);
    int _jspx_eval_base_005fgoButton_005f0 = _jspx_th_base_005fgoButton_005f0.doStartTag();
    if (_jspx_th_base_005fgoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /cataloging/returnrequestedit.jsp(730,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/icons/general/nextday.gif");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /cataloging/returnrequestedit.jsp(741,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f2.setSrc("/icons/general/nextday.gif");
    int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
    if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
