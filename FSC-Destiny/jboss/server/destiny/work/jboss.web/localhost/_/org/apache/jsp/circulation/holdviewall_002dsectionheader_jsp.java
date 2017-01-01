package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class holdviewall_002dsectionheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String type = request.getParameter("type");
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
	
	String sectionImageAlt = "";

	String helpFileName = "c_manage_requests.htm";
	
	boolean printMe = false;
	
	if (HoldViewAllForm.HEADER_TYPE_UNAPPROVED.equals(type)) {
    	helpFileName = "d_unapproved offsite requests.htm";
		sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_UnapprovedRequests");
		
		printMe = form.getUnapprovedList().size() > 0 && 
			(form.isIncludeUnapproved() || form.isIncludeReserved());
    } else if (HoldViewAllForm.HEADER_TYPE_LOCAL.equals(type)) {
		sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_LocalRequests");
    	helpFileName = "c_manage_requests.htm";
		
		printMe = (form.getLocalExpired().size() > 0) ||
				  (form.getLocalPending().size() > 0) ||
				  (form.getLocalReadyForPatron().size() > 0) ||
				  (form.getLocalToBePulledList().size() > 0);
    } else if (HoldViewAllForm.HEADER_TYPE_ILL.equals(type)) {
    	sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_ILLRequests");
    	helpFileName = "c_ILL_requests_LM.htm";
    	
    	printMe = (form.getFillByOtherSiteList().size() > 0 ||
    			  form.getFillByLocalSiteList().size() > 0) && form.isIncludeILL();
    } else if (HoldViewAllForm.HEADER_TYPE_MEDIA.equals(type)) {
    	sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_MediaRequests");
    	helpFileName = "d_media_requests.htm";
    	
    	printMe = form.getMediaList().size() > 0 && form.isIncludeMedia();
    } else if (HoldViewAllForm.HEADER_TYPE_FOLLETT_EBOOK_MEDIA.equals(type)) {
        sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_FollettEBookMediaRequests");
        helpFileName = "d_follett_ebook_media_requests.htm";
        printMe = form.getFollettEBookMediaList().size() > 0 && form.isIncludeMedia();
    }

      out.write("\r\n\r\n");
 if (printMe) { 
      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /circulation/holdviewall-sectionheader.jsp(59,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(HoldViewAllForm.FORM_NAME);
      // /circulation/holdviewall-sectionheader.jsp(59,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
      // /circulation/holdviewall-sectionheader.jsp(59,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("false");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
 if (!StringHelper.isEmpty(sectionImageAlt)) { 
          out.write("\r\n\t\t<tr>\r\n\t\t    <td background=\"/images/icons/general/thickline.gif\" height=\"18\" nowrap>\r\n                <span class='SectionHeader'>");
          out.print(sectionImageAlt );
          out.write("</span>\r\n\t\t        ");
          //  base:helpTag
          com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
          _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/holdviewall-sectionheader.jsp(64,10) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fhelpTag_005f0.setHelpFileName(helpFileName);
          int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
          if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
          out.write("\r\n\t\t    </td>\r\n\t\t</tr>\r\n\t");
 } 
          out.write('\r');
          out.write('\n');
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
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f0.setParent(null);
      // /circulation/holdviewall-sectionheader.jsp(69,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setName(HoldViewAllForm.FORM_NAME);
      // /circulation/holdviewall-sectionheader.jsp(69,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setProperty("printerFriendly");
      // /circulation/holdviewall-sectionheader.jsp(69,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setValue("false");
      int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
 if (!StringHelper.isEmpty(sectionImageAlt)) { 
          out.write("\r\n\t\t<tr>\r\n\t\t    <td nowrap class=\"TableHeading\">\r\n\t\t        ");
          out.print(sectionImageAlt);
          out.write("\r\n\t\t    </td>\r\n\t\t</tr>\r\n\t");
 } 
          out.write('\r');
          out.write('\n');
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
      out.write("    \r\n\r\n");
 } 
      out.write('	');
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
