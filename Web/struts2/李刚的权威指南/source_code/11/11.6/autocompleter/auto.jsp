<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>�Զ����</title>
	<s:head theme="ajax" debug="true"/>
</head>
<body>
<s:url id="books" value="/books.action"/>
������(/books.action)���Ƿ���һ���򵥵�JSON list��<br>
��ʹ���Զ����(autoComplete="false")��<br>
ʹ��indicator<br>
�ַ���ƥ��ģʽ���Ӵ�ƥ��(searchType="substring")<br>
<s:autocompleter name="book" theme="ajax" indicator="indicator1" href="%{books}" 
	cssStyle="width: 200px;" 
	autoComplete="false" 
	searchType="substring"/>
<img id="indicator1" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<br/>
�û�����ʱ���¼��������б���(loadOnTextChange="true")<br>
��3���ַ���Ŵ������¼��������б�(loadMinimumCout="3")<br>
������������ͷ (showDownArrow="false")<br>
<s:autocompleter theme="ajax" indicator="indicator" href="%{books}" cssStyle="width: 200px;" autoComplete="false" loadOnTextChange="true" loadMinimumCount="3" showDownArrow="false"/>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<br/>
�������ı�������ʾ�Զ����(autoComplete="true")��<br>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" autoComplete="true" />
<br/>
ʹ�ñ�ҳ��ļ������Զ����
<br/>
<s:autocompleter theme="simple" list="{'Spring2.0����','������J2EE��ҵʵս','����J2EE��Ajax����'}" cssStyle="width: 240px;"/>
<br/>
У���û����룬ǿ��ֻ�����������б���(forceValidOption="true")
<br/>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" forceValidOption="true"/>
<br/>
����dropdown�ĸ߶���180px  (dropdownHeight="180")
<br/>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" dropdownHeight="180"/>
<br/>
����combobox���� (disabled="true")
<br/>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" disabled="true"/>
</body>
</html>