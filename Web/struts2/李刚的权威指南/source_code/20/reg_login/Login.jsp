<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>用户登陆</title>
	</head>
	<body>
		<center>
		<h3>请输入用户名和密码来登陆</h3>
		如果还没有注册，单击此处<a href="Regist.jsp">注册</a>
		<s:actionerror/>
		<s:form action="Login.action">
			<s:textfield name="user" label="用户名"/>
			<s:textfield name="pass" label="密码"/>
			<s:textfield name="vercode" label="验证码" value=""/>
			<s:submit value="登陆"/>
		</s:form>
		验证码如图：<img src="authImg" id="authImg"/>看不清？<a href="#" onClick="refresh()">单击此处刷新</a>
		</center>
	</body>
</html>