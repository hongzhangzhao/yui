<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!--该句绑定在classes下的messages的资源文件-->
<f:loadBundle basename="messages" var="msg"/>
<html>
	<head>
	<title>登陆成功</title>
	</head>    
	<body>
    <f:view>
		 <h3><h:outputText value="#{msg.greeting}"/></h3>
		 <h:outputText value="#{msg.namePrompt}"/>
		 <h:outputText value="#{login.name}" /><br>
		 <h:outputText value="#{msg.passPrompt}"/>
		 <h:outputText value="#{login.pass}" />
		 <h:outputText value="#{msg.sign}"/>
	</f:view>
	</body>
</html> 