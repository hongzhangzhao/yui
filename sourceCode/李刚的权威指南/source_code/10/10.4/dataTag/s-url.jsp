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
<title>使用s:url来生成一个URL地址</title>
</head>
<body>
<h2>s:url来生成一个URL地址</h2>
只指定value属性的形式。<br>
<s:url value="editGadget.action"/>
<hr>
指定action属性,且使用param传入参数的形式。<br>
<s:url action="showBook">
    <s:param name="author" value="'yeeku'" />
</s:url>
<hr>
既不指定action属性,也不指定value属性,且使用param传入参数的形式。<br>
<s:url includeParams="get"  >
    <s:param name="id" value="%{'22'}"/>
</s:url>
<hr>
同时指定action属性和value属性,且使用param传入参数的形式。<br>
<s:url action="showBook" value="xxxx">
    <s:param name="author" value="'yeeku'" />
</s:url>
</body>
</html>
