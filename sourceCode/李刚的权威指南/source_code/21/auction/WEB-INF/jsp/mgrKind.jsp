<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>������������</title>
   <link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="2" ><div class="mytitle">��ǰ����Ʒ�������£�</div></td> 
  </tr>
<s:iterator id="kind" value="kinds" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td>������</td>
    <td><s:property value="kindName"/></td>
  </tr>
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td>��������</td>
    <td><s:property value="kindDesc"/></td>
  </tr>
</s:iterator>
</table>
</td>
</tr>
<tr>
<td>
<br><br>
���������
<s:actionerror cssClass="error"/>
<s:form action="proAddKind.action">
<s:textfield name="name" label="������"/>
<s:textfield name="desc" label="��������"/>
<s:textfield name="vercode" label="��֤��"/>
<s:submit/>
</s:form>
��֤�룺<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>