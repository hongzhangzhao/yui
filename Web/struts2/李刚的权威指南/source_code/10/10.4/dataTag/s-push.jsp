<%--
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK"/>
<title>ʹ��s:push����ĳ��ֵ����ValueStack��ջ��</title>
</head>
<body>
<h2>ʹ��s:push����ĳ��ֵ����ValueStack��ջ��</h2>
<s:bean name="lee.Person" id="p">
	<s:param name="name" value="'yeeku'"/>
	<s:param name="age" value="29"/>
</s:bean>
<s:push value="#p">
	<s:property value="name"/><br>
	<s:property value="age"/><br>
</s:push>

</body>
</html>
