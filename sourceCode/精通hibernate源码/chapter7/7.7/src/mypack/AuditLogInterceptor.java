package mypack;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;

import net.sf.hibernate.Interceptor;
import net.sf.hibernate.type.Type;
import net.sf.hibernate.Session;
import java.util.Set;
import java.util.HashSet;

public class AuditLogInterceptor implements Interceptor, Serializable {

    private Session session;
    private Set inserts=new HashSet();
    private Set updates=new HashSet();

    public void setSession(Session session){
      this.session=session;
    }
    public void onDelete(Object entity,
                         Serializable id,
                         Object[] state,
                         String[] propertyNames,
                         Type[] types) {
        // do nothing
    }

    public boolean onFlushDirty(Object entity,
                                Serializable id,
                                Object[] currentState,
                                Object[] previousState,
                                String[] propertyNames,
                                Type[] types){

        if ( entity instanceof Auditable ) {
           updates.add(entity);
        }
        return false;
    }

    public boolean onLoad(Object entity,
                          Serializable id,
                          Object[] state,
                          String[] propertyNames,
                          Type[] types) {
        return false;
    }

    public boolean onSave(Object entity,
                          Serializable id,
                          Object[] state,
                          String[] propertyNames,
                          Type[] types) {

        if ( entity instanceof Auditable ) {
            inserts.add(entity);
        }
        return false;
    }

    public void postFlush(Iterator entities) {
      try{
          Iterator it=updates.iterator();
          while(it.hasNext()){
            Auditable entity=(Auditable)it.next();
            AuditLog.logEvent("update",entity,session);
          }
          it=inserts.iterator();
          while(it.hasNext()){
            Auditable entity=(Auditable)it.next();
            AuditLog.logEvent("insert",entity,session);
          }
      }catch(Exception e){e.printStackTrace();}
      finally{
        inserts.clear();
        updates.clear();
      }
    }

    public void preFlush(Iterator entities) {
      //do nothing
    }
    public Object instantiate(Class clazz,Serializable id){
      return null;
    }

    public int[] findDirty(Object entity,
                       Serializable id,
                       Object[] currentState,
                       Object[] previousState,
                       String[] propertyNames,
                       Type[] types){
       return null;
    }

    public Boolean isUnsaved(Object entity){
      return null;
    }
}
