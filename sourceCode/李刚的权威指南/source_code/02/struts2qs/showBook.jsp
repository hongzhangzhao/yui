<%@ page language="java" contentType="text/html; charset=GBK" import="java.util.*,com.opensymphony.xwork2.util.*"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title>������յ�ͼ��</title>
    </head>
    <body>

	<table border="1" width="360">
	<caption>������յ�ͼ��</caption>
	<%	
	ValueStack vs = (ValueStack)request.getAttribute("struts.valueStack");
	String[] books = (String[])vs.findValue("books");
	for (String book : books)
	{	
	%>
	<tr>
		<td>������</td>
		<td><%=book%></td>
	</tr>
	<%}%>
	</table>

    </body>
</html>