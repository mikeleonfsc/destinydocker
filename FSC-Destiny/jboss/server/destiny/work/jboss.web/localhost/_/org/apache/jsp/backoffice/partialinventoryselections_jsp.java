package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.util.ObjectHelper;
import com.follett.fsc.common.MessageHelper;

public final class partialinventoryselections_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    PartialInventorySelectionsForm form = (PartialInventorySelectionsForm)request.getAttribute(PartialInventorySelectionsForm.FORM_NAME);
    String includeHeader = "Include";
    
    boolean assetSite = form.getCollectionType() == CollectionType.ASSET;

      out.write("\r\n\r\n\r\n<TABLE id=\"");
      out.print(PartialInventorySelectionsForm.TABLE_MAIN);
      out.write("\" cellSpacing=0 cellPadding=5 width=\"100%\" border=0>\r\n    <TR>\r\n      <TD class=\"TableHeading\">\r\n        \r\n\t\t");
      out.print( form.gimmeCollectionTypeMode() );
      out.write(' ');
      out.print(MessageHelper.formatMessage("partialinventoryselections_Inventory") );
      out.write(" - \r\n\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f0.setParent(null);
      // /backoffice/partialinventoryselections.jsp(33,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(33,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setProperty( PartialInventorySelectionsForm.FIELD_DESCRIPTION );
      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      out.write("\r\n         - ");
      out.print(MessageHelper.formatMessage("partialinventoryselections_Started") );
      out.write(" \r\n   \t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f1.setParent(null);
      // /backoffice/partialinventoryselections.jsp(35,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(35,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setProperty( PartialInventorySelectionsForm.FIELD_STARTED_DATE );
      int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
      if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      out.write("\r\n      </TD>\r\n    </TR>\r\n    \r\n    <TR>\r\n      <TD class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_StartedBy", form.getStartedByName()) );
      out.write("\r\n      </TD>\r\n    </TR>\r\n    \r\n    <TR>\r\n      <TD>\r\n    \t<table id=\"");
      out.print(PartialInventorySelectionsForm.TABLE_PARTIAL_LIMITERS);
      out.write("\" border=\"0\" cellpadding=\"5\" width=\"100%\" style=\"border-collapse: collapse\">\r\n             ");
if(form.isShowLimiterLine()) { 
      out.write("\r\n        \t\t\t<tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n        \t\t\t    <td class=\"ColRowBold\">\r\n           \t\t           ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f2.setParent(null);
      // /backoffice/partialinventoryselections.jsp(50,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f2.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(50,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f2.setProperty( PartialInventorySelectionsForm.FIELD_LIMITER_TYPE_NAME );
      int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
      if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      out.write("\r\n        \t\t\t\t</td>\r\n        \t\t\t    <td class=\"ColRow\">\r\n           \t\t           ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f3.setParent(null);
      // /backoffice/partialinventoryselections.jsp(53,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f3.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(53,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f3.setProperty( PartialInventorySelectionsForm.FIELD_LIMITERS );
      int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
      if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      out.write("\r\n        \t\t\t\t\r\n        \t\t\t\t\t<br />\r\n                            ");
 if( !store.isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()) {
      out.write("\r\n                                <I>\r\n            \t\t\t\t\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /backoffice/partialinventoryselections.jsp(58,17) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(58,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty( PartialInventorySelectionsForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS );
      // /backoffice/partialinventoryselections.jsp(58,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.print(MessageHelper.formatMessage("partialinventoryselections_Including") );
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
      out.write("\r\n            \t\t\t\t\t");
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f0.setParent(null);
      // /backoffice/partialinventoryselections.jsp(59,17) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(59,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setProperty( PartialInventorySelectionsForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS );
      // /backoffice/partialinventoryselections.jsp(59,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setValue("true");
      int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.print(MessageHelper.formatMessage("partialinventoryselections_Excluding") );
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
      out.write("\r\n            \t\t\t\t\t");
      out.print(MessageHelper.formatMessage("partialinventoryselections_CheckedOutItems") );
      out.write("\r\n                                </I>\r\n                            ");
} 
      out.write("\r\n        \t\t\t\t</td>\r\n        \t\t\t</tr>\r\n            ");
} 
      out.write("\r\n\t\t\t\r\n            ");
 if (form.getCollectionType() == CollectionType.ASSET) { 
      out.write("\r\n            ");
 boolean switchColor = true; 
      out.write("\r\n    \t\t\t<tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n    \t\t\t    <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_AssetTypes") );
      out.write("</td>\r\n    \t\t\t\t<td class=\"ColRow\">\r\n       \t\t\t\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f4.setParent(null);
      // /backoffice/partialinventoryselections.jsp(72,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f4.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(72,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f4.setProperty( PartialInventorySelectionsForm.FIELD_ASSET_LIMITERS );
      int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
      if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      out.write("\r\n       \t\t\t\t</td>\t\r\n    \t\t\t</tr>\r\n                ");
 if (form.isTextbookResourceTypeOnlySelected()) {
      out.write("\r\n                <tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                    <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_AdoptionYear") );
      out.write("</td >\r\n                    <td class=\"ColRow\">");
      out.print( form.getAdoptionYearDescription() );
      out.write("</td>\r\n                </tr>     \r\n                ");
 } 
      out.write("           \r\n    \t\t\t\r\n    \t\t\t");
 if (form.isCopyWithBarcodes()) { 
      out.write("\r\n        \t\t\t<tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n        \t\t\t    <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_PurchasePrice") );
      out.write("</td>\r\n        \t\t\t\t<td class=\"ColRow\">\r\n        \t\t\t   \t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f5.setParent(null);
      // /backoffice/partialinventoryselections.jsp(86,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f5.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(86,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f5.setProperty( PartialInventorySelectionsForm.FIELD_PRICE_LIMIT_BY_AND_PRICE );
      int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
      if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      out.write("\r\n        \t\t\t\t</td>\r\n        \t\t\t</tr>\r\n                ");
 } 
      out.write("\r\n                \r\n                ");
 if (form.isCopyWithBarcodes()) { 
      out.write("\r\n                    <tr bgColor=\"");
      out.print( form.getNextColor(switchColor) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_Include") );
      out.write("</td >\r\n                        <td class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_ItemsWithBarcodes") );
      out.write("</td>\r\n                    </tr>\r\n                    ");
 includeHeader = "";
                        switchColor = false;
                    } 
      out.write("    \r\n                ");
 if  (form.isCopyWithoutBarcodes()) { 
      out.write("\r\n                    <tr bgColor=\"");
      out.print( form.getNextColor(switchColor) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">");
      out.print( includeHeader );
      out.write("</td >\r\n                        <td class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_ItemsWithoutBarcodes") );
      out.write("</td>\r\n                    </tr>\r\n                    ");
 includeHeader = "";
                         switchColor = false;
                } 
      out.write("    \r\n                ");
 if  (form.isConsumables()) { 
      out.write("\r\n                    <tr bgColor=\"");
      out.print( form.getNextColor(switchColor) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">");
      out.print( includeHeader );
      out.write("</td >\r\n                        <td class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_Consumables") );
      out.write("</td>\r\n                    </tr>\r\n                    ");
 includeHeader = "";
                    } 
      out.write("\r\n            ");
 } 
      out.write("\r\n            ");
if(form.getCollectionType() == CollectionType.TEXTBOOK && store.isStateRepositoryRunning()){
      out.write("\r\n                <tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_LimitedInventoryTo") );
      out.write("</td>\r\n                        <td class=\"ColRow\">\r\n                            ");
      out.print(form.getStateLimiterStr());
      out.write("\r\n                        </td>\r\n                </tr>\r\n           ");
}
      out.write("\r\n            \r\n             ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
                            boolean switchColor = true; 
              
      out.write("\r\n            \r\n                    <tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_AdoptionYear") );
      out.write("</td >\r\n                        <td class=\"ColRow\">");
      out.print( form.getAdoptionYearDescription() );
      out.write("</td>\r\n                    </tr>\r\n                        ");
 if  (form.isCopyWithBarcodes()) { 
                        
      out.write("\r\n                            <tr bgColor=\"");
      out.print( form.getNextColor(switchColor) );
      out.write("\">\r\n                                <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_Include") );
      out.write("</td >\r\n                                <td class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_CopiesWithBarcodes") );
      out.write("</td>\r\n                            </tr>\r\n                            ");
 includeHeader = "";
                                switchColor = false;
                            } 
      out.write("    \r\n                        ");
 if  (form.isCopyWithoutBarcodes()) { 
      out.write("\r\n                            <tr bgColor=\"");
      out.print( form.getNextColor(switchColor) );
      out.write("\">\r\n                                <td class=\"ColRowBold\">");
      out.print( includeHeader );
      out.write("</td >\r\n                                <td class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_CopiesWithoutBarcodes") );
      out.write("</td>\r\n                            </tr>\r\n                            ");
 includeHeader = "";
                                 switchColor = false;
                        } 
      out.write("    \r\n                        ");
 if  (form.isConsumables()) { 
      out.write("\r\n                            <tr bgColor=\"");
      out.print( form.getNextColor(switchColor) );
      out.write("\">\r\n                                <td class=\"ColRowBold\">");
      out.print( includeHeader );
      out.write("</td >\r\n                                <td class=\"ColRow\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_Consumables") );
      out.write("</td>\r\n                            </tr>\r\n                            ");
 includeHeader = "";
                            } 
      out.write("\r\n            ");
} 
      out.write("             \r\n            ");
if( form.isShowLimiterLine() && form.isCopyWithBarcodes()) {
      out.write("\r\n    \t\t\t<tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n    \t\t\t    <td class=\"ColRowBold\">\r\n                        ");
 if (assetSite) { 
      out.write("\r\n                        ");
      out.print(MessageHelper.formatMessage("partialinventoryselections_ActionForMisplacedItems") );
      out.write("\r\n                        ");
 } else { 
      out.write("\r\n                        ");
      out.print(MessageHelper.formatMessage("partialinventoryselections_ActionForMisplacedCopies") );
      out.write("\r\n                        ");
 } 
      out.write(" \r\n\t\t\t\t\t</td>\r\n    \t\t\t\t<td class=\"ColRow\">\r\n    \t\t\t   \t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f6.setParent(null);
      // /backoffice/partialinventoryselections.jsp(167,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f6.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(167,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f6.setProperty( PartialInventorySelectionsForm.FIELD_MISPLACED_ITEMS );
      int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
      if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      out.write("\r\n    \t\t\t\t</td>\r\n    \t\t\t</tr>\r\n            ");
} 
      out.write("\t\r\n            \t\t\r\n            ");
if( (form.getCollectionType() == CollectionType.LIBRARY) || (form.getCollectionType() == CollectionType.MEDIA) ) {
                
            
      out.write("\r\n                <tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                    <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_CallNumbers") );
      out.write("</td>\r\n                    <td class=\"ColRow\">\r\n                        ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f7.setParent(null);
      // /backoffice/partialinventoryselections.jsp(178,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f7.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(178,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f7.setProperty( PartialInventorySelectionsForm.FIELD_CALLNUMBERS );
      int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
      if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      out.write("\r\n                    </td>\r\n                </tr>\r\n                \r\n                <tr bgColor=\"");
      out.print( form.getNextColor(false) );
      out.write("\">\r\n                    <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_CirculationTypes") );
      out.write("</td>\r\n                    <td class=\"ColRow\">\r\n                        ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f8.setParent(null);
      // /backoffice/partialinventoryselections.jsp(185,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f8.setName( PartialInventorySelectionsForm.FORM_NAME );
      // /backoffice/partialinventoryselections.jsp(185,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f8.setProperty( PartialInventorySelectionsForm.FIELD_CIRC_TYPE_LIMITERS );
      int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
      if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
} 
      out.write("  \r\n\r\n            ");
if  ( !ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) || 
                    ( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) && form.isCopyWithBarcodes())){
      out.write("\r\n    \t\t\t<tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                    <td class=\"ColRowBold\">&nbsp;</td>\r\n    \t\t\t\t<td class=\"ColRow\">\r\n                        ");
 if (assetSite) { 
      out.write("\r\n                            ");
      out.print(MessageHelper.formatMessage("partialinventoryselections_ItemsSeenOnOrAfter0DoNotNeedToBeAccountedFor", form.getDateAccountedFor()) );
      out.write("\r\n                        ");
 } else { 
      out.write("\r\n                            ");
      out.print(MessageHelper.formatMessage("partialinventoryselections_CopiesSeenOnOrAfter0DoNotNeedToBeAccountedFor", form.getDateAccountedFor()) );
      out.write("\r\n                        ");
 } 
      out.write(" \r\n                    </td>\r\n    \t\t\t</tr>\r\n            ");
} 
      out.write("\r\n            \r\n            ");
if  (form.isShowActionForScannedCopies() && !store.isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()){
      out.write("\r\n                <tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">\r\n                            ");
 if (assetSite) { 
      out.write("\r\n                                ");
      out.print( MessageHelper.formatMessage("partialinventoryselections_ActionForScannedCheckedOutItems") );
      out.write("\r\n                            ");
 } else { 
      out.write("\r\n                                ");
      out.print( MessageHelper.formatMessage("partialinventoryselections_ActionForScannedCheckedOutCopies") );
      out.write("\r\n                            ");
 } 
      out.write("\r\n                        </td>\r\n                        <td class=\"ColRow\">\r\n                            ");
 if (form.isCheckInOnScan()) { 
      out.write("\r\n                                ");
 if (assetSite) { 
      out.write("\r\n                                    ");
      out.print( MessageHelper.formatMessage("partialinventoryselections_CheckInScannedItemsThatAreCheckedOut") );
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n                                    ");
      out.print( MessageHelper.formatMessage("partialinventoryselections_CheckInScannedCopiesThatAreCheckedOut") );
      out.write("\r\n                                ");
 } 
      out.write("\r\n                            ");
 } else { 
      out.write("\r\n                                ");
 if (assetSite) { 
      out.write("\r\n                                    ");
      out.print( MessageHelper.formatMessage("partialinventoryselections_DoNotCheckInScannedItemsThatAreCheckedOut") );
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n                                    ");
      out.print( MessageHelper.formatMessage("partialinventoryselections_DoNotCheckInScannedCopiesThatAreCheckedOut") );
      out.write("\r\n                                ");
 } 
      out.write("\r\n                            ");
 } 
      out.write("\r\n                        </td>\r\n                </tr>\r\n           ");
}
      out.write("   \r\n                                      \r\n            ");
if  (form.getScheduledEndDate() != null){
      out.write("\r\n                <tr bgColor=\"");
      out.print( form.getNextColor(true) );
      out.write("\">\r\n                        <td class=\"ColRowBold\">");
      out.print(MessageHelper.formatMessage("partialinventoryselections_InventoryEnds") );
      out.write("</td>\r\n                        <td class=\"ColRow\">\r\n                            ");
      out.print(form.getScheduledEndDate() );
      out.write("\r\n                        </td>\r\n                </tr>\r\n           ");
}
      out.write("                              \r\n\r\n\r\n\t\t</table>\r\n      </TD></TR>\r\n    </TABLE>\r\n");
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
}
