package mypack;
public class Order {
    private Long id;
    private String orderNumber;
    private double price;
    private Customer customer;

    /** 完整的构造方法 */
    public Order(String orderNumber, double price,mypack.Customer customer) {
        this.orderNumber = orderNumber;
        this.price=price;
        this.customer = customer;
    }

    /** 默认构造方法 */
    public Order() {}

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
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
 }

