<%@ page contentType="text/html;charset=GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> ����ǰ�ĵ�½ҳ�� </TITLE>
 </HEAD>
 <BODY>
 <h3>����ǰ�ĵ�½ҳ��</h3>
 ${requestScope.tip}
  <FORM METHOD="POST" ACTION="login.action">
	�û���:<INPUT TYPE="text" NAME="user"/><br>
	���룺<INPUT TYPE="text" NAME="pass"/><br>
	<INPUT TYPE="submit" value="��½"/><br>
  </FORM>
 </BODY>
</HTML>
