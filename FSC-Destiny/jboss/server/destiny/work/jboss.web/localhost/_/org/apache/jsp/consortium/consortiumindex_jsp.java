package org.apache.jsp.consortium;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.BaseException;
import org.apache.log4j.*;
import org.apache.struts.action.Action;
import java.lang.Throwable;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.consortium.*;
import com.follett.fsc.destiny.session.common.ejb.LookupSpecs;
import org.apache.struts.Globals;

public final class consortiumindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
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

      out.write("<!--base href=\"http://127.0.0.1\"-->\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String ctxName = ContextManager.getContextManager().getDefaultDistrictContext().getContextName();
    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();
   

    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
    }

    try {
        if (store != null && store.isMiniDestiny()) { 
        
            ctxName = StringHelper.truncate(ctxName, LookupSpecs.MINID_SITE_NAME_MAX_DISPLAY, true);
        
      out.write("\r\n            \r\n");
      //  template:insert
      org.apache.struts.tiles.taglib.InsertTag _jspx_th_template_005finsert_005f0 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.get(org.apache.struts.tiles.taglib.InsertTag.class);
      _jspx_th_template_005finsert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_template_005finsert_005f0.setParent(null);
      // /consortium/consortiumindex.jsp(35,0) name = template type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_template_005finsert_005f0.setTemplate("/common/minidestinytemplate.jsp");
      int _jspx_eval_template_005finsert_005f0 = _jspx_th_template_005finsert_005f0.doStartTag();
      if (_jspx_eval_template_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f0 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /consortium/consortiumindex.jsp(36,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f0.setName("pagetitle");
          // /consortium/consortiumindex.jsp(36,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f0.setContent( pageTitle );
          // /consortium/consortiumindex.jsp(36,16) name = direct type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f0.setDirect("true");
          int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
          if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
          out.write("\r\n                ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /consortium/consortiumindex.jsp(37,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f1.setName("sitename");
          // /consortium/consortiumindex.jsp(37,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f1.setContent( ctxName );
          // /consortium/consortiumindex.jsp(37,16) name = direct type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f1.setDirect("true");
          int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
          if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
          out.write("\r\n                ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /consortium/consortiumindex.jsp(38,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setName("pagecontent");
          // /consortium/consortiumindex.jsp(38,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setContent( contentname );
          int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
          if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
          out.write("\r\n            ");
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
      out.write("\r\n        ");
 
        } else { 
        
      out.write("\r\n            ");
      //  template:insert
      org.apache.struts.tiles.taglib.InsertTag _jspx_th_template_005finsert_005f1 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.get(org.apache.struts.tiles.taglib.InsertTag.class);
      _jspx_th_template_005finsert_005f1.setPageContext(_jspx_page_context);
      _jspx_th_template_005finsert_005f1.setParent(null);
      // /consortium/consortiumindex.jsp(43,12) name = template type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_template_005finsert_005f1.setTemplate("/consortium/consortiumtemplate.jsp");
      int _jspx_eval_template_005finsert_005f1 = _jspx_th_template_005finsert_005f1.doStartTag();
      if (_jspx_eval_template_005finsert_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                ");
          if (_jspx_meth_template_005fput_005f3(_jspx_th_template_005finsert_005f1, _jspx_page_context))
            return;
          out.write("\r\n                ");
          if (_jspx_meth_template_005fput_005f4(_jspx_th_template_005finsert_005f1, _jspx_page_context))
            return;
          out.write("\r\n                ");
          if (_jspx_meth_template_005fput_005f5(_jspx_th_template_005finsert_005f1, _jspx_page_context))
            return;
          out.write("\r\n                ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f6 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f6.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
          // /consortium/consortiumindex.jsp(47,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f6.setName("pagecontent");
          // /consortium/consortiumindex.jsp(47,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f6.setContent( contentname );
          int _jspx_eval_template_005fput_005f6 = _jspx_th_template_005fput_005f6.doStartTag();
          if (_jspx_th_template_005fput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f6);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f6);
          out.write("    \r\n                ");
          if (_jspx_meth_template_005fput_005f7(_jspx_th_template_005finsert_005f1, _jspx_page_context))
            return;
          out.write("\r\n                ");
          if (_jspx_meth_template_005fput_005f8(_jspx_th_template_005finsert_005f1, _jspx_page_context))
            return;
          out.write("\r\n                ");
          if (_jspx_meth_template_005fput_005f9(_jspx_th_template_005finsert_005f1, _jspx_page_context))
            return;
          out.write("\r\n            ");
          int evalDoAfterBody = _jspx_th_template_005finsert_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_template_005finsert_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f1);
        return;
      }
      _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f1);
      out.write("   \r\n        ");

        }
    } catch (Exception ex ) {
        Logger logCat = Logger.getLogger( this.getClass() );
        ex.printStackTrace();
        logCat.error( "Exception in consortiumindex.jsp displaying content " + contentname, ex );

        Throwable throwable = (Throwable)pageContext.getAttribute(Globals.EXCEPTION_KEY, PageContext.REQUEST_SCOPE);
        if (throwable != null) {
            System.out.println("\n\n\n*****************************\nThrowable found\n***********************\n\n\n");
            throwable.printStackTrace();
        } else {
            System.out.println("\n\n\n*****************************\nNo throwable object found!\n***********************\n\n\n");
        }
        throw new BaseException( "Exception in consortiumindex.jsp displaying content " + contentname, ex );
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

  private boolean _jspx_meth_template_005fput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f3 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
    // /consortium/consortiumindex.jsp(44,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f3.setName("scripts");
    // /consortium/consortiumindex.jsp(44,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f3.setContent("/common/scripts.jsp");
    int _jspx_eval_template_005fput_005f3 = _jspx_th_template_005fput_005f3.doStartTag();
    if (_jspx_th_template_005fput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f4 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
    // /consortium/consortiumindex.jsp(45,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f4.setName("breadcrumb");
    // /consortium/consortiumindex.jsp(45,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f4.setContent("/common/breadcrumbs.jsp");
    int _jspx_eval_template_005fput_005f4 = _jspx_th_template_005fput_005f4.doStartTag();
    if (_jspx_th_template_005fput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f4);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f5 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
    // /consortium/consortiumindex.jsp(46,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f5.setName("outlinestarttable");
    // /consortium/consortiumindex.jsp(46,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f5.setContent("/consortium/outlinestarttable.jsp");
    int _jspx_eval_template_005fput_005f5 = _jspx_th_template_005fput_005f5.doStartTag();
    if (_jspx_th_template_005fput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f5);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f7 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
    // /consortium/consortiumindex.jsp(48,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f7.setName("outlineendtable");
    // /consortium/consortiumindex.jsp(48,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f7.setContent("/consortium/outlineendtable.jsp");
    int _jspx_eval_template_005fput_005f7 = _jspx_th_template_005fput_005f7.doStartTag();
    if (_jspx_th_template_005fput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f7);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f8 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
    // /consortium/consortiumindex.jsp(49,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f8.setName("footer");
    // /consortium/consortiumindex.jsp(49,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f8.setContent("/common/footer.jsp");
    int _jspx_eval_template_005fput_005f8 = _jspx_th_template_005fput_005f8.doStartTag();
    if (_jspx_th_template_005fput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f8);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f9 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f1);
    // /consortium/consortiumindex.jsp(50,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f9.setName("pagelevelhelp");
    // /consortium/consortiumindex.jsp(50,16) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f9.setContent("/common/pagelevelhelp.jsp");
    int _jspx_eval_template_005fput_005f9 = _jspx_th_template_005fput_005f9.doStartTag();
    if (_jspx_th_template_005fput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f9);
    return false;
  }
}
