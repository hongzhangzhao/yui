<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Զ��Div</title>
    <s:head theme="ajax"/>
</head>
<script type="text/javascript">
	function handler(widget, node) {
		alert('����JavaScript��������̬Div');
		node.innerHTML = Math.random() > 0.4 ? "Spring2.0����" : "������J2EE��ҵӦ��ʵս";
	}
</script>
<body>
<s:url id="rd" value="/random.action" />
ֱ��ʹ�ñ�ҳ���JS���������ٵ���Զ�̷�����<br>
<s:div  id="div1"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
		updateFreq="2000"
		handler="handler">
	��ʼ���ı�
</s:div>
</body>
</html>
