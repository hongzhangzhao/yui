<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>ֱ�ӷ�װ��Map</title>
</head>
<body>
<form action="login.action" method="post">
    <table align="center" width="360">
    <caption><h3>ֱ�ӷ�װ��Map</h3></caption>
        <tr>
            <td>��һ���û�����<input type="text" name="users['one'].name"/></td>
        </tr>
        <tr>
            <td>��һ�����룺<input type="text" name="users['one'].pass"/></td>
        </tr>
        <tr>
            <td>�ڶ����û�����<input type="text" name="users['two'].name"/></td>
        </tr>
        <tr>
            <td>�ڶ������룺<input type="text" name="users['two'].pass"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="ת��"/><input type="reset" value="����" /></td>
        </tr>
    </table>
</form>
</body>
</html>
