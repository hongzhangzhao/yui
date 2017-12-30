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
       config.addClass(ClassA.class)
             .addClass(ClassB.class);
       // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}

  }

  public void saveDO(DOClass object) throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      List results=new ArrayList();
      try {
       tx = session.beginTransaction();
       session.save(object);
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
      ClassG g=new ClassG("a1","d1","g1");
      saveDO(g);
      
      ClassF f=new ClassF("b1","f1","f2","f3","f4","f5","f6","f7");
      saveDO(f);
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
