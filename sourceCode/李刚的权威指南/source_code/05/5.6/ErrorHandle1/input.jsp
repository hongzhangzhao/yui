<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>����ת���Ĵ�����</title>
</head>
<body>
<div style="color:red">
    <s:fielderror />
</div>
<form action="login.action" method="post">
    <table align="center" width="360">
    <caption><h3>����ת���Ĵ�����</h3></caption>
        <tr align="center">
            <td>�����û���Ϣ</td>
        </tr>
        <tr>
            <td>�û�������<input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>�û����䣺<input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>�û����գ�<input type="text" name="birth"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="ת��"/><input type="reset" value="����"/></td>
        </tr>
    </table>
<form>
</body>
</html>
