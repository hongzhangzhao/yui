<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>
		<s:i18n name="tmp">
		<s:text name="succPage"/>
		</s:i18n>
		</title>
    </head>
    <body>
        ${requestScope.tip}
    </body>
</html>