<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>����������Ʒ</title>
</head>
<body">
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="4" ><div class="mytitle">����ǰ��������Ʒ��</div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td><b>��Ʒ��</b></td>
    <td><b>��Ʒ����</b></td>
    <td><b>Ӯȡ�۸�</b></td>
    <td><b>��Ʒ��ע</b></td>
  </tr>
<s:iterator id="item" value="items" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td><s:property value="name"/></td>
    <td><s:property value="kind"/></td>
    <td><s:property value="maxPrice"/></td>
    <td><s:property value="remark"/></td>
  </tr>
</s:iterator>
</table>
</TD>
</TR>
<tr>
<td>
<br>
�������Ʒ
<s:actionerror/>
<s:form action="proAddItem.action">
<s:textfield name="name" label="��Ʒ��"/>
<s:textfield name="desc" label="��Ʒ����"/>
<s:textfield name="remark" label="��Ʒ��ע"/>
<s:textfield name="initPrice" label="���ļ۸�"/>
<s:select list="#{'1':'һ��','2':'����','3':'����','4':'����','5':'����','6':'һ������','7':'һ����','8':'һ��'}"
	label="��Чʱ��"/>
<s:select list="kinds" label="��Ʒ����" name="kind"
	listKey="id"
	listValue="kindName"/>
<s:textfield name="vercode" label="��֤��"/>
<s:submit/>
</s:form>
��֤�룺<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>