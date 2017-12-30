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
       config.addClass(Customer.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  
  public void saveCustomer() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      
      Customer customer=new Customer();
      Address homeAddress=new Address("province1","city1","street1","100001",customer);
      Address comAddress=new Address("province2","city2","street2","200002",customer);
      customer.setName("Tom");
      customer.setHomeAddress(homeAddress);
      customer.setComAddress(comAddress);

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

 
  public void saveAddressSeparately() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      Address address=new Address("province1","city1","street1","100001",null);
      session.save(address);
      
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

 public void saveCustomerWithNoAddress() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      Customer customer=new Customer("Mike",new Address(null,null,null,null,null),null);
      
      session.save(customer);
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

 public Customer findCustomer(long customer_id) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,new Long(customer_id));
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
     
public void printCustomerAddress(Customer customer) throws Exception{
    Address homeAddress=customer.getHomeAddress();
    Address comAddress=customer.getComAddress();
    if(homeAddress==null)
      System.out.println("Home Address of "+customer.getName()+" is null.");
    else
      System.out.println("Home Address of "+customer.getName()+" is: " 
      +homeAddress.getProvince()+" "
      +homeAddress.getCity()+" "
      +homeAddress.getStreet());

  if(comAddress==null)
      System.out.println("Company Address of "+customer.getName()+" is null.");
    else
      System.out.println("Company Address of "+customer.getName()+" is: "
      +comAddress.getProvince()+" "
      +comAddress.getCity()+" "
      +comAddress.getStreet());
  }
  public void deleteCustomer(Customer customer) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      session.delete(customer);
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
   

 public void test() throws Exception{
      saveCustomer();
      saveAddressSeparately();     
      saveCustomerWithNoAddress();
      Customer customer=findCustomer(1);
      printCustomerAddress(customer);
      customer=findCustomer(2);
      printCustomerAddress(customer);
      deleteCustomer(customer);
      
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
