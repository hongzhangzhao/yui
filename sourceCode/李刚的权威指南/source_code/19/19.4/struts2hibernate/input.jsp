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
<TITLE>����¼ҳ�</TITLE>
</HEAD>
<BODY>
<s:form action="add.action">
	<s:textfield name="name" label="���֣�"/>
	<s:textfield name="gender" label="�Ա�"/>
	<s:textfield name="sonName" label="��������"/>
	<s:textfield name="sonAge" label="�������䣺"/>
	<s:submit value="�ύ"/>
</s:form>
</BODY>
</HTML>
