<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>�ϴ��ɹ�</title>
    </head>
    <body>
        �ϴ��ɹ�!<br>
		�ļ�����:<s:property value=" + title"/><br>
		�ļ�Ϊ��<img src="<s:property value="'upload/' + uploadFileName"/>"/><br>
    </body>
</html>
