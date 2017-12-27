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
<title>使用s:date标签格式化日期</title>
</head>
<body>
<%
java.util.Date now = new java.util.Date(107, 12, 23, 13, 23, 24);
pageContext.setAttribute("now" , now);
%>
nice="false"，且指定format="dd/MM/yyyy"<br>
<s:date name="#attr.now" format="dd/MM/yyyy" nice="false"/><hr><br>
nice="true"，且指定format="dd/MM/yyyy"<br>
<s:date name="#attr.now" format="dd/MM/yyyy" nice="true"/><hr><br>
指定nice="true"<br>
<s:date name="#attr.now" nice="true" /><hr><br>
nice="false"，且没有指定format属性<br>
<s:date name="#attr.now" nice="false"/><hr><br>

</body>
</html>
