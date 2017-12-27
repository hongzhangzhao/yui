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
<title>使用s:datetimepicker生成日期选择框</title>
<s:head/>
</head>
<body>
<h3>使用使用s:datetimepicker生成日期选择框</h3>
<s:form theme="simple">
	日期选择部件，指定toggleType属性,且指定value="today"<br>
    <s:datetimepicker name="order.date" label="购买日期" toggleType="explode" value="today"/><hr>
	日期选择部件，指定了format属性<br>
    <s:datetimepicker name="order.date" label="购买日期" displayFormat="dddd年MM月dd日"/><hr>
	日期选择部件，指定了weekStartsOn属性<br>
    <s:datetimepicker name="order.date" label="购买日期" displayFormat="dddd年MM月dd日" weekStartsOn="2"/><hr>
	时间选择部件<br>
	<s:datetimepicker label="选择出发时间'" name="start" type="time" value="13:00"/><hr>
</s:form>
</body>
</html>
