<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] />
<html>
<head>
<title>��¼ҳ��</title>
</head>
<body>
�������û�������������½<br>
<@s.form action="Login.action">
	<@s.textfield name="username" label="�û���"/>
	<@s.textfield name="password" label="����"/>
	<@s.submit value="�ύ"/>
</@s.form>
</body>
</html>
