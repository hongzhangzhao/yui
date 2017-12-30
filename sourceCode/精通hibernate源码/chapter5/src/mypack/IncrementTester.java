package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class IncrementTester implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String name;

    /** full constructor */
    public IncrementTester(String name) {
        this.name = name;
    }

    /** default constructor */
    public IncrementTester() {
    }

    public Long getId() {
        return this.id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
