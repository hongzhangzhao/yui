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
<title>ʹ��s:datetimepicker��������ѡ���</title>
<s:head/>
</head>
<body>
<h3>ʹ��ʹ��s:datetimepicker��������ѡ���</h3>
<s:form theme="simple">
	����ѡ�񲿼���ָ��toggleType����,��ָ��value="today"<br>
    <s:datetimepicker name="order.date" label="��������" toggleType="explode" value="today"/><hr>
	����ѡ�񲿼���ָ����format����<br>
    <s:datetimepicker name="order.date" label="��������" displayFormat="dddd��MM��dd��"/><hr>
	����ѡ�񲿼���ָ����weekStartsOn����<br>
    <s:datetimepicker name="order.date" label="��������" displayFormat="dddd��MM��dd��" weekStartsOn="2"/><hr>
	ʱ��ѡ�񲿼�<br>
	<s:datetimepicker label="ѡ�����ʱ��'" name="start" type="time" value="13:00"/><hr>
</s:form>
</body>
</html>
