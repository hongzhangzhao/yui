<%@ page contentType="text/html; charset=GBK" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>��Ʒ��ϸ��Ϣ</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr bgcolor="#e1e1e1" >
    <td colspan="2"><div class="mytitle">���������Ʒ��ϸ��Ϣ</div></td> 
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ��</td>
    <td><s:property value="item.name"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ����</td>
    <td><s:property value="item.desc"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ��ע</td>
    <td><s:property value="item.remark"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ����</td>
    <td><s:property value="item.kind"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ������</td>
    <td bgcolor="#FFFFFF"><s:property value="item.owner"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ���ļ�</td>
    <td><s:property value="item.initPrice"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ��߼�</td>
    <td><s:property value="item.maxPrice"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ����ʱ��</td>
    <td><s:property value="item.addTime"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>��Ʒ����ʱ��</td>
    <td><s:property value="item.endTime"/></td>
  </tr>
  <tr class="pt9" height="32">
    <td colspan=2>&nbsp;</td>
  </tr>
  <tr class="pt9" height="24">
    <td colspan="2">
	���������Ȥ�������Ʒ���ۣ�������۸���ύ����ע�⣬���ļ۸�Ӧ������Ʒ����߼�
	<s:actionerror/>
	</td>
  </tr>
<tr class="pt9" height="32">
<td colspan="2">
	<s:form action="bid.action">
		<input type="hidden" name="itemId" value="<s:property value='item.id'/>"/>
		<input type="hidden" name="maxPrice" value="<s:property value='item.maxPrice'/>"/>
		<s:textfield name="bidPrice" label="���ļ�"/>
		<s:textfield name="vercode" label="��֤��"/>
		<s:submit/>
	</s:form>
��֤�룺<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>