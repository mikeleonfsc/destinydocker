package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.backoffice.servlet.DisplayableCalendarBig;
import com.follett.fsc.destiny.client.backoffice.servlet.CalendarForm;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.CalendarHelper;
import com.follett.fsc.common.MessageHelper;

public final class calendarmonth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
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
      out.write("\r\n\r\n\r\n");

    CalendarForm form = (CalendarForm)request.getAttribute(CalendarForm.FORM_NAME);

    DisplayableCalendarBig calendarBean = new DisplayableCalendarBig();

    calendarBean.setDefaultHours(form.getDisplayHours());
    calendarBean.setDefaultDaysClosed(form.getDisplayClosedDays());
    // Get the default year for the cases where the year is not supplied
    String year = form.getYear();

    // Get the default month for the cases where the month is not supplied
    String month = form.getMonth();

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    Long siteID = (Long)store.getProperty(LoginFacadeSpecs.SITE_ID);
    boolean districtMode = false;
    
    if( new Long(0).equals(siteID)) {
        districtMode = true;
    }

      out.write("\r\n\r\n");

    GregorianCalendar calendar = CalendarHelper.getCalendar();
    calendar.set(Integer.parseInt(year), Integer.parseInt(month), 1);
    

      out.write('\r');
      out.write('\n');
 if(districtMode) { 
      out.write("\r\n    \r\n<table id=\"");
      out.print(DisplayableCalendarBig.TABLE_DISTRICT_OUTER );
      out.write("\" width=\"100%\">\r\n        <tr>\r\n            <td align=\"center\">\r\n                ");
      //  base:outlinedTable
      com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
      _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005foutlinedTable_005f0.setParent(null);
      // /backoffice/calendarmonth.jsp(50,16) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
      // /backoffice/calendarmonth.jsp(50,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setId(DisplayableCalendarBig.TABLE_DISTRICT_INNER );
      // /backoffice/calendarmonth.jsp(50,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setWidth("90%");
      int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
      if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    <tr>\r\n                        <td class=\"TableHeading\">");
          out.print( MessageHelper.formatMessage("calendarmonth_DistrictCalendar") );
          out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\" width=\"50%\">\r\n                            ");
          out.print( calendarBean.create(calendar, siteID, application, request, response, districtMode) );
          out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
          int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
      out.write("\r\n            </td>\r\n        </tr>\r\n    </table>\r\n");
 } else {
      out.write("\r\n<br>\r\n    ");
      out.print( calendarBean.create(calendar, siteID, application, request, response, districtMode) );
      out.write("\r\n<br>\r\n");
 } 
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
