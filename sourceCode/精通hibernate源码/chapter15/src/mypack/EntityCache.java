package mypack;
import java.util.*;
public class EntityCache {
  private Map entitiesByKey;
  public EntityCache() {
    entitiesByKey=new HashMap();
  }

  public void put(BusinessObject entity){
    Key key=new Key(entity.getClass(),entity.getId());
    entitiesByKey.put(key,entity);
  }

  public Object get(Class classType,Long id){
    Key key=new Key(classType,id);
    return entitiesByKey.get(key);
  }

  public Collection getAllEntities(){
      return entitiesByKey.values();
  }
  public boolean contains(Class classType,Long id){
    Key key=new Key(classType,id);
    return entitiesByKey.containsKey(key);
  }
}

