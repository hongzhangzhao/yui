package mypack;

public class Dictionary {
    private Long id;
    private String type;
    private String key;
    private String value;

    public Dictionary() {}
    public Dictionary(String type,String key,String value){
      this.type=type;
      this.key=key;
      this.value=value;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType(){
      return type;
  }

  public String getKey(){
      return key;
  }

  public String getValue(){
      return value;
  }
  
  public void setType(String type){
    this.type=type;
  } 

  public void setKey(String key){
    this.key=key;
  } 
  
  public void setValue(String value){
    this.value=value;
  } 
}