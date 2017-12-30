package mypack;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Customer implements Serializable {
    private Long id;
    private String name;
    private int age;
    private List images=new ArrayList();

    /** full constructor */
    public Customer(String name, int age,List images) {
        this.name = name;
        this.age=age;
        this.images = images;
    }

    /** default constructor */
    public Customer() {
    }

    /** minimal constructor */
    public Customer(List images) {
        this.images = images;
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

    public List getImages() {
        return this.images;
    }

    public void setImages(List images) {
        this.images = images;
    }

}
