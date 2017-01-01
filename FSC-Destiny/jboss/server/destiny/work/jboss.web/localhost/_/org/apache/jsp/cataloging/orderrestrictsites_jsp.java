package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag;
import com.follett.fsc.destiny.client.common.JSPHelper;
import org.apache.struts.util.ResponseUtils;
import java.util.List;
import com.follett.fsc.destiny.client.cataloging.servlet.OrderRestrictSitesForm;
import com.follett.fsc.destiny.session.cataloging.data.OrderDistrictSitesValue;
import com.follett.fsc.destiny.entity.ejb3.StateParticipatingSiteVO;
import com.follett.fsc.destiny.client.cataloging.servlet.OrdersListForm;
import com.follett.fsc.common.consortium.UserContext;

public final class orderrestrictsites_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fuseArchive_005fsubmitOnChange_005fselectedDistrictContext_005fprinterFriendly_005fname_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fuseArchive_005fsubmitOnChange_005fselectedDistrictContext_005fprinterFriendly_005fname_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fuseArchive_005fsubmitOnChange_005fselectedDistrictContext_005fprinterFriendly_005fname_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

    OrderRestrictSitesForm form = (OrderRestrictSitesForm)request.getAttribute(OrderRestrictSitesForm.FORM_NAME);
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n<script type=\"text/javascript\">\r\nfunction submitOnClick() {\r\n\tdocument.");
      out.print(OrderRestrictSitesForm.FORM_NAME);
      out.write(".submit();   \r\n}\r\n</script>\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/orderrestrictsites.jsp(35,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleorderrestrictsitesform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderrestrictsites.jsp(37,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(OrderRestrictSitesForm.TABLE_MAIN );
          // /cataloging/orderrestrictsites.jsp(37,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#c0c0c0");
          // /cataloging/orderrestrictsites.jsp(37,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(OrdersListForm.TAB_RESTRICTED_SITES);
          // /cataloging/orderrestrictsites.jsp(37,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          // /cataloging/orderrestrictsites.jsp(37,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\">Order Restrictions - Sites</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\" align=\"center\">\r\n            <table id=\"");
              out.print(OrderRestrictSitesForm.TABLE_HEADER );
              out.write("\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n            \r\n            <tr>\r\n                <td width=\"1%\" class=\"ColRowBold\" align=\"center\" nowrap>\r\n                ");
              //  base:selectDistrict
              com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fuseArchive_005fsubmitOnChange_005fselectedDistrictContext_005fprinterFriendly_005fname_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
              _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderrestrictsites.jsp(47,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setName(OrderRestrictSitesForm.FIELD_SELECTED_CONTEXT );
              // /cataloging/orderrestrictsites.jsp(47,16) name = useArchive type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setUseArchive(false);
              // /cataloging/orderrestrictsites.jsp(47,16) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(true);
              // /cataloging/orderrestrictsites.jsp(47,16) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(false);
              // /cataloging/orderrestrictsites.jsp(47,16) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setSubmitOnChange(new Boolean(true));
              // /cataloging/orderrestrictsites.jsp(47,16) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getSelectedContext() );
              // /cataloging/orderrestrictsites.jsp(47,16) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setPrinterFriendly(false);
              // /cataloging/orderrestrictsites.jsp(47,16) name = includeStatewide type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setIncludeStatewide(true);
              int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
              if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fuseArchive_005fsubmitOnChange_005fselectedDistrictContext_005fprinterFriendly_005fname_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fuseArchive_005fsubmitOnChange_005fselectedDistrictContext_005fprinterFriendly_005fname_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
              out.write("\r\n                </td>\r\n            </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\r\n    ");
 if (! form.isSelectADistrict()) { 
              out.write("   \r\n        <tr>\r\n            <td align=\"right\" class=\"ColRowBold\">");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderrestrictsites.jsp(65,49) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(OrderRestrictSitesForm.PARAM_RESTRICTED);
              // /cataloging/orderrestrictsites.jsp(65,49) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setOnclick("submitOnClick()");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("<label for=\"");
              out.print(OrderRestrictSitesForm.PARAM_RESTRICTED);
              out.write("\">Show only restricted sites</label></td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n    ");
 if (form.getListDistricts() != null && !form.getListDistricts().isEmpty()) { 
              out.write("\r\n        <tr>\r\n            <td>");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        \r\n        <tr>\r\n            <td>\r\n                <table id=\"");
              out.print(OrderRestrictSitesForm.TABLE_DETAIL );
              out.write("\" width=\"100%\" cellpadding=\"2\" cellspacing=\"0\">\r\n                    ");
  List<OrderDistrictSitesValue> distList = form.getListDistricts();
                        if(! form.isSelectADistrict()){
                            for (int i = 0; i < distList.size(); i++) {
                                OrderDistrictSitesValue val = distList.get(i);
                                List<StateParticipatingSiteVO> siteList = val.getSiteList();
                            if  (form.isStateWide()) { 
              out.write("\r\n                                <tr>\r\n                                    <td class = \"TableHeading\" colspan = \"2\">");
              out.print( val.getDistrictName() );
              out.write("</td>\r\n                                </tr>\r\n                            ");
 } 
              out.write("\r\n                            <tr>\r\n                                <td class=\"SmallColHeading\">Site</td>\r\n                                <td class=\"SmallColHeading\" align=\"center\">Restricted</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");

                                    request.setAttribute("flipper", Boolean.FALSE);
                                    for (int j = 0; j < siteList.size(); j++) {
                                        StateParticipatingSiteVO rec = siteList.get(j);
                                        
                            
              out.write("\r\n                            ");
              //  base:flipper
              com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
              _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderrestrictsites.jsp(98,28) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fflipper_005f0.setKey("flipper");
              int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
              if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                <td class=\"ColRow\" width=\"50%\">\r\n                                    <a name=\"");
                  out.print(OrderRestrictSitesForm.ANCHOR_BASE);
                  out.print(rec.getStateSiteID());
                  out.write("\"></a>\r\n                                    ");
                  out.print( JSPHelper.filterHtmlAndNulls(rec.getSiteName()) );
                  out.write("</td>\r\n                                <td align=\"center\">\r\n                                    ");
 if(rec.isRestrictOrder()){ 
                  out.write("\r\n                                        ");
                  if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005fflipper_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td align=\"right\">\r\n                                    ");
 if(!rec.isRestrictOrder()){ 
                  out.write("\r\n                                        ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
                  // /cataloging/orderrestrictsites.jsp(109,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setId((OrderRestrictSitesForm.LINK_RESTRICT_SITE_PREFIX + rec.getStateSiteID()) );
                  // /cataloging/orderrestrictsites.jsp(109,40) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setHref(form.getRestrictLink(rec.getStateSiteID(),true) );
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                      // /cataloging/orderrestrictsites.jsp(110,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/restrict.gif");
                      // /cataloging/orderrestrictsites.jsp(110,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlt( OrderRestrictSitesForm.ALT_RESTRICT_SITE );
                      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                      out.write("\r\n                                        ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                                    ");
 } else { 
                  out.write("\r\n                                        ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
                  // /cataloging/orderrestrictsites.jsp(113,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setId((OrderRestrictSitesForm.LINK_UNRESTRICT_SITE_PREFIX + rec.getStateSiteID()) );
                  // /cataloging/orderrestrictsites.jsp(113,40) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setHref(form.getRestrictLink(rec.getStateSiteID(),false) );
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                      // /cataloging/orderrestrictsites.jsp(114,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/unrestrict.gif");
                      // /cataloging/orderrestrictsites.jsp(114,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setAlt( OrderRestrictSitesForm.ALT_UNRESTRICT_SITE );
                      int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                      if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                      out.write("\r\n                                        ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                </td>\r\n                            ");
                  int evalDoAfterBody = _jspx_th_base_005fflipper_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fflipper_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
              out.write("\r\n                            ");
 } 
              out.write("\r\n                        ");
  if  (form.isStateWide() && distList.size() < i-1) { 
              out.write("\r\n                        <tr>\r\n                            <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                        </tr>\r\n                        ");
 }
                        }
              out.write("\r\n                ");
 } 
              out.write("\r\n                </table>\r\n                \r\n            </td>\r\n        </tr>\r\n    ");
 } else if (! form.isSelectADistrict()) { 
              out.write("\r\n        <tr>\r\n            <td>");
              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"center\" class=\"ColRowBold\">Based on your selection, there is nothing to display.</td>\r\n        </tr>\r\n    ");
 } 
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("  \r\n\r\n");
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /cataloging/orderrestrictsites.jsp(23,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fflipper_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
    // /cataloging/orderrestrictsites.jsp(104,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/lock.gif");
    // /cataloging/orderrestrictsites.jsp(104,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Restricted");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }
}
