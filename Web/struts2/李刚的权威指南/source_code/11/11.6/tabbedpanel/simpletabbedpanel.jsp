<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>tabbled panel示例：简单tabbled panel</title>
	<s:head theme="ajax" debug="true"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/struts/tabs.css"/>">    
</head>
<body>
简单Tab页面，doLayout属性设置是否使用固定高度<br>
<s:tabbedPanel id="tab1" theme="ajax" cssStyle="width: 400px; height: 240px;" doLayout="true">
	  <s:div id="left" label="第一个Tab页" theme="ajax" >
		  Spring2.0宝典<br>
		  轻量级J2EE企业实战<br>
		  基于J2EE的Ajax宝典<br>
	  </s:div >
	  <s:div  id="middle" label="第二个Tab页"  theme="ajax" >
		  <h3>作者简介</h3>
		  作者曾任广州电信、广东龙泉科技等公司的技术培训导师，<br>
		  现任新东方IT培训广州中心软件教学总监，并兼任广东技术师范学院计算机科学系的兼职副教授。<br>
		  现居在广州，如果读者阅读本书有任何问题，都可以发邮件给我。<br>
	  </s:div >	 
</s:tabbedPanel>
</body>
</html>