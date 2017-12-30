package mypack;

import java.util.*;
public class CollectionTester {

  public static void main(String[] args) {

   EntityCache cache=new EntityCache();
   Customer c1=new Customer("Tom",21);
   c1.setId(new Long(1));
   Customer c2=new Customer("Tom",25);
   c2.setId(new Long(1));

   Order o1=new Order("Tom_order001",100);
   o1.setId(new Long(1));
   Order o2=new Order("Tom_order001",200);
   o2.setId(new Long(1));

   cache.put(c1);
   cache.put(c1);
   cache.put(c2);
   cache.put(o1);
   cache.put(o1);
   cache.put(o2);

   Collection entities=cache.getAllEntities();
   Iterator it=entities.iterator();
   while(it.hasNext()){
     Object o=it.next();
     if(o instanceof Customer){
       Customer customer=(Customer)o;
       System.out.println(customer.getId()+" "+customer.getName()+" "+customer.getAge());
     }else{
       Order order=(Order)o;
       System.out.println(order.getId()+" "+order.getOrderNumber()+" "+order.getPrice());
     }
   }

  }
}