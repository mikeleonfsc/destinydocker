/* basecontroller.js */
var BaseController = Class.create({
	initialize: function() {
	},
	
	registerEvents: function(pageChange) {
		// abstract, need to override this
	},
	
	init: function(pageChange) {
		// abstract, need to override this
	},
	
	dataAppended: function(pageNumber) {
		// abstract, need to override this
	},
	
	_findElements: function() {
		var elementHash = new Hash();
		this._addDescendants(this.container, elementHash);
		this.elementMap = elementHash;
	},
	
	refreshElements: function() {
		this._findElements();
	},
	
	_addDescendants: function(root, elementHash) {
		if (root) {
			var descendants = root.immediateDescendants();
			var parentObj = this;
			descendants.each(function(child) {
				var elementID = child.readAttribute("id");
				if (elementID) {
					elementHash.set(elementID, child);
				}
				parentObj._addDescendants(child, elementHash);
			});
		}
	},
	
	fixIERenderingIssue: function(elementName) {
		var fixerFunc = function() {
			if (Object.isElement(this.elementMap.get(elementName))) {
				this.elementMap.get(elementName).hide();
				this.elementMap.get(elementName).show();
			}
		};
		
		var boundFixerFunc = fixerFunc.bind(this);
		boundFixerFunc.defer();
	},
	
	hide: function() {
		if (Object.isElement(this.container)) {
			this.container.hide();
		}
	},

	show: function() {
		if (Object.isElement(this.container)) {
			this.container.show();
		}
	},
	
	dispose: function() {
		try {
			this.hide();
			if (this.container){
				this.container.immediateDescendants().each(function(child) {
					child.remove();					
				});
			}
		} catch (e) {
			// element may or may not be around anymore, let's just be safe
		}
	},
	
	appendData: function(data) {
		this.pagedData.push(data);
		this.dataAppended(this.pagedData.length-1);
	},
	
	clearData: function() {
		this.pagedData = [];
		this.currentPage = null;
	},
	
	isLoaded: function() {
		return this.loaded;
	},
	
	render: function(name, options) {
		this.currentPage = 0;
		if (Object.isArray(this.data)) {
			this.pagedData = this.data;
			this.data = this.pagedData[this.currentPage];
		} else {
			this.pagedData = [this.data];
		}
		
		this.name = name;
		if(options.modal) {
			this.modal = options.modal;
			this.container = this.modal.contentDiv;
		} else {
			this.container = options.container;
		}
		
//		if (! this.modal || (this.modal.visible && Object.isElement(this.modal.contentDiv))) {
			// if we have a modal, but it has been closed, don't render
			this._renderPage(true);
//		}
	},
	
	_renderPage: function(initialLoad) {
		this.loaded = false;
		this.dispose();
		
		if (this.container) {
			var elementDOM = this._renderDataInTemplate();
			this.container.innerHTML = elementDOM;
			this._findElements();
			
		}
		this.show();
		
		this.init(! initialLoad);
		this.registerEvents(! initialLoad);
		this.loaded = true;
	},
	
	_animateRender: function(isNext) {
		this.pagingAnimationInProgress = true;
		
		var currentElement = this.container.firstDescendant();
		var newElement = new Element("div");

		var elementDOM = this._renderDataInTemplate();
		newElement.innerHTML = elementDOM;
		var callback = this._animateRenderCallback.bind(this, newElement);
		this.pagingAnimation(currentElement, newElement, isNext, callback);
	},
	
	_animateRenderCallback: function(newElement) {
		this._findElements();
		this.init(false);
		this.registerEvents(false);
		
		this.pagingAnimationInProgress = false;
	},
	
	_renderDataInTemplate: function() {
		if(this.template) {
			if(!this.data) {
				this.data = {};
			}
			var result = null;
			try {
				result = this.template.render(this.data);
			} catch (exception) {
				if (exception.fileName && exception.lineNumber && exception.message) {
					globalJSErrorHandler(exception.message, exception.fileName, exception.lineNumber);
				} else {
					globalJSErrorHandler(exception.message);
				}
			}
			return result;
		}
	},
	
	setPage: function(pageNumber) {
		if (! this.pagingInProgress && ! this.pagingAnimationInProgress) {
			this.pagingInProgress = true;
			if(this.currentPage != pageNumber || this.truncatedPages) {
				this.truncatedPages = false;
				if (this.pagedData && pageNumber >= 0 && pageNumber < this.pagedData.length) {
					var isNext = pageNumber > this.currentPage;
					this.currentPage = pageNumber;
					this.data = this.pagedData[this.currentPage];
					if (Object.isFunction(this.pagingAnimation)) {
						this._animateRender(isNext);
					} else {
						this._renderPage(false);
					}
				}
			}
		}
		this.pagingInProgress = false;
	},
	
	nextPage: function() {
		if ((this.currentPage + 1) < this.pagedData.length) {
			this.setPage(this.currentPage + 1);
		}
	},
	
	hasNextPage: function() {
		return this.pagedData && ((this.currentPage + 1) < this.pagedData.length);
	},
	
	previousPage: function() {
		if (this.currentPage > 0) {
			this.setPage(this.currentPage-1);
		}
	},
	
	hasPreviousPage: function() {
		return this.pagedData && (this.currentPage > 0);
	},
	
	truncatePagedData: function() {
		var temp = [];
		for (var i = 0; i < this.currentPage; i ++) {
			temp[i] = this.pagedData[i];
		}
		this.pagedData = temp;
		this.truncatedPages = true;
	},
	
	refreshPage: function(page) {
		this.currentPage = null;
		if (! page) {
			page = 0;
		}
		this.setPage(page);
	},
	
	getPageCount: function() {
		var count = 0;
		if (this.pagedData) {
			count = this.pagedData.length;
		}
		return count;
	},
	
	_config: function() {
		var cache = new Hash();
		
		BaseController.load = function(url) {
			if (cache.keys().indexOf(url) < 0) {
				// need to load from the server
				var request = new Ajax.Request(url, {
					method: "get",
					asynchronous: false
				});
				
				if (request.transport.status >= 200 && request.transport.status < 300) {
					var scriptText = request.transport.responseText;
					cache.set(url, eval(scriptText));
				}
			}
			
			var clazz = cache.get(url);
			var obj = null;
			try {
				obj = new clazz();
			} catch (exception) {
				if (exception.fileName && exception.lineNumber && exception.message) {
					globalJSErrorHandler(exception.message, exception.fileName, exception.lineNumber);
				} else {
					globalJSErrorHandler(exception.message);
				}
			}
			return obj;
		}
	},
	
/* utility methods below */
	focusSearch: function() {
		var searchBoxController = Registry.lookup("SearchBoxController.SearchBox");
		searchBoxController.focusSearchBox();
	},
	
	compareTemplate: function(template1, template2) {
		// sometimes we have code that verifies which template we are currently rendering in the controller.
		// because of MD5/cacheblasting/etc., this function will compare the filename portions instead of the whole string
		return this._getFilenameFromTemplate(template1) == this._getFilenameFromTemplate(template2);
	},
	
	_getFilenameFromTemplate: function(template) {
		var result = template;
		
		var lastSlash = result.lastIndexOf("/");
		if (lastSlash >= 0) {
			result = result.substring(lastSlash + 1);
		}
		
		var firstPeriod = result.indexOf(".");
		if (firstPeriod >= 0) {
			result = result.substring(0, firstPeriod);
		}
		
		return result;
	},
	
/* drag and drop methods below */
	addDraggable: function(container, bibID, dcpiRecordGUID,containerToRaise, isWebPath, isDCPI) {
		$j("#" + container).draggable({
			revert: 'invalid', 
			helper: 'clone', 
			zIndex: 1000,
			start: this.startDrag.bind(this, container, bibID, dcpiRecordGUID, containerToRaise, isWebPath, isDCPI),
			cursorAt: {left: 25, top: 25},
			stop: this.endDrag.bind(this, containerToRaise),
			scroll: false
		});
	},
	
	addDroppable: function(container, accept, dropFunction, dropStyle, activeClass) {
		if (! accept) {
			accept = ".ui-draggable";
		}
    	$j("#" + container).droppable({
    		accept: accept,
    		activeClass: activeClass,
    		drop: function(event, ui) {
    			var clone = $j(ui.helper).clone();
    			clone.css(dropStyle);
    			clone.attr("id", "droppedClone");
    			$j(this).append(clone);
    			dropFunction(ui.helper.bibID, ui.helper.dcpiRecordGUID);
    			new Effect.Shrink('droppedClone', {duration:0.5, afterFinish: 
    				function(){
    					$("droppedClone").remove();
    				}
    			});
    		}
    	});
	},
	
    startDrag: function(container, bibID, dcpiRecordGUID, containerToRaise, isWebPath, isDCPI, event, ui) {
    	$('content-outer').setStyle({zIndex:'10000'});
    	
    	var results = $$(".searchResult");
    	if(results && results.length > 0) {
    		results.each(function(element){element.removeClassName("high-zindex")});
    	}
    	
    	if(containerToRaise) {
    		$(containerToRaise).setStyle({zIndex:'10000'});
    	} else {
    		var resultParents = ui.helper.parents(":.searchResult");
    		if(resultParents && resultParents.length > 0) {
    			var parent = resultParents[0];
    			parent.addClassName("high-zindex");
    		}
    	}
    	
    	var element = ui.helper.children(":first");
    	if(isDCPI) {
    		element.addClass("defaultDCPIImage");
    		element.addClass("defaultDCPIImage50");
    	} else if(!isWebPath) {
    		element.addClass("defaultTitleImage");
    		element.addClass("defaultTitleImage50");
    	} else { //webpath
    		element = element.children(":first");
    		element.addClass("defaultWebPathImage");
    		element.addClass("defaultWebPathImage50");
    	}
    	ui.helper.bibID = bibID;
    	ui.helper.dcpiRecordGUID = dcpiRecordGUID;
    	var hoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
    	hoverMaster.disable();
    },

    endDrag: function(containerToRaise, event, ui) {
    	$('content-outer').setStyle({zIndex:""});
    	if(containerToRaise) {
    		$(containerToRaise).setStyle({zIndex:""});
    	} else {
    		var resultParents = ui.helper.parents(":.searchResult");
    		if(resultParents && resultParents.length > 0) {
    			var parent = resultParents[0];
    			parent.removeClassName("high-zindex");
    		}
    	}
    	var hoverMaster = Registry.lookup("HoverMasterController.HoverMaster");
    	hoverMaster.enable();
    }
});

new BaseController()._config();/* dao.js */
var DataAccessObject = Class.create({
	initialize: function() {
		this.bootstrapQueue = [];
		this.lockHash = new Hash();
	},

	load: function(options) {
		var result = false;
		
		if (! options.method) {
			options.method = "get";
		}
		
		if (QuestBootstrap.isBootstrapInProgress() || PostLoadBootstrapper.isBootstrapInProgress()) {
			this.bootstrapQueue.push(arguments);
		} else if(!this.lockHash.get(options.endpoint)) {
			var parameters = new Hash();
			for (var i=1; i < arguments.length; i++) {
				var val = arguments[i];
				if (Object.isArray(val)) {
					val = val.join(",");
				}
				parameters.set("arg" + (i-1), val);
			}
			parameters.set("endpointName", options.endpoint);
			parameters.set("d", window.debugMode);
			parameters.set("cb", new Date().getTime());
			
			var daoURL = null;
			var secureLogin = Registry.lookup("LoginController.SecureLoginBootstrap")
			if (secureLogin && secureLogin.isSecure()) {
				daoURL = "/quest/servlet/ajaxsecuredaoform.do";
			} else {
				daoURL = "/quest/servlet/ajaxdaoform.do";
			}
			
			var request = new Ajax.Request(daoURL, {
				method: options.method,
				parameters: parameters.toObject(),
				onSuccess: DAO._successHandler.curry(options),
				onException: DAO._exceptionHandler
			});
			
			if (window.fastClickTimeout > 0) {
				this.lockHash.set(options.endpoint, request);
				//anti-spam.  We only allow the same ajax call once per second.
				this.clearLock.bind(this, options).delay(window.fastClickTimeout);
			}
			result = true;
		}
		
		if (! result && options.modal && Object.isFunction(options.modal.closeDialog)) {
			options.modal.closeDialog();
		}
		return result;
	},
	
	clearLock: function(options) {
		this.lockHash.unset(options.endpoint);
	},
	
	flushBootstrapQueue: function() {
		this.bootstrapQueue.each(function(args) {
			DAO.load.apply(DAO, args);
		});
		this.bootstrapQueue = [];
	},
	
	_successHandler: function(options, transport, json) {
		if (! transport.request.isAborted) {
			var responseText = transport.responseText;
			var jsonObj = null;
			try {
				jsonObj = responseText.evalJSON();
			} catch (e) {
				globalJSErrorHandler(e);
			}
			
			if (jsonObj) {
				if (options.appendTo) {
					var controller = Registry.lookup(options.appendTo);
					if (controller) {
						controller.appendData(jsonObj.data);
					}
				} else {
					Registry.createController(jsonObj.name, jsonObj.templateURL, jsonObj.controllerURL, options, jsonObj.data);
				}
			}
		}
	},
	
	_exceptionHandler: function(transport, exception) {
		if (exception.fileName && exception.lineNumber && exception.message) {
			globalJSErrorHandler(exception.message, exception.fileName, exception.lineNumber);
		} else {
			globalJSErrorHandler(exception.message);
		}
	}
});

var DAO = new DataAccessObject();
/* globalerrorhandlers.js */
var GlobalJSErrorHandler = function() {
	window.globalJSErrorHandler = function (msg, href, lineNo) {
		if (! window.debugMode) {
			DAO.load({endpoint:"QuestErrorController.LogError", container: null}, msg, href, lineNo);
			redirectOnError();
		} else {
			if (window.console && Object.isFunction(window.console.error)) {
				window.console.error(msg + " (" + href + " line: " + lineNo + ")");
			}
		}
	}
	window.onerror = globalJSErrorHandler;
};
GlobalJSErrorHandler();

var AjaxExceptionHandler = function() {
    Ajax.Responders.register({
        onComplete: function(request, transport, json) {
            if (!request.isAborted && transport.status == 500) {
            	var redirect = "";
            	if(json) {
            		redirect = json.redirect;
            	}
            	redirectOnError(redirect, true);
            }
        }
    });
};
AjaxExceptionHandler();

var redirectOnError = function(url, forceRedirect) {
	var questError = Registry.lookup("QuestErrorController.Loader");
	if(forceRedirect || ! questError || ! questError.hasErrors()) {
		// if we don't abort requests, then our ajax call to report 
		// the error will get aborted via the redirect, which causes 
		// an error which calls into globalJSErrorHandler again and 
		// we get into a big infinite loop
		window.ajaxTracker.abortAllRequests(); 
    	var params = {error: true};
        var baseURL = window.location.href;
        if(url) {
        	baseURL = url;
        }
        var hashIndex = baseURL.indexOf("#");
        if (hashIndex >= 0) {
        	baseURL = baseURL.substring(0, hashIndex);
        }
        
        var attribute = "?"
        if(baseURL.include(attribute)) {
        	attribute = "&"
        }
        var redirect = baseURL + attribute + Object.toQueryString(params);
        window.location.href = redirect;
	}
};/* jsloader.js */
var BaseDynamicJavascript = function() {
};

BaseDynamicJavascript.load = function(initialObject, name, url, args) {
	var request = new Ajax.Request(url, {
		method: "get",
		asynchronous: false
	});
	
	if (request.transport.status >= 200 && request.transport.status < 300) {
		var scriptText = request.transport.responseText;
		var parentClass = eval(scriptText);
		if (initialObject) {
			var oldInitialize = parentClass.prototype.initialize;
			parentClass.prototype.initialize = function(arrayArgs) {
				oldInitialize.apply(this, arrayArgs);
			};
			var realObject = new parentClass(args);
			Object.extend(initialObject, realObject);
			parentClass.prototype.initialize = oldInitialize;
		}

		eval(name + " = Class.create(parentClass)");
	}
};

Class.create = Class.create.wrap(
	function(origCall) {
		var params = $A(arguments);
		params.shift();
		try {
			if (Object.isFunction(params[0]) && Object.isFunction(params[0].prototype.initialize)) {
				var initializeGuts = params[0].prototype.initialize.toString();
				if (initializeGuts.indexOf("BaseDynamicJavascript.load") >= 0) {
					// this is a dynamic class that has not been loaded yet, so we need to load it before prototype tries to extend it
					var regex = /BaseDynamicJavascript.load\(([^)]+)\)/;
					var matcher = initializeGuts.match(regex);
					if (Object.isArray(matcher) && matcher.length == 2) {
						var loadArgs = matcher[1].gsub(/[\s|\"]/,"").split(",");
						var name = loadArgs[1];
						var url = loadArgs[2];
						BaseDynamicJavascript.load(null, name, url, null);
					}
				}
			}
		} catch(ex) {
			// be super safe.  if this doesn't work for some reason, we'll just call the wrapped Class.create
		} finally {
			return origCall.apply(this, params);
		}
	}
);MessageHelper = {};

MessageHelper.format = function(key) {
	var message = null;
	
	if (window._languageMap) {
		var formatString = window._languageMap.get(key);
		if (formatString) {
			if (arguments.length > 1) {
				var valueParameters = $A(arguments);
				valueParameters.shift();
				message = MessageHelper._fillInValueParameters(formatString, valueParameters);
			} else {
				message = formatString;
			}
		}
	}
	return (message != null) ? message : "???" + key + "???";
};

MessageHelper._fillInValueParameters = function(formatString, valueParameters) {
    var formattedMessage = formatString;
    
    for (var i = 0; i < valueParameters.length; ++i) {
        var tokenStart = "{" + i;
        
        var tokenStartIndex = formattedMessage.indexOf(tokenStart);
        
        if (tokenStartIndex >= 0) {
            var tokenEndIndex = formattedMessage.indexOf("}", tokenStartIndex);
            
            if (tokenEndIndex == (tokenStartIndex + tokenStart.length)) {
                // We do not have a format type, so a String is assummed
            	var beforeStuff = formattedMessage.substring(0, tokenStartIndex);
            	var afterStuff = formattedMessage.substring(tokenEndIndex + 1);
            	formattedMessage = beforeStuff + valueParameters[i] + afterStuff;
            } else if (tokenEndIndex != -1){
                // We have a potential format type
                var formatType = formattedMessage.substring(
                    tokenStartIndex + tokenStart.length + 1,
                    tokenEndIndex);
                if (formatType == "style") {
                	// we don't do anything special with style.  This just indicates the token is used for markup
                	var beforeStuff = formattedMessage.substring(0, tokenStartIndex);
                	var afterStuff = formattedMessage.substring(tokenEndIndex + 1);
                	formattedMessage = beforeStuff + valueParameters[i] + afterStuff;
                } else {
                	throw "Format type " + formatType + " not supported by Quest MessageHelper";
                }
            }
        }
    }
    
    return formattedMessage;
};
/* questbootstrap.js */
var QuestBootstrap = function(data) {
	var bootstrapInProgress = true;
	
	QuestBootstrap.isBootstrapInProgress = function() {
		return bootstrapInProgress;
	};
	
	QuestBootstrap.start = function() {
		var wrapperOuter = $("wrapper-outer");
		var loadingShield = $("pageLoading");
		loadingShield.show();
		wrapperOuter.hide();
		
		try {
			data.bootstraps.each(function(bootstrap) {
				Registry.createController(bootstrap.name, bootstrap.templateURL, bootstrap.controllerURL, {container:$(bootstrap.containerID)}, bootstrap.data);
			});
			bootstrapInProgress = false;
			var boundFlush = DAO.flushBootstrapQueue.bind(DAO);
			boundFlush.defer();
		} finally {
			loadingShield.hide();
			wrapperOuter.show();
		}
	};
};

var PostLoadBootstrapClass = Class.create({
	load: function(bootstraps) {
		var result = false;
		
		if (! this.bootstrapInProgress) {
			this.bootstrapInProgress = true;
			if (Object.isArray(bootstraps)) {
				var request = new Ajax.Request("/quest/servlet/ajaxbootstrapform.do", {
					method: "get",
					parameters: {"postLoadBootstrapNames": bootstraps.join(",")},
					onSuccess: this.ajaxCallback.bind(this),
					onException: this.exceptionHandler.bind(this)
				});
			}
			result = true;
		}
		
		return result;
	},
	
	ajaxCallback: function(transport, json) {
		var responseText = transport.responseText;
		var jsonObj = null;
		try {
			jsonObj = responseText.evalJSON();
		} catch (e) {
			// maybe some kind of error handling
			globalJSErrorHandler(e);
		}
		
		jsonObj.bootstraps.each(function(bootstrap) {
			Registry.createController(bootstrap.name, bootstrap.templateURL, bootstrap.controllerURL, {container:$(bootstrap.containerID)}, bootstrap.data);
		});
		this.bootstrapInProgress = false;
		var boundFlush = DAO.flushBootstrapQueue.bind(DAO);
		boundFlush.defer();
	},
	
	exceptionHandler: function(transport, exception) {
		if (exception.fileName && exception.lineNumber && exception.message) {
			globalJSErrorHandler(exception.message, exception.fileName, exception.lineNumber);
		} else {
			globalJSErrorHandler(exception.message);
		}
	},
	
	isBootstrapInProgress: function() {
		return this.bootstrapInProgress;
	}
});
PostLoadBootstrapper = new PostLoadBootstrapClass();/* registry.js */
var Registry = function() {
	var registry = new Hash();
	
	Registry.register = function(name, controller) {
		registry.set(name, controller);
	};
	
	Registry.unregister = function(name) {
		var controller = registry.unset(name);
		if (controller && Object.isFunction(controller.dispose)) {
			controller.dispose();
		}
		return controller;
	};
	
	Registry.lookup = function(name) {
		return registry.get(name);
	};
	
	Registry.showAll = function() {
		var myKeys = registry.keys();
		return myKeys.join(",");
	};
	
	Registry.createController = function(name, templateURL, controllerURL, options, data) {
		Registry.unregister(name);
		var template = null;
		if(templateURL && templateURL.length > 0) {
			template = new EJS({url: templateURL});
		}
		var controller = null;
		if(controllerURL && controllerURL.length > 0) {
			controller = BaseController.load(controllerURL);
			
			controller.template = template;
			controller.data = data;
			controller.render(name, options);
			Registry.register(name, controller);
		}
		return controller;
	};
};

Registry();/* reusabletemplates.js */
var ReusableTemplates = function(data) {
	var templateHash = new Hash();
	if (data && Object.isArray(data)) {
		data.each(function(template) {
			templateHash.set(template.name, template.templateURL);
		});
	}
	ReusableTemplates.load = function(name, data) {
		var result = null;
		try {
			var templateURL = templateHash.get(name);		
			if (templateURL) {
				var ejsObj = new EJS({url: templateURL});
				result = ejsObj.render(data);
			}
		} catch (exception) {
			if (exception.fileName && exception.lineNumber && exception.message) {
				globalJSErrorHandler(exception.message, exception.fileName, exception.lineNumber);
			} else {
				globalJSErrorHandler(exception.message);
			}
		}
		return result;
	};
};
/* utility.js */
var Utility = {

upToClass: function(startElement, className) {
    var result;
    
    if (startElement) {
        if (startElement.hasClassName(className)) {
            result = startElement;
        } else {
            var elementParents = startElement.ancestors();
            for (i=0; i < elementParents.length; i++) {
                if (elementParents[i].hasClassName(className)) {
                    result = elementParents[i];
                    break;
                }
            }
        }
    }
    return result;
},
downToClass: function(startElement, className) {
    var result;
    
    if (startElement) {
        if (startElement.hasClassName(className)) {
            result = startElement;
        } else {
            var elementChildren = startElement.descendants();
            for (i=0; i < elementChildren.length; i++) {
                if (elementChildren[i].hasClassName(className)) {
                    result = elementChildren[i];
                    break;
                }
            }
        }
    }
    return result;
},
selectByClass: function(startElement, className) {
    var result = new Array();
    
    if (startElement) {
        if (startElement.hasClassName(className)) {
            result[result.length] = startElement;
        } 
        var elementChildren = startElement.descendants();
        for (i=0; i < elementChildren.length; i++) {
            if (elementChildren[i].hasClassName(className)) {
                result[result.length] = elementChildren[i];
            }
        }
    }
    return result;
},

getIEVersion: function() {
	var version = -1;
	if (Prototype.Browser.IE) {
		try {
    		version = parseInt(navigator.userAgent.substring(navigator.userAgent.indexOf("MSIE")+5));
		} catch (e) {
			version = -1;
		}
	}
	
	return version;
},
preloadImageData: function(array) {
    if(array){
    	for(var index=0; index<array.length; index++) {
    		var img = new Image();
    		img.src = array[index];
    	}
    }
},

isNumber: function(test) {
	var result = false;
	
	try {
		var evaled = eval(test);
		result = Object.isNumber(evaled);
	} catch (ex) {
		result = false;
	}
	
	return result;
},

destinyEscape: function (string) {
    var result = "";
    var i = 0;
    for (i = 0; i < string.length; i++) {
        c = string.charCodeAt(i);
        if (c < 48 || (c >= 58 && c < 65)) {
            result = result + "%" + this.toHex8bit(c);
        } else {
            result = result + String.fromCharCode(c);
        }
    }
    return result;
},

enHex: function (aDigit) {
    return("0123456789ABCDEF".substring(aDigit, aDigit+1))
},

toHex8bit: function (n) {
    return (this.enHex((0x0000f0 & n) >>  4) +
            this.enHex((0x00000f & n) >>  0))
}

};

var Timeout = Class.create({
    initialize: function(timeout, handlerFunction) {
        this.timeout = timeout;
        this.handlerFunction = handlerFunction;
        this.startTimeout();
    },
    
    startTimeout: function() {
        this.myTimeout = setTimeout(this.handlerFunction.bind(this), this.timeout);
    },
    
    stopTimeout: function() {
        clearTimeout(this.myTimeout);
    },
    
    resetTimeout: function() {
        this.stopTimeout();
        this.startTimeout();
    }
});

var InactivityRedirectTimeout = Class.create(Timeout, {
    initialize: function($super, timeout, redirectURL) {
        this.redirectURL = redirectURL;
        $super(timeout, this.redirect);
        
    },
    
    startResponder: function() {
		var timeoutObj = this;
		Ajax.Responders.register({
			onComplete: function(request, transport, json) {
			timeoutObj.resetTimeout();
		}
		});     
    },
    
    redirect: function() {
        window.location = this.redirectURL;
    }
});

//-------------------------------------------------------------------------------------------------//
var AjaxTracker = Class.create({
	initialize: function() {
		this.currentAjaxCalls = new Array();
		
	    Ajax.Responders.register({
	    	onCreate: this.createRequest.bind(this),
	        onComplete: this.completeRequest.bind(this)
	    });
	},

	getRequestsAsString: function() {
	    var string = "", v, i, r, strObject, s;
	    for (r = 0; r < this.currentAjaxCalls.length; r++) {
	        s = "";
		    strObject = this.currentAjaxCalls[r].parameters;
		    for (i in strObject) {
				v = strObject[i];
				if (s.length > 0) s += "&"; else s += "?";
				s += (i + "=" + v);
		    }
		    string += (this.currentAjaxCalls[r].url + s + "\n");
	    }
	    return string;
	},

	createRequest: function(request, transport) {
		request.isAborted = false;
		this.currentAjaxCalls[this.currentAjaxCalls.length] = request;
	},

	completeRequest: function(request, transport) {
		this.currentAjaxCalls = this.currentAjaxCalls.without(request);
	},

	abortAllRequests: function() {
		this.currentAjaxCalls.each(function(request) {
	        request.isAborted = true;
			request.transport.abort();
		});
		
		this.currentAjaxCalls = new Array();
	}
});

window.ajaxTracker = new AjaxTracker();