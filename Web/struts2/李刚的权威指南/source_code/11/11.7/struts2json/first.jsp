<%@ page language="java" contentType="text/html; charset=GBK"%>
<script src="prototype-1.4.0.js" type="text/javascript">
</script>
<script language="JavaScript">
	function gotClick()
	{
		//����ĵ�ַ
		var url = 'JSONExample.action';
		//��favorite�����ֵת��Ϊ�������
		var params = Form.serialize('form1');
		//����Ajax.Request���󣬶�Ӧ�ڷ�������
		var myAjax = new Ajax.Request(
		url,
		{
			//����ʽ��POST
			method:'post',
			//�������
			parameters:params,
			//ָ���ص�����
			onComplete: processResponse,
			//�Ƿ��첽��������
			asynchronous:true
		});
	}
    function processResponse(request)
	{
		$("show").innerHTML = request.responseText;
	}	
</script>
<html>
<head>
<title>ʹ��JSON���</title>
</head>
<body>
<form id="form1" name="form1" method="post">
<INPUT TYPE="text" name="field1" id="field1"/><br>
<INPUT TYPE="text" name="field2" id="field2"/><br>
<INPUT TYPE="text" name="field3" id="field3"/><br>
<INPUT TYPE="button" value="�ύ" onClick="gotClick();"/>
</form>
<div id="show">
</div>
</body>
</html>
