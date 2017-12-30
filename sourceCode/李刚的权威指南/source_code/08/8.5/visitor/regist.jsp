<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<title>请输入您的注册信息</title>

</head>


<body>
<H1>请输入您的注册信息</H1>
<s:fielderror/>
<FORM METHOD="POST" ACTION="regist.action">
	用户名：<INPUT TYPE="text" NAME="user.name"><br>
	密&nbsp;&nbsp;码：<INPUT TYPE="text" NAME="user.pass"><br>
	年&nbsp;&nbsp;龄：<INPUT TYPE="text" NAME="user.age"><br>
	生&nbsp;&nbsp;日：<INPUT TYPE="text" NAME="user.birth"><p>
	<INPUT TYPE="submit" value="注册">
</FORM>


</body>

</html>