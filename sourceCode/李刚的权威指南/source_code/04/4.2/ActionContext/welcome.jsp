<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
    <head>
        <title>成功页面</title>
    </head>
    <body>
		本站访问次数为：${applicationScope.counter}<br>
        ${sessionScope.user}，您已经登录！<br>
		${requestScope.tip}
    </body>
</html>