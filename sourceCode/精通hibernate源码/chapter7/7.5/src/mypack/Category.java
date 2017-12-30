package mypack;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Category implements Serializable {


    private Long id;


    private String name;


    private mypack.Category parentCategory;


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

    public void addChildCategory(Category category) {
		if (category == null)
			throw new IllegalArgumentException("Can't add a null Category as child.");
		// Remove from old parent category
		if (category.getParentCategory() != null)
			category.getParentCategory().getChildCategories().remove(category);
		// Set parent in child
		category.setParentCategory(this);
		// Set child in parent
		this.getChildCategories().add(category);
   }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
