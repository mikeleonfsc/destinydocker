Class.create(BaseController,{init:function(){var a=Registry.lookup("MyQuestUpdatesController.Loader");if(!a){a=Registry.lookup("MyQuestInboxController.Loader")}a.removeRecommendationCallback(this.data)},registerEvents:function(){}});