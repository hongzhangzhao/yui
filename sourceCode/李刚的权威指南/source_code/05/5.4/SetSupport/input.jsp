<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>Set属性的类型转换</title>
</head>
<body>
<form action="login.action" method="post">
    <table align="center" width="360">
    <caption><h3>Set属性的类型转换</h3></caption>
        <tr align="center">
            <td>用户信息的用户名和密码以英文逗号隔开</td>
        </tr>
        <tr>
            <td>请输入用户1信息：<input type="text" name="user"/></td>
        </tr>
        <tr>
            <td>请输入用户2信息：<input type="text" name="user"/></td>
        </tr>
        <tr>
            <td>用户生日：<input type="text" name="birth"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="转换"/><input type="reset" value="重填"/></td>
        </tr>
    </table>
</form>
</body>
</html>
