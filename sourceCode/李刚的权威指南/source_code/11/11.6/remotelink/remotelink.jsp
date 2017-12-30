<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Զ������</title>
	<s:head theme="ajax"/>
</head>

<script type="text/javascript">
	function before() {alert("before request");}
	function after() {alert("after request");}
	function handler(widget, node) 
	{
		alert('�����Զ��庯��');
		dojo.byId(widget.targetsArray[0]).innerHTML = "Spring2.0����";
	}

    dojo.event.topic.subscribe("/after", function(data, type, e){
      alert('������Dojo���첽���������У������ǣ�'+type);
      //data : text returned
      //type : "before", "load" or "error"
      //e    : request object
   });
</script>

<body>
<div id="t1" style="background-color:#bbbbbb;width:360px;height:80px">Div 1</div>
<br/>
<div id="t2" style="background-color:#bbbbbb;width:360px;height:80px">Div 2</div>
<br/>

<s:url id="ajaxTest" value="/AjaxTest.action" />
<s:url id="test3" value="/Test3.action" />
<br/>
ͬʱ�޸�Div1��Div2������<br/>
�ҽ��¼�������/after����(ָ��notifyTopics����)<br/>
<s:a    id="link1"   
		theme="ajax"
        href="%{ajaxTest}"
        indicator="indicator"
		targets="t1,t2" notifyTopics="/after" >�޸�Div1��Div2����</s:a>
<img id="indicator" src="${pageContext.request.contextPath}/images/indicator.gif" alt="Loading..." style="display:none"/>
<br/>
ָ�������ڷ���ʧ��ʱ�Ĵ�����ʾ(ָ��errorText����)<br/>
��Ϊϵͳ��AjaxNoUrl.jspҳ�治���ڣ��϶�����<br/>
<s:a	id="link2"
        theme="ajax"
        href="/AjaxNoUrl.jsp"
		errorText="ϵͳ������������Ϣ����"
		targets="t1">�޸�'Div 1'���ݣ�ʹ���Զ��������ʾ</s:a>
<br/>
ָ��ϵͳ�����е���ʾ��Ϣ(ָ��loadingText����)<br/>
<s:a    id="link3"
        theme="ajax"
        href="%{ajaxTest}"
		loadingText="ϵͳ���ڼ�����..."
		targets="t1">�޸�'Div 1'���ݣ�ʹ���Զ��������Ϣ</s:a>
<br/>
ִ��Զ��JavaScript����(ָ��executeScripts��true����)<br/>
<s:a    id="link4"
        theme="ajax"
        href="%{test3}"
		executeScripts="true"
		targets="t2">��ִ��Զ��JavaScript</s:a>
<br/>
ͨ��ʹ���Զ���JavaScript������ʵ��Ajax����(ָ��handle����)<br/>
<s:a    id="link5"
        theme="ajax"
        href="%{ajaxTest}"
		handler="handler"
		targets="t2">ʹ���Զ���Ĵ�����</s:a>
<form id="form">
  <input type=textbox name="data">
</form>
�ύ������(ͨ��ָ��formId����)
<s:a    id="link6"
        theme="ajax"
        href="%{ajaxTest}"
		targets="t2"
		formId="form">Div 2 ����ʾ�������ı��������������</s:a>
</body>
</html>
