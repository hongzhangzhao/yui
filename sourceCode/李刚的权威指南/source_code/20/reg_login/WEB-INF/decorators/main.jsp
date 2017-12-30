<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title><decorator:title default="SiteMesh��װ����ҳ"/></title>
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
					<!-- ����һ��ҳ�棬��ʱָ�����õ�װ���� -->
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
							��Ȩ���� Copyright@2006 Yeeku.H.Lee <br>
							�����κ�����ͽ��飬<a href="mailto:kongyeeku@163.com">��E-mail to me</a>��<br>
							������ʹ��1024*768�ֱ��ʣ�IE5.0���ϰ汾�����վ!
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>