<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>商业拍卖J2EE程序框架</title>
</head>
<body>
<TABLE width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
</tr>
<tr>
<td>
请输入用户名和密码来登陆<br>
<s:actionerror cssClass="error"/>
<s:form action="processLogin.action">
	<s:textfield name="username" label="用户名"/>
	<s:textfield name="password" label="密码"/>
	<s:textfield name="vercode" label="验证码"/>
	<s:submit/>
</s:form>
验证码：<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>