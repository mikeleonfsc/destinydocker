Class.create(BaseController,{init:function(){var b=Registry.lookup("TitleDetailsController.TitleDetails");b.updateModel(this.data.titleDetails);if(this.data.errorMessage){b.populateEBookErrorMessage(this.data.errorMessage);this.closeDialog()}else{this.ebookURL=this.data.ebookURL;var a=new Element("input",{id:TitleDetailsController_BUTTON_DOWNLOAD_EBOOK,type:"button",value:this.data.downloadEbookValue});this.elementMap.get("checkoutNow").update(a);this.modal.show()}this.refreshElements()},registerEvents:function(){if(!this.data.errorMessage){Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_EBOOK_CHECKOUT_CLOSE),"mousedown",this.closeDialog.bind(this));Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_DOWNLOAD_EBOOK),"click",this.checkoutEbook.bind(this));Event.observe(this.elementMap.get(TitleDetailsController_BUTTON_TITLE_DETAILS_CHECKOUT_EBOOK_LATER),"click",this.closeDialog.bind(this))}},closeDialog:function(){this.modal.closeDialog()},checkoutEbook:function(){var a=$H({url:this.ebookURL});
window.open("/quest/servlet/handleurlredirectorform.do;jsessionid="+this.data.sessionID+"?"+a.toQueryString(),"checkoutEbook");this.closeDialog()}});