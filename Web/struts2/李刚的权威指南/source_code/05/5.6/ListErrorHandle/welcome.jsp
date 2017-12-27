<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>转换成功</title>
    </head>
    <body>
        转换成功!<br>
		<s:iterator value="users" status="status">
			用户<s:property value="%{#status.index}"/>的用户名：<s:property value="name"/><br/>
			用户<s:property value="%{#status.index}"/>的密码：<s:property value="pass"/><br/>
		</s:iterator>
    </body>
</html>
