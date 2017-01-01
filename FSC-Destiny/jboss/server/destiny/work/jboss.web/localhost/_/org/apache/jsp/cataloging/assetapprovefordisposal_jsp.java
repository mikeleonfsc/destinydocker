package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.session.common.HTMLHelper;
import java.text.DateFormat;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.StringHelper;

public final class assetapprovefordisposal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fassetDisposalMultipleCheckbox_005fitemVO_005fdisplayText_005fchecked_005fcheckBoxName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fassetDisposalMultipleCheckbox_005fitemVO_005fdisplayText_005fchecked_005fcheckBoxName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fassetDisposalMultipleCheckbox_005fitemVO_005fdisplayText_005fchecked_005fcheckBoxName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    AssetApproveForDisposalForm form = (AssetApproveForDisposalForm)request.getAttribute(AssetApproveForDisposalForm.FORM_NAME);

      out.write("\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/assetapprovefordisposal.jsp(19,54) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("items");
      // /cataloging/assetapprovefordisposal.jsp(19,54) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue( form.getAvailableCopies() );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/assetapprovefordisposal.jsp(22,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleassetapprovefordisposalform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetapprovefordisposal.jsp(24,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(form.getDeleteAssetDisposalVO() != null);
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/assetapprovefordisposal.jsp(25,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f0.setProperty(AssetApproveForDisposalForm.PARAM_COPY_ID);
              int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
              if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
              out.write("\r\n    ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
                return;
              out.write("\r\n    ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/assetapprovefordisposal.jsp(27,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
              // /cataloging/assetapprovefordisposal.jsp(27,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setMessage( "Item" + (form.getDeleteAssetDisposalVO().getCopyBarcode() == null ? "" : " " + form.getDeleteAssetDisposalVO().getCopyBarcode()) + " will be deleted.");
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                Are you sure you want to delete this item?\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"center\" class=\"Instruction\" colspan=\"2\">You may want to print this page for your records before proceeding.</td>\r\n        </tr>\r\n        <tr>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                ");
                  if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_base_005fmessageBox_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
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
          out.write("\r\n<br/>\r\n<br/>\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetapprovefordisposal.jsp(46,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId( AssetApproveForDisposalForm.TABLE_APPROVE_FOR_DISPOSAL );
          // /cataloging/assetapprovefordisposal.jsp(46,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellpadding(2);
          // /cataloging/assetapprovefordisposal.jsp(46,0) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellspacing(0);
          // /cataloging/assetapprovefordisposal.jsp(46,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          // /cataloging/assetapprovefordisposal.jsp(46,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading colspan=\"2\"\">\r\n            Resources Needing Approval for Disposal\r\n        </td>\r\n    </tr>\r\n    ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
              if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
                    return;
                  out.write(" \r\n        ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr>\r\n                <td width=\"100%\" colspan=\"2\">\r\n                    ");
                      if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td width=\"100%\" class=\"tdAlignRight\" colspan=\"2\">\r\n                    ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /cataloging/assetapprovefordisposal.jsp(67,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setHref(form.getSelectAllLink() );
                      // /cataloging/assetapprovefordisposal.jsp(67,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setId(AssetApproveForDisposalForm.ID_SELECT_ALL);
                      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                          // /cataloging/assetapprovefordisposal.jsp(68,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/selectall_opaque.gif");
                          // /cataloging/assetapprovefordisposal.jsp(68,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f0.setAlt(AssetApproveForDisposalForm.ALT_SELECT_ALL );
                          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                      out.write("\r\n                    ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /cataloging/assetapprovefordisposal.jsp(70,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setHref(form.getClearAllLink() );
                      // /cataloging/assetapprovefordisposal.jsp(70,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setId(AssetApproveForDisposalForm.ID_CLEAR_ALL);
                      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f1.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                          // /cataloging/assetapprovefordisposal.jsp(71,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/clearall_opaque.gif");
                          // /cataloging/assetapprovefordisposal.jsp(71,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setAlt(AssetApproveForDisposalForm.ALT_CLEAR_ALL );
                          int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                          if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr><td>\r\n            <table id=\"");
                      out.print( AssetApproveForDisposalForm.TABLE_ASSET_DETAIL );
                      out.write("\" cellpadding=\"2\" cellspacing=\"0\" width=\"100%\">  \r\n            ");
                      //  c:forEach
                      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /cataloging/assetapprovefordisposal.jsp(77,12) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${items}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                      // /cataloging/assetapprovefordisposal.jsp(77,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fforEach_005f0.setVar("item");
                      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
                      try {
                        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\r\n                ");
                            com.follett.fsc.destiny.session.cataloging.ejb.data.AssetDisposalVO item = null;
                            synchronized (_jspx_page_context) {
                              item = (com.follett.fsc.destiny.session.cataloging.ejb.data.AssetDisposalVO) _jspx_page_context.getAttribute("item", PageContext.PAGE_SCOPE);
                              if (item == null){
                              throw new java.lang.InstantiationException("bean item not found within scope");
                              }
                            }
                            out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold\">\r\n                        ");
                            out.print( form.getTitleDetailLink(item.getBibTitle(), item.getBibID(), item.getSiteShortName()) );
                            out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\" valign=\"top\" rowspan=\"3\">\r\n                        ");
                            //  base:link
                            com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                            _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                            _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                            // /cataloging/assetapprovefordisposal.jsp(84,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005flink_005f2.setHref(form.getApproveLink(item.getCopyID()) );
                            // /cataloging/assetapprovefordisposal.jsp(84,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005flink_005f2.setId( AssetApproveForDisposalForm.ID_APPROVE_PREFIX + item.getCopyID());
                            int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]++;
                              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f2.doInitBody();
                              }
                              do {
                              out.write("\r\n                            ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                              // /cataloging/assetapprovefordisposal.jsp(85,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/approve_70.gif");
                              // /cataloging/assetapprovefordisposal.jsp(85,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setAlt(AssetApproveForDisposalForm.ALT_APPROVE );
                              int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                              if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]--;
                              }
                            }
                            if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f2);
                              return;
                            }
                            _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f2);
                            //  base:spanIfAllowed
                            com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                            _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
                            _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                            // /cataloging/assetapprovefordisposal.jsp(86,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fspanIfAllowed_005f0.setPermission( Permission.CAT_ASSET_EDIT_ASSET_ITEM );
                            int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
                            if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("<br/>\r\n                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                              // /cataloging/assetapprovefordisposal.jsp(87,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setHref(form.getDeclineLink(item.getCopyID()) );
                              // /cataloging/assetapprovefordisposal.jsp(87,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setId( AssetApproveForDisposalForm.ID_DECLINE_PREFIX + item.getCopyID());
                              int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]++;
                              _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f3.doInitBody();
                              }
                              do {
                              out.write("\r\n                            ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                              // /cataloging/assetapprovefordisposal.jsp(88,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f3.setSrc("/buttons/small/decline.gif");
                              // /cataloging/assetapprovefordisposal.jsp(88,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f3.setAlt(AssetApproveForDisposalForm.ALT_DECLINE );
                              int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                              if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]--;
                              }
                              }
                              if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f3);
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
                            //  base:spanIfAllowed
                            com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                            _jspx_th_base_005fspanIfAllowed_005f1.setPageContext(_jspx_page_context);
                            _jspx_th_base_005fspanIfAllowed_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                            // /cataloging/assetapprovefordisposal.jsp(89,57) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fspanIfAllowed_005f1.setPermission( Permission.CAT_ASSET_DELETE_ASSET_ITEM );
                            int _jspx_eval_base_005fspanIfAllowed_005f1 = _jspx_th_base_005fspanIfAllowed_005f1.doStartTag();
                            if (_jspx_eval_base_005fspanIfAllowed_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("<br/>\r\n                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f1);
                              // /cataloging/assetapprovefordisposal.jsp(90,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setHref(form.getDeleteLink(item.getCopyID()) );
                              // /cataloging/assetapprovefordisposal.jsp(90,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setId( AssetApproveForDisposalForm.ID_DELETE_PREFIX + item.getCopyID());
                              int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]++;
                              _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f4.doInitBody();
                              }
                              do {
                              out.write("\r\n                            ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                              // /cataloging/assetapprovefordisposal.jsp(91,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f4.setSrc("/buttons/small/delete_70.gif");
                              // /cataloging/assetapprovefordisposal.jsp(91,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f4.setAlt(AssetApproveForDisposalForm.ALT_DELETE );
                              int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                              if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]--;
                              }
                              }
                              if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f4);
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                            }
                            if (_jspx_th_base_005fspanIfAllowed_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                              return;
                            }
                            _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                            out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">\r\n                        <span class=\"ColRowBold\">Barcode:</span>&nbsp;");
                            out.print( item.getCopyBarcode() == null ? "" : item.getCopyBarcode() );
                            out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">\r\n                        <span class=\"ColRowBold\">Custodian:</span>&nbsp;");
                            out.print( item.getCustodianName() );
                            out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        ");
 if (StringHelper.isEmptyOrWhitespace(item.getDistrictID())) { 
                            out.write("\r\n                            &nbsp;\r\n                        ");
 } else { 
                            out.write("\r\n                            <span class=\"ColRowBold\">District ID:</span>&nbsp;");
                            out.print( item.getDistrictID() );
                            out.write("\r\n                        ");
 } 
                            out.write("\r\n                    </td>\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n                        ");
                            //  base:assetDisposalMultipleCheckbox
                            com.follett.fsc.destiny.client.common.jsptag.AssetDisposalMultipleCheckboxTag _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.AssetDisposalMultipleCheckboxTag) _005fjspx_005ftagPool_005fbase_005fassetDisposalMultipleCheckbox_005fitemVO_005fdisplayText_005fchecked_005fcheckBoxName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.AssetDisposalMultipleCheckboxTag.class);
                            _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.setPageContext(_jspx_page_context);
                            _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                            // /cataloging/assetapprovefordisposal.jsp(114,24) name = itemVO type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.setItemVO( item );
                            // /cataloging/assetapprovefordisposal.jsp(114,24) name = checked type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.setChecked( form.isCheckboxChecked(item.getCopyID()) );
                            // /cataloging/assetapprovefordisposal.jsp(114,24) name = displayText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.setDisplayText("Select to approve");
                            // /cataloging/assetapprovefordisposal.jsp(114,24) name = checkBoxName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.setCheckBoxName( AssetApproveForDisposalForm.CHECKBOX_PREFIX );
                            int _jspx_eval_base_005fassetDisposalMultipleCheckbox_005f0 = _jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.doStartTag();
                            if (_jspx_th_base_005fassetDisposalMultipleCheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fassetDisposalMultipleCheckbox_005fitemVO_005fdisplayText_005fchecked_005fcheckBoxName_005fnobody.reuse(_jspx_th_base_005fassetDisposalMultipleCheckbox_005f0);
                              return;
                            }
                            _005fjspx_005ftagPool_005fbase_005fassetDisposalMultipleCheckbox_005fitemVO_005fdisplayText_005fchecked_005fcheckBoxName_005fnobody.reuse(_jspx_th_base_005fassetDisposalMultipleCheckbox_005f0);
                            out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n            ");
                            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          return;
                        }
                      } catch (Throwable _jspx_exception) {
                        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                          out = _jspx_page_context.popBody();
                        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
                      } finally {
                        _jspx_th_c_005fforEach_005f0.doFinally();
                        _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
                      }
                      out.write("\r\n            </td></tr>\r\n            </table>\r\n            <tr>\r\n                <td width=\"100%\" colspan=\"2\">\r\n                    ");
                      if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td width=\"100%\" class=\"tdAlignRight\" colspan=\"2\">\r\n                    ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /cataloging/assetapprovefordisposal.jsp(128,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f5.setHref(form.getSelectAllLink() );
                      int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
                      if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f5.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
                          // /cataloging/assetapprovefordisposal.jsp(129,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f5.setSrc("/buttons/small/selectall_opaque.gif");
                          // /cataloging/assetapprovefordisposal.jsp(129,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f5.setAlt(AssetApproveForDisposalForm.ALT_SELECT_ALL );
                          int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
                          if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fhref.reuse(_jspx_th_base_005flink_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fhref.reuse(_jspx_th_base_005flink_005f5);
                      out.write("\r\n                    ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /cataloging/assetapprovefordisposal.jsp(131,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f6.setHref(form.getClearAllLink() );
                      int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
                      if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f6.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f6);
                          // /cataloging/assetapprovefordisposal.jsp(132,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f6.setSrc("/buttons/small/clearall_opaque.gif");
                          // /cataloging/assetapprovefordisposal.jsp(132,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f6.setAlt(AssetApproveForDisposalForm.ALT_CLEAR_ALL );
                          int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
                          if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fhref.reuse(_jspx_th_base_005flink_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fhref.reuse(_jspx_th_base_005flink_005f6);
                      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td width=\"100%\" class=\"tdAlignRight\" colspan=\"2\">\r\n                    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /cataloging/assetapprovefordisposal.jsp(138,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setName(AssetApproveForDisposalForm.BUTTON_APPROVE_SELECTED );
                      // /cataloging/assetapprovefordisposal.jsp(138,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/approveselected.gif");
                      // /cataloging/assetapprovefordisposal.jsp(138,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAlt(AssetApproveForDisposalForm.ALT_APPROVE_SELECTED );
                      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                      out.write("\r\n                </td>\r\n            </tr>\r\n        ");
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
                  out.write("\r\n    ");
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
              out.write("\r\n    \r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write('\r');
          out.write('\n');
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
    // /cataloging/assetapprovefordisposal.jsp(21,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /cataloging/assetapprovefordisposal.jsp(26,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /cataloging/assetapprovefordisposal.jsp(26,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
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

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /cataloging/assetapprovefordisposal.jsp(53,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty items}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n            <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\" align=\"center\" colspan=\"2\">There are no more resource disposals to approve.</td>\r\n            </tr>\r\n        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
