YUI.add("datatable-paginator",function(e,t){function f(){}var n,r,i=e.DataTable.Templates.Paginator,s=e.Lang.sub,o=e.ClassNameManager.getClassName,u=o(t,"control-disabled"),a="paginator:ui";n=e.Base.create("dt-pg-model",e.Model,[e.Paginator.Core]),r=e.Base.create("dt-pg-view",e.View,[],{_eventHandles:[],containerTemplate:'<div class="{paginator}"/>',contentTemplate:"{buttons}{goto}{perPage}",_allowAdHocAttrs:!1,initializer:function(){this.containerTemplate=s(this.containerTemplate,{paginator:o(t)}),this._initStrings(),this._initClassNames(),this.attachEvents()},render:function(){var e=this.get("model"),t=s(this.contentTemplate,{buttons:this._buildButtonsGroup(),"goto":this._buildGotoGroup(),perPage:this._buildPerPageGroup()});return this.get("container").append(t),this.attachEvents(),this._rendered=!0,this._updateControlsUI(e.get("page")),this._updateItemsPerPageUI(e.get("itemsPerPage")),this},attachEvents:function(){r.superclass.attachEvents.apply(this,arguments);var t=this.get("container");this.classNames||this._initClassNames(),this._attachedViewEvents.push(t.delegate("click",this._controlClick,"."+this.classNames.control,this),this.get("model").after("change",this._modelChange,this)),t.all("form").each(e.bind(function(e){this._attachedViewEvents.push(e.after("submit",this._controlSubmit,this))},this)),t.all("select").each(e.bind(function(e){this._attachedViewEvents.push(e.after("change",this._controlChange,this))},this))},_buildButtonsGroup:function(){var e=this.get("strings"),t=this.classNames,n;return n=i.button({type:"first",label:e.first,classNames:t})+i.button({type:"prev",label:e.prev,classNames:t})+i.button({type:"next",label:e.next,classNames:t})+i.button({type:"last",label:e.last,classNames:t}),i.buttons({classNames:t,buttons:n})},_buildGotoGroup:function(){return i.gotoPage({classNames:this.classNames,strings:this.get("strings"),page:this.get("model").get("page")})},_buildPerPageGroup:function(){var e=this.get("pageSizes"),t=this.get("model").get("rowsPerPage"),n,r,s;for(s=0,r=e.length;s<r;s++)n=e[s],typeof n!="object"&&(n={value:n,label:n}),n.selected=n.value===t?" selected":"";return i.perPage({classNames:this.classNames,strings:this.get("strings"),options:this.get("pageSizes")})},_modelChange:function(e){var t=e.changed,n=t&&t.page,r=t&&t.itemsPerPage;n&&this._updateControlsUI(n.newVal),r&&(this._updateItemsPerPageUI(r.newVal),n||this._updateControlsUI(e.target.get("page")))},_updateControlsUI:function(e){if(!this._rendered)return;var t=this.get("model"),n="."+this.classNames.control,r=this.get("container"),i=t.hasPrevPage(),s=t.hasNextPage();r.one(n+"-first").toggleClass(u,!i).set("disabled",!i),r.one(n+"-prev").toggleClass(u,!i).set("disabled",!i),r.one(n+"-next").toggleClass(u,!s).set("disabled",!s),r.one(n+"-last").toggleClass(u,!s).set("disabled",!s),r.one("form input").set("value",e)},_updateItemsPerPageUI:function(e){if(!this._rendered)return;this.get("container").one("select").set("value",e)},_controlClick:function(e){e.preventDefault();var t=e.currentTarget;if(t.hasClass(u))return;this.fire(a,{type:t.getData("type"),val:t.getData("page")||null})},_controlChange:function(e){if(e.target.hasClass(u))return;val=e.target.get("value"),this.fire(a,{type:"perPage",val:parseInt(val,10)})},_controlSubmit:function(e){if(e.target.hasClass(u))return;e.preventDefault(),input=e.target.one("input"),this.fire(a,{type:"page",val:+input.get("value")})},_initClassNames:function(){this.classNames={control:o(t,"control"),controls:o(t,"controls"),group:o(t,"group"),perPage:o(t,"per-page")}},_initStrings:function(){this.set("strings",e.mix(this.get("strings")||{},e.Intl.get("datatable-paginator")))},_defPageSizeVal:function(){this._initStrings();var e=this.get("strings");return[10,50,100,{label:e.showAll,value:-1}]}},{ATTRS:{pageSizes:{valueFn:"_defPageSizeVal"},model:{}}}),f.ATTRS={paginatorModel:{setter:"_setPaginatorModel",value:null,writeOnce:"initOnly"},paginatorModelType:{getter:"_getConstructor",value:"DataTable.Paginator.Model",writeOnce:"initOnly"},paginatorView:{getter:"_getConstructor",value:"DataTable.Paginator.View",writeOnce:"initOnly"},pageSizes:{setter:"_setPageSizesFn",valueFn:"_defPageSizeVal"},paginatorStrings:{},rowsPerPage:{value:null},paginatorLocation:{value:"footer"}},e.mix(f.prototype,{firstPage:function(){return this.get("paginatorModel").set("page",1),this},lastPage:function(){var e=this.get("paginatorModel");return e.set("page",e.get("totalPages")),this},previousPage:function(){return this.get("paginatorModel").prevPage(),this},nextPage:function(){return this.get("paginatorModel").nextPage(),this},initializer:function(){this._initPaginatorStrings(),this._augmentData(),this._eventHandles.paginatorRender||(this._eventHandles.paginatorRender=e.Do.after(this._paginatorRender,this,"render"))},_paginatorRender:function(){var e=this.get("paginatorModel");this._paginatorRenderUI(),e.after("change",this._afterPaginatorModelChange,this),this.after("dataChange",this._afterDataChangeWithPaginator,this),this.after("rowsPerPageChange",this._afterRowsPerPageChange,this),this.data.after(["add","remove","change"],this._afterDataUpdatesWithPaginator,this),e.set("itemsPerPage",this.get("rowsPerPage")),e.set("totalItems",this.get("data").size())},_afterDataChangeWithPaginator:function(){var e=this.get("data"),t=this.get("paginatorModel");t.set("totalItems",e.size()),t.get("page")!==1?this.firstPage():(this._augmentData(),e.fire.call(e,"reset",{src:"reset",models:e._items.concat()}))},_afterDataUpdatesWithPaginator:function(){var e=this.get("paginatorModel"),t=this.get("data");e.set("totalItems",t.size())},_afterRowsPerPageChange:function(e){var t=this.get("data"),n=this.get("paginatorModel"),r;if(e.newVal!==null)this._paginatorRenderUI(),t._paged||this._augmentData(),t._paged.index=(n.get("page")-1)*n.get("itemsPerPage"),t._paged.length=n.get("itemsPerPage");else{while(this._pgViews.length)r=this._pgViews.shift(),r.destroy({remove:!0}),r._rendered=null;t._paged.index=0,t._paged.
length=null}this.get("paginatorModel").set("itemsPerPage",parseInt(e.newVal,10))},_paginatorRenderUI:function(){if(!this.get("rowsPerPage"))return;var n=this._pgViews,r=this.get("paginatorView"),s={pageSizes:this.get("pageSizes"),model:this.get("paginatorModel")},u=this.get("paginatorLocation");e.Lang.isArray(u)||(u=[u]),n||(n=this._pgViews=[]),e.Array.each(u,function(u){var a=new r(s),f=a.render().get("container"),l;a.after("*:ui",this._uiPgHandler,this),n.push(a),u._node?(u.append(f),this.after("destroy",function(){a.destroy({remove:!0})})):u==="footer"?(this.foot||(this.foot=new e.DataTable.FooterView({host:this}),this.foot.render(),this.fire("renderFooter",{view:this.foot})),l=e.Node.create(i.rowWrapper({wrapperClass:o(t,"wrapper"),numOfCols:this.get("columns").length})),l.one("td").append(f),this.foot.tfootNode.append(l),a.after("destroy",function(){l.remove(!0)})):u==="header"&&(this.view&&this.view.tableNode?this.view.tableNode.insert(f,"before"):this.get("contentBox").prepend(f))},this)},_uiPgHandler:function(e){var t=this.get("paginatorModel");switch(e.type){case"first":t.set("page",1);break;case"last":t.set("page",t.get("totalPages"));break;case"prev":case"next":t[e.type+"Page"]();break;case"page":t.set("page",e.val);break;case"perPage":t.set("itemsPerPage",e.val),t.set("page",1)}},_afterPaginatorModelChange:function(){var e=this.get("paginatorModel"),t=this.get("data");t._paged?(t._paged.index=(e.get("page")-1)*e.get("itemsPerPage"),t._paged.length=e.get("itemsPerPage")):this._augmentData(),t.fire.call(t,"reset",{src:"reset",models:t._items.concat()})},_augmentData:function(){var t=this.get("paginatorModel");if(this.get("rowsPerPage")===null)return;e.mix(this.get("data"),{_paged:{index:(t.get("page")-1)*t.get("itemsPerPage"),length:t.get("itemsPerPage")},getPage:function(){var e=this._paged,t=e.index;return e.length>=0?this._items.slice(t,t+e.length):this._items.slice(t)},size:function(e){return e&&this._paged.length>=0?this._paged.length:this._items.length},each:function(){var t=Array.prototype.slice.call(arguments);return t.unshift(this.getPage()),e.Array.each.apply(null,t),this}},!0)},_setPageSizesFn:function(t){var n,r=t.length,i,s;e.Lang.isArray(t)||(t=[t],r=t.length);for(n=0;n<r;n++)typeof t[n]!="object"&&(i=t[n],s=t[n],parseInt(s,10)!=s&&(s=-1),t[n]={label:i,value:s});return t},_setPaginatorModel:function(e){if(!e||!e._isYUIModel){var t=this.get("paginatorModelType");e=new t(e)}return e},_getConstructor:function(t){return typeof t=="string"?e.Object.getValue(e,t.split(".")):t},_initPaginatorStrings:function(){this.set("paginatorStrings",e.mix(this.get("paginatorStrings")||{},e.Intl.get("datatable-paginator")))},_defPageSizeVal:function(){this._initPaginatorStrings();var e=this.get("paginatorStrings");return[10,50,100,{label:e.showAll,value:-1}]}},!0),e.DataTable.Paginator=f,e.DataTable.Paginator.Model=n,e.DataTable.Paginator.View=r,e.Base.mix(e.DataTable,[e.DataTable.Paginator])},"patched-v3.17.0",{requires:["model","view","paginator-core","datatable-foot","datatable-paginator-templates"],lang:["en","fr"],skinnable:!0});
