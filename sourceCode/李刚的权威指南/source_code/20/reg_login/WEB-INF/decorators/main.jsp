<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title><decorator:title default="SiteMesh的装饰器页"/></title>
		<link href="images/main.css" rel="stylesheet" type="text/css">
		<decorator:head/>
		<s:head/>
		<script>
			function refresh()
			{
				document.getElementById("authImg").src='authImg?now=' + new Date();
			}
		</script>
	</head>
	<body>
		<table width="780" align="center">
			<tr>
				<td valign="top" width="200">
					<!-- 引入一个页面，临时指定所用的装饰器 -->
					<page:applyDecorator page="/WEB-INF/decorators/book.html" name="panel" />
					<page:applyDecorator page="/WEB-INF/decorators/link.html" name="panel" />
				</td>
				<td width="580">
					<table width="100%" height="100%">
						<tr>
							<td id="pageTitle">
								<decorator:title/>
							</td>
						</tr>
						<tr>
							<td valign="top" height="100%">
								<decorator:body />
							</td>
						</tr>
						<tr>
							<td id="footer">
							All Rights Reserved.<br>
							版权所有 Copyright@2006 Yeeku.H.Lee <br>
							如有任何问题和建议，<a href="mailto:kongyeeku@163.com">请E-mail to me</a>！<br>
							建议您使用1024*768分辨率，IE5.0以上版本浏览本站!
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>