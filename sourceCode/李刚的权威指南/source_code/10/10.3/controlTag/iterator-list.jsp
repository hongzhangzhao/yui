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
<title>ʹ��s:itertor��ǩ����List</title>
</head>
<body>
<table border="1" width="200">
<s:iterator value="{'Spring2.0����','������J2EE��ҵӦ��ʵս','����J2EE��Ajax����'}" id="name">	
	<tr>
		<td><s:property value="#st.count"/><s:property value="name"/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
