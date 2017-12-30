package mypack;

import java.util.Date;
public class AuditLogRecord{

   public String message;
   public Long entityId;
   public Class entityClass;
   public Date created;

   public AuditLogRecord(String message,Long entityId,Class entityClass) {
        this.message = message;
        this.entityId=entityId;
        this.entityClass=entityClass;
        this.created=new Date(); 
    }

    public AuditLogRecord() {
    }



}
