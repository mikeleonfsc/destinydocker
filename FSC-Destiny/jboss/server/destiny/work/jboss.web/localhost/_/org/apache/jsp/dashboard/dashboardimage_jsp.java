package org.apache.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.data.*;
import com.follett.fsc.destiny.session.common.*;
import java.util.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.dashboard.servlet.DashboardForm;
import com.follett.fsc.destiny.util.dashboard.DashboardGizmoDefinition;
import com.follett.fsc.destiny.client.dashboard.servlet.DashboardImageForm;

public final class dashboardimage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdashboardRenderer_005fzoomFactor_005fsiteID_005fhideShowRefresh_005fgraphToRender_005ffromZoom_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdashboardRenderer_005fzoomFactor_005fsiteID_005fhideShowRefresh_005fgraphToRender_005ffromZoom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005fdashboardRenderer_005fzoomFactor_005fsiteID_005fhideShowRefresh_005fgraphToRender_005ffromZoom_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

   DashboardImageForm form = (DashboardImageForm) request.getAttribute(DashboardImageForm.FORM_NAME);

      out.write("\r\n\r\n\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /dashboard/dashboardimage.jsp(27,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/dashboard/servlet/handledashboardimageform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  base:dashboardRenderer
          com.follett.fsc.destiny.client.dashboard.jsptag.DashboardRendererTag _jspx_th_base_005fdashboardRenderer_005f0 = (com.follett.fsc.destiny.client.dashboard.jsptag.DashboardRendererTag) _005fjspx_005ftagPool_005fbase_005fdashboardRenderer_005fzoomFactor_005fsiteID_005fhideShowRefresh_005fgraphToRender_005ffromZoom_005fnobody.get(com.follett.fsc.destiny.client.dashboard.jsptag.DashboardRendererTag.class);
          _jspx_th_base_005fdashboardRenderer_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fdashboardRenderer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /dashboard/dashboardimage.jsp(28,4) name = graphToRender type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fdashboardRenderer_005f0.setGraphToRender(form.getGizmoID() );
          // /dashboard/dashboardimage.jsp(28,4) name = siteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fdashboardRenderer_005f0.setSiteID(form.getSiteID() );
          // /dashboard/dashboardimage.jsp(28,4) name = zoomFactor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fdashboardRenderer_005f0.setZoomFactor(form.getZoomFactor() );
          // /dashboard/dashboardimage.jsp(28,4) name = hideShowRefresh type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fdashboardRenderer_005f0.setHideShowRefresh(true);
          // /dashboard/dashboardimage.jsp(28,4) name = fromZoom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fdashboardRenderer_005f0.setFromZoom(true);
          int _jspx_eval_base_005fdashboardRenderer_005f0 = _jspx_th_base_005fdashboardRenderer_005f0.doStartTag();
          if (_jspx_th_base_005fdashboardRenderer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fdashboardRenderer_005fzoomFactor_005fsiteID_005fhideShowRefresh_005fgraphToRender_005ffromZoom_005fnobody.reuse(_jspx_th_base_005fdashboardRenderer_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fdashboardRenderer_005fzoomFactor_005fsiteID_005fhideShowRefresh_005fgraphToRender_005ffromZoom_005fnobody.reuse(_jspx_th_base_005fdashboardRenderer_005f0);
          out.write("                       \r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
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
