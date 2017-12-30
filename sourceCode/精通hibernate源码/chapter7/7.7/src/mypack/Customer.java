package mypack;

import java.io.Serializable;
public class Customer implements Serializable,Auditable{

    private Long id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
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

}
