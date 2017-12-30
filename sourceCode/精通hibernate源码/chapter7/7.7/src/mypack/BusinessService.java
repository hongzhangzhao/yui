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
       config.addClass(Customer.class);
       config.addClass(AuditLogRecord.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}

  }

  public void saveOrUpdateCustomer(Customer customer) throws Exception{
    Transaction tx=null;
    Session session=null;
    try{
       AuditLogInterceptor interceptor= new AuditLogInterceptor();
       session = sessionFactory.openSession(interceptor);
       interceptor.setSession(session);

       tx= session.beginTransaction();
       session.saveOrUpdate(customer);
       customer.setName("Jack");
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

  public void findAllAuditLogRecords() throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
       tx = session.beginTransaction();
       List results=session.find("from AuditLogRecord");
       Iterator it=results.iterator();
       while(it.hasNext()){
         AuditLogRecord record=(AuditLogRecord)it.next();
         System.out.println("**********");
         System.out.println("message:"+record.message);
         System.out.println("entityId:"+record.entityId);
         System.out.println("entityClass:"+record.entityClass);
         System.out.println("created:"+record.created);
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

      Customer customer=new Customer("Tom");
      saveOrUpdateCustomer(customer);

      customer.setName("Mike");
      saveOrUpdateCustomer(customer);

      findAllAuditLogRecords();;

  }

 public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
