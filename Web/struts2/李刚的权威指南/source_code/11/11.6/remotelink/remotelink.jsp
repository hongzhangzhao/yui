<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>远程链结</title>
	<s:head theme="ajax"/>
</head>

<script type="text/javascript">
	function before() {alert("before request");}
	function after() {alert("after request");}
	function handler(widget, node) 
	{
		alert('本地自定义函数');
		dojo.byId(widget.targetsArray[0]).innerHTML = "Spring2.0宝典";
	}

    dojo.event.topic.subscribe("/after", function(data, type, e){
      alert('正处于Dojo的异步交互过程中，类型是：'+type);
      //data : text returned
      //type : "before", "load" or "error"
      //e    : request object
   });
</script>

<body>
<div id="t1" style="background-color:#bbbbbb;width:360px;height:80px">Div 1</div>
<br/>
<div id="t2" style="background-color:#bbbbbb;width:360px;height:80px">Div 2</div>
<br/>

<s:url id="ajaxTest" value="/AjaxTest.action" />
<s:url id="test3" value="/Test3.action" />
<br/>
同时修改Div1和Div2的内容<br/>
且将事件发布到/after主题(指定notifyTopics属性)<br/>
<s:a    id="link1"   
		theme="ajax"
        href="%{ajaxTest}"
        indicator="indicator"
		targets="t1,t2" notifyTopics="/after" >修改Div1和Div2内容</s:a>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<br/>
指定服务期返回失败时的错误提示(指定errorText属性)<br/>
因为系统中AjaxNoUrl.jsp页面不存在，肯定出错！<br/>
<s:a	id="link2"
        theme="ajax"
        href="/AjaxNoUrl.jsp"
		errorText="系统服务器返回信息出错"
		targets="t1">修改'Div 1'内容，使用自定义出错提示</s:a>
<br/>
指定系统加载中的提示信息(指定loadingText属性)<br/>
<s:a    id="link3"
        theme="ajax"
        href="%{ajaxTest}"
		loadingText="系统正在加载中..."
		targets="t1">修改'Div 1'内容，使用自定义加载信息</s:a>
<br/>
执行远程JavaScript代码(指定executeScripts＝true属性)<br/>
<s:a    id="link4"
        theme="ajax"
        href="%{test3}"
		executeScripts="true"
		targets="t2">接执行远程JavaScript</s:a>
<br/>
通过使用自定义JavaScript函数来实现Ajax交互(指定handle属性)<br/>
<s:a    id="link5"
        theme="ajax"
        href="%{ajaxTest}"
		handler="handler"
		targets="t2">使用自定义的处理函数</s:a>
<form id="form">
  <input type=textbox name="data">
</form>
提交表单请求(通过指定formId属性)
<s:a    id="link6"
        theme="ajax"
        href="%{ajaxTest}"
		targets="t2"
		formId="form">Div 2 会显示在上面文本框中输入的内容</s:a>
</body>
</html>
