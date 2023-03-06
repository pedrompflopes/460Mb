YUI.add("node-base",function(e,t){var n=["hasClass","addClass","removeClass","replaceClass","toggleClass"];e.Node.importMethod(e.DOM,n),e.NodeList.importMethod(e.Node.prototype,n);var r=e.Node,i=e.DOM;r.create=function(t,n){return n&&n._node&&(n=n._node),e.one(i.create(t,n))},e.mix(r.prototype,{create:r.create,insert:function(e,t){return this._insert(e,t),this},_insert:function(e,t){var n=this._node,r=null;return typeof t=="number"?t=this._node.childNodes[t]:t&&t._node&&(t=t._node),e&&typeof e!="string"&&(e=e._node||e._nodes||e),r=i.addHTML(n,e,t),r},prepend:function(e){return this.insert(e,0)},append:function(e){return this.insert(e,null)},appendChild:function(e){return r.scrubVal(this._insert(e))},insertBefore:function(t,n){return e.Node.scrubVal(this._insert(t,n))},appendTo:function(t){return e.one(t).append(this),this},setContent:function(e){return this._insert(e,"replace"),this},getContent:function(){var e=this;return e._node.nodeType===11&&(e=e.create("<div/>").append(e.cloneNode(!0))),e.get("innerHTML")}}),e.Node.prototype.setHTML=e.Node.prototype.setContent,e.Node.prototype.getHTML=e.Node.prototype.getContent,e.NodeList.importMethod(e.Node.prototype,["append","insert","appendChild","insertBefore","prepend","setContent","getContent","setHTML","getHTML"]);var r=e.Node,i=e.DOM;r.ATTRS={text:{getter:function(){return i.getText(this._node)},setter:function(e){return i.setText(this._node,e),e}},"for":{getter:function(){return i.getAttribute(this._node,"for")},setter:function(e){return i.setAttribute(this._node,"for",e),e}},options:{getter:function(){return this._node.getElementsByTagName("option")}},children:{getter:function(){var t=this._node,n=t.children,r,i,s;if(!n||e.UA.ie&&e.UA.ie<9){r=t.childNodes,n=[];for(i=0,s=r.length;i<s;++i)r[i].tagName&&r[i].nodeType===1&&(n[n.length]=r[i])}return e.all(n)}},value:{getter:function(){return i.getValue(this._node)},setter:function(e){return i.setValue(this._node,e),e}}},e.Node.importMethod(e.DOM,["setAttribute","getAttribute"]);var r=e.Node,s=e.NodeList;r.DOM_EVENTS={abort:1,beforeunload:1,blur:1,change:1,click:1,close:1,command:1,contextmenu:1,copy:1,cut:1,dblclick:1,DOMMouseScroll:1,drag:1,dragstart:1,dragenter:1,dragover:1,dragleave:1,dragend:1,drop:1,error:1,focus:1,key:1,keydown:1,keypress:1,keyup:1,load:1,message:1,mousedown:1,mouseenter:1,mouseleave:1,mousemove:1,mousemultiwheel:1,mouseout:1,mouseover:1,mouseup:1,mousewheel:1,orientationchange:1,paste:1,reset:1,resize:1,select:1,selectstart:1,submit:1,scroll:1,textInput:1,unload:1,invalid:1},e.mix(r.DOM_EVENTS,e.Env.evt.plugins),e.augment(r,e.EventTarget),e.mix(r.prototype,{purge:function(t,n){return e.Event.purgeElement(this._node,t,n),this}}),e.mix(e.NodeList.prototype,{_prepEvtArgs:function(t,n,r){var i=e.Array(arguments,0,!0);return i.length<2?i[2]=this._nodes:i.splice(2,0,this._nodes),i[3]=r||this,i},on:function(t,n,r){return e.on.apply(e,this._prepEvtArgs.apply(this,arguments))},once:function(t,n,r){return e.once.apply(e,this._prepEvtArgs.apply(this,arguments))},after:function(t,n,r){return e.after.apply(e,this._prepEvtArgs.apply(this,arguments))},onceAfter:function(t,n,r){return e.onceAfter.apply(e,this._prepEvtArgs.apply(this,arguments))}}),s.importMethod(e.Node.prototype,["detach","detachAll"]),e.mix(e.Node.ATTRS,{offsetHeight:{setter:function(t){return e.DOM.setHeight(this._node,t),t},getter:function(){return this._node.offsetHeight}},offsetWidth:{setter:function(t){return e.DOM.setWidth(this._node,t),t},getter:function(){return this._node.offsetWidth}}}),e.mix(e.Node.prototype,{sizeTo:function(t,n){var r;arguments.length<2&&(r=e.one(t),t=r.get("offsetWidth"),n=r.get("offsetHeight")),this.setAttrs({offsetWidth:t,offsetHeight:n})}}),e.config.doc.documentElement.hasAttribute||(e.Node.prototype.hasAttribute=function(e){return e==="value"&&this.get("value")!==""?!0:!!this._node.attributes[e]&&!!this._node.attributes[e].specified}),e.Node.prototype.focus=function(){try{this._node.focus()}catch(e){}return this},e.Node.ATTRS.type={setter:function(e){if(e==="hidden")try{this._node.type="hidden"}catch(t){this._node.style.display="none",this._inputType="hidden"}else try{this._node.type=e}catch(t){}return e},getter:function(){return this._inputType||this._node.type},_bypassProxy:!0},e.config.doc.createElement("form").elements.nodeType&&(e.Node.ATTRS.elements={getter:function(){return this.all("input, textarea, button, select")}}),e.mix(e.Node.prototype,{_initData:function(){"_data"in this||(this._data={})},getData:function(t){this._initData();var n=this._data,r=n;return arguments.length?t in n?r=n[t]:r=this._getDataAttribute(t):typeof n=="object"&&n!==null&&(r={},e.Object.each(n,function(e,t){r[t]=e}),r=this._getDataAttributes(r)),r},_getDataAttributes:function(e){e=e||{};var t=0,n=this._node.attributes,r=n.length,i=this.DATA_PREFIX,s=i.length,o;while(t<r)o=n[t].name,o.indexOf(i)===0&&(o=o.substr(s),o in e||(e[o]=this._getDataAttribute(o))),t+=1;return e},_getDataAttribute:function(e){e=this.DATA_PREFIX+e;var t=this._node,n=t.attributes,r=n&&n[e]&&n[e].value;return r},setData:function(e,t){return this._initData(),arguments.length>1?this._data[e]=t:this._data=e,this},clearData:function(e){return"_data"in this&&(typeof e!="undefined"?delete this._data[e]:delete this._data),this}}),e.mix(e.NodeList.prototype,{getData:function(e){var t=arguments.length?[e]:[];return this._invoke("getData",t,!0)},setData:function(e,t){var n=arguments.length>1?[e,t]:[e];return this._invoke("setData",n)},clearData:function(e){var t=arguments.length?[e]:[];return this._invoke("clearData",[e])}})},"patched-v3.17.0",{requires:["event-base","node-core","dom-base","dom-style"]});
