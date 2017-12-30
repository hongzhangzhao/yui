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
      config.addClass(Customer.class);
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
    System.out.println(customer);
  }
  public void test() throws Exception{

    Customer customer=new Customer();
    customer.setName("Tom");
    customer.setAge(new Integer(21));
    customer.setSex(new Character('M'));
    customer.setMarried(new Boolean(false));
    customer.setDescription("I am very honest.");
    saveCustomer(customer);
    customer=loadCustomer(customer.getId());
    printCustomer(customer);
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }

}
