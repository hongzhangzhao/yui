<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <title>ѡ����Ʒ����</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<s:actionerror/>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="4"><div class="mytitle">��ѡ����Ҫ�������Ʒ����</div></td> 
  </tr>
<s:iterator id="kind" value="kinds" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td>������</td>
    <td><a href='viewItem.action?kindId=<s:property value="id"/>'>
	<s:property value="kindName"/></a></td>
  </tr>
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td>��������</td>
    <td><s:property value="kindDesc"/></td>
  </tr>
</s:iterator>
</table>
</TD>
</TR>
</TABLE>
</body>
</html>