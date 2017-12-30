<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>包含动态内容的Tab页</title>
	<s:head theme="ajax"/>
	<link rel="stylesheet" type="text/css" href="<s:url value="/struts/tabs.css"/>" />
</head>
<body>
	<s:url id="rd" value="/random.action"/>
	<s:tabbedPanel id="tabbedpanel" cssStyle="width: 500px; height: 240px;" doLayout="true">
		<s:div id="panel1" label="动态Tab页面一" href="%{#rd}" theme="ajax"/>
		<s:div id="panel1" label="动态Tab页面二" theme="ajax">
			<h2>您最喜欢的图书：</h2>
			<s:div id="panel11"href="%{#rd}" theme="ajax" updateFreq="1000"/>
		</s:div>
		<s:div id="panel2" label="静态Tab页面" theme="ajax">
		<h3>作者简介</h3>
		作者曾任广州电信、广东龙泉科技等公司的技术培训导师，<br>
		现任新东方IT培训广州中心软件教学总监，并兼任广东技术师范学院计算机科学系的兼职副教授。<br>
		现居在广州，如果读者阅读本书有任何问题，都可以发邮件给我。<br>
		</s:div>
		<s:div id="panel3" label="远程表单的Tab页" theme="ajax">
			<div id='show' style="background-color:#bbbbbb;width:240px;height:50px">原始静态文本</div>
			<s:url id="ajaxTest" value="/AjaxTest.action" />
			<s:form action='AjaxTest' method='post' theme='ajax'>
				<s:textfield name="name" label="姓名"/><br/>
				<s:textfield name="age" label="年龄"/><br/>
				<s:submit value="提交" targets="show"/>
			</s:form>
		</s:div>
	</s:tabbedPanel>
</body>
</html>

