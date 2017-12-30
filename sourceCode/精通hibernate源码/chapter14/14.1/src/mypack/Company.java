package mypack;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class Company implements Serializable {

    private Long id;
    private String name;
    private Set employees=new HashSet();

    /** full constructor */
    public Company(String name, Set employees) {
        this.name = name;
        this.employees = employees;
    }

    /** default constructor */
    public Company() {
    }

    /** minimal constructor */
    public Company(Set employees) {
        this.employees = employees;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getEmployees() {
        return this.employees;
    }

    public void setEmployees(Set employees) {
        this.employees = employees;
    }
}
