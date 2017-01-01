package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.jsptag.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class holdrequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbookingCalendar_005fpatronID_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbookingCalendar_005fpatronID_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbookingCalendar_005fpatronID_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/holdrequest.jsp(23,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("holdRequestForm");
      // /cataloging/holdrequest.jsp(23,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(HoldRequestForm.FORM_NAME );
      // /cataloging/holdrequest.jsp(23,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.cataloging.servlet.HoldRequestForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.cataloging.servlet.HoldRequestForm holdRequestForm = null;
      holdRequestForm = (com.follett.fsc.destiny.client.cataloging.servlet.HoldRequestForm) _jspx_page_context.findAttribute("holdRequestForm");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
if(!holdRequestForm.isCanPlaceBooking()){ 
      out.write("\r\n\r\n ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f1.setParent(null);
      // /cataloging/holdrequest.jsp(29,1) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
      // /cataloging/holdrequest.jsp(29,1) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setMessage(MessageHelper.formatMessage("holdrequest_UnableToPlaceBookingForThisTitle"));
      int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
      if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f1);
      out.write("\r\n       \r\n\r\n");
} else { 
      out.write("\r\n\r\n<script language=\"javaScript\">\r\n<!--\r\n    window.focus();\r\n    function submitCalendar(month, day, year)\r\n    {\r\n        //If the day is NULL, then submit the form with no day. This will\r\n        //tell the servlet to advance/goback another month\r\n        if (day != -1) {\r\n            document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write('.');
      out.print(HoldRequestForm.PARAM_DAY);
      out.write(".value = day;\r\n        }\r\n\r\n        //Set the other params based on what was passed\r\n        document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write('.');
      out.print(HoldRequestForm.PARAM_MONTH);
      out.write(".value = month;\r\n        document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write('.');
      out.print(HoldRequestForm.PARAM_YEAR);
      out.write(".value  = year;\r\n\r\n        //Submit the form - NOTE no name of the action.\r\n        document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write('.');
      out.print(HoldRequestForm.FIELD_SUBMIT_TYPE);
      out.write(".value = \"");
      out.print(HoldRequestForm.SUBMIT_TYPE_CALENDAR);
      out.write("\";\r\n        document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n    \r\n    function submitHoldOrReserveDropDown()\r\n    {\r\n        document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write('.');
      out.print(HoldRequestForm.BUTTON_CHANGE_HOLD_OR_RESERVE);
      out.write(".value = \"true\";\r\n        document.");
      out.print(HoldRequestForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n// -->\r\n</script>\r\n\r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /cataloging/holdrequest.jsp(62,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setName(HoldRequestForm.FORM_NAME);
      // /cataloging/holdrequest.jsp(62,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setProperty("holdMessageHeader");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr valign=\"top\" align=\"center\">\r\n            <td class=\"ColRowBold\" align=\"center\">");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /cataloging/holdrequest.jsp(66,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName(HoldRequestForm.FORM_NAME);
              // /cataloging/holdrequest.jsp(66,50) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("holdMessageHeader");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("</td>\r\n        </tr>\r\n        ");
              //  logic:present
              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
              _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /cataloging/holdrequest.jsp(68,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f1.setName(HoldRequestForm.FORM_NAME);
              // /cataloging/holdrequest.jsp(68,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f1.setProperty("holdMessage");
              int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
              if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr align=\"center\">\r\n            <td class=\"ColRow\" align=\"center\">");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
                  // /cataloging/holdrequest.jsp(70,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setName(HoldRequestForm.FORM_NAME);
                  // /cataloging/holdrequest.jsp(70,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setProperty("holdMessage");
                  int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                  out.write("</td>\r\n        </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
          out.write("\r\n    ");
          if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      out.write("\r\n\r\n");

    HoldRequestForm form = (HoldRequestForm)request.getAttribute(HoldRequestForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    Long patronID = store.getLoggedInPatronID();
    if (form.isEditingMediaHold()) {
        patronID = form.getPatronIDForMediaHoldToEdit();
    }
    boolean quantityWritten = false;

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/holdrequest.jsp(87,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleholdrequestform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
          _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(88,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f0.setVar("cForm");
          // /cataloging/holdrequest.jsp(88,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f0.setValue(request.getAttribute(HoldRequestForm.FORM_NAME));
          int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
          if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
          out.write("\r\n    ");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
          _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(89,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f1.setVar("optionHold");
          // /cataloging/holdrequest.jsp(89,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f1.setValue(HoldRequestForm.OPTION_HOLD_VALUE);
          int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
          if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
          out.write("\r\n    ");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
          _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
          _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(90,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f2.setVar("optionReserve");
          // /cataloging/holdrequest.jsp(90,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f2.setValue(HoldRequestForm.OPTION_RESERVED_VALUE);
          int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
          if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
          out.write("\r\n    ");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
          _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
          _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(91,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f3.setVar("collectionTypeMedia");
          // /cataloging/holdrequest.jsp(91,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f3.setValue(CollectionType.MEDIA);
          int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
          if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(92,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( HoldRequestForm.FIELD_SUBMIT_TYPE );
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(93,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(HoldRequestForm.FIELD_BIBID);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(94,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(HoldRequestForm.PARAM_PATRON_SITEID);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(95,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(HoldRequestForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(96,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(HoldRequestForm.PARAM_MEDIA_HOLD_ID_TO_EDIT);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(97,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(HoldRequestForm.PARAM_PATRON_ID_FOR_MEDIA_HOLD_TO_EDIT);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f6(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(99,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(HoldRequestForm.PARAM_ORIGINAL_MEDIA_SITE_ID);
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(100,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty(HoldRequestForm.FIELD_RESERVE_ONLY);
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write("\r\n    <input type=\"hidden\" name=\"");
          out.print(HoldRequestForm.BUTTON_CHANGE_HOLD_OR_RESERVE);
          out.write("\" value=\"false\"/>\r\n    <input type=\"hidden\" name=\"");
          out.print(HoldRequestForm.PARAM_MONTH);
          out.write("\" value=\"\">\r\n    <input type=\"hidden\" name=\"");
          out.print(HoldRequestForm.PARAM_DAY);
          out.write("\" value=\"\">\r\n    <input type=\"hidden\" name=\"");
          out.print(HoldRequestForm.PARAM_YEAR);
          out.write("\" value=\"\">\r\n\r\n    ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/holdrequest.jsp(106,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(HoldRequestForm.TABLE_HOLD_REQUEST);
          // /cataloging/holdrequest.jsp(106,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
          // /cataloging/holdrequest.jsp(106,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("95%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n    <td>\r\n    <table cellpadding=\"2\" width=\"100%\" cellspacing =\"0\">\r\n        <tr class=\"TableHeading\">\r\n    ");

        String colSpan = "2";
    
              out.write('\r');
              out.write('\n');
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(114,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");

        colSpan = "3";
    
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
              out.write("\r\n      ");
              //  base:sectionHeading
              com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
              _jspx_th_base_005fsectionHeading_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsectionHeading_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(119,6) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f0.setPrinterFriendly(false);
              // /cataloging/holdrequest.jsp(119,6) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f0.setHeading(MessageHelper.formatMessage("holdrequest_Requesting")  );
              // /cataloging/holdrequest.jsp(119,6) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f0.setTdContent("width='100%' colspan='" + colSpan + "'");
              int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
              if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
              out.write("\r\n        </tr>\r\n");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(123,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
              if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n          <td class=\"ColRowBold\">");
                  out.print( MessageHelper.formatMessage("holdrequest_From") );
                  out.write('\r');
                  out.write('\n');
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                  // /cataloging/holdrequest.jsp(126,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f0.setName(HoldRequestForm.FORM_NAME);
                  // /cataloging/holdrequest.jsp(126,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f0.setProperty(HoldRequestForm.PARAM_DISPLAY_SITE_COMBO_BOX);
                  // /cataloging/holdrequest.jsp(126,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f0.setValue("false");
                  int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            ");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                      // /cataloging/holdrequest.jsp(127,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f2.setProperty(HoldRequestForm.PARAM_DEFAULT_SITE_NAME);
                      // /cataloging/holdrequest.jsp(127,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f2.setName(HoldRequestForm.FORM_NAME);
                      // /cataloging/holdrequest.jsp(127,12) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f2.setFilter(true);
                      int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                      out.write("\r\n            ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                      // /cataloging/holdrequest.jsp(128,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f9.setProperty(HoldRequestForm.FIELD_SITE_ID);
                      int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
                      if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                      out.write('\r');
                      out.write('\n');
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
                  out.write(' ');
                  out.write('\r');
                  out.write('\n');
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                  // /cataloging/holdrequest.jsp(130,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setName(HoldRequestForm.FORM_NAME);
                  // /cataloging/holdrequest.jsp(130,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setProperty(HoldRequestForm.PARAM_DISPLAY_SITE_COMBO_BOX);
                  // /cataloging/holdrequest.jsp(130,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setValue("true");
                  int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            ");
                      //  bean:define
                      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                      // /cataloging/holdrequest.jsp(131,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fdefine_005f1.setId("mediaSites");
                      // /cataloging/holdrequest.jsp(131,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fdefine_005f1.setName(HoldRequestForm.FORM_NAME);
                      // /cataloging/holdrequest.jsp(131,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fdefine_005f1.setProperty(HoldRequestForm.PARAM_SITES);
                      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
                      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                      java.lang.Object mediaSites = null;
                      mediaSites = (java.lang.Object) _jspx_page_context.findAttribute("mediaSites");
                      out.write("\r\n            ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                      // /cataloging/holdrequest.jsp(132,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setProperty( HoldRequestForm.FIELD_SITE_ID );
                      // /cataloging/holdrequest.jsp(132,12) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setOnchange("this.form.submit(); return false;");
                      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                ");
                          if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n            ");
                          int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                      out.write('\r');
                      out.write('\n');
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
                  out.write("\r\n                ");
if((form.getTitleCollectionType() == CollectionType.MEDIA) && !form.isFollettEBook()){
                  out.write("\r\n                    ");
                  //  c:choose
                  org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                  _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                  int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                  if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      // /cataloging/holdrequest.jsp(138,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.editingMediaHold == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                          // /cataloging/holdrequest.jsp(139,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fdefine_005f2.setId("deliveryTypes");
                          // /cataloging/holdrequest.jsp(139,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fdefine_005f2.setName(HoldRequestForm.FORM_NAME);
                          // /cataloging/holdrequest.jsp(139,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fdefine_005f2.setProperty(HoldRequestForm.PARAM_MEDIA_DELIVERY_TYPES);
                          int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
                          java.lang.Object deliveryTypes = null;
                          deliveryTypes = (java.lang.Object) _jspx_page_context.findAttribute("deliveryTypes");
                          out.write("\r\n                        ");
                          //  html:select
                          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                          _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                          // /cataloging/holdrequest.jsp(140,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fselect_005f1.setProperty(HoldRequestForm.FIELD_MEDIA_DELIVERY_TYPE);
                          // /cataloging/holdrequest.jsp(140,24) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fselect_005f1.setOnchange("deliveryMethodSelected();");
                          int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                          if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f1.doInitBody();
                            }
                            do {
                              out.write("\r\n                            ");
                              if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                              return;
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                          out.write("\r\n                    ");
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
                      out.write("\r\n                    ");
                      //  c:otherwise
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          out.print(form.gimmeMediaDeliveryTypeDisplay());
                          out.write("\r\n                        ");
                          //  html:hidden
                          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                          // /cataloging/holdrequest.jsp(146,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fhidden_005f10.setProperty(HoldRequestForm.FIELD_MEDIA_DELIVERY_TYPE);
                          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
                          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                          out.write("    \r\n                    ");
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
                      out.write("\r\n                ");
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
                  out.write("\r\n                ");
} 
                  out.write("\r\n          </td>\r\n");
                  if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n          <td>&nbsp;</td>            \r\n        </tr>\r\n");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
              out.write("\r\n        <tr>\r\n          <td valign=\"top\" width=\"100%\">\r\n            <table id=\"");
              out.print(HoldRequestForm.TABLE_HOLD_OR_RESERVE);
              out.write("\" width=\"100%\">\r\n              <tr> <!-- title info stuff -->\r\n                <td> <!-- icon -->\r\n                  ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(162,18) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setProperty("bibMaterialTypeImgTag");
              // /cataloging/holdrequest.jsp(162,18) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setName(HoldRequestForm.FORM_NAME);
              // /cataloging/holdrequest.jsp(162,18) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setFilter(false);
              int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
              if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
              out.write("\r\n                </td>\r\n                <td class=\"TableHeading\"> <!-- bib title - 245 subfield a -->\r\n                  ");
              out.print(ResponseUtils.filter(holdRequestForm.getTitle()));
              out.write("\r\n                </td>\r\n              </tr>\r\n              <tr>\r\n                <td></td>\r\n                <td class=\"ColRow\"> <!-- bib author-->\r\n                  ");
              out.print(ResponseUtils.filter(holdRequestForm.getAuthor()));
              out.write("\r\n                </td>\r\n              </tr>\r\n");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(174,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName(HoldRequestForm.FORM_NAME);
              // /cataloging/holdrequest.jsp(174,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty( HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE );
              // /cataloging/holdrequest.jsp(174,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue("" + CollectionType.MEDIA);
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n              ");
                  //  c:choose
                  org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                  _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
                  if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                  ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                      // /cataloging/holdrequest.jsp(176,18) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.canPlaceReservesForSelf && !cForm.reserveOnly}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                      <tr>\r\n                        <td></td>\r\n                        <td class=\"ColRowBold\">\r\n                          ");
                          //  html:select
                          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                          _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                          // /cataloging/holdrequest.jsp(180,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fselect_005f2.setProperty(HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE);
                          // /cataloging/holdrequest.jsp(180,26) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fselect_005f2.setOnchange("submitHoldOrReserveDropDown()");
                          int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                          if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n                            ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                              // /cataloging/holdrequest.jsp(181,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f0.setValue(HoldRequestForm.OPTION_HOLD_VALUE);
                              int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                              if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f0.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("holdrequest_AsSoonAsPossible") );
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
                              out.write(" \r\n                            ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                              // /cataloging/holdrequest.jsp(182,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f1.setValue(HoldRequestForm.OPTION_RESERVED_VALUE);
                              int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                              if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f1.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("holdrequest_ReserveForSpecificDate") );
                              out.write(' ');
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
                              out.write("\r\n                          ");
                              int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f2);
                          out.write("\r\n                        </td>\r\n                      </tr>\r\n                  ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                      out.write("\r\n                  ");
                      //  c:otherwise
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                      _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                      int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
                      if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                      ");
                          //  html:hidden
                          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                          _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
                          // /cataloging/holdrequest.jsp(188,22) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fhidden_005f11.setProperty(HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE);
                          int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
                          if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                          out.write("\r\n                  ");
                          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
                      out.write("\r\n              ");
                      int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(192,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(HoldRequestForm.FORM_NAME);
              // /cataloging/holdrequest.jsp(192,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty( HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE );
              // /cataloging/holdrequest.jsp(192,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("" + CollectionType.MEDIA);
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n              ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/holdrequest.jsp(193,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f12.setProperty(HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE);
                  // /cataloging/holdrequest.jsp(193,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f12.setValue(HoldRequestForm.OPTION_RESERVED_VALUE);
                  int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
                  if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                  out.write('\r');
                  out.write('\n');
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
              out.write("\r\n              ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(195,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia || (cForm.holdOrReserve == optionHold && cForm.canHoldMultipleCopiesForSelf) && cForm.copiesOwned > 1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
              if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n              <tr>\r\n                <td></td>\r\n                <td class=\"ColRowBold\">\r\n                    ");
                  out.print(form.buildCopiesOwnedString());
                  out.write("\r\n                    ");
                  if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_c_005fif_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                </td>\r\n              </tr>\r\n              <tr>\r\n                <td></td>\r\n                <td class=\"ColRowBold\">\r\n                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                  // /cataloging/holdrequest.jsp(206,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName(HoldRequestForm.FORM_NAME);
                  // /cataloging/holdrequest.jsp(206,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setProperty( HoldRequestForm.PARAM_EDITING_MEDIA_HOLD );
                  // /cataloging/holdrequest.jsp(206,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("true");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      out.print(form.buildBookCopiesString());
                      out.write("\r\n                    ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /cataloging/holdrequest.jsp(208,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f13.setProperty(HoldRequestForm.FIELD_QUANTITY);
                      int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
                      if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                      out.write("\r\n                    ");
 quantityWritten = true; 
                      out.write("\r\n                ");
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
                  out.write("\r\n                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                  // /cataloging/holdrequest.jsp(211,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setName(HoldRequestForm.FORM_NAME);
                  // /cataloging/holdrequest.jsp(211,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setProperty( HoldRequestForm.PARAM_EDITING_MEDIA_HOLD );
                  // /cataloging/holdrequest.jsp(211,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setValue("false");
                  int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      //  logic:notEqual
                      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                      _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                      // /cataloging/holdrequest.jsp(212,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f1.setName(HoldRequestForm.FORM_NAME);
                      // /cataloging/holdrequest.jsp(212,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f1.setProperty( HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE );
                      // /cataloging/holdrequest.jsp(212,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f1.setValue("" + CollectionType.MEDIA);
                      int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
                      if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                          // /cataloging/holdrequest.jsp(213,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f5.setName(HoldRequestForm.FORM_NAME);
                          // /cataloging/holdrequest.jsp(213,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f5.setProperty( HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE);
                          // /cataloging/holdrequest.jsp(213,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f5.setValue("hold");
                          int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              out.print( MessageHelper.formatMessage("holdrequest_Hold") );
                              out.write("\r\n                        ");
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
                          out.write("\r\n                        ");
                          //  logic:notEqual
                          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                          _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                          // /cataloging/holdrequest.jsp(216,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fnotEqual_005f2.setName(HoldRequestForm.FORM_NAME);
                          // /cataloging/holdrequest.jsp(216,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fnotEqual_005f2.setProperty( HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE);
                          // /cataloging/holdrequest.jsp(216,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fnotEqual_005f2.setValue("hold");
                          int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
                          if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              out.print( MessageHelper.formatMessage("holdrequest_Reserve") );
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fnotEqual_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
                      out.write("                    \r\n                    ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                      // /cataloging/holdrequest.jsp(220,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setName(HoldRequestForm.FORM_NAME);
                      // /cataloging/holdrequest.jsp(220,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setProperty( HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE );
                      // /cataloging/holdrequest.jsp(220,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setValue("" + CollectionType.MEDIA);
                      int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          out.print( MessageHelper.formatMessage("holdrequest_Book") );
                          out.write("\r\n                    ");
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
                      out.write("\r\n                    \r\n                    ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                      // /cataloging/holdrequest.jsp(224,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f7.setName(HoldRequestForm.FORM_NAME);
                      // /cataloging/holdrequest.jsp(224,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f7.setProperty( HoldRequestForm.PARAM_FOLLETT_EBOOK );
                      // /cataloging/holdrequest.jsp(224,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f7.setValue("false");
                      int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        &nbsp;");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                          // /cataloging/holdrequest.jsp(225,30) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f0.setProperty(HoldRequestForm.FIELD_QUANTITY);
                          // /cataloging/holdrequest.jsp(225,30) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f0.setSize("2");
                          // /cataloging/holdrequest.jsp(225,30) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f0.setMaxlength("2");
                          int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                          if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                          out.write("\r\n                        ");
 quantityWritten = true; 
                          out.write("\r\n                        ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                          // /cataloging/holdrequest.jsp(227,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                          int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                          if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            &nbsp;");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
                              // /cataloging/holdrequest.jsp(228,34) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/refreshcalendar.gif");
                              // /cataloging/holdrequest.jsp(228,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setName( HoldRequestForm.BUTTON_REFRESH_CALENDAR );
                              // /cataloging/holdrequest.jsp(228,34) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("holdrequest_RefreshCalendar") );
                              // /cataloging/holdrequest.jsp(228,34) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
                      out.write("\r\n                    ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                      // /cataloging/holdrequest.jsp(231,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f8.setName(HoldRequestForm.FORM_NAME);
                      // /cataloging/holdrequest.jsp(231,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f8.setProperty( HoldRequestForm.PARAM_FOLLETT_EBOOK );
                      // /cataloging/holdrequest.jsp(231,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f8.setValue("true");
                      int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("&nbsp;1");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                      out.write("\r\n                ");
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
                  out.write("\r\n                </td>\r\n              </tr>\r\n              ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                  // /cataloging/holdrequest.jsp(235,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
                  if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                  <tr>\r\n                    <td></td>\r\n                    <td class=\"ColRowBold\">\r\n                    ");
                      out.print( MessageHelper.formatMessage("holdrequest_From") );
                      out.write("&nbsp;");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                      // /cataloging/holdrequest.jsp(239,80) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setProperty(DateRangeTag.FIELD_DATE_FROM);
                      // /cataloging/holdrequest.jsp(239,80) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setSize("9");
                      // /cataloging/holdrequest.jsp(239,80) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setMaxlength("10");
                      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                      out.write("&nbsp;");
                      out.print(MessageHelper.formatMessage("holdrequest_To"));
                      out.write("&nbsp; ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                      // /cataloging/holdrequest.jsp(239,224) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setProperty(DateRangeTag.FIELD_DATE_TO);
                      // /cataloging/holdrequest.jsp(239,224) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setSize("9");
                      // /cataloging/holdrequest.jsp(239,224) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setMaxlength("10");
                      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
                      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                      out.write("\r\n                    </td>\r\n                  </tr>\r\n              ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                  out.write('\r');
                  out.write('\n');
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                  // /cataloging/holdrequest.jsp(243,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setName(HoldRequestForm.FORM_NAME);
                  // /cataloging/holdrequest.jsp(243,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setProperty( HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE );
                  // /cataloging/holdrequest.jsp(243,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setValue("" + CollectionType.MEDIA);
                  int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n              <tr>\r\n                <td/>\r\n                <td class=\"ColRow\">");
                      out.print(form.buildMaxLoanPeriodString());
                      out.write("\r\n                </td>\r\n              </tr>\r\n              ");
                      //  base:spanIfAllowed
                      com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                      _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /cataloging/holdrequest.jsp(249,14) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fspanIfAllowed_005f0.setPermission( Permission.CIRC_OVERRIDE_MEDIA_POLICIES );
                      int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
                      if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n              ");
 if (ObjectHelper.equals(store.getSiteID(), form.getSiteID())) { 
                          out.write("\r\n              <tr>\r\n                <td/>\r\n                <td class=\"ColRow\">\r\n                  ");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                          // /cataloging/holdrequest.jsp(254,18) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f0.setName(HoldRequestForm.FORM_NAME);
                          // /cataloging/holdrequest.jsp(254,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f0.setProperty(HoldRequestForm.FIELD_OVERRIDE_MEDIA_LOAN_PERIOD);
                          int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                          if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                          out.print( MessageHelper.formatMessage("holdrequest_OverrideMediaPolicy") );
                          out.write("\r\n                </td>\r\n              </tr>\r\n              ");
 } 
                          out.write("\r\n              ");
                          int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                      out.write('\r');
                      out.write('\n');
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                  out.write("\r\n              ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
              out.write("\r\n            </table>\r\n          </td>\r\n          \r\n      ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
              if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n          ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                  // /cataloging/holdrequest.jsp(265,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n              ");
                      //  base:bookingCalendar
                      com.follett.fsc.destiny.client.common.jsptag.BookingCalendarTag _jspx_th_base_005fbookingCalendar_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BookingCalendarTag) _005fjspx_005ftagPool_005fbase_005fbookingCalendar_005fpatronID_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BookingCalendarTag.class);
                      _jspx_th_base_005fbookingCalendar_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fbookingCalendar_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                      // /cataloging/holdrequest.jsp(266,14) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fbookingCalendar_005f0.setFormName( HoldRequestForm.FORM_NAME );
                      // /cataloging/holdrequest.jsp(266,14) name = patronID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fbookingCalendar_005f0.setPatronID( patronID );
                      int _jspx_eval_base_005fbookingCalendar_005f0 = _jspx_th_base_005fbookingCalendar_005f0.doStartTag();
                      if (_jspx_th_base_005fbookingCalendar_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fbookingCalendar_005fpatronID_005fformName_005fnobody.reuse(_jspx_th_base_005fbookingCalendar_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fbookingCalendar_005fpatronID_005fformName_005fnobody.reuse(_jspx_th_base_005fbookingCalendar_005f0);
                      out.write("\r\n          ");
                      int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
                  out.write("\r\n          ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                  int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n              ");
 if (!quantityWritten) { 
                      out.write("\r\n                  ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
                      // /cataloging/holdrequest.jsp(270,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f14.setProperty(HoldRequestForm.FIELD_QUANTITY);
                      int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
                      if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                      out.write("\r\n              ");
 } 
                      out.write("\r\n          ");
                      int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
                  out.write("\r\n      ");
                  int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
              out.write("\r\n    <tr>\r\n        <td align='center' colspan='2' nowrap>\r\n            ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/holdrequest.jsp(276,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f0.setId("onSaveTop");
              int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                ");
                  //  base:saveButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
                  _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /cataloging/holdrequest.jsp(277,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsaveButton_005f0.setOnclick("hideElementonSaveTop()");
                  // /cataloging/holdrequest.jsp(277,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsaveButton_005f0.setName( HoldRequestForm.BUTTON_SAVE_HOLD );
                  int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
                  if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
                  out.write("\r\n                ");
                  //  base:cancelButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
                  _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /cataloging/holdrequest.jsp(278,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcancelButton_005f0.setName( HoldRequestForm.BUTTON_CANCEL );
                  int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
                  if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
                  out.write("\r\n            ");
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
              out.write("      \r\n        </td>\r\n    </tr>\r\n    \r\n    </table>\r\n    </td>\r\n    </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\nfunction deliveryMethodSelected() {\r\n    document.");
          out.print(HoldRequestForm.FORM_NAME);
          out.write('.');
          out.print(HoldRequestForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED);
          out.write(".value = \"true\";\r\n    document.");
          out.print(HoldRequestForm.FORM_NAME);
          out.write(".submit();\r\n}\r\n\r\n//-->\r\n</script>\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n\r\n");
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
    // /cataloging/holdrequest.jsp(25,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /cataloging/holdrequest.jsp(63,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /cataloging/holdrequest.jsp(63,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /cataloging/holdrequest.jsp(74,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(1);
    // /cataloging/holdrequest.jsp(74,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/holdrequest.jsp(98,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("currentDate");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
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
    // /cataloging/holdrequest.jsp(133,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("mediaSites");
    // /cataloging/holdrequest.jsp(133,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /cataloging/holdrequest.jsp(133,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
    // /cataloging/holdrequest.jsp(141,28) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("deliveryTypes");
    // /cataloging/holdrequest.jsp(141,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("longID");
    // /cataloging/holdrequest.jsp(141,28) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /cataloging/holdrequest.jsp(151,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n          <td>&nbsp;</td>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /cataloging/holdrequest.jsp(200,20) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_holds_new_hold_req_copies_def.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }
}
