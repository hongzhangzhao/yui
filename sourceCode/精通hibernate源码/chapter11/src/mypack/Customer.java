package mypack;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Customer implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String name;

    /** persistent field */
    private Set orders;
    private int age;
    /** full constructor */
    public Customer(String name, Set orders) {
        this.name = name;
        this.orders = orders;
    }

    /** default constructor */
    public Customer() {
    }

    /** minimal constructor */
    public Customer(Set orders) {
        this.orders = orders;
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

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
