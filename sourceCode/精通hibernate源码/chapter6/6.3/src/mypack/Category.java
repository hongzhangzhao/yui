package mypack;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Category implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String name;

    /** nullable persistent field */
    private mypack.Category parentCategory;

    /** persistent field */
    private Set childCategories;

    /** full constructor */
    public Category(String name, mypack.Category parentCategory, Set childCategories) {
        this.name = name;
        this.parentCategory = parentCategory;
        this.childCategories = childCategories;
    }

    /** default constructor */
    public Category() {
    }

    /** minimal constructor */
    public Category(Set childCategories) {
        this.childCategories = childCategories;
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

    public mypack.Category getParentCategory() {
        return this.parentCategory;
    }

    public void setParentCategory(mypack.Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set getChildCategories() {
        return this.childCategories;
    }

    public void setChildCategories(Set childCategories) {
        this.childCategories = childCategories;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
