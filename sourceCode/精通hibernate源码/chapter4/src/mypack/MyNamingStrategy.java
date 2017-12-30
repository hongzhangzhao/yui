package mypack;
import net.sf.hibernate.cfg.NamingStrategy;
import net.sf.hibernate.util.StringHelper;
public class MyNamingStrategy implements NamingStrategy {
   public String classToTableName(String className) {
        return  StringHelper.unqualify(className).toUpperCase()+'S';
   }
   public String propertyToColumnName(String propertyName) {
       return propertyName.toUpperCase();
   }
   public String tableName(String tableName) {
       return tableName;
   }
   public String columnName(String columnName) {
       return columnName;
   }
   public String propertyToTableName(String className, String propertyName) {
       return classToTableName(className) + '_' +
            propertyToColumnName(propertyName);
   }
}
