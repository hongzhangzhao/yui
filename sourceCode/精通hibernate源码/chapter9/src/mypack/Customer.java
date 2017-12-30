package mypack;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Customer implements Serializable {


    private Long id;

    private Name name;

    private Address homeAddress;

    private Address comAddress;

    private Gender gender;

    private Integer phone;

    /** full constructor */
    public Customer(Name name, Address homeAddress, Address comAddress,Gender gender,Integer phone) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.comAddress = comAddress;
        this.gender=gender;
        this.phone=phone;
    }


    public Customer() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getComAddress() {
        return this.comAddress;
    }

    public void setComAddress(Address comAddress) {
        this.comAddress = comAddress;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getPhone() {
        return this.phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }


}
