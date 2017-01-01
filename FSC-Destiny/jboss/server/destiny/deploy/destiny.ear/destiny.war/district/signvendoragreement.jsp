<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.SignVendorAgreementForm" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>

<% SignVendorAgreementForm form = (SignVendorAgreementForm)request.getAttribute(SignVendorAgreementForm.FORM_NAME); %>

<base:form action="/district/servlet/handlesignvendoragreementform.do">

<base:messageBox strutsErrors="true"/>

<% if ("mackin".equals(form.getVendor())) { %>
<div style="margin-left:8em;margin-right:8em;">
    <p>Thanks for using Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>
    
    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND MACKINVIA&trade; SYSTEMS</p>
    
    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> 
    
    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> 
    
    <p>1. HOW WE COLLECT AND USE INFORMATION</p>
    
    <p>Follett may have access to personally identifiable information about students ("Student Data") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> 
    
    <p>2. HOW WE SHARE INFORMATION</p>
    
    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>
    
    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school.   Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p> 
    
    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized such access. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>
    
    <ul>
    <li>First Name</li>
    <li>Middle Name</li>
    <li>Last Name</li>
    <li>Email Address</li>
    <li>Grade</li>
    <li>Patron Type</li>
    <li>User Name (i.e. Login name)</li>
    <li>District ID</li>
    <li>Destiny Barcode Number</li>
    <li>userGUID (Internal Destiny System Identifier)</li>
    </ul>
    <br/>
    
    <p>Please remember that these privacy practices apply solely to the Follett applications and services, and not other services or third party applications, including any services or applications with which the Follett applications integrate, all of which may have their own privacy policies.  Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications.  Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>
    
    <p>3. YOUR INFORMATION CHOICES</p>
    
    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> 
    
    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>
    
    <p>4. HOW TO CONTACT US</p>
    
    <p>If you have any questions about these terms or the application, please contact us at <a href="mailto:technicalsupport@follett.com">technicalsupport@follett.com</a>.</p>
    
    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your MackinVIA&trade; system.</p>  
    
    <table>
        <tr><td>School District:</td><td><%=form.getDistrictName()%></td></tr>
        <tr><td>Name:</td><td><input name="<%=SignVendorAgreementForm.FIELD_SIGNATURE_NAME%>"></td></tr>    
        <tr><td>Date:</td><td><%=form.getDate()%></td></tr>
    </table>
    <input type="hidden" name="<%=SignVendorAgreementForm.FIELD_VENDOR_NAME%>" value="<%=form.getVendor()%>">
    <div style="float:right;"> 
        <base:genericButton src="/buttons/large/signButton.gif" alt="Sign" name="<%=SignVendorAgreementForm.BUTTON_NAME_ACCEPT%>"/>
        <br>
        <base:genericButton src="/buttons/large/cancel.gif" alt="Cancel" name="<%=SignVendorAgreementForm.BUTTON_NAME_CANCEL%>"/>             
    </div>
                       
</div>
<% } %>

<% if ("overdrive".equals(form.getVendor())) { %>
<div style="margin-left:8em;margin-right:8em;">
    <p>Thanks for using Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>
    
    
    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND OVERDRIVE&reg; SYSTEMS</p>
    
    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> 
    
    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> 
    
    <p>1. HOW WE COLLECT AND USE INFORMATION</p>
    
    <p>Follett may have access to personally identifiable information about students ("Student Data") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> 
    
    <p>2. HOW WE SHARE INFORMATION</p>
    
    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>
    
    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school.   Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p> 
    
    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized a third party or application to access Student Data through the service. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>
    
    <ul>
    <li>First Name</li>
    <li>Middle Name</li>
    <li>Last Name</li>
    <li>Email Address</li>
    <li>Grade</li>
    <li>Patron Type</li>
    <li>User Name (i.e. Login name)</li>
    <li>District ID</li>
    <li>Destiny Barcode Number</li>
    <li>userGUID (Internal Destiny System Identifier)</li>
    </ul>
    <br/>
    <p>Please remember that these privacy practices apply to the Follett applications and services, and not other services or third party applications, which may have their own privacy policies.  Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications.  Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>
    
    <p>3. YOUR INFORMATION CHOICES</p>
    
    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> 
    
    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>
    
    <p>4. HOW TO CONTACT US</p>
    
    <p>If you have any questions about these terms or the application, please contact us at <a href="mailto:technicalsupport@follett.com">technicalsupport@follett.com</a>.</p>
    
    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your OverDrive&reg; system.</p>  
    
    <table>
        <tr><td>School District:</td><td><%=form.getDistrictName()%></td></tr>
        <tr><td>Name:</td><td><input name="<%=SignVendorAgreementForm.FIELD_SIGNATURE_NAME%>"></td></tr>    
        <tr><td>Date:</td><td><%=form.getDate()%></td></tr>
    </table>
    <input type="hidden" name="<%=SignVendorAgreementForm.FIELD_VENDOR_NAME%>" value="<%=form.getVendor()%>">
    <div style="float:right;">                 
        <base:genericButton src="/buttons/large/signButton.gif" alt="Sign" name="<%=SignVendorAgreementForm.BUTTON_NAME_ACCEPT%>"/>
        <br>
        <base:genericButton src="/buttons/large/cancel.gif" alt="Cancel" name="<%=SignVendorAgreementForm.BUTTON_NAME_CANCEL%>"/>             
    </div>
                    
</div>
<% } %>

<% if ("biblionasium".equals(form.getVendor())) { %>
<div style="margin-left:8em;margin-right:8em;">
    <p>Thanks for choosing Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>

    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND BIBLIONASIUM&reg; SYSTEMS</p>
    
    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> 
    
    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> 
    
    <p>1. HOW WE COLLECT AND USE INFORMATION</p>
    
    <p>Follett may have access to personally identifiable information about students ("Student Data") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> 
    
    <p>2. HOW WE SHARE INFORMATION</p>
    
    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>
    
    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school. Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p>
    
    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized such access. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>
    
    <ul>
    <li>Version of the file</li>
    <li>Date & Time of the file</li>
    <li>Destiny App ID (Internal Destiny System Identifier)</li>
    <li>Location ID (Internal Destiny System Identifier)</li>
    <li>Student or Teacher Designation</li>
    <li>Location Name (Site Name)</li>
    <li>First Name</li>
    <li>Middle Name</li>
    <li>Last Name</li>
    <li>Email Address (Teachers Only)</li>
    <li>Grade</li>
    <li>User Name (i.e. Login name)</li>
    <li>userGUID (Internal Destiny System Identifier)</li>
    <li>TeacherGUID (Internal Destiny System Identifier)</li>
    <li>Site Librarian (Internal Indicator to determine if user is the Librarian)</li>
    </ul>
    <br/>
    <p>Please remember that these privacy practices apply solely to the Follett applications and services, and not other services or third party applications, including any services or applications with which the Follett applications integrate, all of which may have their own privacy policies. Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications. Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>
    
    <p>3. YOUR INFORMATION CHOICES</p>
    
    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> 
    
    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>
    
    <p>4. HOW TO CONTACT US</p>
    
    <p>If you have any questions about these terms or the application, please contact us at <a href="mailto:technicalsupport@follett.com">technicalsupport@follett.com</a>.</p>
    
    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your Biblionasium&reg; system.</p>  
    
    <table>
        <tr><td id="<%=SignVendorAgreementForm.ID_SCHOOL_NAME%>">School:</td><td><%=form.getSchoolName()%></td></tr>
        <tr><td>Name:</td><td><input name="<%=SignVendorAgreementForm.FIELD_SIGNATURE_NAME%>" maxlength="129"></td></tr>    
        <tr><td id="<%=SignVendorAgreementForm.ID_SIGN_DATE%>">Date:</td><td><%=form.getDate()%></td></tr>
    </table>
    <input type="hidden" name="<%=SignVendorAgreementForm.FIELD_VENDOR_NAME%>" value="<%=form.getVendor()%>">
    <input type="hidden" name="<%=SignVendorAgreementForm.FIELD_SITE_SCHOOL_NAME%>" value="<%=form.getSchoolName()%>">
    <div style="float:right;">                 
        <base:genericButton src="/buttons/large/signButton.gif" alt="Sign" name="<%=SignVendorAgreementForm.BUTTON_NAME_ACCEPT%>"/>
        <br>
        <base:genericButton src="/buttons/large/cancel.gif" alt="Cancel" name="<%=SignVendorAgreementForm.BUTTON_NAME_CANCEL%>"/>             
    </div>
                    
</div>
<% } %>

<% if ("bakerandtaylor".equals(form.getVendor())) { %>
<div style="margin-left:8em;margin-right:8em;">
    <p>Thanks for using Follett! When you use our products and services, you're agreeing to our terms, so please take a few minutes to read over the updated Licensing Terms below.</p>
    
    <p>UPDATES TO DESTINY&reg; LICENSING TERMS FOR ENABLING INTEGRATION BETWEEN DESTINY&reg; AND Baker & Taylor SYSTEMS</p>
    
    <p>Follett understands that privacy is tremendously important to schools and students who use our products and services.</p> 
    
    <p>Follett enables districts and schools to securely maintain student roster information for the purposes of provisioning accounts in our applications. As we describe below, our customers decide which data are integrated with Follett and our customers are responsible for determining whether data is ever shared with applications through Follett.</p> 
    
    <p>1. HOW WE COLLECT AND USE INFORMATION</p>
    
    <p>Follett may have access to personally identifiable information about students ("Student Data") in the course of providing its applications and services to a school. We consider Student Data to be confidential and do not use such data for any purpose other than to provide services on the school's behalf.</p> 
    
    <p>2. HOW WE SHARE INFORMATION</p>
    
    <p>Follett only shares personal information in a few limited circumstances, described below. We do not rent or sell information for marketing purposes.</p>
    
    <p>Follett may facilitate the sharing of Student Data with third parties, though only when instructed and authorized to do so on behalf of the school.   Some elements of our applications enable schools to interact with parents, students, teachers and third party applications, for the benefit of supporting a student's education.</p> 
    
    <p>Follett does not facilitate the sharing of any Student Data with third parties except on behalf of the school after the school has authorized such access. You are responsible for deciding if you want to access or use third party apps or sites that link from our applications. If you enable third-party integrations, that application or vendor can access information in Follett applications related to you, your staff, and your students, including:</p>
    
    <ul>
    <li>First Name</li>
    <li>Middle Name</li>
    <li>Last Name</li>
    <li>Email Address</li>
    <li>Grade</li>
    <li>Patron Type</li>
    <li>User Name (i.e. Login name)</li>
    <li>District ID</li>
    <li>Destiny Barcode Number</li>
    <li>userGUID (Internal Destiny System Identifier)</li>
    </ul>
    <br/>
    
    <p>Please remember that these privacy practices apply solely to the Follett applications and services, and not other services or third party applications, including any services or applications with which the Follett applications integrate, all of which may have their own privacy policies.  Schools should carefully review the privacy practices of each third party application before agreeing to enable third-party integrations in Follett applications.  Except to the limited extent it may be required by applicable law, Follett is not responsible for these other sites and applications -- use these at your own risk.</p>
    
    <p>3. YOUR INFORMATION CHOICES</p>
    
    <p>Integration Settings: Districts and schools may update account information and modify services, including third-party integrations, by signing into the administrator account.</p> 
    
    <p>Access to Student Data: Student Data is provided and controlled by the district and schools. If you have any questions about reviewing, modifying, or deleting personal information of a student, please contact our Technical Support team.</p>
    
    <p>4. HOW TO CONTACT US</p>
    
    <p>If you have any questions about these terms or the application, please contact us at <a href="mailto:technicalsupport@follett.com">technicalsupport@follett.com</a>.</p>
    
    <p>By signing this agreement, you agree to these updated terms and are instructing Follett to enable the integration of your Destiny&reg; Library Manager system with your Baker & Taylor system.</p>  
    
    <table>
        <tr><td>School District:</td><td><%=form.getDistrictName()%></td></tr>
        <tr><td>Name:</td><td><input name="<%=SignVendorAgreementForm.FIELD_SIGNATURE_NAME%>"></td></tr>    
        <tr><td>Date:</td><td><%=form.getDate()%></td></tr>
    </table>
    <input type="hidden" name="<%=SignVendorAgreementForm.FIELD_VENDOR_NAME%>" value="<%=form.getVendor()%>">
    <div style="float:right;"> 
        <base:genericButton src="/buttons/large/signButton.gif" alt="Sign" name="<%=SignVendorAgreementForm.BUTTON_NAME_ACCEPT%>"/>
        <br>
        <base:genericButton src="/buttons/large/cancel.gif" alt="Cancel" name="<%=SignVendorAgreementForm.BUTTON_NAME_CANCEL%>"/>             
    </div>
                       
</div>
<% } %>

</base:form>
