<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<html>
	<head>
		<title><decorator:title default="第一个装饰器页面"/></title>
		<decorator:head/>
	</head>
	<body>
		SiteMesh快速入门<hr>
		<decorator:body />
		<hr>
		<div style="font:9pt" align="center">SiteMesh快速入门 by Yeeku.H.Lee</div>
	</body>
</html>