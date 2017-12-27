<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>转换成功</title>
    </head>
    <body>
        转换成功!<br>
		用户的用户名为:<s:property value="user.name"/><br>
		用户的密码为：<s:property value="user.pass"/><br>
		用户的生日为：<s:property value="birth"/><br>
		客人的用户名为:<s:property value="customer.name"/><br>
		客人的密码为：<s:property value="customer.pass"/><br>
    </body>
</html>
