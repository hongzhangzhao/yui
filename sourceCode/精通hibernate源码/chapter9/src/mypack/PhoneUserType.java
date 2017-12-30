package mypack;

import net.sf.hibernate.*;
import java.sql.*;

public class PhoneUserType implements UserType {

  private static final int[] SQL_TYPES = {Types.VARCHAR};

  public int[] sqlTypes() { return SQL_TYPES; }

  public Class returnedClass() { return Integer.class; }

  public boolean isMutable() { return false; }

  public Object deepCopy(Object value) {
    return value; // Integer is immutable
  }

  public boolean equals(Object x, Object y) {
    if (x == y) return true;
    if (x == null || y == null) return false;
    return x.equals(y);
  }

  public Object nullSafeGet(ResultSet resultSet, String[] names,Object owner)
    throws HibernateException, SQLException {

    if (resultSet.wasNull()) return null;
    String phone = resultSet.getString(names[0]);
    return new Integer(phone);
  }

  public void nullSafeSet(PreparedStatement statement,Object value,int index)
  throws HibernateException, SQLException {
    if (value == null) {
      statement.setNull(index, Types.VARCHAR);
    } else {
      String phone=((Integer)value).toString();
      statement.setString(index, phone);
    }
  }
}
