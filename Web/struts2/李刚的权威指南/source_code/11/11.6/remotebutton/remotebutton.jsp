<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Զ�̰�ť</title>
	<s:head theme="ajax" debug="true"/>
</head>

<script type="text/javascript">
    dojo.event.topic.subscribe("/after", function(data, type, e){
      alert('������Dojo���첽���������У������ǣ�'+type);
      //data : text returned
      //type : "before", "load" or "error"
      //e    : request object
   });
</script>

<body>

<div id="t1" style="background-color:#bbbbbb;width:360px;height:80px">�����ı�Ľ��</div>
<s:url id="ajaxTest" value="/AjaxTest.action" />
�򵥵��ύ��ť��ʹ��indicator<br>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<!-- targets������������װ�ر��ı��HTMLԪ�� -->
<s:submit type="submit" theme="ajax" value="�ύ" targets="t1" href="%{ajaxTest}" align="left" indicator="indicator"/>
<br/>
�򵥵��ύ��ť��ʹ��pub-sub�¼�ģ��(����notifyTopics=/after����)<br>
<s:submit type="submit" theme="ajax" value="�ύ" targets="t1" href="%{ajaxTest}" align="left" notifyTopics="/after"/>
<br/>
ͼƬ��ť��ͨ��ָ��type="image"��<br>
<s:submit type="image" theme="ajax" label="Alt Text" targets="t1"
  src="${pageContext.request.contextPath}/images/struts-power.gif" href="%{ajaxTest}" align="left" />
<br/>
�첽��ʽ�ύ����(������������ı�����������ʾ)
<s:form id="form" action="AjaxTest">
  <input type="text" name="data"/>
  <s:submit type="button" theme="ajax" label="����" targets="t1" id="ajaxbtn"/>
</s:form>
</body>
</html>
