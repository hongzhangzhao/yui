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
<title>ʹ��s:optgroup��������ѡ����ѡ����</title>
<s:head/>
</head>
<body>
<h3>ʹ��s:optgroup��������ѡ����ѡ����</h3>
<s:form>
<!-- ʹ��Map��������������ѡ����ѡ���� -->
<s:select label="ѡ����ϲ����ͼ��"
           name="book"
           list="#{'Spring2.0����':'���','������J2EE��ҵӦ��ʵս':'���','����J2EE��Ajax����':'���'}"
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
