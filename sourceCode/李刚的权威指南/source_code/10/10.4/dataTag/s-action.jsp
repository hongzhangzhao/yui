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
<title>ʹ��s:action��ǩ��ҳ���е���Action</title>
</head>
<body>
������õ�һ��Action�����������������ҳ���С�<br>
<s:action name="tag1" executeResult="true"/>
<hr/>
������õڶ���Action�����������������ҳ���С�<br>
������ֹ��ҳ�������������Action��<br>
<s:action name="tag2" executeResult="true" ignoreContextParams="true"/>
<hr/>
������õڶ���Action���Ҳ����������������ҳ���С�<br>
<s:action name="tag2" executeResult="false"/>
<s:property value="#attr.author"/>
</body>
</html>
