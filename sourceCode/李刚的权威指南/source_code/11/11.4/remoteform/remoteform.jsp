<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Զ�̱�</title>
    <s:head theme="ajax"/>
</head>
<body>
<div id='show' style="background-color:#bbbbbb;width:360px;height:80px">ԭʼ��̬�ı�</div>
ʹ�ñ�����ķ���ֵ�������һ��Div��<br/>
<s:form id='theForm1'
        cssStyle="border: 1px solid black;"
        action='AjaxTest'
        method='post'
        theme="ajax">
    <s:textfield name='data' label="��������ϲ����ͼ��"/>
    <s:submit value="�޸�����ľ�̬�ı�" targets="show"/>
</s:form>
ʹ�ñ�����ķ���ֵ����䱾Form<br/>
<s:form id='theForm2'
        cssStyle="border: 1px solid black;"
        action='AjaxTest'
        method='post'
        theme="ajax">
    <s:textfield name='data' label="��������ϲ����ͼ��"/>
    <s:submit value="�޸�Form����" targets="theForm2"/>
</s:form>
ֱ������Զ��JavaScript(ͨ��ָ��executeScripts="true")<br/>
<s:form id='theForm3'
        cssStyle="border: 1px solid black;"
        action='Test3'
        method='post'
        theme="ajax">
    <s:textfield name='data' label="��������ϲ����ͼ��"/>
    <s:submit value="ִ��Զ��JS" executeScripts="true" targets="show"/>
</s:form>
</body>
</html>
