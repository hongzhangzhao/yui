package mypack;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

public class Customer implements Serializable {
    private Long id;
    private String name;
    private int age;
    private Map images=new HashMap();

    /** full constructor */
    public Customer(String name, int age,Map images) {
        this.name = name;
        this.age=age;
        this.images = images;
    }

    /** default constructor */
    public Customer() {
    }

    /** minimal constructor */
    public Customer(Map images) {
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

    public Map getImages() {
        return this.images;
    }

    public void setImages(Map images) {
        this.images = images;
    }

}
