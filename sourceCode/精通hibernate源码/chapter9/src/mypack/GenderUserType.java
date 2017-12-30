package mypack;

import net.sf.hibernate.*;
import java.sql.*;


public class GenderUserType implements UserType {

    /**
     * Indicates whether objects managed by this type are mutable.
     *
     * @return <code>false</code>, since enumeration instances are immutable
     *         singletons.
     */
    public boolean isMutable() {
        return false;
    }

    /**
     * Return a deep copy of the persistent state, stopping at
     * entities and collections.
     *
     * @param value the object whose state is to be copied.
     * @return the same object, since enumeration instances are singletons.
     * @throws ClassCastException for non {@link Gender} values.
     */
    public Object deepCopy(Object value) {
        return (Gender)value;
    }

    /**
     * Compare two instances of the class mapped by this type for persistence
     * "equality".
     *
     * @param x first object to be compared.
     * @param y second object to be compared.
     * @return <code>true</code> iff both represent the same Gender type.
     * @throws ClassCastException if x or y isn't a {@link Gender}.
     */
    public boolean equals(Object x, Object y) {
        // We can compare instances, since Gender are immutable singletons
        return (x == y);
    }

    /**
     * Determine the class that is returned by {@link #nullSafeGet}.
     *
     * @return {@link Gender}, the actual type returned
     * by {@link #nullSafeGet}.
     */
    public Class returnedClass() {
        return Gender.class;
    }

    /**
     * Determine the SQL type(s) of the column(s) used by this type mapping.
     *
     * @return a single VARCHAR column.
     */
    public int[] sqlTypes() {
        // Allocate a new array each time to protect against callers changing
        // its contents.
        int[] typeList = {  Types.CHAR };
        return typeList;
    }

    /**
     * Retrieve an instance of the mapped class from a JDBC {@link ResultSet}.
     *
     * @param rs the results from which the instance should be retrieved.
     * @param names the columns from which the instance should be retrieved.
     * @param owner the entity containing the value being retrieved.
     * @return the retrieved {@link Gender} value, or <code>null</code>.
     * @throws HibernateException if there is a problem performing the mapping.
     * @throws SQLException if there is a problem accessing the database.
     */
    public Object nullSafeGet(ResultSet rs, String[] names, Object owner)
        throws HibernateException, SQLException
    {
        // Start by looking up the value name
        Character sex = (Character) Hibernate.CHARACTER.nullSafeGet(rs, names[0]);
        if (sex == null) {
            return null;
        }
        // Then find the corresponding enumeration value
        try {
            return Gender.getInstanceBySex(sex);
        }
        catch (java.util.NoSuchElementException e) {
            throw new HibernateException("Bad Gender value: " + sex, e);
        }
    }

    /**
     * Write an instance of the mapped class to a {@link PreparedStatement},
     * handling null values.
     *
     * @param st a JDBC prepared statement.
     * @param value the Gender value to write.
     * @param index the parameter index within the prepared statement at which
     *        this value is to be written.
     * @throws HibernateException if there is a problem performing the mapping.
     * @throws SQLException if there is a problem accessing the database.
     */
    public void nullSafeSet(PreparedStatement st, Object value, int index)
        throws HibernateException, SQLException
    {
        Character sex=null;
        if (value != null)
            sex = ((Gender)value).getSex();
        Hibernate.CHARACTER.nullSafeSet(st, sex, index);
    }
}
