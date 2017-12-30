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
<title>使用s:optiontransferselect来生成可移动列表项的下拉列表框</title>
<s:head/>
</head>
<body>
<h3>使用s:optiontransferselect来生成可移动列表项的下拉列表框</h3>
<s:form>
<!-- 使用简单集合对象来生成可移动的下拉列表框 -->
 <s:optiontransferselect 
  	label="请选择你喜欢的图书"
	name="cnbook" 
	leftTitle="中文图书："
	rightTitle="外文图书"
	list="{'Spring2.0宝典','轻量级J2EE企业应用实战','基于J2EE的Ajax宝典'}" 
	multiple="true"
	addToLeftLabel="向左移动"
	selectAllLabel="全部选择"
	addAllToRightLabel="全部右移"
	headerKey="cnKey"
	headerValue="--- 选择中文图书 ---"
	emptyOption="true"
	doubleList="{'Expert One-on-One J2EE Design and Development', 'JavaScript: The Definitive Guide'}" 
	doubleName="enBook"
	doubleHeaderKey="enKey"
	doubleHeaderValue="--- 选择外文图书 ---" 
	doubleEmptyOption="true"
	doubleMultiple="true"
/>

</s:form>
</body>
</html>
