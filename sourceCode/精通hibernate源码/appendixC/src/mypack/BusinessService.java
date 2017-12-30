package mypack;

import java.lang.reflect.Constructor;
import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.io.*;
import java.sql.Time;
import java.util.*;

public class BusinessService{
  public static SessionFactory sessionFactory;
  static{
     try{
      // Create a configuration based on the properties file we've put
      // in the standard place.
      Configuration config = new Configuration();
      config.addClass(Customer.class)
            .addClass(Order.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  public void saveCustomer(Customer customer) throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(customer);
      // We're done; make our changes permanent
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
      throw e;
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

  public Customer loadCustomer(Long id) throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,id);
      Hibernate.initialize(customer.getOrders());
      // We're done; make our changes permanent
      tx.commit();
      return customer;

    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
      throw e;
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

  public void printCustomer(Customer customer){
    Address address=customer.getAddress();
    Order order=(Order)customer.getOrders().iterator().next();
    System.out.println("Name:"+customer.getName());
    System.out.println("Address:"+address.getStreet()+" "        +address.getCity()+" "+address.getProvince()+" "+address.getZipcode());
   System.out.println("OrderNumber:"+order.getOrderNumber());
  }
  public void test() throws Exception{

    Customer customer=new Customer();
    customer.setName("Tom");
    Address address=new Address("Stree1","City1","Province1","100001");
    customer.setAddress(address);
    Order order=new Order("Tom_Order001",customer); 
    customer.getOrders().add(order);
    saveCustomer(customer);
    customer=loadCustomer(customer.getId());
    printCustomer(customer);
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }

}
