Class.create(BaseController,{init:function(){var a=Registry.lookup("RecommendationController.RecommendationDialog");a.autocompleter.ajaxInProgress=false;a.autocompleter.stopIndicator();a.autocompleter.patronData=this.data.patrons;if(!a.autocompleter.hasFocus&&a.autocompleter.patronData&&a.autocompleter.patronData.length>0){if(a.autocompleter.patronData[0].patronID>=0){a.autocompleter.myUpdateElement(0)}}a.autocompleter.stopIndicator();a.showSuggestions()},registerEvents:function(){}});