<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<title>请输入您的注册信息</title>

</head>


<body>
<H1>请输入您的注册信息</H1>
<s:form validate="true" action="login">
    <s:textfield label="用户名" name="name"/>
    <s:password label="密码" name="pass"/>
    <s:textfield label="年龄" name="age"/>
    <s:textfield label="生日" name="birth"/>
    <s:submit/>
</s:form>

</body>

</html>