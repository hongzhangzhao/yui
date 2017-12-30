package mypack;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.StringTokenizer;

import net.sf.hibernate.CompositeUserType;
import net.sf.hibernate.Hibernate;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.engine.SessionImplementor;
import net.sf.hibernate.type.Type;

/**
 * Manages persistence for the {@link Name} composite type.
 */
public class NameCompositeUserType implements CompositeUserType {


    /**
     * Get the names of the properties that make up this composite type,
     * and that may be used in a query involving it.
     */
    public String[] getPropertyNames() {
        // Allocate a new response each time, because arrays are mutable
        return new String[] { "firstname", "lastname" };
    }

    /**
     * Get the types associated with the properties that make up this
     * composite type.
     *
     * @return the types of the parameters reported by
     *         {@link #getPropertynames}, in the same order.
     */
    public Type[] getPropertyTypes() {
        return new Type[] { Hibernate.STRING, Hibernate.STRING };
    }

    /**
     * Look up the value of one of the properties making up this composite
     * type.
     *
     * @param component a {@link Name} instance being managed.
     * @param property the index of the desired property.
     * @return the corresponding value.
     * @see #getPropertyNames
     */
    public Object getPropertyValue(Object component, int property) {
        Name name = (Name)component;
        String result;

        switch (property) {

        case 0:
            result = name.getFirstname();
            break;

        case 1:
            result = name.getLastname();
            break;

        default:
            throw new IllegalArgumentException("unknown property: " +
                                               property);
        }

        return result;
    }

    /**
     * Set the value of one of the properties making up this composite
     * type.
     *
     * @param component a {@link Name} instance being managed.
     * @param property the index of the desired property.
     * @object value the new value to be established.
     * @see #getPropertyNames
     */
    public void setPropertyValue(Object component, int property, Object value)
    {
        Name name = (Name)component;
        String nameValue = (String)value;
        switch (property) {

        case 0:
            name.setFirstname(nameValue);
            break;

        case 1:
            name.setLastname(nameValue);
            break;

        default:
            throw new IllegalArgumentException("unknown property: " +
                                               property);
        }
    }

    /**
     * Determine the class that is returned by {@link #nullSafeGet}.
     *
     * @return {@link Name}, the actual type returned
     * by {@link #nullSafeGet}.
     */
    public Class returnedClass() {
		return Name.class;
    }

    /**
     * Compare two instances of the class mapped by this type for persistence
     * "equality".
     *
     * @param x first object to be compared.
     * @param y second object to be compared.
     * @return <code>true</code> iff both represent the same volume levels.
     * @throws ClassCastException if x or y isn't a {@link Name}.
     */
    public boolean equals(Object x, Object y) {
        if (x == y) {  // This is a trivial success
            return true;
        }
        if (x == null || y == null) {  // Don't blow up if either is null!
            return false;
        }
        // Now it's safe to delegate to the class' own sense of equality
        return x.equals(y);
    }

    /**
     * Return a deep copy of the persistent state, stopping at
     * entities and collections.
     *
     * @param value the object whose state is to be copied.
      * @throws ClassCastException for non {@link Name} values.
     */
    public Object deepCopy(Object value) {
        if (value == null) return null;
        Name name = (Name)value;
        //return name;
        return new Name(name.getFirstname(), name.getLastname());
    }

    /**
     * Indicates whether objects managed by this type are mutable.
     *
     * @return <code>true</code>, since {@link Name} is mutable.
     */
    public boolean isMutable() {
        return true;
    }

    /**
     * Retrieve an instance of the mapped class from a JDBC {@link ResultSet}.
     *
     * @param rs the results from which the instance should be retrieved.
     * @param names the columns from which the instance should be retrieved.
     * @param session, an extension of the normal Hibernate session interface
     *        that gives you much more access to the internals.
     * @param owner the entity containing the value being retrieved.
     * @return the retrieved {@link Name} value, or <code>null</code>.
     * @throws HibernateException if there is a problem performing the mapping.
     * @throws SQLException if there is a problem accessing the database.
     */
	public Object nullSafeGet(ResultSet resultSet,
							  String[] names,SessionImplementor session,
							  Object owner)
			throws HibernateException, SQLException {

		if (resultSet.wasNull()) return null;
		String firstname= resultSet.getString(names[0]);
                String lastname= resultSet.getString(names[1]);
                return new Name(firstname,lastname);
	}

    /**
     * Write an instance of the mapped class to a {@link PreparedStatement},
     * handling null values.
     *
     * @param st a JDBC prepared statement.
     * @param value the Name value to write.
     * @param index the parameter index within the prepared statement at which
     *        this value is to be written.
     * @param session, an extension of the normal Hibernate session interface
     *        that gives you much more access to the internals.
     * @throws HibernateException if there is a problem performing the mapping.
     * @throws SQLException if there is a problem accessing the database.
     */


	public void nullSafeSet(PreparedStatement statement,Object value,int index,SessionImplementor session)
			throws HibernateException, SQLException {

		if (value == null) {
			statement.setNull(index, Types.VARCHAR);
		} else {
		       Name name=(Name)value;
			statement.setString(index, name.getFirstname());
                        statement.setString(index+1, name.getLastname());
 		}
	}

    /**
     * Reconstitute a working instance of the managed class from the cache.
     *
     * @param cached the serializable version that was in the cache.
     * @param session, an extension of the normal Hibernate session interface
     *        that gives you much more access to the internals.
     * @param owner the entity containing the value being retrieved.
     * @return a copy of the value as a {@link Name} instance.
     */
    public Object assemble(Serializable cached, SessionImplementor session,
                           Object owner)
    {
        // Our value type happens to be serializable, so we have an easy out.
        return deepCopy(cached);
    }

    /**
     * Translate an instance of the managed class into a serializable form to
     * be stored in the cache.
     *
     * @param session, an extension of the normal Hibernate session interface
     *        that gives you much more access to the internals.
     * @param value the Name value to be cached.
     * @return a serializable copy of the value.
     */
    public Serializable disassemble(Object value,
                                    SessionImplementor session) {
        return (Serializable) deepCopy(value);
    }
}
