<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>远程Div</title>
    <s:head theme="ajax"/>
</head>
<script type="text/javascript">
	function handler(widget, node) {
		alert('本地JavaScript函数处理动态Div');
		node.innerHTML = Math.random() > 0.4 ? "Spring2.0宝典" : "轻量级J2EE企业应用实战";
	}
</script>
<body>
<s:url id="rd" value="/random.action" />
直接使用本页面的JS函数，不再调用远程服务器<br>
<s:div  id="div1"
        theme="ajax"
        cssStyle="border: 1px solid black;background-color:#dddddd;
			width:300px;height:40px;padding-top:8px;padding-left:20px"
        href="%{rd}"
		updateFreq="2000"
		handler="handler">
	初始化文本
</s:div>
</body>
</html>
