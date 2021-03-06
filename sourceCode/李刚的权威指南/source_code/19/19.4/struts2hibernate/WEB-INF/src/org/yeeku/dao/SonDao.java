package org.yeeku.dao;

import org.hibernate.Session;

import org.yeeku.model.*;
import org.yeeku.dao.base.Dao;

import java.io.Serializable;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface SonDao extends Dao
{
    void save(Session sess , Son s);
    void delete(Session sess , Son s);
    void delete(Session sess , int id);
    void update(Session sess , Son s);
}
