<%@ page contentType="text/html; charset=GBK"%>
<%! int count=0; %>
<html>
	<head>
		<title>JSP计数器</title>
	</head>
	<body>
		当前计数器值为：<b><%= ++count %></b><br>
		<a href="index.jsp">返回</a>
	</body>
</html>
