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
<title>ʹ��s:updownselect���ɿ������ƶ�ѡ�������ѡ���</title>
<s:head/>
</head>
<body>
<h3>ʹ��s:updownselect���ɿ������ƶ�ѡ�������ѡ���</h3>
<s:form>
<!-- ʹ�ü򵥼��������ɿ������ƶ�ѡ�������ѡ��� -->
<s:updownselect name="a" label="��ѡ����ϲ����ͼ��" labelposition="top"
	moveUpLabel="�����ƶ�"
	list="{'Spring2.0����' , '������J2EE��ҵӦ��ʵս' , 'JavaScript: The Definitive Guide'}"/>
<!-- ʹ�ü�Map���������ɿ������ƶ�ѡ�������ѡ��� 
	 ��ʹ��emptyOption="true"����һ����ѡ��-->
<s:updownselect name="b" label="��ѡ������ѡ���������" labelposition="top"
	moveDownLabel="�����ƶ�"
	list="#{'Spring2.0����':'2006��10��' , '������J2EE��ҵӦ��ʵս':'2007��4��' , '����J2EE��Ajax����':'2007��6��'}"
	listKey="key"
	emptyOption="true"
	listValue="value"/>
<s:bean name="lee.BookService" id="bs"/>
<!-- ʹ�ü�����Ŷ��JavaBeanʵ�����������ƶ�ѡ�����������ѡ��� -->
<s:updownselect name="c" label="��ѡ����ϲ����ͼ�������" labelposition="top"
	selectAllLabel="ȫ��ѡ��" multiple="true"
	list="#bs.books"
	listKey="author"
	listValue="name"/>
</s:form>
</body>
</html>
