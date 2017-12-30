package mypack;

import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.util.*;
import java.sql.*;

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

  public void batchUpdateCustomer1() throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
       tx = session.beginTransaction();
       Iterator customers=session.find("from Customer c where c.age>0").iterator();
       while(customers.hasNext()){
  		Customer customer=(Customer)customers.next();
  		customer.setAge(customer.getAge()+1);
  		session.flush();
  		session.evict(customer);
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

public void batchUpdateCustomer2() throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
tx = session.beginTransaction();

Connection con=session.connection();
PreparedStatement stmt=con.prepareStatement("update CUSTOMERS set AGE=AGE+1 "
+"where AGE>0 ");
stmt.executeUpdate();
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


    public void useQueryCache() throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
	Query customerByAgeQuery=session.createQuery("from Customer c where c.age>:age");
	customerByAgeQuery.setInteger("age",0);
	customerByAgeQuery.setCacheable(true);
	customerByAgeQuery.setCacheRegion("customerQueries");

	for(int i=0;i<10;i++){
	   customerByAgeQuery.list();
	}

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
      batchUpdateCustomer1();
      batchUpdateCustomer2();
      useQueryCache(); 
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    Thread.sleep(60000);
    sessionFactory.close();
  }
}
