<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>ת���ɹ�</title>
    </head>
    <body>
        ת���ɹ�!<br>
		keyΪone���û���Ϊ:<s:property value="users['one'].name"/><br>
		keyΪone������Ϊ��<s:property value="users['one'].pass"/><br>
		keyΪtwo���û���Ϊ:<s:property value="users['two'].name"/><br>
		keyΪtwo������Ϊ��<s:property value="users['two'].pass"/><br>
    </body>
</html>
