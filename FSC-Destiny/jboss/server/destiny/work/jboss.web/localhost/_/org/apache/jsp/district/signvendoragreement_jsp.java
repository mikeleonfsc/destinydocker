package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.district.servlet.SignVendorAgreementForm;
import com.follett.fsc.common.StringHelper;

public final class signvendoragreement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
 SignVendorAgreementForm form = (SignVendorAgreementForm)request.getAttribute(SignVendorAgreementForm.FORM_NAME); 
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /district/signvendoragreement.jsp(14,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/district/servlet/handlesignvendoragreementform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          if (_jspx_meth_base_005fmessageBox_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n");
 if ("mackin".equals(form.getVendor())) { 
          out.write("\r\n<div style=\"margin-left:8em;margin-right:8em;\">\r\n    <p>Thanks for using Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>\r\n    \r\n    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND MACKINVIA&trade; SYSTEMS</p>\r\n    \r\n    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> \r\n    \r\n    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> \r\n    \r\n    <p>1. HOW WE COLLECT AND USE INFORMATION</p>\r\n    \r\n    <p>Follett may have access to personally identifiable information about students (\"Student Data\") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> \r\n");
          out.write("    \r\n    <p>2. HOW WE SHARE INFORMATION</p>\r\n    \r\n    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>\r\n    \r\n    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school.   Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p> \r\n    \r\n    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized such access. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>\r\n");
          out.write("    \r\n    <ul>\r\n    <li>First Name</li>\r\n    <li>Middle Name</li>\r\n    <li>Last Name</li>\r\n    <li>Email Address</li>\r\n    <li>Grade</li>\r\n    <li>Patron Type</li>\r\n    <li>User Name (i.e. Login name)</li>\r\n    <li>District ID</li>\r\n    <li>Destiny Barcode Number</li>\r\n    <li>userGUID (Internal Destiny System Identifier)</li>\r\n    </ul>\r\n    <br/>\r\n    \r\n    <p>Please remember that these privacy practices apply solely to the Follett applications and services, and not other services or third party applications, including any services or applications with which the Follett applications integrate, all of which may have their own privacy policies.  Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications.  Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>\r\n    \r\n    <p>3. YOUR INFORMATION CHOICES</p>\r\n");
          out.write("    \r\n    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> \r\n    \r\n    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>\r\n    \r\n    <p>4. HOW TO CONTACT US</p>\r\n    \r\n    <p>If you have any questions about these terms or the application, please contact us at <a href=\"mailto:technicalsupport@follett.com\">technicalsupport@follett.com</a>.</p>\r\n    \r\n    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your MackinVIA&trade; system.</p>  \r\n    \r\n    <table>\r\n        <tr><td>School District:</td><td>");
          out.print(form.getDistrictName());
          out.write("</td></tr>\r\n        <tr><td>Name:</td><td><input name=\"");
          out.print(SignVendorAgreementForm.FIELD_SIGNATURE_NAME);
          out.write("\"></td></tr>    \r\n        <tr><td>Date:</td><td>");
          out.print(form.getDate());
          out.write("</td></tr>\r\n    </table>\r\n    <input type=\"hidden\" name=\"");
          out.print(SignVendorAgreementForm.FIELD_VENDOR_NAME);
          out.write("\" value=\"");
          out.print(form.getVendor());
          out.write("\">\r\n    <div style=\"float:right;\"> \r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(75,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/signButton.gif");
          // /district/signvendoragreement.jsp(75,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt("Sign");
          // /district/signvendoragreement.jsp(75,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName(SignVendorAgreementForm.BUTTON_NAME_ACCEPT);
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n        <br>\r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(77,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/cancel.gif");
          // /district/signvendoragreement.jsp(77,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setAlt("Cancel");
          // /district/signvendoragreement.jsp(77,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setName(SignVendorAgreementForm.BUTTON_NAME_CANCEL);
          int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
          out.write("             \r\n    </div>\r\n                       \r\n</div>\r\n");
 } 
          out.write("\r\n\r\n");
 if ("overdrive".equals(form.getVendor())) { 
          out.write("\r\n<div style=\"margin-left:8em;margin-right:8em;\">\r\n    <p>Thanks for using Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>\r\n    \r\n    \r\n    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND OVERDRIVE&reg; SYSTEMS</p>\r\n    \r\n    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> \r\n    \r\n    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> \r\n    \r\n    <p>1. HOW WE COLLECT AND USE INFORMATION</p>\r\n    \r\n    <p>Follett may have access to personally identifiable information about students (\"Student Data\") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> \r\n");
          out.write("    \r\n    <p>2. HOW WE SHARE INFORMATION</p>\r\n    \r\n    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>\r\n    \r\n    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school.   Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p> \r\n    \r\n    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized a third party or application to access Student Data through the service. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>\r\n");
          out.write("    \r\n    <ul>\r\n    <li>First Name</li>\r\n    <li>Middle Name</li>\r\n    <li>Last Name</li>\r\n    <li>Email Address</li>\r\n    <li>Grade</li>\r\n    <li>Patron Type</li>\r\n    <li>User Name (i.e. Login name)</li>\r\n    <li>District ID</li>\r\n    <li>Destiny Barcode Number</li>\r\n    <li>userGUID (Internal Destiny System Identifier)</li>\r\n    </ul>\r\n    <br/>\r\n    <p>Please remember that these privacy practices apply to the Follett applications and services, and not other services or third party applications, which may have their own privacy policies.  Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications.  Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>\r\n    \r\n    <p>3. YOUR INFORMATION CHOICES</p>\r\n    \r\n    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> \r\n");
          out.write("    \r\n    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>\r\n    \r\n    <p>4. HOW TO CONTACT US</p>\r\n    \r\n    <p>If you have any questions about these terms or the application, please contact us at <a href=\"mailto:technicalsupport@follett.com\">technicalsupport@follett.com</a>.</p>\r\n    \r\n    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your OverDrive&reg; system.</p>  \r\n    \r\n    <table>\r\n        <tr><td>School District:</td><td>");
          out.print(form.getDistrictName());
          out.write("</td></tr>\r\n        <tr><td>Name:</td><td><input name=\"");
          out.print(SignVendorAgreementForm.FIELD_SIGNATURE_NAME);
          out.write("\"></td></tr>    \r\n        <tr><td>Date:</td><td>");
          out.print(form.getDate());
          out.write("</td></tr>\r\n    </table>\r\n    <input type=\"hidden\" name=\"");
          out.print(SignVendorAgreementForm.FIELD_VENDOR_NAME);
          out.write("\" value=\"");
          out.print(form.getVendor());
          out.write("\">\r\n    <div style=\"float:right;\">                 \r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(140,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/signButton.gif");
          // /district/signvendoragreement.jsp(140,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setAlt("Sign");
          // /district/signvendoragreement.jsp(140,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setName(SignVendorAgreementForm.BUTTON_NAME_ACCEPT);
          int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
          out.write("\r\n        <br>\r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(142,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/cancel.gif");
          // /district/signvendoragreement.jsp(142,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setAlt("Cancel");
          // /district/signvendoragreement.jsp(142,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setName(SignVendorAgreementForm.BUTTON_NAME_CANCEL);
          int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
          out.write("             \r\n    </div>\r\n                    \r\n</div>\r\n");
 } 
          out.write("\r\n\r\n");
 if ("biblionasium".equals(form.getVendor())) { 
          out.write("\r\n<div style=\"margin-left:8em;margin-right:8em;\">\r\n    <p>Thanks for choosing Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>\r\n\r\n    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND BIBLIONASIUM&reg; SYSTEMS</p>\r\n    \r\n    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> \r\n    \r\n    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> \r\n    \r\n    <p>1. HOW WE COLLECT AND USE INFORMATION</p>\r\n    \r\n    <p>Follett may have access to personally identifiable information about students (\"Student Data\") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> \r\n");
          out.write("    \r\n    <p>2. HOW WE SHARE INFORMATION</p>\r\n    \r\n    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>\r\n    \r\n    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school. Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p>\r\n    \r\n    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized such access. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>\r\n    \r\n");
          out.write("    <ul>\r\n    <li>Version of the file</li>\r\n    <li>Date & Time of the file</li>\r\n    <li>Destiny App ID (Internal Destiny System Identifier)</li>\r\n    <li>Location ID (Internal Destiny System Identifier)</li>\r\n    <li>Student or Teacher Designation</li>\r\n    <li>Location Name (Site Name)</li>\r\n    <li>First Name</li>\r\n    <li>Middle Name</li>\r\n    <li>Last Name</li>\r\n    <li>Email Address (Teachers Only)</li>\r\n    <li>Grade</li>\r\n    <li>User Name (i.e. Login name)</li>\r\n    <li>userGUID (Internal Destiny System Identifier)</li>\r\n    <li>TeacherGUID (Internal Destiny System Identifier)</li>\r\n    <li>Site Librarian (Internal Indicator to determine if user is the Librarian)</li>\r\n    </ul>\r\n    <br/>\r\n    <p>Please remember that these privacy practices apply solely to the Follett applications and services, and not other services or third party applications, including any services or applications with which the Follett applications integrate, all of which may have their own privacy policies. Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications. Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>\r\n");
          out.write("    \r\n    <p>3. YOUR INFORMATION CHOICES</p>\r\n    \r\n    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> \r\n    \r\n    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>\r\n    \r\n    <p>4. HOW TO CONTACT US</p>\r\n    \r\n    <p>If you have any questions about these terms or the application, please contact us at <a href=\"mailto:technicalsupport@follett.com\">technicalsupport@follett.com</a>.</p>\r\n    \r\n    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your Biblionasium&reg; system.</p>  \r\n    \r\n    <table>\r\n        <tr><td id=\"");
          out.print(SignVendorAgreementForm.ID_SCHOOL_NAME);
          out.write("\">School:</td><td>");
          out.print(form.getSchoolName());
          out.write("</td></tr>\r\n        <tr><td>Name:</td><td><input name=\"");
          out.print(SignVendorAgreementForm.FIELD_SIGNATURE_NAME);
          out.write("\" maxlength=\"129\"></td></tr>    \r\n        <tr><td id=\"");
          out.print(SignVendorAgreementForm.ID_SIGN_DATE);
          out.write("\">Date:</td><td>");
          out.print(form.getDate());
          out.write("</td></tr>\r\n    </table>\r\n    <input type=\"hidden\" name=\"");
          out.print(SignVendorAgreementForm.FIELD_VENDOR_NAME);
          out.write("\" value=\"");
          out.print(form.getVendor());
          out.write("\">\r\n    <input type=\"hidden\" name=\"");
          out.print(SignVendorAgreementForm.FIELD_SITE_SCHOOL_NAME);
          out.write("\" value=\"");
          out.print(form.getSchoolName());
          out.write("\">\r\n    <div style=\"float:right;\">                 \r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(210,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/signButton.gif");
          // /district/signvendoragreement.jsp(210,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setAlt("Sign");
          // /district/signvendoragreement.jsp(210,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setName(SignVendorAgreementForm.BUTTON_NAME_ACCEPT);
          int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
          out.write("\r\n        <br>\r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(212,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/large/cancel.gif");
          // /district/signvendoragreement.jsp(212,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setAlt("Cancel");
          // /district/signvendoragreement.jsp(212,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setName(SignVendorAgreementForm.BUTTON_NAME_CANCEL);
          int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
          out.write("             \r\n    </div>\r\n                    \r\n</div>\r\n");
 } 
          out.write("\r\n\r\n");
 if ("bakerandtaylor".equals(form.getVendor())) { 
          out.write("\r\n<div style=\"margin-left:8em;margin-right:8em;\">\r\n    <p>Thanks for using Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>\r\n    \r\n    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND Baker & Taylor SYSTEMS</p>\r\n    \r\n    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> \r\n    \r\n    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> \r\n    \r\n    <p>1. HOW WE COLLECT AND USE INFORMATION</p>\r\n    \r\n    <p>Follett may have access to personally identifiable information about students (\"Student Data\") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> \r\n");
          out.write("    \r\n    <p>2. HOW WE SHARE INFORMATION</p>\r\n    \r\n    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>\r\n    \r\n    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school.   Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p> \r\n    \r\n    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized such access. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>\r\n");
          out.write("    \r\n    <ul>\r\n    <li>First Name</li>\r\n    <li>Middle Name</li>\r\n    <li>Last Name</li>\r\n    <li>Email Address</li>\r\n    <li>Grade</li>\r\n    <li>Patron Type</li>\r\n    <li>User Name (i.e. Login name)</li>\r\n    <li>District ID</li>\r\n    <li>Destiny Barcode Number</li>\r\n    <li>userGUID (Internal Destiny System Identifier)</li>\r\n    </ul>\r\n    <br/>\r\n    \r\n    <p>Please remember that these privacy practices apply solely to the Follett applications and services, and not other services or third party applications, including any services or applications with which the Follett applications integrate, all of which may have their own privacy policies.  Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications.  Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>\r\n    \r\n    <p>3. YOUR INFORMATION CHOICES</p>\r\n");
          out.write("    \r\n    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> \r\n    \r\n    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>\r\n    \r\n    <p>4. HOW TO CONTACT US</p>\r\n    \r\n    <p>If you have any questions about these terms or the application, please contact us at <a href=\"mailto:technicalsupport@follett.com\">technicalsupport@follett.com</a>.</p>\r\n    \r\n    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your Baker & Taylor system.</p>  \r\n    \r\n    <table>\r\n        <tr><td>School District:</td><td>");
          out.print(form.getDistrictName());
          out.write("</td></tr>\r\n        <tr><td>Name:</td><td><input name=\"");
          out.print(SignVendorAgreementForm.FIELD_SIGNATURE_NAME);
          out.write("\"></td></tr>    \r\n        <tr><td>Date:</td><td>");
          out.print(form.getDate());
          out.write("</td></tr>\r\n    </table>\r\n    <input type=\"hidden\" name=\"");
          out.print(SignVendorAgreementForm.FIELD_VENDOR_NAME);
          out.write("\" value=\"");
          out.print(form.getVendor());
          out.write("\">\r\n    <div style=\"float:right;\"> \r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f6.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(275,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setSrc("/buttons/large/signButton.gif");
          // /district/signvendoragreement.jsp(275,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setAlt("Sign");
          // /district/signvendoragreement.jsp(275,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setName(SignVendorAgreementForm.BUTTON_NAME_ACCEPT);
          int _jspx_eval_base_005fgenericButton_005f6 = _jspx_th_base_005fgenericButton_005f6.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
          out.write("\r\n        <br>\r\n        ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f7 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f7.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/signvendoragreement.jsp(277,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f7.setSrc("/buttons/large/cancel.gif");
          // /district/signvendoragreement.jsp(277,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f7.setAlt("Cancel");
          // /district/signvendoragreement.jsp(277,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f7.setName(SignVendorAgreementForm.BUTTON_NAME_CANCEL);
          int _jspx_eval_base_005fgenericButton_005f7 = _jspx_th_base_005fgenericButton_005f7.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
          out.write("             \r\n    </div>\r\n                       \r\n</div>\r\n");
 } 
          out.write("\r\n\r\n");
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /district/signvendoragreement.jsp(16,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }
}
