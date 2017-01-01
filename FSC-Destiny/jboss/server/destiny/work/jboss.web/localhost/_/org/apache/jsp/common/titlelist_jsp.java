package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs;
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
import com.follett.fsc.destiny.util.BarcodeHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.session.cataloging.data.CopyClientValue;
import com.follett.fsc.destiny.util.HTMLFilterHelper;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.entity.AdvancedSearchQueryData;
import com.follett.fsc.common.StringHelper;

public final class titlelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frenderTitleDetailsButtonLink_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftemporaryIcon_005ftemporary_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frenderTitleDetailsButtonLink_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftemporaryIcon_005ftemporary_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frenderTitleDetailsButtonLink_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftemporaryIcon_005ftemporary_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

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

    BaseListForm form = (BaseListForm)request.getAttribute(formName);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    Long storeSiteID = store.getSiteID();
    
    boolean districtUserLoggedInToDistrict = false;
    
    if (store.isDistrictUser() && ((storeSiteID == null) || (storeSiteID.longValue() == 0))) {
        districtUserLoggedInToDistrict = true;
    }
    
    boolean digitalResourceMode = false;
    if (form instanceof BaseSearchResultsForm) {
        digitalResourceMode = ((BaseSearchResultsForm) form).getDigitalContentMode() == AdvancedSearchQueryData.SEARCH_DIGITAL_RESOURCES_ALL;
    }

      out.write("\r\n\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /common/titlelist.jsp(75,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(formName);
      // /common/titlelist.jsp(75,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
      // /common/titlelist.jsp(75,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<table width=\"100%\" id=\"keywordTable\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n");
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
      out.write('\r');
      out.write('\n');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /common/titlelist.jsp(78,0) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("count");
      // /common/titlelist.jsp(78,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("rec");
      // /common/titlelist.jsp(78,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName(formName);
      // /common/titlelist.jsp(78,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("list");
      // /common/titlelist.jsp(78,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(79,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(formName);
          // /common/titlelist.jsp(79,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
          // /common/titlelist.jsp(79,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("false");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");

            if(renderLineAboveEachRow) {
        
              out.write("\r\n        <tr>\r\n            <td colspan=\"3\">\r\n                ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n        ");

            }
        
              out.write("\r\n    ");
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
          out.write("\r\n    <tr>\r\n    \r\n    <td class=\"ColRow\" valign=\"top\">\r\n        ");
          //  base:titleImage
          com.follett.fsc.destiny.client.common.jsptag.TitleImageTag _jspx_th_base_005ftitleImage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleImageTag) _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleImageTag.class);
          _jspx_th_base_005ftitleImage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftitleImage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(95,8) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleImage_005f0.setRec(rec);
          // /common/titlelist.jsp(95,8) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleImage_005f0.setPrinterFriendly(form.isPrinterFriendly());
          int _jspx_eval_base_005ftitleImage_005f0 = _jspx_th_base_005ftitleImage_005f0.doStartTag();
          if (_jspx_th_base_005ftitleImage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
          out.write("\r\n    </td>\r\n\r\n    <td id=\"");
          out.print(BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO_CELL+count );
          out.write("\" valign=\"top\" width=\"100%\"> <!-- Info Column  -->\r\n        ");

                    if ( rec.getRelevancePercentage() != null ) {
                
          out.write("\r\n            <!--REL=");
          out.print(rec.getRelevancePercentage().toString());
          out.write("-->\r\n        ");

            }
        
          out.write("\r\n                <table id=\"");
          out.print(BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + count);
          out.write("\" c border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"100%\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold\" colspan=\"2\">\r\n                            <a name='");
          out.print( "anchor_" + (! StringHelper.isEmptyOrWhitespace(rec.getDcpiRecordGUID()) ? rec.getDcpiRecordGUID() : rec.getRecID()) );
          out.write("'></a>\r\n                            <a name=\"");
          out.print(BaseTitleDetailForm.ANCHOR_TO_GO_TO_ON_RESTORE + (! StringHelper.isEmptyOrWhitespace(rec.getDcpiRecordGUID()) ? rec.getDcpiRecordGUID() : rec.getRecID()));
          out.write("\"></a>\r\n                            ");
          //  base:titleDetailHover
          com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag _jspx_th_base_005ftitleDetailHover_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag) _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frenderTitleDetailsButtonLink_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag.class);
          _jspx_th_base_005ftitleDetailHover_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftitleDetailHover_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(111,28) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setRec(rec);
          // /common/titlelist.jsp(111,28) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setFormName(formName);
          // /common/titlelist.jsp(111,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setPrinterFriendly(form.isPrinterFriendly());
          // /common/titlelist.jsp(111,28) name = quantity type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setQuantity(quantity);
          // /common/titlelist.jsp(111,28) name = elementaryMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setElementaryMode(form.isElementaryMode());
          // /common/titlelist.jsp(111,28) name = digitalResourceMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setDigitalResourceMode( digitalResourceMode );
          // /common/titlelist.jsp(111,28) name = renderTitleDetailsButtonLink type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftitleDetailHover_005f0.setRenderTitleDetailsButtonLink(false);
          int _jspx_eval_base_005ftitleDetailHover_005f0 = _jspx_th_base_005ftitleDetailHover_005f0.doStartTag();
          if (_jspx_th_base_005ftitleDetailHover_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frenderTitleDetailsButtonLink_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.reuse(_jspx_th_base_005ftitleDetailHover_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frenderTitleDetailsButtonLink_005frec_005fquantity_005fprinterFriendly_005fformName_005felementaryMode_005fdigitalResourceMode_005fnobody.reuse(_jspx_th_base_005ftitleDetailHover_005f0);
          out.write("\r\n                            <!--");
          out.print(BaseSearchResultsForm.COMMENT_TITLE_LINE);
          out.write("-->\r\n                            &nbsp;&nbsp;");
          //  base:temporaryIcon
          com.follett.fsc.destiny.client.common.jsptag.TemporaryIconTag _jspx_th_base_005ftemporaryIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TemporaryIconTag) _005fjspx_005ftagPool_005fbase_005ftemporaryIcon_005ftemporary_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TemporaryIconTag.class);
          _jspx_th_base_005ftemporaryIcon_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftemporaryIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(121,40) name = temporary type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftemporaryIcon_005f0.setTemporary(rec.isTemporary());
          // /common/titlelist.jsp(121,40) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftemporaryIcon_005f0.setPrinterFriendly(form.isPrinterFriendly());
          int _jspx_eval_base_005ftemporaryIcon_005f0 = _jspx_th_base_005ftemporaryIcon_005f0.doStartTag();
          if (_jspx_th_base_005ftemporaryIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftemporaryIcon_005ftemporary_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftemporaryIcon_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftemporaryIcon_005ftemporary_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftemporaryIcon_005f0);
          out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(124,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setName("rec");
          // /common/titlelist.jsp(124,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setProperty("collectionType");
          // /common/titlelist.jsp(124,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setValue(""+BibMasterSpecs.COLLECTION_TYPE_ASSET);
          int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
          if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\" valign=\"top\" nowrap colspan=\"2\">\r\n                                ");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
                return;
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
          out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\" valign=\"top\" nowrap>\r\n                            ");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
          if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                                ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /common/titlelist.jsp(134,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fwhen_005f0.setTest( (rec.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET || AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID())));
              int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
              if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                    &nbsp;&nbsp;\r\n                                    ");
                  //  base:bibTypeIcon
                  com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                  _jspx_th_base_005fbibTypeIcon_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbibTypeIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                  // /common/titlelist.jsp(136,36) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setRec(rec);
                  // /common/titlelist.jsp(136,36) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setPrinterFriendly(form.isPrinterFriendly());
                  int _jspx_eval_base_005fbibTypeIcon_005f0 = _jspx_th_base_005fbibTypeIcon_005f0.doStartTag();
                  if (_jspx_th_base_005fbibTypeIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                  out.write("\r\n                                    &nbsp;\r\n                                ");
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
              out.write("\r\n                                ");
              if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
                return;
              out.write("\r\n                            ");
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
          out.write("\r\n                        </td>\r\n                        <td class=\"ColRow\" valign=\"top\" width=\"100%\">\r\n                            ");

                                if (!store.isMediaBookingUser() && form!=null && form.isRenderMediaLocationInfo()) { 
                                                    if ( rec.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) {
                                                        out.print("<B>");
                                                        if ( store.getMediaSiteCount() > 1) {
                                                            out.print(ResponseUtils.filter(store.getMediaSiteTypeDescription()));
                                                        } else {
                                                            out.print(ResponseUtils.filter(store.getMediaSiteBrowseName()));
                                                        }
                                                        out.print("&nbsp;&nbsp;");                                                
                                                        out.println("</B>");
                                                    }
                                                }
                            
          out.write(" \r\n                            ");
          //  base:callNumber
          com.follett.fsc.destiny.client.common.jsptag.CallNumberTag _jspx_th_base_005fcallNumber_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CallNumberTag) _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CallNumberTag.class);
          _jspx_th_base_005fcallNumber_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcallNumber_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(159,28) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setRec(rec);
          // /common/titlelist.jsp(159,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setPrinterFriendly(form.isPrinterFriendly());
          // /common/titlelist.jsp(159,28) name = hideCallNumber type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcallNumber_005f0.setHideCallNumber(form.isHideCallNumber());
          int _jspx_eval_base_005fcallNumber_005f0 = _jspx_th_base_005fcallNumber_005f0.doStartTag();
          if (_jspx_th_base_005fcallNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005fnobody.reuse(_jspx_th_base_005fcallNumber_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcallNumber_005frec_005fprinterFriendly_005fhideCallNumber_005fnobody.reuse(_jspx_th_base_005fcallNumber_005f0);
          out.write("\r\n                            ");
if(digitalResourceMode){  
          out.write("\r\n                                ");
          out.print(SearchResultsOutputListRenderer.getFilteredString(rec.getPublisher(), false));
          out.write("\r\n                            ");
 } else { 
          out.write("\r\n                                ");
          out.print(SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false));
          out.write("\r\n                            ");
 } 
          out.write("\r\n                            ");
 if(form.isTextbook() || rec.isTextbookAsset()) { 
          out.write("\r\n                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
          out.print(SearchResultsOutputListRenderer.getFilteredString(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()), true));
          out.write("\r\n                                ");

                                    if (rec.getReplacementPrice() != null) {
                                
          out.write("\r\n                                    &nbsp;&nbsp;");
          out.print(lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT));
          out.write("\r\n                                ");

                                    }
                                
          out.write("\r\n                            ");
 } 
          out.write("\r\n                        </td>\r\n    \r\n                    </tr>\r\n                    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(178,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setName(formName);
          // /common/titlelist.jsp(178,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setProperty("textbook");
          // /common/titlelist.jsp(178,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setValue("false");
          int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
          if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        ");
if(!StringHelper.isEmpty(rec.displaySubLocation())){ 
              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\">&nbsp;</td>\r\n                            <td class=\"ColRow\">");
              out.print(rec.displaySubLocation());
              out.write("</td>\r\n                        </tr>\r\n                        ");
} 
              out.write("                                \r\n                    ");
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
          out.write("\r\n                                        \r\n                    ");
 if (!StringHelper.isEmpty(rec.getSeriesDisplayable())) { 
          out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\">&nbsp;</td>\r\n                        <td class=\"ColRow\">");
          out.print( MessageHelper.formatMessage("titlelist_Series") );
          out.write(' ');
          out.print( rec.getSeriesDisplayable() );
          out.write("</td>\r\n                    </tr>\r\n                    ");
 } 
          out.write("\r\n                    \r\n                    ");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
          if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
              // /common/titlelist.jsp(195,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fwhen_005f1.setTest( (rec.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK || AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID())));
              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">\r\n                                <ul>\r\n                                    <ul>\r\n                                    ");

                                        boolean newLineNeeded = false;
                                    
                  out.write("\r\n                                        ");

                                            if ( !StringHelper.isEmpty(rec.getPublisher()) ) {
                                        
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getPublisher()));
                  out.write("&nbsp;\r\n                                            ");

                                                newLineNeeded = true;
                                            
                  out.write("    \r\n                                        ");

                                                }
                                            
                  out.write(" \r\n                                        ");

                                             if ( !StringHelper.isEmpty(rec.getPubYear()) ) {
                                         
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getPubYear()));
                  out.write("&nbsp;\r\n                                            ");

                                                newLineNeeded = true;
                                            
                  out.write("\r\n                                        ");

                                            }
                                        
                  out.write(" \r\n                                        ");

                                             if ( !StringHelper.isEmpty(rec.getEdition()) ) {
                                         
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getEdition()));
                  out.write("\r\n                                            ");

                                                newLineNeeded = true;
                                            
                  out.write("\r\n                                        ");

                                            }
                                        
                  out.write(" \r\n                                        \r\n                                        ");

                                                                             if ( ! StringHelper.isEmpty(rec.getStateTextID()) ||
                                                                                                         ! StringHelper.isEmpty(rec.getGradeLevel())) {
                                                                         
                  out.write("\r\n                                        ");

                                            if (newLineNeeded) {
                                        
                  out.write("\r\n                                            <br>\r\n                                        ");

                                            }
                                        
                  out.write("\r\n                                        ");

                                            newLineNeeded = false;
                                        
                  out.write("\r\n                                            ");

                                                if (! StringHelper.isEmpty(rec.getStateTextID())) {
                                            
                  out.print( MessageHelper.formatMessage("titlelist_StateTextbookID") );
                  out.write(':');
                  out.print(ResponseUtils.filter(rec.getStateTextID()));
                  out.write("&nbsp;\r\n                                                ");

                                                    newLineNeeded = true;
                                                
                  out.write("\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                                            ");

                                                if (! StringHelper.isEmpty(rec.getGradeLevel())) {
                                            
                  out.print( MessageHelper.formatMessage("titlelist_Grades") );
                  out.write(':');
                  out.print(ResponseUtils.filter(rec.getGradeLevel()));
                  out.write("\r\n                                                ");

                                                    newLineNeeded = true;
                                                
                  out.write("\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                          \r\n                                        ");

                                                              }
                                                          
                  out.write("\r\n                                        \r\n                                        ");

                                                                            if (! StringHelper.isEmpty(rec.getAdditionalInfo())) {
                                                                        
                  out.write("\r\n                                            ");

                                                if (newLineNeeded) {
                                            
                  out.write("\r\n                                                <br>\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getAdditionalInfo()));
                  out.write("\r\n                                        ");

                                            }
                                        
                  out.write("\r\n                                    \r\n                                    </ul>\r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                    ");
                  int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
              out.write("\r\n                    \r\n                    ");
              //  c:otherwise
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
              _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
              int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
              if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
if(!StringHelper.isEmpty(rec.displayPubInfo())){ 
                  out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\">&nbsp;</td>\r\n                            <td class=\"ColRow\">");
                  out.print(rec.displayPubInfo());
                  out.write("</td>\r\n                        </tr>\r\n                        ");
} 
                  out.write("                                \r\n                    ");
                  int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
              out.write("\r\n                    ");
              int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
          out.write("                            \r\n                    \r\n                   \r\n                    ");
          //  base:readingAndInterestGradeLevelInfo
          com.follett.fsc.destiny.client.common.jsptag.ReadingAndInterestGradeLevelInfoTag _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReadingAndInterestGradeLevelInfoTag) _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReadingAndInterestGradeLevelInfoTag.class);
          _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(303,20) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.setRec(rec);
          int _jspx_eval_base_005freadingAndInterestGradeLevelInfo_005f0 = _jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.doStartTag();
          if (_jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.reuse(_jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005freadingAndInterestGradeLevelInfo_005frec_005fnobody.reuse(_jspx_th_base_005freadingAndInterestGradeLevelInfo_005f0);
          out.write("\r\n                    ");
          //  base:readingProgramInfo
          com.follett.fsc.destiny.client.common.jsptag.ReadingProgramInfoTag _jspx_th_base_005freadingProgramInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReadingProgramInfoTag) _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReadingProgramInfoTag.class);
          _jspx_th_base_005freadingProgramInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005freadingProgramInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(304,20) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005freadingProgramInfo_005f0.setRec(rec);
          int _jspx_eval_base_005freadingProgramInfo_005f0 = _jspx_th_base_005freadingProgramInfo_005f0.doStartTag();
          if (_jspx_th_base_005freadingProgramInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005frec_005fnobody.reuse(_jspx_th_base_005freadingProgramInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005freadingProgramInfo_005frec_005fnobody.reuse(_jspx_th_base_005freadingProgramInfo_005f0);
          out.write("\r\n                    ");
          //  base:lexileInfo
          com.follett.fsc.destiny.client.common.jsptag.LexileInfoTag _jspx_th_base_005flexileInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LexileInfoTag) _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LexileInfoTag.class);
          _jspx_th_base_005flexileInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flexileInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(305,20) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flexileInfo_005f0.setRec(rec);
          int _jspx_eval_base_005flexileInfo_005f0 = _jspx_th_base_005flexileInfo_005f0.doStartTag();
          if (_jspx_th_base_005flexileInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.reuse(_jspx_th_base_005flexileInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flexileInfo_005frec_005fnobody.reuse(_jspx_th_base_005flexileInfo_005f0);
          out.write("\r\n                    ");
          //  base:fountasPinnellInfo
          com.follett.fsc.destiny.client.common.jsptag.FountasPinnellInfoTag _jspx_th_base_005ffountasPinnellInfo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FountasPinnellInfoTag) _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.FountasPinnellInfoTag.class);
          _jspx_th_base_005ffountasPinnellInfo_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ffountasPinnellInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(306,20) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ffountasPinnellInfo_005f0.setRec(rec);
          int _jspx_eval_base_005ffountasPinnellInfo_005f0 = _jspx_th_base_005ffountasPinnellInfo_005f0.doStartTag();
          if (_jspx_th_base_005ffountasPinnellInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.reuse(_jspx_th_base_005ffountasPinnellInfo_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ffountasPinnellInfo_005frec_005fnobody.reuse(_jspx_th_base_005ffountasPinnellInfo_005f0);
          out.write("\r\n                    \r\n                    ");
 if ((!form.isPrinterFriendly()) && (!rec.isShelfBib())) { 
          out.write("\r\n                        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(309,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(rec.getReviewAverage() != null);
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                            <tr>\r\n                                <td class=\"ColRow\">\r\n                                    &nbsp;\r\n                                </td>\r\n                                <td class=\"ColRow\">\r\n                                    ");
              //  base:reviewStars
              com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag _jspx_th_base_005freviewStars_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag) _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag.class);
              _jspx_th_base_005freviewStars_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005freviewStars_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /common/titlelist.jsp(315,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freviewStars_005f0.setValue(rec.getReviewAverage().doubleValue());
              int _jspx_eval_base_005freviewStars_005f0 = _jspx_th_base_005freviewStars_005f0.doStartTag();
              if (_jspx_th_base_005freviewStars_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.reuse(_jspx_th_base_005freviewStars_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.reuse(_jspx_th_base_005freviewStars_005f0);
              out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\">&nbsp;</td>\r\n                            </tr>\r\n                        ");
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
          out.write("\r\n                    ");
 } 
          out.write("\r\n                    \r\n                    ");
 if (rec.isDigitalMediaRecord()) { 
          out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\">&nbsp;</td>\r\n                            <td class=\"ColRow\" colspan=\"3\">");
          out.print( SearchResultsOutputListRenderer.getFilteredString(rec.getSummary(), false) );
          out.write("</td>\r\n                        </tr>\r\n                    ");
 } 
          out.write("\r\n                    \r\n                    ");

                                    if (form instanceof CategorySearchResultsForm) { 
                                            CategorySearchResultsForm f = (CategorySearchResultsForm)form;
                                            boolean isShowMore = (f.getShowMoreBibID() != null &&
                                                f.getShowMoreBibID().equals(rec.getRecID()));
                                            String copiesInCategoryKey = MessageHelper.formatMessage("titlelist_CopiesInThisCategory", new Long(rec.getCopyCount().longValue())); 
                                            if (form.getCollectionType() == CollectionType.ASSET) {
                                                copiesInCategoryKey = MessageHelper.formatMessage("titlelist_ItemsInThisCategory", new Long(rec.getCopyCount().longValue())); 
                                            }
                                
          out.write("\r\n                            <tr>\r\n                                <td colspan=\"3\"><span class=\"ColRowBold\">");
          out.print(copiesInCategoryKey);
          out.write("</span>\r\n                                <span class=\"SmallColRow\">\r\n                                ");

                                    String baseURL = "/cataloging/servlet/handlecategorysearchresultsform.do" +
                                                        "?categoryID=" + f.getCategoryID() +
                                                        "&categoryDescription=" + f.getCategoryDescription() +
                                                        "&collectionType=" + f.getCollectionType() +
                                                        "&sort=" + f.getSort() +
                                                        "&descend=" + f.isDescend() +
                                                        "&dateDescend=" + f.isDateDescend() +
                                                        "&page=" + f.getPage() +
                                                        "&totalCount=" + f.getTotalCount();
                                                    String url = baseURL;
                                                    
                                                    if (!isShowMore) {
                                                        url += "&showMoreBibID=" + rec.getRecID() + "#anchor_" + rec.getRecID();
                                                    }
                                                    
                                                    if (!form.isPrinterFriendly()) {
                                
          out.write("\r\n                                    <a href=\"");
          out.print(url);
          out.write("\" class=\"DetailLink\">\r\n                                        ");

                                            if (isShowMore) {
                                        
          out.print( MessageHelper.formatMessage("titlelist_ShowLess") );
          out.write("&nbsp;");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(363,104) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc("/icons/general/showless.gif");
          // /common/titlelist.jsp(363,104) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("titlelist_ShowLess") );
          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
          out.write("\r\n                                        ");

                                            } else {
                                        
          out.print( MessageHelper.formatMessage("titlelist_ShowMore") );
          out.write("&nbsp;");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(366,104) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setSrc("/icons/general/showmore.gif");
          // /common/titlelist.jsp(366,104) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("titlelist_ShowMore") );
          int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
          if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
          out.write("\r\n                                        ");

                                            }
                                        
          out.write("\r\n                                    </a>\r\n                                    ");

                                        }
                                    
          out.write("\r\n                                </span>\r\n                                </td>\r\n                            </tr>\r\n                            ");

                                if (rec.getCopyList() != null) { 
                                            String removeAllURL = baseURL +
                                                    "&showMoreBibID=" + rec.getRecID() +
                                                    "&bibIDToRemove=" + rec.getRecID() +
                                                    "&collectionType=" + f.getCollectionType();
                            
          out.write("\r\n                                <tr>\r\n                                    <td colspan=\"3\">\r\n                                    <table width=\"100%\" id=\"");
          out.print(CategorySearchResultsForm.TABLE_COPY_LIST);
          out.write("\" cellspacing=\"0\">\r\n                                    <tr>\r\n                                        ");

                                            if (form.getCollectionType() != CollectionType.ASSET &&
                                                                        form.getCollectionType() != CollectionType.TEXTBOOK) {
                                        
          out.write("\r\n                                        <td class=\"SmallColHeading\">");
          out.print(MessageHelper.formatMessage("titlelist_CallNumber"));
          out.write("</td>\r\n                                        ");

                                            }
                                        
          out.write("\r\n                                        <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("titlelist_Barcode") );
          out.write("</td>\r\n                                        <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("titlelist_Status") );
          out.write("</td>\r\n                                        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(398,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f1.setTest(store.isDistrictUser() );
          int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
          if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                                            <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("titlelist_Site") );
              out.write("</td>\r\n                                        ");
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
          out.write("\r\n                                        ");

                                            if (form.getCollectionType() == CollectionType.ASSET) {
                                        
          out.write("\r\n                                        <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("titlelist_HomeLocation") );
          out.write("</td>\r\n                                        ");

                                            }
                                        
          out.write("\r\n                                        ");

                                            if (form.getCollectionType() == CollectionType.TEXTBOOK) {
                                        
          out.write("\r\n                                        <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("titlelist_Location") );
          out.write("</td>\r\n                                        ");

                                            }
                                        
          out.write("\r\n                                        ");

                                            if (!form.isPrinterFriendly()) {
                                        
          out.write("\r\n                                        <td class=\"tdAlignRight\">");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(418,65) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setCollectionType(form.getCollectionType());
          // /common/titlelist.jsp(418,65) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPage(removeAllURL);
          // /common/titlelist.jsp(418,65) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPermissions(new Permission[]{Permission.CAT_CREATE_ASSIGN_CATEGORIES, Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET, Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK});
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
              // /common/titlelist.jsp(418,322) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/removeall.gif");
              // /common/titlelist.jsp(418,322) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setAlt( MessageHelper.formatMessage("removeAll") );
              int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
              if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.reuse(_jspx_th_base_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.reuse(_jspx_th_base_005flink_005f0);
          out.write("</td>\r\n                                        ");

                                            }
                                        
          out.write("\r\n                                    </tr>\r\n                                ");

                                    for (int index = 0; index < rec.getCopyList().size(); index ++) { 
                                                    CopyClientValue c = (CopyClientValue)rec.getCopyList().get(index);
                                                    
                                                    String removeURL = baseURL + 
                                                        "&showMoreBibID=" + rec.getRecID() +
                                                        "&copyIDToRemove=" + c.getCopyID() +
                                                        "&collectionType=" + f.getCollectionType();
                                
          out.write("\r\n                                    <tr ");
          out.print((( ( 1 & index)==0)? "bgColor=\"#E8E8E8\"" : "" ));
          out.write(">\r\n                                        ");

                                            if (form.getCollectionType() != CollectionType.ASSET &&
                                                                    form.getCollectionType() != CollectionType.TEXTBOOK) {
                                        
          out.write("\r\n                                        <td class=\"ColRow\">");
          out.print(HTMLFilterHelper.filter(c.getCallNumber()));
          out.write("</td>\r\n                                        ");

                                            }
                                        
          out.write("\r\n                                        <td class=\"ColRow\">");
          out.print(c.getCopyBarcode() != null ? BarcodeHelper.getTruncatedBarcode(c.getCopyBarcode()) : "");
          out.write("</td>\r\n                                        <td class=\"ColRow\">");
          out.print(CopySpecs.getCopyStatusAsString(c.getStatus()));
          out.write("</td>\r\n                                        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(443,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f2.setTest(store.isDistrictUser() );
          int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
          if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                                            <td class=\"ColRow\">");
              //  c:out
              org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
              _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /common/titlelist.jsp(444,63) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fout_005f0.setValue(c.getSiteName() );
              int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
              if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
              out.write("</td>\r\n                                        ");
              int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
          out.write("\r\n                                        ");
 if (form.getCollectionType() == CollectionType.ASSET || form.getCollectionType() == CollectionType.TEXTBOOK) { 
          out.write("\r\n                                        <td class=\"ColRow\">");
          out.print( StringHelper.isEmpty(c.getLocationDescription()) ? "" : c.getLocationDescription() );
          out.write("</td>\r\n                                        ");
 } 
          out.write("\r\n                                        ");
 if (!form.isPrinterFriendly()) { 
          out.write("\r\n                                        <td class=\"tdAlignRight\">\r\n                                        ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(451,40) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setCollectionType(form.getCollectionType());
          // /common/titlelist.jsp(451,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setPage( removeURL );
          // /common/titlelist.jsp(451,40) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setPermissions( new Permission[]{Permission.CAT_CREATE_ASSIGN_CATEGORIES, Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET, Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK} );
          int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
          if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f1.doInitBody();
            }
            do {
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
              // /common/titlelist.jsp(451,298) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setSrc("/buttons/small/remove_70.gif");
              // /common/titlelist.jsp(451,298) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setAlt( MessageHelper.formatMessage("remove") );
              int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
              if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
              int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.reuse(_jspx_th_base_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fcollectionType.reuse(_jspx_th_base_005flink_005f1);
          out.write("</td>\r\n                                        ");
 } 
          out.write("\r\n                                    </tr>\r\n                                ");
 } 
          out.write("\r\n                                    </table>\r\n                                    </td>\r\n                                </tr>\r\n                        ");
 } 
          out.write("\r\n                    ");
 } 
          out.write("\r\n            </table>\r\n        </td>\r\n        <td id=\"");
          out.print(BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS_CELL+count );
          out.write("\" class=\"tdAlignRight\" valign=\"top\">\r\n            <table id=\"");
          out.print(BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS  + count);
          out.write("\">\r\n               ");
 for(String row : form.buildControlStatusTableRows(rec,pageContext)) { 
          out.write("\r\n                    <tr>\r\n                    ");
          out.print( row );
          out.write("\r\n                    </tr>\r\n               ");
 } 
          out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/titlelist.jsp(472,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setName( formName );
          // /common/titlelist.jsp(472,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
          // /common/titlelist.jsp(472,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setValue("false");
          int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
          if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
 if(!renderLineAboveEachRow) { 
              out.write("\r\n        <tr>\r\n            <td colspan=\"3\">\r\n                ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f4, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 } 
              out.write("\r\n    ");
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
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f5.setParent(null);
      // /common/titlelist.jsp(482,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setName( formName );
      // /common/titlelist.jsp(482,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setProperty("printerFriendly");
      // /common/titlelist.jsp(482,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setValue("true");
      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n</table>\r\n");
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

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /common/titlelist.jsp(85,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /common/titlelist.jsp(85,16) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setVspace("1");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /common/titlelist.jsp(127,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("rec");
    // /common/titlelist.jsp(127,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("assetTypeDescription");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
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
        out.write("\r\n                                    &nbsp;\r\n                                ");
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

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
    // /common/titlelist.jsp(476,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    // /common/titlelist.jsp(476,16) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
