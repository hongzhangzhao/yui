<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>��¼ҳ��</title>
</head>
<body>
<div style="color:red" align="center">${requestScope.tip}<div>
<form action="login.action" method="post">
    <table align="center">
    <caption><h3>�û���¼</h3></caption>
        <tr>
            <td>�û�����<input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>��&nbsp;&nbsp;�룺<input type="text" name="password"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="��¼"/><input type="reset" value="����" /></td>
        </tr>
    </table>
</form>
<div align="center"><a href="viewBook.action">�鿴������ճ����ͼ��</a><div>
</body>
</html>
