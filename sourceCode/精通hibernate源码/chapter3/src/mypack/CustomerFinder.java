package mypack;

import java.io.Serializable;
import java.util.List;
import java.sql.SQLException;

import net.sf.hibernate.*;
import net.sf.hibernate.type.Type;

/** Automatically generated Finder class for CustomerFinder.
 * @author Hibernate FinderGenerator  **/
public class CustomerFinder implements Serializable {

    public static List findByName(Session session, java.lang.String name) throws SQLException, HibernateException {
        List finds = session.find("from mypack.Customer as customer where customer.name=?", name, Hibernate.STRING);
        return finds;
    }

    public static List findAll(Session session) throws SQLException, HibernateException {
        List finds = session.find("from Customer in class mypack.Customer");
        return finds;
    }

}
