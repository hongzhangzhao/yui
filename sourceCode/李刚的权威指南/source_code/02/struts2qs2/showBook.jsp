<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title>������յ�ͼ��</title>
    </head>
    <body>

	<table border="1" width="360">
	<caption>������յ�ͼ��</caption>
	<s:iterator value="books" status="index">
		<s:if test="#index.odd == true"> 
         <tr style="background-color:#cccccc">
       </s:if> 
       <s:else> 
         <tr>
       </s:else>
		<td>������</td>
		<td><s:property/></td>
	</tr>
   </s:iterator>
	</table>
    </body>
</html>