package mypack;

import java.util.Date;
import java.sql.Connection;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
public class AuditLog{

     public static void logEvent(String message,Auditable entity,Session session) {
      Session tempSession=null;
      try{
      	SessionFactory sessionFactory=session.getSessionFactory();
      	Connection connection=session.connection();
      	tempSession=sessionFactory.openSession(connection);

        AuditLogRecord record=new 	AuditLogRecord(message,entity.getId(),entity.getClass());
	tempSession.save(record);
	tempSession.flush();

      }catch(Exception e){e.printStackTrace();}
      finally{
        try{tempSession.close();}catch(Exception e){e.printStackTrace();}
      }
    }
}
