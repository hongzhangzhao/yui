<%@ page contentType="text/html;charset=gb2312" errorPage="error.jsp"%>
<!--  ����Struts��������ǩ��-->
<%@include file="taglibs.jsp"%>
<html>
<head>
<title><bean:message key="loginFail"/></title>
</head>
<body>
<h3><bean:message key="loginFail"/></h3>
<hr>
<bean:message key="fail" arg0="${loginForm.username}"/>
</body>
</html>