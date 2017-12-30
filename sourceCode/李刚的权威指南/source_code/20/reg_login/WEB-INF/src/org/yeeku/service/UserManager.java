package org.yeeku.service;

import java.util.List;

import org.yeeku.dao.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface UserManager
{
    /**
     * 新增用户
     * @param user 新增用户的用户名
     * @param pass 新增用户的密码
     * @param email 新增用户的电子邮件
	 * @return 新增用户的主键
     */
    int addUser(String user , String pass , String email) 
		throws Exception;

    /**
     * 验证用户登陆
     * @param user 需要登陆的用户名
     * @param pass 需要登陆的密码
	 * @return 是否登陆成功
     */
    int loginValid(String user , String pass) 
		throws Exception;

    /**
     * 验证用户名是否可用，如果系统中已有该用户名，则不可用。
     * @param user 需要验证的用户名
	 * @return 用户名是否可用
     */
	boolean validateName(String user)
		throws Exception;
}
