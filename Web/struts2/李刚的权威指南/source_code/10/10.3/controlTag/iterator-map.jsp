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
<title>ʹ��s:itertor��ǩ����Map</title>
</head>
<body>
<table border="1" width="240">
	<tr>
		<th>����</th>
		<th>����</th>
	</tr>
<s:iterator value="#{'Spring2.0����':'���' , '������J2EE��ҵӦ��ʵս':'���','����J2EE��Ajax����':'���'}" id="score" status="st">
	<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
		<td><s:property value="key"/></td>
		<td><s:property value="value"/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
