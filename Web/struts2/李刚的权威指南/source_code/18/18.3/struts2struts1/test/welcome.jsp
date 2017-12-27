<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>成功页面</title>
    </head>
    <body>
        欢迎，<s:property value="%{#session.user}"/>,您已经登录!<br>
		<a href="GetBooks.action">查看作者李刚已出版的图书</a>
    </body>
</html>