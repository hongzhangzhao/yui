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

    public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
        request.setCharacterEncoding("GBK");
        String name = request.getParameter("username");
        String pass = request.getParameter("pass");
        String strAge = request.getParameter("age");
        String strBirth = request.getParameter("birth");

        int age = Integer.parseInt(strAge);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
        Date birth = null;
        try
        {
            birth = sdf.parse(strBirth);
        }
        catch (Exception e)
        {
			e.printStackTrace();
        }
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

    public void destroy()
    {
        super.destroy();
    }



}
