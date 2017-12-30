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
<title>使用s:radio生成多个单选框</title>
<s:head/>

</head>
<body>
<h3>使用s:radio生成多个单选框</h3>
<s:form>
<!-- 使用简单集合来生成多个单选框 -->
<s:radio name="a" label="请选择您喜欢的图书" labelposition="top"
	list="{'Spring2.0宝典' , 'Spring In Action' , 'JavaScript: The Definitive Guide'}"/>
<!-- 使用简单Map对象来生成多个单选框 -->
<s:radio name="b" label="请选择您想选择出版日期" labelposition="top"
	list="#{'Spring2.0宝典':'2006年10月' , '轻量级J2EE企业应用实战':'2007月4月' , '基于J2EE的Ajax宝典':'2007年6月'}"
	listKey="key"
	listValue="value"/>
<s:bean name="lee.BookService" id="bs"/>
<!-- 使用集合里放多个JavaBean实例来生成多个单选框 -->
<s:radio name="c" label="请选择您喜欢的图书" labelposition="top"
	list="#bs.books"
	listKey="author"
	listValue="name"/>
</s:form>
</body>
</html>
