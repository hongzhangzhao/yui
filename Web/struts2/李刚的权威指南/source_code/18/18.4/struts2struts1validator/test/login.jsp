<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>��¼ҳ��</title>
<s:head/>
</head>
<body>
�������û�������������½<br>
<s:form action="Login" namespace="/test">
	<s:textfield name="username" label="�û���"/>
	<s:textfield name="password" label="��  ��"/>
	<s:submit value="��½"/>
</s:form>
</body>
</html>
