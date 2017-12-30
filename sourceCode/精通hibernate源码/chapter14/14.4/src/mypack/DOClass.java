package mypack;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class DOClass implements Serializable {

    private Long id;
 
    public DOClass() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
