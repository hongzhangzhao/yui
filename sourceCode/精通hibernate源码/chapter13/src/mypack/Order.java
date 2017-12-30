package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Order implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String orderNumber;

 /** nullable persistent field */
    private double price;

    /** nullable persistent field */
    private mypack.Customer customer;

    /** full constructor */
    public Order(String orderNumber, mypack.Customer customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
    }

    /** default constructor */
    public Order() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

   public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public mypack.Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(mypack.Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
