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
<title>ʹ��s:tree��s:treenode��ǩ���ɾ�̬��</title>
<s:head theme="ajax" debug="true"/>
</head>
<body>
<h3>ʹ��s:tree��s:treenode��ǩ���ɾ�̬��</h3>
<s:tree label="�����ͼ��" id="book" theme="ajax" 
	showRootGrid="true" showGrid="true" treeSelectedTopic="treeSelected">
    <s:treenode theme="ajax" label="���" id="yeeku">
        <s:treenode theme="ajax" label="Spring2.0����" id="spring"/>
        <s:treenode theme="ajax" label="������J2EE��ҵӦ��ʵս" id="lightweight"/>
        <s:treenode theme="ajax" label="����J2EE��Ajax����" id="ajax"/>
    </s:treenode>
    <s:treenode theme="ajax" label="David" id="David">
        <s:treenode theme="ajax" label="JavaScript: The Definitive Guide" id="javascript"/>
    </s:treenode>
    <s:treenode theme="ajax" label="Johnson" id="Johnson">
        <s:treenode theme="ajax" label="Expert One-on-One J2EE Design and Development" id="j2ee"/>
    </s:treenode>
</s:tree>
</body>
</html>