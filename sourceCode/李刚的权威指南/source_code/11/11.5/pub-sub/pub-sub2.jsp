<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>pub-subģ��</title>
	<s:head theme="ajax"/>
</head>
<body>
pub-subģ��<br>
<s:url id="data" value="/data.action"/>
<s:submit type="submit" theme="ajax" value="����" align="left" notifyTopics="/change"/>
<s:div theme="ajax" id="t1" cssStyle="background-color:#bbbbbb;width:360px;height:80px" listenTopics="/change" href="${data}"/>
</body>
</html>
