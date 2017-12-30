<%@ page language="java" contentType="text/html;charset=gb2312" errorPage=""%>
<!--  导入Struts的三个标签库-->
<%@include file="taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<!--  使用国际化资源文件的key输出标题-->
<title><bean:message key="login"/></title>
</head>
<body>
<font color="red">${requestScope.err}</font>
<logic:messagesPresent>
   <bean:message key="errors.header"/>
   <ul>
   <html:messages id="error">
      <li><bean:write name="error"/></li>
   </html:messages>
   </ul><hr />
</logic:messagesPresent>
<!--  下面是登陆表单-->
<bean:message key="loginTitle"/>
<html:form action="login.do">
	<bean:message key="username"/><html:text property="username"/><br>
	<bean:message key="pass"/><html:password property="pass"/><br>
	<html:submit><bean:message key="login"/></html:submit><br>
</html:form>
</body>
</html>

