<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<title>����������ע����Ϣ</title>

</head>


<body>
<H1>����������ע����Ϣ</H1>
<s:form validate="true" action="login">
    <s:textfield label="�û���" name="name"/>
    <s:password label="����" name="pass"/>
    <s:textfield label="����" name="age"/>
    <s:textfield label="����" name="birth"/>
    <s:submit/>
</s:form>

</body>

</html>