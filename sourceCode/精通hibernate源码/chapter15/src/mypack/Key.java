package mypack;

class Key{
  private Class classType;
  private Long id;

  public Key(Class classType,Long id){
    this.classType=classType;
    this.id=id;
  }

  public Class getClassType(){
    return this.classType;
  }
  public Long getId(){
    return this.id;
  }
  public boolean equals(Object o){
    if(this==o)return true;
    if(!(o instanceof Key))return false;
    final Key other=(Key)o;
    if(classType.equals(other.getClassType())&& id.equals(other.getId()))
      return true;
    return false;
  }

  public int hashCode(){
        int result;
	result = classType.hashCode();
	result = 29 * result + id.hashCode();
	return result;
  }

}
