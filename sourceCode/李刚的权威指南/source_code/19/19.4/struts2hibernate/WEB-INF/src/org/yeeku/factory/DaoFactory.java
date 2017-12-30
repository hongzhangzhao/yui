package org.yeeku.factory;

import org.yeeku.dao.base.Dao;
import org.yeeku.dao.*;
import org.yeeku.dao.impl.*;
import org.yeeku.consttool.*;

import org.dom4j.*;
import org.dom4j.io.*;

import java.util.*;
import java.io.*;

/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class DaoFactory
{
    private Map<String , Dao> daoMap = new HashMap<String , Dao>(); 

    private static DaoFactory df;

    private DaoFactory()throws Exception
    {
        Document doc = new SAXReader().read(new File(ConstantsUtil.realPath + "\\daoContext.xml"));
        Element root = doc.getRootElement();
        List el =  root.elements();
        for (Iterator it = el.iterator();it.hasNext() ; )
        {
            Element em = (Element)it.next();
            String id = em.attributeValue("id");
            String impl = em.attributeValue("class");
            Class implClazz = Class.forName(impl);
            Dao d = (Dao)implClazz.newInstance();
            daoMap.put(id , d);            
        }
    }

    public static DaoFactory instance()throws Exception
    {
        if (df == null)
        {
            df = new DaoFactory(); 
        }
        return df;
    }

    public Dao getDao(String id)
    {
        return daoMap.get(id);
    }
}
