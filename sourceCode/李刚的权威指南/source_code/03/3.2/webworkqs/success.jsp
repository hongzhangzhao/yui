<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="ww" uri="/webwork"%>
<html>
<head>
	<title><ww:property value="tip"/></title>
</head>
<body> 
<h3><ww:property value="tip"/></h3>
<ww:text name="welcomeMsg">
	<ww:param value="user"/>
</ww:text>
</body> 
</html> 