package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.session.common.SortHelper;

public final class crwselectpatron_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /backoffice/crwselectpatron.jsp(17,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /backoffice/crwselectpatron.jsp(17,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(request.getAttribute(CRWSelectPatronForm.FORM_NAME));
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
      // /backoffice/crwselectpatron.jsp(18,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/crwselectpatron.jsp(18,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_CRWSelectPatronForm");
      // /backoffice/crwselectpatron.jsp(18,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("CRWSelectPatronForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      CRWSelectPatronForm form = null;
      form = (CRWSelectPatronForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /backoffice/crwselectpatron.jsp(20,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f1.setVar("sortByFirstName");
      // /backoffice/crwselectpatron.jsp(20,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f1.setValue(SortHelper.SORTBYFIRSTNAME);
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f2.setParent(null);
      // /backoffice/crwselectpatron.jsp(21,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f2.setVar("sortByMiddleName");
      // /backoffice/crwselectpatron.jsp(21,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f2.setValue(SortHelper.SORTBYMIDDLENAME);
      int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
      if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f3.setParent(null);
      // /backoffice/crwselectpatron.jsp(22,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f3.setVar("sortByLastName");
      // /backoffice/crwselectpatron.jsp(22,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f3.setValue(SortHelper.SORTBYLASTNAME);
      int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
      if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f4.setParent(null);
      // /backoffice/crwselectpatron.jsp(23,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f4.setVar("sortByBarcode");
      // /backoffice/crwselectpatron.jsp(23,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f4.setValue(SortHelper.SORTBYBARCODE);
      int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
      if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f5.setParent(null);
      // /backoffice/crwselectpatron.jsp(24,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f5.setVar("sortBySiteShortName");
      // /backoffice/crwselectpatron.jsp(24,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f5.setValue(SortHelper.SORTBYSITESHORTNAME_PATRONS);
      int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
      if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f6.setParent(null);
      // /backoffice/crwselectpatron.jsp(28,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f6.setVar("focusString");
      // /backoffice/crwselectpatron.jsp(28,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f6.setValue( CRWSelectPatronForm.FIELD_SEARCH);
      int _jspx_eval_c_005fset_005f6 = _jspx_th_c_005fset_005f6.doStartTag();
      if (_jspx_th_c_005fset_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f6);
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/crwselectpatron.jsp(30,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlecrwselectpatronform.do");
      // /backoffice/crwselectpatron.jsp(30,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${focusString}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwselectpatron.jsp(32,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(CRWSelectPatronForm.TABLE_OUTLINE );
          // /backoffice/crwselectpatron.jsp(32,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n<tr><td> \r\n \r\n");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(35,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f0.setProperty(CRWSelectPatronForm.PARAM_PATRON_SEARCH_TYPE);
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
              _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(36,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f1.setProperty(CRWSelectPatronForm.PARAM_CUSTODIANS_LIST_OUT);
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
              _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(37,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f2.setProperty(CRWSelectPatronForm.PARAM_CUSTODIAN_LIMITER_INDEX);
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
              _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f3.setProperty(CRWSelectPatronForm.FIELD_ONLY_MY_PATRONS);
              int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
              if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
              out.write('\r');
              out.write('\n');
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty(CRWSelectPatronForm.PARAM_ONLY_MY_PATRONS_CHANGED);
              // /backoffice/crwselectpatron.jsp(39,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setValue("false");
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write('\r');
              out.write('\n');
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty("sort");
              // /backoffice/crwselectpatron.jsp(40,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setValue( "" + SortHelper.SORTBYLASTNAME );
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write("\r\n\r\n<span class=TableHeading>Select ");
              out.print( form.getPatronSearchType());
              out.write("s...</span>\r\n\r\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n        <td class=\"FormLabel\">");
              if (_jspx_meth_html_005fhidden_005f6(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.searchPrompt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("&nbsp;</td>\r\n        <td class=\"ColRow\" nowrap>\r\n            ");
              if (_jspx_meth_html_005ftext_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("&nbsp;\r\n        </td>\r\n        <td>\r\n            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(51,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/search.gif");
              // /backoffice/crwselectpatron.jsp(51,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt("Search");
              // /backoffice/crwselectpatron.jsp(51,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( CRWSelectPatronForm.BUTTON_SEARCH );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td>&nbsp;</td>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n</table>\r\n\r\n");

    if (request.getAttribute("patronlist") != null) {
        List patronList = (List) request.getAttribute("patronlist");

        int itemsInList = patronList.size();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );

              out.write("\r\n\r\n");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(71,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty("page");
              // /backoffice/crwselectpatron.jsp(71,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setValue( "" + currentPage );
              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
              out.write("\r\n\r\n    <table id=\"searchSummary\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n        <tr>\r\n            <td class=\"ColRow\">\r\n                ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.searchSummary}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\r\n            </td>\r\n            <td class=\"ColRow tdAlignRight\">\r\n                &nbsp;\r\n            <td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                ");
              out.write("\r\n                ");
              //  base:searchSummary
              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
              _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchSummary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(85,16) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setSearchType("Patrons");
              // /backoffice/crwselectpatron.jsp(85,16) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setStartOfSet(String.valueOf(itemsToSkip+1));
              // /backoffice/crwselectpatron.jsp(85,16) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setEndOfSet(String.valueOf(itemsToPrint));
              // /backoffice/crwselectpatron.jsp(85,16) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setTotalInSet(String.valueOf(itemsInList));
              int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
              if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
              out.write("\r\n            </td>\r\n            <td class=\"SmallColHeading tdAlignRight\">\r\n                ");
              if (_jspx_meth_base_005fpageListOutput_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n    </table>\r\n<hr>\r\n\r\n    <table id=\"PatronFindTable\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"0\">\r\n        <tr>\r\n            <td class=\"SmallColHeading\">\r\n                ");
              if (_jspx_meth_c_005fchoose_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n            <td class=\"SmallColHeading\">\r\n                ");
              if (_jspx_meth_base_005fsortHeaderOutput_005f9(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n            <td class=\"SmallColHeading\">\r\n                ");
              if (_jspx_meth_base_005fsortHeaderOutput_005f10(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n            <td class=\"SmallColHeading\">&nbsp;</td>\r\n        </tr>\r\n        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(129,8) name = offset type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setOffset(""+itemsToSkip);
              // /backoffice/crwselectpatron.jsp(129,8) name = length type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setLength(""+(itemsToPrint - itemsToSkip));
              // /backoffice/crwselectpatron.jsp(129,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
              // /backoffice/crwselectpatron.jsp(129,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("row");
              // /backoffice/crwselectpatron.jsp(129,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              // /backoffice/crwselectpatron.jsp(129,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("list");
              // /backoffice/crwselectpatron.jsp(129,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue row = null;
                java.lang.Integer flipper = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
                flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                do {
                  out.write("\r\n            <tr valign=\"top\" ");
                  out.print((((1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                  out.write(" >\r\n                ");
 // Display item here 
                  out.write("\r\n                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/crwselectpatron.jsp(132,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f0.setClazz("ColRow");
                  // /backoffice/crwselectpatron.jsp(132,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f0.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
                  if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f0.doInitBody();
                    }
                    do {
                      out.print( form.getPatronName(row) );
                      int evalDoAfterBody = _jspx_th_base_005ftd_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005ftd_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f0);
                  out.write("\r\n                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/crwselectpatron.jsp(133,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f1.setClazz("ColRow");
                  // /backoffice/crwselectpatron.jsp(133,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f1.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f1 = _jspx_th_base_005ftd_005f1.doStartTag();
                  if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f1.doInitBody();
                    }
                    do {
                      out.print(form.getPatronBarcode(row));
                      int evalDoAfterBody = _jspx_th_base_005ftd_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005ftd_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f1);
                  out.write("\r\n                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f2 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/crwselectpatron.jsp(134,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f2.setClazz("ColRow");
                  // /backoffice/crwselectpatron.jsp(134,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f2.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f2 = _jspx_th_base_005ftd_005f2.doStartTag();
                  if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f2.doInitBody();
                    }
                    do {
                      out.print(form.getPatronSiteName(row));
                      int evalDoAfterBody = _jspx_th_base_005ftd_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005ftd_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f2);
                  out.write("\r\n                <td class=\"ColRow tdAlignRight\">");
                  out.print(form.getPatronLinks(row));
                  out.write("</td>\r\n            </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
                  flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write("\r\n\r\n    </table>\r\n\r\n<hr>\r\n\r\n    <table width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n        <tr>\r\n            <td>\r\n                ");
              out.write("\r\n                ");
              //  base:searchSummary
              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
              _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchSummary_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(147,16) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setSearchType("Patrons");
              // /backoffice/crwselectpatron.jsp(147,16) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setStartOfSet("" + ( itemsToSkip + 1 ));
              // /backoffice/crwselectpatron.jsp(147,16) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setEndOfSet("" + ( itemsToPrint ));
              // /backoffice/crwselectpatron.jsp(147,16) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setTotalInSet("" + ( itemsInList ));
              int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
              if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
              out.write("\r\n            </td>\r\n            <td class=\"SmallColHeading tdAlignRight\">\r\n                ");
              if (_jspx_meth_base_005fpageListOutput_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n    </table>\r\n");

    }

              out.write("\r\n\r\n\r\n    <table id=\"");
              out.print(CRWSelectPatronForm.TABLE_SELECTED);
              out.write("\" width=\"100%\">\r\n        <tr>\r\n            <td>&nbsp;\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            ");
              if (_jspx_meth_base_005fsectionHeading_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </tr>\r\n        <tr>\r\n            <td colSpan=\"2\">\r\n                <table id=");
              out.print(CRWSelectPatronForm.TABLE_CURRENTLY_ASSIGNED);
              out.write(" cellSpacing=\"0\" cellPadding=\"2\" \r\n                        width=\"100%\" border=\"0\">\r\n                    <tr>\r\n                    ");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f0 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_005fempty_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fempty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(176,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fempty_005f0.setName(CRWSelectPatronForm.FORM_NAME);
              // /backoffice/crwselectpatron.jsp(176,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fempty_005f0.setProperty(CRWSelectPatronForm.PARAM_SELECTED_CUSTODIANS_LIST);
              int _jspx_eval_logic_005fempty_005f0 = _jspx_th_logic_005fempty_005f0.doStartTag();
              if (_jspx_eval_logic_005fempty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <td class=SmallColHeading>&nbsp;\r\n                        </td>\r\n                        <td class=SmallColHeading align=\"center\">No ");
                  out.print(form.getPatronSearchType());
                  out.write("s Selected\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">&nbsp;\r\n                        </td>\r\n                    ");
                  int evalDoAfterBody = _jspx_th_logic_005fempty_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fempty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
              out.write("\r\n                    ");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(184,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEmpty_005f0.setName(CRWSelectPatronForm.FORM_NAME);
              // /backoffice/crwselectpatron.jsp(184,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEmpty_005f0.setProperty(CRWSelectPatronForm.PARAM_SELECTED_CUSTODIANS_LIST);
              int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <td>\r\n            <tr>\r\n                <td class=\"SmallColHeading\">Name\r\n                </td>\r\n                <td class=\"SmallColHeading\">Barcode\r\n                </td>\r\n                <td class=\"SmallColHeading\">Site\r\n                </td>\r\n                <td class=\"SmallColHeading\">&nbsp;</td>\r\n            </tr>\r\n        ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
                  // /backoffice/crwselectpatron.jsp(195,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setIndexId("flipper");
                  // /backoffice/crwselectpatron.jsp(195,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setId("rowSelected");
                  // /backoffice/crwselectpatron.jsp(195,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setName(CRWSelectPatronForm.FORM_NAME);
                  // /backoffice/crwselectpatron.jsp(195,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setProperty(CRWSelectPatronForm.PARAM_SELECTED_CUSTODIANS_LIST);
                  // /backoffice/crwselectpatron.jsp(195,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.entity.ejb3.PatronVO");
                  int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.entity.ejb3.PatronVO rowSelected = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f1.doInitBody();
                    }
                    rowSelected = (com.follett.fsc.destiny.entity.ejb3.PatronVO) _jspx_page_context.findAttribute("rowSelected");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n            <tr valign=\"top\" ");
                      out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                      out.write(" >\r\n                ");

                    // Display item here
                
                      out.write("\r\n                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f3 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/crwselectpatron.jsp(200,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f3.setClazz("ColRow");
                      // /backoffice/crwselectpatron.jsp(200,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f3.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f3 = _jspx_th_base_005ftd_005f3.doStartTag();
                      if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f3.doInitBody();
                        }
                        do {
                          out.print(form.getPatronNameUnsorted(rowSelected));
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f3);
                      out.write("\r\n                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f4 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/crwselectpatron.jsp(201,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f4.setClazz("ColRow");
                      // /backoffice/crwselectpatron.jsp(201,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f4.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f4 = _jspx_th_base_005ftd_005f4.doStartTag();
                      if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f4.doInitBody();
                        }
                        do {
                          out.print(form.getPatronBarcode(rowSelected));
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f4);
                      out.write("\r\n                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f5 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/crwselectpatron.jsp(202,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f5.setClazz("ColRow");
                      // /backoffice/crwselectpatron.jsp(202,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f5.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f5 = _jspx_th_base_005ftd_005f5.doStartTag();
                      if (_jspx_eval_base_005ftd_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f5.doInitBody();
                        }
                        do {
                          out.print( form.getPatronSiteName(rowSelected) );
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f5);
                      out.write("\r\n                <td class=\"ColRow tdAlignRight\">");
                      out.print( form.getSelectedCustodianLinks(rowSelected) );
                      out.write("</td>\r\n            </tr>\r\n        ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                      rowSelected = (com.follett.fsc.destiny.entity.ejb3.PatronVO) _jspx_page_context.findAttribute("rowSelected");
                      flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                  out.write("\r\n                        </td>\r\n                    ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
              out.write("\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colSpan=2>");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"3\" align=\"center\">\r\n                ");
              //  base:okButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag _jspx_th_base_005fokButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag) _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag.class);
              _jspx_th_base_005fokButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fokButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(218,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fokButton_005f0.setName( CRWSelectPatronForm.BUTTON_OK );
              int _jspx_eval_base_005fokButton_005f0 = _jspx_th_base_005fokButton_005f0.doStartTag();
              if (_jspx_th_base_005fokButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
              out.write("\r\n                &nbsp;\r\n                ");
              //  base:cancelButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
              _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/crwselectpatron.jsp(220,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcancelButton_005f0.setName( CRWSelectPatronForm.BUTTON_CANCEL );
              int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
              if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
              out.write("                \r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n\r\n</td></tr>\r\n");
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
        _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
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
    // /backoffice/crwselectpatron.jsp(26,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(46,30) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("action");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(48,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setProperty("searchString");
    // /backoffice/crwselectpatron.jsp(48,12) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setSize("20");
    // /backoffice/crwselectpatron.jsp(48,12) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setMaxlength("90");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fpageListOutput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:pageListOutput
    com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
    _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(92,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fpageListOutput_005f0.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
    if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
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
    // /backoffice/crwselectpatron.jsp(102,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.sort == sortByFirstName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
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

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/crwselectpatron.jsp(103,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f0.setDescription("First");
    // /backoffice/crwselectpatron.jsp(103,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f0.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(103,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f0.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByFirstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f0 = _jspx_th_base_005fsortHeaderOutput_005f0.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/crwselectpatron.jsp(104,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f1.setDescription("Middle");
    // /backoffice/crwselectpatron.jsp(104,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f1.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(104,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f1.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByMiddleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f1 = _jspx_th_base_005fsortHeaderOutput_005f1.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/crwselectpatron.jsp(105,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f2.setDescription("Last");
    // /backoffice/crwselectpatron.jsp(105,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f2.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(105,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f2.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByLastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f2 = _jspx_th_base_005fsortHeaderOutput_005f2.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /backoffice/crwselectpatron.jsp(107,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.sort == sortByMiddleName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f3(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f4(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n                        ,\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f5(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /backoffice/crwselectpatron.jsp(108,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f3.setDescription("Middle");
    // /backoffice/crwselectpatron.jsp(108,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f3.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(108,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f3.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByMiddleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f3 = _jspx_th_base_005fsortHeaderOutput_005f3.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f4 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /backoffice/crwselectpatron.jsp(109,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f4.setDescription("Last");
    // /backoffice/crwselectpatron.jsp(109,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f4.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(109,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f4.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByLastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f4 = _jspx_th_base_005fsortHeaderOutput_005f4.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f5 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /backoffice/crwselectpatron.jsp(111,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f5.setDescription("First");
    // /backoffice/crwselectpatron.jsp(111,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f5.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(111,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f5.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByFirstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f5 = _jspx_th_base_005fsortHeaderOutput_005f5.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f5);
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
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f6(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                        ,\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f7(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                        ");
        if (_jspx_meth_base_005fsortHeaderOutput_005f8(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
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

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f6 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /backoffice/crwselectpatron.jsp(114,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f6.setDescription("Last");
    // /backoffice/crwselectpatron.jsp(114,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f6.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(114,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f6.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByLastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f6 = _jspx_th_base_005fsortHeaderOutput_005f6.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f7 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /backoffice/crwselectpatron.jsp(116,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f7.setDescription("First");
    // /backoffice/crwselectpatron.jsp(116,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f7.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(116,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f7.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByFirstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f7 = _jspx_th_base_005fsortHeaderOutput_005f7.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f8 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /backoffice/crwselectpatron.jsp(117,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f8.setDescription("Middle");
    // /backoffice/crwselectpatron.jsp(117,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f8.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(117,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f8.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByMiddleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f8 = _jspx_th_base_005fsortHeaderOutput_005f8.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f9 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(122,16) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f9.setDescription("Barcode");
    // /backoffice/crwselectpatron.jsp(122,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f9.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(122,16) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f9.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortByBarcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f9 = _jspx_th_base_005fsortHeaderOutput_005f9.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fsortHeaderOutput_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sortHeaderOutput
    com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f10 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
    _jspx_th_base_005fsortHeaderOutput_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsortHeaderOutput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(125,16) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f10.setDescription("Site");
    // /backoffice/crwselectpatron.jsp(125,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f10.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(125,16) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsortHeaderOutput_005f10.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sortBySiteShortName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005fsortHeaderOutput_005f10 = _jspx_th_base_005fsortHeaderOutput_005f10.doStartTag();
    if (_jspx_th_base_005fsortHeaderOutput_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fpageListOutput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:pageListOutput
    com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
    _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(154,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fpageListOutput_005f1.setFormName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /backoffice/crwselectpatron.jsp(154,16) name = topOfPageLinks type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fpageListOutput_005f1.setTopOfPageLinks(false);
    int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
    if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
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
    // /backoffice/crwselectpatron.jsp(169,12) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setPrinterFriendly(false);
    // /backoffice/crwselectpatron.jsp(169,12) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setHeading("&nbsp;Currently Selected");
    // /backoffice/crwselectpatron.jsp(169,12) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setTdContent("width='100%' colSpan='2'");
    int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
    if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/crwselectpatron.jsp(213,26) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/crwselectpatron.jsp(213,26) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
