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
<title>ʹ��s:doubleselect���ɼ��������б��</title>
<s:head/>
</head>
<body>
<h3>ʹ��s:doubleselect���ɼ��������б��</h3>
<s:form action="x">
    <s:doubleselect
            label="��ѡ����ϲ����ͼ��"
            name="author" list="{'���', 'David'}"
            doubleList="top == '���' ? {'Spring2.0����', '������J2EE��ҵӦ��ʵս' , '����J2EE��Ajax����'} : {'JavaScript: The Definitive Guide'}" 
            doubleName="book"/>
	
</s:form>

</body>
</html>
