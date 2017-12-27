<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<html>
	<head>
  		<title>Struts2+MyFaces+Spring整合</title>	
	</head>
	<body>
	<f:view>  
  	<h3>Struts2+MyFaces+Spring整合</h3>	
  	<h3>修改/保存图书</h3>  	
  	<h:form>
  		<h:inputHidden value="#{action.editId}"/>
  		<h:panelGrid columns="3">
  		    <h:outputText value="图书ID"/>
  			<h:inputText id="id" size="5" value="#{action.currentBook.id}" required="true" />
  			<h:message for="id" />  			
  			<h:outputText value="图书名:"/>
  			<h:inputText id="name" size="30" value="#{action.currentBook.name}" required="true">
  			    <f:validateLength minimum="2" maximum="100" />
  			</h:inputText>
  			<h:message for="name" />  			
  			<h:outputText value="图书描述：" />
  			<h:inputText id="desc" size="30" value="#{action.currentBook.desc}" required="true">
  			    <f:validateLength minimum="2" maximum="100" />
  			</h:inputText>
  			<h:message for="desc" />
  		</h:panelGrid>  		
  		<h:commandButton value="保存" action="#{action.save}" />
  		<br/>
  	</h:form>
	</f:view>
	</body>
</html>