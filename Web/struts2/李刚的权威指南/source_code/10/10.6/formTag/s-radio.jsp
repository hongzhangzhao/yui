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
<title>ʹ��s:radio���ɶ����ѡ��</title>
<s:head/>

</head>
<body>
<h3>ʹ��s:radio���ɶ����ѡ��</h3>
<s:form>
<!-- ʹ�ü򵥼��������ɶ����ѡ�� -->
<s:radio name="a" label="��ѡ����ϲ����ͼ��" labelposition="top"
	list="{'Spring2.0����' , 'Spring In Action' , 'JavaScript: The Definitive Guide'}"/>
<!-- ʹ�ü�Map���������ɶ����ѡ�� -->
<s:radio name="b" label="��ѡ������ѡ���������" labelposition="top"
	list="#{'Spring2.0����':'2006��10��' , '������J2EE��ҵӦ��ʵս':'2007��4��' , '����J2EE��Ajax����':'2007��6��'}"
	listKey="key"
	listValue="value"/>
<s:bean name="lee.BookService" id="bs"/>
<!-- ʹ�ü�����Ŷ��JavaBeanʵ�������ɶ����ѡ�� -->
<s:radio name="c" label="��ѡ����ϲ����ͼ��" labelposition="top"
	list="#bs.books"
	listKey="author"
	listValue="name"/>
</s:form>
</body>
</html>
