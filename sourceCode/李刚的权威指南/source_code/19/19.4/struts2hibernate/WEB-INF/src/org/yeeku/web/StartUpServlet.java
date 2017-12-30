package org.yeeku.web;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import org.yeeku.consttool.*;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class StartUpServlet extends HttpServlet
{
    public void init() throws ServletException
    {
        System.out.println("-------------");
        ConstantsUtil.realPath = getServletContext().getRealPath("/WEB-INF/");
    }
}
