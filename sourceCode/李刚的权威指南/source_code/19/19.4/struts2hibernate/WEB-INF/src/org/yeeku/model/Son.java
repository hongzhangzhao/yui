package org.yeeku.model;

import java.io.Serializable;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Son implements Serializable
{
    private int id;
    private String sonName;
    private int sonAge;
    private Person parent;
    
    public Son()
    {
    }
	
    public Son(String sonName , int sonAge)
    {
        this.sonName = sonName;
        this.sonAge = sonAge;
    }

	public void setSonName(String sonName) {
		this.sonName = sonName; 
	}

	public void setSonAge(int sonAge) {
		this.sonAge = sonAge; 
	}

    public void setId(int id)
    {
        this.id = id;
    }
    public void setParent(Person p)
    {
        this.parent = p;
    }

	public String getSonName() {
		return (this.sonName); 
	}

	public int getSonAge() {
		return (this.sonAge); 
	}

    public int getId()
    {
        return id;
    }

    public Person getParent()
    {
        return parent;
    }

}
