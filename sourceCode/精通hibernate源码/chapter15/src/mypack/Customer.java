package mypack;
import java.util.*;
public class Customer extends BusinessObject implements Comparable{
    private String name;
    private int age;

    /** 完整的构造方法*/
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** 默认构造方法*/
    public Customer() {}

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

    public int compareTo(Object o){
      Customer other=(Customer)o;
      if(this.name.compareTo(other.getName())>0)return 1;
      if(this.name.compareTo(other.getName())<0)return -1;

      if(this.age>other.getAge())return 1;
      if(this.age<other.getAge())return -1;
      return 0;
    }

    public boolean equals(Object o){
      if(this==o)return true;
      if(! (o instanceof Customer)) return false;
      final Customer other=(Customer)o;

      if(this.name.equals(other.getName()) && this.age==other.getAge())
        return true;
      else
        return false;
    }

   public int hashCode() {
	int result;
	result = name.hashCode();
	result = 29 * result + age;
	return result;
   }
}
