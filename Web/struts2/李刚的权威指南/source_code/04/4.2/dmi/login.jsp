<%@ page language="java" contentType="text/html; charset=GBK"%>
<script>
	function regist()
	{
		targetForm = document.forms[0];
		targetForm.action = "Login!regist.action";
		targetForm.submit();
	}
</script>
<html>
<head>
<title>��½ҳ��</title>
</head>
<body>
<table width="300" align="center">
<form action="Login.action" method="post">
<tr>
<td>�û���:</td>
<td><input type="text" name="username"/></td>
</tr>
<tr>
<td>��&nbsp;&nbsp;��:</td>
<td><input type="text" name="password"/></td>
</tr>
<tr>
<td><input type="submit" value="��½"/></td>
<td><input type="button" value="ע��" onClick="regist();"/></td>
</tr>
</form>
<table>
</body>
</html>
