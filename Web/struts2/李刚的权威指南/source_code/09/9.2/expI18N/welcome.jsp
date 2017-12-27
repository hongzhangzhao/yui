<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title><s:text name="succPage"/></title>
    </head>
    <body>
		${requestScope.tip}<br/>
		<jsp:useBean id="d" class="java.util.Date" scope="page"/>
		<s:text name="welcomeMsg">
			<s:param><s:property value="username"/></s:param>
			<s:param>${d}</s:param>
		</s:text>

    </body>
</html>