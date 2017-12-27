<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<html>
	<head>
		<title><decorator:title default="SiteMesh��װ����ҳ"/></title>
		<link href="decorators/main.css" rel="stylesheet" type="text/css">
		<decorator:head/>
	</head>
	<body>
		<table width="100%" height="100%">
			<tr>
				<td valign="top">
					<!-- ����һ��ҳ�棬��ʱָ�����õ�װ���� -->
					<page:applyDecorator page="/book.html" name="panel" />
					<page:applyDecorator page="/link.html" name="panel" />
				</td>
				<td width="100%">
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
								<b>������������</b><br>
								SithMesh�ṩҳ��װ��֧��
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>