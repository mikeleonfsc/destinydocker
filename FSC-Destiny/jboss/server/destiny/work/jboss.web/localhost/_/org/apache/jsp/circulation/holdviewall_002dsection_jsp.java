package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class holdviewall_002dsection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
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

      out.write("     \r\n \r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String type = request.getParameter("type");
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    boolean printerFriendly = form.isPrinterFriendly();
	
	String tableName = "";
	String sectionSubHeading = "";
	String sectionHelpURL = "";
	String typeJSP = "";
	
	boolean isRender = true;
	
	if (HoldViewAllForm.LIST_TYPE_UNAPPROVED.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_UNAPPROVED;
        
		typeJSP = "holdviewall-type1.jsp";
		
		// since reserves could also be unapproved, we need to also key this guy off of that flag
		isRender = form.isIncludeUnapproved() || form.isIncludeReserved();
    } else if (HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_ILL_FILL_BY_ME;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_ToBeFilledBy",ResponseUtils.filter((String)store.getProperty(LoginFacadeSpecs.SITE_DISPLAY_NAME)));
		typeJSP = "holdviewall-type1.jsp";
		isRender = form.isIncludeILL();
    } else if (HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_ILL_FILL_BY_OTHER;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_ToBeFilledByOtherSites");
		typeJSP = "holdviewall-type1.jsp";
		isRender = form.isIncludeILL();
    } else if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_MEDIA_REQUESTS;
		typeJSP = "holdviewall-type1.jsp";
		isRender = form.isIncludeMedia();
    } else if (HoldViewAllForm.LIST_TYPE_FOLLETT_EBOOK_MEDIA.equals(type)) {
        tableName = HoldViewAllForm.TABLE_FOLLETT_EBOOK_MEDIA_REQUESTS;
        typeJSP = "holdviewall-follettebook.jsp";
        isRender = form.isIncludeMedia();
    } else if (HoldViewAllForm.LIST_TYPE_TO_BE_PULLED.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_TO_BE_PULLED;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsToBePulled");
		typeJSP = "holdviewall-type2.jsp";
		sectionHelpURL = "d_local_materials_to_be_pulled.htm";
		isRender = form.isIncludeReserved() || form.isIncludeReady();
    } else if (HoldViewAllForm.LIST_TYPE_PENDING.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_PENDING;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsPending");		
		typeJSP = "holdviewall-type3.jsp";
		sectionHelpURL = "d_local materials pending.htm";
		isRender = form.isIncludeReserved() || form.isIncludePending();		
    } else if (HoldViewAllForm.LIST_TYPE_EXPIRED.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_EXPIRED;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsExpired");
		typeJSP = "holdviewall-type3.jsp";       
        sectionHelpURL = "d_local materials expired.htm";        
		isRender = form.isIncludeReserved() || form.isIncludeExpired();		
    } else if (HoldViewAllForm.LIST_TYPE_READY_FOR_PATRON.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_READY_FOR_PATRON;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsReadyForPatron");
		typeJSP = "holdviewall-type3.jsp";
		sectionHelpURL = "d_local_materials_ready_for_patron.htm";
		isRender = form.isIncludeReserved() || form.isIncludeReady();		
    }

      out.write("\r\n\r\n");
      //  bean:size
      java.lang.Integer listSize = null;
      org.apache.struts.taglib.bean.SizeTag _jspx_th_bean_005fsize_005f0 = (org.apache.struts.taglib.bean.SizeTag) _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.SizeTag.class);
      _jspx_th_bean_005fsize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fsize_005f0.setParent(null);
      // /circulation/holdviewall-section.jsp(83,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fsize_005f0.setId("listSize");
      // /circulation/holdviewall-section.jsp(83,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fsize_005f0.setName(HoldViewAllForm.FORM_NAME);
      // /circulation/holdviewall-section.jsp(83,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fsize_005f0.setProperty(type);
      int _jspx_eval_bean_005fsize_005f0 = _jspx_th_bean_005fsize_005f0.doStartTag();
      listSize = (java.lang.Integer) _jspx_page_context.findAttribute("listSize");
      if (_jspx_th_bean_005fsize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
        return;
      }
      listSize = (java.lang.Integer) _jspx_page_context.findAttribute("listSize");
      _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
      out.write('\r');
      out.write('\n');
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f0.setParent(null);
      // /circulation/holdviewall-section.jsp(84,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setName("listSize");
      // /circulation/holdviewall-section.jsp(84,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f0.setValue("0");
      int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
 if ( isRender ) { 
          out.write("\r\n\t\t");
 if (!StringHelper.isEmpty(sectionSubHeading)) { 
          out.write("\r\n\t\t<tr>\r\n\t\t    <td class=\"TableHeading2\" align=\"center\" nowrap>            \r\n\t\t        ");
          out.print(sectionSubHeading);
          out.write("\r\n\t\t        ");
 if (!printerFriendly && !StringHelper.isEmpty(sectionHelpURL)) { 
          out.write("\r\n\t\t        \t");
          //  base:helpTag
          com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
          _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
          // /circulation/holdviewall-section.jsp(91,11) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fhelpTag_005f0.setHelpFileName( sectionHelpURL );
          int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
          if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
          out.write("\r\n\t\t        ");
 } 
          out.write("\r\n\t\t    </td>\r\n\t\t</tr>\r\n\t\t");
 } 
          out.write("\r\n\t\t<tr>\r\n\t\t\t<td>\r\n\t\t\t    <table id=\"");
          out.print(tableName );
          out.write("\" cellSpacing=\"0\" cellPadding=\"2\" width=\"100%\" border=\"0\" style=\"border-collapse: collapse\">\r\n\t\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, typeJSP + ((typeJSP).indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("type", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(type), request.getCharacterEncoding()), out, false);
          out.write("\r\n\t\t\t\t</table>\r\n\t\t    </td>\r\n\t\t</tr>\r\n\t");
 } 
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
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
