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
		<s:iterator value="new int[3]" status="stat">
		<tr><td>
        �û�<s:property value="%{#stat.index}"/>����Ϣ<input name='users' type="text"/>
		</td></tr>
		</s:iterator>
        <tr align="center">
            <td><input type="submit" value="ת��"/><input type="reset" value="����"/></td>
        </tr>
    </table>
<form>
</body>
</html>
