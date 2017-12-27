package lee;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Regist extends HttpServlet
{

    public void service(HttpServletRequest request,HttpServletResponse response)
		throws IOException, ServletException
	{
        request.setCharacterEncoding("GBK");
        String name = request.getParameter("username");
        String pass = request.getParameter("pass");
        String strAge = request.getParameter("age");
        String strBirth = request.getParameter("birth");
		
		String errStr = "";

		if (name == null || name.trim().equals(""))
		{
			errStr = "�����������û�����";
		}
		else if (!Pattern.matches("\\w{4,25}", name.trim()))
		{
			errStr += "<br>�������û�����������ĸ�����֣��ҳ��ȱ�����4��25֮�䣡";
		}
		if (pass == null || pass.trim().equals(""))
		{
			errStr += "<br>�������������룡";
		}
		else if (!Pattern.matches("\\w{4,25}", pass.trim()))
		{
			errStr += "<br>�����������������ĸ�����֣��ҳ��ȱ�����4��25֮�䣡";
		}
		int age = 0;
		try
		{
			age = Integer.parseInt(strAge);	
			if (age > 150 || age <= 0)
			{	
				errStr += "<br>����������������һ����Ч�����䣡";
			}		
		}
		catch (Exception e)
		{
			errStr += "<br>����������������������";
		}

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
        Date birth = null;
        try
        {
            birth = sdf.parse(strBirth);
			if (birth.after(sdf.parse("2050-02-21")) || birth.before(sdf.parse("1900-01-01")))
			{
				errStr += "<br>����������ձ�����һ����Ч��ʱ�����";
			}
        }
        catch (Exception e)
        {
			errStr += "<br>����������ձ�����yyyy-MM-DD��ʽ��";
        }

		if (errStr.equals(""))
		{
			UserBean user = new UserBean(name , pass , age , birth);

			response.setContentType("text/html;charset=GBK");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>");
			out.println("����ת��ҳ��");
			out.println("</title></head><body>");
			out.println("<h1>����ת��ҳ��</h1>");
			out.println(user.getName() + "<br>");
			out.println(user.getPass() + "<br>");
			out.println(user.getAge() + "<br>");
			out.println(user.getBirth() + "<br>");
			out.println("</body></html>");
		}
		else
		{
			request.setAttribute("tip" , errStr);
			request.getRequestDispatcher("/regist.jsp").forward(request,response);
		}

	}
}