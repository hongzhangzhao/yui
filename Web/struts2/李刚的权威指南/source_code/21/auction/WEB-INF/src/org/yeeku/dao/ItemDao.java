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
     * 根据主键查找物品
     * @param itemId 物品id;
     * @return id对应的物品
     */
    Item get(Integer itemId);

    /**
     * 保存物品
     * @param item 需要保存的物品
     */    
    void save(Item item);

    /**
     * 修改物品
     * @param item 需要修改的物品
     */
    void update(Item item);

    /**
     * 删除物品
     * @param id 需要删除的物品id
     */
    void delete(Integer id);

    /**
     * 删除物品
     * @param item 需要删除的物品
     */
    void delete(Item item);



    /**
     * 根据产品分类，获取当前拍卖的全部商品
     * @param kindId 种类id;
     * @return 该类的全部产品
     */
    List<Item> findItemByKind(Integer kindId);
    

    /**
     * 根据所有者查找拍卖中的物品
     * @param useId 所有者Id;
     * @return 该人拍卖中的全部物品
     */
    List<Item> findItemByOwner(Integer userId);



    /**
     * 根据赢取者查找物品
     * @param userId 赢取者Id;
     * @return 该人赢取的全部物品
     */
    List<Item>  findItemByWiner(Integer userId);


    /**
     * 根据物品状态查找物品
     * @param stateId 状态Id;
     * @return 该状态下的全部物品
     */
    List<Item>  findItemByState(Integer stateId);
}