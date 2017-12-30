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
     //加载MySQL数据库驱动程序
     Class.forName("com.mysql.jdbc.Driver");
     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  }

  public Connection getConnection()throws Exception{
      //获得一个数据库连接
      return java.sql.DriverManager.getConnection(dbUrl,dbUser,dbPwd);
  }

  /**
   * 持久化参数指定的Customer对象，并且级联持久化与它关联的Order对象。
   * 如果Customer对象的name属性为null，或者Order对象的orderNumber属性为null，
   * 会抛出BusinessException
   */
  public void saveCustomer(Customer customer) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //获得数据库连接

      //开始一个数据库事务
      con.setAutoCommit(false);

      //以下是业务逻辑代码，检查客户姓名是否为空
      if(customer.getName()==null)
        throw new BusinessException("客户姓名不允许为空");

      //以下是数据访问代码，持久化Customer对象

      //为新的CUSTOMERS记录分配惟一的ID
      long customerId=getNextId(con,"CUSTOMERS");
      //把Customer对象映射为面向关系的SQL语句
      stmt=con.prepareStatement("insert into CUSTOMERS(ID,NAME,AGE) values(?,?,?)");
      stmt.setLong(1,customerId);
      stmt.setString(2,customer.getName());
      stmt.setInt(3,customer.getAge());
      stmt.execute();

      Iterator iterator =customer.getOrders().iterator();
      while (iterator.hasNext() ) {
        //以下是业务逻辑代码，检查订单编号是否为空
        Order order=(Order)iterator.next();
        if(order.getOrderNumber()==null)
          throw new BusinessException("订单编号不允许为空");

        //以下是数据访问代码，级联持久化Order对象

        //为新的ORDERS记录分配惟一的ID
        long orderId=getNextId(con,"ORDERS");
        //把Order对象映射为面向关系的SQL语句
        stmt=con.prepareStatement("insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID)values(?,?,?,?)");
        stmt.setLong(1,orderId);
        stmt.setString(2,order.getOrderNumber());
        stmt.setDouble(3,order.getPrice());
        stmt.setLong(4,customerId);
        stmt.execute();
      }

      //提交数据库事务
      con.commit();

    }catch(Exception e){
      e.printStackTrace();
      try{//如果出现异常，撤销整个事务
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
   * 更新参数指定的Customer对象
   */
  public void updateCustomer(Customer customer) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //获得数据库连接

      //开始一个数据库事务
      con.setAutoCommit(false);

      //以下是数据访问代码，更新Customer对象

      //把Customer对象映射为面向关系的SQL语句
      stmt=con.prepareStatement("update CUSTOMERS set NAME=?,AGE=? where ID=?");
      stmt.setString(1,customer.getName());
      stmt.setInt(2,customer.getAge());
      stmt.setLong(3,customer.getId().longValue());
      stmt.execute();

      //提交数据库事务
      con.commit();

    }catch(Exception e){
      try{//如果出现异常，撤销整个事务
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
   * 删除参数指定的Customer对象，并且级联删除与它关联的Order对象。
   */
  public void deleteCustomer(Customer customer) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    try {
      con=getConnection(); //获得数据库连接

      //开始一个数据库事务
      con.setAutoCommit(false);

      //先删除和Customer对象关联的Order对象
      stmt=con.prepareStatement("delete from ORDERS where "
                            +"CUSTOMER_ID=?" );
      stmt.setLong(1,customer.getId().longValue());
      stmt.executeUpdate();

      //删除Customer对象
      stmt=con.prepareStatement("delete from CUSTOMERS where "
                         +"ID=?" );
      stmt.setLong(1,customer.getId().longValue());
      stmt.executeUpdate();

      //提交数据库事务
      con.commit();

    }catch(Exception e){
      try{//如果出现异常，撤销整个事务
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
   * 根据OID加载一个Customer对象
   */
  public Customer loadCustomer (long customerId) throws Exception {
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    try {
      con=getConnection(); //获得数据库连接

      //以下是数据访问代码，加载Customer对象
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
        throw new BusinessException("OID为"+customerId+"的Customer对象不存在");
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
   * 按照姓名查询满足条件的Customer对象，同时加载与它关联的Order对象
   */
  public List findCustomerByName(String name) throws Exception{
    HashMap map=new HashMap();
    List result=new ArrayList();

    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    try{
      con=getConnection(); //获得数据库连接

      String sqlString=" select c.ID CUSTOMER_ID,c.NAME,c.AGE,o.ID ORDER_ID, "
      +"o.ORDER_NUMBER,o.PRICE "
      +"from CUSTOMERS c left outer join ORDERS o "
      +"on c.ID =o.CUSTOMER_ID where c.NAME=?";
      stmt = con.prepareStatement(sqlString);
      stmt.setString(1,name); //绑定参数
      rs=stmt.executeQuery();
      while (rs.next())
      {
        //编历JDBC ResultSet结果集
        Long customerId =new Long( rs.getLong(1));
        String customerName= rs.getString(2);
        int customerAge= rs.getInt(3);
        Long orderId =new Long( rs.getLong(4));
        String orderNumber= rs.getString(5);
        double price=rs.getDouble(6);

        //映射Customer对象
        Customer customer=null;
        if(map.containsKey(customerId))
          //如果在map中已经存在OID匹配的Customer对象，就获得此对象的引用，这样
          //就避免创建重复的Customer对象。
          customer=(Customer)map.get(customerId);
        else{
          //如果在map中不存在OID匹配的Customer对象，就创建一个Customer对象，
          //然后把它保存到map中。
          customer=new Customer();
          customer.setId(customerId);
          customer.setName(customerName);
          customer.setAge(customerAge);
          map.put(customerId,customer);
        }

        //映射Order对象
        Order order=new Order();
        order.setId(orderId);
        order.setOrderNumber(orderNumber);
        order.setPrice(price);

        //建立Customer对象与Order对象的关联关系
        customer.getOrders().add(order);
        order.setCustomer(customer);
      }
      //把map中所有的Customer对象加入到result集合中
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
   * 生成一个新的主键值，取值为表的当前最大主键值+1，如果表不包含记录，就返回1
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
