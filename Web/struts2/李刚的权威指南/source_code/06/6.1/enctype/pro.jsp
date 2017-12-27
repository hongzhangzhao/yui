<%@ page contentType="text/html;charset=GBK" import="java.io.*"%>
<%
//request.setCharacterEncoding("GBK");
//out.println("wawa请求参数的值为：" + request.getParameter("wawa") + "<br>");
//out.println("file请求参数的值为：" + request.getParameter("file") + "<br>");

InputStream is = request.getInputStream();

BufferedReader br = new BufferedReader(new InputStreamReader(is));
String buffer = null;
while( (buffer = br.readLine()) != null)
{
	out.println(buffer + "<br>");
}
%>