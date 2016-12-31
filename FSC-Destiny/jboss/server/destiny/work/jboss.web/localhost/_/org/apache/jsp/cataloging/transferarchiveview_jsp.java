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
import com.follett.fsc.destiny.session.cataloging.data.TransferArchiveViewVO;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.common.MessageHelper;

public final class transferarchiveview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
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

    TransferArchiveViewForm form = (TransferArchiveViewForm)request.getAttribute(TransferArchiveViewForm.FORM_NAME);
    
    boolean haveResults = false;
    SessionStoreProxy store = form.getStore();
    if (form.getTitleList() != null) {
        List<ReturnTitleVO> recList = form.getTitleList();
        haveResults = (recList != null) && (recList.size() > 0);
    }
    boolean deniedReturn = (form.getReturnID() != null && form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_DENIED);

      out.write("\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/transferarchiveview.jsp(45,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handletransferarchiveviewform.do");
      // /cataloging/transferarchiveview.jsp(45,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setStyleId("keywordList");
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
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transferarchiveview.jsp(49,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(TransferArchiveViewForm.PARAM_TRANSFER_ID);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transferarchiveview.jsp(50,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(TransferArchiveViewForm.PARAM_RETURN_ID);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transferarchiveview.jsp(53,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(TransferArchiveViewForm.FORM_NAME );
          // /cataloging/transferarchiveview.jsp(53,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty( GenericForm.PRINTER_FRIENDLY_PARAM );
          // /cataloging/transferarchiveview.jsp(53,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("false");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n    <table width=\"95%\">\r\n        <tr>\r\n            <td class=\"tdAlignRight\">\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transferarchiveview.jsp(57,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setHref("/cataloging/servlet/handletransferarchiveviewform.do?" + GenericForm.BUTTON_PRINTER_FRIENDLY + "=true&" + TransferArchiveViewForm.PARAM_RETURN_ID + "=" + form.getReturnID() + "&" + TransferArchiveViewForm.PARAM_TRANSFER_ID + "=" + form.getTransferID());
              // /cataloging/transferarchiveview.jsp(57,16) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
              // /cataloging/transferarchiveview.jsp(57,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
                  if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005flink_005f0, _jspx_page_context))
                    return;
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
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transferarchiveview.jsp(72,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(TransferArchiveViewForm.TABLE_MAIN);
          // /cataloging/transferarchiveview.jsp(72,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor(bgColor );
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n        <td class=\"TableHeading\" valign=\"top\">\r\n            ");
 if (form.getTransferID() != null) { 
              out.write("\r\n                Completed Transfer ");
              out.print( ResponseUtils.filter(form.getTransferVO().getFromOrTo()) );
              out.write("\r\n            ");
 } else if (form.getReturnID() != null) { 
              out.write("\r\n                ");
 if(form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_DENIED) { 
              out.write("\r\n                Denied Return\r\n                ");
 } else { 
              out.write("\r\n                Completed Return\r\n                ");
 }  
              out.write("\r\n                ");
 if (store.isStateContext()) { 
              out.write("\r\n                    for ");
              out.print(ResponseUtils.filter(form.getReturnVO().getDistrictName()) );
              out.write(' ');
              out.write('-');
              out.write(' ');
              out.print( ResponseUtils.filter(form.getReturnVO().getSiteNameFull()) );
              out.write("\r\n                ");
 } 
              out.write("\r\n            ");
 } 
              out.write("\r\n        </td>\r\n        <td class=\"tdAlignRight\" valign=\"top\">\r\n            ");
 if (!form.isPrinterFriendly()) { 
              out.write("\r\n                ");
              if (_jspx_meth_base_005fcloseButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            ");
 } else  { 
              out.write("\r\n                &nbsp; \r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\" valign=\"top\" colspan=\"2\">\r\n            ");
 if (form.getTransferID() != null) { 
              out.write("\r\n                ");
 if(!StringHelper.isEmptyOrWhitespace(form.getTransferVO().getOrderNumber())) { 
              out.write("\r\n                    <b>Order Number:</b>&nbsp;");
              out.print(form.getTransferVO().getOrderNumber() );
              out.write("\r\n                ");
 } 
              out.write("\r\n            ");
 } else if (form.checkReturnHasRma()) { 
              out.write("\r\n                    <b>RMA:</b>&nbsp;");
              out.print(form.getReturnVO().getRma() );
              out.write("\r\n            ");
 } else { 
              out.write("\r\n                &nbsp;\r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/transferarchiveview.jsp(109,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(TransferArchiveViewForm.FORM_NAME );
              // /cataloging/transferarchiveview.jsp(109,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty( GenericForm.PRINTER_FRIENDLY_PARAM );
              // /cataloging/transferarchiveview.jsp(109,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("false");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  out.print(form.getViewNoteLinkText() );
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
              out.write("    \r\n\r\n\r\n");
 if (form.getReturnID() != null) { 
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\" colspan=\"2\">\r\n            <IMG height=\"1\" vspace=\"1\" src=\"/images/icons/general/line.gif\" width=\"100%\">\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td colspan=\"2\">\r\n            <table id=\"");
              out.print(TransferArchiveViewForm.TABLE_RETURN_FIELDS );
              out.write("\" width=\"100%\">\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         Name\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReturnVO().getName()) );
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         Phone Number\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReturnVO().getPhoneNumber()) );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         Fax\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReturnVO().getFaxNumber()) );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        Email\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReturnVO().getEmail()) );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         Reason for Return\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReturnVO().getReasonForReturn()) );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n            ");
 if (form.getReturnVO().getStatus() != ReturnsSpecs.STATUS_DENIED) { 
              out.write("\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         # Boxes Expected\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(form.getReturnVO().getNumberOfBoxes() == null ? "" : form.getReturnVO().getNumberOfBoxes().toString() );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         # Boxes Received\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(form.getReturnVO().getNumberOfBoxesReceived() == null ? "" : form.getReturnVO().getNumberOfBoxesReceived().toString() );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n                <tr valign=\"top\">\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                         Freight Carrier\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(JSPHelper.filterHtmlAndNulls(form.getReturnVO().getCarrierName()) );
              out.write("    \r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                     <td class=\"ColRowBold tdAlignRight\">\r\n                        Copies Sent\r\n                     </td>\r\n                     <td class=\"ColRow\">\r\n                        ");
              out.print(form.getReturnVO().getTotalNumberOfCopies() );
              out.write("\r\n                     </td>\r\n                 </tr>\r\n                <tr>\r\n                     <td class=\"ColRowBold tdAlignRight\">\r\n                        Copies Received\r\n                     </td>\r\n                     <td class=\"ColRow\">\r\n                        ");
              out.print(form.getReturnVO().getTotalNumberOfCopiesReceived() );
              out.write("\r\n                     </td>\r\n                 </tr>\r\n                ");
 } 
              out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\r\n");
 } 
              out.write("\r\n\r\n\r\n\r\n    <tr>\r\n        <td class=\"TableHeading\" colspan=\"2\">\r\n            <IMG height=\"1\" vspace=\"1\" src=\"/images/icons/general/line.gif\" width=\"100%\">\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan = \"2\">\r\n            <table width = \"100%\" border = \"0\"  cellpadding=\"4\" cellspacing=\"0\" id = \"");
              out.print( TransferArchiveViewForm.TABLE_SEARCH_RESULTS );
              out.write("\">\r\n                ");
 if (!haveResults) { 
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        No matches found.\r\n                    </td>\r\n                </tr>\r\n                ");
 } else { 
              out.write("\r\n                <tr>\r\n                    <td class='SmallColHeading'>&nbsp;</td>\r\n                    <td class='SmallColHeading'>&nbsp;</td>\r\n                    <td class='SmallColHeading'>&nbsp;</td>\r\n                    ");
 if(!deniedReturn) { 
              out.write("\r\n                        <td class='SmallColHeading' align=\"center\" valign=\"bottom\" colspan=\"3\" nowrap>-- Received --</td>\r\n                        <td>&nbsp;</td>\r\n                    ");
 } 
              out.write("\r\n                </tr>\r\n                <tr>\r\n                    <td class='SmallColHeading'>Title</td>\r\n                    <td class='SmallColHeading'>ISBN<br/>Edition</td>\r\n                    <td class='SmallColHeading'>State&nbsp;/&nbsp;Textbook&nbsp;ID<br/>Publisher</td>\r\n                    ");
 if(!deniedReturn) { 
              out.write("\r\n                        <td class='SmallColHeading' align=\"center\">Copies<br/>Sent</td>\r\n                        <td class='SmallColHeading' align=\"center\">With<br/>Barcodes</td>\r\n                        <td class='SmallColHeading' align=\"center\">Without<br/>Barcodes</td>\r\n                        <td>&nbsp;</td>\r\n                    ");
 } 
              out.write("\r\n                </tr>\r\n                ");

                Iterator<ReturnTitleVO> iter = form.getTitleList().iterator();
                int counter = 0;
                int totalAvailable = 0;
                int totalBarcoded = 0;
                int totalBarcodedReceived = 0;
                long totalUnbarcoded = 0;
                long totalUnBarcodedReceived = 0;
                while (iter.hasNext()) {
                    ReturnTitleVO rec = iter.next();
                    totalAvailable += rec.getCopiesAvailable();
                    totalBarcoded += rec.getCopiesWithBarcode();
                    totalBarcodedReceived += rec.getCopiesWithBarcodeReceived();
                    totalUnbarcoded += rec.getCopiesWithoutBarcode() == null ? 0 : rec.getCopiesWithoutBarcode().longValue();
                    totalUnBarcodedReceived += rec.getCopiesWithoutBarcodeReceived() == null ? 0 : rec.getCopiesWithoutBarcodeReceived().longValue();
                    if (counter % 2 == 0) {
                
              out.write("\r\n                    <tr bgcolor=\"");
              out.print( FlipperTag.ROW_GRAY );
              out.write("\" width=\"100%\">\r\n                ");
 } else { 
              out.write(" \r\n                    <tr width=\"100%\">\r\n                ");
 } 
              out.write("\r\n                    <td class = \"ColRow\" valign=\"top\">\r\n                        ");
 if (form.isPrinterFriendly() || rec.isArchived()) { 
              out.write("\r\n                            ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write("\r\n                        ");
 } else { 
              out.write("\r\n                            <a href=\"/cataloging/servlet/presenttextbookdetailform.do?bibID=");
              out.print(rec.getBibID() );
              out.write("\">\r\n                                ");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getTitle()) );
              out.write("\r\n                            </a>\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                    <td class = \"ColRow\">");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getDisplayableIsbnStrippedOfPrefix()) );
              out.write("<br/>");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getEdition()) );
              out.write("</td>\r\n                    <td class = \"ColRow\">");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID()));
              out.write("\r\n                    <br/>");
              out.print(JSPHelper.filterHtmlAndNulls(rec.getPublisher()) );
              out.write("</td>\r\n                    ");
 if(!deniedReturn) { 
              out.write("\r\n                        \r\n                        <td class = \"ColRow\" align=\"center\" valign=\"top\">");
              out.print(rec.getCopiesAvailable() );
              out.write("</td>\r\n                        <td class = \"ColRow\" align=\"center\" valign=\"top\">\r\n                            ");
 if  (rec.getCopiesWithBarcode() != rec.getCopiesWithBarcodeReceived()) { 
              out.write("\r\n                                <font color=\"#CC0000\">");
              out.print(""+rec.getCopiesWithBarcodeReceived() );
              out.write('/');
              out.print(""+rec.getCopiesWithBarcode() );
              out.write("</font>\r\n                            ");
 }  else {
              out.write("\r\n                                ");
              out.print(""+rec.getCopiesWithBarcodeReceived() );
              out.write('/');
              out.print(""+rec.getCopiesWithBarcode() );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                        </td>\r\n                        <td class = \"ColRow\" align=\"center\" valign=\"top\">\r\n                            ");

                                int copiesWithoutBarcode = rec.getCopiesWithoutBarcode() == null ? 0 : rec.getCopiesWithoutBarcode().intValue();
                                int copiesWithoutBarcodeReceived = rec.getCopiesWithoutBarcodeReceived() == null ? 0 : rec.getCopiesWithoutBarcodeReceived().intValue();
                                if  (copiesWithoutBarcode != copiesWithoutBarcodeReceived) { 
              out.write("\r\n                                <font color=\"#CC0000\">");
              out.print(""+copiesWithoutBarcodeReceived );
              out.write('/');
              out.print(""+copiesWithoutBarcode );
              out.write("</font>\r\n                            ");
 }  else {
              out.write("\r\n                                ");
              out.print(""+copiesWithoutBarcodeReceived );
              out.write('/');
              out.print(""+copiesWithoutBarcode );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                        </td>\r\n                        <td align=\"center\" valign=\"top\">\r\n                            ");
 if ((rec.getCopiesWithBarcode() > 0 || form.getTransferID() != null || store.isStateContext()) && !form.isPrinterFriendly()) { 
              out.write("\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/transferarchiveview.jsp(305,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/viewsmall.gif");
              // /cataloging/transferarchiveview.jsp(305,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
              // /cataloging/transferarchiveview.jsp(305,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt( TransferArchiveViewForm.ALT_VIEW );
              // /cataloging/transferarchiveview.jsp(305,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( TransferArchiveViewForm.BUTTON_VIEW_PREFIX + rec.getBibID() );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                &nbsp;\r\n                            ");
 } 
              out.write("\r\n                        </td>\r\n                    ");
 } 
              out.write("\r\n                </tr>    \r\n                ");
 counter++;
                    } 
              out.write(" \r\n                ");
 if(!deniedReturn) { 
              out.write("\r\n                <tr>\r\n                    <td colspan=\"2\">&nbsp;</td>\r\n                    <td class=\"ColRowBold\">Total</td>\r\n                    <td class=\"ColRowBold\" align=\"center\">");
              out.print( String.valueOf(totalAvailable) );
              out.write("</td>    \r\n                    <td class=\"ColRowBold\" align=\"center\">");
              out.print( String.valueOf(totalBarcodedReceived) );
              out.write('/');
              out.print(String.valueOf(totalBarcoded) );
              out.write("</td>    \r\n                    <td class=\"ColRowBold\" align=\"center\">");
              out.print( String.valueOf(totalUnBarcodedReceived) );
              out.write('/');
              out.print( String.valueOf(totalUnbarcoded) );
              out.write("</td>\r\n                </tr>    \r\n                ");
 } 
              out.write(" \r\n            ");
 } 
              out.write(" \r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.reuse(_jspx_th_base_005fform_005f0);
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
    // /cataloging/transferarchiveview.jsp(43,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /cataloging/transferarchiveview.jsp(58,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /cataloging/transferarchiveview.jsp(58,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
    // /cataloging/transferarchiveview.jsp(90,16) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcloseButton_005f0.setWithX(false);
    int _jspx_eval_base_005fcloseButton_005f0 = _jspx_th_base_005fcloseButton_005f0.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
    return false;
  }
}
