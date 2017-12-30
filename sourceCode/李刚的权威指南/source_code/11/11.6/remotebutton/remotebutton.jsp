<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>远程按钮</title>
	<s:head theme="ajax" debug="true"/>
</head>

<script type="text/javascript">
    dojo.event.topic.subscribe("/after", function(data, type, e){
      alert('正处于Dojo的异步交互过程中，类型是：'+type);
      //data : text returned
      //type : "before", "load" or "error"
      //e    : request object
   });
</script>

<body>

<div id="t1" style="background-color:#bbbbbb;width:360px;height:80px">将被改变的结果</div>
<s:url id="ajaxTest" value="/AjaxTest.action" />
简单的提交按钮，使用indicator<br>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<!-- targets属性设置用于装载被改变的HTML元素 -->
<s:submit type="submit" theme="ajax" value="提交" targets="t1" href="%{ajaxTest}" align="left" indicator="indicator"/>
<br/>
简单的提交按钮，使用pub-sub事件模型(设置notifyTopics=/after属性)<br>
<s:submit type="submit" theme="ajax" value="提交" targets="t1" href="%{ajaxTest}" align="left" notifyTopics="/after"/>
<br/>
图片按钮（通过指定type="image"）<br>
<s:submit type="image" theme="ajax" label="Alt Text" targets="t1"
  src="${pageContext.request.contextPath}/images/struts-power.gif" href="%{ajaxTest}" align="left" />
<br/>
异步方式提交表单：(在下面输入的文本将在上面显示)
<s:form id="form" action="AjaxTest">
  <input type="text" name="data"/>
  <s:submit type="button" theme="ajax" label="发送" targets="t1" id="ajaxbtn"/>
</s:form>
</body>
</html>
