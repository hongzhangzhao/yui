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
<title>ʹ��s:component��ǩ</title>
</head>
<body>
<h3>ʹ��s:component��ǩ</h3>
ʹ���Զ������⣬�Զ�������Ŀ¼<br>  
��WebӦ�ø�·���¼���ģ�壬ʹ��ftlģ�塣 
<s:component 
        theme="customTheme" 
        templateDir="customTemplateDir" 
        template="ftlCustomTemplate">
	<s:param name="list" value="{'Spring2.0����' , '������J2EE��ҵӦ��ʵս' , '����J2EE��Ajax����'}" />
</s:component>
<hr/>    
ʹ���Զ������⣬�Զ�������Ŀ¼<br>  
��WebӦ�ø�·���¼���ģ�壬ʹ��JSPģ�塣     
<s:component 
        theme="customTheme" 
        templateDir="customTemplateDir" 
        template="jspCustomTemplate.jsp">
	<s:param name="list" value="{'Spring2.0����' , '������J2EE��ҵӦ��ʵս' , '����J2EE��Ajax����'}" />
</s:component>      
<hr/>
ʹ��Ĭ������(xhtml)��Ĭ������Ŀ¼(template)<br>  
��WebӦ���м���ģ�壬ʹ��JSPģ�塣    
<s:component template="mytemplate.jsp">
	<s:param name="list" value="{'Spring2.0����' , '������J2EE��ҵӦ��ʵս' , '����J2EE��Ajax����'}" />
</s:component>
<hr/>  
ʹ���Զ������⣬�Զ�������Ŀ¼<br>  
��/WEB-INF/classes·���¼���ģ�壬ʹ��ftlģ�塣    
<s:component
	theme="myTheme"
	templateDir="myTemplateDir"
	template="myAnotherTemplate">
	<s:param name="list" value="{'Spring2.0����' , '������J2EE��ҵӦ��ʵս' , '����J2EE��Ajax����'}" />
</s:component>
</body>
</html>

