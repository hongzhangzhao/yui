<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�û�ע��</title>
		<script src="prototype-1.4.0.js" type="text/javascript">
		</script>
		<script src="json.js" type="text/javascript">
		</script>
		<script language="JavaScript">
			function validateName()
			{
				//����ĵ�ַ
				var url = 'validateName.action';
				var params = Form.Element.serialize('user');
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
				var action = request.responseText.parseJSON();
				$("tip").innerHTML = action.tip;
			}	
		</script>
	</head>
	<body>
		<center>
		<h3>������ע����Ϣ</h3>
		<s:actionerror/>
		<span id="tip" style="color:red;font-weight:bold"></span>
		<s:form action="Regist.action">
			<s:textfield id="user" name="user" label="�û���" onblur="validateName();"/>
			<s:textfield name="pass" label="����"/>
			<s:textfield name="email" label="����"/>
			<s:textfield name="vercode" label="��֤��" value=""/>
			<s:submit value="ע��"/>
		</s:form>
		��֤����ͼ��<img src="authImg" id="authImg"/>�����壿<a href="#" onClick="refresh()">�����˴�ˢ��</a>
		</center>
	</body>
</html>