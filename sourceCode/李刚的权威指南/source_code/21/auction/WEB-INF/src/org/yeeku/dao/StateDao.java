package org.yeeku.dao;

import java.util.List;

import org.yeeku.model.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface StateDao  
{
    /**
     * ����id����״̬
     * @param id ��Ҫ���ҵ�״̬id
     */  
    State get(Integer id);
    /**
     * ����״̬
     * @param state ��Ҫ���ӵ�״̬
     */       
    void save(State state);

    /**
     * �޸�״̬
     * @param state ��Ҫ�޸ĵ�״̬
     */  
    void update(State state);

    /**
     * ɾ��״̬
     * @param id ��Ҫɾ����״̬id
     */  
    void delete(Integer id);

    /**
     * ɾ��״̬
     * @param state ��Ҫɾ����״̬
     */  
    void delete(State state);

    /**
     * ��ѯȫ��״̬
     * @return ���ȫ��״̬
     */ 
    List<State> findAll();    

}
