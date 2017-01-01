package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.destiny.client.common.data.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.cataloging.data.*;
import com.follett.fsc.destiny.client.cataloging.jsptag.SearchLookinTag;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs;
import com.follett.fsc.destiny.session.common.*;
import java.util.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class basicsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableWithTabsForBaseSearch_005ftop10Link_005ftabs_005fselectedTab_005fsearchGroup_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fid_005fhref_005fcssClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchLookin_005fshowLineAboveLookin_005frenderForAdvancedSearch_005fparentForm_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromBasicSearch_005fcolSpan_005fawardNameID_005fawardGroupID_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableWithTabsForBaseSearch_005ftop10Link_005ftabs_005fselectedTab_005fsearchGroup_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fid_005fhref_005fcssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchLookin_005fshowLineAboveLookin_005frenderForAdvancedSearch_005fparentForm_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromBasicSearch_005fcolSpan_005fawardNameID_005fawardGroupID_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableWithTabsForBaseSearch_005ftop10Link_005ftabs_005fselectedTab_005fsearchGroup_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fid_005fhref_005fcssClass.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchLookin_005fshowLineAboveLookin_005frenderForAdvancedSearch_005fparentForm_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromBasicSearch_005fcolSpan_005fawardNameID_005fawardGroupID_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");

    BasicSearchForm form = (BasicSearchForm)request.getAttribute( BasicSearchForm.FORM_NAME );
//    int currentPage = PageCalculator.getCurrentPage(form);

    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = (keywordList != null) && (keywordList.size() > 0);

    boolean displaySearchCriteria = false;
    if ((keywordList == null && !form.isUserClickedKeywordsTab()) || form.isRedisplay()) {
        displaySearchCriteria = true;
    }

    String focusControl = BasicSearchForm.FIELD_KEYWORD_TEXT;

    if ( !displaySearchCriteria || haveResults) {
        // we don't want to focus on anything in the form if we've got results or if we aren't displaying search criteria
        focusControl = "";
    }

    request.setAttribute("parentFormName", "cataloging_servlet_BasicSearchForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/basicsearch.jsp(47,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("readingProgramOptions");
      // /cataloging/basicsearch.jsp(47,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("java.util.Collection");
      // /cataloging/basicsearch.jsp(47,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( BasicSearchForm.FORM_NAME );
      // /cataloging/basicsearch.jsp(47,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty( BasicSearchForm.PARAM_READING_PROGRAM_OPTIONS );
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.util.Collection readingProgramOptions = null;
      readingProgramOptions = (java.util.Collection) _jspx_page_context.findAttribute("readingProgramOptions");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /cataloging/basicsearch.jsp(48,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("lexileCodeList");
      // /cataloging/basicsearch.jsp(48,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName(BasicSearchForm.FORM_NAME);
      // /cataloging/basicsearch.jsp(48,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("lexileCodeList");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object lexileCodeList = null;
      lexileCodeList = (java.lang.Object) _jspx_page_context.findAttribute("lexileCodeList");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /cataloging/basicsearch.jsp(49,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("fountasAndPinnellList");
      // /cataloging/basicsearch.jsp(49,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName(BasicSearchForm.FORM_NAME);
      // /cataloging/basicsearch.jsp(49,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("fountasAndPinnellList");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      java.lang.Object fountasAndPinnellList = null;
      fountasAndPinnellList = (java.lang.Object) _jspx_page_context.findAttribute("fountasAndPinnellList");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f3.setParent(null);
      // /cataloging/basicsearch.jsp(50,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setId("interestGradeLevelList");
      // /cataloging/basicsearch.jsp(50,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setName(BasicSearchForm.FORM_NAME);
      // /cataloging/basicsearch.jsp(50,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setProperty("interestGradeLevelList");
      int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
      if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
      java.lang.Object interestGradeLevelList = null;
      interestGradeLevelList = (java.lang.Object) _jspx_page_context.findAttribute("interestGradeLevelList");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f4.setParent(null);
      // /cataloging/basicsearch.jsp(51,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setId("materialTypesID");
      // /cataloging/basicsearch.jsp(51,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setName(BasicSearchForm.FORM_NAME);
      // /cataloging/basicsearch.jsp(51,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setProperty("materialTypes");
      int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
      if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
      java.lang.Object materialTypesID = null;
      materialTypesID = (java.lang.Object) _jspx_page_context.findAttribute("materialTypesID");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n  <!--\r\n    function submitDropDown() {\r\n        document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write('.');
      out.print(BasicSearchForm.PARAM_NAME_REDISPLAY);
      out.write(".value = \"true\";\r\n        document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n  \r\n    function showMore() {\r\n\t    document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write('.');
      out.print(BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS);
      out.write(".value = \"true\";\r\n        document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write('.');
      out.print(BasicSearchForm.PARAM_NAME_REDISPLAY);
      out.write(".value = \"true\";\r\n\t    document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write(".submit();\r\n\t}\r\n  \r\n    function showLess() {\r\n\t    document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write('.');
      out.print(BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS);
      out.write(".value = \"false\";\r\n        document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write('.');
      out.print(BasicSearchForm.PARAM_NAME_REDISPLAY);
      out.write(".value = \"true\";\r\n\t    document.");
      out.print(BasicSearchForm.FORM_NAME);
      out.write(".submit();\r\n\t}\r\n  \r\n  // -->\r\n</script>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/basicsearch.jsp(76,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlebasicsearchform.do");
      // /cataloging/basicsearch.jsp(76,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setStyleId("keywordList");
      // /cataloging/basicsearch.jsp(76,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(77,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(BasicSearchForm.PARAM_SEARCH_TYPE);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n<input type=\"hidden\" name=\"");
          out.print(BasicSearchForm.PARAM_NAME_REDISPLAY);
          out.write("\" value=\"false\"/>\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(79,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS );
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
          // /cataloging/basicsearch.jsp(80,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(BaseSearchResultsForm.PARAM_DIGITAL_CONTENT_MODE );
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n\r\n");
 if (!form.isRedisplay()) { 
          out.write('\r');
          out.write('\n');
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/basesearchresults.jsp", out, true);
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n\r\n\r\n");
          out.write('\r');
          out.write('\n');
 if (!displaySearchCriteria) {
 
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
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(94,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(BaseSearchResultsForm.FIELD_INCLUDE_LIBRARY );
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(95,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(BaseSearchResultsForm.FIELD_INCLUDE_MEDIA );
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
          // /cataloging/basicsearch.jsp(96,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty(BaseSearchResultsForm.FIELD_MEDIA_SITE_ID );
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(97,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty( BasicSearchForm.FIELD_READING_PROGRAM_TYPE );
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(98,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setProperty( BasicSearchForm.FIELD_READING_LEVEL_FROM );
          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(99,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f11.setProperty( BasicSearchForm.FIELD_READING_LEVEL_TO );
          int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
          if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(100,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f12.setProperty( BasicSearchForm.FIELD_POINT_VALUE_FROM );
          int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
          if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(101,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f13.setProperty( BasicSearchForm.FIELD_POINT_VALUE_TO );
          int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
          if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(102,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f14.setProperty( BasicSearchForm.FIELD_LEXILE_FROM );
          int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
          if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(103,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f15.setProperty( BasicSearchForm.FIELD_LEXILE_TO );
          int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
          if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(104,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f16.setProperty( BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_FROM );
          int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
          if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(105,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f17.setProperty( BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_TO );
          int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
          if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(106,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f18.setProperty( BasicSearchForm.FIELD_READING_GRADE_LEVEL_FROM );
          int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
          if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(107,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f19.setProperty( BasicSearchForm.FIELD_READING_GRADE_LEVEL_TO );
          int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
          if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f20 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f20.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(108,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f20.setProperty( BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_FROM );
          int _jspx_eval_html_005fhidden_005f20 = _jspx_th_html_005fhidden_005f20.doStartTag();
          if (_jspx_th_html_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f21 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f21.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(109,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f21.setProperty( BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_TO );
          int _jspx_eval_html_005fhidden_005f21 = _jspx_th_html_005fhidden_005f21.doStartTag();
          if (_jspx_th_html_005fhidden_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f22 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f22.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(110,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f22.setProperty( BasicSearchForm.FIELD_LEXILE_CODE );
          int _jspx_eval_html_005fhidden_005f22 = _jspx_th_html_005fhidden_005f22.doStartTag();
          if (_jspx_th_html_005fhidden_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f23 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f23.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(111,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f23.setProperty( BasicSearchForm.FIELD_AWARD_GROUP );
          int _jspx_eval_html_005fhidden_005f23 = _jspx_th_html_005fhidden_005f23.doStartTag();
          if (_jspx_th_html_005fhidden_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f24 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f24.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(112,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f24.setProperty( BasicSearchForm.FIELD_AWARD_NAME );
          int _jspx_eval_html_005fhidden_005f24 = _jspx_th_html_005fhidden_005f24.doStartTag();
          if (_jspx_th_html_005fhidden_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f24);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f24);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f25 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f25.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(113,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f25.setProperty( BasicSearchForm.FIELD_MATERIAL_TYPE );
          int _jspx_eval_html_005fhidden_005f25 = _jspx_th_html_005fhidden_005f25.doStartTag();
          if (_jspx_th_html_005fhidden_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f25);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f25);
          out.write("    \r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f26 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f26.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(114,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f26.setProperty( BasicSearchForm.FIELD_SEARCH_ONLY_FOLLETT_SHELF );
          int _jspx_eval_html_005fhidden_005f26 = _jspx_th_html_005fhidden_005f26.doStartTag();
          if (_jspx_th_html_005fhidden_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f26);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f26);
          out.write("    \r\n    \r\n    <!-- show the search criteria  -->\r\n");
 } else {  
       int numberOfButtons = form.getButtonOrder().size();
       //Colspan is invalid if its zero dude
       int colSpan = (numberOfButtons == 0 ? 1 : numberOfButtons);
    
          out.write("\r\n    ");
          //  base:outlinedTableWithTabsForBaseSearch
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableWithTabsForBaseSearchTag _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableWithTabsForBaseSearchTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableWithTabsForBaseSearch_005ftop10Link_005ftabs_005fselectedTab_005fsearchGroup_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableWithTabsForBaseSearchTag.class);
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/basicsearch.jsp(122,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setId(AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS);
          // /cataloging/basicsearch.jsp(122,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setBorderColor("#C0C0C0");
          // /cataloging/basicsearch.jsp(122,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setSelectedTab(BasicSearchForm.ID_TAB_BASIC_SEARCH);
          // /cataloging/basicsearch.jsp(122,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setTabs((Tab[])store.getAdvanceSearchTabArray());
          // /cataloging/basicsearch.jsp(122,4) name = top10Link type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setTop10Link(form.getTopTenTitles());
          // /cataloging/basicsearch.jsp(122,4) name = searchGroup type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.setSearchGroup(new Integer(SearchHistorySpecs.SEARCH_GROUP_LIBRARY) );
          int _jspx_eval_base_005foutlinedTableWithTabsForBaseSearch_005f0 = _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableWithTabsForBaseSearch_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>   \r\n         <td>\r\n              <!-- Start of the search criteria table -->\r\n              <table id=\"");
              out.print( BasicSearchForm.TABLE_SEARCH_CRITERIA );
              out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n                <tr align=\"center\">\r\n                            <td class=\"FormLabel\" align=\"center\" colspan=\"");
              out.print( colSpan );
              out.write("\">\r\n                            <table id=\"");
              out.print( BasicSearchForm.TABLE_SEARCH_PROMPT );
              out.write("\" cellpadding=\"2\" align=\"center\" cellspacing=\"0\" border=\"0\">\r\n                            <tr>\r\n            <td class=\"TableHeading tdAlignRight\">\r\n                    ");
      String text = form.getKeywordText();
                            if ( text.length() > 0) { 
              out.write("\r\n                <a name=\"refinesearch\"></a>");
              out.print( MessageHelper.formatMessage("basicsearch_RefineSearch") );
              out.write("&nbsp;\r\n    ");
      } else { 
              out.print( MessageHelper.formatMessage("basicsearch_Find") );
              out.write("&nbsp;\r\n                    ");
      }  
              out.write("\r\n                            </td>\r\n                            <td>\r\n                        ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(143,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty( BasicSearchForm.FIELD_KEYWORD_TEXT );
              // /cataloging/basicsearch.jsp(143,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize("70");
              // /cataloging/basicsearch.jsp(143,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength("500");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n                    </td>\r\n                    <td>\r\n                        ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fid_005fhref_005fcssClass.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(146,24) name = title type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setTitle(MessageHelper.formatMessage("basicsearch_ResetAll") );
              // /cataloging/basicsearch.jsp(146,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setCssClass("ColRow");
              // /cataloging/basicsearch.jsp(146,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId("searchPromptResetControl");
              // /cataloging/basicsearch.jsp(146,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setHref("/cataloging/servlet/presentbasicsearchform.do?" + BasicSearchForm.PARAM_RESET_LIMITERS + "=true" );
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                            ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/basicsearch.jsp(147,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("basicsearch_ResetAll") );
                  // /cataloging/basicsearch.jsp(147,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/icons/general/reset.gif");
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("\r\n                            ");
                  out.print(MessageHelper.formatMessage("basicsearch_ResetAll") );
                  out.write("     \r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fid_005fhref_005fcssClass.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fid_005fhref_005fcssClass.reuse(_jspx_th_base_005flink_005f0);
              out.write(" \r\n                    </td>\r\n                </tr>\r\n             </table>            \r\n             <!-- End of the search criteria table -->\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"");
              out.print( colSpan );
              out.write("\" class=\"ColRow\">&nbsp;</td>\r\n    </tr>\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(159,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName( BasicSearchForm.FORM_NAME );
              // /cataloging/basicsearch.jsp(159,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty("districtCataloger");
              // /cataloging/basicsearch.jsp(159,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue("true");
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <!-- I am a district cataloger -->\r\n            ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f27 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f27.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /cataloging/basicsearch.jsp(161,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f27.setProperty( BasicSearchForm.FIELD_SITE_TYPE_ID );
                  // /cataloging/basicsearch.jsp(161,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f27.setValue( SiteTypeSpecs.SITE_TYPE_ID_ALL_LIBRARIES.toString() );
                  int _jspx_eval_html_005fhidden_005f27 = _jspx_th_html_005fhidden_005f27.doStartTag();
                  if (_jspx_th_html_005fhidden_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f27);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f27);
                  out.write("\r\n        ");
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
              out.write("\r\n    <tr align=\"center\">\r\n        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(164,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("button");
              // /cataloging/basicsearch.jsp(164,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName(BasicSearchForm.FORM_NAME);
              // /cataloging/basicsearch.jsp(164,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("buttonOrder");
              // /cataloging/basicsearch.jsp(164,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.client.cataloging.data.BasicSearchButtonOrderVO");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                com.follett.fsc.destiny.client.cataloging.data.BasicSearchButtonOrderVO button = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                button = (com.follett.fsc.destiny.client.cataloging.data.BasicSearchButtonOrderVO) _jspx_page_context.findAttribute("button");
                do {
                  out.write("\r\n            <td>\r\n                    ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /cataloging/basicsearch.jsp(166,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/" + button.getImageName());
                  // /cataloging/basicsearch.jsp(166,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt(button.getAltText());
                  // /cataloging/basicsearch.jsp(166,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName(button.getButtonName());
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n            </td>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  button = (com.follett.fsc.destiny.client.cataloging.data.BasicSearchButtonOrderVO) _jspx_page_context.findAttribute("button");
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
              out.write("\r\n        ");
              out.write("\r\n        ");
 if (numberOfButtons == 0){ 
              out.write("\r\n            <td>&nbsp;</td>\r\n        ");
 } 
              out.write("\r\n    </tr>                 \r\n    <!-- Narrowing Limiters -->\r\n    <tr>\r\n        <td colspan=\"");
              out.print( colSpan );
              out.write("\">\r\n                <div id=\"narrowSearch\">\r\n                    <div class=\"narrowSearchHeader\">                                   \r\n                        <span class=\"showMoreLessControl\">\r\n                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(180,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName( BasicSearchForm.FORM_NAME );
              // /cataloging/basicsearch.jsp(180,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty(BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS);
              // /cataloging/basicsearch.jsp(180,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/basicsearch.jsp(181,32) name = title type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setTitle(MessageHelper.formatMessage("basicsearch_ShowLess") );
                  // /cataloging/basicsearch.jsp(181,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setId(BasicSearchForm.ID_LINK_SHOW_LESS );
                  // /cataloging/basicsearch.jsp(181,32) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setCssClass("SmallColRow");
                  // /cataloging/basicsearch.jsp(181,32) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setHref("#");
                  // /cataloging/basicsearch.jsp(181,32) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setOnclick("showLess()");
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                                    ");
                      out.print(MessageHelper.formatMessage("basicsearch_ShowLess") );
                      out.write("\r\n                                    ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                      // /cataloging/basicsearch.jsp(183,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlt(MessageHelper.formatMessage("basicsearch_ShowLess") );
                      // /cataloging/basicsearch.jsp(183,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setSrc("/icons/general/arrow_tri_up.gif");
                      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                      out.write("                                \r\n                                ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.reuse(_jspx_th_base_005flink_005f1);
                  out.write("                                                                \r\n                            ");
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
              out.write("\r\n                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(186,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName( BasicSearchForm.FORM_NAME );
              // /cataloging/basicsearch.jsp(186,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty(BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS);
              // /cataloging/basicsearch.jsp(186,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("false");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/basicsearch.jsp(187,32) name = title type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setTitle(MessageHelper.formatMessage("basicsearch_ShowMore") );
                  // /cataloging/basicsearch.jsp(187,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setId(BasicSearchForm.ID_LINK_SHOW_MORE );
                  // /cataloging/basicsearch.jsp(187,32) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setCssClass("SmallColRow");
                  // /cataloging/basicsearch.jsp(187,32) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setHref("#");
                  // /cataloging/basicsearch.jsp(187,32) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setOnclick("showMore()");
                  int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                  if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                                    ");
                      out.print(MessageHelper.formatMessage("basicsearch_ShowMore") );
                      out.write("\r\n                                    ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                      // /cataloging/basicsearch.jsp(189,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("basicsearch_ShowMore") );
                      // /cataloging/basicsearch.jsp(189,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setSrc("/icons/general/arrow_tri_down.gif");
                      int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                      if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                      out.write("\r\n                                ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.reuse(_jspx_th_base_005flink_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fonclick_005fid_005fhref_005fcssClass.reuse(_jspx_th_base_005flink_005f2);
                  out.write("  \r\n                            ");
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
              out.write("                                \r\n                        </span>                        \r\n                        <h3 class=\"ColRowBold\">         \r\n                            ");
              out.print(MessageHelper.formatMessage("basicsearch_NarrowYourSearchTo") );
              out.write("\r\n                        </h3> \r\n                    </div>     \r\n          \r\n                    ");
 if (form.hasLimiterChanges()) { 
              out.write("\r\n                    \r\n                        <div class=\"ColRow narrowSearchMessaging\">\r\n                            <em>\r\n                                ");
              if (_jspx_meth_base_005fimage_005f3(_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, _jspx_page_context))
                return;
              out.write("&nbsp;\r\n                                ");
              out.print(MessageHelper.formatMessage("basicsearch_LimitersHaveBeenSet") );
              out.write("\r\n                            </em>\r\n                        </div>\r\n                    ");
 } 
              out.write("\r\n                    ");
 String style="display:none"; 
              out.write("\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(208,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName( BasicSearchForm.FORM_NAME );
              // /cataloging/basicsearch.jsp(208,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty(BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS);
              // /cataloging/basicsearch.jsp(208,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue("true");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("                    \r\n                        ");
 style="display:block"; 
                  out.write("\r\n                    ");
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
              out.write("\r\n                    <table id=\"hidderTable\" width=\"99%\">\r\n                    <tr>\r\n                    <td style=\"");
              out.print(style );
              out.write("\">                 \r\n                        <table id=\"");
              out.print( BasicSearchForm.TABLE_NARROWING_LIMITERS );
              out.write("\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">  \r\n                                <tr>\r\n                                    <td colspan=\"");
              out.print( colSpan );
              out.write("\">\r\n                                       ");
              //  base:searchLookin
              com.follett.fsc.destiny.client.cataloging.jsptag.SearchLookinTag _jspx_th_base_005fsearchLookin_005f0 = (com.follett.fsc.destiny.client.cataloging.jsptag.SearchLookinTag) _005fjspx_005ftagPool_005fbase_005fsearchLookin_005fshowLineAboveLookin_005frenderForAdvancedSearch_005fparentForm_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.SearchLookinTag.class);
              _jspx_th_base_005fsearchLookin_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchLookin_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(217,39) name = parentForm type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchLookin_005f0.setParentForm(form);
              // /cataloging/basicsearch.jsp(217,39) name = showLineAboveLookin type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchLookin_005f0.setShowLineAboveLookin(false);
              // /cataloging/basicsearch.jsp(217,39) name = renderForAdvancedSearch type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchLookin_005f0.setRenderForAdvancedSearch(false);
              int _jspx_eval_base_005fsearchLookin_005f0 = _jspx_th_base_005fsearchLookin_005f0.doStartTag();
              if (_jspx_th_base_005fsearchLookin_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchLookin_005fshowLineAboveLookin_005frenderForAdvancedSearch_005fparentForm_005fnobody.reuse(_jspx_th_base_005fsearchLookin_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchLookin_005fshowLineAboveLookin_005frenderForAdvancedSearch_005fparentForm_005fnobody.reuse(_jspx_th_base_005fsearchLookin_005f0);
              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                \r\n                                <tr>\r\n                                    <td colspan=\"");
              out.print( colSpan );
              out.write("\" align=\"center\">\r\n                                        <table id=\"");
              out.print(BasicSearchForm.TABLE_SEARCH_MATERIAL_TYPE);
              out.write("\" border=\"0\" cellpadding=\"3\" style=\"border-collapse: collapse\">\r\n                                            <tr>\r\n                                                <td align=\"center\" class=\"ColRowBold\" nowrap>\r\n                                                ");
              out.print(MessageHelper.formatMessage("basicsearch_MaterialType") );
              out.write("\r\n                                                </td>\r\n                                                <td>\r\n                                                     ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(232,53) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty( AdvancedSearchForm.FIELD_MATERIAL_TYPE);
              // /cataloging/basicsearch.jsp(232,53) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setOnchange("submitDropDown()");
              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                                        ");
                  if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                                     ");
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
              out.write("\r\n                                                </td>\r\n                                                <td>&nbsp;</td>\r\n                                            </tr>\r\n                                            ");
 if ((form.getMaterialType() == BibType.BIBTYPE_EBOOK || form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) && form.isFollettShelfIntegrated()){ 
              out.write("\r\n                                                <tr>\r\n                                                <td>&nbsp;</td>\r\n                                                <td class=\"ColRowBold\">\r\n                                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(248,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(AdvancedSearchForm.FIELD_SEARCH_ONLY_FOLLETT_SHELF);
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("\r\n                                                ");
 if (form.getMaterialType() == BibType.BIBTYPE_EBOOK){ 
              out.write("\r\n                                                ");
              out.print(MessageHelper.formatMessage("basicsearch_LimitToFolletteBooks") );
              out.write(" \r\n                                                ");
 } else if (form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) {
              out.write("\r\n                                                ");
              out.print(MessageHelper.formatMessage("basicsearch_LimitToFollettAudiobooks") );
              out.write(" \r\n                                                    ");
} 
              out.write("\r\n                                                </td>\r\n                                                </tr>\r\n                                            ");
} 
              out.write("\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>                     \r\n                                ");
              //  base:selectAward
              com.follett.fsc.destiny.client.cataloging.jsptag.SelectAwardTag _jspx_th_base_005fselectAward_005f0 = (com.follett.fsc.destiny.client.cataloging.jsptag.SelectAwardTag) _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromBasicSearch_005fcolSpan_005fawardNameID_005fawardGroupID_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.SelectAwardTag.class);
              _jspx_th_base_005fselectAward_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectAward_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(260,32) name = awardGroupID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectAward_005f0.setAwardGroupID(form.getAwardGroupID());
              // /cataloging/basicsearch.jsp(260,32) name = awardNameID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectAward_005f0.setAwardNameID(form.getAwardNameID());
              // /cataloging/basicsearch.jsp(260,32) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectAward_005f0.setOnchange("submitDropDown()");
              // /cataloging/basicsearch.jsp(260,32) name = fromBasicSearch type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectAward_005f0.setFromBasicSearch(true);
              // /cataloging/basicsearch.jsp(260,32) name = colSpan type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectAward_005f0.setColSpan(colSpan);
              // /cataloging/basicsearch.jsp(260,32) name = helpFileName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectAward_005f0.setHelpFileName("d_find_award_winning_books.htm");
              int _jspx_eval_base_005fselectAward_005f0 = _jspx_th_base_005fselectAward_005f0.doStartTag();
              if (_jspx_th_base_005fselectAward_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromBasicSearch_005fcolSpan_005fawardNameID_005fawardGroupID_005fnobody.reuse(_jspx_th_base_005fselectAward_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectAward_005fonchange_005fhelpFileName_005ffromBasicSearch_005fcolSpan_005fawardNameID_005fawardGroupID_005fnobody.reuse(_jspx_th_base_005fselectAward_005f0);
              out.write("\r\n                                    ");
 if ( form.getStore().isAllowReadingLevelAndInterestLevelSearches() ) { 
              out.write("\r\n                                        <tr>\r\n                                            <td colspan=\"");
              out.print( colSpan );
              out.write("\" align=\"center\">\r\n                                                <table id=\"");
              out.print(BasicSearchForm.TABLE_READING_GRADE_LEVEL);
              out.write("\" border=\"0\" cellpadding=\"3\" style=\"border-collapse: collapse\">\r\n                                                    <tr>\r\n                <td align=\"center\" class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("basicsearch_ReadingLevel") );
              out.write("</td>\r\n                                                        <td valign=\"bottom\" colspan=\"2\" class=\"ColRow\">\r\n                    ");
              out.print(MessageHelper.formatMessage("basicsearch_From"));
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(268,78) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setProperty( BasicSearchForm.FIELD_READING_GRADE_LEVEL_FROM );
              // /cataloging/basicsearch.jsp(268,78) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setSize("5");
              // /cataloging/basicsearch.jsp(268,78) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setMaxlength("4");
              int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
              if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
              out.write("\r\n                    &nbsp;");
              out.print(MessageHelper.formatMessage("basicsearch_To"));
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(269,82) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setProperty( BasicSearchForm.FIELD_READING_GRADE_LEVEL_TO );
              // /cataloging/basicsearch.jsp(269,82) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setSize("5");
              // /cataloging/basicsearch.jsp(269,82) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setMaxlength("4");
              int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
              if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
              out.write("\r\n                                                        </td>            \r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>            \r\n\r\n                                        <tr>\r\n                                            <td colspan=\"");
              out.print( colSpan );
              out.write("\" align=\"center\">\r\n                                                <table id=\"");
              out.print(BasicSearchForm.TABLE_INTEREST_GRADE_LEVEL);
              out.write("\" border=\"0\" cellpadding=\"3\" style=\"border-collapse: collapse\">\r\n                                                    <tr>\r\n                                                        <td align=\"center\" class=\"ColRowBold\" nowrap>\r\n                                                        ");
              out.print(MessageHelper.formatMessage("basicsearch_InterestLevel") );
              out.write("\r\n                                                        </td>\r\n                                                        <td class=\"ColRow\">\r\n                                                            ");
              out.print(MessageHelper.formatMessage("basicsearch_From") );
              out.write("&nbsp;\r\n                                                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(285,60) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty( BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_FROM );
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                                                            ");
                  if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                                                            ");
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
              out.write("\r\n                                                            &nbsp;");
              out.print(MessageHelper.formatMessage("basicsearch_To") );
              out.write("&nbsp;\r\n                                                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(290,60) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f2.setProperty( BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_TO );
              int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                                                            ");
                  if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n                                                            ");
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
              out.write("&nbsp;&nbsp;");
              if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n\r\n                                    ");
 } 
              out.write("                     \r\n             \r\n        ");
 if (readingProgramOptions.isEmpty() || LocaleHelper.isInternationalProduct()) { 
              out.write("\r\n                                        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f28 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f28.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(303,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f28.setProperty( BasicSearchForm.FIELD_READING_PROGRAM_TYPE );
              // /cataloging/basicsearch.jsp(303,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f28.setValue( "" + BasicSearchForm.READING_PROGRAM_NONE );
              int _jspx_eval_html_005fhidden_005f28 = _jspx_th_html_005fhidden_005f28.doStartTag();
              if (_jspx_th_html_005fhidden_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f28);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f28);
              out.write("\r\n                                    ");
 } else { 
              out.write("                     \r\n                                            <tr>\r\n                                                <td colspan=\"");
              out.print( colSpan );
              out.write("\" align=\"center\">                                     \r\n                                                    <table id=\"");
              out.print(BasicSearchForm.TABLE_READING_PROGRAM_LEXILE);
              out.write("\" border=\"0\" cellpadding=\"3\" style=\"border-collapse: collapse\">\r\n                                                        <tr>\r\n                            <td align=\"center\" class=\"ColRowBold\" nowrap>");
              out.print( MessageHelper.formatMessage("basicsearch_ReadingPrograms") );
              out.write("</td>\r\n                                                            <td>\r\n                                                                ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(311,64) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f3.setProperty( BasicSearchForm.FIELD_READING_PROGRAM_TYPE );
              // /cataloging/basicsearch.jsp(311,64) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f3.setOnchange("submitDropDown()");
              int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
              if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f3.doInitBody();
                }
                do {
                  out.write("\r\n                                                                    ");
                  if (_jspx_meth_html_005foptions_005f3(_jspx_th_html_005fselect_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                                                                ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f3);
              out.write("\r\n                                                            </td>\r\n                                                            <td>\r\n                            ");
              if (_jspx_meth_base_005fimage_005f4(_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                                            &nbsp;");
              if (_jspx_meth_base_005fhelpTag_005f1(_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                                                        </tr>     \r\n            <!-- BEGINNING OF READING PROGRAM IF LOOP -->                                                                \r\n            ");
 if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_AR || form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_RC) {  
              out.write(" \r\n                <tr>\r\n                    ");
 if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_AR) { 
              out.write("\r\n                                     <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("basicsearch_ARLevel") );
              out.write("</td>\r\n                     ");
} else {
              out.write("\r\n                                      <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("basicsearch_RCLevel") );
              out.write("</td>\r\n                     ");
} 
              out.write("\r\n                    <td valign=\"bottom\" colspan=\"2\" class=\"ColRow\">\r\n                                    ");
              out.print( MessageHelper.formatMessage("basicsearch_From") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(328,96) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setProperty( BasicSearchForm.FIELD_READING_LEVEL_FROM );
              // /cataloging/basicsearch.jsp(328,96) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setSize("5");
              int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
              if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
              out.write("\r\n                                    &nbsp;");
              out.print( MessageHelper.formatMessage("basicsearch_To") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(329,100) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setProperty( BasicSearchForm.FIELD_READING_LEVEL_TO );
              // /cataloging/basicsearch.jsp(329,100) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setSize("5");
              int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
              if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("basicsearch_PointValue") );
              out.write("</td>\r\n                    <td valign=\"bottom\" colspan=\"2\" class=\"ColRow\">\r\n                                    ");
              out.print( MessageHelper.formatMessage("basicsearch_From") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(335,96) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setProperty( BasicSearchForm.FIELD_POINT_VALUE_FROM );
              // /cataloging/basicsearch.jsp(335,96) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setSize("5");
              int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
              if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
              out.write("\r\n                                    &nbsp;");
              out.print( MessageHelper.formatMessage("basicsearch_To") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(336,100) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f6.setProperty( BasicSearchForm.FIELD_POINT_VALUE_TO );
              // /cataloging/basicsearch.jsp(336,100) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f6.setSize("5");
              int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
              if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
 } else if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_LEXILE) { 
              out.write("\r\n                <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("basicsearch_LexileMeasure") );
              out.write("</td>\r\n                    <td valign=\"bottom\" colspan=\"2\" class=\"ColRow\">\r\n                                    ");
              out.print( MessageHelper.formatMessage("basicsearch_From") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(343,96) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setProperty( BasicSearchForm.FIELD_LEXILE_FROM );
              // /cataloging/basicsearch.jsp(343,96) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setSize("5");
              // /cataloging/basicsearch.jsp(343,96) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setMaxlength("4");
              int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
              if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
              out.write("\r\n                                    &nbsp;");
              out.print( MessageHelper.formatMessage("basicsearch_To") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f8 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f8.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(344,100) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f8.setProperty( BasicSearchForm.FIELD_LEXILE_TO );
              // /cataloging/basicsearch.jsp(344,100) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f8.setSize("5");
              // /cataloging/basicsearch.jsp(344,100) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f8.setMaxlength("4");
              int _jspx_eval_html_005ftext_005f8 = _jspx_th_html_005ftext_005f8.doStartTag();
              if (_jspx_th_html_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">&nbsp;</td>\r\n                    <td valign=\"bottom\" colspan=\"2\" class=\"ColRow\">\r\n                    ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(350,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f4.setProperty( BasicSearchForm.FIELD_LEXILE_CODE );
              int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
              if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f4.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  if (_jspx_meth_html_005foptions_005f4(_jspx_th_html_005fselect_005f4, _jspx_page_context))
                    return;
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
 } else if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_FOUNTAS_AND_PINNELL) {  
              out.write("\r\n                <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("basicsearch_FountasPinnell") );
              out.write("</td>\r\n                    <td valign=\"bottom\" colspan=\"2\" class=\"ColRow\">\r\n                                ");
              out.print( MessageHelper.formatMessage("basicsearch_From") );
              out.write("&nbsp;\r\n                    ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(361,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f5.setProperty( BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_FROM );
              int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
              if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f5.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  if (_jspx_meth_html_005foptions_005f5(_jspx_th_html_005fselect_005f5, _jspx_page_context))
                    return;
                  out.write("\r\n                    ");
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
              out.write("\r\n                                &nbsp;");
              out.print( MessageHelper.formatMessage("basicsearch_To") );
              out.write("&nbsp;\r\n                    ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
              // /cataloging/basicsearch.jsp(366,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f6.setProperty( BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_TO );
              int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
              if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f6.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  if (_jspx_meth_html_005foptions_005f6(_jspx_th_html_005fselect_005f6, _jspx_page_context))
                    return;
                  out.write("\r\n                    ");
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
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
 } 
              out.write("\r\n            <!-- END OF READING PROGRAM IF LOOP -->\r\n                                    </table> <!-- TABLE_READING_PROGRAM_LEXILE -->                \r\n                                </td>\r\n                            </tr>                     \r\n                        ");
 } 
              out.write("                     \r\n                </table>  <!-- TABLE_NARROWING_LIMITERS -->\r\n                </td>\r\n                </tr>\r\n                </table> <!--  hidder table -->                  \r\n            </div>                 \r\n        </td>\r\n    </tr>\r\n    </table> <!--  end of BasicSearchForm.TABLE_SEARCH_CRITERIA  -->            \r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableWithTabsForBaseSearch_005ftop10Link_005ftabs_005fselectedTab_005fsearchGroup_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableWithTabsForBaseSearch_005ftop10Link_005ftabs_005fselectedTab_005fsearchGroup_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
          out.write('\r');
          out.write('\n');
 } 
          out.write("<!-- if display search criteria --> \r\n\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
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
    // /cataloging/basicsearch.jsp(52,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
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
    // /cataloging/basicsearch.jsp(91,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("keywordText");
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
    // /cataloging/basicsearch.jsp(92,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("siteTypeID");
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
    // /cataloging/basicsearch.jsp(93,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("siteID");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
    // /cataloging/basicsearch.jsp(202,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f3.setSrc("/icons/general/exclamation-octagon-frame.png");
    int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
    if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
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
    // /cataloging/basicsearch.jsp(234,56) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("materialTypesID");
    // /cataloging/basicsearch.jsp(234,56) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("stringCode");
    // /cataloging/basicsearch.jsp(234,56) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/basicsearch.jsp(286,60) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("interestGradeLevelList");
    // /cataloging/basicsearch.jsp(286,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("longID");
    // /cataloging/basicsearch.jsp(286,60) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
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
    // /cataloging/basicsearch.jsp(291,60) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("interestGradeLevelList");
    // /cataloging/basicsearch.jsp(291,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("longID");
    // /cataloging/basicsearch.jsp(291,60) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
    // /cataloging/basicsearch.jsp(293,86) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_find_titles_reading_interest_levels.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
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
    // /cataloging/basicsearch.jsp(312,68) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setCollection("readingProgramOptions");
    // /cataloging/basicsearch.jsp(312,68) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setProperty("longID");
    // /cataloging/basicsearch.jsp(312,68) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f3 = _jspx_th_html_005foptions_005f3.doStartTag();
    if (_jspx_th_html_005foptions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
    // /cataloging/basicsearch.jsp(316,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setSrc("/icons/general/readingprogrambasic.gif");
    // /cataloging/basicsearch.jsp(316,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setWidth(80);
    // /cataloging/basicsearch.jsp(316,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setHeight(38);
    // /cataloging/basicsearch.jsp(316,28) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
    if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableWithTabsForBaseSearch_005f0);
    // /cataloging/basicsearch.jsp(317,66) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("t_find_books_in_reading_programs.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
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
    // /cataloging/basicsearch.jsp(351,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setCollection("lexileCodeList");
    // /cataloging/basicsearch.jsp(351,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setProperty("stringCode");
    // /cataloging/basicsearch.jsp(351,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/basicsearch.jsp(362,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setCollection("fountasAndPinnellList");
    // /cataloging/basicsearch.jsp(362,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setProperty("stringCode");
    // /cataloging/basicsearch.jsp(362,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/basicsearch.jsp(367,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setCollection("fountasAndPinnellList");
    // /cataloging/basicsearch.jsp(367,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setProperty("stringCode");
    // /cataloging/basicsearch.jsp(367,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f6 = _jspx_th_html_005foptions_005f6.doStartTag();
    if (_jspx_th_html_005foptions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
    return false;
  }
}
