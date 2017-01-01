package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.common.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.cataloging.ejb.data.VopacLimiterSet;
import com.follett.fsc.destiny.client.cataloging.servlet.BookListForm;
import com.follett.fsc.destiny.client.filters.VersionFilter;
import com.follett.fsc.destiny.entity.AdvancedSearchQueryData;
import com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm;

public final class printerfriendlytitlelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
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

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();

      out.write("\r\n\r\n<html dir=\"");
      out.print(directionality);
      out.write("\" >\r\n\r\n");

	SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String formName = (String)request.getAttribute(GenericForm.PRINTER_FRIENDLY_CONTENT_FORM);
    BaseListForm form = (BaseListForm)request.getAttribute(formName);
    
    int digitalContentMode = AdvancedSearchQueryData.SEARCH_TITLE_RECORDS_AND_DIGITAL_RESOURCES_LOCAL;
    if (form instanceof BaseSearchResultsForm) {
        digitalContentMode = ((BaseSearchResultsForm) form).getDigitalContentMode();
    }

    int itemsInList = form.getTotalCount();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );

      out.write("\r\n\r\n<head>\r\n    <title>");
      out.print( form.getPageTitle() );
      out.write("</title>\r\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(VersionFilter.getDestinyCSSVersionedFile() );
      out.write("\" />\r\n</head>\r\n\r\n<body bgcolor=\"#FFFFFF\" class=\"");
      out.print(store.getStyleClass());
      out.write("\">\r\n<div id=\"viewTypeElem\" class='");
      out.print(form.isElementaryMode() ? "viewTypeElem": "" );
      out.write("'>\r\n\r\n<table id=\"searchSummary\" cellspacing=\"0\" cellpadding=\"2\" width=\"100%\">\r\n");
 if (form.isVopac() && form instanceof BookListForm) { 
      out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\">\r\n            ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /common/printerfriendlytitlelist.jsp(57,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fout_005f0.setValue(((BookListForm)form).getReportTitle());
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      out.write("\r\n        </td>\r\n    </tr>\r\n");
 } 
      out.write("\r\n<tr>\r\n    ");
 if (form.isElementaryMode()) { 
      out.write("\r\n    <td align=\"center\">\r\n        ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f0.setParent(null);
      // /common/printerfriendlytitlelist.jsp(64,8) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setSearchType(form.getSearchQuantityPrompt());
      // /common/printerfriendlytitlelist.jsp(64,8) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setStartOfSet("" + ( itemsToSkip + 1 ) );
      // /common/printerfriendlytitlelist.jsp(64,8) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setEndOfSet("" + ( itemsToPrint ));
      // /common/printerfriendlytitlelist.jsp(64,8) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setTotalInSet("" + ( itemsInList ));
      // /common/printerfriendlytitlelist.jsp(64,8) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setTooManyHits("false");
      // /common/printerfriendlytitlelist.jsp(64,8) name = rowClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setRowClass("ColRowBold");
      int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
      out.write("\r\n     ");
 } else { 
      out.write("\r\n    <td>\r\n        ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f1.setParent(null);
      // /common/printerfriendlytitlelist.jsp(72,8) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setSearchType(form.getSearchQuantityPrompt());
      // /common/printerfriendlytitlelist.jsp(72,8) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setStartOfSet("" + ( itemsToSkip + 1 ) );
      // /common/printerfriendlytitlelist.jsp(72,8) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setEndOfSet("" + ( itemsToPrint ));
      // /common/printerfriendlytitlelist.jsp(72,8) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setTotalInSet("" + ( itemsInList ));
      // /common/printerfriendlytitlelist.jsp(72,8) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setTooManyHits("false");
      int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
      out.write("\r\n     ");
 } 
      out.write("\r\n    </td>\r\n</tr>\r\n</table>\r\n\r\n<!-- Now output the actual printable data -->\r\n");
 if (form.getCollectionType() == CollectionType.ONESEARCH || form.getCollectionType() == CollectionType.WPE) { 
      out.write("\r\n    ");
 if (form.isVopac() && form.getStore().getVopacSearchType() == VopacLimiterSet.WPE) { 
      out.write("\r\n\t   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/vopacwperesourceslist.jsp", out, false);
      out.write("\r\n    ");
 } else { 
      out.write("\r\n\t   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/onlineresourceslist.jsp", out, false);
      out.write("\r\n    ");
 } 
      out.write('\r');
      out.write('\n');
 } else { 
      out.write("\r\n    ");
 if (form.isElementaryMode()) { 
      out.write("\r\n    \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/titlelist_elem.jsp" + (("/common/titlelist_elem.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(formName), request.getCharacterEncoding()), out, false);
      out.write("\r\n    ");
 } else { 
      out.write("\r\n    \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/titlelist.jsp" + (("/common/titlelist.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(formName), request.getCharacterEncoding()), out, false);
      out.write("\r\n    ");
 } 
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n</div>\r\n</body>\r\n</html>\r\n");
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
