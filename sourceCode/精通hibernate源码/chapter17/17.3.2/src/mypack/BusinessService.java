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
       config.addClass(Category.class)
             .addClass(Item.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  
  public void saveCategory(Category category) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(category);
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

 public Category loadCategory(Long id) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Category category=(Category)session.load(Category.class,id);

      List items=category.getItems();
      Iterator it=items.iterator();
      while(it.hasNext()){   
        Item item=(Item)it.next();
        Hibernate.initialize(item.getCategories());
      }    
      
      tx.commit();
      
      return category;

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
   
  public void printCategory(Category category) throws Exception{
    System.out.println("The category("+category.getName()+") is associated with "+category.getItems().size()+" items");
    List items=category.getItems();
    Iterator it=items.iterator();
    while(it.hasNext()){
      Item item=(Item)it.next();
       System.out.println(category.getName()+" "+item.getName()+"       "+item.getBasePrice());
     System.out.println("The item("+item.getName()+") is associated with "+item.getCategories().size()+" categories");
        
    }
     
  }

 public void test() throws Exception{
     
      Item item1=new Item("NEC500",1000);
      Item item2=new Item("BELL4560",1800);

      Category category1=new Category();
      category1.setName("CellPhone");
      category1.getItems().add(item1);
      category1.getItems().add(item1);
      category1.getItems().add(item2);
      item1.getCategories().add(category1);
      item1.getCategories().add(category1);
      item2.getCategories().add(category1);

      Category category2=new Category();
      category2.setName("NECSeries");
      category2.getItems().add(item1);
      item1.getCategories().add(category2);

      saveCategory(category1);
      saveCategory(category2);

      category1=loadCategory(category1.getId());
      printCategory(category1);
      
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
