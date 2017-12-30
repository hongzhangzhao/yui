<#assign page=JspTaglibs["/WEB-INF/sitemesh-page.tld"]>
<html>
	<head>
		<title>${title}></title>
		<link href="decorators/main.css" rel="stylesheet" type="text/css">
		${head}
	</head>
	<body>
		<table width="100%" height="100%">
			<tr>
				<td valign="top">
					<p>
						<table width=250 border=0 cellpadding=0 cellspacing=0>
							<tr>
								<th class="panelTitle">
									作者图书
								</th>
							</tr>
							<tr>
								<td class="panelBody">
									<center>
										Spring2.0宝典<br>
										轻量级J2EE企业应用实战<br>
										基于J2EE的Ajax宝典
									</center>
								</td>
							</tr>
						</table>
					</p>
					<p>
						<table width=250 border=0 cellpadding=0 cellspacing=0>
							<tr>
								<th class="panelTitle">
									友情链接
								</th>
							</tr>
							<tr>
								<td class="panelBody">
									<center>
									<a href="http://www.nit-pro.org">NIT-PRO考试中心</a><br>
									<a href="http://www.oneedu.cn">新东方IT培训中心</a><br>
									<a href="http://www.oneedu.cn">东方标准人才服务公司</a><br>
									</center>
								</td>
							</tr>
						</table>
					</p>
				</td>
				<td width="100%">
					<table width="100%" height="100%">
						<tr>
							<td id="pageTitle">
								${title}
							</td>
						</tr>
						<tr>
							<td valign="top" height="100%">
								${body}
							</td>
						</tr>
						<tr>
							<td id="footer">
								<b>被包含的内容</b><br>
								SithMesh提供页面装饰支持
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>