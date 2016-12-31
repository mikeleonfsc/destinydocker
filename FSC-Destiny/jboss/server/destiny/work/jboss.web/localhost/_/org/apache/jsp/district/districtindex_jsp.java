package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.BaseException;
import org.apache.log4j.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import java.util.TreeMap;
import org.apache.struts.action.Action;
import java.lang.Throwable;
import org.apache.struts.Globals;

public final class districtindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.release();
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
      			"/common/reportsystemcondition.jsp", true, 524288, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
    }

      out.write("\r\n\r\n");

    try {

      out.write("\r\n    \r\n");
      //  template:insert
      org.apache.struts.tiles.taglib.InsertTag _jspx_th_template_005finsert_005f0 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.get(org.apache.struts.tiles.taglib.InsertTag.class);
      _jspx_th_template_005finsert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_template_005finsert_005f0.setParent(null);
      // /district/districtindex.jsp(22,0) name = template type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_template_005finsert_005f0.setTemplate("/district/districttemplate.jsp");
      int _jspx_eval_template_005finsert_005f0 = _jspx_th_template_005finsert_005f0.doStartTag();
      if (_jspx_eval_template_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n      ");
          if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n      ");
          if (_jspx_meth_template_005fput_005f1(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n      ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /district/districtindex.jsp(25,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setName("pagecontent");
          // /district/districtindex.jsp(25,6) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setContent( contentname );
          int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
          if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
          out.write("\r\n      ");
          if (_jspx_meth_template_005fput_005f3(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n      ");
          if (_jspx_meth_template_005fput_005f4(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          int evalDoAfterBody = _jspx_th_template_005finsert_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_template_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
      out.write('\r');
      out.write('\n');

    } catch (Exception ex ) {
        Logger logCat = Logger.getLogger( this.getClass() );

        ex.printStackTrace();
        logCat.error( "Exception in index.jsp displaying content " + contentname, ex );
        Throwable throwable = (Throwable)pageContext.getAttribute(Globals.EXCEPTION_KEY, PageContext.REQUEST_SCOPE);
        if (throwable != null) {
            System.out.println("\n\n\n*****************************\nThrowable found\n***********************\n\n\n");
            throwable.printStackTrace();
        } else {
            System.out.println("\n\n\n*****************************\nNo throwable object found!\n***********************\n\n\n");
        }
        throw new BaseException( "Exception in index.jsp displaying content " + contentname, ex );
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

  private boolean _jspx_meth_template_005fput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f0 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /district/districtindex.jsp(23,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f0.setName("scripts");
    // /district/districtindex.jsp(23,6) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f0.setContent("/common/scripts.jsp");
    int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
    if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /district/districtindex.jsp(24,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f1.setName("breadcrumb");
    // /district/districtindex.jsp(24,6) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f1.setContent("/common/breadcrumbs.jsp");
    int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
    if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f3 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /district/districtindex.jsp(26,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f3.setName("footer");
    // /district/districtindex.jsp(26,6) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f3.setContent("/common/footer.jsp");
    int _jspx_eval_template_005fput_005f3 = _jspx_th_template_005fput_005f3.doStartTag();
    if (_jspx_th_template_005fput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f4 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /district/districtindex.jsp(27,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f4.setName("pagelevelhelp");
    // /district/districtindex.jsp(27,6) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f4.setContent("/common/pagelevelhelp.jsp");
    int _jspx_eval_template_005fput_005f4 = _jspx_th_template_005fput_005f4.doStartTag();
    if (_jspx_th_template_005fput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f4);
    return false;
  }
}
