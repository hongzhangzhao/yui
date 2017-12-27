<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>请输入您的注册信息</title>
<SCRIPT LANGUAGE="JavaScript">
	function check(form)
	{
		var errStr = "";
		if (form.username.value == "" || form.username.value == null)
		{
			errStr += "您的用户名必须输入";
		}
		if (form.pass.value == "" || form.pass.value == null)
		{
			errStr += "\n您的密码必须输入";
		}
		if (form.age.value == "" || form.age.value == null)
		{
			errStr += "\n您的年龄必须输入";
		}
		else if (!/^\d+$/.test(form.age.value ))
		{
			errStr += "\n您的年龄必须为整数";
		}
		if (form.birth.value == "" || form.birth.value == null)
		{
			errStr += "\n您的生日必须输入";
		}
		else if(!/^19\d\d\-[0-1]\d\-[0-3]\d$/.test(form.birth.value) && !/^20[0-1]\d\-[0-1]\d\-[0-3]\d$/.test(form.birth.value))
		{
			errStr += "\n您的生日格式不正确,格式：yyyy-MM-DD";
		}

		if (errStr == "")
		{
			return true;
		}
		else
		{
			alert(errStr);
			return false;
		}
	}
</SCRIPT>

</head>


<body>

<H1>请输入您的注册信息</H1>
<font color="red">
<%
if (request.getAttribute("error") != null) 
	out.println(request.getAttribute("error"));

%>
</font>
<FORM METHOD=POST ACTION="regist" onsubmit="//return check(this);">
	用户名：<INPUT TYPE="text" NAME="username"><br>
	密&nbsp;&nbsp;码：<INPUT TYPE="password" NAME="pass"><br>
	年&nbsp;&nbsp;龄：<INPUT TYPE="text" NAME="age"><br>
	生&nbsp;&nbsp;日：<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="注册">
</FORM>


</body>

</html>