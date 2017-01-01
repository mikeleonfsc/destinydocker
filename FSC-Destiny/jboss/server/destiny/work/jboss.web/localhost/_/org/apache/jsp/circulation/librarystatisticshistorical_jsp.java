package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsHistoricalForm;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.session.common.ejb.*;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.client.common.*;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.*;
import java.util.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class librarystatisticshistorical_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesNotPresent;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fmessagesNotPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fmessagesNotPresent.release();
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /circulation/librarystatisticshistorical.jsp(25,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /circulation/librarystatisticshistorical.jsp(25,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( LibraryStatisticsHistoricalForm.FORM_NAME );
      // /circulation/librarystatisticshistorical.jsp(25,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("LibraryStatisticsHistoricalForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      LibraryStatisticsHistoricalForm form = null;
      form = (LibraryStatisticsHistoricalForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');

	SessionStoreProxy store = form.getStore();
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n<style>\r\ntable#");
      out.print(LibraryStatisticsHistoricalForm.TABLE_DETAIL);
      out.write(", table#");
      out.print(LibraryStatisticsHistoricalForm.TABLE_DETAIL);
      out.write(" td, table#");
      out.print(LibraryStatisticsHistoricalForm.TABLE_DETAIL);
      out.write(" th\r\n{\r\n    border: 1px solid #C0C0C0;\r\n    border-collapse: collapse;\r\n}\r\n</style>\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /circulation/librarystatisticshistorical.jsp(39,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( LibraryStatisticsHistoricalForm.FORM_NAME );
      // /circulation/librarystatisticshistorical.jsp(39,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("formBusy");
      // /circulation/librarystatisticshistorical.jsp(39,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("false");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<table width=\"95%\" cellpadding=\"5\" id=\"");
          out.print(LibraryStatisticsHistoricalForm.TABLE_MAIN);
          out.write("\" >\r\n    <tr>\r\n");
          //  logic:messagesNotPresent
          org.apache.struts.taglib.logic.MessagesNotPresentTag _jspx_th_logic_005fmessagesNotPresent_005f0 = (org.apache.struts.taglib.logic.MessagesNotPresentTag) _005fjspx_005ftagPool_005flogic_005fmessagesNotPresent.get(org.apache.struts.taglib.logic.MessagesNotPresentTag.class);
          _jspx_th_logic_005fmessagesNotPresent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fmessagesNotPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          int _jspx_eval_logic_005fmessagesNotPresent_005f0 = _jspx_th_logic_005fmessagesNotPresent_005f0.doStartTag();
          if (_jspx_eval_logic_005fmessagesNotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <td class =\"TableHeading\">");
              out.print(form.getPageTitle());
              out.write("</td>\r\n    </tr>\r\n    <tr><td>\r\n        <table id=\"");
              out.print(LibraryStatisticsHistoricalForm.TABLE_DETAIL);
              out.write("\" cellpadding=\"2\" width=\"95%\" frame=\"void\" rules=\"rows, cols\" cellspacing=\"0\">\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("librarystatisticshistorical_TotalCirculations") );
              out.write("</td>\r\n                ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("librarystatisticshistorical_TotalHoldsPlaced") );
              out.write("</td>\r\n                ");
 } 
              out.write("\r\n            </tr>\r\n            ");
 
            List list = form.getListOfStats() ;
            Iterator itr = list.iterator();
            while ( itr.hasNext() ) {
                LibraryStatisticsHistoricalVO vo = (LibraryStatisticsHistoricalVO) itr.next();
                String tdClass = "ColRow tdAlignRight";
                if ( vo.isTotalRow() ) {
                    tdClass = "ColRowBold tdAlignRight";
                }
                
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">");
              out.print(vo.getDisplayableTimeframe());
              out.write("</td>\r\n                    ");
 if ( !vo.isHeadingRow() ) { 
              out.write("\r\n                        <td class=\"");
              out.print(tdClass);
              out.write('"');
              out.write('>');
              out.print(lh.formatNumber(vo.getCirculations()));
              out.write("</td>\r\n                        ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                            <td class=\"");
              out.print(tdClass);
              out.write('"');
              out.write('>');
              out.print(lh.formatNumber(vo.getHoldsPlaced()));
              out.write("</td>\r\n                        ");
 } 
              out.write("\r\n                    ");
 } else { 
              out.write("\r\n                        <td class=\"");
              out.print(tdClass);
              out.write("\">&nbsp;</td>\r\n                        ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                            <td class=\"");
              out.print(tdClass);
              out.write("\">&nbsp;</td>\r\n                        ");
 } 
              out.write("\r\n                    ");
 } 
              out.write("\r\n                </tr>\r\n            ");
 } // end of while ( itr.hasNext() ) 
              out.write("\r\n        </table>\r\n    </td></tr>\r\n    <tr><td class=\"ColRow\">\r\n         <P>\r\n         ");
              out.print(form.getReportTimeFooter());
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_logic_005fmessagesNotPresent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fmessagesNotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fmessagesNotPresent.reuse(_jspx_th_logic_005fmessagesNotPresent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fmessagesNotPresent.reuse(_jspx_th_logic_005fmessagesNotPresent_005f0);
          out.write('\r');
          out.write('\n');
          //  logic:messagesPresent
          org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_005fmessagesPresent_005f0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _005fjspx_005ftagPool_005flogic_005fmessagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
          _jspx_th_logic_005fmessagesPresent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fmessagesPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          int _jspx_eval_logic_005fmessagesPresent_005f0 = _jspx_th_logic_005fmessagesPresent_005f0.doStartTag();
          if (_jspx_eval_logic_005fmessagesPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <td align=\"center\" class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("librarystatisticshistorical_PleaseCloseThisWindowAndFixTheDatesBeforeRunning") );
              out.write("</td>\r\n    </tr>\r\n    <tr><td>\r\n        <p align=\"center\"><a href=\"javascript:window.close();\" class=\"DetailLink\">");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fmessagesPresent_005f0);
              // /circulation/librarystatisticshistorical.jsp(89,82) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/close.gif");
              // /circulation/librarystatisticshistorical.jsp(89,82) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("close") );
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
              out.write("</a></p>\r\n");
              int evalDoAfterBody = _jspx_th_logic_005fmessagesPresent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fmessagesPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fmessagesPresent.reuse(_jspx_th_logic_005fmessagesPresent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fmessagesPresent.reuse(_jspx_th_logic_005fmessagesPresent_005f0);
          out.write("\r\n    </td></tr>\r\n</table>\r\n");
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
    // /circulation/librarystatisticshistorical.jsp(24,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }
}
