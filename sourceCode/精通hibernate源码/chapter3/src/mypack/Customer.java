package mypack;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** 
 *       Represents a single customer.
 *       @author LindaSun
 *     
*/
public class Customer implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String name;

    /** nullable persistent field */
    private Date registeredTime;

    /** nullable persistent field */
    private Integer age;

    /** nullable persistent field */
    private Character sex;

    /** nullable persistent field */
    private Boolean married;

    /** nullable persistent field */
    private String description;

    /** full constructor */
    public Customer(String name, Date registeredTime, Integer age, Character sex, Boolean married, String description) {
        this.name = name;
        this.registeredTime = registeredTime;
        this.age = age;
        this.sex = sex;
        this.married = married;
        this.description = description;
    }

    /** default constructor */
    public Customer() {
    }

    public Long getId() {
        return this.id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** 
     * When the customer was registered
     */
    public Date getRegisteredTime() {
        return this.registeredTime;
    }

    public void setRegisteredTime(Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    /** 
     * How old is the customer
     */
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return this.sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    /** 
     * Is the customer married
     */
    public Boolean getMarried() {
        return this.married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("name", getName())
            .append("registeredTime", getRegisteredTime())
            .append("age", getAge())
            .append("married", getMarried())
            .append("description", getDescription())
            .toString();
    }

}
