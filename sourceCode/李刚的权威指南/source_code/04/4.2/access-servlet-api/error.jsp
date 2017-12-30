<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
    <head>
        <title>错误页面</title>
    </head>
    <body>
		本站访问次数为：${applicationScope.counter}<br>
        ${sessionScope.user}，您不能登录！<br>
		${requestScope.tip}
    </body>
</html>