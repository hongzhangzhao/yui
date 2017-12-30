package mypack;

import java.io.Serializable;

public class LineItem implements Serializable {

    private Item item;
    private Order order;
    private double basePrice;
    private int quantity;

    public LineItem(Item item,Order order,double basePrice,int quantity) {
        this.item= item;
        this.order = order;
        this.basePrice=basePrice;
        this.quantity=quantity;
   }

    /** default constructor */
    public LineItem() {
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getUnitPrice() {
        return basePrice*quantity;
    }


    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
  }
