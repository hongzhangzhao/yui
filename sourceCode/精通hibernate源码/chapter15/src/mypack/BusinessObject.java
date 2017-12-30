package mypack;
import java.io.Serializable;
public class BusinessObject implements Serializable{
  private Long id;
  public Long getId() {
        return this.id;
  }
  public void setId(Long id) {
       this.id = id;
  }
  public BusinessObject(){}

}