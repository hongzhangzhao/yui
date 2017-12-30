package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Customer implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String name;

    /** persistent field */
    private mypack.Address homeAddress;

    /** persistent field */
    private mypack.Address comAddress;

    /** full constructor */
    public Customer(String name, mypack.Address homeAddress, mypack.Address comAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.comAddress = comAddress;
    }

    /** default constructor */
    public Customer() {
    }

    /** minimal constructor */
    public Customer(mypack.Address homeAddress, mypack.Address comAddress) {
        this.homeAddress = homeAddress;
        this.comAddress = comAddress;
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

    public mypack.Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(mypack.Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public mypack.Address getComAddress() {
        return this.comAddress;
    }

    public void setComAddress(mypack.Address comAddress) {
        this.comAddress = comAddress;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
