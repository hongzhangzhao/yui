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
  	<h3>列出所有图书</h3>
  	<h:dataTable value="#{action.allBook}" var="b" style="text-align:center;width:500px" border="1">
  		<h:column>
  			<f:facet name="header">
  				<h:outputText value="图书ID" />
  			</f:facet>
  			<h:outputLink value="edit.action">
  				<f:param name="editId" value="#{b.id}" />
  				<h:outputText value="#{b.id}" />
  			</h:outputLink>	
  		</h:column>
		<h:column>
  			<f:facet name="header">
  				<h:outputText value="图书名" />
  			</f:facet>
  			<h:outputText value="#{b.name}" />
  		</h:column>
		<h:column>
  			<f:facet name="header">
  				<h:outputText value="图书简介" />
  			</f:facet>
  			<h:outputText value="#{b.desc}" />
  		</h:column>
  	</h:dataTable>	
  	<p>
  	<h:outputLink value="edit.action">
  		<h:outputText value="新增图书"/>
  	</h:outputLink>
  	</p>	
	</f:view>
	</body>
</html>
