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
									����ͼ��
								</th>
							</tr>
							<tr>
								<td class="panelBody">
									<center>
										Spring2.0����<br>
										������J2EE��ҵӦ��ʵս<br>
										����J2EE��Ajax����
									</center>
								</td>
							</tr>
						</table>
					</p>
					<p>
						<table width=250 border=0 cellpadding=0 cellspacing=0>
							<tr>
								<th class="panelTitle">
									��������
								</th>
							</tr>
							<tr>
								<td class="panelBody">
									<center>
									<a href="http://www.nit-pro.org">NIT-PRO��������</a><br>
									<a href="http://www.oneedu.cn">�¶���IT��ѵ����</a><br>
									<a href="http://www.oneedu.cn">������׼�˲ŷ���˾</a><br>
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