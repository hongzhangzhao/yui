package mypack;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Category implements Serializable {


    private Long id;
    private String name;
    private List items=new ArrayList();
 
    public Category(String name, List items) {
        this.name = name;
        this.items = items;
       
    }

    /** default constructor */
    public Category() {
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

    public List getItems() {
        return this.items;
    }

    public void setItems(List items) {
        this.items = items;
    }

 }
