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
       config.addClass(Order.class)
             .addClass(Item.class)
             .addClass(LineItem.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }


  public void saveOrder(Order order) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(order);
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

  public void saveItem(Item item) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(item);
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
 public Order loadOrder(Long id) throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Order order=(Order)session.load(Order.class,id);
      Hibernate.initialize(order.getLineItems());
      tx.commit();

      return order;

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

  public void printOrder(Order order) throws Exception{
    System.out.println("订单编号:"+order.getOrderNumber());
    System.out.println("总价格:"+order.getPrice());

    Set lineItems=order.getLineItems();
    Iterator it=lineItems.iterator();
    while(it.hasNext()){
      LineItem lineItem=(LineItem)it.next();
      System.out.println("-----------------------");
      System.out.println("商品名:"+lineItem.getItem().getName());
      System.out.println("购买数量:"+lineItem.getQuantity());
      System.out.println("商品单价:"+lineItem.getBasePrice());
      System.out.println("单元价格:"+lineItem.getUnitPrice());
    }

  }

 public void test() throws Exception{

      Item item1=new Item("NEC500",1000,null);
      Item item2=new Item("BELL4560",1800,null);
      saveItem(item1);
      saveItem(item2);

      Order order=new Order();
      order.setOrderNumber("Order001");
      LineItem lineItem1=new LineItem(item1,order,item1.getBasePrice(),2);
      LineItem lineItem2=new LineItem(item2,order,item2.getBasePrice(),1);
      
      order.getLineItems().add(lineItem1);
      order.getLineItems().add(lineItem2);
      saveOrder(order);

      order=loadOrder(order.getId());
      printOrder(order);

  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
