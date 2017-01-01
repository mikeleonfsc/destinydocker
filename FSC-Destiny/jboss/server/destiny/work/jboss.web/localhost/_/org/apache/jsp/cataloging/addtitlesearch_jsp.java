package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.util.xml.AssetXML;
import com.follett.fsc.destiny.client.common.data.Tab;
import com.follett.fsc.common.*;
import com.follett.fsc.destiny.util.marc.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class addtitlesearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/addtitlesearch.jsp(28,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("searchOptions");
      // /cataloging/addtitlesearch.jsp(28,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( AddTitleSearchForm.FORM_NAME );
      // /cataloging/addtitlesearch.jsp(28,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("searchOptions");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object searchOptions = null;
      searchOptions = (java.lang.Object) _jspx_page_context.findAttribute("searchOptions");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /cataloging/addtitlesearch.jsp(29,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("searchMaterials");
      // /cataloging/addtitlesearch.jsp(29,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName( AddTitleSearchForm.FORM_NAME );
      // /cataloging/addtitlesearch.jsp(29,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("searchMaterials");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object searchMaterials = null;
      searchMaterials = (java.lang.Object) _jspx_page_context.findAttribute("searchMaterials");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /cataloging/addtitlesearch.jsp(30,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("sortOptions");
      // /cataloging/addtitlesearch.jsp(30,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName( AddTitleSearchForm.FORM_NAME );
      // /cataloging/addtitlesearch.jsp(30,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("sortOptions");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      java.lang.Object sortOptions = null;
      sortOptions = (java.lang.Object) _jspx_page_context.findAttribute("sortOptions");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    AddTitleSearchForm form = (AddTitleSearchForm)request.getAttribute(AddTitleSearchForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String focusControl = "";
    
    if (form.getTotalCount() == 0 || form.isInInitializeData()) {
        focusControl = AddTitleSearchForm.FIELD_KEYWORD_TEXT; // only set when we have no results
    }
    int itemsInList = form.getTotalCount(); // if nonzero, paint results
    int currentPage = PageCalculator.getCurrentPage(form);
    

      out.write("\r\n<!-- ONLY display the table if there was results passed -->\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/addtitlesearch.jsp(49,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleaddtitlesearchform.do");
      // /cataloging/addtitlesearch.jsp(49,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setStyleId("keywordSearch");
      // /cataloging/addtitlesearch.jsp(49,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"trapEnterKey\">\r\n\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(52,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
          // /cataloging/addtitlesearch.jsp(52,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue( String.valueOf(form.getCollectionType()) );
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(53,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(AddTitleSearchForm.PARAM_PARENT_BIBID);
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
          // /cataloging/addtitlesearch.jsp(54,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(AddTitleSearchForm.PARAM_BIB_WISHLIST_ID);
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
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(55,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(AddTitleSearchForm.PARAM_SUPPLEMENT_STATUS);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(56,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(AddTitleSearchForm.FIELD_ORIGINAL_KEYWORD_TEXT);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(57,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(58,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(59,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty("action");
          // /cataloging/addtitlesearch.jsp(59,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setValue( AddTitleSearchForm.ACTION_SEARCH );
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(60,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty("lastSortType");
          // /cataloging/addtitlesearch.jsp(60,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setValue( form.getLastSortType() );
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(61,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty("descend");
          // /cataloging/addtitlesearch.jsp(61,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setValue( String.valueOf(form.isDescend()) );
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(62,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setProperty("dateDescend");
          // /cataloging/addtitlesearch.jsp(62,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setValue( String.valueOf(form.isDateDescend()) );
          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005fhidden_005f11(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n        ");
          //  logic:greaterThan
          org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f0 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
          _jspx_th_logic_005fgreaterThan_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fgreaterThan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(65,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setName( AddTitleSearchForm.FORM_NAME );
          // /cataloging/addtitlesearch.jsp(65,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setProperty( AddTitleSearchForm.PARM_TOTAL_COUNT );
          // /cataloging/addtitlesearch.jsp(65,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setValue("0");
          int _jspx_eval_logic_005fgreaterThan_005f0 = _jspx_th_logic_005fgreaterThan_005f0.doStartTag();
          if (_jspx_eval_logic_005fgreaterThan_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
              // /cataloging/addtitlesearch.jsp(66,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty("page");
              // /cataloging/addtitlesearch.jsp(66,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setValue( "" + currentPage );
              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
              out.write("\r\n            ");
              if (_jspx_meth_html_005fhidden_005f13(_jspx_th_logic_005fgreaterThan_005f0, _jspx_page_context))
                return;
              out.write("\r\n        ");
              int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fgreaterThan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f0);
          out.write("\r\n        \r\n");

Tab[] tabs = null;
if (form.getCollectionType() == CollectionType.LIBRARY ||
    form.getCollectionType() == CollectionType.ASSET) {
    tabs = form.getTabs();
}

          out.write("\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/addtitlesearch.jsp(78,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(AddTitleSearchForm.TABLE_ADD_TITLE);
          // /cataloging/addtitlesearch.jsp(78,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /cataloging/addtitlesearch.jsp(78,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(AddTitleSearchForm.ID_TAB);
          // /cataloging/addtitlesearch.jsp(78,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(tabs);
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n<tr>\r\n<td>\r\n");


    if (request.getAttribute("MyKeywordList") != null) {

        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        boolean tooManyHits = form.isTooManyHits();

        // If we have results OR pending ZSearches, display a result.
        if (itemsInList > 0 || form.isZSearchesPending()) {

              out.write("\r\n            <table id='");
              out.print(BaseSearchResultsForm.TABLE_PAGING_HEADER);
              out.write("' width=\"100%\">\r\n            <tr>\r\n                <td class=\"ColRowBold\" colspan=\"2\">\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(95,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName( AddTitleSearchForm.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(95,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
              // /cataloging/addtitlesearch.jsp(95,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue("" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /cataloging/addtitlesearch.jsp(96,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setName( AddTitleSearchForm.FORM_NAME );
                  // /cataloging/addtitlesearch.jsp(96,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setProperty(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK);
                  // /cataloging/addtitlesearch.jsp(96,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setValue("false");
                  int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      out.print(MessageHelper.formatMessage("addtitlesearch_SearchedForAssetNames", form.getSearchAssetTypeDescription(), form.getSearchOptionDescription(), form.getKeywordText()) );
                      out.write(" \r\n                ");
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
                  out.write("\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /cataloging/addtitlesearch.jsp(99,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setName( AddTitleSearchForm.FORM_NAME );
                  // /cataloging/addtitlesearch.jsp(99,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setProperty(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK);
                  // /cataloging/addtitlesearch.jsp(99,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setValue("true");
                  int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                     ");
                      out.print(MessageHelper.formatMessage("addtitlesearch_XWithTheYZ", form.getMaterialTypeDescription(), form.getSearchOptionDescription(), form.getKeywordText()) );
                      out.write("\r\n                    ");
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
                  out.write(" \r\n                ");
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
              out.write("\r\n                ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(103,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName( AddTitleSearchForm.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(103,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
              // /cataloging/addtitlesearch.jsp(103,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue("" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
 if  (!form.isSearchAll()) { 
                  out.write("\r\n                        ");
                  out.print(BibType.getBibTypeIcon(Integer.parseInt(form.getSearchMaterial()), false, null, null, form.getCollectionType(), null, null) );
                  out.write("\r\n                    ");
 } 
                  out.write("\r\n                     ");
                  out.print(MessageHelper.formatMessage("addtitlesearch_XWithTheYZ", form.getMaterialTypeDescription(), form.getSearchOptionDescription(), form.getKeywordText()) );
                  out.write("\r\n                ");
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
              out.write("\r\n                </td>\r\n                <td class=\"Instruction tdAlignRight\">\r\n                    ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(111,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f0.setPermission(Permission.CAT_ADD_TITLES_AFTER_SEARCH);
              int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_NothingMatches"));
                  out.write("<br>\r\n                        ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  // /cataloging/addtitlesearch.jsp(113,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc(form.getNoSearchImage() );
                  // /cataloging/addtitlesearch.jsp(113,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName("addTheTitle");
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                    ");
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
              out.write("\r\n                    ");
              //  base:spanIfNotAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfNotAllowedTag _jspx_th_base_005fspanIfNotAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfNotAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfNotAllowedTag.class);
              _jspx_th_base_005fspanIfNotAllowed_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfNotAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(115,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfNotAllowed_005f0.setPermission(Permission.CAT_ADD_TITLES_AFTER_SEARCH);
              int _jspx_eval_base_005fspanIfNotAllowed_005f0 = _jspx_th_base_005fspanIfNotAllowed_005f0.doStartTag();
              if (_jspx_eval_base_005fspanIfNotAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        &nbsp;\r\n                    ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfNotAllowed_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfNotAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfNotAllowed_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfNotAllowed_005f0);
              out.write("\r\n                </td>\r\n            </tr>\r\n\r\n            ");
              //  logic:greaterThan
              org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f1 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
              _jspx_th_logic_005fgreaterThan_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fgreaterThan_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(121,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f1.setName( AddTitleSearchForm.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(121,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f1.setProperty( AddTitleSearchForm.PARM_TOTAL_COUNT );
              // /cataloging/addtitlesearch.jsp(121,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f1.setValue("0");
              int _jspx_eval_logic_005fgreaterThan_005f1 = _jspx_th_logic_005fgreaterThan_005f1.doStartTag();
              if (_jspx_eval_logic_005fgreaterThan_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\r\n                <tr>\r\n                    <td>\r\n                        ");
                  //  base:searchSummary
                  com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
                  _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsearchSummary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f1);
                  // /cataloging/addtitlesearch.jsp(125,24) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f0.setSearchType(form.getSummaryPrefix());
                  // /cataloging/addtitlesearch.jsp(125,24) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f0.setStartOfSet("" + ( itemsToSkip + 1 ) );
                  // /cataloging/addtitlesearch.jsp(125,24) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f0.setEndOfSet("" + ( itemsToPrint ));
                  // /cataloging/addtitlesearch.jsp(125,24) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f0.setTotalInSet("" + ( itemsInList ));
                  // /cataloging/addtitlesearch.jsp(125,24) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f0.setTooManyHits( "" + ( tooManyHits ) );
                  int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
                  if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                  out.write("\r\n                    </td>\r\n                    <td align=\"center\">\r\n                        <span class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("addtitlesearch_SortBy") );
                  out.write(" </span>\r\n                        ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f1);
                  // /cataloging/addtitlesearch.jsp(133,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setProperty(AddTitleSearchForm.COMBO_SORT);
                  // /cataloging/addtitlesearch.jsp(133,24) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setStyleClass("SmallColRow");
                  int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                  if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                        ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
                  out.write("\r\n                        ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f1);
                  // /cataloging/addtitlesearch.jsp(136,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/small/smallgo.gif");
                  // /cataloging/addtitlesearch.jsp(136,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
                  // /cataloging/addtitlesearch.jsp(136,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("go") );
                  // /cataloging/addtitlesearch.jsp(136,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setName(AddTitleSearchForm.ID_BUTTON_GO );
                  int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                  out.write("\r\n                    </td>\r\n                    <td class=\"SmallColHeading tdAlignRight\">\r\n                        ");
                  if (_jspx_meth_base_005fpageListOutput_005f0(_jspx_th_logic_005fgreaterThan_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                    </td>\r\n                </tr>\r\n\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fgreaterThan_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f1);
              out.write("\r\n\r\n            </table> <!-- BaseSearchResultsForm.TABLE_PAGING_HEADER -->\r\n\r\n            ");
              //  logic:greaterThan
              org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f2 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
              _jspx_th_logic_005fgreaterThan_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fgreaterThan_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(147,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f2.setName( AddTitleSearchForm.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(147,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f2.setProperty( AddTitleSearchForm.PARM_TOTAL_COUNT );
              // /cataloging/addtitlesearch.jsp(147,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f2.setValue("0");
              int _jspx_eval_logic_005fgreaterThan_005f2 = _jspx_th_logic_005fgreaterThan_005f2.doStartTag();
              if (_jspx_eval_logic_005fgreaterThan_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fgreaterThan_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n                <table id=\"keywordTable\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\">\r\n    ");

                    int sequence = 0;
    
                  out.write("\r\n                    ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
                  // /cataloging/addtitlesearch.jsp(153,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setId("rec");
                  // /cataloging/addtitlesearch.jsp(153,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setName( AddTitleSearchForm.FORM_NAME );
                  // /cataloging/addtitlesearch.jsp(153,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setProperty("list");
                  // /cataloging/addtitlesearch.jsp(153,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord");
                  int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord rec = null;
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f0.doInitBody();
                    }
                    rec = (com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) _jspx_page_context.findAttribute("rec");
                    do {
                      out.write("\r\n                        ");

                            String imgSrc = "/" + rec.getSourceTypeImageName();
                            String imgAlt = rec.getSourceTypeImageDescription();
                        
                      out.write("\r\n                        <tr>\r\n                             <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                      //  base:titleImage
                      com.follett.fsc.destiny.client.common.jsptag.TitleImageTag _jspx_th_base_005ftitleImage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleImageTag) _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleImageTag.class);
                      _jspx_th_base_005ftitleImage_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftitleImage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(160,32) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftitleImage_005f0.setRec( rec );
                      // /cataloging/addtitlesearch.jsp(160,32) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftitleImage_005f0.setPrinterFriendly( form.isPrinterFriendly() );
                      int _jspx_eval_base_005ftitleImage_005f0 = _jspx_th_base_005ftitleImage_005f0.doStartTag();
                      if (_jspx_th_base_005ftitleImage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
                      out.write("\r\n                            </td>\r\n                            <td width=\"100%\" valign=\"top\" id=\"");
                      out.print( (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO_CELL + sequence) );
                      out.write("\" >\r\n                                <table id=\"");
                      out.print( (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + sequence) );
                      out.write("\" border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                    <tr>\r\n                                        <td class = \"ColRowBold\" colspan=\"3\">\r\n                                            ");
                      out.print( form.outputTitleAndDetail(request, response, rec) );
                      out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td nowrap>\r\n                                            ");
                      if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(172,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setSrc(imgSrc );
                      // /cataloging/addtitlesearch.jsp(172,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setAlt(imgAlt );
                      int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                      if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                      out.write("\r\n                                            ");
 if  (form.isSearchAll()) { 
                      out.write("\r\n                                                ");
                      //  base:bibTypeIcon
                      com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                      _jspx_th_base_005fbibTypeIcon_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fbibTypeIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(174,48) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fbibTypeIcon_005f0.setRec( rec );
                      int _jspx_eval_base_005fbibTypeIcon_005f0 = _jspx_th_base_005fbibTypeIcon_005f0.doStartTag();
                      if (_jspx_th_base_005fbibTypeIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                      out.write("\r\n                                            ");
   } 
                      out.write("\r\n                                            ");
                      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                        </td>\r\n                                        <td class=\"ColRow\" colspan=\"2\" width=\"100%\">\r\n                                            ");
                      //  logic:notEqual
                      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                      _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(179,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f1.setName("rec");
                      // /cataloging/addtitlesearch.jsp(179,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f1.setProperty("collectionType");
                      // /cataloging/addtitlesearch.jsp(179,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f1.setValue(""+BibMasterSpecs.COLLECTION_TYPE_ASSET);
                      int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
                      if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                                ");
                          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fnotEqual_005f1, _jspx_page_context))
                            return;
                          out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                                ");
                          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fnotEqual_005f1, _jspx_page_context))
                            return;
                          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                                ");
                          out.print(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()));
                          out.write("&nbsp;&nbsp;\r\n                                                ");
if (rec.getReplacementPrice() != null) {
                          out.write("\r\n                                                    &nbsp;&nbsp;");
                          out.print(lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
                          out.write("\r\n                                                ");
} 
                          out.write("\r\n                                            ");
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
                      out.write("\r\n                                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(187,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setName("rec");
                      // /cataloging/addtitlesearch.jsp(187,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setProperty("collectionType");
                      // /cataloging/addtitlesearch.jsp(187,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setValue(""+BibMasterSpecs.COLLECTION_TYPE_ASSET);
                      int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                                ");
                          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
                            return;
                          out.write("\r\n                                            ");
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
                      out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    ");
 if (rec.getCollectionType() == CollectionType.ASSET) { 
                      out.write("\r\n                                        ");
 if (AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID())) { 
                      out.write("\r\n                                            <tr>\r\n                                                <td>&nbsp;</td>\r\n                                                <td class=\"ColRow\" valign=\"top\" width=\"100%\">\r\n                                                    ");
                      //  base:bibTypeIcon
                      com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f1 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                      _jspx_th_base_005fbibTypeIcon_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fbibTypeIcon_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(197,52) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fbibTypeIcon_005f1.setRec(rec);
                      // /cataloging/addtitlesearch.jsp(197,52) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fbibTypeIcon_005f1.setPrinterFriendly(form.isPrinterFriendly());
                      int _jspx_eval_base_005fbibTypeIcon_005f1 = _jspx_th_base_005fbibTypeIcon_005f1.doStartTag();
                      if (_jspx_th_base_005fbibTypeIcon_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f1);
                      out.write("\r\n                                                    &nbsp;\r\n                                                    ");
                      out.print(SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false));
                      out.write("\r\n                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
                      out.print(SearchResultsOutputListRenderer.getFilteredString(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()), true));
                      out.write("\r\n                                                    ");
 if (rec.getReplacementPrice() != null) { 
                      out.write("\r\n                                                        &nbsp;&nbsp;");
                      out.print(lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT));
                      out.write("\r\n                                                    ");
 } 
                      out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                            \r\n                                            ");
 if(!StringHelper.isEmpty(rec.getPublisher()) || !StringHelper.isEmpty(rec.getPubYear()) || !StringHelper.isEmpty(rec.getEdition())) { 
                      out.write("\r\n                                                <tr>\r\n                                                    <td>&nbsp;</td>\r\n                                                    <td class=\"ColRow\">\r\n                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                                        ");
 if ( !StringHelper.isEmpty(rec.getPublisher()) ) { 
                      out.write("\r\n                                                            ");
                      out.print(ResponseUtils.filter(rec.getPublisher()));
                      out.write("&nbsp;\r\n                                                        ");
 } 
                      out.write(" \r\n                                                        ");
 if ( !StringHelper.isEmpty(rec.getPubYear()) ) { 
                      out.write("\r\n                                                            ");
                      out.print(ResponseUtils.filter(rec.getPubYear()));
                      out.write("&nbsp;\r\n                                                        ");
 } 
                      out.write(" \r\n                                                        ");
 if ( !StringHelper.isEmpty(rec.getEdition()) ) { 
                      out.write("\r\n                                                            ");
                      out.print(ResponseUtils.filter(rec.getEdition()));
                      out.write("\r\n                                                        ");
 } 
                      out.write(" \r\n                                                                \r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
 } 
                      out.write("\r\n                                            \r\n                                            ");
 if (form.hasAdoptionInfo(rec)) { 
                      out.write("\r\n                                                <tr>\r\n                                                    <td>&nbsp;</td>\r\n                                                    <td class=\"ColRow\">\r\n                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                                        ");
 if(!StringHelper.isEmpty(rec.getAdoptionState())) { 
                      out.write("\r\n                                                            State Adopted: ");
                      out.print(ResponseUtils.filter(rec.getAdoptionState()) );
                      out.write("&nbsp;\r\n                                                        ");
 } 
                      out.write("\r\n                                                        ");
 if(!StringHelper.isEmpty(rec.getAdoptionDistrict())) { 
                      out.write("\r\n                                                            District Adopted: ");
                      out.print(ResponseUtils.filter(rec.getAdoptionDistrict()) );
                      out.write("&nbsp;\r\n                                                        ");
 } 
                      out.write("\r\n                                                        ");
 if(!StringHelper.isEmpty(rec.getAdoptionEnds())) { 
                      out.write("\r\n                                                            Adoption Ends: ");
                      out.print(ResponseUtils.filter(rec.getAdoptionEnds()) );
                      out.write("&nbsp;\r\n                                                        ");
 } 
                      out.write("\r\n                                                                \r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
 } 
                      out.write("\r\n                                            \r\n                                            \r\n                                            ");
if (! StringHelper.isEmpty(rec.getStateTextID()) ||
                                                  ! StringHelper.isEmpty(rec.getGradeLevel())){ 
                      out.write("                                              \r\n                                                <tr class=\"ColRow\">\r\n                                                    <td>&nbsp;</td>\r\n                                                    <td width=\"100%\">\r\n                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                                        ");
if (! StringHelper.isEmpty(rec.getStateTextID())) { 
                      out.write("\r\n                                                            ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_StateTextbookID", rec.getStateTextID()) );
                      out.write("&nbsp;\r\n                                                       ");
 } 
                      out.write("\r\n                                                       ");
if (! StringHelper.isEmpty(rec.getGradeLevel())) { 
                      out.write("\r\n                                                            ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_Grades", rec.getGradeLevel()) );
                      out.write("\r\n                                                       ");
 } 
                      out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
 } 
                      out.write("\r\n                                            ");
if (! StringHelper.isEmpty(rec.getAdditionalInfo())) { 
                      out.write("\r\n                                                <tr class=\"ColRow\">\r\n                                                    <td>&nbsp;</td>\r\n                                                    <td>\r\n                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                                        ");
                      if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                           ");
} 
                      out.write("\r\n                                            \r\n                                        ");
 } 
                      out.write("\r\n                                    \r\n                                    ");
 } else if (! StringHelper.isEmpty(rec.getPublisher260a()) ||
                                          ! StringHelper.isEmpty(rec.getPublisher()) ||
                                          ! StringHelper.isEmpty(rec.getPubYear())   ||
                                          ! StringHelper.isEmpty(rec.getSourceName()) ||
                                          ! StringHelper.isEmpty(rec.getEdition()) ||
                                          ! StringHelper.isEmpty(rec.getExtent()) ||
                                          ! (rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_TEACHERS_EDITION &&
                                              rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_KIT)) { 
                      out.write("\r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\" align=\"Center\">\r\n                                                ");
                      if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      if (_jspx_meth_logic_005fnotEmpty_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                            </td>\r\n                                            <td class=\"ColRow\" width=\"100%\">\r\n                                                ");
                      if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      if (_jspx_meth_logic_005fnotEmpty_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                                ");
                      if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      if (_jspx_meth_logic_005fnotEmpty_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                                ");
                      if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      if (_jspx_meth_logic_005fnotEmpty_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("&nbsp;\r\n                                                ");
                      if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      if (_jspx_meth_logic_005fnotEmpty_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                                ");
                      if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                            </td>\r\n                                            <td class=\"ColRowBold tdAlignRight\" NOWRAP>\r\n                                                ");
 if (rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_TEACHERS_EDITION) {
                      out.write("\r\n                                                    ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_TeacherEdition") );
                      out.write("\r\n                                                ");
 } else if (rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_KIT) {
                      out.write("\r\n                                                    ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_ResourceKit") );
                      out.write("\r\n                                                ");
 } else { 
                      out.write("\r\n                                                    &nbsp;\r\n                                                ");
 } 
                      out.write("\r\n                                             </td>   \r\n                                        </tr>\r\n                                    ");
 } 
                      out.write("\r\n                                    ");
 if (rec.getCollectionType() != CollectionType.ASSET && form.hasAdoptionInfo(rec)) { 
                      out.write("\r\n                                    <tr>\r\n                                        <td>&nbsp;</td>\r\n                                        <td>\r\n                                        \r\n                                            <table id=\"");
                      out.print( (AddTitleSearchForm.TABLE_ROW_ADOPTION_INFO + sequence) );
                      out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                <tr>\r\n                                                    <td class=\"ColRow\">\r\n                                                        ");
                      out.print(form.getAdoptionColumn(0, rec) );
                      out.write("\r\n                                                    </td>\r\n                                                    <td class=\"ColRow\">\r\n                                                        ");
                      out.print(form.getAdoptionColumn(1, rec) );
                      out.write("\r\n                                                    </td>\r\n                                                    <td class=\"ColRow\">\r\n                                                        ");
                      out.print(form.getAdoptionColumn(2, rec) );
                      out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            </table>\r\n                                        </td>\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    ");
 } 
                      out.write("\r\n                                    ");
                      //  logic:notEqual
                      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                      _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/addtitlesearch.jsp(325,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f2.setName("rec");
                      // /cataloging/addtitlesearch.jsp(325,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f2.setProperty("collectionType");
                      // /cataloging/addtitlesearch.jsp(325,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f2.setValue(""+BibMasterSpecs.COLLECTION_TYPE_ASSET);
                      int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
                      if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                        ");
if (! StringHelper.isEmpty(rec.getStateTextID()) ||
                                              ! StringHelper.isEmpty(rec.getGradeLevel())){ 
                          out.write("                                              \r\n                                            <tr class=\"ColRow\">\r\n                                                <td>&nbsp;&nbsp;</td>\r\n                                                <td colspan=\"2\" width=\"100%\">\r\n                                                    ");
if (! StringHelper.isEmpty(rec.getStateTextID())) { 
                          out.write("\r\n                                                        ");
                          out.print( MessageHelper.formatMessage("addtitlesearch_StateTextbookID", rec.getStateTextID()) );
                          out.write("&nbsp;\r\n                                                   ");
 } 
                          out.write("\r\n                                                   ");
if (! StringHelper.isEmpty(rec.getGradeLevel())) { 
                          out.write("\r\n                                                        ");
                          out.print( MessageHelper.formatMessage("addtitlesearch_Grades", rec.getGradeLevel()) );
                          out.write("\r\n                                                   ");
 } 
                          out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
 } 
                          out.write("\r\n                                        ");
if (! StringHelper.isEmpty(rec.getAdditionalInfo())) { 
                          out.write("\r\n                                            <tr class=\"ColRow\">\r\n                                                <td>&nbsp;</td>\r\n                                                <td>\r\n                                                    ");
                          if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fnotEqual_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                       ");
} 
                          out.write("\r\n                                    ");
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
                      out.write("\r\n                                </table>  <!-- BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO -->\r\n                            </td>\r\n                            <td valign=\"top\" id=\"");
                      out.print( (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS_CELL + sequence) );
                      out.write("\" >\r\n                                <table id=\"");
                      out.print( (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS + (sequence++)) );
                      out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                  <tr><td><!-- placeholder --></td></tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"100%\" colspan=\"2\">\r\n                                ");
                      if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                      rec = (com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) _jspx_page_context.findAttribute("rec");
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
                  out.write("\r\n\r\n                <!-- end the table now... -->\r\n                </table> <!-- keywordTable -->\r\n\r\n\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fgreaterThan_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f2);
              out.write("\r\n\r\n            ");
              //  logic:lessEqual
              org.apache.struts.taglib.logic.LessEqualTag _jspx_th_logic_005flessEqual_005f0 = (org.apache.struts.taglib.logic.LessEqualTag) _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.LessEqualTag.class);
              _jspx_th_logic_005flessEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005flessEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(370,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005flessEqual_005f0.setName( AddTitleSearchForm.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(370,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005flessEqual_005f0.setProperty( AddTitleSearchForm.PARM_TOTAL_COUNT );
              // /cataloging/addtitlesearch.jsp(370,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005flessEqual_005f0.setValue("0");
              int _jspx_eval_logic_005flessEqual_005f0 = _jspx_th_logic_005flessEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005flessEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <table id=\"");
                  out.print( AddTitleSearchForm.TABLE_NO_MATCHES );
                  out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold\" align=\"center\">\r\n                            ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_NoMatchesSoFar") );
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table> <!-- AddTitleSearchForm.TABLE_NO_MATCHES -->\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005flessEqual_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005flessEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005flessEqual_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005flessEqual_005f0);
              out.write("\r\n\r\n            <table width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" id=\"");
              out.print( BaseSearchResultsForm.TABLE_PAGING_FOOTER );
              out.write("\">\r\n\r\n            ");
              //  logic:greaterThan
              org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f3 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
              _jspx_th_logic_005fgreaterThan_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fgreaterThan_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(382,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f3.setName( AddTitleSearchForm.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(382,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f3.setProperty( AddTitleSearchForm.PARM_TOTAL_COUNT );
              // /cataloging/addtitlesearch.jsp(382,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fgreaterThan_005f3.setValue("0");
              int _jspx_eval_logic_005fgreaterThan_005f3 = _jspx_th_logic_005fgreaterThan_005f3.doStartTag();
              if (_jspx_eval_logic_005fgreaterThan_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\r\n                <tr>\r\n                    <td>\r\n                        ");
                  //  base:searchSummary
                  com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
                  _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsearchSummary_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f3);
                  // /cataloging/addtitlesearch.jsp(386,24) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f1.setSearchType(form.getSummaryPrefix());
                  // /cataloging/addtitlesearch.jsp(386,24) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f1.setStartOfSet("" + ( itemsToSkip + 1 ) );
                  // /cataloging/addtitlesearch.jsp(386,24) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f1.setEndOfSet("" + ( itemsToPrint ));
                  // /cataloging/addtitlesearch.jsp(386,24) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f1.setTotalInSet("" + ( itemsInList ));
                  // /cataloging/addtitlesearch.jsp(386,24) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsearchSummary_005f1.setTooManyHits("" + ( tooManyHits ));
                  int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
                  if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                  out.write("\r\n                    </td>\r\n                    <td class=\"SmallColHeading tdAlignRight\">\r\n                        ");
                  if (_jspx_meth_base_005fpageListOutput_005f1(_jspx_th_logic_005fgreaterThan_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                    </td>\r\n                </tr>\r\n\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fgreaterThan_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f3);
              out.write("\r\n\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(399,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName( form.FORM_NAME );
              // /cataloging/addtitlesearch.jsp(399,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("ZSearchesPending");
              // /cataloging/addtitlesearch.jsp(399,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("true");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <tr>\r\n                    <td colspan=\"2\" align=\"Center\" class=\"ColRowBold\">\r\n                        ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  // /cataloging/addtitlesearch.jsp(402,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setSrc("/icons/general/zprogress.gif");
                  // /cataloging/addtitlesearch.jsp(402,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("addtitlesearch_Searching") );
                  int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                  if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                  out.write("\r\n                        ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_SearchingSources") );
                  out.write("&nbsp;&nbsp;&nbsp;\r\n                        ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  // /cataloging/addtitlesearch.jsp(404,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/getzresults.gif");
                  // /cataloging/addtitlesearch.jsp(404,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setName(AddTitleSearchForm.BUTTON_GET_Z_RESULTS);
                  // /cataloging/addtitlesearch.jsp(404,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("getZresults") );
                  int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                  out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
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
              out.write("\r\n            \r\n        </table> <!-- BaseSearchResultsForm.TABLE_PAGING_FOOTER -->\r\n\r\n");

        }
    }

              out.write("\r\n\r\n<table id='");
              out.print(AddTitleSearchForm.TABLE_FOOTER);
              out.write("' width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n        <td>\r\n            <table id='");
              out.print(AddTitleSearchForm.TABLE_FOOTER_SEARCH);
              out.write("' border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                <tr>\r\n                    ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(421,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setName(AddTitleSearchForm.FORM_NAME);
              // /cataloging/addtitlesearch.jsp(421,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
              // /cataloging/addtitlesearch.jsp(421,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setValue( "" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
              int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("    \r\n                        <td class=\"FormLabel\">\r\n                           ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_Find") );
                  out.write("\r\n                        </td>\r\n                        <td>\r\n                            ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/addtitlesearch.jsp(426,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f1.setProperty(AddTitleSearchForm.FIELD_SEARCH_MATERIAL);
                  int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                  if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                            ");
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
                  out.write("\r\n                        </td>\r\n                        <td class=\"ColRow\">\r\n                            ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_With") );
                  out.write("\r\n                        </td>\r\n                        <td>\r\n                            ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/addtitlesearch.jsp(434,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f2.setProperty(AddTitleSearchForm.FIELD_SEARCH_OPTION);
                  int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                  if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n                            ");
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
                  out.write("\r\n                        </td>\r\n                        <td>           \r\n                            ");
 if ((itemsInList > 0 || form.isZSearchesPending()) && form.getCollectionType() == CollectionType.TEXTBOOK) { 
                  out.write("  \r\n                                ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/addtitlesearch.jsp(440,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setProperty(AddTitleSearchForm.FIELD_KEYWORD_TEXT);
                  // /cataloging/addtitlesearch.jsp(440,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setSize("12");
                  int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                  if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                  out.write("\r\n                            ");
 } else { 
                  out.write("\r\n                                ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/addtitlesearch.jsp(442,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f1.setProperty(AddTitleSearchForm.FIELD_KEYWORD_TEXT);
                  // /cataloging/addtitlesearch.jsp(442,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f1.setSize("60");
                  int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                  if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                  out.write("\r\n                            ");
 } 
                  out.write("\r\n                        \r\n                        </td>\r\n                        <td valign=\"bottom\" class=\"ColRow\">\r\n                            <br>");
                  if (_jspx_meth_base_005fshowHideTag_005f0(_jspx_th_logic_005fnotEqual_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
              out.write("\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(452,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName(AddTitleSearchForm.FORM_NAME);
              // /cataloging/addtitlesearch.jsp(452,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
              // /cataloging/addtitlesearch.jsp(452,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue( "" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("    \r\n                        ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/addtitlesearch.jsp(453,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setId("assets");
                  // /cataloging/addtitlesearch.jsp(453,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setName( AddTitleSearchForm.FORM_NAME );
                  // /cataloging/addtitlesearch.jsp(453,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setProperty("assetTreeOptionList");
                  int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
                  if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
                  java.lang.Object assets = null;
                  assets = (java.lang.Object) _jspx_page_context.findAttribute("assets");
                  out.write("\r\n                        <td>\r\n                            <table id='");
                  out.print(AddTitleSearchForm.TABLE_SUB_FOOTER_SEARCH);
                  out.write("' border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                            <tr>\r\n                                <td class=\"FormLabel tdAlignRight\">\r\n                                    ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_FindAll") );
                  out.write("\r\n                                </td>\r\n                                ");
 if (form.getAssetTreeOptionList().size() > 1) { 
                  out.write("\r\n                                    <td colspan=\"2\">\r\n                                    <table><tr><td>\r\n                                        ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/addtitlesearch.jsp(463,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f3.setProperty(AddTitleSearchForm.FIELD_ASSET_TYPE );
                  // /cataloging/addtitlesearch.jsp(463,40) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f3.setOnchange("submitOnTemplateChange()");
                  int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
                  if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f3.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      if (_jspx_meth_html_005foptions_005f3(_jspx_th_html_005fselect_005f3, _jspx_page_context))
                        return;
                      out.write("\r\n                                        ");
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
                  out.write("\r\n                                     </td></tr></table>\r\n                                    </td>\r\n                                ");
 } else { 
                  out.write("\r\n                                    <td class=\"ColRow tdAlignLeft\" colspan=\"2\">\r\n                                        ");
                  out.print( form.getAssetTreeOptionList().getString(0) );
                  out.write("\r\n                                    </td>\r\n                                ");
 } 
                  out.write("\r\n                                \r\n                            </tr>\r\n                            ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/addtitlesearch.jsp(475,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setName(AddTitleSearchForm.FORM_NAME);
                  // /cataloging/addtitlesearch.jsp(475,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setProperty(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK);
                  // /cataloging/addtitlesearch.jsp(475,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setValue("false");
                  int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("    \r\n                            \r\n                            <tr valign=\"top\">\r\n                                <td class=\"FormLabel tdAlignRight\">\r\n                                    ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_WhereAssetName") );
                      out.write("\r\n                                </td>\r\n                                <td nowrap>\r\n                                      <table><tr>\r\n                                           <td  valign=\"top\">\r\n                                                ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                      // /cataloging/addtitlesearch.jsp(484,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f4.setProperty(AddTitleSearchForm.FIELD_SEARCH_OPTION);
                      int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
                      if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f4.doInitBody();
                        }
                        do {
                          out.write("\r\n                                                    ");
                          if (_jspx_meth_html_005foptions_005f4(_jspx_th_html_005fselect_005f4, _jspx_page_context))
                            return;
                          out.write("\r\n                                                ");
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
                      out.write("                                  \r\n                                                ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                      // /cataloging/addtitlesearch.jsp(487,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setProperty(AddTitleSearchForm.FIELD_KEYWORD_TEXT);
                      // /cataloging/addtitlesearch.jsp(487,48) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setMaxlength(String.valueOf(AssetXML.MAX_LENGTH_TEXT));
                      // /cataloging/addtitlesearch.jsp(487,48) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setSize("60");
                      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
                      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                      out.write("\r\n                                           </td>\r\n                                           <td valign=\"bottom\" class=\"ColRow\">\r\n                                                ");
                      if (_jspx_meth_base_005fshowHideTag_005f1(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
                        return;
                      out.write("\r\n                                            </td>\r\n                                        </tr></table>\r\n                                </td>\r\n                                <td></td>\r\n                            </tr>\r\n                            ");
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
                  out.write("\r\n                            ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/addtitlesearch.jsp(499,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setName(AddTitleSearchForm.FORM_NAME);
                  // /cataloging/addtitlesearch.jsp(499,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setProperty(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK);
                  // /cataloging/addtitlesearch.jsp(499,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setValue("true");
                  int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <tr valign=\"top\">\r\n                                    <td>\r\n                                        ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/addtitlesearch.jsp(502,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f5.setProperty(AddTitleSearchForm.FIELD_SEARCH_MATERIAL);
                      int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
                      if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f5.doInitBody();
                        }
                        do {
                          out.write("\r\n                                            ");
                          if (_jspx_meth_html_005foptions_005f5(_jspx_th_html_005fselect_005f5, _jspx_page_context))
                            return;
                          out.write("\r\n                                        ");
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
                      out.write("\r\n                                        &nbsp;<span class=\"FormLabel\">");
                      out.print( MessageHelper.formatMessage("addtitlesearch_With") );
                      out.write("</span>\r\n                                    </td>\r\n                                    <td>\r\n                                        ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/addtitlesearch.jsp(508,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f6.setProperty(AddTitleSearchForm.FIELD_SEARCH_OPTION);
                      int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
                      if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f6.doInitBody();
                        }
                        do {
                          out.write("\r\n                                            ");
                          if (_jspx_meth_html_005foptions_005f6(_jspx_th_html_005fselect_005f6, _jspx_page_context))
                            return;
                          out.write("\r\n                                        ");
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
                      out.write("\r\n                                        &nbsp;\r\n                                        ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/addtitlesearch.jsp(512,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setProperty(AddTitleSearchForm.FIELD_KEYWORD_TEXT);
                      // /cataloging/addtitlesearch.jsp(512,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setMaxlength(String.valueOf(AssetXML.MAX_LENGTH_TEXT));
                      // /cataloging/addtitlesearch.jsp(512,40) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setSize("60");
                      int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
                      if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                      out.write("\r\n                                    </td>\r\n                                    <td valign=\"bottom\" class=\"ColRow\">\r\n                                        ");
                      if (_jspx_meth_base_005fshowHideTag_005f2(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
                        return;
                      out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td class=\"FormLabel tdAlignRight\">\r\n                                        &nbsp;\r\n                                    </td>\r\n                                    <td class=\"ColRow\" valign=\"bottom\" colspan=\"2\" nowrap>\r\n                                        ");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/addtitlesearch.jsp(525,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f0.setProperty(AddTitleSearchForm.FIELD_LIMIT_TO_ADOPTION_BY_STATE);
                      int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                      out.write("\r\n                                        ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_LimitTRecordsToThoseAdoptedByMyState", "<sup>2</sup>") );
                      out.write(" \r\n                                    </td>\r\n                                </tr>\r\n                            \r\n                            ");
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
                  out.write("    \r\n                            </table>\r\n                        </td>\r\n                    ");
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
              out.write("\r\n                </tr>\r\n                ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK) {
              out.write("\r\n                <tr>\r\n                    <td class=\"FormLabel tdAlignRight\">\r\n                        &nbsp;\r\n                    </td>\r\n                    <td class=\"ColRow\" valign=\"bottom\" colspan=\"5\" nowrap>\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(541,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty(AddTitleSearchForm.FIELD_LIMIT_TO_ADOPTION_BY_STATE);
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write("\r\n                        ");
              out.print( MessageHelper.formatMessage("addtitlesearch_LimitTRecordsToThoseAdoptedByMyState", "<sup>2</sup>") );
              out.write(" \r\n                    </td>\r\n                </tr>\r\n                ");
 } 
              out.write("\r\n            </table> <!-- AddTitleSearchForm.TABLE_FOOTER_SEARCH -->\r\n        </td>\r\n        ");

            if (itemsInList > 0 || form.isZSearchesPending()) { 
        
              out.write("  \r\n                <td class=\"Instruction tdAlignRight\">\r\n                    ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(552,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f1.setPermission(form.getPermissionForAddTitleAfterSearch());
              int _jspx_eval_base_005fspanIfAllowed_005f1 = _jspx_th_base_005fspanIfAllowed_005f1.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_NothingMatches") );
                  out.write("<br>");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f1);
                  // /cataloging/addtitlesearch.jsp(553,95) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f3.setSrc(form.getNoSearchImage());
                  // /cataloging/addtitlesearch.jsp(553,95) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f3.setName("addTheTitle");
                  int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                  out.write("\r\n                    ");
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
              out.write("                \r\n                    ");
              //  base:spanIfNotAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfNotAllowedTag _jspx_th_base_005fspanIfNotAllowed_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfNotAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfNotAllowedTag.class);
              _jspx_th_base_005fspanIfNotAllowed_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfNotAllowed_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(555,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfNotAllowed_005f1.setPermission(Permission.CAT_ADD_TITLES_AFTER_SEARCH);
              int _jspx_eval_base_005fspanIfNotAllowed_005f1 = _jspx_th_base_005fspanIfNotAllowed_005f1.doStartTag();
              if (_jspx_eval_base_005fspanIfNotAllowed_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        &nbsp;\r\n                    ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfNotAllowed_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfNotAllowed_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfNotAllowed_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfNotAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfNotAllowed_005f1);
              out.write("                    \r\n                </td>\r\n        ");
 } else { 
              out.write("\r\n                \r\n                ");
 
                Permission permission = form.getPermissionForAddTitleNoSearch();
                
              out.write("\r\n                ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(564,16) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f2.setPermission(permission);
              int _jspx_eval_base_005fspanIfAllowed_005f2 = _jspx_th_base_005fspanIfAllowed_005f2.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <td class=\"Instruction tdAlignRight\">\r\n                        ");
                  out.print( MessageHelper.formatMessage("addtitlesearch_Nonexistent") );
                  out.write("<br>");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f2);
                  // /cataloging/addtitlesearch.jsp(566,92) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f4.setSrc(form.getNoSearchImage());
                  // /cataloging/addtitlesearch.jsp(566,92) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f4.setName(AddTitleSearchForm.ID_LINK_ADD_TITLE );
                  int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                  out.write("\r\n                    </td>\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f2);
              out.write("\r\n                <td class=\"tdAlignRight\">\r\n                    &nbsp;\r\n                </td>\r\n         ");
 } 
              out.write("\r\n    </tr>\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(574,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setName(AddTitleSearchForm.FORM_NAME);
              // /cataloging/addtitlesearch.jsp(574,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setProperty(AddTitleSearchForm.PARM_ADD_TITLE_BANNER_DISPLAYABLE);
              // /cataloging/addtitlesearch.jsp(574,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setValue("true");
              int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
              if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr>\r\n                <td colspan=\"2\">\r\n                    ");
                  if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
                    return;
                  out.write("\r\n                </td>        \r\n            </tr>\r\n            <tr>\r\n                ");
 if (!UserContext.getMyContextLocaleHelper().isInternationalProduct() && form.isAddTitleBannerDisplayable()) { 
                  out.write("\r\n                ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f4 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /cataloging/addtitlesearch.jsp(582,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f4.setName(AddTitleSearchForm.FORM_NAME);
                  // /cataloging/addtitlesearch.jsp(582,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f4.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
                  // /cataloging/addtitlesearch.jsp(582,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f4.setValue( "" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_logic_005fnotEqual_005f4 = _jspx_th_logic_005fnotEqual_005f4.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    <td class=\"SmallFixed\" align=\"center\" colspan=\"2\">\r\n                        ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_LookingForTitlesToSupportYourCurriculumCheckOut") );
                      out.write(" <br>\r\n                        ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
                      // /cataloging/addtitlesearch.jsp(585,24) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setTarget("titlewave");
                      // /cataloging/addtitlesearch.jsp(585,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setHref("/common/servlet/presenttitlewaveredirectform.do");
                      // /cataloging/addtitlesearch.jsp(585,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setId(AddTitleSearchForm.ID_LINK_TITLEWAVE );
                      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f0.doInitBody();
                        }
                        do {
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                          // /cataloging/addtitlesearch.jsp(585,157) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f2.setSrc("/icons/general/FLRbanner.gif");
                          // /cataloging/addtitlesearch.jsp(585,157) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f2.setAlt( MessageHelper.formatMessage("addtitlesearch_Titlewave") );
                          // /cataloging/addtitlesearch.jsp(585,157) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f2.setVspace(1);
                          int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                          if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                          out.write(' ');
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
                      out.write("\r\n                    </td>\r\n                ");
                      int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fnotEqual_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f4);
                  out.write("\r\n                ");
 } 
                  out.write("\r\n    \r\n                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /cataloging/addtitlesearch.jsp(590,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setName(AddTitleSearchForm.FORM_NAME);
                  // /cataloging/addtitlesearch.jsp(590,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setProperty(AddTitleSearchForm.FIELD_COLLECTION_TYPE);
                  // /cataloging/addtitlesearch.jsp(590,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setValue( "" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    <td class=\"SmallFixed\" align=\"center\" colspan=\"2\">\r\n                       ");
                      out.print( MessageHelper.formatMessage("addtitlesearch_LookingForTitlesToSupportYourCurriculumCheckOut") );
                      out.write("<br>\r\n                        ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /cataloging/addtitlesearch.jsp(593,24) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setTarget("titlewave");
                      // /cataloging/addtitlesearch.jsp(593,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setHref(form.getFESTextbookURL());
                      // /cataloging/addtitlesearch.jsp(593,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setId(AddTitleSearchForm.ID_LINK_FES );
                      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f1.doInitBody();
                        }
                        do {
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                          // /cataloging/addtitlesearch.jsp(593,133) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f3.setSrc("/icons/general/fesbanner.png");
                          // /cataloging/addtitlesearch.jsp(593,133) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f3.setAlt( MessageHelper.formatMessage("addtitlesearch_FollettEducationalServices") );
                          // /cataloging/addtitlesearch.jsp(593,133) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f3.setVspace(1);
                          int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                          if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                          out.write(' ');
                          int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                      out.write("\r\n                    </td>\r\n                ");
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
                  out.write("\r\n            </tr>\r\n            \r\n            ");
if ( store.canDo(Permission.DISTRICT_VIEW_ACCESS_ONLINE_STORE) && DestinySystemProperties.isShowOnlineStore() && !UserContext.getMyContextLocaleHelper().isInternationalProduct()){ 
                  out.write("\r\n                <tr><td class=\"ColRow\"> &nbsp; </td></tr>\r\n                <tr>\r\n                   <td class=\"SmallFixed\" align=\"center\" colspan=\"2\">\r\n                       ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /cataloging/addtitlesearch.jsp(602,23) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setPage(GenericForm.gimmeECommerceLink(store));
                  // /cataloging/addtitlesearch.jsp(602,23) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setTarget("_blank");
                  // /cataloging/addtitlesearch.jsp(602,23) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setId(AddTitleSearchForm.ID_LINK_SHOPFOLLETTSOFTWARE );
                  int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                  if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                          ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                      // /cataloging/addtitlesearch.jsp(603,26) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setSrc("/icons/general/DestinyExpress.gif");
                      // /cataloging/addtitlesearch.jsp(603,26) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setAlt( MessageHelper.formatMessage("addtitlesearch_ShopFollettSoftware") );
                      // /cataloging/addtitlesearch.jsp(603,26) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setAlign("absbottom");
                      int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                      if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                      out.write("\r\n                       ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                  out.write("\r\n                   </td>\r\n                </tr>\r\n            ");
}
                  out.write("\r\n            \r\n        ");
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
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/addtitlesearch.jsp(610,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setName(AddTitleSearchForm.FORM_NAME);
              // /cataloging/addtitlesearch.jsp(610,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setProperty(AddTitleSearchForm.PARM_ADD_TITLE_BANNER_DISPLAYABLE);
              // /cataloging/addtitlesearch.jsp(610,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setValue("false");
              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr><td> &nbsp; </td></tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
              out.write("\r\n    \r\n</table> <!-- AddTitleSearchForm.TABLE_FOOTER -->\r\n\r\n</td>\r\n</tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
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
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\nfunction submitOnTemplateChange() {\r\n    document.");
      out.print(AddTitleSearchForm.FORM_NAME);
      out.write('.');
      out.print(AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED);
      out.write(".value = \"true\";\r\n    document.");
      out.print(AddTitleSearchForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\n//-->\r\n</script>\r\n\r\n");
      out.write("\r\n<!-- ");
      out.print(request.getSession().getAttribute(AddTitleSearchForm.ATTR_ALLIANCE_SEARCH_MESSAGE));
      out.write(" -->\r\n\r\n");
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
    // /cataloging/addtitlesearch.jsp(32,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/addtitlesearch.jsp(63,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f11.setProperty("flrEBooksOfferDisabled");
    // /cataloging/addtitlesearch.jsp(63,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f11.setValue("true");
    int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
    if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
    // /cataloging/addtitlesearch.jsp(67,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f13.setProperty("totalCount");
    int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
    if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
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
    // /cataloging/addtitlesearch.jsp(134,28) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("sortOptions");
    // /cataloging/addtitlesearch.jsp(134,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("stringCode");
    // /cataloging/addtitlesearch.jsp(134,28) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fpageListOutput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:pageListOutput
    com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
    _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f1);
    // /cataloging/addtitlesearch.jsp(139,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fpageListOutput_005f0.setFormName("cataloging_servlet_AddTitleSearchForm");
    int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
    if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
    // /cataloging/addtitlesearch.jsp(148,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /cataloging/addtitlesearch.jsp(148,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/addtitlesearch.jsp(171,44) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(15);
    // /cataloging/addtitlesearch.jsp(171,44) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(176,44) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(15);
    // /cataloging/addtitlesearch.jsp(176,44) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
    // /cataloging/addtitlesearch.jsp(180,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("rec");
    // /cataloging/addtitlesearch.jsp(180,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("author");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
    // /cataloging/addtitlesearch.jsp(181,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setName("rec");
    // /cataloging/addtitlesearch.jsp(181,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setProperty("displayableLCCN");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    // /cataloging/addtitlesearch.jsp(188,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setName("rec");
    // /cataloging/addtitlesearch.jsp(188,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setProperty("assetTypeDescription");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(266,56) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f3.setName("rec");
    // /cataloging/addtitlesearch.jsp(266,56) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f3.setProperty("additionalInfo");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
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
    // /cataloging/addtitlesearch.jsp(283,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f4.setName("rec");
    // /cataloging/addtitlesearch.jsp(283,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f4.setProperty("sourceName");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(283,95) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f0.setName("rec");
    // /cataloging/addtitlesearch.jsp(283,95) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f0.setProperty("sourceName");
    int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
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
    // /cataloging/addtitlesearch.jsp(286,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setName("rec");
    // /cataloging/addtitlesearch.jsp(286,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setProperty("publisher260a");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f1 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(286,98) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f1.setName("rec");
    // /cataloging/addtitlesearch.jsp(286,98) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f1.setProperty("publisher260a");
    int _jspx_eval_logic_005fnotEmpty_005f1 = _jspx_th_logic_005fnotEmpty_005f1.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f1);
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
    // /cataloging/addtitlesearch.jsp(287,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setName("rec");
    // /cataloging/addtitlesearch.jsp(287,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setProperty("publisher");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f2 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(287,94) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f2.setName("rec");
    // /cataloging/addtitlesearch.jsp(287,94) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f2.setProperty("publisher");
    int _jspx_eval_logic_005fnotEmpty_005f2 = _jspx_th_logic_005fnotEmpty_005f2.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(288,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setName("rec");
    // /cataloging/addtitlesearch.jsp(288,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setProperty("pubYear");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f3 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(288,92) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f3.setName("rec");
    // /cataloging/addtitlesearch.jsp(288,92) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f3.setProperty("pubYear");
    int _jspx_eval_logic_005fnotEmpty_005f3 = _jspx_th_logic_005fnotEmpty_005f3.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('.');
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(289,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setName("rec");
    // /cataloging/addtitlesearch.jsp(289,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setProperty("edition");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f4 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(289,92) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f4.setName("rec");
    // /cataloging/addtitlesearch.jsp(289,92) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEmpty_005f4.setProperty("edition");
    int _jspx_eval_logic_005fnotEmpty_005f4 = _jspx_th_logic_005fnotEmpty_005f4.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/addtitlesearch.jsp(290,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setName("rec");
    // /cataloging/addtitlesearch.jsp(290,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setProperty("extent");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
    // /cataloging/addtitlesearch.jsp(344,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f10.setName("rec");
    // /cataloging/addtitlesearch.jsp(344,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f10.setProperty("additionalInfo");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
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
    // /cataloging/addtitlesearch.jsp(359,32) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    // /cataloging/addtitlesearch.jsp(359,32) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fpageListOutput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:pageListOutput
    com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
    _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f3);
    // /cataloging/addtitlesearch.jsp(393,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fpageListOutput_005f1.setFormName("cataloging_servlet_AddTitleSearchForm");
    // /cataloging/addtitlesearch.jsp(393,24) name = topOfPageLinks type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fpageListOutput_005f1.setTopOfPageLinks(false);
    int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
    if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
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
    // /cataloging/addtitlesearch.jsp(427,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("searchMaterials");
    // /cataloging/addtitlesearch.jsp(427,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("stringCode");
    // /cataloging/addtitlesearch.jsp(427,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/addtitlesearch.jsp(435,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("searchOptions");
    // /cataloging/addtitlesearch.jsp(435,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("stringCode");
    // /cataloging/addtitlesearch.jsp(435,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
    // /cataloging/addtitlesearch.jsp(447,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f0.setId("onSave");
    int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                ");
        if (_jspx_meth_base_005fgoButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                            ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /cataloging/addtitlesearch.jsp(448,32) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f0.setAlign("absbottom");
    // /cataloging/addtitlesearch.jsp(448,32) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f0.setOnclick("hideElementonSave()");
    int _jspx_eval_base_005fgoButton_005f0 = _jspx_th_base_005fgoButton_005f0.doStartTag();
    if (_jspx_th_base_005fgoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
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
    // /cataloging/addtitlesearch.jsp(464,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setCollection("assets");
    // /cataloging/addtitlesearch.jsp(464,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setProperty("longID");
    // /cataloging/addtitlesearch.jsp(464,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/addtitlesearch.jsp(485,52) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setCollection("searchOptions");
    // /cataloging/addtitlesearch.jsp(485,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setProperty("stringCode");
    // /cataloging/addtitlesearch.jsp(485,52) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f4 = _jspx_th_html_005foptions_005f4.doStartTag();
    if (_jspx_th_html_005foptions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    // /cataloging/addtitlesearch.jsp(490,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f1.setId("onSave");
    int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                                    ");
        if (_jspx_meth_base_005fgoButton_005f1(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
          return true;
        out.write("\r\n                                                ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    // /cataloging/addtitlesearch.jsp(491,52) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f1.setAlign("absbottom");
    // /cataloging/addtitlesearch.jsp(491,52) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f1.setOnclick("hideElementonSave()");
    int _jspx_eval_base_005fgoButton_005f1 = _jspx_th_base_005fgoButton_005f1.doStartTag();
    if (_jspx_th_base_005fgoButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f1);
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
    // /cataloging/addtitlesearch.jsp(503,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setCollection("searchMaterials");
    // /cataloging/addtitlesearch.jsp(503,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setProperty("stringCode");
    // /cataloging/addtitlesearch.jsp(503,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/addtitlesearch.jsp(509,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setCollection("searchOptions");
    // /cataloging/addtitlesearch.jsp(509,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setProperty("stringCode");
    // /cataloging/addtitlesearch.jsp(509,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f6 = _jspx_th_html_005foptions_005f6.doStartTag();
    if (_jspx_th_html_005foptions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /cataloging/addtitlesearch.jsp(515,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f2.setId("onSave");
    int _jspx_eval_base_005fshowHideTag_005f2 = _jspx_th_base_005fshowHideTag_005f2.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                            ");
        if (_jspx_meth_base_005fgoButton_005f2(_jspx_th_base_005fshowHideTag_005f2, _jspx_page_context))
          return true;
        out.write("\r\n                                        ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
    // /cataloging/addtitlesearch.jsp(516,44) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f2.setAlign("absbottom");
    // /cataloging/addtitlesearch.jsp(516,44) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f2.setOnclick("hideElementonSave()");
    int _jspx_eval_base_005fgoButton_005f2 = _jspx_th_base_005fgoButton_005f2.doStartTag();
    if (_jspx_th_base_005fgoButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fonclick_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    // /cataloging/addtitlesearch.jsp(577,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /cataloging/addtitlesearch.jsp(577,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    // /cataloging/addtitlesearch.jsp(577,20) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setVspace("6");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }
}
