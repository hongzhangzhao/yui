package mypack;

import java.io.Serializable;
public class Customer implements Serializable {


    private Long id;
    private String name;
    private Address homeAddress;
    private Address comAddress;

    public Customer(String name, Address homeAddress, Address comAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.comAddress = comAddress;
    }

    /** default constructor */
    public Customer() {
    }

    /** minimal constructor */
    public Customer(Address homeAddress, Address comAddress) {
        this.homeAddress = homeAddress;
        this.comAddress = comAddress;
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

    public mypack.Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(mypack.Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public mypack.Address getComAddress() {
        return this.comAddress;
    }

    public void setComAddress(mypack.Address comAddress) {
        this.comAddress = comAddress;
    }

}
