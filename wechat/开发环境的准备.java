# 准备工作：
	1，一个微信公众号
	2，外网映射工具(开发调试)

#	与微信对接的url要具备以下条件：
		1，在公网上能够访问
		2，端口只支持80端口
		
# 映射工具：
	ngrok:
		可以将内网映射到公网上面，
		这样就可以在公网访问你的本地网络服务。
		
		用法：
			1，ngrok 8080
			2，ngrok -config ngrok.cfg -subdomain hongzhang 8080
			
	sunny:
		sunny.exe clientid id号
	
	frp： github项目 内网穿透