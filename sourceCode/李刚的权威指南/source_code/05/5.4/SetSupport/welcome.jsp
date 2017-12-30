<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>转换成功</title>
    </head>
    <body>
        转换成功!<br>
		用户1的用户名为：<s:property value="user('scott').name"/><br>
		用户1的密码为：<s:property value="user('scott').pass"/><br>
		用户2的用户名为：<s:property value="user('abc').name"/><br>
		用户2的密码为：<s:property value="user('abc').pass"/><br>
		生日为：<s:property value="birth"/><br>
    </body>
</html>
