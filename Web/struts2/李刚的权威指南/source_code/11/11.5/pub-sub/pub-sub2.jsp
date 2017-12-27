<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>pub-sub模型</title>
	<s:head theme="ajax"/>
</head>
<body>
pub-sub模型<br>
<s:url id="data" value="/data.action"/>
<s:submit type="submit" theme="ajax" value="更新" align="left" notifyTopics="/change"/>
<s:div theme="ajax" id="t1" cssStyle="background-color:#bbbbbb;width:360px;height:80px" listenTopics="/change" href="${data}"/>
</body>
</html>
