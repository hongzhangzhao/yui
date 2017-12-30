package mypack;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;
    private char sex;
    private Set orders=new HashSet();
    private double avgPrice;
    private double totalPrice;
    private String description;

    public Customer() {
    }

    public Customer(String firstname,String lastname,char sex,Set orders,String description){
      this.firstname=firstname;
      this.lastname=lastname;
      this.sex=sex;
      this.orders=orders;
      this.description=description;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname(){
      return firstname;
  }

  public void setFirstname(String firstname){
    this.firstname=firstname;
  }

  public String getLastname(){
    return lastname;
  }

  public void setLastname(String lastname){
    this.lastname = lastname;
  }

  public String getName(){
    return firstname+ " "+lastname;
 }

 public void setName(String name){
   StringTokenizer t=new StringTokenizer(name);
   firstname=t.nextToken();
   lastname=t.nextToken();
 }

  public double getAvgPrice(){
      return this.avgPrice;
  }
  private void setAvgPrice( double avgPrice ){
      this.avgPrice = avgPrice;
  }
  public double getTotalPrice(){
      return this.totalPrice;
  }
  private void setTotalPrice( double totalPrice ){
      this.totalPrice = totalPrice;
  }

  public void setOrders( Set orders ){
    this.orders = orders;
    calculatePrice();
  }
  public Set getOrders(){
    return orders;
  }
  private void calculatePrice(){
      double avgPrice = 0.0;
      double totalPrice = 0.0;
      int count=0;

      if ( getOrders() != null ){
        Iterator iter = getOrders().iterator();
        while( iter.hasNext() ){
          double orderPrice = ((Order)iter.next()).getPrice();
          totalPrice += orderPrice;
          count++;
        }
        // Set the price for the order from the calcualted value
        avgPrice=totalPrice/count;
        setAvgPrice( avgPrice );
      }
  }
  public char getSex(){
    return this.sex;
  }
  public void setSex(char sex){
      if(sex!='F' && sex!='M'){
        throw new IllegalArgumentException("Invalid Sex");
      }
      this.sex =sex ;
  }

  public String getDescription(){
    return this.description;
  }
  public void setDescription(String description){
    this.description=description;
  }


}