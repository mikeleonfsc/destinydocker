package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs;
import com.follett.fsc.destiny.util.URLHelper;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.client.backoffice.servlet.InventoryStateCompletedDetailsForm;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.MessageHelper;

public final class inventorystatecompleteddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
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

    com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO _jspx_siteRow_1 = null;
    java.lang.Integer _jspx_flipper2_1 = null;

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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    InventoryStateCompletedDetailsForm form = (InventoryStateCompletedDetailsForm)request.getAttribute(InventoryStateCompletedDetailsForm.FORM_NAME);
    boolean atState = (form.getStore().isStateContext() );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/inventorystatecompleteddetails.jsp(30,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleinventorystatecompleteddetailsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystatecompleteddetails.jsp(32,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
          // /backoffice/inventorystatecompleteddetails.jsp(32,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(InventoryStateCompletedDetailsForm.TABLE_MAIN);
          // /backoffice/inventorystatecompleteddetails.jsp(32,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n<tr>\r\n    <td class=\"TableHeading\" colspan=\"6\">\r\n        ");
              out.print(ResponseUtils.filter(form.getName()) );
              out.print( MessageHelper.formatMessage("inventorystatecompleteddetails_Completed", form.getDateCompleted()) );
              out.write("\r\n    </td>\r\n</tr>\r\n<!-- District Row Header if we have data -->\r\n");

if(form.getListOfInventories().size() > 0 ){

              out.write('\r');
              out.write('\n');
if (atState ) { 
              out.write("\r\n<tr>\r\n    <td class=\"SmallColHeading\" valign=\"bottom\" colspan=\"2\">\r\n        ");
              out.print( form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_NAME, "District"));
              out.write("\r\n    </td>\r\n    <td class=\"SmallColHeading\" valign=\"bottom\">\r\n        ");
              out.print( form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_ACCOUNTED_FOR, "Accounted For"));
              out.write("\r\n    </td>\r\n    <td class=\"SmallColHeading\" valign=\"bottom\">\r\n        ");
              out.print( form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_UNACCOUNTED_FOR, "Unaccounted For"));
              out.write("\r\n    </td>\r\n    <td class=\"SmallColHeading\" valign=\"bottom\">\r\n        ");
              out.print( form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_CONSUMABLES_ADJUSTED, "Consumables Adjusted"));
              out.write("\r\n    </td>\r\n    <td class=\"SmallColHeading\" valign=\"bottom\">\r\n        &nbsp;\r\n    </td>\r\n</tr>\r\n");
} 
              out.write("\r\n<!-- If district row has data iterate against it -->\r\n");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystatecompleteddetails.jsp(62,0) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
              // /backoffice/inventorystatecompleteddetails.jsp(62,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("districtRow");
              // /backoffice/inventorystatecompleteddetails.jsp(62,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName(InventoryStateCompletedDetailsForm.FORM_NAME);
              // /backoffice/inventorystatecompleteddetails.jsp(62,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("listOfInventories");
              // /backoffice/inventorystatecompleteddetails.jsp(62,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.InventoryProgressDistrictRowVO");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                com.follett.fsc.destiny.session.backoffice.data.InventoryProgressDistrictRowVO districtRow = null;
                java.lang.Integer flipper = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                districtRow = (com.follett.fsc.destiny.session.backoffice.data.InventoryProgressDistrictRowVO) _jspx_page_context.findAttribute("districtRow");
                flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                do {
                  out.write("\r\n    ");
if ( atState ) { 
                  out.write("\r\n        <tr ");
                  out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                  out.write(" >\r\n            <td class=\"ColRowBold\" valign=\"top\" colspan=\"2\">");
                  out.print("<a name=" + districtRow.getAnchor() + "></a>" + ResponseUtils.filter( districtRow.getDistrictName() ) );
                  out.write("</td>\r\n                                        \r\n            <td class=\"ColRow\" valign=\"top\">\r\n            ");
                  out.print(districtRow.getFormattedTotalAccountedFor() );
                  out.write("\r\n            </td>\r\n            <td class=\"ColRow\" valign=\"top\">\r\n            ");
                  out.print(districtRow.getFormattedTotalUnaccountedFor());
                  out.write("\r\n                ");
if(districtRow.anySiteBilled() ) { 
                  out.write("\r\n                <br>");
                  out.print( MessageHelper.formatMessage("inventorystatecompleteddetails_Billed", districtRow.getFormattedTotalEstimatedBillForMarkedLostSitesOnly()) );
                  out.write("\r\n                ");
 } 
                  out.write("\r\n            </td>\r\n            <td class=\"ColRow\" valign=\"top\">\r\n            ");
                  out.print(districtRow.getFormattedTotalConsumablesAdjusted());
                  out.write("\r\n            </td>\r\n            <td class=\"SmallColRow\" valign=\"top\">\r\n            ");

            if(districtRow.getDistrictName().equals(form.getExpandedDistrictName())){
                //show less
                
                  out.write("\r\n            <a class=\"DetailLink\" href='");
                  out.print(form.getLinkToForm(true, false) + "#" + districtRow.getAnchor());
                  out.write('\'');
                  out.write('>');
                  out.print( MessageHelper.formatMessage("inventorystatecompleteddetails_ShowLess") );
                  out.write("&nbsp;<img src='");
                  out.print(UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showless.gif"));
                  out.write("' border=\"0\"></a> \r\n                ");
 
            }else{
                //show more
                
                  out.write("\r\n            <a class=\"DetailLink\" href='");
                  out.print(form.getLinkToForm(true, false) +  "&expandedDistrictName=" + URLHelper.encodeURL(districtRow.getDistrictName()) + "#" + districtRow.getAnchor());
                  out.write('\'');
                  out.write('>');
                  out.print( MessageHelper.formatMessage("inventorystatecompleteddetails_ShowMore") );
                  out.write("&nbsp;<img src='");
                  out.print(UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showmore.gif"));
                  out.write("' border=\"0\"></a> \r\n                ");

            }
            
                  out.write("\r\n            </td>\r\n                                \r\n        </tr>\r\n     ");
} 
                  out.write("\r\n    <!-- if we're the expanded district, iterate through sites -->\r\n    \r\n    ");

        if(!atState || districtRow.getDistrictName().equals(form.getExpandedDistrictName())){
    
                  out.write("\r\n    <tr ");
                  out.print( ( (flipper.intValue() % 2 == 1)? "bgColor=\"#E8E8E8\"" : "" ));
                  out.write(" >\r\n        <td>&nbsp;</td>\r\n        <td class=\"SmallColHeading\" valign=\"bottom\">\r\n            ");
                  out.print( form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_NAME, "Site"));
                  out.write("\r\n        </td>\r\n        <td class=\"SmallColHeading\" valign=\"bottom\">\r\n            ");
                  out.print( form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_ACCOUNTED_FOR, "Accounted For"));
                  out.write("\r\n        </td>\r\n        <td class=\"SmallColHeading\" valign=\"bottom\">\r\n            ");
                  out.print( form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_UNACCOUNTED_FOR, "Unaccounted For"));
                  out.write("\r\n        </td>\r\n        <td class=\"SmallColHeading\" valign=\"bottom\">\r\n            ");
                  out.print( form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_CONSUMABLES_ADJUSTED, "Consumables Adjusted"));
                  out.write("\r\n        </td>\r\n        <td class=\"SmallColHeading\" valign=\"bottom\">\r\n            &nbsp;\r\n        </td>\r\n    </tr>\r\n    ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/inventorystatecompleteddetails.jsp(120,4) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setIndexId("flipper2");
                  // /backoffice/inventorystatecompleteddetails.jsp(120,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setId("siteRow");
                  // /backoffice/inventorystatecompleteddetails.jsp(120,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setName("districtRow");
                  // /backoffice/inventorystatecompleteddetails.jsp(120,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setProperty("listOfSites");
                  // /backoffice/inventorystatecompleteddetails.jsp(120,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO");
                  int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO siteRow = null;
                    java.lang.Integer flipper2 = null;
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f1.doInitBody();
                    }
                    siteRow = (com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO) _jspx_page_context.findAttribute("siteRow");
                    flipper2 = (java.lang.Integer) _jspx_page_context.findAttribute("flipper2");
                    do {
                      out.write("\r\n        <tr ");

            String bgColor = "";
            
            if( (1 & flipper2.intValue())==0){
                bgColor="bgColor=\"#E8E8E8\"";
            }
            //if the principal header is white... the subheader was changed to black so start the cycle in white
            if(flipper.intValue() % 2 == 1){
                bgColor = "";
            }    
            
            out.print(bgColor);
            
                      out.write(" >\r\n            <td class=\"ColRow\" bgColor=\"#FFFFFF\">&nbsp;</td>\r\n            <td class=\"ColRow\" valign=\"top\">");
                      out.print(ResponseUtils.filter( siteRow.getSiteName() ) );
                      out.write("</td>\r\n            <td class=\"ColRow\" valign=\"top\">");
                      out.print(form.gimmeFormattedNumber(siteRow.getApihValue().getAccountedFor()));
                      out.write("</td>\r\n            <td class=\"ColRow\" valign=\"top\">");
                      out.print(form.gimmeFormattedNumber(siteRow.getApihValue().getUnaccountedFor()));
                      out.write("<br>\r\n                ");
                      out.print(form.gimmeFormattedPrice(siteRow.getApihValue().getEstimatedBilling(), siteRow.getApihValue().getCurrencyUnitID()) );
                      out.write("\r\n            </td>\r\n            <td class=\"ColRow\" valign=\"top\">");
                      out.print(form.gimmeFormattedNumber(siteRow.getApihValue().getConsumablesAdjusted()));
                      out.write("</td>\r\n            <td class=\"SmallColHeading\" valign=\"top\">\r\n                ");
if ( Boolean.TRUE.equals(siteRow.getApihValue().getMarkedLost())) { 
                      out.write("\r\n                ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/inventorystatecompleteddetails.jsp(143,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setPage( "/backoffice/servlet/presentexamineinventoryform.do?useArchived=true&partialID=" + siteRow.getApihValue().getPartialID());
                      // /backoffice/inventorystatecompleteddetails.jsp(143,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setId(form.ID_PREFIX_EXAMINE + siteRow.getApihValue().getPartialID());
                      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                    ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                          // /backoffice/inventorystatecompleteddetails.jsp(144,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/examine.gif");
                          // /backoffice/inventorystatecompleteddetails.jsp(144,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f0.setAlt(InventoryStateCompletedDetailsForm.ALT_EXAMINE );
                          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                          out.write("\r\n                ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                      out.write("\r\n                ");
 } 
                      out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                      siteRow = (com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO) _jspx_page_context.findAttribute("siteRow");
                      flipper2 = (java.lang.Integer) _jspx_page_context.findAttribute("flipper2");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                  out.write("\r\n    ");
 } 
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  districtRow = (com.follett.fsc.destiny.session.backoffice.data.InventoryProgressDistrictRowVO) _jspx_page_context.findAttribute("districtRow");
                  flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write('\r');
              out.write('\n');

}else{


              out.write("\r\n<tr>\r\n    <td class=\"ColRow\" colspan=\"7\">");
              out.print( MessageHelper.formatMessage("inventorystatecompleteddetails_ThereAreNoInventoriesToDisplay") );
              out.write("</td>\r\n</tr>\r\n");

}

              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
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
      out.write("\r\n\r\n");
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
    // /backoffice/inventorystatecompleteddetails.jsp(22,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
