<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>pub-subģ��</title>
	<s:head theme="ajax"/>
</head>
<script type="text/javascript">
    dojo.event.topic.subscribe("/lee", function(data, type, e){
      alert('������Dojo���첽���������У������ǣ�'+type);
	  alert(e);
   });
</script>
<body>
��pub-subģ��<br>
<!-- targets������������װ�ر��ı��HTMLԪ�� -->
<s:submit type="submit" theme="ajax" value="�ύ" align="left" notifyTopics="/lee"/>
</body>
</html>
