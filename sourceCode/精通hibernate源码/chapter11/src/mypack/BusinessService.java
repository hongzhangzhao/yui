package mypack;

import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.util.*;
import net.sf.hibernate.expression.*;
import java.math.BigDecimal;

public class BusinessService{
  public static SessionFactory sessionFactory;
  static{
     try{
      // Create a configuration based on the properties file we've put
       Configuration config = new Configuration();
       config.addClass(Customer.class)
             .addClass(mypack.Order.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory(); 
    }catch(Exception e){e.printStackTrace();}
  }

  public void findAny() throws Exception{

    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      
      
      Query query=session.createQuery("from mypack.Order o inner join o.customer c "
                                     +"where c.name like 'T%' ");
      List result=query.list();
      for (Iterator pairs = result.iterator(); pairs.hasNext();) {
        Object[] pair=(Object[])pairs.next();
        mypack.Order order=(mypack.Order)pair[0];  
        Customer customer=(Customer)pair[1];
        System.out.println(order.getOrderNumber());
        System.out.println(customer.getName());
      }


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

  public void test() throws Exception{
      findAny();
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}

