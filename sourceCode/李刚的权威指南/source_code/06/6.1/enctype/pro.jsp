<%@ page contentType="text/html;charset=GBK" import="java.io.*"%>
<%
//request.setCharacterEncoding("GBK");
//out.println("wawa���������ֵΪ��" + request.getParameter("wawa") + "<br>");
//out.println("file���������ֵΪ��" + request.getParameter("file") + "<br>");

InputStream is = request.getInputStream();

BufferedReader br = new BufferedReader(new InputStreamReader(is));
String buffer = null;
while( (buffer = br.readLine()) != null)
{
	out.println(buffer + "<br>");
}
%>