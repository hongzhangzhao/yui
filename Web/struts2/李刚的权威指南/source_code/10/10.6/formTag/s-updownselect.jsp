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
<title>使用s:updownselect生成可上下移动选项的下拉选择框</title>
<s:head/>
</head>
<body>
<h3>使用s:updownselect生成可上下移动选项的下拉选择框</h3>
<s:form>
<!-- 使用简单集合来生成可上下移动选项的下拉选择框 -->
<s:updownselect name="a" label="请选择您喜欢的图书" labelposition="top"
	moveUpLabel="向上移动"
	list="{'Spring2.0宝典' , '轻量级J2EE企业应用实战' , 'JavaScript: The Definitive Guide'}"/>
<!-- 使用简单Map对象来生成可上下移动选项的下拉选择框 
	 且使用emptyOption="true"增加一个空选项-->
<s:updownselect name="b" label="请选择您想选择出版日期" labelposition="top"
	moveDownLabel="向下移动"
	list="#{'Spring2.0宝典':'2006年10月' , '轻量级J2EE企业应用实战':'2007月4月' , '基于J2EE的Ajax宝典':'2007年6月'}"
	listKey="key"
	emptyOption="true"
	listValue="value"/>
<s:bean name="lee.BookService" id="bs"/>
<!-- 使用集合里放多个JavaBean实例来可上下移动选项的生成下拉选择框 -->
<s:updownselect name="c" label="请选择您喜欢的图书的作者" labelposition="top"
	selectAllLabel="全部选择" multiple="true"
	list="#bs.books"
	listKey="author"
	listValue="name"/>
</s:form>
</body>
</html>
