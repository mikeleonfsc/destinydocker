Class.create(BaseController,{init:function(){this.elementMap.get(BooklistWidgetController_DIV_BOOK_LIST).show();var a=Registry.lookup("BooklistSelectController.Widget");if(a){a.setBooklistValue(this.data.stickyListID)}},registerEvents:function(){Event.observe(this.elementMap.get(BooklistWidgetController_DIV_BOOK_LIST),"mousedown",this.showResourceList.bind(this));this.addDroppable(BooklistWidgetController_DIV_BOOK_LIST,null,this.addToBookList.bind(this),{top:"66px",left:"21px"})},showResourceList:function(){var b={width:"",id:ResourceListController_DIV_RESOURCE_LIST_WINDOW,zIndex:"10000",hideOnOutsideClick:"true"};var a=new ModalDialog(b);DAO.load({endpoint:"ResourceListController.Master",modal:a},null,"ResourceList",false)},addToBookList:function(b,a){var c=Registry.lookup("SearchTypeController.Selector");DAO.load({endpoint:"BooklistWidgetController.BooklistBookAdder",container:null},b?b:null,a?a:null,c.getSearchType(),null)},updateTitleCounts:function(a){this.elementMap.get(BooklistWidgetController_DIV_RESOURCE_LIST_TITLE_COUNT).update(MessageHelper.format("booklistWidgetController_titles",a))
},updateListName:function(a){this.elementMap.get(BooklistWidgetController_RESOURCE_LIST_NAME).update(a)}});