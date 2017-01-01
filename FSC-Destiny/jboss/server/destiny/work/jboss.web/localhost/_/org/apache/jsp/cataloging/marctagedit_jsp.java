package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import java.util.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.util.marc.MarcVO;
import com.follett.fsc.common.consortium.UserContext;

public final class marctagedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005fsubfieldEditCount_005fsubfieldData_005fsubfieldCodes_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005fsubfieldEditCount_005fsubfieldData_005fsubfieldCodes_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005fsubfieldEditCount_005fsubfieldData_005fsubfieldCodes_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    TitleEditForm titleEditForm = (TitleEditForm)request.getAttribute(TitleEditForm.FORM_NAME);
    List messages = titleEditForm.getMockSessionStoreMessages();
    boolean editTemplates = titleEditForm.isEditTemplates();
    boolean hideLocalQuizzes = titleEditForm.isHideLocalQuizzes();
    boolean alreadyDisplayedShowLink = false;

      out.write("\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/marctagedit.jsp(30,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/marctagedit.jsp(30,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(request.getAttribute(TitleEditForm.FORM_NAME));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /cataloging/marctagedit.jsp(31,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("marcVO");
      // /cataloging/marctagedit.jsp(31,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName(TitleEditForm.FORM_NAME);
      // /cataloging/marctagedit.jsp(31,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("marcVOList");
      // /cataloging/marctagedit.jsp(31,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.util.marc.MarcVO");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.util.marc.MarcVO marcVO = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        marcVO = (com.follett.fsc.destiny.util.marc.MarcVO) _jspx_page_context.findAttribute("marcVO");
        do {
          out.write('\r');
          out.write('\n');
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /cataloging/marctagedit.jsp(32,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!(!form.displayingDigitalContent && marcVO.digitalResource) }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');

    // Display the label.  If there is no label, we're on another subfield of the same
    // tag, and don't want to display anything.
    int tagID = marcVO.getTagID();
    int rowSpan;
    String data = null;
    if (titleEditForm.getOriginalEditTagID() == tagID) {
        rowSpan = titleEditForm.getSubfieldEditCount();
    } else {
        rowSpan = marcVO.getRowCount();
        data = ResponseUtils.filter(marcVO.getDisplayableSubfieldData(0));
        if (marcVO.isNonbreaking()) {
            data = StringHelper.replaceSpacesWithNBSP(data);
        }
    }
    boolean hideRow = false;
    if(!StringHelper.isEmptyOrWhitespace(marcVO.getQuizShortSiteName()) && hideLocalQuizzes) {
        if (!alreadyDisplayedShowLink) {
            
              out.write("<tr><td valign=\"top\" class=\"SmallColHeading tdAlignRight\" bgcolor=\"#E8E8E8\" colSpan='2'>&nbsp;</td><td class=\"SmallColRow\" align=\"center\" colspan=\"6\"><a class=\"DetailLink\" href=\"javascript:showQuizRows()\" id=\"");
              out.print(TitleEditForm.ID_SHOW_SPECIFIC_526_TAGS );
              out.write('"');
              out.write('>');
              out.print( MessageHelper.formatMessage("marctagedit_ShowSiteSpecific") );
              out.write(" <img src='");
              out.print(UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showmore.gif"));
              out.write("' border=\"0\"></a></td></tr>");

            alreadyDisplayedShowLink = true;
        }
        hideRow = true;
    } else {
        hideRow = false;
    }

    String temp = null;
    String anchorLink = "<a class=MarcEditTagLink href=\"javascript:editTag(" + tagID + ")\">";

              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/marctagedit.jsp(62,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName(TitleEditForm.FORM_NAME);
              // /cataloging/marctagedit.jsp(62,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty("originalEditTagID");
              // /cataloging/marctagedit.jsp(62,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue( String.valueOf(tagID) );
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('\r');
                  out.write('\n');

    if (messages != null && !messages.isEmpty()) {
        out.println("<tr><td colspan=\"8\"><a name=\"thefocus\"></a>&nbsp;</td></tr>");
        out.println("<tr><td>&nbsp;</td><td colspan=\"7\">");
        out.println("<table id=\"" + TitleEditForm.TABLE_TAG_ERRORS + "\">");
        out.println("<tr><td class=\"Error\">");
        out.println("<font color=\"#CC0000\">");
        out.println("<ul>");

        Iterator itr = messages.iterator();
        while (itr.hasNext()) {
            out.println("<li>" + (String) itr.next() + "</li>");
        }

        out.println("</ul>");
        out.println("</font>");
        out.println("</td></tr>");
        out.println("</table>");
        out.println("</td></tr>");
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
              out.write('	');
 if (!hideRow) { 
              out.write("\r\n    <tr>\r\n");

        String backcolor = "#E8E8E8";

              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/marctagedit.jsp(90,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(TitleEditForm.FORM_NAME);
              // /cataloging/marctagedit.jsp(90,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("originalEditTagID");
              // /cataloging/marctagedit.jsp(90,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue( String.valueOf(tagID) );
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('\r');
                  out.write('\n');

            backcolor = "#FFFFFF";

                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
              out.write("\r\n\r\n        <td valign=\"top\" class=\"SmallColHeading tdAlignRight\" bgcolor=\"");
              out.print( backcolor );
              out.write("\" rowspan='");
              out.print( rowSpan );
              out.write("'>\r\n");

        String helpTagNum = marcVO.getTagNumberForHelp();
        if (helpTagNum != null) {    
            String tagFileNameForForm = "d_tagb" + helpTagNum + ".htm";
            

              out.write("\r\n            ");
              //  base:helpTag
              com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
              _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/marctagedit.jsp(103,12) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTag_005f0.setHelpFileName( tagFileNameForForm );
              int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
              if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
              out.write('\r');
              out.write('\n');

        }
		if(marcVO.isSiteSpecificSubject()) {
	
              out.write("        \r\n            <font color=\"#990000\"><b>");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
                return;
              out.write("</b></font>\r\n\t");

		} else {
	
              out.write("\r\n            <b>");
              if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
                return;
              out.write("</b>\r\n\t");

		}
	
              out.write("\r\n        </td>\r\n\r\n        <td valign=\"top\" class=\"ColRow\" bgcolor=\"");
              out.print( backcolor );
              out.write("\" rowspan='");
              out.print( rowSpan );
              out.write("'>\r\n            ");
              if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
                return;
              out.write("\r\n            ");
if ((messages == null || messages.isEmpty()) && titleEditForm.getEditTagID().equals(String.valueOf(tagID))) {
              out.write("\r\n               <a name=\"thefocus\"></a>\r\n            ");
}
              out.write("\r\n        </td>\r\n\r\n");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/marctagedit.jsp(125,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName(TitleEditForm.FORM_NAME);
              // /cataloging/marctagedit.jsp(125,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty("originalEditTagID");
              // /cataloging/marctagedit.jsp(125,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue( String.valueOf(tagID) );
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t");
                  //  base:marcEditLine
                  com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag _jspx_th_base_005fmarcEditLine_005f0 = (com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag) _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag.class);
                  _jspx_th_base_005fmarcEditLine_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmarcEditLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /cataloging/marctagedit.jsp(126,2) name = marcVO type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f0.setMarcVO(marcVO);
                  // /cataloging/marctagedit.jsp(126,2) name = displayData type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f0.setDisplayData(data);
                  // /cataloging/marctagedit.jsp(126,2) name = rowSpan type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f0.setRowSpan(rowSpan);
                  // /cataloging/marctagedit.jsp(126,2) name = matchingTag type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f0.setMatchingTag(false);
                  // /cataloging/marctagedit.jsp(126,2) name = template type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f0.setTemplate(editTemplates);
                  // /cataloging/marctagedit.jsp(126,2) name = displayingDigitalContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f0.setDisplayingDigitalContent(titleEditForm.isDisplayingDigitalContent() );
                  int _jspx_eval_base_005fmarcEditLine_005f0 = _jspx_th_base_005fmarcEditLine_005f0.doStartTag();
                  if (_jspx_th_base_005fmarcEditLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.reuse(_jspx_th_base_005fmarcEditLine_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.reuse(_jspx_th_base_005fmarcEditLine_005f0);
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
              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/marctagedit.jsp(128,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(TitleEditForm.FORM_NAME);
              // /cataloging/marctagedit.jsp(128,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("originalEditTagID");
              // /cataloging/marctagedit.jsp(128,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue( String.valueOf(tagID) );
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t");
                  //  base:marcEditLine
                  com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag _jspx_th_base_005fmarcEditLine_005f1 = (com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag) _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005fsubfieldEditCount_005fsubfieldData_005fsubfieldCodes_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag.class);
                  _jspx_th_base_005fmarcEditLine_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmarcEditLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/marctagedit.jsp(129,2) name = marcVO type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setMarcVO(marcVO);
                  // /cataloging/marctagedit.jsp(129,2) name = displayData type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setDisplayData(data);
                  // /cataloging/marctagedit.jsp(129,2) name = rowSpan type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setRowSpan(rowSpan);
                  // /cataloging/marctagedit.jsp(129,2) name = subfieldCodes type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setSubfieldCodes(titleEditForm.getSubfieldCodes());
                  // /cataloging/marctagedit.jsp(129,2) name = subfieldData type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setSubfieldData(titleEditForm.getSubfieldData());
                  // /cataloging/marctagedit.jsp(129,2) name = subfieldEditCount type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setSubfieldEditCount(titleEditForm.getSubfieldEditCount());
                  // /cataloging/marctagedit.jsp(129,2) name = matchingTag type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setMatchingTag(true);
                  // /cataloging/marctagedit.jsp(129,2) name = template type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setTemplate(editTemplates);
                  // /cataloging/marctagedit.jsp(129,2) name = displayingDigitalContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmarcEditLine_005f1.setDisplayingDigitalContent(titleEditForm.isDisplayingDigitalContent() );
                  int _jspx_eval_base_005fmarcEditLine_005f1 = _jspx_th_base_005fmarcEditLine_005f1.doStartTag();
                  if (_jspx_th_base_005fmarcEditLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005fsubfieldEditCount_005fsubfieldData_005fsubfieldCodes_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.reuse(_jspx_th_base_005fmarcEditLine_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmarcEditLine_005ftemplate_005fsubfieldEditCount_005fsubfieldData_005fsubfieldCodes_005frowSpan_005fmatchingTag_005fmarcVO_005fdisplayingDigitalContent_005fdisplayData_005fnobody.reuse(_jspx_th_base_005fmarcEditLine_005f1);
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
              out.write("\r\n\r\n    ");
 } 
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          marcVO = (com.follett.fsc.destiny.util.marc.MarcVO) _jspx_page_context.findAttribute("marcVO");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n\r\n\r\n<!-- Had to move this outside of the iterator because the AT's were not working when it was in the <table> tag-->\r\n");
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f1.setParent(null);
      // /cataloging/marctagedit.jsp(140,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f1.setName(TitleEditForm.FORM_NAME);
      // /cataloging/marctagedit.jsp(140,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f1.setProperty("originalEditTagID");
      // /cataloging/marctagedit.jsp(140,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotEqual_005f1.setValue( TitleEditForm.NOT_EDITING_TAG_ID_STRING );
      int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <script language=\"JavaScript\" type=\"text/javascript\">\r\n        document.forms[\"");
          out.print( titleEditForm.FORM_NAME );
          out.write("\"].elements[\"");
          out.print(titleEditForm.getFocusProperty());
          out.write("\"].focus()\r\n    </script>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /cataloging/marctagedit.jsp(108,37) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("marcVO");
    // /cataloging/marctagedit.jsp(108,37) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("displayableLabel");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /cataloging/marctagedit.jsp(112,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setName("marcVO");
    // /cataloging/marctagedit.jsp(112,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setProperty("displayableLabel");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /cataloging/marctagedit.jsp(119,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setName("marcVO");
    // /cataloging/marctagedit.jsp(119,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setProperty("displayableTagNumber");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }
}
