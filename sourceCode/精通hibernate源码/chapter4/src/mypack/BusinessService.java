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
       config.setNamingStrategy( new MyNamingStrategy() )
             .addClass(Customer.class)
             .addClass(Order.class)
             .addClass(Dictionary.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}

  }

  public Customer loadCustomer(long customer_id) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,new Long(customer_id));
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

  public void saveCustomer(Customer customer) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(customer);
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

    public void loadAndUpdateCustomer(long customerId) throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
        tx = session.beginTransaction();
        Customer customer=(Customer)session.load(Customer.class,new Long(customerId));
        customer.setDescription("A lovely customer!");
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

  public void updateCustomer(Customer customer) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.update(customer);
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

  public void saveDictionary(Dictionary dictionary) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(dictionary);
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

 public void updateDictionary(Dictionary dictionary) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.update(dictionary);
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
  public Dictionary loadDictionary(long dictionary_id) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Dictionary dictionary=(Dictionary)session.load(Dictionary.class,new Long(dictionary_id));
      tx.commit();
      return dictionary;
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
      System.out.println("name:"+customer.getName());
      System.out.println("sex:"+customer.getSex());
      System.out.println("description:"+customer.getDescription());
      System.out.println("avgPrice:"+customer.getAvgPrice());
      System.out.println("totalPrice:"+customer.getTotalPrice());
  }

  public void printDictionary(Dictionary dictionary){
      System.out.println("type:"+dictionary.getType());
      System.out.println("key:"+dictionary.getKey());
      System.out.println("value:"+dictionary.getValue());
  }
   public void test() throws Exception{
      Customer customer=new Customer("Laosan","Zhang",'M',new HashSet(),"A good citizen!");
      Order order1=new Order("Order001",100,customer);
      Order order2=new Order("Order002",200,customer);
      customer.getOrders().add(order1);
      customer.getOrders().add(order2);

      saveCustomer(customer);

      customer=new Customer("Laowu","Wang",'M',new HashSet(),null);
      saveCustomer(customer);

      customer=loadCustomer(1);
      printCustomer(customer);

      customer.setDescription("An honest customer!");
      updateCustomer(customer);

      loadAndUpdateCustomer(1);

      Dictionary dictionary=new Dictionary("SEX","M","MALE");
      saveDictionary(dictionary);

      dictionary=loadDictionary(1);
      dictionary.setValue("MAN");
      updateDictionary(dictionary);

      dictionary=loadDictionary(1);
      printDictionary(dictionary);

   }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
