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
public interface KindDao  
{

    /**
     * ����id��������
     * @param id ��Ҫ���ҵ�����id
     */  
    Kind get(Integer id);
    /**
     * ��������
     * @param kind ��Ҫ���ӵ�����
     */       
    void save(Kind kind);

    /**
     * �޸�����
     * @param kind ��Ҫ�޸ĵ�����
     */  
    void update(Kind kind);

    /**
     * ɾ������
     * @param id ��Ҫɾ��������id
     */  
    void delete(Integer id);

    /**
     * ɾ������
     * @param kind ��Ҫɾ��������
     */  
    void delete(Kind kind);

    /**
     * ��ѯȫ������
     * @return ���ȫ������
     */ 
    List<Kind> findAll();    
}
