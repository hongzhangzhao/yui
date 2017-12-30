package mypack;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class Order implements Serializable {


    private Long id;
    private String orderNumber;
    private double price;
    private Set lineItems=new HashSet();

    public Order(String orderNumber, Set lineItems) {
        this.orderNumber = orderNumber;
        this.lineItems = lineItems;
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

    public Set getLineItems() {
        return this.lineItems;
    }

    public void setLineItems(Set lineItems) {
        this.lineItems = lineItems;
    }

     public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


 }
