<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!--�þ����classes�µ�messages����Դ�ļ�-->
<f:loadBundle basename="messages" var="msg"/>
<html>
	<head>
	<title>��½</title>
	</head>
	<body>
	<f:view>
		<h3>
			<h:outputText value="#{msg.loginHeader}"/>
		</h3>
		<b><h:outputText value="#{login.err}"/></b>
		<h:form id="loginForm">
			<h:outputText value="#{msg.namePrompt}"/>
			<h:inputText value="#{login.name}" /><br>
			<h:outputText value="#{msg.passPrompt}"/>
			<h:inputText id="pass" value="#{login.pass}"/>
			<br>
			<h:commandButton action="#{login.valid}" value="#{msg.buttonTitle}" />
		</h:form>
	</f:view>
	</body>
</html>  