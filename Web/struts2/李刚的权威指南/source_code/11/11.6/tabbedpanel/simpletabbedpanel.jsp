<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>tabbled panelʾ������tabbled panel</title>
	<s:head theme="ajax" debug="true"/>
    <link rel="stylesheet" type="text/css" href="<s:url value="/struts/tabs.css"/>">    
</head>
<body>
��Tabҳ�棬doLayout���������Ƿ�ʹ�ù̶��߶�<br>
<s:tabbedPanel id="tab1" theme="ajax" cssStyle="width: 400px; height: 240px;" doLayout="true">
	  <s:div id="left" label="��һ��Tabҳ" theme="ajax" >
		  Spring2.0����<br>
		  ������J2EE��ҵʵս<br>
		  ����J2EE��Ajax����<br>
	  </s:div >
	  <s:div  id="middle" label="�ڶ���Tabҳ"  theme="ajax" >
		  <h3>���߼��</h3>
		  �������ι��ݵ��š��㶫��Ȫ�Ƽ��ȹ�˾�ļ�����ѵ��ʦ��<br>
		  �����¶���IT��ѵ�������������ѧ�ܼ࣬�����ι㶫����ʦ��ѧԺ�������ѧϵ�ļ�ְ�����ڡ�<br>
		  �־��ڹ��ݣ���������Ķ��������κ����⣬�����Է��ʼ����ҡ�<br>
	  </s:div >	 
</s:tabbedPanel>
</body>
</html>