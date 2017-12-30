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
			errStr = "您必须输入用户名！";
		}
		else if (!Pattern.matches("\\w{4,25}", name.trim()))
		{
			errStr += "<br>您输入用户名必须是字母和数字，且长度必须是4到25之间！";
		}
		if (pass == null || pass.trim().equals(""))
		{
			errStr += "<br>您必须输入密码！";
		}
		else if (!Pattern.matches("\\w{4,25}", pass.trim()))
		{
			errStr += "<br>您输入密码必须是字母和数字，且长度必须是4到25之间！";
		}
		int age = 0;
		try
		{
			age = Integer.parseInt(strAge);	
			if (age > 150 || age <= 0)
			{	
				errStr += "<br>您输入的年龄必须是一个有效的年龄！";
			}		
		}
		catch (Exception e)
		{
			errStr += "<br>您输入的年龄必须是整数！";
		}

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
        Date birth = null;
        try
        {
            birth = sdf.parse(strBirth);
			if (birth.after(sdf.parse("2050-02-21")) || birth.before(sdf.parse("1900-01-01")))
			{
				errStr += "<br>您输入的生日必须在一个有效的时间段内";
			}
        }
        catch (Exception e)
        {
			errStr += "<br>您输入的生日必须是yyyy-MM-DD格式！";
        }

		if (errStr.equals(""))
		{
			UserBean user = new UserBean(name , pass , age , birth);

			response.setContentType("text/html;charset=GBK");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>");
			out.println("类型转换页面");
			out.println("</title></head><body>");
			out.println("<h1>类型转换页面</h1>");
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