package mypack;

import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.util.*;

public class BusinessService extends Thread{
  public static SessionFactory sessionFactory;
  static{
     try{
      // Create a configuration based on the properties file we've put
       Configuration config = new Configuration();
       config.addClass(Account.class);
          
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  private String transactionType;
  private Log log;

  public BusinessService(String transactionType,Log log){
    this.transactionType=transactionType;
    this.log=log;
  }   
  public void run(){
   try{ 
    if(transactionType.equals("withdraw"))
      withdraw();
    else
     transferCheck(); 
   }catch(Exception e){
     e.printStackTrace();
   }
  }  
  
  public void withdraw() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      
      tx = session.beginTransaction();
      log.write("withdraw():��ʼ����");
      Thread.sleep(500);
 
//    Account account=(Account)session.get(Account.class,new Long(1),LockMode.UPGRADE);
      Account account=(Account)session.get(Account.class,new Long(1));

      log.write("withdraw():��ѯ��������Ϊ��balance="+account.getBalance());
      Thread.sleep(500);

      account.setBalance(account.getBalance()-100);
      log.write("withdraw():ȡ��100Ԫ���Ѵ������Ϊ��"+account.getBalance());
      
      log.write("withdraw():�ύ����");
      tx.commit();
      Thread.sleep(500);
 
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

  public void transferCheck() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      
      tx = session.beginTransaction();
      log.write("transferCheck():��ʼ����");
      Thread.sleep(500);

//    Account account=(Account)session.get(Account.class,new Long(1),LockMode.UPGRADE);
      Account account=(Account)session.get(Account.class,new Long(1));

      log.write("transferCheck():��ѯ��������Ϊ��balance="+account.getBalance());
      Thread.sleep(500);
 
      account.setBalance(account.getBalance()+100);
      log.write("transferCheck():����100Ԫ���Ѵ������Ϊ��"+account.getBalance());
      
      log.write("transferCheck():�ύ����");
      tx.commit();
      Thread.sleep(500);

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

    public void registerAccount() throws Exception{
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      
      tx = session.beginTransaction();
      Account account=new Account();
      account.setName("Tom");
      account.setBalance(1000);
      session.save(account);
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

  public static void main(String args[]) throws Exception {
    Log log=new Log();
    Thread withdrawThread=new BusinessService("withdraw",log);
    Thread transferCheckThread=new BusinessService("transferCheck",log);

    ((BusinessService)withdrawThread).registerAccount();

    withdrawThread.start();
    transferCheckThread.start();

    while(withdrawThread.isAlive() ||transferCheckThread.isAlive()){
     Thread.sleep(100);
    } 
    log.print();
    sessionFactory.close();
  }
}


class Log{
  private ArrayList logs=new ArrayList();
  
  synchronized void write(String text){
    logs.add(text);
  }
  public void print(){
     for (Iterator it = logs.iterator(); it.hasNext();) {
         System.out.println(it.next());
      }
  } 
} 

