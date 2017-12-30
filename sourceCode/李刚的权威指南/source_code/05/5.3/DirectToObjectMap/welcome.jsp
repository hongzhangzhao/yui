<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>转换成功</title>
    </head>
    <body>
        转换成功!<br>
		key为one的用户名为:<s:property value="users['one'].name"/><br>
		key为one的密码为：<s:property value="users['one'].pass"/><br>
		key为two的用户名为:<s:property value="users['two'].name"/><br>
		key为two的密码为：<s:property value="users['two'].pass"/><br>
    </body>
</html>
