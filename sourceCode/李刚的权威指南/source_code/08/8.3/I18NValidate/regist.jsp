<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>

<title>����������ע����Ϣ</title>

</head>


<body>
<H1>����������ע����Ϣ</H1>
<s:fielderror/>
<FORM METHOD="POST" ACTION="regist.action">
	�û�����<INPUT TYPE="text" NAME="name"><br>
	��&nbsp;&nbsp;�룺<INPUT TYPE="text" NAME="pass"><br>
	��&nbsp;&nbsp;�䣺<INPUT TYPE="text" NAME="age"><br>
	��&nbsp;&nbsp;�գ�<INPUT TYPE="text" NAME="birth"><p>
	<INPUT TYPE="submit" value="ע��">
</FORM>


</body>

</html>