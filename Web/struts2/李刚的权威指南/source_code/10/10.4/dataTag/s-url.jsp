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
<title>ʹ��s:url������һ��URL��ַ</title>
</head>
<body>
<h2>s:url������һ��URL��ַ</h2>
ָֻ��value���Ե���ʽ��<br>
<s:url value="editGadget.action"/>
<hr>
ָ��action����,��ʹ��param�����������ʽ��<br>
<s:url action="showBook">
    <s:param name="author" value="'yeeku'" />
</s:url>
<hr>
�Ȳ�ָ��action����,Ҳ��ָ��value����,��ʹ��param�����������ʽ��<br>
<s:url includeParams="get"  >
    <s:param name="id" value="%{'22'}"/>
</s:url>
<hr>
ͬʱָ��action���Ժ�value����,��ʹ��param�����������ʽ��<br>
<s:url action="showBook" value="xxxx">
    <s:param name="author" value="'yeeku'" />
</s:url>
</body>
</html>
