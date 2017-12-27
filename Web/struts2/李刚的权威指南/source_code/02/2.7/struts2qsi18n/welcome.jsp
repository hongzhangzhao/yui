<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title><s:text name="succPage"/></title>
    </head>
    <body>
        <s:text name="succTip">
			<s:param>${sessionScope.user}</s:param>
		</s:text><br>
		<a href="GetBooks.action"><s:text name="viewLink"/></a>
    </body>
</html>