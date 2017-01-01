package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.session.circulation.data.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.client.circulation.jsptag.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.StringHelper;

public final class circinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fabbreviatedView_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircCheckedOut_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircItemsOut_005fformName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fabbreviatedView_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircCheckedOut_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircItemsOut_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fabbreviatedView_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircCheckedOut_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircItemsOut_005fformName_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");

    // form can be null if this module was not included by the checkout form
    CheckoutForm form = (CheckoutForm)request.getAttribute(CheckoutForm.FORM_NAME);
    String formName = CheckoutForm.FORM_NAME;
    if ( form == null ) {
        form = (RenewForm)request.getAttribute(RenewForm.FORM_NAME);
        if ( form != null ) {
            formName = RenewForm.FORM_NAME;
        }
    }

    boolean showPrintReceipt = (form != null ); 
    boolean isTeacherMode = ( form != null ) ? form.isToTeacherMode() : false;
    boolean isClassMode = ( form != null ) ? form.isToClassMode() : false;
    boolean teacherMode = (isTeacherMode || isClassMode);

    PatronInfoBean pib = (PatronInfoBean)request.getAttribute("patronInfoBean");
    PatronInfoBean tib = (PatronInfoBean)request.getAttribute(CheckoutForm.PARAM_TEXTBOOK_TEACHER);
    if ( teacherMode ) {

      out.write("\r\n        \r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /circulation/circinfo.jsp(58,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("textbookClassesID");
      // /circulation/circinfo.jsp(58,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(formName);
      // /circulation/circinfo.jsp(58,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("textbookClasses");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object textbookClassesID = null;
      textbookClassesID = (java.lang.Object) _jspx_page_context.findAttribute("textbookClassesID");
      out.write('\r');
      out.write('\n');

    }

      out.write("\r\n\r\n");

    if (pib != null || tib != null) {
        if (!"true".equals(request.getParameter("hideBorderTable"))){

      out.write("\r\n            <table cellSpacing=\"1\" cellPadding=\"0\" width=\"95%\" bgColor=\"#c0c0c0\" border=\"0\">\r\n                <tr>\r\n                    <td valign=\"top\" width=\"100%\" bgColor=\"#ffffff\">\r\n");

        } else {
            if (request.getParameter("textbookMode") != null) {

      out.write("\r\n            <table width=\"100%\">\r\n                <tr><td>\r\n                    <img src=\"/images/icons/general/line.gif\" height=\"2\" width=\"100%\">\r\n                </td></tr>\r\n            </table>\r\n");

            }
        }

        if (!teacherMode) {
        	int collectionType = BibMasterSpecs.COLLECTION_TYPE_LIBRARY;
        	if ( form != null ) {
        		collectionType = form.getCollectionType();
        	}
            String siteName = request.getParameter("offSiteFineName");
            if (siteName == null) {
                siteName = "";
            }

      out.write("\r\n            ");
      //  base:circPatronInfo
      com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag _jspx_th_base_005fcircPatronInfo_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fabbreviatedView_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag.class);
      _jspx_th_base_005fcircPatronInfo_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fcircPatronInfo_005f0.setParent(null);
      // /circulation/circinfo.jsp(93,12) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setFormName(formName);
      // /circulation/circinfo.jsp(93,12) name = infoBean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setInfoBean(pib);
      // /circulation/circinfo.jsp(93,12) name = showPrintReceipt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setShowPrintReceipt(showPrintReceipt);
      // /circulation/circinfo.jsp(93,12) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setCollectionType(collectionType);
      // /circulation/circinfo.jsp(93,12) name = abbreviatedView type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setAbbreviatedView("true".equals(request.getParameter(BaseCircPatronInfoTag.PARAM_USE_ABBREVIATED_VIEW)));
      // /circulation/circinfo.jsp(93,12) name = addEditFineView type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setAddEditFineView("true".equals(request.getParameter(BaseCircPatronInfoTag.PARAM_ADD_OR_EDIT_FINE_VIEW)));
      // /circulation/circinfo.jsp(93,12) name = offSiteFineSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f0.setOffSiteFineSiteName( siteName );
      int _jspx_eval_base_005fcircPatronInfo_005f0 = _jspx_th_base_005fcircPatronInfo_005f0.doStartTag();
      if (_jspx_th_base_005fcircPatronInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fabbreviatedView_005fnobody.reuse(_jspx_th_base_005fcircPatronInfo_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fabbreviatedView_005fnobody.reuse(_jspx_th_base_005fcircPatronInfo_005f0);
      out.write('\r');
      out.write('\n');
                
        } else {
            if (isClassMode) {
                if ( tib == null || tib.getPatronID() == null ) {

      out.write("\r\n                    <table width=\"100%\" id=\"");
      out.print(CircTeacherInfoTag.TABLE_TEACHER_BOX);
      out.write("\">\r\n                        <tr><td class=\"TableHeading\">");
      out.print( MessageHelper.formatMessage("circinfo_Teacher") );
      out.write("</td></tr>\r\n                    </table>\r\n");

                } else {

      out.write("\r\n                    ");
      //  base:circTeacherInfo
      com.follett.fsc.destiny.client.circulation.jsptag.CircTeacherInfoTag _jspx_th_base_005fcircTeacherInfo_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircTeacherInfoTag) _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircTeacherInfoTag.class);
      _jspx_th_base_005fcircTeacherInfo_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fcircTeacherInfo_005f0.setParent(null);
      // /circulation/circinfo.jsp(110,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircTeacherInfo_005f0.setFormName(formName);
      // /circulation/circinfo.jsp(110,20) name = infoBean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircTeacherInfo_005f0.setInfoBean(tib);
      int _jspx_eval_base_005fcircTeacherInfo_005f0 = _jspx_th_base_005fcircTeacherInfo_005f0.doStartTag();
      if (_jspx_th_base_005fcircTeacherInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTeacherInfo_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTeacherInfo_005f0);
      out.write('\r');
      out.write('\n');

                }
            } else {

      out.write("\r\n                ");
      //  base:circTeacherInfo
      com.follett.fsc.destiny.client.circulation.jsptag.CircTeacherInfoTag _jspx_th_base_005fcircTeacherInfo_005f1 = (com.follett.fsc.destiny.client.circulation.jsptag.CircTeacherInfoTag) _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircTeacherInfoTag.class);
      _jspx_th_base_005fcircTeacherInfo_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fcircTeacherInfo_005f1.setParent(null);
      // /circulation/circinfo.jsp(115,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircTeacherInfo_005f1.setFormName(formName);
      // /circulation/circinfo.jsp(115,16) name = infoBean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircTeacherInfo_005f1.setInfoBean(pib);
      int _jspx_eval_base_005fcircTeacherInfo_005f1 = _jspx_th_base_005fcircTeacherInfo_005f1.doStartTag();
      if (_jspx_th_base_005fcircTeacherInfo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTeacherInfo_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fcircTeacherInfo_005finfoBean_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTeacherInfo_005f1);
      out.write('\r');
      out.write('\n');

           }


            if (isClassMode) {

      out.write("\r\n            <table width=\"100%\">\r\n                    <tr><td>\r\n                        <img src=\"/images/icons/general/line.gif\" height=\"2\" width=\"100%\">\r\n                    </td></tr>\r\n                </table>\r\n");

                if ( pib == null || pib.getPatronID() == null ) {

      out.write("\r\n                    <table width=\"100%\" id=\"");
      out.print(CircPatronInfoTag.TABLE_PATRON_BOX_HEADER);
      out.write("\">\r\n                        <tr><td class=\"TableHeading\">");
      out.print( MessageHelper.formatMessage("circinfo_Student") );
      out.write("</td></tr>\r\n                    </table>\r\n");

                }
                else {
                      String siteName = request.getParameter("offSiteFineName");
                      if (siteName == null) {
                          siteName = "";
                      }

      out.write("\r\n                      ");
      //  base:circPatronInfo
      com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag _jspx_th_base_005fcircPatronInfo_005f1 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag.class);
      _jspx_th_base_005fcircPatronInfo_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fcircPatronInfo_005f1.setParent(null);
      // /circulation/circinfo.jsp(141,22) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f1.setFormName(formName);
      // /circulation/circinfo.jsp(141,22) name = infoBean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f1.setInfoBean(pib);
      // /circulation/circinfo.jsp(141,22) name = showPrintReceipt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f1.setShowPrintReceipt(showPrintReceipt);
      // /circulation/circinfo.jsp(141,22) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f1.setCollectionType(BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
      // /circulation/circinfo.jsp(141,22) name = addEditFineView type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f1.setAddEditFineView("true".equals(request.getParameter(BaseCircPatronInfoTag.PARAM_ADD_OR_EDIT_FINE_VIEW)));
      // /circulation/circinfo.jsp(141,22) name = offSiteFineSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircPatronInfo_005f1.setOffSiteFineSiteName( siteName );
      int _jspx_eval_base_005fcircPatronInfo_005f1 = _jspx_th_base_005fcircPatronInfo_005f1.doStartTag();
      if (_jspx_th_base_005fcircPatronInfo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fnobody.reuse(_jspx_th_base_005fcircPatronInfo_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005foffSiteFineSiteName_005finfoBean_005fformName_005fcollectionType_005faddEditFineView_005fnobody.reuse(_jspx_th_base_005fcircPatronInfo_005f1);
      out.write("\r\n\r\n");
                }
            }
        }
    

        //************** This is code that applies to all screens ***************
        if (request.getParameter("showItemsOut") != null) {

      out.write("\r\n                ");
      //  base:circCheckedOut
      com.follett.fsc.destiny.client.circulation.jsptag.CircCheckedOutTag _jspx_th_base_005fcircCheckedOut_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircCheckedOutTag) _005fjspx_005ftagPool_005fbase_005fcircCheckedOut_005fformName_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircCheckedOutTag.class);
      _jspx_th_base_005fcircCheckedOut_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fcircCheckedOut_005f0.setParent(null);
      // /circulation/circinfo.jsp(155,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircCheckedOut_005f0.setFormName(formName);
      int _jspx_eval_base_005fcircCheckedOut_005f0 = _jspx_th_base_005fcircCheckedOut_005f0.doStartTag();
      if (_jspx_th_base_005fcircCheckedOut_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fcircCheckedOut_005fformName_005fnobody.reuse(_jspx_th_base_005fcircCheckedOut_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fcircCheckedOut_005fformName_005fnobody.reuse(_jspx_th_base_005fcircCheckedOut_005f0);
      out.write("\r\n                ");
      //  base:circItemsOut
      com.follett.fsc.destiny.client.circulation.jsptag.CircItemsOutTag _jspx_th_base_005fcircItemsOut_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircItemsOutTag) _005fjspx_005ftagPool_005fbase_005fcircItemsOut_005fformName_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircItemsOutTag.class);
      _jspx_th_base_005fcircItemsOut_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fcircItemsOut_005f0.setParent(null);
      // /circulation/circinfo.jsp(156,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fcircItemsOut_005f0.setFormName(formName);
      int _jspx_eval_base_005fcircItemsOut_005f0 = _jspx_th_base_005fcircItemsOut_005f0.doStartTag();
      if (_jspx_th_base_005fcircItemsOut_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fcircItemsOut_005fformName_005fnobody.reuse(_jspx_th_base_005fcircItemsOut_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fcircItemsOut_005fformName_005fnobody.reuse(_jspx_th_base_005fcircItemsOut_005f0);
      out.write('\r');
      out.write('\n');

        } // end show items out table if param exists

        if (!"true".equals(request.getParameter("hideBorderTable"))) {

      out.write("\r\n        </td>\r\n    </tr>\r\n</table> <!-- end border table -->\r\n");

        }
    }   // end of null patron info bean or teacher info bean (i.e. current patron)

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
}
