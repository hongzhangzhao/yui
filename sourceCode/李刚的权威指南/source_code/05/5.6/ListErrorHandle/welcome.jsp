<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>ת���ɹ�</title>
    </head>
    <body>
        ת���ɹ�!<br>
		<s:iterator value="users" status="status">
			�û�<s:property value="%{#status.index}"/>���û�����<s:property value="name"/><br/>
			�û�<s:property value="%{#status.index}"/>�����룺<s:property value="pass"/><br/>
		</s:iterator>
    </body>
</html>
