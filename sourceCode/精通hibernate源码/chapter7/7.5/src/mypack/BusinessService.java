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

  public void saveFoodCategory() throws Exception{
      Category  foodCategory=new Category("food",null,new HashSet());
      Category  fruitCategory=new Category("fruit",null,new HashSet());
      Category  appleCategory=new Category("apple",null,new HashSet());

      //建立食品类别和水果类别之间的关联关系
      foodCategory.addChildCategory(fruitCategory);

       //建立水果类别和苹果类别之间的关联关系
      fruitCategory.addChildCategory(appleCategory);

       saveOrUpdate(foodCategory);
  }

  public void navigateCategories() throws Exception{
      Category fruitCategory=findCategoryByName("fruit");
      HashSet categories=new HashSet();
      navigateCategories(fruitCategory,categories);
      for (Iterator it = categories.iterator(); it.hasNext();) {
         System.out.println(((Category)it.next()).getName());
      }
  }
  private void navigateCategories(Category category,Set categories){
   if(categories.contains(category)|| category==null)return;
   categories.add(category);

   //遍历父类Category
   navigateCategories(category.getParentCategory(),categories);

   //遍历所有子类Category
   Set childCategories=category.getChildCategories();
   if(childCategories==null)return;

   for (Iterator it = childCategories.iterator(); it.hasNext();) {
         navigateCategories((Category)it.next(),categories);
    }
  }
  public void saveVegetableCategory() throws Exception{
      Category foodCategory=findCategoryByName("food");
      Category vegetableCategory=new Category("vegetable",null,new HashSet());
      foodCategory.addChildCategory(vegetableCategory);
      saveOrUpdate(vegetableCategory);

  }

  public void updateVegetableCategory() throws Exception{
      Category vegetableCategory=findCategoryByName("vegetable");
      vegetableCategory.setName("green vegetable");
      Category tomatoCategory=new Category("tomato",null,new HashSet());
      vegetableCategory.addChildCategory(tomatoCategory);
      saveOrUpdate(vegetableCategory);

  }
  public void saveOrangeCategory() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Category fruitCategory=findCategoryByName(session,"fruit");
      Category orangeCategory=new Category("orange",null,new HashSet());
      fruitCategory.addChildCategory(orangeCategory);

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
  public void saveOrUpdate(Object object) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.saveOrUpdate(object);
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

   private Category findCategoryByName(String name)throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    Category category=null;
    try {
      tx = session.beginTransaction();
      List results=session.find("from Category as c where c.name='"+name+"'");
      category=(Category)results.iterator().next();

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
    return category;
  }

   private Category findCategoryByName(Session session, String name)throws Exception{
      List results=session.find("from Category as c where c.name='"+name+"'");
      return (Category)results.iterator().next();
  }

   public void test() throws Exception{
      saveFoodCategory();
      saveOrangeCategory();
      saveVegetableCategory();
      updateVegetableCategory();
      navigateCategories();
   }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}

