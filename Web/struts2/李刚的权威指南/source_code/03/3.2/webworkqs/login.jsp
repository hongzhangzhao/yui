<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="ww" uri="/webwork"%>
<html>
<head>
	<title><ww:text name="loginTitle"/></title>
</head>
<body>
<ww:text name="loginTitle"/>
<hr>
<ww:form method="post" action="login">
	<ww:textfield name="user" label="%{getText('user')}"/>
	<ww:textfield name="pass" label="%{getText('pass')}"/>
	<ww:submit value="%{getText('submit')}"/>
</ww:form> 
</body> 
</html>