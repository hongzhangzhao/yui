<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>�ֲ�����ת����</title>
</head>
<body>
<s:fielderror/>
<form action="login.action" method="post">
    <table align="center" width="360">
    <caption><h3>�ֲ�����ת����</h3></caption>
        <tr align="center">
            <td>�û���Ϣ���û�����������Ӣ�Ķ��Ÿ���</td>
        </tr>
        <tr>
            <td>�������û���Ϣ��<input type="text" name="user"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="ת��"/><input type="reset" value="����" /></td>
        </tr>
    </table>
</form>
</body>
</html>
