<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>����������ע����Ϣ</title>
<SCRIPT LANGUAGE="JavaScript">
	function check(form)
	{
		var errStr = "";
		if (form.username.value == "" || form.username.value == null)
		{
			errStr += "�����û�����������";
		}
		if (form.pass.value == "" || form.pass.value == null)
		{
			errStr += "\n���������������";
		}
		if (form.age.value == "" || form.age.value == null)
		{
			errStr += "\n���������������";
		}
		else if (!/^\d+$/.test(form.age.value ))
		{
			errStr += "\n�����������Ϊ����";
		}
		if (form.birth.value == "" || form.birth.value == null)
		{
			errStr += "\n�������ձ�������";
		}
		else if(!/^19\d\d\-[0-1]\d\-[0-3]\d$/.test(form.birth.value) && !/^20[0-1]\d\-[0-1]\d\-[0-3]\d$/.test(form.birth.value))
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
<font color="red">
<%
if (request.getAttribute("error") != null) 
	out.println(request.getAttribute("error"));

%>
</font>
<FORM METHOD=POST ACTION="regist" onsubmit="//return check(this);">
	�û�����<INPUT TYPE="text" NAME="username"><br>
	��&nbsp;&nbsp;�룺<INPUT TYPE="password" NAME="pass"><br>
	��&nbsp;&nbsp;�䣺<INPUT TYPE="text" NAME="age"><br>
	��&nbsp;&nbsp;�գ�<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="ע��">
</FORM>


</body>

</html>