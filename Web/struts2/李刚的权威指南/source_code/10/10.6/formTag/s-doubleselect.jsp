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
<title>使用s:doubleselect生成级联下拉列表框</title>
<s:head/>
</head>
<body>
<h3>使用s:doubleselect生成级联下拉列表框</h3>
<s:form action="x">
    <s:doubleselect
            label="请选择您喜欢的图书"
            name="author" list="{'李刚', 'David'}"
            doubleList="top == '李刚' ? {'Spring2.0宝典', '轻量级J2EE企业应用实战' , '基于J2EE的Ajax宝典'} : {'JavaScript: The Definitive Guide'}" 
            doubleName="book"/>
	
</s:form>

</body>
</html>
