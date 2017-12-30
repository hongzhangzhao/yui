package mypack;

import java.io.Serializable;
public class Order extends BusinessObject {

    private String orderNumber;
    private double price;

    public Order(String orderNumber, double price) {
        this.orderNumber = orderNumber;
        this.price= price;
    }

    public Order() {
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

}
