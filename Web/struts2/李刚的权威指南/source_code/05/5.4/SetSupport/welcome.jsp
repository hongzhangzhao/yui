<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>ת���ɹ�</title>
    </head>
    <body>
        ת���ɹ�!<br>
		�û�1���û���Ϊ��<s:property value="user('scott').name"/><br>
		�û�1������Ϊ��<s:property value="user('scott').pass"/><br>
		�û�2���û���Ϊ��<s:property value="user('abc').name"/><br>
		�û�2������Ϊ��<s:property value="user('abc').pass"/><br>
		����Ϊ��<s:property value="birth"/><br>
    </body>
</html>
