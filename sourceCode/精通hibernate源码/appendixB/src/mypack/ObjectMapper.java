package mypack;

import java.sql.*;
import java.lang.reflect.*;

public class ObjectMapper {

  private Object object;
  /** 实例的类型 */
  private Class classType;
  /** 类的名字 */
  private String className;
  /** 对应的表的名字 */
  private String tableName;
  /** 表中所有的字段的名字 */
  private String tableFieldNames[];
  /** 类的所有属性*/
  private Field fields[];
  /** 类的所有get方法 */
  private Method getMethods[];
    /** 类的所有set方法 */
  private Method setMethods[];

  /** 类的getId方法 */
  private Method getIdMethod;

  /** 类的setId方法 */
  private Method setIdMethod;

  /** 对象的id */
  private Long id;

  public ObjectMapper(Class classType)throws Exception{
    this(classType.getConstructor(new Class[]{}).newInstance(new Object[]{}));
  }
  public ObjectMapper(Object object)throws Exception{
    this.object=object;
    this.classType=object.getClass();
    //获得类名，不带包的名字
    int dotLocation=classType.getName().lastIndexOf(".");
    this.className=classType.getName().substring(dotLocation+1);

    //获得对应的表名
    this.tableName=className.toUpperCase()+"S";

    // 获得类的所有属性
    this.fields=classType.getDeclaredFields();

    //获得表的所有字段名，类的所有get方法和set方法
    this.tableFieldNames=new String[fields.length];
    this.getMethods=new Method[fields.length];
    this.setMethods=new Method[fields.length];
    for(int i=0;i<fields.length;i++){
      tableFieldNames[i]=fields[i].getName().toUpperCase();
      getMethods[i]=getMethod(fields[i],"get");
      setMethods[i]=getMethod(fields[i],"set");

      if(fields[i].getName().equals("id")){
        this.id=(Long)executeGetMethod(getMethods[i]);
        this.getIdMethod=getMethods[i];
        this.setIdMethod=setMethods[i];
      }
    }
  }

  public void setId(Long id){
    this.id=id;
  }
  private Object executeGetMethod(Method method)throws Exception{
    return method.invoke(this.object,new Object[]{});
  }

  private void executeSetMethod(Method method,Object parameter)throws Exception{
    method.invoke(this.object,new Object[]{parameter});
  }
  private Method getMethod(Field field, String prefix)throws Exception{
    String methodName=prefix;
    String fieldName=field.getName();
    String firstLetter=fieldName.substring(0,1).toUpperCase();
    methodName=prefix+firstLetter+fieldName.substring(1);

    if(prefix.equals("set"))
       return this.classType.getMethod(methodName,new Class[]{field.getType()});
    else
       return this.classType.getMethod(methodName,new Class[]{});
  }

  private String getInsertSql()throws Exception{
    String sql="insert into "+ tableName+"(";

    for(int i=0;i<tableFieldNames.length;i++){
      sql=sql+tableFieldNames[i];
      if(i!=tableFieldNames.length-1)
        sql=sql+",";
    }

    sql=sql+")values(";

    for(int i=0;i<tableFieldNames.length;i++){
      sql=sql+"?";
      if(i!=tableFieldNames.length-1)
        sql=sql+",";
    }
    sql=sql+")";

    System.out.println(sql);

    return sql;
  }

   private String getSelectSql()throws Exception{
    String sql="select ";

    for(int i=0;i<tableFieldNames.length;i++){
      sql=sql+tableFieldNames[i];
      if(i!=tableFieldNames.length-1)
        sql=sql+",";
    }

    sql=sql+" from "+tableName+" where ID=?" ;
    System.out.println(sql);
    return sql;
  }

  public PreparedStatement getInsertStatement(Connection con)throws Exception{
    PreparedStatement stmt=con.prepareStatement(getInsertSql());

    for(int i=0;i<fields.length;i++){
      Field field=fields[i];
      Method getMethod=getMethods[i];

      if(field.getName().equals("id")){
        this.id=new Long(getNextId(con));
        executeSetMethod(setIdMethod,id);
        stmt.setLong(i+1,this.id.longValue());
        continue;
      }

      Class fieldType=field.getType();

      if(fieldType.getName().equals("int"))
        stmt.setInt(i+1,((Integer)executeGetMethod(getMethod)).intValue());

      if(fieldType.getName().equals("java.lang.String"))
        stmt.setString(i+1,(String)executeGetMethod(getMethod));

      if(fieldType.getName().equals("long"))
         stmt.setLong(i+1,((Long)executeGetMethod(getMethod)).longValue());

    }
    return stmt;
  }

  public PreparedStatement getSelectStatement(Connection con)throws Exception{
    PreparedStatement stmt=con.prepareStatement(getSelectSql());
    stmt.setLong(1,this.id.longValue());
    return stmt;
  }

  public Object parseResultSet(ResultSet rs)throws Exception{

  if(rs.next()){
   for(int i=0;i<fields.length;i++){
      Field field=fields[i];
      Class fieldType=field.getType();
      Method setMethod=setMethods[i];

      if(fieldType.getName().equals("int"))
        executeSetMethod(setMethod,new Integer(rs.getInt(i+1)));

      if(fieldType.getName().equals("java.lang.String"))
         executeSetMethod(setMethod, rs.getString(i+1));

      if(fieldType.getName().equals("java.lang.Long"))
         executeSetMethod(setMethod,new Long(rs.getLong(i+1)));


    }
   }
     return this.object;
  }
    /**
   * 生成一个新的主键值，取值为表的当前最大主键值+1，如果表不包含记录，就返回1
   */
  private long getNextId(Connection con) throws Exception {
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

  public static void main(String args[])throws Exception{
    ObjectMapper om=new ObjectMapper(new Customer("Tom",11));
    Method m=Customer.class.getMethod("setId",new Class[]{Long.class});
    om.executeSetMethod(m,new Long(1));
  }
}