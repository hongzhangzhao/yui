package lee;

import java.util.*;
import java.io.*;
import freemarker.template.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class HelloFreeMarker
{
    private Configuration cfg; 
    
    public void init() throws Exception
	{
        //��ʼ��FreeMarker����
        //����һ��Configurationʵ��
        cfg = new Configuration();
        //����FreeMarker��ģ���ļ�λ��
        cfg.setDirectoryForTemplateLoading(new File("templates"));
    }
    
	public void process()throws Exception
	{
        Map root = new HashMap();
        root.put("name", "FreeMarker!"); 
		root.put("msg" , "���Ѿ�����˵�һ��FreeMarker��ʾ��");
        Template t = cfg.getTemplate("test.ftl");
        t.process(root, new OutputStreamWriter(System.out));

	}

	public static void main(String[] args)throws Exception
	{
		HelloFreeMarker hf = new HelloFreeMarker();
		hf.init();
		hf.process();	
	}

}