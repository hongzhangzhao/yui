<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>pub-sub模型</title>
	<s:head theme="ajax"/>
</head>
<script type="text/javascript">
    dojo.event.topic.subscribe("/lee", function(data, type, e){
      alert('正处于Dojo的异步交互过程中，类型是：'+type);
	  alert(e);
   });
</script>
<body>
简单pub-sub模型<br>
<!-- targets属性设置用于装载被改变的HTML元素 -->
<s:submit type="submit" theme="ajax" value="提交" align="left" notifyTopics="/lee"/>
</body>
</html>
