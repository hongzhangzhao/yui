<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>请输入您的注册信息</title>
<SCRIPT LANGUAGE="JavaScript">
	function trim(s)
	{
		return s.replace( /^\s*/, "" ).replace( /\s*$/, "" );
	}

	function validate(form)
	{
		var errStr = "";
		var username = trim(form.username.value);
		var pass = trim(form.pass.value);
		var age = trim(form.age.value);
		var birth = trim(form.birth.value);

		if (username == "" || username == null)
		{
			errStr += "您的用户名必须输入";
		}
		else if (!/^\w{4,25}$/.test(username))
		{
			errStr += "\n您的用户名必须是字母和数字，且长度在4到25之间";
		}
		if (pass == "" || pass == null)
		{
			errStr += "\n您的密码必须输入";
		}
		else if (!/^\w{4,25}$/.test(pass))
		{
			errStr += "\n您的你妈必须是字母和数字，且长度在4到25之间";
		}

		if (age == "" || age == null)
		{
			errStr += "\n您的年龄必须输入";
		}
		else if (!/^[0-1]?[0-9]?[0-9]$/.test(age))
		{
			errStr += "\n您的年龄必须为整数，且必须是一个有效的年龄值";
		}
		if (birth == "" || birth == null)
		{
			errStr += "\n您的生日必须输入";
		}
		else if(!/^19\d\d\-[0-1]\d\-[0-3]\d$/.test(birth) && !/^20[0-1]\d\-[0-1]\d\-[0-3]\d$/.test(birth))
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
<font color="red">${requestScope.tip}</font>
<FORM METHOD="POST" ACTION="regist" onSubmit="return validate(this);">
	用户名：<INPUT TYPE="text" NAME="username"><br>
	密&nbsp;&nbsp;码：<INPUT TYPE="password" NAME="pass"><br>
	年&nbsp;&nbsp;龄：<INPUT TYPE="text" NAME="age"><br>
	生&nbsp;&nbsp;日：<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="注册">
</FORM>


</body>

</html>