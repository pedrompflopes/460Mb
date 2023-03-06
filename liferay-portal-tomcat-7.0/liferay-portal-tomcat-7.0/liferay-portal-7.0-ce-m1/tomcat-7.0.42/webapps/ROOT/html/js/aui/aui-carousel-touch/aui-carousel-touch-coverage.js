if (typeof __coverage__ === 'undefined') { __coverage__ = {}; }
if (!__coverage__['build/aui-carousel-touch/aui-carousel-touch.js']) {
   __coverage__['build/aui-carousel-touch/aui-carousel-touch.js'] = {"path":"build/aui-carousel-touch/aui-carousel-touch.js","s":{"1":0,"2":0,"3":0,"4":0,"5":0},"b":{},"f":{"1":0,"2":0},"fnMap":{"1":{"name":"(anonymous_1)","line":1,"loc":{"start":{"line":1,"column":30},"end":{"line":1,"column":49}}},"2":{"name":"CarouselTouch","line":11,"loc":{"start":{"line":11,"column":0},"end":{"line":11,"column":25}}}},"statementMap":{"1":{"start":{"line":1,"column":0},"end":{"line":34,"column":67}},"2":{"start":{"line":11,"column":0},"end":{"line":11,"column":27}},"3":{"start":{"line":13,"column":0},"end":{"line":15,"column":2}},"4":{"start":{"line":17,"column":0},"end":{"line":29,"column":2}},"5":{"start":{"line":31,"column":0},"end":{"line":31,"column":40}}},"branchMap":{},"code":["(function () { YUI.add('aui-carousel-touch', function (A, NAME) {","","/**"," * The Carousel should work a little differently on touch devices,"," * having swipe turned on by default for example."," * This module will be mixed into the Carousel automatically when loaded."," *"," * @module aui-carousel-touch"," */","","function CarouselTouch() {}","","CarouselTouch.prototype = {","    TPL_MENU: '<div class=\"carousel-menu\"><menu>{items}</menu></div>'","};","","CarouselTouch.ATTRS = {","    /**","     * Position of the menu.","     *","     * @attribute nodeMenuPosition","     * @default 'outside'","     * @type String","     */","    nodeMenuPosition: {","        value: 'outside',","        validator: '_validateNodeMenuPosition'","    }","};","","A.Base.mix(A.Carousel, [CarouselTouch]);","","","}, '3.0.0pr2', {\"requires\": [\"aui-carousel-swipe\", \"base-build\"]});","","}());"]};
}
var __cov_9v8LXVbbOUt7aePY2iYfUw = __coverage__['build/aui-carousel-touch/aui-carousel-touch.js'];
__cov_9v8LXVbbOUt7aePY2iYfUw.s['1']++;YUI.add('aui-carousel-touch',function(A,NAME){__cov_9v8LXVbbOUt7aePY2iYfUw.f['1']++;__cov_9v8LXVbbOUt7aePY2iYfUw.s['2']++;function CarouselTouch(){__cov_9v8LXVbbOUt7aePY2iYfUw.f['2']++;}__cov_9v8LXVbbOUt7aePY2iYfUw.s['3']++;CarouselTouch.prototype={TPL_MENU:'<div class="carousel-menu"><menu>{items}</menu></div>'};__cov_9v8LXVbbOUt7aePY2iYfUw.s['4']++;CarouselTouch.ATTRS={nodeMenuPosition:{value:'outside',validator:'_validateNodeMenuPosition'}};__cov_9v8LXVbbOUt7aePY2iYfUw.s['5']++;A.Base.mix(A.Carousel,[CarouselTouch]);},'3.0.0pr2',{'requires':['aui-carousel-swipe','base-build']});
