Class.create(BaseController,{init:function(){var a=null;if(this.data.httpsLogin){a=this.loadLoginDialog.bind(this)}else{if(this.data.httpsCreateAccount){a=this.loadCreateAccountDialog.bind(this)}}if(a){a.defer()}},registerEvents:function(){},isSecure:function(){return true},redirectOnClose:function(){window.location=this.data.redirect},createModal:function(){this.modalId=SearchBoxController_DIV_LOGIN_MODULE_OUTER;this.modalContentDivId="loginContent";var a={width:"",id:this.modalId,zIndex:"50000",contentDivId:this.modalContentDivId,hideOnOutsideClick:"true"};return new ModalDialog(a)},loadLoginDialog:function(){var a=this.createModal();Event.observe(a.contentDiv,"modal:close",this.redirectOnClose.bind(this));DAO.load({endpoint:"LoginController.LoginDialog",modal:a})},loadCreateAccountDialog:function(){var a=this.createModal();Event.observe(a.contentDiv,"modal:close",this.redirectOnClose.bind(this));DAO.load({endpoint:"CreateAccountController.CreateAccountDialog",modal:a},false)}});