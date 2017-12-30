package mypack;

import java.io.Serializable;
public class Customer implements Serializable {


    private Long id;
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
     }

    /** default constructor */
    public Customer() {
    }

    /** minimal constructor */
    public Customer(Address address) {
        this.address = address;
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

    public mypack.Address getAddress() {
        return this.address;
    }

    public void setAddress(mypack.Address address) {
        this.address = address;
    }

}
