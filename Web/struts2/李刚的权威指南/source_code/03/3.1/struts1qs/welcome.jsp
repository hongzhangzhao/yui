<%@ page contentType="text/html;charset=gb2312" errorPage="error.jsp"%>
<!--  导入Struts的三个标签库-->
<%@include file="taglibs.jsp"%>
<html>
<head>
<title><bean:message key="loginSuccess"/></title>
</head>
<body>
<h3><bean:message key="loginSuccess"/></h3>
<hr>
<bean:message key="welcome" arg0="${loginForm.username}"/>

</body>
</html>