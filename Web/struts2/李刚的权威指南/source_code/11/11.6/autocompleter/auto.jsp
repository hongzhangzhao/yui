<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>自动完成</title>
	<s:head theme="ajax" debug="true"/>
</head>
<body>
<s:url id="books" value="/books.action"/>
服务器(/books.action)总是返回一个简单的JSON list。<br>
不使用自动完成(autoComplete="false")。<br>
使用indicator<br>
字符串匹配模式是子串匹配(searchType="substring")<br>
<s:autocompleter name="book" theme="ajax" indicator="indicator1" href="%{books}" 
	cssStyle="width: 200px;" 
	autoComplete="false" 
	searchType="substring"/>
<img id="indicator1" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<br/>
用户输入时重新加载下拉列表项(loadOnTextChange="true")<br>
当3个字符后才触发重新加载下拉列表(loadMinimumCout="3")<br>
不出现下拉箭头 (showDownArrow="false")<br>
<s:autocompleter theme="ajax" indicator="indicator" href="%{books}" cssStyle="width: 200px;" autoComplete="false" loadOnTextChange="true" loadMinimumCount="3" showDownArrow="false"/>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<br/>
设置在文本框中提示自动完成(autoComplete="true")。<br>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" autoComplete="true" />
<br/>
使用本页面的集合来自动完成
<br/>
<s:autocompleter theme="simple" list="{'Spring2.0宝典','轻量级J2EE企业实战','基于J2EE的Ajax宝典'}" cssStyle="width: 240px;"/>
<br/>
校验用户输入，强制只能输入下拉列表项(forceValidOption="true")
<br/>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" forceValidOption="true"/>
<br/>
设置dropdown的高度是180px  (dropdownHeight="180")
<br/>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" dropdownHeight="180"/>
<br/>
禁用combobox功能 (disabled="true")
<br/>
<s:autocompleter theme="ajax" href="%{books}" cssStyle="width: 200px;" disabled="true"/>
</body>
</html>