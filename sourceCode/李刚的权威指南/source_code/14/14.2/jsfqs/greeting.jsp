<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!--�þ����classes�µ�messages����Դ�ļ�-->
<f:loadBundle basename="messages" var="msg"/>
<html>
	<head>
	<title>��½�ɹ�</title>
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