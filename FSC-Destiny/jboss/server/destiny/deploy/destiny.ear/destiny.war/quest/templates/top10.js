/* top10.js */
Class.create(BaseController, {
	init: function() {
		this.showLoading();
		DAO.load({endpoint: "Top10Controller.Top10", container: this.elementMap.get(Top10Controller_DIV_TOP10_OUTER)});
	},
	
	registerEvents: function() {		
	},
	
	showLoading: function ()  {
		this.elementMap.get(Top10Controller_DIV_LOADING).show();
	}, 
	
	hideLoading: function () {
		this.elementMap.get(Top10Controller_DIV_LOADING).hide();
		this.elementMap.get(Top10Controller_DIV_TOP10_OUTER).show();
	}
		
});