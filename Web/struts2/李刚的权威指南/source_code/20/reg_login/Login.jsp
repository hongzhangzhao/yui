<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�û���½</title>
	</head>
	<body>
		<center>
		<h3>�������û�������������½</h3>
		�����û��ע�ᣬ�����˴�<a href="Regist.jsp">ע��</a>
		<s:actionerror/>
		<s:form action="Login.action">
			<s:textfield name="user" label="�û���"/>
			<s:textfield name="pass" label="����"/>
			<s:textfield name="vercode" label="��֤��" value=""/>
			<s:submit value="��½"/>
		</s:form>
		��֤����ͼ��<img src="authImg" id="authImg"/>�����壿<a href="#" onClick="refresh()">�����˴�ˢ��</a>
		</center>
	</body>
</html>