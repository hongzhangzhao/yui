<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>������̬���ݵ�Tabҳ</title>
	<s:head theme="ajax"/>
	<link rel="stylesheet" type="text/css" href="<s:url value="/struts/tabs.css"/>" />
</head>
<body>
	<s:url id="rd" value="/random.action"/>
	<s:tabbedPanel id="tabbedpanel" cssStyle="width: 500px; height: 240px;" doLayout="true">
		<s:div id="panel1" label="��̬Tabҳ��һ" href="%{#rd}" theme="ajax"/>
		<s:div id="panel1" label="��̬Tabҳ���" theme="ajax">
			<h2>����ϲ����ͼ�飺</h2>
			<s:div id="panel11"href="%{#rd}" theme="ajax" updateFreq="1000"/>
		</s:div>
		<s:div id="panel2" label="��̬Tabҳ��" theme="ajax">
		<h3>���߼��</h3>
		�������ι��ݵ��š��㶫��Ȫ�Ƽ��ȹ�˾�ļ�����ѵ��ʦ��<br>
		�����¶���IT��ѵ�������������ѧ�ܼ࣬�����ι㶫����ʦ��ѧԺ�������ѧϵ�ļ�ְ�����ڡ�<br>
		�־��ڹ��ݣ���������Ķ��������κ����⣬�����Է��ʼ����ҡ�<br>
		</s:div>
		<s:div id="panel3" label="Զ�̱���Tabҳ" theme="ajax">
			<div id='show' style="background-color:#bbbbbb;width:240px;height:50px">ԭʼ��̬�ı�</div>
			<s:url id="ajaxTest" value="/AjaxTest.action" />
			<s:form action='AjaxTest' method='post' theme='ajax'>
				<s:textfield name="name" label="����"/><br/>
				<s:textfield name="age" label="����"/><br/>
				<s:submit value="�ύ" targets="show"/>
			</s:form>
		</s:div>
	</s:tabbedPanel>
</body>
</html>

