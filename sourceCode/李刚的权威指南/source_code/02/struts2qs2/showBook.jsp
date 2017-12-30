<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title>作者李刚的图书</title>
    </head>
    <body>

	<table border="1" width="360">
	<caption>作者李刚的图书</caption>
	<s:iterator value="books" status="index">
		<s:if test="#index.odd == true"> 
         <tr style="background-color:#cccccc">
       </s:if> 
       <s:else> 
         <tr>
       </s:else>
		<td>书名：</td>
		<td><s:property/></td>
	</tr>
   </s:iterator>
	</table>
    </body>
</html>