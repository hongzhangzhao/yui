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
       config.addClass(Category.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  public void saveCategoryWithCascade() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
       tx = session.beginTransaction();

      Category  foodCategory=new Category("food",null,new HashSet());
      Category  fruitCategory=new Category("fruit",null,new HashSet());
      Category  vegetableCategory=new Category("vegetable",null,new HashSet());
      Category  appleCategory=new Category("apple",null,new HashSet());
      Category  orangeCategory=new Category("orange",null,new HashSet());
      Category tomatoCategory=new Category("tomato",null,new HashSet());

      //建立食品类别和水果类别之间的关联关系
      foodCategory.getChildCategories().add(fruitCategory);
      fruitCategory.setParentCategory(foodCategory);

      //建立食品类别和蔬菜类别之间的关联关系
      foodCategory.getChildCategories().add(vegetableCategory);
      vegetableCategory.setParentCategory(foodCategory);

      //建立水果类别和苹果类别之间的关联关系
      fruitCategory.getChildCategories().add(appleCategory);
      appleCategory.setParentCategory(fruitCategory);

      //建立水果类别和桔子类别之间的关联关系
      fruitCategory.getChildCategories().add(orangeCategory);
      orangeCategory.setParentCategory(fruitCategory);

      //建立西红柿类别和水果类别之间的关联关系
      tomatoCategory.setParentCategory(fruitCategory);
      fruitCategory.getChildCategories().add(tomatoCategory);

      session.save(foodCategory);
      tx.commit();
                  ;
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

  public void modifyCategoryAssociation() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Category tomatoCategory=findCategoryByName(session,"tomato");
      Category fruitCategory=findCategoryByName(session,"fruit");
      Category vegetableCategory=findCategoryByName(session,"vegetable");

      //建立西红柿类和蔬菜类之间的关联关系
      tomatoCategory.setParentCategory(vegetableCategory);
      vegetableCategory.getChildCategories().add(tomatoCategory);
      //删除西红柿类和水果类之间的关联关系
      fruitCategory.getChildCategories().remove(tomatoCategory);

      tx.commit();
                  ;
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

   private Category findCategoryByName(Session session,String name)throws Exception{
     List results=session.find("from Category as c where c.name='"+name+"'");
     return (Category)results.iterator().next();
   }
   public void test() throws Exception{
      saveCategoryWithCascade();
      modifyCategoryAssociation();
   }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}

