<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title><s:text name="bookPageTitle"/></title>
    </head>
    <body>

	<table border="1" width="360">
	<caption><s:text name="bookPageTitle"/></caption>
	<s:iterator value="books" status="index">
		<s:if test="#index.odd == true"> 
         <tr style="background-color:#cccccc">
       </s:if> 
       <s:else> 
         <tr>
       </s:else>
		<td><s:text name="bookName"/></td>
		<td><s:property/></td>
	</tr>
   </s:iterator>
	</table>
    </body>
</html>