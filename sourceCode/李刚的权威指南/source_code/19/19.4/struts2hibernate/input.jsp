<%--
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2005-2008, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>添加新家长</TITLE>
</HEAD>
<BODY>
<s:form action="add.action">
	<s:textfield name="name" label="名字："/>
	<s:textfield name="gender" label="性别："/>
	<s:textfield name="sonName" label="儿子名："/>
	<s:textfield name="sonAge" label="儿子年龄："/>
	<s:submit value="提交"/>
</s:form>
</BODY>
</HTML>
