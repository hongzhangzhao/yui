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
<title>ʹ��s:set����һ���±���</title>
</head>
<body>
<h2>ʹ��s:set����һ���±���</h2>
<s:bean name="lee.Person" id="p">
	<s:param name="name" value="'yeeku'"/>
	<s:param name="age" value="29"/>
</s:bean>
��Stack Context�е�pֵ����Ĭ�Ϸ�Χ�ڡ�<br>
<s:set value="#p" name="xxx"/>
<s:property value="#xxx.name"/><br>
<s:property value="#xxx.age"/><br>
��Stack Context�е�pֵ����application��Χ�ڡ�<br>
<s:set value="#p" name="xxx" scope="application"/>
<s:property value="#attr.xxx.name"/><br>
<s:property value="#attr.xxx.age"/><br>
��Stack Context�е�pֵ����session��Χ�ڡ�<br>
<s:set value="#p" name="xxx" scope="session"/>
${sessionScope.xxx.name}<br>
${sessionScope.xxx.age}<br>
</body>
</html>
