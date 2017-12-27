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
<s:set name="bs" 
value="#{'李刚': {'Spring2.0宝典', '轻量级J2EE企业应用实战','基于J2EE的Ajax宝典'},
	'David': {'JavaScript: The Definitive Guide'},
	'Johnson': {'Expert One-on-One J2EE Design and Development'}}" />
<s:form action="x">
    <s:doubleselect
            label="请选择您喜欢的图书"
			size="3"
            name="author" list="#bs.keySet()"
            doubleList="#bs[top]" 
			doubleSize="3"
            doubleName="book"/>
	
</s:form>

</body>
</html>
