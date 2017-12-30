package mypack;

import java.lang.reflect.Constructor;
import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.io.*;
import java.sql.Time;
import java.util.*;

public class BusinessService{
  public static SessionFactory sessionFactory;
  static{
     try{
      // Create a configuration based on the properties file we've put
      // in the standard place.
      Configuration config = new Configuration();
      config.addClass(NativeTester.class)
      .addClass(IncrementTester.class)
      .addClass(HiloTester.class)
      .addClass(IdentityTester.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  public void findAllObjects(String className) throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      List objects=session.find("from " +className);
      for (Iterator it = objects.iterator(); it.hasNext();) {
         Long id=new Long(0);
         if(className.equals("mypack.NativeTester"))id=((NativeTester) it.next()).getId();
         if(className.equals("mypack.IncrementTester"))id=((IncrementTester) it.next()).getId();
         if(className.equals("mypack.IdentityTester"))id=((IdentityTester) it.next()).getId();
         if(className.equals("mypack.HiloTester"))id=((HiloTester) it.next()).getId();
         System.out.println("ID of "+ className+":"+id);
      }

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
  public void saveObject(Object object) throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      // Create some data and persist it
      tx = session.beginTransaction();
      session.save(object);
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


  public void deleteAllObjects(String className) throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.delete("from " +className);
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

   public void test(String className) throws Exception{
    deleteAllObjects(className);
    Object o1=Class.forName(className).newInstance();
    saveObject(o1);
    Object o2=Class.forName(className).newInstance();
    saveObject(o2);
    Object o3=Class.forName(className).newInstance();
    saveObject(o3);
    findAllObjects(className);

  }

  public static void main(String args[]) throws Exception {
    String className;
    if(args.length==0)
      className="mypack.NativeTester";
    else
      className=args[0];
    new BusinessService().test(className);

    sessionFactory.close();
  }
}
