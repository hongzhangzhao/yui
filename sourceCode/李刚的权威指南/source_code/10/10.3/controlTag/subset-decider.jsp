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
<title>ʹ��s:subset��ǩ��ȡ����Ԫ��</title>
</head>
<body>
<s:bean id="mydecider" name="lee.MyDecider"/>
<table border="1" width="200">
<s:subset 
	source="{'Java��ѵ����','Spring2.0����','������J2EE��ҵӦ��ʵս','����J2EE��Ajax����','WebWorkʵս'}" 
	decider="#mydecider">
<s:iterator status="st">	
	<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</s:subset>
</table>
</body>
</html>
