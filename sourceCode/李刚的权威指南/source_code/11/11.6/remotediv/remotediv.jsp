<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Զ��Div</title>
    <s:head theme="ajax"/>
</head>
<body>
<s:url id="rd" value="/random.action" />
��һ�λ�ȡ���������ݵ�Div<br>
<s:div  id="div1"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}">
	��ʼ���ı�
</s:div>
��̬�������ݵ�Div��ÿ��1sˢ��һ��(ͨ��ָ��updateFreq="1000")<br>
ʹ��indicator(ͨ��ָ��indicator="indicator")<br>
<s:div  id="div2"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
        updateFreq="1000"
        indicator="indicator">
	��ʼ���ı�
</s:div>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/><br>
3s֮��ſ�ʼ����(ͨ��ָ��delay="3000")<br>
ָ��������������������ʾ(ͨ��ָ��errorText����)<br>
ָ������������������е���ʾ(ͨ��ָ��loadText����)<br>
<s:div  id="div3"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
        updateFreq="1000"
		delay="3000"
		errorText="���ط��������ݳ���"
		loadingText="���ڼ��ط���������">
	��ʼ���ı�
</s:div>
ָ����ʾϵͳ������ʾ(ͨ��ָ��showErrorTransportText="true")<br>
<s:div  id="div4"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="/AjaxNoUrl.jsp"
        updateFreq="1000"
		showErrorTransportText="true"
		loadingText="���ڼ��ط���������">
	��ʼ���ı�
</s:div>
ִ�з������ű�(ͨ��ָ��executeScripts="true")
<s:url id="test" value="/Test3.action" />
<s:div  id="div5"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{test}"
        updateFreq="9000"
		executeScripts="true"
		loadingText="���ڼ��ط���������">
	��ʼ���ı�
</s:div>
</body>
</html>
