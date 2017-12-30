package org.yeeku.action.base;

import com.opensymphony.xwork2.ActionSupport;

import org.yeeku.service.UserManager;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class BaseAction extends ActionSupport
{
    protected UserManager mgr;

    public void setMgr(UserManager mgr)
    {
        this.mgr = mgr;
    }
}