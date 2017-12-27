<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>自动完成</title>
	<s:head theme="ajax" debug="true"/>
</head>
将两个关联起来
<br/>
<form id="selectForm">
  请选择您喜欢的作者：<br>
  <s:autocompleter theme="simple" name="author" 
	list="{'李刚','Rod Johnson' , 'David Flanagan'}"  
	value="李刚" notifyTopics="/book"
	forceValidOption="true"
	id="sel"/>
</form>
请选择您喜欢的图书：<br>
<s:url id="getBook" value="/getBook.action"/>
<s:autocompleter theme="ajax" href="${getBook}"  cssStyle="width: 240px;"
	autoComplete="false" formId="selectForm" listenTopics="/book" forceValidOption="true" id="ops"/>
</body>
</html>
