package mypack;
import java.util.Set;
import java.util.HashSet;
public class Customer {
    private Long id;
    private String name;
    private int age;
    private Set orders=new HashSet();

    /** �����Ĺ��췽��*/
    public Customer(String name, int age,Set orders) {
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    /** Ĭ�Ϲ��췽��*/
    public Customer() {}

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

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Set getOrders() {
        return this.orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }
}
