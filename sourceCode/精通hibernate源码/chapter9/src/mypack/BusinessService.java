package mypack;

import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.util.*;
import java.sql.Blob;
import java.io.*;

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
      Address homeAddress=new Address("homeProvince","homeCity","homeStreet","100001");
      Address comAddress=new Address("comProvince","comCity","comStreet","200002");
      Gender gender=Gender.getInstanceBySex(new Character('M'));
      customer.setName(new Name("Laosan","Zhang"));
      customer.setHomeAddress(homeAddress);
      customer.setComAddress(comAddress);
      customer.setGender(gender);
      customer.setPhone(new Integer(55556666));
       
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

      Address homeAddress=new Address("homeProvince","homeCity","homeStreet","100001");
      session.save(homeAddress);

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

 public Customer findCustomerByFirstname(String firstname) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      List results=session.find("from Customer as c where c.name.firstname='"+firstname+"'");
      tx.commit();

      return results.iterator().hasNext()?(Customer)results.iterator().next():null;

    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
      return null;
    } finally {
      // No matter what, close the session
      session.close();
    }
  }


  public Customer findCustomerByProvince(String province) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      List results=session.find("from Customer as c where c.homeAddress.province='"+province+"'");
      tx.commit();

       return results.iterator().hasNext()?(Customer)results.iterator().next():null;


    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
      return null;
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

public void printCustomer(Customer customer) throws Exception{
    if(customer==null)return;
    Address homeAddress=customer.getHomeAddress();
    Address comAddress=customer.getComAddress();
    Gender gender=customer.getGender();
    Integer phone=customer.getPhone();

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

     if(gender==null)
      System.out.println("Gender of "+customer.getName()+" is unknown.");
    else
      System.out.println("Gender of "+customer.getName()+" is: "+gender.getDescription());

       if(phone==null)
      System.out.println("Phone of "+customer.getName()+" is unknown.");
    else
      System.out.println("Phone of "+customer.getName()+" is: "+phone);

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

  public void updateCustomer() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      Customer customer=(Customer)session.load(Customer.class,new Long(1));
      Address homeAddress=new Address("homeProvince","homeCity","homeStreet","100001");
      Address comAddress=new Address("comProvinceNew","comCityNew","comStreetNew","200002");
      customer.setHomeAddress(homeAddress);
      customer.setComAddress(comAddress);

      customer.getName().setFirstname("Laosi");
      customer.getName().setLastname("Li");

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
      Customer customer1=findCustomerByFirstname("Laosan");
      printCustomer(customer1);
      updateCustomer();
      Customer customer2=findCustomerByFirstname("Laosi");
      printCustomer(customer2);
      Customer customer3=findCustomerByProvince("homeProvince");
      deleteCustomer(customer1);

  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
