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
<title>使用自定义模板来生成下拉列表</title>
</head>
<body>
<s:select name="aa" theme="lee" 
	list="{'Spring2.0宝典' , '轻量级J2EE企业应用实战' , '基于J2EE的Ajax宝典'}" size="3"/>
</body>
</html>
