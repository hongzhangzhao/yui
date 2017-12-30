package mypack;

import java.io.Serializable;
public class CustomerRow implements Serializable {

    private Long id;

    private String name;

    private String orderNumber;
 
   public CustomerRow(Long id,String name, String orderNumber) {
        this.id=id;
        this.name = name;
        this.orderNumber = orderNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    
}
