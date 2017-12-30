<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>����������ע����Ϣ</title>
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
			errStr += "�����û�����������";
		}
		else if (!/^\w{4,25}$/.test(username))
		{
			errStr += "\n�����û�����������ĸ�����֣��ҳ�����4��25֮��";
		}
		if (pass == "" || pass == null)
		{
			errStr += "\n���������������";
		}
		else if (!/^\w{4,25}$/.test(pass))
		{
			errStr += "\n���������������ĸ�����֣��ҳ�����4��25֮��";
		}

		if (age == "" || age == null)
		{
			errStr += "\n���������������";
		}
		else if (!/^[0-1]?[0-9]?[0-9]$/.test(age))
		{
			errStr += "\n�����������Ϊ�������ұ�����һ����Ч������ֵ";
		}
		if (birth == "" || birth == null)
		{
			errStr += "\n�������ձ�������";
		}
		else if(!/^19\d\d\-[0-1]\d\-[0-3]\d$/.test(birth) && !/^20[0-1]\d\-[0-1]\d\-[0-3]\d$/.test(birth))
		{
			errStr += "\n�������ո�ʽ����ȷ,��ʽ��yyyy-MM-DD";
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

<H1>����������ע����Ϣ</H1>
<font color="red">${requestScope.tip}</font>
<FORM METHOD="POST" ACTION="regist" onSubmit="return validate(this);">
	�û�����<INPUT TYPE="text" NAME="username"><br>
	��&nbsp;&nbsp;�룺<INPUT TYPE="password" NAME="pass"><br>
	��&nbsp;&nbsp;�䣺<INPUT TYPE="text" NAME="age"><br>
	��&nbsp;&nbsp;�գ�<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="ע��">
</FORM>


</body>

</html>