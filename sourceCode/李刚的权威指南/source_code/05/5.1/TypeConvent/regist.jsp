<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>请输入您的注册信息</title>

</head>


<body>

<H1>请输入您的注册信息</H1>
<font color="red">
<%
if (request.getAttribute("error") != null) 
	out.println(request.getAttribute("error"));

%>
</font>
<FORM METHOD=POST ACTION="regist">
	用户名：<INPUT TYPE="text" NAME="username"><br>
	密&nbsp;&nbsp;码：<INPUT TYPE="password" NAME="pass"><br>
	年&nbsp;&nbsp;龄：<INPUT TYPE="text" NAME="age"><br>
	生&nbsp;&nbsp;日：<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="注册">
</FORM>


</body>

</html>