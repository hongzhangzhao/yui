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
<title>使用s:generator生成集合</title>
</head>
<body>
<table border="1" width="240">
<s:generator val="'Spring2.0宝典,轻量级J2EE企业应用实战,基于J2EE的Ajax宝典'" separator=",">
<s:iterator status="st">
	<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</s:generator>
</table>
</body>
</html>
