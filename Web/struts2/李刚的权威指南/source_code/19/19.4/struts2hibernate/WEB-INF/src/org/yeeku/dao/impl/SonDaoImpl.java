package org.yeeku.dao.impl;

import org.hibernate.Session;

import org.yeeku.model.*;
import org.yeeku.dao.*;

import java.io.Serializable;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class SonDaoImpl implements SonDao
{
    public void save(Session sess , Son s)
    {
        sess.save(s);
    }
    public void delete(Session sess , Son s)
    {
        sess.delete(s);
    }
    public void delete(Session sess , int id)
    {
        sess.delete(sess.get(Son.class , new Integer(id)));
    }
    public void update(Session sess , Son s)
    {
        sess.update(s);
    }
}
