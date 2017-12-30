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
    Address homeAddress=customer.getHomeAddress();
    Address comAddress=customer.getComAddress();
    System.out.println("Home Address of "+customer.getName()+" is: " 
      +homeAddress.getProvince()+" "
      +homeAddress.getCity()+" "
      +homeAddress.getStreet());

    System.out.println("Company Address of "+customer.getName()+" is: "
      +comAddress.getProvince()+" "
      +comAddress.getCity()+" "
      +comAddress.getStreet());

    if(homeAddress.getCustomer()==null)
      System.out.println("Can not naviagte from homeAddress to Customer.");

    if(comAddress.getCustomer()==null)
      System.out.println("Can not naviagte from comAddress to Customer.");
    
  }

 public void test() throws Exception{
     
      Customer customer=new Customer();
      Address homeAddress=new Address("province1","city1","street1","100001",customer);
      Address comAddress=new Address("province2","city2","street2","200002",customer);
      customer.setName("Tom");
      customer.setHomeAddress(homeAddress);
      customer.setComAddress(comAddress);

      saveCustomer(customer);
      customer=loadCustomer(customer.getId());
      printCustomer(customer);

      
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
