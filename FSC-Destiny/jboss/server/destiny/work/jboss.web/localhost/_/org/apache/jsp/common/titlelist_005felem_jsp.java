package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.entity.ejb3.CopyVO;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.destiny.util.URLHelper;
import com.follett.fsc.common.*;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.entity.AdvancedSearchQueryData;

public final class titlelist_005felem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005felementaryMode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005ffromElem_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005fshowRC_005fshowAR_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005felementaryMode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005ffromElem_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005fshowRC_005fshowAR_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005felementaryMode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005ffromElem_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005fshowRC_005fshowAR_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String formName = request.getParameter("formName");
	String quantity = request.getParameter(HoldRequestForm.FIELD_QUANTITY);
	boolean showAvailability = false;
	if ( request.getParameter("showAvailability") != null ) {
		showAvailability = "true".equals(request.getParameter("showAvailability"));
	}
	boolean neverShowAvailability = false;
	if ( request.getParameter("neverShowAvailability") != null ) {
		neverShowAvailability = "true".equals(request.getParameter("neverShowAvailability"));
	}

	boolean renderLineAboveEachRow = false;
	String renderValue = request.getParameter("renderLineAboveEachRow");
	if ( renderValue != null ) {
		renderLineAboveEachRow = "true".equals(renderValue);
	}

	String selectURL = request.getParameter("selectURL");

	BaseSearchResultsForm form = (BaseSearchResultsForm)request.getAttribute(formName);
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    
    boolean digitalResourceMode = false;
    digitalResourceMode = form.getDigitalContentMode() == AdvancedSearchQueryData.SEARCH_DIGITAL_RESOURCES_ALL;

      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /common/titlelist_elem.jsp(52,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( formName );
      // /common/titlelist_elem.jsp(52,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
      // /common/titlelist_elem.jsp(52,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("false");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
 if (form instanceof VisualSearchResultsForm) { 
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
 } 
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /common/titlelist_elem.jsp(56,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(BaseListForm.PARAM_SHOW_AR_ELEMENTARY );
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
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /common/titlelist_elem.jsp(57,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(BaseListForm.PARAM_SHOW_RC_ELEMENTARY );
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
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /common/titlelist_elem.jsp(58,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(BaseListForm.PARAM_SHOW_LEXILE_ELEMENTARY );
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
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
      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /common/titlelist_elem.jsp(61,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName( formName );
      // /common/titlelist_elem.jsp(61,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
      // /common/titlelist_elem.jsp(61,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("true");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<table width=\"100%\" id=\"keywordTable\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n");
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
      out.write('\r');
      out.write('\n');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /common/titlelist_elem.jsp(64,0) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("count");
      // /common/titlelist_elem.jsp(64,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("rec");
      // /common/titlelist_elem.jsp(64,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName( formName );
      // /common/titlelist_elem.jsp(64,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("list");
      // /common/titlelist_elem.jsp(64,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord rec = null;
        java.lang.Integer count = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        rec = (com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) _jspx_page_context.findAttribute("rec");
        count = (java.lang.Integer) _jspx_page_context.findAttribute("count");
        do {
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(65,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setName( formName );
          // /common/titlelist_elem.jsp(65,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setProperty("printerFriendly");
          // /common/titlelist_elem.jsp(65,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setValue("false");
          int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
          if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t\t");
 if(renderLineAboveEachRow) { 
              out.write("\r\n        <tr>\r\n        \t<td colspan=\"2\">\r\n\t\t\t\t");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n    \t</tr>\r\n\t    ");
 } 
              out.write("\r\n    ");
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
          out.write("\r\n    <tr>\r\n\t<td class=\"ColRow\" valign=\"top\">\r\n\t\t");
          //  base:titleImage
          com.follett.fsc.destiny.client.common.jsptag.TitleImageTag _jspx_th_base_005ftitleImage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleImageTag) _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleImageTag.class);
          _jspx_th_base_005ftitleImage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftitleImage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(76,2) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleImage_005f0.setRec( rec );
          // /common/titlelist_elem.jsp(76,2) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleImage_005f0.setPrinterFriendly( form.isPrinterFriendly() );
          int _jspx_eval_base_005ftitleImage_005f0 = _jspx_th_base_005ftitleImage_005f0.doStartTag();
          if (_jspx_th_base_005ftitleImage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
          out.write("\r\n\t</td>\r\n\t<td valign=\"top\" width=\"100%\">\t\t\r\n        ");
 if ( rec.getRelevancePercentage() != null ) { 
          out.write("\r\n            <!--REL=");
          out.print(rec.getRelevancePercentage().toString());
          out.write("-->\r\n        ");
 } 
          out.write("\r\n\r\n\t\t<table id=\"");
          out.print( BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + count );
          out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"100%\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td class=\"ColRowBold\" valign=\"top\" colspan=\"4\">\r\n\t\t\t\t\t<a name='");
          out.print( "anchor_" + rec.getRecID() );
          out.write("'></a>\r\n                    <a name=\"");
          out.print(BaseTitleDetailForm.ANCHOR_TO_GO_TO_ON_RESTORE + rec.getRecID());
          out.write("\"></a>\r\n\t\t\t\t\t");
          //  base:titleDetailHover
          com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag _jspx_th_base_005ftitleDetailHover_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag) _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag.class);
          _jspx_th_base_005ftitleDetailHover_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftitleDetailHover_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(88,5) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setRec( rec );
          // /common/titlelist_elem.jsp(88,5) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setFormName( formName );
          // /common/titlelist_elem.jsp(88,5) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setPrinterFriendly( form.isPrinterFriendly() );
          // /common/titlelist_elem.jsp(88,5) name = quantity type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setQuantity( quantity );
          // /common/titlelist_elem.jsp(88,5) name = digitalResourceMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setDigitalResourceMode( digitalResourceMode );
          // /common/titlelist_elem.jsp(88,5) name = elementaryMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setElementaryMode(true);
          int _jspx_eval_base_005ftitleDetailHover_005f0 = _jspx_th_base_005ftitleDetailHover_005f0.doStartTag();
          if (_jspx_th_base_005ftitleDetailHover_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.reuse(_jspx_th_base_005ftitleDetailHover_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.reuse(_jspx_th_base_005ftitleDetailHover_005f0);
          out.write("\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td class=\"ColRow\" valign=\"top\" nowrap>\r\n                    ");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
          if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /common/titlelist_elem.jsp(100,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fwhen_005f0.setTest( rec.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET );
              int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
              if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    \t\t\t\t\t\t&nbsp;&nbsp;\r\n    \t\t\t\t\t\t");
                  //  base:bibTypeIcon
                  com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005felementaryMode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                  _jspx_th_base_005fbibTypeIcon_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbibTypeIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                  // /common/titlelist_elem.jsp(102,10) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setRec( rec );
                  // /common/titlelist_elem.jsp(102,10) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setPrinterFriendly( form.isPrinterFriendly() );
                  // /common/titlelist_elem.jsp(102,10) name = elementaryMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setElementaryMode(true);
                  int _jspx_eval_base_005fbibTypeIcon_005f0 = _jspx_th_base_005fbibTypeIcon_005f0.doStartTag();
                  if (_jspx_th_base_005fbibTypeIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005felementaryMode_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005felementaryMode_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                  out.write("\r\n                            &nbsp;\r\n                        ");
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
              out.write("\r\n                        ");
              if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    ");
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
          out.write("\r\n                </td>\r\n                <td class=\"ColRow\" valign=\"top\" width=\"100%\">\r\n\t\t\t\t\t");
 if (!store.isMediaBookingUser() && form!=null && form.isRenderMediaLocationInfo()) { 
					    if ( rec.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) {
					        out.print("<B>");
							if ( store.getMediaSiteCount() > 1) {
							    out.print(ResponseUtils.filter(store.getMediaSiteTypeDescription()));
							} else {
							    out.print(ResponseUtils.filter(store.getMediaSiteBrowseName()));
							}
							out.println("</B>");
					    }
					} 
          out.write("\r\n                    ");
if(digitalResourceMode){  
          out.write("\r\n                        ");
          out.print(SearchResultsOutputListRenderer.getFilteredString(rec.getPublisher(), false));
          out.write("\r\n                        ");
 if (! StringHelper.isEmptyOrWhitespace(rec.getPubYear())) { 
          out.write("\r\n                            ");
          out.print( "(" + SearchResultsOutputListRenderer.getFilteredString(rec.getPubYear(), false) + ")" );
          out.write("\r\n                        ");
 } 
          out.write("\r\n                    ");
 } else { 
          out.write("\r\n                        ");
          out.print(SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false));
          out.write("\r\n                    ");
 } 
          out.write("\r\n                </td>\r\n                <td class=\"ColRow\" valign=\"top\" nowrap>\r\n                    ");
          //  base:callNumber
          com.follett.fsc.destiny.client.common.jsptag.CallNumberTag _jspx_th_base_005fcallNumber_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CallNumberTag) _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005ffromElem_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CallNumberTag.class);
          _jspx_th_base_005fcallNumber_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcallNumber_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(132,20) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setRec( rec );
          // /common/titlelist_elem.jsp(132,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setPrinterFriendly( form.isPrinterFriendly() );
          // /common/titlelist_elem.jsp(132,20) name = hideCallNumber type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setHideCallNumber( form.isHideCallNumber() );
          // /common/titlelist_elem.jsp(132,20) name = fromElem type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setFromElem( true );
          int _jspx_eval_base_005fcallNumber_005f0 = _jspx_th_base_005fcallNumber_005f0.doStartTag();
          if (_jspx_th_base_005fcallNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005ffromElem_005fnobody.reuse(_jspx_th_base_005fcallNumber_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005ffromElem_005fnobody.reuse(_jspx_th_base_005fcallNumber_005f0);
          out.write("\r\n                    <br>\r\n                    ");
          out.print((rec.getSubLocation()== null? "" : rec.getSubLocation()));
          out.write("\r\n                </td>\r\n                <td>&nbsp;</td>\r\n            </tr>\r\n            ");
          //  base:readingProgramInfo
          com.follett.fsc.destiny.client.common.jsptag.ReadingProgramInfoTag _jspx_th_base_005freadingProgramInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReadingProgramInfoTag) _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005fshowRC_005fshowAR_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReadingProgramInfoTag.class);
          _jspx_th_base_005freadingProgramInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005freadingProgramInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(138,12) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005freadingProgramInfo_005f0.setRec(rec);
          // /common/titlelist_elem.jsp(138,12) name = showRC type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005freadingProgramInfo_005f0.setShowRC(form.isShowRCElementary());
          // /common/titlelist_elem.jsp(138,12) name = showAR type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005freadingProgramInfo_005f0.setShowAR(form.isShowARElementary());
          int _jspx_eval_base_005freadingProgramInfo_005f0 = _jspx_th_base_005freadingProgramInfo_005f0.doStartTag();
          if (_jspx_th_base_005freadingProgramInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005fshowRC_005fshowAR_005frec_005fnobody.reuse(_jspx_th_base_005freadingProgramInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005fshowRC_005fshowAR_005frec_005fnobody.reuse(_jspx_th_base_005freadingProgramInfo_005f0);
          out.write("\r\n            ");
          //  base:readingAndInterestGradeLevelInfo
          com.follett.fsc.destiny.client.common.jsptag.ReadingAndInterestGradeLevelInfoTag _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReadingAndInterestGradeLevelInfoTag) _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReadingAndInterestGradeLevelInfoTag.class);
          _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(139,12) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.setRec(rec);
          int _jspx_eval_base_005freadingAndInterestGradeLevelInfo_005f0 = _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.doStartTag();
          if (_jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.reuse(_jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.reuse(_jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0);
          out.write("\r\n            ");
 if (form.isShowLexileElementary()) { 
          out.write("\r\n             ");
          //  base:lexileInfo
          com.follett.fsc.destiny.client.common.jsptag.LexileInfoTag _jspx_th_base_005flexileInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LexileInfoTag) _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LexileInfoTag.class);
          _jspx_th_base_005flexileInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flexileInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(141,13) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flexileInfo_005f0.setRec(rec);
          int _jspx_eval_base_005flexileInfo_005f0 = _jspx_th_base_005flexileInfo_005f0.doStartTag();
          if (_jspx_th_base_005flexileInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.reuse(_jspx_th_base_005flexileInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.reuse(_jspx_th_base_005flexileInfo_005f0);
          out.write("\r\n            ");
 } 
          out.write("\r\n            ");
 if (form.isShowFountasPinnellElementary()) { 
          out.write("\r\n             ");
          //  base:fountasPinnellInfo
          com.follett.fsc.destiny.client.common.jsptag.FountasPinnellInfoTag _jspx_th_base_005ffountasPinnellInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FountasPinnellInfoTag) _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.FountasPinnellInfoTag.class);
          _jspx_th_base_005ffountasPinnellInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ffountasPinnellInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(144,13) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ffountasPinnellInfo_005f0.setRec(rec);
          int _jspx_eval_base_005ffountasPinnellInfo_005f0 = _jspx_th_base_005ffountasPinnellInfo_005f0.doStartTag();
          if (_jspx_th_base_005ffountasPinnellInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.reuse(_jspx_th_base_005ffountasPinnellInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.reuse(_jspx_th_base_005ffountasPinnellInfo_005f0);
          out.write("\r\n            ");
 } 
          out.write("\r\n            ");
 if (rec.isDigitalMediaRecord()) { 
          out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\">&nbsp;</td>\r\n                    <td class=\"ColRow\" colspan=\"3\">");
          out.print( SearchResultsOutputListRenderer.getFilteredString(rec.getSummary(), false) );
          out.write("</td>\r\n                </tr>\r\n            ");
 } 
          out.write("\r\n        \t</table>\r\n      \t</td>\r\n        <td>\r\n            <table id=\"");
          out.print(BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS  + count);
          out.write("\">\r\n               ");
 for(String row : form.buildControlStatusTableRows(rec,pageContext)) { 
          out.write("\r\n                    <tr>\r\n                    ");
          out.print( row );
          out.write("\r\n                    </tr>\r\n               ");
 } 
          out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\t");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist_elem.jsp(164,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setName( formName );
          // /common/titlelist_elem.jsp(164,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setProperty("printerFriendly");
          // /common/titlelist_elem.jsp(164,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setValue("false");
          int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
          if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t\t");
 if(!renderLineAboveEachRow) { 
              out.write("\r\n        <tr>\r\n        \t<td colspan=\"3\">\r\n\t\t\t\t");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n     \t</tr>\r\n\t    ");
 } 
              out.write('\r');
              out.write('\n');
              out.write('	');
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
          out.write("\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          rec = (com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) _jspx_page_context.findAttribute("rec");
          count = (java.lang.Integer) _jspx_page_context.findAttribute("count");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write('\r');
      out.write('\n');
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f4.setParent(null);
      // /common/titlelist_elem.jsp(174,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setName( formName );
      // /common/titlelist_elem.jsp(174,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
      // /common/titlelist_elem.jsp(174,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setValue("true");
      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n</table>\r\n");
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

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /common/titlelist_elem.jsp(54,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("nodeID");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /common/titlelist_elem.jsp(69,4) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /common/titlelist_elem.jsp(69,4) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setVspace("1");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                            &nbsp;\r\n                        ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    // /common/titlelist_elem.jsp(168,4) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    // /common/titlelist_elem.jsp(168,4) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setVspace("1");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
