package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class powersearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromVisualSetup_005ffromBasicSearch_005fawardNameID_005fawardGroupID_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromVisualSetup_005ffromBasicSearch_005fawardNameID_005fawardGroupID_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromVisualSetup_005ffromBasicSearch_005fawardNameID_005fawardGroupID_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    boolean isMediaSiteUser = store.isMediaBookingUser();
    boolean allowReadingAndInterestLevel = store.isAllowReadingLevelAndInterestLevelSearches();
    PowerSearchVO vo = (PowerSearchVO)request.getAttribute("powerSearchVO");

      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/powersearch.jsp(22,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("powerSearchTypesList");
      // /cataloging/powersearch.jsp(22,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(22,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("powerSearchTypesList");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object powerSearchTypesList = null;
      powerSearchTypesList = (java.lang.Object) _jspx_page_context.findAttribute("powerSearchTypesList");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /cataloging/powersearch.jsp(23,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("advancedSearchOptions1");
      // /cataloging/powersearch.jsp(23,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(23,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("advancedSearchOptions1");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object advancedSearchOptions1 = null;
      advancedSearchOptions1 = (java.lang.Object) _jspx_page_context.findAttribute("advancedSearchOptions1");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /cataloging/powersearch.jsp(24,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("advancedSearchOptions2");
      // /cataloging/powersearch.jsp(24,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(24,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("advancedSearchOptions2");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      java.lang.Object advancedSearchOptions2 = null;
      advancedSearchOptions2 = (java.lang.Object) _jspx_page_context.findAttribute("advancedSearchOptions2");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f3.setParent(null);
      // /cataloging/powersearch.jsp(25,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setId("advancedSearchOptions3");
      // /cataloging/powersearch.jsp(25,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(25,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setProperty("advancedSearchOptions3");
      int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
      if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
      java.lang.Object advancedSearchOptions3 = null;
      advancedSearchOptions3 = (java.lang.Object) _jspx_page_context.findAttribute("advancedSearchOptions3");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f4.setParent(null);
      // /cataloging/powersearch.jsp(26,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setId("readingProgramOptions");
      // /cataloging/powersearch.jsp(26,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setType("java.util.Collection");
      // /cataloging/powersearch.jsp(26,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(26,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setProperty( PowerSearchVO.PARAM_READING_PROGRAM_OPTIONS );
      int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
      if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
      java.util.Collection readingProgramOptions = null;
      readingProgramOptions = (java.util.Collection) _jspx_page_context.findAttribute("readingProgramOptions");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f5.setParent(null);
      // /cataloging/powersearch.jsp(27,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f5.setId("lexileCodeList");
      // /cataloging/powersearch.jsp(27,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f5.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(27,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f5.setProperty("lexileCodeList");
      int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
      if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
      java.lang.Object lexileCodeList = null;
      lexileCodeList = (java.lang.Object) _jspx_page_context.findAttribute("lexileCodeList");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f6.setParent(null);
      // /cataloging/powersearch.jsp(28,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f6.setId("fountasAndPinnellList");
      // /cataloging/powersearch.jsp(28,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f6.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(28,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f6.setProperty("fountasAndPinnellList");
      int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
      if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
      java.lang.Object fountasAndPinnellList = null;
      fountasAndPinnellList = (java.lang.Object) _jspx_page_context.findAttribute("fountasAndPinnellList");
      out.write("\r\n    ");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f7.setParent(null);
      // /cataloging/powersearch.jsp(29,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f7.setId("interestGradeLevelList");
      // /cataloging/powersearch.jsp(29,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f7.setName(vo.getFormName());
      // /cataloging/powersearch.jsp(29,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f7.setProperty("interestGradeLevelList");
      int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
      if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
      java.lang.Object interestGradeLevelList = null;
      interestGradeLevelList = (java.lang.Object) _jspx_page_context.findAttribute("interestGradeLevelList");
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n  <!--\r\n    function submitDropDown() {\r\n        document.");
      out.print(vo.getFormName());
      out.write('.');
      out.print(PowerSearchVO.PARAM_NAME_REDISPLAY);
      out.write(".value = \"true\";\r\n        document.");
      out.print(vo.getFormName());
      out.write(".submit();\r\n    }\r\n  // -->\r\n</script>\r\n\r\n    <table id=\"");
      out.print(PowerSearchVO.TABLE_ADVANCED_SEARCH);
      out.write("\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n        <tr>\r\n            <td class=\"FormLabel tdAlignRight\">\r\n                ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f0.setParent(null);
      // /cataloging/powersearch.jsp(43,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f0.setProperty( PowerSearchVO.FIELD_INDEX_TYPE_1 );
      // /cataloging/powersearch.jsp(43,16) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f0.setOnchange("submitDropDown()");
      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f0.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
            return;
          out.write("\r\n                ");
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
      out.write("\r\n            </td>\r\n            <td>\r\n                ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent(null);
      // /cataloging/powersearch.jsp(48,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setProperty( PowerSearchVO.FIELD_SEARCH_TERM_1 );
      // /cataloging/powersearch.jsp(48,16) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setSize("35");
      // /cataloging/powersearch.jsp(48,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setMaxlength("80");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      out.write("\r\n            </td>\r\n            <td class=\"FormElement\">\r\n                ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f1.setParent(null);
      // /cataloging/powersearch.jsp(51,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f1.setProperty( PowerSearchVO.FIELD_WORD_PHRASE_SELECT_1 );
      int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
      if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f1.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
            return;
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
      out.write("\r\n            </td>\r\n        </tr>\r\n              \r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td align=\"center\" class=\"FormLabel\">\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f0.setParent(null);
      // /cataloging/powersearch.jsp(60,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setProperty( PowerSearchVO.FIELD_BOOLEAN_OPERATOR_1 );
      // /cataloging/powersearch.jsp(60,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setValue( String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_AND) );
      // /cataloging/powersearch.jsp(60,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setOnclick("submitDropDown()");
      int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
      if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
      out.print( MessageHelper.formatMessage("powersearch_AND") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f1.setParent(null);
      // /cataloging/powersearch.jsp(61,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setProperty( PowerSearchVO.FIELD_BOOLEAN_OPERATOR_1 );
      // /cataloging/powersearch.jsp(61,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setValue( String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_OR) );
      // /cataloging/powersearch.jsp(61,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setOnclick("submitDropDown()");
      int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
      if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
      out.print( MessageHelper.formatMessage("powersearch_OR") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f2.setParent(null);
      // /cataloging/powersearch.jsp(62,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setProperty( PowerSearchVO.FIELD_BOOLEAN_OPERATOR_1 );
      // /cataloging/powersearch.jsp(62,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setValue( String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_NOT) );
      // /cataloging/powersearch.jsp(62,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setOnclick("submitDropDown()");
      int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
      if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f2);
      out.print( MessageHelper.formatMessage("powersearch_NOT") );
      out.write("</td>\r\n\t\t    <td>");
      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n              \r\n        <tr>\r\n            <td class=\"FormLabel tdAlignRight\">\r\n                ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f2.setParent(null);
      // /cataloging/powersearch.jsp(68,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f2.setProperty( PowerSearchVO.FIELD_INDEX_TYPE_2 );
      // /cataloging/powersearch.jsp(68,16) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f2.setOnchange("submitDropDown()");
      int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
      if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f2.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f2, _jspx_page_context))
            return;
          out.write("\r\n                ");
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
      out.write("\r\n            </td>\r\n            <td>\r\n                ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f1.setParent(null);
      // /cataloging/powersearch.jsp(73,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setProperty( PowerSearchVO.FIELD_SEARCH_TERM_2 );
      // /cataloging/powersearch.jsp(73,16) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setSize("35");
      // /cataloging/powersearch.jsp(73,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setMaxlength("80");
      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      out.write("\r\n            </td>\r\n            <td class=\"FormElement\">\r\n                ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f3.setParent(null);
      // /cataloging/powersearch.jsp(76,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f3.setProperty( PowerSearchVO.FIELD_WORD_PHRASE_SELECT_2 );
      int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
      if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f3.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          if (_jspx_meth_html_005foptions_005f3(_jspx_th_html_005fselect_005f3, _jspx_page_context))
            return;
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
      out.write("\r\n            </td>\r\n        </tr>\r\n              \r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td align=\"center\" class=\"FormLabel\">\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f3 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f3.setParent(null);
      // /cataloging/powersearch.jsp(85,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setProperty( PowerSearchVO.FIELD_BOOLEAN_OPERATOR_2 );
      // /cataloging/powersearch.jsp(85,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setValue( String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_AND) );
      // /cataloging/powersearch.jsp(85,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setOnclick("submitDropDown()");
      int _jspx_eval_html_005fradio_005f3 = _jspx_th_html_005fradio_005f3.doStartTag();
      if (_jspx_th_html_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f3);
      out.print( MessageHelper.formatMessage("powersearch_AND") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f4 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f4.setParent(null);
      // /cataloging/powersearch.jsp(86,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f4.setProperty( PowerSearchVO.FIELD_BOOLEAN_OPERATOR_2 );
      // /cataloging/powersearch.jsp(86,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f4.setValue( String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_OR) );
      // /cataloging/powersearch.jsp(86,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f4.setOnclick("submitDropDown()");
      int _jspx_eval_html_005fradio_005f4 = _jspx_th_html_005fradio_005f4.doStartTag();
      if (_jspx_th_html_005fradio_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
      out.print( MessageHelper.formatMessage("powersearch_OR") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f5 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f5.setParent(null);
      // /cataloging/powersearch.jsp(87,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f5.setProperty( PowerSearchVO.FIELD_BOOLEAN_OPERATOR_2 );
      // /cataloging/powersearch.jsp(87,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f5.setValue( String.valueOf(PowerSearchVO.BOOLEAN_OPERATOR_NOT) );
      // /cataloging/powersearch.jsp(87,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f5.setOnclick("submitDropDown()");
      int _jspx_eval_html_005fradio_005f5 = _jspx_th_html_005fradio_005f5.doStartTag();
      if (_jspx_th_html_005fradio_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
      out.print( MessageHelper.formatMessage("powersearch_NOT") );
      out.write("</td>\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n              \r\n        <tr>\r\n            <td class=\"FormLabel tdAlignRight\">\r\n                ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f4.setParent(null);
      // /cataloging/powersearch.jsp(93,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f4.setProperty( PowerSearchVO.FIELD_INDEX_TYPE_3 );
      // /cataloging/powersearch.jsp(93,16) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f4.setOnchange("submitDropDown()");
      int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
      if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f4.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          if (_jspx_meth_html_005foptions_005f4(_jspx_th_html_005fselect_005f4, _jspx_page_context))
            return;
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f4);
      out.write("\r\n            </td>\r\n            <td>\r\n                ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f2.setParent(null);
      // /cataloging/powersearch.jsp(98,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f2.setProperty( PowerSearchVO.FIELD_SEARCH_TERM_3 );
      // /cataloging/powersearch.jsp(98,16) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f2.setSize("35");
      // /cataloging/powersearch.jsp(98,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f2.setMaxlength("80");
      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      out.write("\r\n            </td>\r\n            <td class=\"FormElement\">\r\n                ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f5.setParent(null);
      // /cataloging/powersearch.jsp(101,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f5.setProperty( PowerSearchVO.FIELD_WORD_PHRASE_SELECT_3 );
      int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
      if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f5.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          if (_jspx_meth_html_005foptions_005f5(_jspx_th_html_005fselect_005f5, _jspx_page_context))
            return;
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f5);
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"3\">\r\n                &nbsp;\r\n            </td>\r\n        </tr>\r\n\r\n        ");
      //  base:selectAward
      com.follett.fsc.destiny.client.cataloging.jsptag.SelectAwardTag _jspx_th_base_005fselectAward_005f0 = (com.follett.fsc.destiny.client.cataloging.jsptag.SelectAwardTag) _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromVisualSetup_005ffromBasicSearch_005fawardNameID_005fawardGroupID_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.SelectAwardTag.class);
      _jspx_th_base_005fselectAward_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fselectAward_005f0.setParent(null);
      // /cataloging/powersearch.jsp(112,8) name = awardGroupID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fselectAward_005f0.setAwardGroupID(vo.getAwardGroupID());
      // /cataloging/powersearch.jsp(112,8) name = awardNameID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fselectAward_005f0.setAwardNameID(vo.getAwardNameID());
      // /cataloging/powersearch.jsp(112,8) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fselectAward_005f0.setOnchange("submitDropDown()");
      // /cataloging/powersearch.jsp(112,8) name = fromBasicSearch type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fselectAward_005f0.setFromBasicSearch(false);
      // /cataloging/powersearch.jsp(112,8) name = fromVisualSetup type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fselectAward_005f0.setFromVisualSetup(true);
      // /cataloging/powersearch.jsp(112,8) name = helpFileName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fselectAward_005f0.setHelpFileName("d_limiter_award_winners_visual_search_setup.htm");
      int _jspx_eval_base_005fselectAward_005f0 = _jspx_th_base_005fselectAward_005f0.doStartTag();
      if (_jspx_th_base_005fselectAward_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromVisualSetup_005ffromBasicSearch_005fawardNameID_005fawardGroupID_005fnobody.reuse(_jspx_th_base_005fselectAward_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromVisualSetup_005ffromBasicSearch_005fawardNameID_005fawardGroupID_005fnobody.reuse(_jspx_th_base_005fselectAward_005f0);
      out.write("\r\n        ");
 if ( allowReadingAndInterestLevel ) { 
      out.write("\r\n            <tr>\r\n                <td align=\"center\" colspan=\"3\">\r\n                    <table width=\"100%\">\r\n                        <tr>\r\n                            <td class=\"FormLabel tdAlignRight\">\r\n                                ");
      out.print( MessageHelper.formatMessage("powersearch_ReadingLevel") );
      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignLeft\" >\r\n                                ");
      out.print( MessageHelper.formatMessage("powersearch_From") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f3.setParent(null);
      // /cataloging/powersearch.jsp(122,92) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f3.setProperty( PowerSearchVO.FIELD_READING_GRADE_LEVEL_FROM );
      // /cataloging/powersearch.jsp(122,92) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f3.setSize("5");
      // /cataloging/powersearch.jsp(122,92) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f3.setMaxlength("4");
      int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
      if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      out.write("\r\n                                &nbsp;");
      out.print( MessageHelper.formatMessage("powersearch_To") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f4.setParent(null);
      // /cataloging/powersearch.jsp(123,96) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f4.setProperty( PowerSearchVO.FIELD_READING_GRADE_LEVEL_TO );
      // /cataloging/powersearch.jsp(123,96) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f4.setSize("5");
      // /cataloging/powersearch.jsp(123,96) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f4.setMaxlength("4");
      int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
      if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
      out.write("\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>                                 \r\n            </tr>\r\n            ");
 if (!LocaleHelper.isInternationalProduct()) { 
      out.write("\r\n                <tr>\r\n                    <td align=\"center\" colspan=3>\r\n                        <table width=\"100%\">\r\n                            <tr>        \r\n                                <td class=\"FormLabel tdAlignRight\" valign=\"top\">\r\n                                    ");
      out.print( MessageHelper.formatMessage("powersearch_InterestLevel") );
      out.write("\r\n                                </td>\r\n                                <td class=\"ColRow tdAlignLeft\" >\r\n                                    ");
      out.print( MessageHelper.formatMessage("powersearch_From") );
      out.write("&nbsp;\r\n                                    ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f6.setParent(null);
      // /cataloging/powersearch.jsp(139,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f6.setProperty( PowerSearchVO.FIELD_INTEREST_GRADE_LEVEL_FROM );
      int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
      if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f6.doInitBody();
        }
        do {
          out.write("\r\n                                        ");
          if (_jspx_meth_html_005foptions_005f6(_jspx_th_html_005fselect_005f6, _jspx_page_context))
            return;
          out.write("\r\n                                    ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f6);
      out.write("&nbsp;&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f1(_jspx_page_context))
        return;
      out.write("\r\n                                    <br/><br/>\r\n                                    ");
      out.print( MessageHelper.formatMessage("powersearch_To") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                    ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f7 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f7.setParent(null);
      // /cataloging/powersearch.jsp(145,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f7.setProperty( PowerSearchVO.FIELD_INTEREST_GRADE_LEVEL_TO );
      int _jspx_eval_html_005fselect_005f7 = _jspx_th_html_005fselect_005f7.doStartTag();
      if (_jspx_eval_html_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f7.doInitBody();
        }
        do {
          out.write("\r\n                                        ");
          if (_jspx_meth_html_005foptions_005f7(_jspx_th_html_005fselect_005f7, _jspx_page_context))
            return;
          out.write("\r\n                                    ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f7);
      out.write("\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>             \r\n                </tr>\r\n            ");
 } 
      out.write("\r\n        ");
 } 
      out.write("\r\n\r\n<!-- ARRC goes here -->\r\n<!-- Show only if reading programs enabled. -->\r\n    \r\n");
 if (vo.isReadingProgramOptionsEmpty() || isMediaSiteUser) { 
      out.write("\r\n        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /cataloging/powersearch.jsp(161,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty( PowerSearchVO.FIELD_READING_PROGRAM_TYPE );
      // /cataloging/powersearch.jsp(161,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setValue( "" + PowerSearchVO.READING_PROGRAM_NONE );
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write('\r');
      out.write('\n');
 } else { 
      out.write("\r\n        <tr>\r\n            <td colspan=\"3\" align=\"center\">\r\n                <table id=\"");
      out.print(PowerSearchVO.TABLE_READING_PROGRAM_LEXILE);
      out.write("\" border=\"0\" cellpadding=\"3\" style=\"border-collapse: collapse\">\r\n                    <tr>\r\n                        <td align=\"center\" class=\"ColRowBold\" nowrap>");
      out.print( MessageHelper.formatMessage("powersearch_ReadingPrograms") );
      out.write("</td>\r\n                        <td class=\"tdAlignLeft\">\r\n                            ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f8 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f8.setParent(null);
      // /cataloging/powersearch.jsp(169,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f8.setProperty( PowerSearchVO.FIELD_READING_PROGRAM_TYPE );
      // /cataloging/powersearch.jsp(169,28) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f8.setOnchange("submitDropDown()");
      int _jspx_eval_html_005fselect_005f8 = _jspx_th_html_005fselect_005f8.doStartTag();
      if (_jspx_eval_html_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f8.doInitBody();
        }
        do {
          out.write("\r\n                                ");
          if (_jspx_meth_html_005foptions_005f8(_jspx_th_html_005fselect_005f8, _jspx_page_context))
            return;
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f8);
      out.write("\r\n                        </td>\r\n                        <td>\r\n                            ");
      if (_jspx_meth_base_005fimage_005f0(_jspx_page_context))
        return;
      out.write("\r\n                            ");
      if (_jspx_meth_base_005fhelpTag_005f2(_jspx_page_context))
        return;
      out.write("\r\n                        </td>\r\n                    </tr>\r\n    ");
 if (vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_AR || vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_RC) { 
      out.write("\r\n                    <tr>\r\n                        ");
 if (vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_AR) { 
      out.write("\r\n                             <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
      out.print( MessageHelper.formatMessage("powersearch_ARLevel") );
      out.write("</td>\r\n                         ");
} else {
      out.write("\r\n                              <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
      out.print( MessageHelper.formatMessage("powersearch_RCLevel") );
      out.write("</td>\r\n                         ");
} 
      out.write("\r\n                        <td valign=\"bottom\" colspan=\"2\" class=\"ColRow tdAlignLeft\">");
      out.print( MessageHelper.formatMessage("powersearch_From") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f5.setParent(null);
      // /cataloging/powersearch.jsp(185,143) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f5.setProperty( PowerSearchVO.FIELD_READING_LEVEL_FROM );
      // /cataloging/powersearch.jsp(185,143) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f5.setSize("5");
      int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
      if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
      out.write("\r\n                            &nbsp;");
      out.print( MessageHelper.formatMessage("powersearch_To") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f6.setParent(null);
      // /cataloging/powersearch.jsp(186,92) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f6.setProperty( PowerSearchVO.FIELD_READING_LEVEL_TO );
      // /cataloging/powersearch.jsp(186,92) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f6.setSize("5");
      int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
      if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
      out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
      out.print( MessageHelper.formatMessage("powersearch_PointValue") );
      out.write("</td>\r\n                        <td valign=\"bottom\" colspan=\"2\" class=\"ColRow tdAlignLeft\">");
      out.print( MessageHelper.formatMessage("powersearch_From") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f7.setParent(null);
      // /cataloging/powersearch.jsp(191,143) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f7.setProperty( PowerSearchVO.FIELD_POINT_VALUE_FROM );
      // /cataloging/powersearch.jsp(191,143) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f7.setSize("5");
      int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
      if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
      out.write("\r\n                            &nbsp;");
      out.print( MessageHelper.formatMessage("powersearch_To") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f8 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f8.setParent(null);
      // /cataloging/powersearch.jsp(192,92) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f8.setProperty( PowerSearchVO.FIELD_POINT_VALUE_TO );
      // /cataloging/powersearch.jsp(192,92) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f8.setSize("5");
      int _jspx_eval_html_005ftext_005f8 = _jspx_th_html_005ftext_005f8.doStartTag();
      if (_jspx_th_html_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
      out.write("\r\n                        </td>\r\n                    </tr>\r\n    ");
 } else if (vo.getReadingProgramType() == PowerSearchVO.READING_PROGRAM_LEXILE) { 
      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
      out.print( MessageHelper.formatMessage("powersearch_LexileMeasure") );
      out.write("</td>\r\n                        <td valign=\"bottom\" colspan=\"2\" class=\"ColRow tdAlignLeft\">");
      out.print( MessageHelper.formatMessage("powersearch_From") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f9 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f9.setParent(null);
      // /cataloging/powersearch.jsp(198,143) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f9.setProperty( PowerSearchVO.FIELD_LEXILE_FROM );
      // /cataloging/powersearch.jsp(198,143) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f9.setSize("5");
      // /cataloging/powersearch.jsp(198,143) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f9.setMaxlength("4");
      int _jspx_eval_html_005ftext_005f9 = _jspx_th_html_005ftext_005f9.doStartTag();
      if (_jspx_th_html_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f9);
      out.write("\r\n                            &nbsp;");
      out.print( MessageHelper.formatMessage("powersearch_To") );
      out.write("&nbsp;");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f10 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f10.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f10.setParent(null);
      // /cataloging/powersearch.jsp(199,92) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f10.setProperty( PowerSearchVO.FIELD_LEXILE_TO );
      // /cataloging/powersearch.jsp(199,92) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f10.setSize("5");
      // /cataloging/powersearch.jsp(199,92) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f10.setMaxlength("4");
      int _jspx_eval_html_005ftext_005f10 = _jspx_th_html_005ftext_005f10.doStartTag();
      if (_jspx_th_html_005ftext_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f10);
      out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">&nbsp;</td>\r\n                        <td valign=\"bottom\" colspan=\"2\" class=\"ColRow tdAlignLeft\">\r\n                            ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f9 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f9.setParent(null);
      // /cataloging/powersearch.jsp(205,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f9.setProperty( PowerSearchVO.FIELD_LEXILE_CODE );
      int _jspx_eval_html_005fselect_005f9 = _jspx_th_html_005fselect_005f9.doStartTag();
      if (_jspx_eval_html_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f9.doInitBody();
        }
        do {
          out.write("\r\n                                ");
          if (_jspx_meth_html_005foptions_005f9(_jspx_th_html_005fselect_005f9, _jspx_page_context))
            return;
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f9);
      out.write("\r\n                        </td>\r\n                    </tr>\r\n    ");
 } else if (vo.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_FOUNTAS_AND_PINNELL) {  
      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
      out.print( MessageHelper.formatMessage("powersearch_FountasPinnell") );
      out.write("</td>\r\n                        <td valign=\"bottom\" colspan=\"2\" class=\"ColRow tdAlignLeft\">\r\n                            ");
      out.print( MessageHelper.formatMessage("powersearch_From") );
      out.write("&nbsp;\r\n                            ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f10 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f10.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f10.setParent(null);
      // /cataloging/powersearch.jsp(215,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f10.setProperty( PowerSearchVO.FIELD_FOUNTAS_PINNELL_FROM );
      int _jspx_eval_html_005fselect_005f10 = _jspx_th_html_005fselect_005f10.doStartTag();
      if (_jspx_eval_html_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f10.doInitBody();
        }
        do {
          out.write("\r\n                                ");
          if (_jspx_meth_html_005foptions_005f10(_jspx_th_html_005fselect_005f10, _jspx_page_context))
            return;
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f10);
      out.write("\r\n                            &nbsp;");
      out.print( MessageHelper.formatMessage("powersearch_To") );
      out.write("&nbsp;\r\n                            ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f11 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f11.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f11.setParent(null);
      // /cataloging/powersearch.jsp(219,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f11.setProperty( PowerSearchVO.FIELD_FOUNTAS_PINNELL_TO );
      int _jspx_eval_html_005fselect_005f11 = _jspx_th_html_005fselect_005f11.doStartTag();
      if (_jspx_eval_html_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f11.doInitBody();
        }
        do {
          out.write("\r\n                                ");
          if (_jspx_meth_html_005foptions_005f11(_jspx_th_html_005fselect_005f11, _jspx_page_context))
            return;
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f11);
      out.write("\r\n                            </td>\r\n                        </tr>\r\n    ");
 } 
      out.write("\r\n                </table> <!-- End of Table PowerSearchVO.TABLE_READING_PROGRAM_LEXILE -->       \r\n            </td>\r\n        </tr>\r\n");
 } 
      out.write("\r\n    </table> <!-- End of Table PowerSearchVO.TABLE_ADVANCED_SEARCH -->       \r\n                \r\n                \r\n");
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

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /cataloging/powersearch.jsp(44,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("powerSearchTypesList");
    // /cataloging/powersearch.jsp(44,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("stringCode");
    // /cataloging/powersearch.jsp(44,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/powersearch.jsp(52,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("advancedSearchOptions1");
    // /cataloging/powersearch.jsp(52,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("stringCode");
    // /cataloging/powersearch.jsp(52,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent(null);
    // /cataloging/powersearch.jsp(63,10) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_boolean_and_or_not_power_srch.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f2 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /cataloging/powersearch.jsp(69,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("powerSearchTypesList");
    // /cataloging/powersearch.jsp(69,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("stringCode");
    // /cataloging/powersearch.jsp(69,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f3 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
    // /cataloging/powersearch.jsp(77,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setCollection("advancedSearchOptions2");
    // /cataloging/powersearch.jsp(77,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setProperty("stringCode");
    // /cataloging/powersearch.jsp(77,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f3 = _jspx_th_html_005foptions_005f3.doStartTag();
    if (_jspx_th_html_005foptions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f4 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
    // /cataloging/powersearch.jsp(94,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setCollection("powerSearchTypesList");
    // /cataloging/powersearch.jsp(94,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setProperty("stringCode");
    // /cataloging/powersearch.jsp(94,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f4 = _jspx_th_html_005foptions_005f4.doStartTag();
    if (_jspx_th_html_005foptions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f5 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
    // /cataloging/powersearch.jsp(102,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setCollection("advancedSearchOptions3");
    // /cataloging/powersearch.jsp(102,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setProperty("stringCode");
    // /cataloging/powersearch.jsp(102,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f5 = _jspx_th_html_005foptions_005f5.doStartTag();
    if (_jspx_th_html_005foptions_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f6 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /cataloging/powersearch.jsp(140,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setCollection("interestGradeLevelList");
    // /cataloging/powersearch.jsp(140,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setProperty("longID");
    // /cataloging/powersearch.jsp(140,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f6 = _jspx_th_html_005foptions_005f6.doStartTag();
    if (_jspx_th_html_005foptions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent(null);
    // /cataloging/powersearch.jsp(142,62) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_interest_grade_level_power_srch.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f7 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f7);
    // /cataloging/powersearch.jsp(146,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f7.setCollection("interestGradeLevelList");
    // /cataloging/powersearch.jsp(146,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f7.setProperty("longID");
    // /cataloging/powersearch.jsp(146,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f7.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f7 = _jspx_th_html_005foptions_005f7.doStartTag();
    if (_jspx_th_html_005foptions_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f8 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /cataloging/powersearch.jsp(170,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f8.setCollection("readingProgramOptions");
    // /cataloging/powersearch.jsp(170,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f8.setProperty("longID");
    // /cataloging/powersearch.jsp(170,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f8.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f8 = _jspx_th_html_005foptions_005f8.doStartTag();
    if (_jspx_th_html_005foptions_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent(null);
    // /cataloging/powersearch.jsp(174,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/readingprogrambasic.gif");
    // /cataloging/powersearch.jsp(174,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setWidth(80);
    // /cataloging/powersearch.jsp(174,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setHeight(38);
    // /cataloging/powersearch.jsp(174,28) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent(null);
    // /cataloging/powersearch.jsp(175,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("d_limiter_reading_program_visual_search_setup.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f9 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /cataloging/powersearch.jsp(206,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f9.setCollection("lexileCodeList");
    // /cataloging/powersearch.jsp(206,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f9.setProperty("stringCode");
    // /cataloging/powersearch.jsp(206,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f9.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f9 = _jspx_th_html_005foptions_005f9.doStartTag();
    if (_jspx_th_html_005foptions_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f10 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /cataloging/powersearch.jsp(216,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f10.setCollection("fountasAndPinnellList");
    // /cataloging/powersearch.jsp(216,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f10.setProperty("stringCode");
    // /cataloging/powersearch.jsp(216,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f10.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f10 = _jspx_th_html_005foptions_005f10.doStartTag();
    if (_jspx_th_html_005foptions_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f11 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f11);
    // /cataloging/powersearch.jsp(220,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f11.setCollection("fountasAndPinnellList");
    // /cataloging/powersearch.jsp(220,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f11.setProperty("stringCode");
    // /cataloging/powersearch.jsp(220,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f11.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f11 = _jspx_th_html_005foptions_005f11.doStartTag();
    if (_jspx_th_html_005foptions_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f11);
    return false;
  }
}
