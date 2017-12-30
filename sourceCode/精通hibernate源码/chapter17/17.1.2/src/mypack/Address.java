package mypack;

import java.io.Serializable;
public class Address implements Serializable {
    private Long id;
    private String street;
    private String city;
    private String province;
    private String zipcode;
    private Customer customer;

    /** full constructor */
    public Address(String street, String city, String province, String zipcode, Customer customer) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
        this.customer = customer;
    }

    /** default constructor */
    public Address() {
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public mypack.Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(mypack.Customer customer) {
        this.customer = customer;
    }

}
