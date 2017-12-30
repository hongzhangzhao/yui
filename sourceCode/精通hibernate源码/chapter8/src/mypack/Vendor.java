package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Vendor implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String type;

    /** full constructor */
    public Vendor(String type) {
        this.type = type;
    }

    /** default constructor */
    public Vendor() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
