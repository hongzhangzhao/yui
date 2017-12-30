package mypack;

import java.io.Serializable;

abstract public class Employee implements Serializable {

    private Long id;
    private String name;
    private Company company;

    /** full constructor */
    public Employee(String name,Company company) {
        this.name = name;
        this.company = company;
    }

    /** default constructor */
    public Employee() {
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

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
