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
<title>ʹ��s:sort�Լ���Ԫ�ؽ�������</title>
</head>
<body>
<s:bean id="mycomparator" name="lee.MyComparator"/>
<table border="1" width="200">
<s:sort 
	source="{'������J2EE��ҵӦ��ʵս','����J2EE��Ajax����','Spring2.0����'}" 
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
