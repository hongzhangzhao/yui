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
             .addClass(Order.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  public Customer findCustomer(long customer_id) throws Exception{
    // Ask for a session using the JDBC information we've configured
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

  public void saveCustomerAndOrderWithCascade() throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      // Create some data and persist it
      tx = session.beginTransaction();

      Customer customer=new Customer("Tom",new HashSet());
      Order order=new Order();
      order.setOrderNumber("Tom_Order001");

      order.setCustomer(customer);
      customer.getOrders().add(order);

      session.save(customer);
      tx.commit();
                  ;
    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

    public void associateCustomerAndOrder() throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      // Create some data and persist it
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,new Long(2));
      Order order=(Order)session.load(Order.class,new Long(2));
      order.setCustomer(customer);
      customer.getOrders().add(order);
      tx.commit();
                  ;
    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
       e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

  public void saveCustomerAndOrderSeparately() throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      // Create some data and persist it
      tx = session.beginTransaction();

      Customer customer=new Customer();
      customer.setName("Jack");

      Order order=new Order();
      order.setOrderNumber("Jack_Order001");

      session.save(customer);
      session.save(order);


      // We're done; make our changes permanent
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
       e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

  public void deleteCustomer() throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,new Long(1));
      session.delete(customer);
      // We're done; make our changes permanent
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
       e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }

  public void removeOrderFromCustomer() throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Customer customer=(Customer)session.load(Customer.class,new Long(2));
      Order order=(Order)customer.getOrders().iterator().next();

      //unassociate order and customer
      customer.getOrders().remove(order);
      order.setCustomer(null);
      // We're done; make our changes permanent
      tx.commit();

    }catch (Exception e) {
      if (tx != null) {
        // Something went wrong; discard all partial changes
        tx.rollback();
      }
       e.printStackTrace();
    } finally {
      // No matter what, close the session
      session.close();
    }
  }
  public void printOrders(Set orders){
      for (Iterator it = orders.iterator(); it.hasNext();) {
         Order order=(Order)it.next();
         System.out.println("OrderNumber of "+order.getCustomer().getName()+ " :"+order.getOrderNumber());
      }
  }

   public void saveCustomerAndOrderWithInverse()throws Exception{
      saveCustomerAndOrderSeparately();
      associateCustomerAndOrder();
   }
   public void test() throws Exception{

      saveCustomerAndOrderWithCascade();
      saveCustomerAndOrderWithInverse();
      Customer customer=findCustomer(1);
      printOrders(customer.getOrders());
      deleteCustomer();
      removeOrderFromCustomer();
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}

