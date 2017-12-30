package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Address implements Serializable {

    /** nullable persistent field */
    private String province;

    /** nullable persistent field */
    private String city;

    /** nullable persistent field */
    private String street;

    /** nullable persistent field */
    private String zipcode;

    /** nullable persistent field */
    private mypack.Customer customer;

    /** full constructor */
    public Address(String province, String city, String street, String zipcode, mypack.Customer customer) {
        this.province = province;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
        this.customer = customer;
    }

    /** default constructor */
    public Address() {
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
