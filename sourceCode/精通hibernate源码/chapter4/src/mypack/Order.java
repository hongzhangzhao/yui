package mypack;

import java.io.Serializable;
public class Order implements Serializable {

    private Long id;
    private String orderNumber;
    private double price;
    private Customer customer;

    public Order() {
    }
    public Order(String orderNumber,double price,Customer customer) {
      this.orderNumber=orderNumber;
      this.price=price;
      this.customer=customer;
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

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPrice(){
       return this.price;
    }
    private void setPrice( double price ){
       this.price = price;
    }
}
