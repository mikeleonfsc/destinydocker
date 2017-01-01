package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.MessageHelper;

public final class patronstatsdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ftarget_005fdisableIntercepter_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fescapeXml_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ftarget_005fdisableIntercepter_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fescapeXml_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ftarget_005fdisableIntercepter_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fescapeXml_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/patronstatsdetail.jsp(23,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/patronstatsdetail.jsp(23,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_PatronStatsDetailForm");
      // /backoffice/patronstatsdetail.jsp(23,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("PatronStatsDetailForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      PatronStatsDetailForm form = null;
      form = (PatronStatsDetailForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/patronstatsdetail.jsp(24,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("list");
      // /backoffice/patronstatsdetail.jsp(24,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName("backoffice_servlet_PatronStatsDetailForm");
      // /backoffice/patronstatsdetail.jsp(24,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("list");
      // /backoffice/patronstatsdetail.jsp(24,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setType("ArrayList");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      ArrayList list = null;
      list = (ArrayList) _jspx_page_context.findAttribute("list");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /backoffice/patronstatsdetail.jsp(25,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("rowCount");
      // /backoffice/patronstatsdetail.jsp(25,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName("backoffice_servlet_PatronStatsDetailForm");
      // /backoffice/patronstatsdetail.jsp(25,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("rowCount");
      // /backoffice/patronstatsdetail.jsp(25,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setType("Integer");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      Integer rowCount = null;
      rowCount = (Integer) _jspx_page_context.findAttribute("rowCount");
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ftarget_005fdisableIntercepter_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/patronstatsdetail.jsp(27,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/presentpatronstatsdetailform.do");
      // /backoffice/patronstatsdetail.jsp(27,0) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setTarget("printerFriendly");
      // /backoffice/patronstatsdetail.jsp(27,0) name = disableIntercepter type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setDisableIntercepter(true);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f1(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f3(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f4(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f5(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f6(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f7(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f8(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    <input type=\"hidden\" name=\"");
          out.print(PatronStatsDetailForm.PARAM_PRINTER_FRIENDLY );
          out.write("\" value=\"on\">\r\n    ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(39,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fforEach_005f0.setVar("patronType");
          // /backoffice/patronstatsdetail.jsp(39,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fforEach_005f0.setItems( form.getPatronTypeLimiter() );
          int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
          try {
            int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
            if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n        ");
                if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                  return;
                out.write("\r\n        <input type=\"hidden\" name=\"patronTypeLimiter\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${patronTypeEscaped}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("\">\r\n    ");
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
          out.write("\r\n\r\n    <table id=\"");
          out.print(PatronStatsDetailForm.TABLE_OUTER);
          out.write("\" width=\"100%\" border=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n            <td>\r\n                <table id=\"");
          out.print(PatronStatsDetailForm.TABLE_PRINTER_FRIENDLY_HEADER);
          out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                    <tr>\r\n                    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(49,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName("backoffice_servlet_PatronStatsDetailForm");
          // /backoffice/patronstatsdetail.jsp(49,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("print");
          // /backoffice/patronstatsdetail.jsp(49,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        <td class=\"MainHeader\" align=\"center\">");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patronstatsdetail.jsp(50,62) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName( form.FORM_NAME );
              // /backoffice/patronstatsdetail.jsp(50,62) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("siteName");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"SmallColHeading\" align=\"center\">");
              out.print(MessageHelper.formatMessage("patronstatsdetail_PatronStatistics") );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRow\" align=\"center\">\r\n                        ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patronstatsdetail.jsp(57,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setName( form.FORM_NAME );
              // /backoffice/patronstatsdetail.jsp(57,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setProperty("printerFriendlySubTitle");
              int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
              if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
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
          out.write("\r\n                    ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(61,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f0.setName("backoffice_servlet_PatronStatsDetailForm");
          // /backoffice/patronstatsdetail.jsp(61,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f0.setProperty("print");
          // /backoffice/patronstatsdetail.jsp(61,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f0.setValue("true");
          int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        <TD class=Instruction vAlign=top>");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
              // /backoffice/patronstatsdetail.jsp(62,57) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setName( form.FORM_NAME );
              // /backoffice/patronstatsdetail.jsp(62,57) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setProperty("pageTitle");
              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
              out.write("</TD>\r\n                        <td class=\"SmallColRow tdAlignRight\">\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
              // /backoffice/patronstatsdetail.jsp(64,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(PatronStatsDetailForm.BUTTON_PRINTER_FRIENDLY );
              // /backoffice/patronstatsdetail.jsp(64,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/printerfriendly.gif");
              // /backoffice/patronstatsdetail.jsp(64,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("printable") );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
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
          out.write("\r\n                </table>\r\n\r\n                <table id=\"colheading1\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                    <tr bgColor=\"");
          out.print(DestinyColors.BACKGROUND);
          out.write("\">\r\n                        <TD class=\"InverseSmallColHeading\" align=\"center\" width=\"30%\">");
          out.print(MessageHelper.formatMessage("patronstatsdetail_Patron") );
          out.write("</TD>\r\n                        <TD class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</TD>\r\n                        <TD class=\"InverseSmallColHeading\" align=\"center\" colspan=\"4\" width=\"80%\">");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(74,98) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setName( form.FORM_NAME );
          // /backoffice/patronstatsdetail.jsp(74,98) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setProperty("circulationHeading");
          int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
          if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
          out.write(" </TD>\r\n                    </tr>\r\n                </table>\r\n\r\n                <table id=\"");
          out.print(PatronStatsDetailForm.TABLE_CONTENTS);
          out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\" border=\"0\">\r\n                    <tr>\r\n                        <td class=\"SmallColHeading\" colspan=\"2\">\r\n                           &nbsp;\r\n                        </td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
          out.print(MessageHelper.formatMessage("patronstatsdetail_Today") );
          out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
          out.print(MessageHelper.formatMessage("patronstatsdetail_ThisMonth") );
          out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
          out.print(MessageHelper.formatMessage("patronstatsdetail_ThisYear") );
          out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
          out.print(MessageHelper.formatMessage("patronstatsdetail_Total") );
          out.write("</td>\r\n                    </tr>\r\n                    ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(88,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("detailRow");
          // /backoffice/patronstatsdetail.jsp(88,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName("list");
          // /backoffice/patronstatsdetail.jsp(88,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.PatronDetailStatisticsReportRow");
          // /backoffice/patronstatsdetail.jsp(88,20) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setIndexId("detailIndex");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            com.follett.fsc.destiny.session.backoffice.data.PatronDetailStatisticsReportRow detailRow = null;
            java.lang.Integer detailIndex = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            detailRow = (com.follett.fsc.destiny.session.backoffice.data.PatronDetailStatisticsReportRow) _jspx_page_context.findAttribute("detailRow");
            detailIndex = (java.lang.Integer) _jspx_page_context.findAttribute("detailIndex");
            do {
              out.write("\r\n               ");
              out.write("\r\n               ");
              out.write("\r\n               ");
 if (detailRow.getPatronBarcode() != null) { 
              out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\">\r\n                            <span class=\"ColRowBold\">");
              if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</span><span class=\"ColRow\"> (");
              if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write(':');
              out.write(' ');
              if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write(")</span>\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
              out.write("\r\n                ");
 } else { 
              out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print(MessageHelper.formatMessage("patronstatsdetail_Patrons", Long.valueOf(Integer.valueOf(form.getRowCount()).longValue())));
              out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/patronstatsdetail.jsp(117,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f7.setName( form.FORM_NAME );
              // /backoffice/patronstatsdetail.jsp(117,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f7.setProperty("circulationHeading");
              int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
              if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
              out.write(":</td>\r\n\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                    </tr>\r\n                    ");
              out.write("\r\n                ");
 } 
              out.write("\r\n                    ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              detailRow = (com.follett.fsc.destiny.session.backoffice.data.PatronDetailStatisticsReportRow) _jspx_page_context.findAttribute("detailRow");
              detailIndex = (java.lang.Integer) _jspx_page_context.findAttribute("detailIndex");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write("\r\n                </table><!-- End of content table -->\r\n                <br>\r\n\r\n                <table id=\"");
          out.print(PatronStatsDetailForm.TABLE_SUMMARY);
          out.write("\" cellspacing=\"0\" cellpadding=\"4\" border=\"0\" align=\"center\">\r\n                <tr>\r\n                <td class=\"Instruction\" align=\"center\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(144,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f8.setName( form.FORM_NAME );
          // /backoffice/patronstatsdetail.jsp(144,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f8.setProperty("reportOptionsDescription");
          int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
          if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
          out.write("\r\n                </td>\r\n                </tr>\r\n                </table>\r\n\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatsdetail.jsp(149,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName("backoffice_servlet_PatronStatsDetailForm");
          // /backoffice/patronstatsdetail.jsp(149,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty("print");
          // /backoffice/patronstatsdetail.jsp(149,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("true");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <div align=\"center\"><span class=\"Instruction\">");
              out.print(MessageHelper.formatMessage("patronstatsdetail_ReportGeneratedOn", form.getTimeOfGeneration(session)) );
              out.write("\r\n\t\t\t\t\t<br></span></div>\r\n                ");
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
          out.write("\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005ftarget_005fdisableIntercepter_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005ftarget_005fdisableIntercepter_005faction.reuse(_jspx_th_base_005fform_005f0);
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
    // /backoffice/patronstatsdetail.jsp(21,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(29,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("reportSiteID");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(30,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("primaryGroup");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(31,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("primaryGroupData");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(32,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("secondaryGroup");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(33,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("secondaryGroupData");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(34,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("includeActive");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
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
    // /backoffice/patronstatsdetail.jsp(35,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("includeInactive");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(36,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f7.setProperty("includeRestricted");
    int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
    if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/patronstatsdetail.jsp(37,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f8.setProperty("librarySelected");
    int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
    if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /backoffice/patronstatsdetail.jsp(40,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f0.setVar("patronTypeEscaped");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fset_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fescapeXml_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
    // /backoffice/patronstatsdetail.jsp(40,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${patronType}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/patronstatsdetail.jsp(40,39) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setEscapeXml(true);
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fescapeXml_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fescapeXml_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(94,53) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f4.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(94,53) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f4.setProperty("patronName");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(94,135) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(94,135) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setProperty("patronType");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(94,189) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(94,189) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setProperty("patronBarcode");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(97,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(97,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setCount("todayCircCount");
    // /backoffice/patronstatsdetail.jsp(97,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setCountClass("ColRow");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f0 = _jspx_th_base_005fnumberPercentageReportCellTag_005f0.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(100,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(100,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setCount("thisMonthCircCount");
    // /backoffice/patronstatsdetail.jsp(100,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setCountClass("ColRow");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f1 = _jspx_th_base_005fnumberPercentageReportCellTag_005f1.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(103,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(103,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setCount("thisYearCircCount");
    // /backoffice/patronstatsdetail.jsp(103,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setCountClass("ColRow");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f2 = _jspx_th_base_005fnumberPercentageReportCellTag_005f2.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(106,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(106,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setCount("totalCircCount");
    // /backoffice/patronstatsdetail.jsp(106,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setCountClass("ColRow");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f3 = _jspx_th_base_005fnumberPercentageReportCellTag_005f3.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(113,87) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /backoffice/patronstatsdetail.jsp(113,87) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(120,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(120,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setCount("todayCircCount");
    // /backoffice/patronstatsdetail.jsp(120,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f4 = _jspx_th_base_005fnumberPercentageReportCellTag_005f4.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(123,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(123,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setCount("thisMonthCircCount");
    // /backoffice/patronstatsdetail.jsp(123,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f5 = _jspx_th_base_005fnumberPercentageReportCellTag_005f5.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(126,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(126,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setCount("thisYearCircCount");
    // /backoffice/patronstatsdetail.jsp(126,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f6 = _jspx_th_base_005fnumberPercentageReportCellTag_005f6.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatsdetail.jsp(129,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setName("detailRow");
    // /backoffice/patronstatsdetail.jsp(129,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setCount("totalCircCount");
    // /backoffice/patronstatsdetail.jsp(129,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f7 = _jspx_th_base_005fnumberPercentageReportCellTag_005f7.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f7);
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
    // /backoffice/patronstatsdetail.jsp(133,87) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /backoffice/patronstatsdetail.jsp(133,87) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
