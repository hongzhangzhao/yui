<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title><s:text name="succPage"/></title>
    </head>
    <body>
        <s:text name="succTip">
			<s:param>${sessionScope.user}</s:param>
		</s:text><br>
    </body>
</html>
