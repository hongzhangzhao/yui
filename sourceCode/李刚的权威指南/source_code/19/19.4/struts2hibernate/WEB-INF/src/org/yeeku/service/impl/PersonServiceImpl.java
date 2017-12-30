package org.yeeku.service.impl;

import org.yeeku.service.*;
import org.yeeku.dao.*;
import org.yeeku.factory.*;
import org.yeeku.model.*;
import org.yeeku.tools.*;
import org.yeeku.exception.PersonException;


import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class PersonServiceImpl implements PersonService
{
    public void createPersonAndSon(String name , String gender , String[] sonName , int[] sonAge)
        throws PersonException
    {
        try
        {
            PersonDao pd = (PersonDao)DaoFactory.instance().getDao("personDao");
            SonDao sd = (SonDao)DaoFactory.instance().getDao("sonDao");
            Session s = HibernateUtil.currentSession();
            Transaction tx = s.beginTransaction();
            Person p = new Person();
            p.setName(name);
            p.setGender(gender);   
            pd.save(s , p);
            for (int i = 0 ; i < sonName.length  ; i++ )
            {
                Son son = new Son(sonName[i] , sonAge[i]);
                son.setParent(p);
                sd.save(s, son);
            }
            tx.commit();
            HibernateUtil.closeSession();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new PersonException("ÒµÎñÒì³£");
        }


    }
}
