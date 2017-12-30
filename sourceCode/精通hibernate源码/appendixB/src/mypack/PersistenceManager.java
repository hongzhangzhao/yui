package mypack;

import java.lang.reflect.*;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class PersistenceManager{
  private String dbUrl ="jdbc:mysql://localhost:3306/SAMPLEDB";
  private String dbUser="root";
  private String dbPwd="1234";

  public PersistenceManager() throws Exception{
     //����MySQL���ݿ���������
     Class.forName("com.mysql.jdbc.Driver");
     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  }

  public Connection getConnection()throws Exception{
      //���һ�����ݿ�����
      return java.sql.DriverManager.getConnection(dbUrl,dbUser,dbPwd);
  }

  public void save(Object object) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //������ݿ�����

      //��ʼһ�����ݿ�����
      con.setAutoCommit(false);

      ObjectMapper om=new ObjectMapper(object);
      stmt=om.getInsertStatement(con);
      stmt.execute();

      //�ύ���ݿ�����
      con.commit();

    }catch(Exception e){
      e.printStackTrace();
      try{//��������쳣��������������
        con.rollback();
      }catch(SQLException sqlex){
        sqlex.printStackTrace(System.out);
      }
      throw e;
    }finally{
      try{
         stmt.close();
         con.close();
       }catch(Exception e){
         e.printStackTrace();
       }
    }
  }


  public Object load(Class classType,long id) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    try {
      con=getConnection(); //������ݿ�����

      ObjectMapper om=new ObjectMapper(classType);
      om.setId(new Long(id));
      stmt=om.getSelectStatement(con);
      rs=stmt.executeQuery();

      Object object=om.parseResultSet(rs);
      return object;

    }finally{
      try{
         rs.close();
         stmt.close();
         con.close();
       }catch(Exception e){
         e.printStackTrace();
       }
    }
  }



  public void test()throws Exception{
    Customer customer=new Customer("Tom",21);
    save(customer);

    customer=(Customer)load(Customer.class,1);
    System.out.println(customer.getId()+" "+customer.getName()+" "+customer.getAge());
  }

  public static void main(String args[])throws Exception{
    new PersistenceManager().test();
  }
}

