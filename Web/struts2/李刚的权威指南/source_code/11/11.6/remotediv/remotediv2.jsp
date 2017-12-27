<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Զ��Div</title>
    <s:head theme="ajax"/>
</head>
<script>
	var controller = {
		refresh : function() {alert("�ֶ�ˢ��");},
		start : function() {alert("�����Զ�ˢ��");},
		stop : function() {alert("ֹͣ�Զ�ˢ��");}
	};

	//��controller��refresh����ע���/refresh����ķ�����
	dojo.event.topic.registerPublisher("/refresh", controller, "refresh");
	//��controller��start����ע���/startTimer����ķ�����
	dojo.event.topic.registerPublisher("/startTimer", controller, "start");
	//��controller��stop����ע���/stopTimer����ķ�����
	dojo.event.topic.registerPublisher("/stopTimer", controller, "stop");
	//Ϊafter����ָ��һ���¼�������
    dojo.event.topic.subscribe("/after", function(data, type, e){
		alert('�����������������. ���ڵĹ��������ǣ�' + type);
		//data : text returned
		//type : "before", "load" or "error"
		//e    : request object
    });
</script>
<body>
<form id="form">
	<s:textfield name="data" label="�����"/>
</form>

<input type="button" value="�ֶ�ˢ��" onclick="controller.refresh()">
<input type="button" value="ֹͣ��ʱ��" onclick="controller.stop()">
<input type="button" value="������ʱ��" onclick="controller.start()">
<br>
<s:url id="rd" value="/random.action"/>
ʹ��pub-sub����(ͨ��ָ��listenTopics������)<br>
���ͱ��������(ͨ��ָ��formId="form")<br>
<s:div  id="div1"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
		loadingText="���ڼ��ط���������..."
		listenTopics="/refresh"
		startTimerListenTopics="/startTimer"
		stopTimerListenTopics="/stopTimer"
		updateFreq="9000"
		autoStart="true"
		formId="form"
		notifyTopics="/after">
	��ʼ���ı�
</s:div>
</body>
</html>
