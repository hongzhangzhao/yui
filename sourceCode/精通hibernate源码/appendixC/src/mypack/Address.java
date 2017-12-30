package mypack;

import java.io.Serializable;


public class Address implements Serializable {

    private String street;
    private String city;
    private String province;
    private String zipcode;
 
    public Address(String street, String city, String province, String zipcode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
    }

    public Address() {
    }

    /** 
     * @hibernate.property
     * column="STREET"
     * length="128"
     */
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    /** 
     * @hibernate.property
     * column="CITY"
     * length="128"
     */
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
  
    /** 
     * @hibernate.property
     * column="PROVINCE"
     * length="128"
     */
    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
   /** 
     * @hibernate.property
     * column="ZIPCODE"
     * length="6"
     */
    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

   
}
