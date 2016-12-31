package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.BaseException;
import org.apache.log4j.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import java.util.TreeMap;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.session.common.ejb.*;
import org.apache.struts.action.Action;
import java.lang.Throwable;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class homeindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();

    String siteName = "";
    String debuginfo = "";
    String logoFileName = "";
    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
        /* /base/initial.jsp */
    }

    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    if (store != null) {
        siteName =  (String)store.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
        if (siteName == null) {
            siteName = "";
        }
        logoFileName = store.getLogoFileName();
    } else {
        siteName = "Session store was returned as null ";
    }

      out.write("\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");
      //  template:insert
      org.apache.struts.tiles.taglib.InsertTag _jspx_th_template_005finsert_005f0 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.get(org.apache.struts.tiles.taglib.InsertTag.class);
      _jspx_th_template_005finsert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_template_005finsert_005f0.setParent(null);
      // /common/homeindex.jsp(45,0) name = template type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_template_005finsert_005f0.setTemplate("/common/shelltemplate.jsp");
      int _jspx_eval_template_005finsert_005f0 = _jspx_th_template_005finsert_005f0.doStartTag();
      if (_jspx_eval_template_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /common/homeindex.jsp(47,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f1.setName("pagetitle");
          // /common/homeindex.jsp(47,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f1.setContent( pageTitle );
          // /common/homeindex.jsp(47,2) name = direct type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f1.setDirect("true");
          int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
          if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
          out.write("\r\n  ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /common/homeindex.jsp(48,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setName("logoFileName");
          // /common/homeindex.jsp(48,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setContent( logoFileName );
          // /common/homeindex.jsp(48,2) name = direct type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f2.setDirect("true");
          int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
          if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
          out.write("\r\n  ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f3 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f3.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /common/homeindex.jsp(49,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f3.setName("sitename");
          // /common/homeindex.jsp(49,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f3.setContent( siteName );
          // /common/homeindex.jsp(49,2) name = direct type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f3.setDirect("true");
          int _jspx_eval_template_005fput_005f3 = _jspx_th_template_005fput_005f3.doStartTag();
          if (_jspx_th_template_005fput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
          out.write("\r\n  ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f4 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f4.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /common/homeindex.jsp(50,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f4.setName("debuginfo");
          // /common/homeindex.jsp(50,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f4.setContent( debuginfo );
          // /common/homeindex.jsp(50,2) name = direct type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f4.setDirect("true");
          int _jspx_eval_template_005fput_005f4 = _jspx_th_template_005fput_005f4.doStartTag();
          if (_jspx_th_template_005fput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f4);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f4);
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f5(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f6(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f7(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f8(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f9(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f10(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          //  template:put
          org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f11 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
          _jspx_th_template_005fput_005f11.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          // /common/homeindex.jsp(57,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f11.setName("pagecontent");
          // /common/homeindex.jsp(57,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_template_005fput_005f11.setContent( contentname );
          int _jspx_eval_template_005fput_005f11 = _jspx_th_template_005fput_005f11.doStartTag();
          if (_jspx_th_template_005fput_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f11);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f11);
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f12(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n  ");
          if (_jspx_meth_template_005fput_005f13(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
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
    // /common/homeindex.jsp(46,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f0.setName("scripts");
    // /common/homeindex.jsp(46,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f0.setContent("/common/scripts.jsp");
    int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
    if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f5 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(51,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f5.setName("persistentmenu");
    // /common/homeindex.jsp(51,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f5.setContent("/common/persistentmenu.jsp");
    int _jspx_eval_template_005fput_005f5 = _jspx_th_template_005fput_005f5.doStartTag();
    if (_jspx_th_template_005fput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f5);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f6 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f6.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(52,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f6.setName("topline");
    // /common/homeindex.jsp(52,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f6.setContent("/common/topline.jsp");
    int _jspx_eval_template_005fput_005f6 = _jspx_th_template_005fput_005f6.doStartTag();
    if (_jspx_th_template_005fput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f6);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f7 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(53,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f7.setName("toplevelmenu");
    // /common/homeindex.jsp(53,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f7.setContent("/common/toplevelmenu.jsp");
    int _jspx_eval_template_005fput_005f7 = _jspx_th_template_005fput_005f7.doStartTag();
    if (_jspx_th_template_005fput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f7);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f8 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(54,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f8.setName("processingNeeded");
    // /common/homeindex.jsp(54,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f8.setContent("/common/processingNeeded.jsp");
    int _jspx_eval_template_005fput_005f8 = _jspx_th_template_005fput_005f8.doStartTag();
    if (_jspx_th_template_005fput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f8);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f9 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(55,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f9.setName("follettNews");
    // /common/homeindex.jsp(55,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f9.setContent("/common/folletNews.jsp");
    int _jspx_eval_template_005fput_005f9 = _jspx_th_template_005fput_005f9.doStartTag();
    if (_jspx_th_template_005fput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f9);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f10 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f10.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(56,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f10.setName("level2menu");
    // /common/homeindex.jsp(56,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f10.setContent("/common/level2menu.jsp");
    int _jspx_eval_template_005fput_005f10 = _jspx_th_template_005fput_005f10.doStartTag();
    if (_jspx_th_template_005fput_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f10);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f12 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f12.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(58,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f12.setName("footer");
    // /common/homeindex.jsp(58,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f12.setContent("/common/footer.jsp");
    int _jspx_eval_template_005fput_005f12 = _jspx_th_template_005fput_005f12.doStartTag();
    if (_jspx_th_template_005fput_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f12);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_template_005fput_005f13 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_template_005fput_005f13.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /common/homeindex.jsp(59,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f13.setName("pagelevelhelp");
    // /common/homeindex.jsp(59,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fput_005f13.setContent("/common/pagelevelhelp.jsp");
    int _jspx_eval_template_005fput_005f13 = _jspx_th_template_005fput_005f13.doStartTag();
    if (_jspx_th_template_005fput_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f13);
    return false;
  }
}
