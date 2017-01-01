package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.backoffice.ejb.*;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import org.apache.struts.util.ResponseUtils;
import java.util.*;
import com.follett.fsc.common.TimestampHelper;
import com.follett.fsc.destiny.session.backoffice.data.TextbookLedgerValue;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.CurrencyValue;

public final class ledgerinvoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
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

    LedgerInvoiceForm form = (LedgerInvoiceForm)request.getAttribute(LedgerInvoiceForm.FORM_NAME );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n\r\n<table id=\"");
      out.print(LedgerInvoiceForm.TABLE_MAIN);
      out.write("\" width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n<tr>\r\n    <td class=\"FormHeading\" valign=\"top\" align=\"center\">I N V O I C E</td>\r\n</tr>\r\n<tr>\r\n    <td class=\"ColRow\" align=\"center\">");
      out.print(form.gimmeStateInformation());
      out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td class=\"ColRow\" align=\"center\"><br/>");
      out.print(UserContext.getMyContextLocaleHelper().formatDateAndTime(TimestampHelper.getNow()) );
      out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td class=\"ColRowBold\">Textbook Manager</td>\r\n</tr>\r\n<tr>\r\n    <td>\r\n    <table id=\"");
      out.print(LedgerInvoiceForm.TABLE_SITE_INFO );
      out.write("\">\r\n    <tr>\r\n        <td class=\"ColRow\">");
      out.print(form.gimmeSiteInformation());
      out.write("</td>\r\n    </tr>\r\n    </table>\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td>&nbsp;</td>\r\n</tr>\r\n<tr>\r\n    <td>\r\n    <table width=\"90%\" id=\"");
      out.print(LedgerInvoiceForm.TABLE_ENTRIES );
      out.write("\">\r\n    ");

    if (form.getLedgerList().size() == 0){
        
      out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\">\r\n            There are no charges or credits to report.\r\n            </td>\r\n        </tr>\r\n         <tr>\r\n        <td colspan=\"3\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n    </tr>\r\n        ");
} else {
      out.write("\r\n    <tr>\r\n        <td class=\"SmallColHeading\">Description</td>\r\n        <td class=\"SmallColHeading tdAlignRight\">Amount&nbsp;&nbsp;&nbsp;</td>\r\n    </tr>\r\n    ");

            Iterator<TextbookLedgerValue> iter = form.getLedgerList().iterator();
            long totalAmount = 0;
            while (iter.hasNext()) {
                TextbookLedgerValue value = iter.next();
                totalAmount += value.getAmount();
        
      out.write("\r\n        <!-- \r\n        <tr>\r\n        \r\n            <td class=\"ColRow\">");
      out.print(value.getNote()==null? "": ResponseUtils.filter(value.getNote()) );
      out.write("</td>\r\n            <td class=\"ColRow\">");
      out.print( value.getFiscalYear() );
      out.write("</td>\r\n            \r\n            <td class=\"ColRow tdAlignRight\">");
      out.print( lh.formatCurrency(new CurrencyValue(new Long(value.getAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
if (value.getAmount() >= 0){
      out.write("&nbsp;");
}
      out.write("</td>\r\n        </tr>\r\n        ");

            }
        
      out.write("\r\n    <tr>\r\n        <td colspan=\"2\">");
      if (_jspx_meth_base_005fimageLine_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n    </tr>\r\n        \r\n         -->\r\n    <tr><td colspan=\"2\">&nbsp;</td></tr>     \r\n    <tr>\r\n        <td class=\"ColRow\">Lost and Damaged Textbooks</td>\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(new Long(totalAmount), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
if(totalAmount >= 0){
      out.write("&nbsp;");
}
      out.write("\r\n        </td>\r\n    </tr>\r\n    <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n    <tr>\r\n        <td class=\"ColRowBold\">Total Due:</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(new Long(totalAmount), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
if(totalAmount >= 0){
      out.write("&nbsp;");
}
      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
} 
      out.write("\r\n    </table>\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td>&nbsp;</td>\r\n</tr>\r\n<tr>\r\n    <td><span class=\"ColRowBold\">Note:</span> <span class=\"ColRow\">Please make sure the school name and BEDS code appear on the check or check apron.</span></td>\r\n</tr>\r\n</table>\r\n");
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

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent(null);
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
