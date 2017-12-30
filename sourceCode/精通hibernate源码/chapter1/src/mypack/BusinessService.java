package mypack;

import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class BusinessService{
  private String dbUrl ="jdbc:mysql://localhost:3306/SAMPLEDB";
  private String dbUser="root";
  private String dbPwd="1234";

  public BusinessService() throws Exception{
     //����MySQL���ݿ���������
     Class.forName("com.mysql.jdbc.Driver");
     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  }

  public Connection getConnection()throws Exception{
      //���һ�����ݿ�����
      return java.sql.DriverManager.getConnection(dbUrl,dbUser,dbPwd);
  }

  /**
   * �־û�����ָ����Customer���󣬲��Ҽ����־û�����������Order����
   * ���Customer�����name����Ϊnull������Order�����orderNumber����Ϊnull��
   * ���׳�BusinessException
   */
  public void saveCustomer(Customer customer) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //������ݿ�����

      //��ʼһ�����ݿ�����
      con.setAutoCommit(false);

      //������ҵ���߼����룬���ͻ������Ƿ�Ϊ��
      if(customer.getName()==null)
        throw new BusinessException("�ͻ�����������Ϊ��");

      //���������ݷ��ʴ��룬�־û�Customer����

      //Ϊ�µ�CUSTOMERS��¼����Ωһ��ID
      long customerId=getNextId(con,"CUSTOMERS");
      //��Customer����ӳ��Ϊ�����ϵ��SQL���
      stmt=con.prepareStatement("insert into CUSTOMERS(ID,NAME,AGE) values(?,?,?)");
      stmt.setLong(1,customerId);
      stmt.setString(2,customer.getName());
      stmt.setInt(3,customer.getAge());
      stmt.execute();

      Iterator iterator =customer.getOrders().iterator();
      while (iterator.hasNext() ) {
        //������ҵ���߼����룬��鶩������Ƿ�Ϊ��
        Order order=(Order)iterator.next();
        if(order.getOrderNumber()==null)
          throw new BusinessException("������Ų�����Ϊ��");

        //���������ݷ��ʴ��룬�����־û�Order����

        //Ϊ�µ�ORDERS��¼����Ωһ��ID
        long orderId=getNextId(con,"ORDERS");
        //��Order����ӳ��Ϊ�����ϵ��SQL���
        stmt=con.prepareStatement("insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID)values(?,?,?,?)");
        stmt.setLong(1,orderId);
        stmt.setString(2,order.getOrderNumber());
        stmt.setDouble(3,order.getPrice());
        stmt.setLong(4,customerId);
        stmt.execute();
      }

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

  /**
   * ���²���ָ����Customer����
   */
  public void updateCustomer(Customer customer) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //������ݿ�����

      //��ʼһ�����ݿ�����
      con.setAutoCommit(false);

      //���������ݷ��ʴ��룬����Customer����

      //��Customer����ӳ��Ϊ�����ϵ��SQL���
      stmt=con.prepareStatement("update CUSTOMERS set NAME=?,AGE=? where ID=?");
      stmt.setString(1,customer.getName());
      stmt.setInt(2,customer.getAge());
      stmt.setLong(3,customer.getId().longValue());
      stmt.execute();

      //�ύ���ݿ�����
      con.commit();

    }catch(Exception e){
      try{//��������쳣��������������
        con.rollback();
      }catch(SQLException sqlex){
        sqlex.printStackTrace(System.out);
      }
      throw e;
    }finally{
      stmt.close();
      con.close();
    }
  }
  /**
   * ɾ������ָ����Customer���󣬲��Ҽ���ɾ������������Order����
   */
  public void deleteCustomer(Customer customer) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //������ݿ�����

      //��ʼһ�����ݿ�����
      con.setAutoCommit(false);

      //��ɾ����Customer���������Order����
      stmt=con.prepareStatement("delete from ORDERS where "
                            +"CUSTOMER_ID=?" );
      stmt.setLong(1,customer.getId().longValue());
      stmt.executeUpdate();

      //ɾ��Customer����
      stmt=con.prepareStatement("delete from CUSTOMERS where "
                         +"ID=?" );
      stmt.setLong(1,customer.getId().longValue());
      stmt.executeUpdate();

      //�ύ���ݿ�����
      con.commit();

    }catch(Exception e){
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

  /*
   * ����OID����һ��Customer����
   */
  public Customer loadCustomer (long customerId) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    try {
      con=getConnection(); //������ݿ�����

      //���������ݷ��ʴ��룬����Customer����
      stmt=con.prepareStatement("select ID,NAME,AGE from CUSTOMERS where ID=?");
      stmt.setLong(1,customerId);
      rs=stmt.executeQuery();

      if(rs.next()) {
        Customer customer=new Customer();
        customer.setId(new Long(rs.getLong(1)));
        customer.setName(rs.getString(2));
        customer.setAge(rs.getInt(3));
        return customer;
      }else{
        throw new BusinessException("OIDΪ"+customerId+"��Customer���󲻴���");
      }

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

  /*
   * ����������ѯ����������Customer����ͬʱ��������������Order����
   */
  public List findCustomerByName(String name) throws Exception{
    HashMap map=new HashMap();
    List result=new ArrayList();

    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    try{
      con=getConnection(); //������ݿ�����

      String sqlString=" select c.ID CUSTOMER_ID,c.NAME,c.AGE,o.ID ORDER_ID, "
      +"o.ORDER_NUMBER,o.PRICE "
      +"from CUSTOMERS c left outer join ORDERS o "
      +"on c.ID =o.CUSTOMER_ID where c.NAME=?";
      stmt = con.prepareStatement(sqlString);
      stmt.setString(1,name); //�󶨲���
      rs=stmt.executeQuery();
      while (rs.next())
      {
        //����JDBC ResultSet�����
        Long customerId =new Long( rs.getLong(1));
        String customerName= rs.getString(2);
        int customerAge= rs.getInt(3);
        Long orderId =new Long( rs.getLong(4));
        String orderNumber= rs.getString(5);
        double price=rs.getDouble(6);

        //ӳ��Customer����
        Customer customer=null;
        if(map.containsKey(customerId))
          //�����map���Ѿ�����OIDƥ���Customer���󣬾ͻ�ô˶�������ã�����
          //�ͱ��ⴴ���ظ���Customer����
          customer=(Customer)map.get(customerId);
        else{
          //�����map�в�����OIDƥ���Customer���󣬾ʹ���һ��Customer����
          //Ȼ��������浽map�С�
          customer=new Customer();
          customer.setId(customerId);
          customer.setName(customerName);
          customer.setAge(customerAge);
          map.put(customerId,customer);
        }

        //ӳ��Order����
        Order order=new Order();
        order.setId(orderId);
        order.setOrderNumber(orderNumber);
        order.setPrice(price);

        //����Customer������Order����Ĺ�����ϵ
        customer.getOrders().add(order);
        order.setCustomer(customer);
      }
      //��map�����е�Customer������뵽result������
      Iterator iter =map.values().iterator();
      while ( iter.hasNext() ) {
          result.add(iter.next());
      }
      return result;
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

  /**
   * ����һ���µ�����ֵ��ȡֵΪ��ĵ�ǰ�������ֵ+1�������������¼���ͷ���1
   */
  private long getNextId(Connection con,String tableName) throws Exception {
    long nextId=0;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = con.prepareStatement("select max(ID) from "+tableName);
      rs = stmt.executeQuery();
      if ( rs.next() ) {
        nextId = rs.getLong(1) + 1;
        if ( rs.wasNull() ) nextId = 1;
      }
      else {
        nextId = 1;
      }
      return nextId;
    }finally {
      try{
         rs.close();
         stmt.close();
      }catch(Exception e){
         e.printStackTrace();
      }
    }
  }

  public void test()throws Exception{
    Customer customer=new Customer("Tom",21,new HashSet());
    Order order1=new Order("Tom_Order001",100,customer);
    Order order2=new Order("Tom_Order002",200,customer);
    customer.getOrders().add(order1);
    customer.getOrders().add(order2);

    saveCustomer(customer);

    customer=loadCustomer(1);
    customer.setAge(22);
    updateCustomer(customer);

    List result=findCustomerByName("Tom");
    Iterator iterator=result.iterator();
    while(iterator.hasNext()){
      customer=(Customer)iterator.next();
      System.out.println("Customer:"+customer.getId()+" "+customer.getName()+" "+customer.getAge());
      Iterator orderIterator=customer.getOrders().iterator();
      while(orderIterator.hasNext()){
        Order order=(Order)orderIterator.next();
        System.out.println("Order:"+order.getId()+" "+order.getOrderNumber()+" "+order.getPrice());
      }
    }
    deleteCustomer(customer);
  }

  public static void main(String args[])throws Exception{
    new BusinessService().test();
  }
}
