<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>
<s:i18n name="tmp">
<s:text name="loginPage"/>
</s:i18n>
</title>
</head>
<body>
<s:i18n name="tmp">
<s:form action="Login">
	<s:textfield name="username" key="user"/>
	<s:textfield name="password" key="pass"/>
	<s:submit key="login"/>
</s:form>
</s:i18n>
</body>
</html>
