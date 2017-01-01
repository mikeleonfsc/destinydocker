package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.cataloging.data.CallNumberPatternVO;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class listcallnumberpatterns_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fvalue_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fvalue_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fvalue_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");
 ListCallNumberPatternsForm form = (ListCallNumberPatternsForm)request.getAttribute(ListCallNumberPatternsForm.FORM_NAME); 
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/listcallnumberpatterns.jsp(21,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/listcallnumberpatterns.jsp(21,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(request.getAttribute(ListCallNumberPatternsForm.FORM_NAME));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/listcallnumberpatterns.jsp(22,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("javaForm");
      // /cataloging/listcallnumberpatterns.jsp(22,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("cataloging_servlet_ListCallNumberPatternsForm");
      // /cataloging/listcallnumberpatterns.jsp(22,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.cataloging.servlet.ListCallNumberPatternsForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.cataloging.servlet.ListCallNumberPatternsForm javaForm = null;
      javaForm = (com.follett.fsc.destiny.client.cataloging.servlet.ListCallNumberPatternsForm) _jspx_page_context.findAttribute("javaForm");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/listcallnumberpatterns.jsp(26,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlelistcallnumberpatternsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/listcallnumberpatterns.jsp(27,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          // /cataloging/listcallnumberpatterns.jsp(27,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(ListCallNumberPatternsForm.TABLE_MAPPINGS );
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" class=\"TableHeading\">");
              out.print( MessageHelper.formatMessage("listcallnumberpatterns_CallNumberPatternMappings") );
              out.write("</td>\r\n        <td class=\"tdAlignRight\">\r\n            ");
              if (_jspx_meth_base_005fcloseButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("listcallnumberpatterns_CirculationType") );
              out.write("</td>\r\n        <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("listcallnumberpatterns_CallNumberPatterns") );
              out.write("</td>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n    ");
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/listcallnumberpatterns.jsp(39,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fset_005f1.setVar("circTypeIDParam");
              // /cataloging/listcallnumberpatterns.jsp(39,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fset_005f1.setValue( UpdateCallNumbersForm.PARAM_CIRC_TYPE_ID );
              int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
              if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
              out.write("\r\n    ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/listcallnumberpatterns.jsp(40,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fforEach_005f0.setVar("circType");
              // /cataloging/listcallnumberpatterns.jsp(40,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.circTypes}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
              int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
              try {
                int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n    ");
                    CallNumberPatternVO circType = null;
                    synchronized (_jspx_page_context) {
                      circType = (CallNumberPatternVO) _jspx_page_context.getAttribute("circType", PageContext.PAGE_SCOPE);
                      if (circType == null){
                        throw new java.lang.InstantiationException("bean circType not found within scope");
                      }
                    }
                    out.write("\r\n        ");
                    //  base:flipper
                    com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
                    _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
                    _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                    // /cataloging/listcallnumberpatterns.jsp(42,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                    _jspx_th_base_005fflipper_005f0.setKey("listcallnumber");
                    int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
                    if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n            <td class=\"ColRow\">");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${circType.circTypeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                        out.write("</td>\r\n            <td class=\"ColRow\">");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${circType.callNumberPatternList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                        out.write("</td>\r\n            <td class=\"ColRow tdAlignRight\">\r\n                ");
                        //  bean:define
                        org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fvalue_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                        _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
                        _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
                        // /cataloging/listcallnumberpatterns.jsp(46,16) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                        _jspx_th_bean_005fdefine_005f1.setId("circulationTypeName");
                        // /cataloging/listcallnumberpatterns.jsp(46,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                        _jspx_th_bean_005fdefine_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${circType.circTypeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                        int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
                        if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fbean_005fdefine_005fvalue_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                          return;
                        }
                        _005fjspx_005ftagPool_005fbean_005fdefine_005fvalue_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                        java.lang.String circulationTypeName = null;
                        circulationTypeName = (java.lang.String) _jspx_page_context.findAttribute("circulationTypeName");
                        out.write("\r\n                ");
                        //  base:link
                        com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                        _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                        _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
                        // /cataloging/listcallnumberpatterns.jsp(47,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                        _jspx_th_base_005flink_005f0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/backoffice/servlet/presentupdatecallnumbersform.do?${circTypeIDParam}=${circType.circTypeID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                        // /cataloging/listcallnumberpatterns.jsp(47,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                        _jspx_th_base_005flink_005f0.setId(ListCallNumberPatternsForm.ID_BUTTON_EDIT + circType.getCircTypeID());
                        int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_c_005fforEach_005f0[0]++;
                            _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_base_005flink_005f0.doInitBody();
                          }
                          do {
                            out.write("\r\n                    ");
                            //  base:image
                            com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                            _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                            _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                            // /cataloging/listcallnumberpatterns.jsp(48,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/editsmall.gif");
                            // /cataloging/listcallnumberpatterns.jsp(48,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                            _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("edit") );
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
                            _jspx_push_body_count_c_005fforEach_005f0[0]--;
                          }
                        }
                        if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                          return;
                        }
                        _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                        out.write("\r\n            </td>\r\n        ");
                        int evalDoAfterBody = _jspx_th_base_005fflipper_005f0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_base_005fflipper_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
                      return;
                    }
                    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
                    out.write("\r\n    ");
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
              out.write("\r\n  </td>\r\n</tr>\r\n\r\n");
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
    // /cataloging/listcallnumberpatterns.jsp(24,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
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
    // /cataloging/listcallnumberpatterns.jsp(31,12) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcloseButton_005f0.setWithX(true);
    int _jspx_eval_base_005fcloseButton_005f0 = _jspx_th_base_005fcloseButton_005f0.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
    return false;
  }
}
