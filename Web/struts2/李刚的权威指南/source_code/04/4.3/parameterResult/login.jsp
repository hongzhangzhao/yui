<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>转向页面</title>
</head>
<body>
<table width="400" align="center">
<form action="MyAction.action" method="post">
<tr>
<td>转入的目标页面:</td>
<td><input type="text" name="target"/></td>
</tr>
<tr>
<td colspan="2">注意：<br>您应该输入welcome，系统只提供welcome.jsp页面</td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="转入"/></td>
</tr>
</form>
<table>
</body>
</html>
