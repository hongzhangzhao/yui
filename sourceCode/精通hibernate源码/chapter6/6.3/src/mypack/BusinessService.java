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

      //����ʳƷ����ˮ�����֮��Ĺ�����ϵ
      foodCategory.getChildCategories().add(fruitCategory);
      fruitCategory.setParentCategory(foodCategory);

      //����ʳƷ�����߲����֮��Ĺ�����ϵ
      foodCategory.getChildCategories().add(vegetableCategory);
      vegetableCategory.setParentCategory(foodCategory);

      //����ˮ������ƻ�����֮��Ĺ�����ϵ
      fruitCategory.getChildCategories().add(appleCategory);
      appleCategory.setParentCategory(fruitCategory);

      //����ˮ�����ͽ������֮��Ĺ�����ϵ
      fruitCategory.getChildCategories().add(orangeCategory);
      orangeCategory.setParentCategory(fruitCategory);

      //��������������ˮ�����֮��Ĺ�����ϵ
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

      //��������������߲���֮��Ĺ�����ϵ
      tomatoCategory.setParentCategory(vegetableCategory);
      vegetableCategory.getChildCategories().add(tomatoCategory);
      //ɾ�����������ˮ����֮��Ĺ�����ϵ
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

