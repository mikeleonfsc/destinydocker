Class.create(BaseController,{init:function(){this.rating=0;this.modal.show();this.rateLabel=MessageHelper.format("reviewController_rateThisTitle");var h=null;var a=null;var c=null;if(this.data.bibID&&this.data.shelfNumber>=0){var f=Registry.lookup("MyQuestShelfController.Loader");for(i=0;i<f.data.data.dateGroups.length;i++){var g=f.data.data.dateGroups[i];for(j=0;j<g.items.length;j++){var k=g.items[j];if(k.bibID==this.data.bibID&&k.shelfNumber==this.data.shelfNumber){h=k.title;a=k.bibTypeDescription;c=k.miniBibTypeIconURL;break}}}this.bibID=this.data.bibID;this.dcpiRecordGUID=this.data.dcpiRecordGUID}else{var b=Registry.lookup("TitleDetailsController.TitleDetails");if(b){h=b.getTitle();a=b.getBibTypeDescription();c=b.getMiniBibTypeIconURL();this.bibID=b.getBibID()}else{b=Registry.lookup("TitleDetailsController.DCPITitleDetails");if(b){h=b.getTitle();a=b.data.typeDescription;c=b.data.typeIcon;this.dcpiRecordGUID=b.data.dcpiRecordGUID}}}var d=new Element("img",{alt:a,title:a,height:16,border:0,width:20,src:c});
var e=new Element("span");e.update(h);this.elementMap.get(ReviewController_DIV_ADD_REVIEW_TITLE).insert(d);this.elementMap.get(ReviewController_DIV_ADD_REVIEW_TITLE).insert(e)},registerEvents:function(){Event.observe(this.elementMap.get(ReviewController_BUTTON_ADD_REVIEW_SAVE),"mousedown",this.saveReview.bind(this));Event.observe(this.elementMap.get(ReviewController_BUTTON_ADD_REVIEW_CLOSE),"mousedown",this.closeDialog.bind(this));for(var a=1;a<=5;a++){Event.observe(this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+a),"mouseover",this._doStarOver.bind(this,a));Event.observe(this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+a),"mouseout",this._doStarOut.bind(this));Event.observe(this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+a),"mousedown",this._doSetRating.bind(this,a))}},saveReview:function(b){this.elementMap.get(ReviewController_DIV_ADD_REVIEW_SAVE_AREA).hide();var a=this.elementMap.get(ReviewController_FIELD_ADD_REVIEW_COMMENT);var c="";if(Object.isElement(a)){c=a.getValue()
}if(!DAO.load({endpoint:"ReviewController.ReviewStash",method:"post"},this.bibID,this.dcpiRecordGUID,this.rating,c)){this.elementMap.get(ReviewController_DIV_ADD_REVIEW_SAVE_AREA).show()}},closeDialog:function(){this.modal.closeDialog()},_doStarOver:function(b){this.redFont=this.stickyRating;for(i=1;i<=b;i++){var c=this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+i);if(c){c.removeClassName("rating_large_half");c.removeClassName("rating_large_empty");c.addClassName("rating_large_full")}}for(i=(b+1);i<=5;i++){var c=this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+i);if(c){c.removeClassName("rating_large_half");c.removeClassName("rating_large_full");c.addClassName("rating_large_empty")}}var a=this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT);a.style.color="black";if(b==1){a.update(MessageHelper.format("reviewController_poor"))}else{if(b==2){a.update(MessageHelper.format("reviewController_fair"))}else{if(b==3){a.update(MessageHelper.format("reviewController_ok"))
}else{if(b==4){a.update(MessageHelper.format("reviewController_good"))}else{if(b==5){a.update(MessageHelper.format("reviewController_awesome"))}else{a.update(MessageHelper.format("reviewController_rateThisTitle"));a.style.color="#CC0000"}}}}}},_doStarOut:function(){for(i=1;i<=this.rating;i++){var a=this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+i);if(a){a.removeClassName("rating_large_half");a.removeClassName("rating_large_empty");a.addClassName("rating_large_full")}}for(i=this.rating+1;i<=5;i++){var a=this.elementMap.get(ReviewController_DIV_ADD_REVIEW_STAR_PREFIX+i);if(a){a.removeClassName("rating_large_half");a.removeClassName("rating_large_full");a.addClassName("rating_large_empty")}}this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT).update(this.rateLabel);var b="black";if(this.rateLabel==MessageHelper.format("reviewController_rateThisTitle")){b="#CC0000"}this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT).style.color=b},_doSetRating:function(a){this.rating=a;
this.rateLabel=this.elementMap.get(ReviewController_SPAN_ADD_REVIEW_RATING_TEXT).innerHTML},showError:function(a){this.elementMap.get(ReviewController_DIV_ADD_REVIEW_ERRORS).update(a);this.elementMap.get(ReviewController_DIV_ADD_REVIEW_ERRORS).show();this.elementMap.get(ReviewController_DIV_ADD_REVIEW_SAVE_AREA).show()}});