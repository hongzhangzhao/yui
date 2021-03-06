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
       config.addClass(Company.class)
             .addClass(HourlyEmployee.class)
             .addClass(SalariedEmployee.class);
      // Get the session factory we can use for persistence
      sessionFactory = config.buildSessionFactory();
    }catch(Exception e){e.printStackTrace();}

  }

  public void saveEmployee(Employee employee) throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      List results=new ArrayList();
      try {
       tx = session.beginTransaction();
       session.save(employee);
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


  public List findAllEmployees() throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;

      try {
       List results=new ArrayList();
       tx = session.beginTransaction();
       List hourlyEmployees=session.find("from HourlyEmployee");
       results.addAll(hourlyEmployees);

       List salariedEmployees=session.find("from SalariedEmployee");
       results.addAll(salariedEmployees);

      tx.commit();
      return results;
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

  public Company loadCompany(long id) throws Exception{
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try {
       tx = session.beginTransaction();
       Company company=(Company)session.load(Company.class,new Long(id));

       List hourlyEmployees=session.find("from HourlyEmployee h where h.company.id="+id);
       company.getEmployees().addAll(hourlyEmployees);

       List salariedEmployees=session.find("from SalariedEmployee s where s.company.id="+id);
       company.getEmployees().addAll(salariedEmployees);

      tx.commit();
      return company;
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
      List employees=findAllEmployees();
      printAllEmployees(employees.iterator());

      Company company=loadCompany(1);
      printAllEmployees(company.getEmployees().iterator());

      Employee employee=new HourlyEmployee("Mary",300,company);
      saveEmployee(employee);

  }

  private void printAllEmployees(Iterator it){
     while(it.hasNext()){
        Employee e=(Employee)it.next();
        if(e instanceof HourlyEmployee){
          System.out.println(((HourlyEmployee)e).getRate());
        }else
          System.out.println(((SalariedEmployee)e).getSalary());
      }
  }
  public static void main(String args[]) throws Exception {
    new BusinessService().test();
    sessionFactory.close();
  }
}
