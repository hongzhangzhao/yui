<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>类型转换的错误处理</title>
</head>
<body>
<div style="color:red">
    <s:fielderror />
</div>
<form action="login.action" method="post">
    <table align="center" width="360">
    <caption><h3>类型转换的错误处理</h3></caption>
        <tr align="center">
            <td>输入用户信息</td>
        </tr>
        <tr>
            <td>用户姓名：<input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>用户年龄：<input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>用户生日：<input type="text" name="birth"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="转换"/><input type="reset" value="重设"/></td>
        </tr>
    </table>
<form>
</body>
</html>
