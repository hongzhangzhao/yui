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
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}

  }

  public void saveCustomer(Customer customer) throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      List results=new ArrayList();
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

  public Customer loadCustomer(long id) throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
       tx = session.beginTransaction();
       Customer customer=(Customer)session.load(Customer.class,new Long(id));
       Hibernate.initialize(customer.getImages());
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

   public void test() throws Exception{
      Set images=new HashSet();
      images.add(new Image("image1","image1.jpg",50,50));
      images.add(new Image("image4","image4.jpg",50,50));
      images.add(new Image("image2","image2.jpg",50,50));
      images.add(new Image("image5","image5.jpg",50,50));
      
      Customer customer=new Customer("Tom",21,images);
      saveCustomer(customer);
      
      customer=loadCustomer(1);
      printCustomer(customer);  

  }

  private void printCustomer(Customer customer){
     System.out.println(customer.getImages().getClass().getName());
     Set images=customer.getImages();
     Iterator it=images.iterator();
     while(it.hasNext()){
       Image image=(Image)it.next();
       System.out.println(image.getCustomer().getName()+" "+image.getName()
       +" "+image.getFilename()+" "+image.getSizeX()+" "+image.getSizeY());
     }

  }
  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
