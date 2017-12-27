<%--
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>使用s:component标签</title>
</head>
<body>
<h3>使用s:component标签</h3>
使用自定义主题，自定义主题目录<br>  
从Web应用根路径下加载模板，使用ftl模板。 
<s:component 
        theme="customTheme" 
        templateDir="customTemplateDir" 
        template="ftlCustomTemplate">
	<s:param name="list" value="{'Spring2.0宝典' , '轻量级J2EE企业应用实战' , '基于J2EE的Ajax宝典'}" />
</s:component>
<hr/>    
使用自定义主题，自定义主题目录<br>  
从Web应用根路径下加载模板，使用JSP模板。     
<s:component 
        theme="customTheme" 
        templateDir="customTemplateDir" 
        template="jspCustomTemplate.jsp">
	<s:param name="list" value="{'Spring2.0宝典' , '轻量级J2EE企业应用实战' , '基于J2EE的Ajax宝典'}" />
</s:component>      
<hr/>
使用默认主题(xhtml)，默认主题目录(template)<br>  
从Web应用中加载模板，使用JSP模板。    
<s:component template="mytemplate.jsp">
	<s:param name="list" value="{'Spring2.0宝典' , '轻量级J2EE企业应用实战' , '基于J2EE的Ajax宝典'}" />
</s:component>
<hr/>  
使用自定义主题，自定义主题目录<br>  
从/WEB-INF/classes路径下加载模板，使用ftl模板。    
<s:component
	theme="myTheme"
	templateDir="myTemplateDir"
	template="myAnotherTemplate">
	<s:param name="list" value="{'Spring2.0宝典' , '轻量级J2EE企业应用实战' , '基于J2EE的Ajax宝典'}" />
</s:component>
</body>
</html>

