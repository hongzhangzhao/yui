<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>登录页面</title>
<s:head/>
</head>
<body>
请输入用户名和密码来登陆<br>
<s:form action="Login" namespace="/test">
	<s:textfield name="username" label="用户名"/>
	<s:textfield name="password" label="密  码"/>
	<s:submit value="登陆"/>
</s:form>
</body>
</html>
