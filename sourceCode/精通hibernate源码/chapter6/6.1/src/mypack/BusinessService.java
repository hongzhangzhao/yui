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

  public List findOrdersByCustomer(Customer customer) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      List orders=(List)session.find("from Order as o where o.customer.id="+customer.getId());
      tx.commit();
      return orders;
    }catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      throw e;
    } finally {
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
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      Customer customer=new Customer("Jack");
      Order order1=new Order("Jack_Order001",customer);
      Order order2=new Order("Jack_Order002",customer);

      session.save(order1);
      session.save(order2);

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

  public void saveCustomerAndOrder() throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      Customer customer=new Customer("Tom");
      session.save(customer);

      Order order1=new Order("Tom_Order001",customer);
      Order order2=new Order("Tom_Order002",customer);
      session.save(order1);
      session.save(order2);
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

  public void printOrders(List orders){
      for (Iterator it = orders.iterator(); it.hasNext();) {
         Order order=(Order)it.next();
         System.out.println("OrderNumber of "+order.getCustomer().getName()+ " :"+order.getOrderNumber());
      }
  }

   public void test() throws Exception{
      saveCustomerAndOrder();
      saveCustomerAndOrderWithCascade();
      Customer customer=findCustomer(1);
      List orders=findOrdersByCustomer(customer);
      printOrders(orders);
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
