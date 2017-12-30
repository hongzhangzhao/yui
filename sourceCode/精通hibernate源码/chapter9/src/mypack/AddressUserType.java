package mypack;

import net.sf.hibernate.*;
import java.sql.*;

public class AddressUserType implements UserType {

  private static final int[] SQL_TYPES = {Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};

  public int[] sqlTypes() { return SQL_TYPES; }

  public Class returnedClass() { return Address.class; }

  public boolean isMutable() { return false; }

  public Object deepCopy(Object value) {
    return value; // Address is immutable
  }

  public boolean equals(Object x, Object y) {
    if (x == y) return true;
    if (x == null || y == null) return false;
    return x.equals(y);
  }

  public Object nullSafeGet(ResultSet resultSet,
  String[] names,
  Object owner)
  throws HibernateException, SQLException {

    if (resultSet.wasNull()) return null;
    String province = resultSet.getString(names[0]);
    String city = resultSet.getString(names[1]);
    String street = resultSet.getString(names[2]);
    String zipcode = resultSet.getString(names[3]);
    return new Address(province,city,street,zipcode);
  }

  public void nullSafeSet(PreparedStatement statement,Object value,int index)
  throws HibernateException, SQLException {

    if (value == null) {
      statement.setNull(index, Types.VARCHAR);
      statement.setNull(index+1, Types.VARCHAR);
      statement.setNull(index+2, Types.VARCHAR);
      statement.setNull(index+3, Types.VARCHAR);
    } else {
      Address address=(Address)value;
      statement.setString(index, address.getProvince());
      statement.setString(index+1, address.getCity());
      statement.setString(index+2, address.getStreet());
      statement.setString(index+3, address.getZipcode());
    }
  }
}
