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
<title>使用s:set设置一个新变量</title>
</head>
<body>
<h2>使用s:set设置一个新变量</h2>
<s:bean name="lee.Person" id="p">
	<s:param name="name" value="'yeeku'"/>
	<s:param name="age" value="29"/>
</s:bean>
将Stack Context中的p值放入默认范围内。<br>
<s:set value="#p" name="xxx"/>
<s:property value="#xxx.name"/><br>
<s:property value="#xxx.age"/><br>
将Stack Context中的p值放入application范围内。<br>
<s:set value="#p" name="xxx" scope="application"/>
<s:property value="#attr.xxx.name"/><br>
<s:property value="#attr.xxx.age"/><br>
将Stack Context中的p值放入session范围内。<br>
<s:set value="#p" name="xxx" scope="session"/>
${sessionScope.xxx.name}<br>
${sessionScope.xxx.age}<br>
</body>
</html>
