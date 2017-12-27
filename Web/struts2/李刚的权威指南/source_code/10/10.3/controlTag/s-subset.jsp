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
<title>使用s:subset标签截取集合元素</title>
</head>
<body>
<table border="1" width="200">
<s:subset source="{'Java培训基础','Spring2.0宝典','轻量级J2EE企业应用实战','基于J2EE的Ajax宝典','WebWork实战'}" 
	start="1" count="3">
<s:iterator status="st">	
	<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</s:subset>
</table>
</body>
</html>
