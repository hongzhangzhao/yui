<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<title>����������ע����Ϣ</title>

</head>


<body>
<H1>����������ע����Ϣ</H1>
<s:fielderror/>
<FORM METHOD="POST" ACTION="regist.action">
	�û�����<INPUT TYPE="text" NAME="user.name"><br>
	��&nbsp;&nbsp;�룺<INPUT TYPE="text" NAME="user.pass"><br>
	��&nbsp;&nbsp;�䣺<INPUT TYPE="text" NAME="user.age"><br>
	��&nbsp;&nbsp;�գ�<INPUT TYPE="text" NAME="user.birth"><p>
	<INPUT TYPE="submit" value="ע��">
</FORM>


</body>

</html>