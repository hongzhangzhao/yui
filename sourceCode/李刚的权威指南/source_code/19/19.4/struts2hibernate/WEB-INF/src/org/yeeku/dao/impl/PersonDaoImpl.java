package org.yeeku.dao.impl;

import org.hibernate.Session;

import org.yeeku.model.*;
import org.yeeku.dao.*;

import java.util.*;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class PersonDaoImpl implements PersonDao
{
    public void save(Session sess , Person p)
    {
        sess.save(p);
    }

    public void delete(Session sess , Person p)
    {
        sess.delete(p);
    }

    public void delete(Session sess , int id)
    {
        sess.delete(sess.get(Person.class , new Integer(id)));
    }

    public void update(Session sess , Person p)
    {
        sess.update(p);
    }
} 