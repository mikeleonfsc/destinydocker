package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs;
import org.apache.struts.action.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.util.marc.MarcVO;
import com.follett.fsc.destiny.util.marc.BibType;
import java.util.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;

public final class textbookdetailsupplementstab_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(26,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /cataloging/textbookdetailsupplementstab.jsp(26,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(TextbookDetailForm.FORM_NAME );
      // /cataloging/textbookdetailsupplementstab.jsp(26,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm form = null;
      form = (com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(27,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/textbookdetailsupplementstab.jsp(27,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(request.getAttribute(TextbookDetailForm.FORM_NAME));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n<tr> \r\n   <td valign=\"top\">\r\n    <table id=\"");
      out.print(TextbookDetailForm.TABLE_TEXTBOOK_OUTLINE);
      out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n    <tr>\r\n        <td valign=\"top\" width=\"100%\">\r\n        <table width=\"100%\"><tr><td valign=\"top\">\r\n            <table id=\"");
      out.print(TextbookDetailForm.TABLE_TEXTBOOK_HEADER);
      out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n                <tr>\r\n                    \r\n                    <td valign=\"top\" width=\"100%\">\r\n                        <!-- Title information -->\r\n                        <table id=\"");
      out.print(TextbookDetailForm.TABLE_TEXTBOOK_DETAIL);
      out.write("\" cellpadding=\"2\" cellspacing=\"0\">\r\n                            ");
      out.print( form.getTitleInformation() );
      out.write("\r\n                            <tr>\r\n                              <td colspan=\"2\" align=\"center\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            </table> <!-- end of the titleHeader table-->\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n      <td>\r\n        <table id=\"");
      out.print(TextbookDetailForm.TABLE_SUPPLEMENTS);
      out.write("\" width=\"100%\">\r\n        <tr>\r\n            ");
      //  bean:size
      java.lang.Integer listSize = null;
      org.apache.struts.taglib.bean.SizeTag _jspx_th_bean_005fsize_005f0 = (org.apache.struts.taglib.bean.SizeTag) _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.SizeTag.class);
      _jspx_th_bean_005fsize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fsize_005f0.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(54,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fsize_005f0.setId("listSize");
      // /cataloging/textbookdetailsupplementstab.jsp(54,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fsize_005f0.setName(TextbookDetailForm.FORM_NAME);
      // /cataloging/textbookdetailsupplementstab.jsp(54,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fsize_005f0.setProperty("supplementsList");
      int _jspx_eval_bean_005fsize_005f0 = _jspx_th_bean_005fsize_005f0.doStartTag();
      listSize = (java.lang.Integer) _jspx_page_context.findAttribute("listSize");
      if (_jspx_th_bean_005fsize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
        return;
      }
      listSize = (java.lang.Integer) _jspx_page_context.findAttribute("listSize");
      _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
      out.write("\r\n            ");
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f0.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(55,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setName("listSize");
      // /cataloging/textbookdetailsupplementstab.jsp(55,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setValue("0");
      int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <td>\r\n            ");
 int count = 0; 
          out.write("\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
          // /cataloging/textbookdetailsupplementstab.jsp(58,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("record");
          // /cataloging/textbookdetailsupplementstab.jsp(58,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName(TextbookDetailForm.FORM_NAME);
          // /cataloging/textbookdetailsupplementstab.jsp(58,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setProperty("supplementsList");
          // /cataloging/textbookdetailsupplementstab.jsp(58,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord record = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            record = (com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) _jspx_page_context.findAttribute("record");
            do {
              out.write("\r\n                <table id=\"");
              out.print(TextbookDetailForm.TABLE_SUPPLEMENTS_DETAILS + count);
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"ColRowBold\">\r\n                       ");
              out.print(form.outputTitleAndDetail(request, response, record) );
              out.write("\r\n                    </td>\r\n                    <td class=\"ColRowBold tdAlignRight\">\r\n                        ");
 if (!form.isDistrictUser() || form.isDistrictUserInStateContext()) { 
              out.write("\r\n                            ");
              out.print(form.outputHighLevelAvailability(record) );
              out.write("\r\n                        ");
 } 
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                       ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                       ");
 if (record.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_TEACHERS_EDITION) {
              out.write("\r\n                              Teacher's Edition\r\n      \t\t\t\t\t\t  ");
              //  base:bibTypeIcon
              com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
              _jspx_th_base_005fbibTypeIcon_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fbibTypeIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/textbookdetailsupplementstab.jsp(75,14) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fbibTypeIcon_005f0.setRec( record );
              // /cataloging/textbookdetailsupplementstab.jsp(75,14) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fbibTypeIcon_005f0.setAlt("Teacher's Edition");
              int _jspx_eval_base_005fbibTypeIcon_005f0 = _jspx_th_base_005fbibTypeIcon_005f0.doStartTag();
              if (_jspx_th_base_005fbibTypeIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
              out.write("\r\n                       ");
 } else if (record.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_KIT) {
              out.write("\r\n                              Resource Kit\r\n                              ");
              //  base:bibTypeIcon
              com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f1 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
              _jspx_th_base_005fbibTypeIcon_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fbibTypeIcon_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/textbookdetailsupplementstab.jsp(78,30) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fbibTypeIcon_005f1.setRec( record );
              // /cataloging/textbookdetailsupplementstab.jsp(78,30) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fbibTypeIcon_005f1.setAlt("Resource Kit");
              int _jspx_eval_base_005fbibTypeIcon_005f1 = _jspx_th_base_005fbibTypeIcon_005f1.doStartTag();
              if (_jspx_th_base_005fbibTypeIcon_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005falt_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f1);
              out.write("\r\n                       ");
 } 
              out.write("\r\n                    </td>\r\n                    <td class=\"ColRow tdAlignRight\">\r\n                        ");
              out.print(form.outputOffsiteAvailability(record) );
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td width=\"100%\" colspan=\"2\" valign=\"top\">\r\n                        ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                </tr>\r\n                </table>\r\n\r\n            ");
 count++; 
              out.write("\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              record = (com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) _jspx_page_context.findAttribute("record");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write("\r\n            </td>\r\n            ");
          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
      out.write("\r\n            ");
      if (_jspx_meth_logic_005fequal_005f0(_jspx_page_context))
        return;
      out.write("\r\n            </tr>\r\n        </table>\r\n      </td>\r\n    </tr>\r\n\r\n        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(104,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName(TextbookDetailForm.FORM_NAME);
      // /cataloging/textbookdetailsupplementstab.jsp(104,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("displayTopLink");
      // /cataloging/textbookdetailsupplementstab.jsp(104,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("true");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <tr>\r\n            <td  class=\"SmallColRow tdAlignRight\" vAlign=\"bottom\">\r\n                <a class=\"DetailLink\" href=\"#TheTop\">Top</a>\r\n            </td>\r\n        </tr>\r\n        ");
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
      out.write("\r\n    </table>\r\n        <td valign=\"top\" class=\"tdAlignRight\">\r\n            <!-- Action Button table -->\r\n            ");
 if(form.getPreviousBibID() != null || form.getNextBibID() != null || form.isAddEditDeleteable()) { 
      out.write("\r\n                <table id=\"");
      out.print(TextbookDetailForm.TABLE_ACTION_ICONS);
      out.write("\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n                    ");
      //  base:spanIfAllowed
      com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
      _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fspanIfAllowed_005f0.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(116,20) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fspanIfAllowed_005f0.setPermissions(new Permission[]{Permission.CAT_ADD_TEXTBOOK});
      int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
      if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
          // /cataloging/textbookdetailsupplementstab.jsp(117,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.addEditDeleteable}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("                            \r\n                           <tr>\r\n                                <td class=\"tdAlignRight\">\r\n                                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/textbookdetailsupplementstab.jsp(120,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage( form.getAddTeachersEditionLink() );
              // /cataloging/textbookdetailsupplementstab.jsp(120,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId(TextbookDetailForm.ID_LINK_ADD_TEACHERS_EDITION);
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                        ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/textbookdetailsupplementstab.jsp(121,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/addteachersedition.gif");
                  // /cataloging/textbookdetailsupplementstab.jsp(121,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(TextbookDetailForm.LINK_ADD_TEACHERS_EDITION);
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("\r\n                                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
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
          out.write("\r\n                        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
          // /cataloging/textbookdetailsupplementstab.jsp(126,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.addEditDeleteable}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
          if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("                                       \r\n                            <tr>\r\n                                <td class=\"tdAlignRight\">\r\n                                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
              // /cataloging/textbookdetailsupplementstab.jsp(129,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setPermission( Permission.CAT_ADD_TEXTBOOK );
              // /cataloging/textbookdetailsupplementstab.jsp(129,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setPage( form.getAddResourceKitLink() );
              // /cataloging/textbookdetailsupplementstab.jsp(129,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setId(TextbookDetailForm.ID_LINK_ADD_RESOURCE_KIT);
              int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                                        ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                  // /cataloging/textbookdetailsupplementstab.jsp(130,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/resourcekit.gif");
                  // /cataloging/textbookdetailsupplementstab.jsp(130,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlt(TextbookDetailForm.LINK_ADD_RESOURCE_KIT);
                  int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                  if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                  out.write("\r\n                                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
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
          out.write("\r\n                     ");
          int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
      out.write("\r\n                     <tr>\r\n                        <td nowrap>\r\n                        ");
 if(form.getPreviousBibID() != null) { 
      out.write("\r\n                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f2.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(139,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setPage( form.getPreviousRecordLink() );
      // /cataloging/textbookdetailsupplementstab.jsp(139,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setId(TextbookDetailForm.ID_PREVIOUS_TITLE);
      int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f2.doInitBody();
        }
        do {
          out.write("\r\n                            ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
          // /cataloging/textbookdetailsupplementstab.jsp(140,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setSrc("/icons/general/previouslonger.gif");
          // /cataloging/textbookdetailsupplementstab.jsp(140,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setWidth(44);
          // /cataloging/textbookdetailsupplementstab.jsp(140,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setHeight(26);
          // /cataloging/textbookdetailsupplementstab.jsp(140,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlt(TextbookDetailForm.LINK_PREVIOUS_TITLE);
          int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
          if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
      out.write("\r\n                        ");
 } else { 
      out.write("\r\n                            ");
      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_page_context))
        return;
      out.write("\r\n                        ");
 } 
      out.write("\r\n                        ");
 if(form.getNextBibID() != null) { 
      out.write("\r\n                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f3.setParent(null);
      // /cataloging/textbookdetailsupplementstab.jsp(146,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f3.setPage( form.getNextRecordLink() );
      // /cataloging/textbookdetailsupplementstab.jsp(146,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f3.setId(TextbookDetailForm.ID_NEXT_TITLE);
      int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f3.doInitBody();
        }
        do {
          out.write("\r\n                            ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
          // /cataloging/textbookdetailsupplementstab.jsp(147,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setSrc("/icons/general/nextlonger.gif");
          // /cataloging/textbookdetailsupplementstab.jsp(147,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setWidth(44);
          // /cataloging/textbookdetailsupplementstab.jsp(147,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setHeight(26);
          // /cataloging/textbookdetailsupplementstab.jsp(147,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlt(TextbookDetailForm.LINK_NEXT_TITLE);
          int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
          if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
      out.write("\r\n                        ");
 } else { 
      out.write("\r\n                            ");
      if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_page_context))
        return;
      out.write("\r\n                        ");
 } 
      out.write("\r\n                        </td>\r\n                     </tr>                \r\n                </table>\r\n            ");
 } 
      out.write("\r\n          </td>\r\n        </tr>\r\n      </table>\r\n   </td>\r\n</tr>\r\n\r\n\r\n\r\n");
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

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    // /cataloging/textbookdetailsupplementstab.jsp(42,61) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /cataloging/textbookdetailsupplementstab.jsp(42,61) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/textbookdetailsupplementstab.jsp(72,23) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(15);
    // /cataloging/textbookdetailsupplementstab.jsp(72,23) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/textbookdetailsupplementstab.jsp(87,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /cataloging/textbookdetailsupplementstab.jsp(87,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent(null);
    // /cataloging/textbookdetailsupplementstab.jsp(96,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f0.setName("listSize");
    // /cataloging/textbookdetailsupplementstab.jsp(96,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f0.setValue("0");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              <td align=\"center\" class=\"SmallColHeading\">There are no supplements attached to this textbook.</td>\r\n            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent(null);
    // /cataloging/textbookdetailsupplementstab.jsp(143,28) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(44);
    // /cataloging/textbookdetailsupplementstab.jsp(143,28) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent(null);
    // /cataloging/textbookdetailsupplementstab.jsp(150,28) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(44);
    // /cataloging/textbookdetailsupplementstab.jsp(150,28) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }
}
