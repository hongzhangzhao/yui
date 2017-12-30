
package mypack;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DBServlet extends HttpServlet {

  public void init(ServletConfig config)
    throws ServletException {
    super.init(config);
  }

  public void doGet(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    // If it is a get request forward to doPost()
    doPost(request, response);

  }

  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
       try{
             response.setContentType("text/html;charset=GB2312");
             new BusinessService().test(this.getServletContext(),response.getOutputStream());
       }catch(Exception e){e.printStackTrace();
}
  }

  public void destroy() {
  }
}
