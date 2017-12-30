package mypack;

import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.util.*;

public class BusinessService{
  public static SessionFactory sessionFactory;
  static{
     try{
      // Create a configuration based on the properties file we've put
       Configuration config = new Configuration();
       config.addClass(Customer.class)
             .addClass(Address.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  
  public void saveCustomer(Customer customer) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(customer);
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      throw e;
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

 


 public Customer loadCustomer(Long id) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,id);
      tx.commit();
      
      return customer;

    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      throw e;
    } finally {
      // No matter what, close the session
      session.close();
    }
  }
   
  public void printCustomer(Customer customer) throws Exception{
    Address address=customer.getAddress();
    System.out.println("Address of "+customer.getName()+" is: " 
      +address.getProvince()+" "
      +address.getCity()+" "
      +address.getStreet());

    if(address.getCustomer()==null)
      System.out.println("Can not naviagte from address to Customer.");
   
  }

 public void test() throws Exception{
     
      Customer customer=new Customer();
      Address address=new Address("province1","city1","street1","100001",customer);
      customer.setName("Tom");
      customer.setAddress(address);
     
      saveCustomer(customer);
      customer=loadCustomer(customer.getId());
      printCustomer(customer);
      
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
