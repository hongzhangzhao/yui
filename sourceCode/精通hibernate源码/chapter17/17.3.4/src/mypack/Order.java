package mypack;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

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
        calculatePrice();
    }

     public double getPrice() {
        return this.price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
    
    private void calculatePrice(){
      double totalPrice=0;
      if(lineItems==null) return;
      Iterator it=lineItems.iterator();
      while(it.hasNext()){
        LineItem line=(LineItem)it.next();
        totalPrice=totalPrice+line.getUnitPrice();
      }
      setPrice(totalPrice);
    }

 }
