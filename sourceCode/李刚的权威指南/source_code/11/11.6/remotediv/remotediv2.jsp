<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>远程Div</title>
    <s:head theme="ajax"/>
</head>
<script>
	var controller = {
		refresh : function() {alert("手动刷新");},
		start : function() {alert("启动自动刷新");},
		stop : function() {alert("停止自动刷新");}
	};

	//将controller的refresh方法注册成/refresh主题的发布者
	dojo.event.topic.registerPublisher("/refresh", controller, "refresh");
	//将controller的start方法注册成/startTimer主题的发布者
	dojo.event.topic.registerPublisher("/startTimer", controller, "start");
	//将controller的stop方法注册成/stopTimer主题的发布者
	dojo.event.topic.registerPublisher("/stopTimer", controller, "stop");
	//为after主题指定一个事件处理函数
    dojo.event.topic.subscribe("/after", function(data, type, e){
		alert('与服务器交互过程中. 现在的过程类型是：' + type);
		//data : text returned
		//type : "before", "load" or "error"
		//e    : request object
    });
</script>
<body>
<form id="form">
	<s:textfield name="data" label="输入框"/>
</form>

<input type="button" value="手动刷新" onclick="controller.refresh()">
<input type="button" value="停止计时器" onclick="controller.stop()">
<input type="button" value="启动计时器" onclick="controller.start()">
<br>
<s:url id="rd" value="/random.action"/>
使用pub-sub机制(通过指定listenTopics等属性)<br>
发送表单请求参数(通过指定formId="form")<br>
<s:div  id="div1"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
		loadingText="正在加载服务器内容..."
		listenTopics="/refresh"
		startTimerListenTopics="/startTimer"
		stopTimerListenTopics="/stopTimer"
		updateFreq="9000"
		autoStart="true"
		formId="form"
		notifyTopics="/after">
	初始化文本
</s:div>
</body>
</html>
