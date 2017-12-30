package mypack;

import java.io.Serializable;
public class Item implements Serializable {
    private Long id;
    private String name;
    private double basePrice;

    /** full constructor */
    public Item(String name, double basePrice ) {
        this.name = name;
        this.basePrice = basePrice;
    }

    /** default constructor */
    public Item() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
 
}
