package mypack;

import java.io.Serializable;

/** 
 * @hibernate.class
 * table="ORDERS"
 */
public class Order implements Serializable {

    private Long id;
    private String orderNumber;
    private Customer customer;

    public Order(String orderNumber, Customer customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
    }

    public Order() {
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

    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * @hibernate.property
     * column="ORDER_NUMBER"
     * length="15"
     * not-null="true"
     */
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    /**
     * @hibernate.many-to-one
     * column="CUSTOMER_ID"
     * cascade="none"
     * not-null="true"
     */
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
