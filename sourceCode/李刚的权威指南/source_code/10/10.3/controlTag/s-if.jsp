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
<title>s:if标签测试</title>
</head>
<body>
<s:set name="age" value="29"/>
<s:if test="${age > 60}">
    老年人
</s:if>
<s:elseif test="${age > 35}">
    中年人
</s:elseif>
<s:elseif test="${age > 15}" id="wawa">
	青年人
</s:elseif>
<s:else>
    少年
</s:else>
</body>
</html>
