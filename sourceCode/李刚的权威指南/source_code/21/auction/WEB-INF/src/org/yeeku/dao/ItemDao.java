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
public interface ItemDao  
{
    /**
     * ��������������Ʒ
     * @param itemId ��Ʒid;
     * @return id��Ӧ����Ʒ
     */
    Item get(Integer itemId);

    /**
     * ������Ʒ
     * @param item ��Ҫ�������Ʒ
     */    
    void save(Item item);

    /**
     * �޸���Ʒ
     * @param item ��Ҫ�޸ĵ���Ʒ
     */
    void update(Item item);

    /**
     * ɾ����Ʒ
     * @param id ��Ҫɾ������Ʒid
     */
    void delete(Integer id);

    /**
     * ɾ����Ʒ
     * @param item ��Ҫɾ������Ʒ
     */
    void delete(Item item);



    /**
     * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
     * @param kindId ����id;
     * @return �����ȫ����Ʒ
     */
    List<Item> findItemByKind(Integer kindId);
    

    /**
     * ���������߲��������е���Ʒ
     * @param useId ������Id;
     * @return ���������е�ȫ����Ʒ
     */
    List<Item> findItemByOwner(Integer userId);



    /**
     * ����Ӯȡ�߲�����Ʒ
     * @param userId Ӯȡ��Id;
     * @return ����Ӯȡ��ȫ����Ʒ
     */
    List<Item>  findItemByWiner(Integer userId);


    /**
     * ������Ʒ״̬������Ʒ
     * @param stateId ״̬Id;
     * @return ��״̬�µ�ȫ����Ʒ
     */
    List<Item>  findItemByState(Integer stateId);
}