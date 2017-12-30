<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>转换成功</title>
    </head>
    <body>
        转换成功!<br>
		用户名为:<s:property value="user.name"/><br>
		密码为：<s:property value="user.pass"/><br>
    </body>
</html>
