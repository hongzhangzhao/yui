package org.yeeku.service;

import org.yeeku.exception.PersonException;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface PersonService  
{
    void createPersonAndSon(String name , String gender , String[] sonName , int[] sonAge)
        throws PersonException;
}
