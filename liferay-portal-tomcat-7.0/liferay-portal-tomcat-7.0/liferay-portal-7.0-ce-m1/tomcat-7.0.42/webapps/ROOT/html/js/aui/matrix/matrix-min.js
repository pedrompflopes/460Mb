YUI.add("matrix",function(e,t){var n={_rounder:1e5,_round:function(e){return e=Math.round(e*n._rounder)/n._rounder,e},rad2deg:function(e){var t=e*(180/Math.PI);return t},deg2rad:function(e){var t=e*(Math.PI/180);return t},angle2rad:function(e){return typeof e=="string"&&e.indexOf("rad")>-1?e=parseFloat(e):e=n.deg2rad(parseFloat(e)),e},convertTransformToArray:function(e){var t=[[e.a,e.c,e.dx],[e.b,e.d,e.dy],[0,0,1]];return t},getDeterminant:function(e){var t=0,r=e.length,i=0,s;if(r==2)return e[0][0]*e[1][1]-e[0][1]*e[1][0];for(;i<r;++i)s=e[i][0],i%2===0||i===0?t+=s*n.getDeterminant(n.getMinors(e,i,0)):t-=s*n.getDeterminant(n.getMinors(e,i,0));return t},inverse:function(e){var t=0,r=e.length,i=0,s,o,u=[],a=[];if(r===2)t=e[0][0]*e[1][1]-e[0][1]*e[1][0],o=[[e[1][1]*t,-e[1][0]*t],[-e[0][1]*t,e[0][0]*t]];else{t=n.getDeterminant(e);for(;i<r;++i){u[i]=[];for(s=0;s<r;++s)a=n.getMinors(e,s,i),u[i][s]=n.getDeterminant(a),(i+s)%2!==0&&i+s!==0&&(u[i][s]*=-1)}o=n.scalarMultiply(u,1/t)}return o},scalarMultiply:function(e,t){var r=0,i,s=e.length;for(;r<s;++r)for(i=0;i<s;++i)e[r][i]=n._round(e[r][i]*t);return e},transpose:function(e){var t=e.length,n=0,r=0,i=[];for(;n<t;++n){i[n]=[];for(r=0;r<t;++r)i[n].push(e[r][n])}return i},getMinors:function(e,t,n){var r=[],i=e.length,s=0,o,u;for(;s<i;++s)if(s!==t){u=[];for(o=0;o<i;++o)o!==n&&u.push(e[s][o]);r.push(u)}return r},sign:function(e){return e===0?1:e/Math.abs(e)},vectorMatrixProduct:function(e,t){var n,r,i=e.length,s=[],o;for(n=0;n<i;++n){o=0;for(r=0;r<i;++r)o+=e[n]*t[n][r];s[n]=o}return s},decompose:function(e){var t=parseFloat(e[0][0]),r=parseFloat(e[1][0]),i=parseFloat(e[0][1]),s=parseFloat(e[1][1]),o=parseFloat(e[0][2]),u=parseFloat(e[1][2]),a,f,l,c;return t*s-r*i===0?!1:(f=n._round(Math.sqrt(t*t+r*r)),t/=f,r/=f,c=n._round(t*i+r*s),i-=t*c,s-=r*c,l=n._round(Math.sqrt(i*i+s*s)),i/=l,s/=l,c/=l,c=n._round(n.rad2deg(Math.atan(c))),a=n._round(n.rad2deg(Math.atan2(e[1][0],e[0][0]))),[["translate",o,u],["rotate",a],["skewX",c],["scale",f,l]])},getTransformArray:function(e){var t=/\s*([a-z]*)\(([\w,\.,\-,\s]*)\)/gi,r=[],i,s,o,u=n.transformMethods;while(s=t.exec(e))u.hasOwnProperty(s[1])?(i=s[2].split(","),i.unshift(s[1]),r.push(i)):s[1]=="matrix"&&(i=s[2].split(","),o=n.decompose([[i[0],i[2],i[4]],[i[1],i[3],i[5]],[0,0,1]]),r.push(o[0]),r.push(o[1]),r.push(o[2]),r.push(o[3]));return r},getTransformFunctionArray:function(e){var t;switch(e){case"skew":t=[e,0,0];break;case"scale":t=[e,1,1];break;case"scaleX":t=[e,1];break;case"scaleY":t=[e,1];break;case"translate":t=[e,0,0];break;default:t=[e,0]}return t},compareTransformSequence:function(e,t){var n=0,r=e.length,i=t.length,s=r===i;if(s)for(;n<r;++n)if(e[n][0]!=t[n][0]){s=!1;break}return s},transformMethods:{rotate:"rotate",skew:"skew",skewX:"skewX",skewY:"skewY",translate:"translate",translateX:"translateX",translateY:"tranlsateY",scale:"scale",scaleX:"scaleX",scaleY:"scaleY"}};e.MatrixUtil=n;var r=function(e){this.init(e)};r.prototype={_rounder:1e5,multiply:function(e,t,n,r,i,s){var o=this,u=o.a*e+o.c*t,a=o.b*e+o.d*t,f=o.a*n+o.c*r,l=o.b*n+o.d*r,c=o.a*i+o.c*s+o.dx,h=o.b*i+o.d*s+o.dy;return o.a=this._round(u),o.b=this._round(a),o.c=this._round(f),o.d=this._round(l),o.dx=this._round(c),o.dy=this._round(h),this},applyCSSText:function(e){var t=/\s*([a-z]*)\(([\w,\.,\-,\s]*)\)/gi,n,r;e=e.replace(/matrix/g,"multiply");while(r=t.exec(e))typeof this[r[1]]=="function"&&(n=r[2].split(","),this[r[1]].apply(this,n))},getTransformArray:function(e){var t=/\s*([a-z]*)\(([\w,\.,\-,\s]*)\)/gi,n=[],r,i;e=e.replace(/matrix/g,"multiply");while(i=t.exec(e))typeof this[i[1]]=="function"&&(r=i[2].split(","),r.unshift(i[1]),n.push(r));return n},_defaults:{a:1,b:0,c:0,d:1,dx:0,dy:0},_round:function(e){return e=Math.round(e*this._rounder)/this._rounder,e},init:function(e){var t=this._defaults,n;e=e||{};for(n in t)t.hasOwnProperty(n)&&(this[n]=n in e?e[n]:t[n]);this._config=e},scale:function(e,t){return this.multiply(e,0,0,t,0,0),this},skew:function(e,t){return e=e||0,t=t||0,e!==undefined&&(e=Math.tan(this.angle2rad(e))),t!==undefined&&(t=Math.tan(this.angle2rad(t))),this.multiply(1,t,e,1,0,0),this},skewX:function(e){return this.skew(e),this},skewY:function(e){return this.skew(null,e),this},toCSSText:function(){var e=this,t="matrix("+e.a+","+e.b+","+e.c+","+e.d+","+e.dx+","+e.dy+")";return t},toFilterText:function(){var e=this,t="progid:DXImageTransform.Microsoft.Matrix(";return t+="M11="+e.a+","+"M21="+e.b+","+"M12="+e.c+","+"M22="+e.d+","+'sizingMethod="auto expand")',t+="",t},rad2deg:function(e){var t=e*(180/Math.PI);return t},deg2rad:function(e){var t=e*(Math.PI/180);return t},angle2rad:function(e){return typeof e=="string"&&e.indexOf("rad")>-1?e=parseFloat(e):e=this.deg2rad(parseFloat(e)),e},rotate:function(e,t,n){var r=this.angle2rad(e),i=Math.sin(r),s=Math.cos(r);return this.multiply(s,i,0-i,s,0,0),this},translate:function(e,t){return e=parseFloat(e)||0,t=parseFloat(t)||0,this.multiply(1,0,0,1,e,t),this},translateX:function(e){return this.translate(e),this},translateY:function(e){return this.translate(null,e),this},identity:function(){var e=this._config,t=this._defaults,n;for(n in e)n in t&&(this[n]=t[n]);return this},getMatrixArray:function(){var e=this,t=[[e.a,e.c,e.dx],[e.b,e.d,e.dy],[0,0,1]];return t},getContentRect:function(e,t,n,r){var i=isNaN(n)?0:n,s=isNaN(r)?0:r,o=i+e,u=s+t,a=this,f=a.a,l=a.b,c=a.c,h=a.d,p=a.dx,d=a.dy,v=f*i+c*s+p,m=l*i+h*s+d,g=f*o+c*s+p,y=l*o+h*s+d,b=f*i+c*u+p,w=l*i+h*u+d,E=f*o+c*u+p,S=l*o+h*u+d;return{left:Math.min(b,Math.min(v,Math.min(g,E))),right:Math.max(b,Math.max(v,Math.max(g,E))),top:Math.min(y,Math.min(S,Math.min(w,m))),bottom:Math.max(y,Math.max(S,Math.max(w,m)))}},getDeterminant:function(){return e.MatrixUtil.getDeterminant(this.getMatrixArray())},inverse:function(){return e.MatrixUtil.inverse(this.getMatrixArray())},transpose:function(){return e.MatrixUtil.transpose(this.getMatrixArray())},decompose:function(){return e.MatrixUtil.decompose(this.getMatrixArray())}},e.Matrix=r},"patched-v3.17.0",{requires
:["yui-base"]});
