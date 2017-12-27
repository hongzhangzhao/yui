package lee;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import freemarker.template.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class HelloServlet extends HttpServlet
{
    private Configuration cfg; 
    
    public void init() 
	{
        //初始化FreeMarker配置
        //创建一个Configuration实例
        cfg = new Configuration();
        //设置FreeMarker的模版文件位置
        cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
    }
    
    public void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
	{        
        //建立数据模型
        Map root = new HashMap();
        root.put("message", "Hello FreeMarker!");     
        //取得模版文件
        Template t = cfg.getTemplate("test.ftl");        
        // 开始准备生成输出
        // - 使用模版文件的charset作为本页面的charset
        // - 使用text/html MIME-type
        response.setContentType("text/html; charset=" + t.getEncoding());
        Writer out = response.getWriter();
        
        //合并数据模型和模版，并将结果输出到out中
        try
		{
            t.process(root, out);
        } 
		catch (TemplateException e)
		{
            throw new ServletException("处理Template模版中出现错误", e);
        }
    }
}