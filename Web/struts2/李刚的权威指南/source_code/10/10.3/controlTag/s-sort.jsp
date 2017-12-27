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
<title>使用s:sort对集合元素进行排序</title>
</head>
<body>
<s:bean id="mycomparator" name="lee.MyComparator"/>
<table border="1" width="200">
<s:sort 
	source="{'轻量级J2EE企业应用实战','基于J2EE的Ajax宝典','Spring2.0宝典'}" 
	comparator="#mycomparator">
<s:iterator status="st">	
	<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</s:sort>
</table>
</body>
</html>
