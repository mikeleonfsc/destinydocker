package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.URLHelper;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.session.cataloging.remote.data.GlobalUpdateTextbookJobParams;
import com.follett.fsc.destiny.client.cataloging.servlet.GlobalUpdateTextbooksForm;
import com.follett.fsc.destiny.client.cataloging.servlet.UpdateTitlesNavigationForm;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.Globals;
import org.apache.struts.taglib.TagUtils;
import org.apache.struts.action.ActionMessages;

public final class globalupdatetextbooks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005falwaysAddSelectAList_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005falwaysAddSelectAList_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005falwaysAddSelectAList_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    GlobalUpdateTextbooksForm form = (GlobalUpdateTextbooksForm)request.getAttribute( GlobalUpdateTextbooksForm.FORM_NAME );

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/globalupdatetextbooks.jsp(28,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleglobalupdatetextbooks.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <input type=\"hidden\" name=\"");
          out.print(GlobalUpdateTextbooksForm.PARAM_DROP_DOWN_CHANGED );
          out.write("\" value='");
          out.print(""+GlobalUpdateTextbooksForm.VALUE_NOT_CHANGED );
          out.write("'>\r\n");

    ActionMessages errors = TagUtils.getInstance().getActionMessages(pageContext, Globals.ERROR_KEY);
    if ((errors == null || errors.size() == 0) && URLHelper.buttonWasPressed(request, GlobalUpdateTextbooksForm.BUTTON_UPDATE)) { 

          out.write("\r\n    ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/globalupdatetextbooks.jsp(34,4) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n        <td valign=\"baseline\" class=\"Error\">\r\n            <p align=\"center\">This process cannot be reversed.</p>\r\n            <p align=\"center\">Are you sure you want to proceed?</p>\r\n            <div align=\"center\">\r\n                ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /cataloging/globalupdatetextbooks.jsp(41,16) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonYesName(GlobalUpdateTextbooksForm.BUTTON_CONFIRM_YES);
              // /cataloging/globalupdatetextbooks.jsp(41,16) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonNoName(GlobalUpdateTextbooksForm.BUTTON_CONFIRM_NO);
              int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
              if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
              out.write("\r\n            </div>\r\n        </td>\r\n    </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write('\r');
          out.write('\n');

    }

          out.write('\r');
          out.write('\n');
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/globalupdatetextbooks.jsp(52,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(GlobalUpdateTextbooksForm.TABLE_UPDATE_TITLES);
          // /cataloging/globalupdatetextbooks.jsp(52,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(GlobalUpdateTextbooksForm.TAB);
          // /cataloging/globalupdatetextbooks.jsp(52,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(UpdateTitlesNavigationForm.gimmeTabs());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n      <td class=\"TableHeading\" colspan=\"2\" >\r\n         Update Textbook Titles...\r\n      </td>\r\n    </tr>\r\n    <tr>\r\n    <td class=\"ColRowBold tdAlignRight\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Based on</td>\r\n        <td>\r\n            ");
              out.print( form.gimmeBasedOnDropdown() );
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n    <td colspan=\"2\" width=\"100%\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write(" </td>\r\n    </tr>\r\n    ");
 if (form.getBasedOnOption()== GlobalUpdateTextbookJobParams.BASED_ON_GLOBAL_CRITERIA){ 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Whose</td>\r\n            <td class=\"ColRowBold\" >");
              out.print(form.gimmeOptionDropDown(true) );
              out.write("&nbsp;is&nbsp;\r\n               ");
              out.print(form.gimmeOptionEditControl(true) );
              out.write("\r\n            </td>\r\n        </tr>\r\n    ");
} else { 
              out.write("\r\n        <tr>\r\n        <td valign=\"bottom\" class=\"ColRowBold tdAlignRight\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Named</td>\r\n        <td>\r\n        ");
              //  base:myListSelect
              com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag _jspx_th_base_005fmyListSelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag) _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005falwaysAddSelectAList_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag.class);
              _jspx_th_base_005fmyListSelect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmyListSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/globalupdatetextbooks.jsp(81,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmyListSelect_005f0.setName(GlobalUpdateTextbooksForm.FIELD_FROM_SELECTED_LISTID);
              // /cataloging/globalupdatetextbooks.jsp(81,8) name = selectedMyListID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmyListSelect_005f0.setSelectedMyListID(form.getFromSelectedListID() );
              // /cataloging/globalupdatetextbooks.jsp(81,8) name = prompt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmyListSelect_005f0.setPrompt("");
              // /cataloging/globalupdatetextbooks.jsp(81,8) name = alwaysAddSelectAList type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmyListSelect_005f0.setAlwaysAddSelectAList(true);
              // /cataloging/globalupdatetextbooks.jsp(81,8) name = publicList type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmyListSelect_005f0.setPublicList(new Boolean(false));
              // /cataloging/globalupdatetextbooks.jsp(81,8) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmyListSelect_005f0.setSubmitOnChange(new Boolean(false));
              int _jspx_eval_base_005fmyListSelect_005f0 = _jspx_th_base_005fmyListSelect_005f0.doStartTag();
              if (_jspx_th_base_005fmyListSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005falwaysAddSelectAList_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005falwaysAddSelectAList_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
              out.write("\r\n         <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/buttons/large/viewlist.gif"));
              out.write("' border=\"0\" align=\"absbottom\"\r\n                               alt=\"");
              out.print( GlobalUpdateTextbooksForm.ALT_VIEW_LIST );
              out.write("\"\r\n                               name=\"");
              out.print( GlobalUpdateTextbooksForm.BUTTON_VIEW_LIST );
              out.write("\" />\r\n        </td>\r\n        </tr>\r\n    ");
} 
              out.write("\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Change</td>\r\n        <td class=\"ColRowBold\" >");
              out.print(form.gimmeOptionDropDown(false) );
              out.write("&nbsp;to&nbsp;\r\n           ");
              out.print(form.gimmeOptionEditControl(false) );
              out.write("\r\n        </td>\r\n    </tr>\r\n\r\n    <tr valign=\"top\">\r\n        <td valign=\"top\" colspan=\"2\" align=\"center\" class=\"ColRowBold\">\r\n            ");
              out.print( GenericForm.getLastBackupDisplayMsg(true) );
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n      <td align=\"center\" colspan=\"2\">\r\n      &nbsp;\r\n      </td>\r\n    </tr>\r\n\r\n    <tr>\r\n      <td align=\"center\" colspan=\"2\">\r\n        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/globalupdatetextbooks.jsp(115,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/preview2.gif");
              // /cataloging/globalupdatetextbooks.jsp(115,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(GlobalUpdateTextbooksForm.BUTTON_PREVIEW );
              // /cataloging/globalupdatetextbooks.jsp(115,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt("Preview");
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n        ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/globalupdatetextbooks.jsp(119,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/update.gif");
              // /cataloging/globalupdatetextbooks.jsp(119,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName(GlobalUpdateTextbooksForm.BUTTON_UPDATE );
              // /cataloging/globalupdatetextbooks.jsp(119,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt("Update Textbooks");
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("\r\n      </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
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
      out.write("\r\n <SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n    <!--\r\n        function submitTheForm(dropdownChanged) {\r\n            document.");
      out.print(GlobalUpdateTextbooksForm.FORM_NAME);
      out.write('.');
      out.print(GlobalUpdateTextbooksForm.PARAM_DROP_DOWN_CHANGED);
      out.write(".value = dropdownChanged;\r\n            document.");
      out.print(GlobalUpdateTextbooksForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n    // -->\r\n    </SCRIPT>\r\n");
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
    // /cataloging/globalupdatetextbooks.jsp(27,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
}
