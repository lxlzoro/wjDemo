webpackJsonp([1],{LWl9:function(e,t){},NHnr:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=n("7+uW"),a={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{attrs:{id:"app"}},[t("router-view")],1)},staticRenderFns:[]};var r=n("VU/8")({name:"App"},a,!1,function(e){n("LWl9")},null,null).exports,i=n("/ocq"),s={render:function(){var e=this.$createElement;return(this._self._c||e)("div",[this._v("\n  Hello world！！\n")])},staticRenderFns:[]};var l=n("VU/8")({name:"AppIndex"},s,!1,function(e){n("m0+2")},"data-v-2cf625d0",null).exports,u={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("body",{attrs:{id:"poster"}},[n("el-form",{staticClass:"login-container",attrs:{"label-position":"left","label-width":"0px"}},[n("h3",{staticClass:"login-title"},[e._v("系统登录")]),e._v(" "),n("el-form-item",[n("el-input",{attrs:{type:"text","auto-complete":"off",placeholder:"账号"},model:{value:e.loginForm.username,callback:function(t){e.$set(e.loginForm,"username",t)},expression:"loginForm.username"}})],1),e._v(" "),n("el-form-item",[n("el-input",{attrs:{type:"password","auto-complete":"off",placeholder:"密码"},model:{value:e.loginForm.password,callback:function(t){e.$set(e.loginForm,"password",t)},expression:"loginForm.password"}})],1),e._v(" "),n("el-form-item",{staticStyle:{width:"100%"}},[n("el-button",{staticStyle:{width:"100%",background:"#505458",border:"none"},attrs:{type:"primary"},on:{click:e.login}},[e._v("登录")])],1)],1)],1)},staticRenderFns:[]};var p=n("VU/8")({name:"Login",data:function(){return{loginForm:{username:"admin",password:"123"},responseResult:[]}},methods:{login:function(){var e=this;this.$axios.post("/login",{username:this.loginForm.username,password:this.loginForm.password}).then(function(t){200===t.data.code&&e.$router.replace({path:"/index"})}).catch(function(e){})}}},u,!1,function(e){n("RB/n")},null,null).exports;o.default.use(i.a);var c=new i.a({mode:"history",routes:[{path:"/login",name:"Login",component:p},{path:"/index",name:"AppIndex",component:l}]}),d=n("zL8q"),m=n.n(d),f=(n("tvR6"),n("mtWM")),h=n.n(f);h.a.defaults.baseURL="http://192.168.5.111:8443/api",h.a.defaults.withCredentials=!0,o.default.prototype.$axios=h.a,o.default.config.productionTip=!1,o.default.use(m.a),new o.default({el:"#app",router:c,components:{App:r},template:"<App/>"})},"RB/n":function(e,t){},"m0+2":function(e,t){},tvR6:function(e,t){}},["NHnr"]);
//# sourceMappingURL=app.bc87f051caff73730ca3.js.map