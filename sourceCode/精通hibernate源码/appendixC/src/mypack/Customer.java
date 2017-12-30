package mypack;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet; 

/** 
 * @hibernate.class
 * table="CUSTOMERS"
 */
public class Customer implements Serializable {

    private Long id;
    private String name;
    private Address address;
    private Set orders=new HashSet();

    public Customer(String name, Address address, Set orders) {
        this.name = name;
        this.address = address;
        this.orders = orders;
    }


    public Customer() {
    }

    /** 
     * @hibernate.id
     * column="ID"
     * unsaved-value="null"
     * generator-class="increment"
     */
    public Long getId() {
        return this.id;
    }
    
    protected void setId(Long id) {
        this.id = id;
    }

    /** 
     * @hibernate.property
     * column="NAME"
     * length="15"
     * not-null="true"
     * update="false"
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    /** 
     * @hibernate.component
     */
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

     
    /** 
     * @hibernate.set
     * inverse="true"
     * lazy="true"
     * cascade="save-update"
     * @hibernate.collection-key
     * column="CUSTOMER_ID"
     * @hibernate.collection-one-to-many
     * class="mypack.Order"
     */
    public Set getOrders() {
        return this.orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }

}
