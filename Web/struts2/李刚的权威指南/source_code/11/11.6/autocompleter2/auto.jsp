<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>�Զ����</title>
	<s:head theme="ajax" debug="true"/>
</head>
��������������
<br/>
<form id="selectForm">
  ��ѡ����ϲ�������ߣ�<br>
  <s:autocompleter theme="simple" name="author" 
	list="{'���','Rod Johnson' , 'David Flanagan'}"  
	value="���" notifyTopics="/book"
	forceValidOption="true"
	id="sel"/>
</form>
��ѡ����ϲ����ͼ�飺<br>
<s:url id="getBook" value="/getBook.action"/>
<s:autocompleter theme="ajax" href="${getBook}"  cssStyle="width: 240px;"
	autoComplete="false" formId="selectForm" listenTopics="/book" forceValidOption="true" id="ops"/>
</body>
</html>
