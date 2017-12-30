<%@ page contentType="text/html;charset=GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> 下载前的登陆页面 </TITLE>
 </HEAD>
 <BODY>
 <h3>下载前的登陆页面</h3>
 ${requestScope.tip}
  <FORM METHOD="POST" ACTION="login.action">
	用户名:<INPUT TYPE="text" NAME="user"/><br>
	密码：<INPUT TYPE="text" NAME="pass"/><br>
	<INPUT TYPE="submit" value="登陆"/><br>
  </FORM>
 </BODY>
</HTML>
