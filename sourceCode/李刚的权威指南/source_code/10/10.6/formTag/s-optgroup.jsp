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
<title>使用s:optgroup生成下拉选择框的选项组</title>
<s:head/>
</head>
<body>
<h3>使用s:optgroup生成下拉选择框的选项组</h3>
<s:form>
<!-- 使用Map对象来生成下拉选择框的选项组 -->
<s:select label="选择您喜欢的图书"
           name="book"
           list="#{'Spring2.0宝典':'李刚','轻量级J2EE企业应用实战':'李刚','基于J2EE的Ajax宝典':'李刚'}"
		   listKey="value"
		   listValue="key">
   <s:optgroup label="Rod Johnson"
           list="#{'Expert One-on-One J2EE Design and Development':'Johnson'}"
		   listKey="value"
		   listValue="key"/>
   <s:optgroup label="David Flanagan"
           list="#{'JavaScript: The Definitive Guide':'David'}"
		   listKey="value"
		   listValue="key"/>
</s:select>
</s:form>
</body>
</html>
