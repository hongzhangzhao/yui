package mypack;

import javax.servlet.*;
import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;
import java.io.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.*;

public class BusinessService{
  public static SessionFactory sessionFactory;
  static{
    try{
      // Create a configuration based on the properties file we've put
      // in the standard place.
      Configuration config = new Configuration();
      config.addClass(Customer.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}
  }

  public void findAllCustomers(ServletContext context,OutputStream out) throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      List customers=session.find("from Customer as c order by c.name asc");
      for (Iterator it = customers.iterator(); it.hasNext();) {
         printCustomer(context,out,(Customer) it.next());
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
  public void saveCustomer(Customer customer) throws Exception{
  	  // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.save(customer);
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

  public void loadAndUpdateCustomer(Long customer_id,String address) throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      Customer c=(Customer)session.load(Customer.class,customer_id);
      c.setAddress(address);
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
  public void deleteAllCustomers() throws Exception{
    // Ask for a session using the JDBC information we've configured
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      session.delete("from Customer as c");
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

  private void printCustomer(ServletContext context,OutputStream out,Customer customer)throws Exception{
  	if(out instanceof ServletOutputStream)
           printCustomer(context,(ServletOutputStream) out,customer);
       else
          printCustomer((PrintStream) out,customer);
  }
  private void printCustomer(PrintStream out,Customer customer)throws Exception{
   //save photo
    byte[] buffer=customer.getImage();
    FileOutputStream fout=new FileOutputStream("photo_copy.gif");
    fout.write(buffer);
    fout.close();

    out.println("------������"+customer.getName()+"�ĸ�����Ϣ------");
    out.println("ID: "+customer.getId());
    out.println("����: "+customer.getPassword());
    out.println("E-Mail: "+customer.getEmail());
    out.println("�绰: "+customer.getPhone());
    out.println("��ַ: "+customer.getAddress());
    String sex=customer.getSex()=='M'? "��":"Ů";
    out.println("�Ա�: "+sex);
    String marriedStatus=customer.isMarried()? "�ѻ�":"δ��";
    out.println("����״��: "+marriedStatus);
    out.println("����: "+customer.getBirthday());
    out.println("ע��ʱ��: "+customer.getRegisteredTime());
    out.println("���ҽ���: "+customer.getDescription());

  }
  private void printCustomer(ServletContext context,ServletOutputStream out,Customer customer)throws Exception{
    //save photo
    byte[] buffer=customer.getImage();
    String path=context.getRealPath("/");
    FileOutputStream fout=new FileOutputStream(path+"photo_copy.gif");
    fout.write(buffer);
    fout.close();

    out.println("------������"+customer.getName()+"�ĸ�����Ϣ------"+"<br>");
    out.println("ID: "+customer.getId()+"<br>");
    out.println("����: "+customer.getPassword()+"<br>");
    out.println("E-Mail: "+customer.getEmail()+"<br>");
    out.println("�绰: "+customer.getPhone()+"<br>");
    out.println("��ַ: "+customer.getAddress()+"<br>");
    String sex=customer.getSex()=='M'? "��":"Ů";
    out.println("�Ա�: "+sex+"<br>");
    String marriedStatus=customer.isMarried()? "�ѻ�":"δ��";
    out.println("����״��: "+marriedStatus+"<br>");
    out.println("����: "+customer.getBirthday()+"<br>");
    out.println("ע��ʱ��: "+customer.getRegisteredTime()+"<br>");
    out.println("���ҽ���: "+customer.getDescription()+"<br>");
    out.println("<img src='photo_copy.gif' border=0><p>");
  }
   public void test(ServletContext context,OutputStream out) throws Exception{

    Customer customer=new Customer();
    customer.setName("Tom");
    customer.setEmail("tom@yahoo.com");
    customer.setPassword("1234");
    customer.setPhone(55556666);
    customer.setAddress("Shanghai");
    customer.setSex('M');
    customer.setDescription("I am very honest.");

    InputStream in=this.getClass().getResourceAsStream("photo.gif");
    byte[] buffer = new byte[in.available()];
    in.read(buffer);
    customer.setImage(buffer);
    customer.setBirthday(Date.valueOf("1980-05-06"));

    saveCustomer(customer);

    findAllCustomers(context,out);
    loadAndUpdateCustomer(customer.getId(),"Beijing");
    findAllCustomers(context,out);

    deleteAllCustomers();
  }

  public static void main(String args[]) throws Exception {
    new BusinessService().test(null,System.out);
    sessionFactory.close();
  }

}
