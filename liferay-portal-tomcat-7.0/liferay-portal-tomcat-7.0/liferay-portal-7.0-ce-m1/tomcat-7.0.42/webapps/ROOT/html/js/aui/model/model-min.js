YUI.add("model",function(e,t){function l(){l.superclass.constructor.apply(this,arguments)}var n=YUI.namespace("Env.Model"),r=e.Lang,i=e.Array,s=e.Object,o="change",u="error",a="load",f="save";e.Model=e.extend(l,e.Base,{idAttribute:"id",_allowAdHocAttrs:!0,_isYUIModel:!0,initializer:function(e){this.changed={},this.lastChange={},this.lists=[]},destroy:function(e,t){var n=this;return typeof e=="function"&&(t=e,e=null),n.onceAfter("destroy",function(){function r(r){r||i.each(n.lists.concat(),function(t){t.remove(n,e)}),t&&t.apply(null,arguments)}e&&(e.remove||e["delete"])?n.sync("delete",e,r):r()}),l.superclass.destroy.call(n)},generateClientId:function(){return n.lastId||(n.lastId=0),this.constructor.NAME+"_"+(n.lastId+=1)},getAsHTML:function(t){var n=this.get(t);return e.Escape.html(r.isValue(n)?String(n):"")},getAsURL:function(e){var t=this.get(e);return encodeURIComponent(r.isValue(t)?String(t):"")},isModified:function(){return this.isNew()||!s.isEmpty(this.changed)},isNew:function(){return!r.isValue(this.get("id"))},load:function(e,t){var n=this;return typeof e=="function"&&(t=e,e={}),e||(e={}),n.sync("read",e,function(r,i){var s={options:e,response:i},o;r?(s.error=r,s.src="load",n.fire(u,s)):(n._loadEvent||(n._loadEvent=n.publish(a,{preventable:!1})),o=s.parsed=n._parse(i),n.setAttrs(o,e),n.changed={},n.fire(a,s)),t&&t.apply(null,arguments)}),n},parse:function(t){if(typeof t=="string")try{return e.JSON.parse(t)}catch(n){return this.fire(u,{error:n,response:t,src:"parse"}),null}return t},save:function(e,t){var n=this;return typeof e=="function"&&(t=e,e={}),e||(e={}),n._validate(n.toJSON(),function(r){if(r){t&&t.call(null,r);return}n.sync(n.isNew()?"create":"update",e,function(r,i){var s={options:e,response:i},o;r?(s.error=r,s.src="save",n.fire(u,s)):(n._saveEvent||(n._saveEvent=n.publish(f,{preventable:!1})),i&&(o=s.parsed=n._parse(i),n.setAttrs(o,e)),n.changed={},n.fire(f,s)),t&&t.apply(null,arguments)})}),n},set:function(e,t,n){var r={};return r[e]=t,this.setAttrs(r,n)},setAttrs:function(t,n){var r=this.idAttribute,i,u,a,f,l;n=e.merge(n),l=n._transaction={},r!=="id"&&(t=e.merge(t),s.owns(t,r)?t.id=t[r]:s.owns(t,"id")&&(t[r]=t.id));for(a in t)s.owns(t,a)&&this._setAttr(a,t[a],n);if(!s.isEmpty(l)){i=this.changed,f=this.lastChange={};for(a in l)s.owns(l,a)&&(u=l[a],i[a]=u.newVal,f[a]={newVal:u.newVal,prevVal:u.prevVal,src:u.src||null});n.silent||(this._changeEvent||(this._changeEvent=this.publish(o,{preventable:!1})),n.changed=f,this.fire(o,n))}return this},sync:function(){var e=i(arguments,0,!0).pop();typeof e=="function"&&e()},toJSON:function(){var e=this.getAttrs();return delete e.clientId,delete e.destroyed,delete e.initialized,this.idAttribute!=="id"&&delete e.id,e},undo:function(e,t){var n=this.lastChange,r=this.idAttribute,o={},u;return e||(e=s.keys(n)),i.each(e,function(e){s.owns(n,e)&&(e=e===r?"id":e,u=!0,o[e]=n[e].prevVal)}),u?this.setAttrs(o,t):this},validate:function(e,t){t&&t()},addAttr:function(e,t,n){var i=this.idAttribute,s,o;return i&&e===i&&(s=this._isLazyAttr("id")||this._getAttrCfg("id"),o=t.value===t.defaultValue?null:t.value,r.isValue(o)||(o=s.value===s.defaultValue?null:s.value,r.isValue(o)||(o=r.isValue(t.defaultValue)?t.defaultValue:s.defaultValue)),t.value=o,s.value!==o&&(s.value=o,this._isLazyAttr("id")?this._state.add("id","lazy",s):this._state.add("id","value",o))),l.superclass.addAttr.apply(this,arguments)},_parse:function(e){return this.parse(e)},_validate:function(e,t){function i(i){if(r.isValue(i)){n.fire(u,{attributes:e,error:i,src:"validate"}),t(i);return}t()}var n=this;n.validate.length===1?i(n.validate(e,i)):n.validate(e,i)},_setAttrVal:function(e,t,n,r,i,s){var o=l.superclass._setAttrVal.apply(this,arguments),u=i&&i._transaction,a=s&&s.initializing;return o&&u&&!a&&(u[e]={newVal:this.get(e),prevVal:n,src:i.src||null}),o}},{NAME:"model",ATTRS:{clientId:{valueFn:"generateClientId",readOnly:!0},id:{value:null}}})},"patched-v3.17.0",{requires:["base-build","escape","json-parse"]});
