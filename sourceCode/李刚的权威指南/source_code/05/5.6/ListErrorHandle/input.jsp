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
		<s:iterator value="new int[3]" status="stat">
		<tr><td>
        用户<s:property value="%{#stat.index}"/>的信息<input name='users' type="text"/>
		</td></tr>
		</s:iterator>
        <tr align="center">
            <td><input type="submit" value="转换"/><input type="reset" value="重设"/></td>
        </tr>
    </table>
<form>
</body>
</html>
