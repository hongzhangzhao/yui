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
<title>ʹ��s:optiontransferselect�����ɿ��ƶ��б���������б��</title>
<s:head/>
</head>
<body>
<h3>ʹ��s:optiontransferselect�����ɿ��ƶ��б���������б��</h3>
<s:form>
<!-- ʹ�ü򵥼��϶��������ɿ��ƶ��������б�� -->
 <s:optiontransferselect 
  	label="��ѡ����ϲ����ͼ��"
	name="cnbook" 
	leftTitle="����ͼ�飺"
	rightTitle="����ͼ��"
	list="{'Spring2.0����','������J2EE��ҵӦ��ʵս','����J2EE��Ajax����'}" 
	multiple="true"
	addToLeftLabel="�����ƶ�"
	selectAllLabel="ȫ��ѡ��"
	addAllToRightLabel="ȫ������"
	headerKey="cnKey"
	headerValue="--- ѡ������ͼ�� ---"
	emptyOption="true"
	doubleList="{'Expert One-on-One J2EE Design and Development', 'JavaScript: The Definitive Guide'}" 
	doubleName="enBook"
	doubleHeaderKey="enKey"
	doubleHeaderValue="--- ѡ������ͼ�� ---" 
	doubleEmptyOption="true"
	doubleMultiple="true"
/>

</s:form>
</body>
</html>
