<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>����������ע����Ϣ</title>

</head>


<body>

<H1>����������ע����Ϣ</H1>
<font color="red">
<%
if (request.getAttribute("error") != null) 
	out.println(request.getAttribute("error"));

%>
</font>
<FORM METHOD=POST ACTION="regist">
	�û�����<INPUT TYPE="text" NAME="username"><br>
	��&nbsp;&nbsp;�룺<INPUT TYPE="password" NAME="pass"><br>
	��&nbsp;&nbsp;�䣺<INPUT TYPE="text" NAME="age"><br>
	��&nbsp;&nbsp;�գ�<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="ע��">
</FORM>


</body>

</html>