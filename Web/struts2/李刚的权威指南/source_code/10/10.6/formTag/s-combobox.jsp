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
<title>ʹ��s:combobox�������������</title>
<s:head/>
</head>
<body>
<h3>ʹ��s:combobox�������������</h3>
<s:form>
<s:combobox label="��ѡ����ϲ����ͼ��" theme="css_xhtml" labelposition="top"
	list="{'Spring2.0����' , '������J2EE��ҵӦ��ʵս' , '����J2EE��Ajax����'}"
	size="20" maxlength="20" name="book"/>
</s:form>
</body>
</html>
