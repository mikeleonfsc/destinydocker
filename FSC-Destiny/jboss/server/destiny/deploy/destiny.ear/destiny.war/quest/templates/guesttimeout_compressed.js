Class.create(BaseController,{init:function(){this.timeout=this.data.timeout;this.redirect=this.data.redirect;this.sessionTimeout=new InactivityRedirectTimeout(this.timeout,this.redirect);this.sessionTimeout.stopTimeout()},startTimeout:function(){if(!this.started){this.sessionTimeout.startTimeout();this.sessionTimeout.startResponder();this.started=true}},stopTimeout:function(){this.sessionTimeout.stopTimeout();this.started=false}});