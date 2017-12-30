<%@ page contentType="text/html;charset=GBK" import="java.io.*"%>
<%
InputStream is = request.getInputStream();

BufferedReader br = new BufferedReader(new InputStreamReader(is));
String buffer = null;
while( (buffer = br.readLine()) != null)
{
	if(buffer.endsWith("--") && buffer.startsWith("-----------------------------"))
	{
		break;
	}
	if(buffer.startsWith("-----------------------------"))
	{
		if (br.readLine().indexOf("filename") > 1)
		{
			br.readLine();
			br.readLine();
			File file = new File(request.getRealPath("/") + System.currentTimeMillis());
			PrintStream ps = new PrintStream(new FileOutputStream(file));
			String content = null;
			while( (content = br.readLine()) != null)
			{
				if(content.startsWith("-----------------------------"))
				{
					break;
				}
				ps.println(content);
			}
			ps.flush();
			ps.close();
		}
	}
}
br.close();
%>