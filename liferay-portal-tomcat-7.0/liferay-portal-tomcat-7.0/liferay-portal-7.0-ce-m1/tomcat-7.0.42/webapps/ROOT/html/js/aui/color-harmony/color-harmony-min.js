YUI.add("color-harmony",function(e,t){var n="hsl",r="rgb",s=30,o=10,u=120,a=60,f=90,l=5,c=10,h=e.Color,p={getComplementary:function(e,t){var n=p._start(e),r=[];return t=t||h.findType(e),r.push({}),r.push({h:180}),p._adjustOffsetAndFinish(n,r,t)},getSplit:function(e,t,n){var r=p._start(e),i=[];return t=t||s,n=n||h.findType(e),i.push({}),i.push({h:180+t}),i.push({h:180-t}),p._adjustOffsetAndFinish(r,i,n)},getAnalogous:function(e,t,n){var r=p._start(e),i=[];return t=t||o,n=n||h.findType(e),i.push({}),i.push({h:t}),i.push({h:t*2}),i.push({h:-t}),i.push({h:-t*2}),p._adjustOffsetAndFinish(r,i,n)},getTriad:function(e,t){var n=p._start(e),r=[];return t=t||h.findType(e),r.push({}),r.push({h:u}),r.push({h:-u}),p._adjustOffsetAndFinish(n,r,t)},getTetrad:function(e,t,n){var r=p._start(e),i=[];return t=t||a,n=n||h.findType(e),i.push({}),i.push({h:t}),i.push({h:180}),i.push({h:180+t}),p._adjustOffsetAndFinish(r,i,n)},getSquare:function(e,t){var n=p._start(e),r=[];return t=t||h.findType(e),r.push({}),r.push({h:f}),r.push({h:f*2}),r.push({h:f*3}),p._adjustOffsetAndFinish(n,r,t)},getMonochrome:function(e,t,n){var r=p._start(e),i=[],s=0,o,u,a=r.concat();t=t||l,n=n||h.findType(e);if(t<2)return e;u=100/(t-1);for(;s<=100;s+=u)a[2]=Math.max(Math.min(s,100),0),i.push(a.concat());o=i.length;for(s=0;s<o;s++)i[s]=p._finish(i[s],n);return i},getSimilar:function(e,t,n,r){var s=p._start(e),o=[],u,a=+s[1],f,d,v,m=+s[2],g,y,b;r=r||h.findType(e),n=n||l,t=t||c,u=t>100?100:t,f=Math.max(0,a-u),d=Math.min(100,a+u),g=Math.max(0,m-u),y=Math.min(100,m+u),o.push({});for(i=0;i<n;i++)v=Math.round(Math.random()*(d-f)+f),b=Math.round(Math.random()*(y-g)+g),o.push({h:Math.random()*t*2-t,s:-(a-v),l:-(m-b)});return p._adjustOffsetAndFinish(s,o,r)},getOffset:function(t,n,r){var i=e.Lang.isArray(t),s,o;return i?(s=t,o="hsl"):(s=p._start(t),o=h.findType(t)),r=r||o,n.h&&(s[0]=(+s[0]+n.h)%360),n.s&&(s[1]=Math.max(Math.min(+s[1]+n.s,100),0)),n.l&&(s[2]=Math.max(Math.min(+s[2]+n.l,100),0)),i?s:p._finish(s,r)},getBrightness:function(t){var n=h.toArray(h._convertTo(t,r)),i=n[0],s=n[1],o=n[2],u=e.Color._brightnessWeights;return Math.round(Math.sqrt(i*i*u.r+s*s*u.g+o*o*u.b)/255*100)},getSimilarBrightness:function(t,r,i){var s=h.toArray(h._convertTo(t,n)),o=p.getBrightness(r);return i=i||h.findType(t),i==="keyword"&&(i="hex"),s[2]=p._searchLuminanceForBrightness(s,o,0,100),t=h.fromArray(s,e.Color.TYPES.HSLA),h._convertTo(t,i)},_start:function(e){var t=h.toArray(h._convertTo(e,n));return t[0]=p._toSubtractive(t[0]),t},_finish:function(e,t){return e[0]=p._toAdditive(e[0]),e="hsla("+e[0]+", "+e[1]+"%, "+e[2]+"%, "+e[3]+")",t==="keyword"&&(t="hex"),h._convertTo(e,t)},_toAdditive:function(t){return t=e.Color._constrainHue(t),t<=180?t/=1.5:t<240&&(t=120+(t-180)*2),e.Color._constrainHue(t,10)},_toSubtractive:function(t){return t=e.Color._constrainHue(t),t<=120?t*=1.5:t<240&&(t=180+(t-120)/2),e.Color._constrainHue(t,10)},_constrainHue:function(e,t){while(e<0)e+=360;return e%=360,t&&(e=Math.round(e*t)/t),e},_brightnessWeights:{r:.221,g:.711,b:.068},_searchLuminanceForBrightness:function(t,n,r,i){var s=(i+r)/2,o;return t[2]=s,o=p.getBrightness(h.fromArray(t,e.Color.TYPES.HSL)),o+2>n&&o-2<n?s:o>n?p._searchLuminanceForBrightness(t,n,r,s):p._searchLuminanceForBrightness(t,n,s,i)},_adjustOffsetAndFinish:function(e,t,n){var r=[],i,s=t.length,o;for(i=0;i<s;i++)o=e.concat(),t[i]&&(o=p.getOffset(o,t[i])),r.push(p._finish(o,n));return r}};e.Color=e.mix(e.Color,p)},"patched-v3.17.0",{requires:["color-hsl"]});
