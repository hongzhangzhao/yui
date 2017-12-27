package org.yeeku.model;

import java.util.*;

public class Person
{
	private int id;
	private String name;
	private String gender;
    private Set<Son> sons = new HashSet<Son>(); 

	public Person()
	{
	}	
	
	public void setId(int id) {
		this.id = id; 
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setGender(String gender) {
		this.gender = gender; 
	}
    public void setSons(Set<Son> sons)
    {
        this.sons = sons;
    }

	public int getId() {
		return (this.id); 
	}

	public String getName() {
		return (this.name); 
	}

	public String getGender() {
		return (this.gender); 
	}

    public Set<Son> getSons()
    {
        return this.sons;
    }
} 