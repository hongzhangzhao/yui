<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>�ɹ�ҳ��</title>
    </head>
    <body>
        ��ӭ��<s:property value="%{#session.user}"/>,���Ѿ���¼!<br>
		<a href="GetBooks.action">�鿴��������ѳ����ͼ��</a>
    </body>
</html>