package org.yeeku.dao.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.yeeku.model.*;
import org.yeeku.business.*;
import org.yeeku.dao.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class ItemDaoHibernate extends HibernateDaoSupport implements ItemDao  
{
    /**
     * ��������������Ʒ
     * @param itemId ��Ʒid;
     * @return id��Ӧ����Ʒ
     */
    public Item get(Integer itemId)
    {
        return (Item)getHibernateTemplate().get(Item.class , itemId);
    }

    /**
     * ������Ʒ
     * @param item ��Ҫ�������Ʒ
     */    
    public void save(Item item)
    {
        getHibernateTemplate().save(item);
    }

    /**
     * �޸���Ʒ
     * @param item ��Ҫ�޸ĵ���Ʒ
     */
    public void update(Item item)
    {
        getHibernateTemplate().saveOrUpdate(item);
    }
    /**
     * �޸���Ʒ
     * @param id ��Ҫɾ������Ʒid
     */
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Item.class , id));
    }

    /**
     * ɾ����Ʒ
     * @param item ��Ҫɾ������Ʒ
     */
    public void delete(Item item)
    {
        getHibernateTemplate().delete(item);
    }

    /**
     * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
     * @param kindId ����id;
     * @return �����ȫ����Ʒ
     */
    public List<Item> findItemByKind(Integer kindId)
    {
        return getHibernateTemplate().find("from Item as i where i.kind.id = ? and i.itemState.id = 1" , kindId);
    }    

    /**
     * ���������߲��������е���Ʒ
     * @param useId ������Id;
     * @return ���������е�ȫ����Ʒ
     */
    public List<Item> findItemByOwner(Integer userId)
    {
        return getHibernateTemplate().find("from Item as i where i.owner.id = ? and i.itemState.id = 1" , userId);
    }

    /**
     * ����Ӯȡ�߲�����Ʒ
     * @param userId Ӯȡ��Id;
     * @return ����Ӯȡ��ȫ����Ʒ
     */
    public List<Item> findItemByWiner(Integer userId)
    {
        return getHibernateTemplate().find("from Item as i where i.winer.id = ? and i.itemState.id = 2" ,userId);
    }

    /**
     * ������Ʒ״̬������Ʒ
     * @param stateId ״̬Id;
     * @return ��״̬�µ�ȫ����Ʒ
     */
    public List<Item> findItemByState(Integer stateId)
    {
        return getHibernateTemplate().find("from Item as i where i.itemState.id = ?" , stateId);
    }
}