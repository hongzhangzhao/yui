<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>远程Div</title>
    <s:head theme="ajax"/>
</head>
<body>
<s:url id="rd" value="/random.action" />
仅一次获取服务器内容的Div<br>
<s:div  id="div1"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}">
	初始化文本
</s:div>
动态更新内容的Div，每隔1s刷新一次(通过指定updateFreq="1000")<br>
使用indicator(通过指定indicator="indicator")<br>
<s:div  id="div2"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
        updateFreq="1000"
        indicator="indicator">
	初始化文本
</s:div>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/><br>
3s之后才开始更新(通过指定delay="3000")<br>
指定与服务器交互出错的提示(通过指定errorText属性)<br>
指定与服务器交互过程中的提示(通过指定loadText属性)<br>
<s:div  id="div3"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
        updateFreq="1000"
		delay="3000"
		errorText="加载服务器数据出错"
		loadingText="正在加载服务器内容">
	初始化文本
</s:div>
指定显示系统出错提示(通过指定showErrorTransportText="true")<br>
<s:div  id="div4"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="/AjaxNoUrl.jsp"
        updateFreq="1000"
		showErrorTransportText="true"
		loadingText="正在加载服务器内容">
	初始化文本
</s:div>
执行服务器脚本(通过指定executeScripts="true")
<s:url id="test" value="/Test3.action" />
<s:div  id="div5"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{test}"
        updateFreq="9000"
		executeScripts="true"
		loadingText="正在加载服务器内容">
	初始化文本
</s:div>
</body>
</html>
