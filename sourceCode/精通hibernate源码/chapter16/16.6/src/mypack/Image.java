package mypack;

import java.io.Serializable;

public class Image implements Serializable {
    private String name;
    private String filename;
    private int sizeX;
    private int sizeY;
    private Customer customer;

    /** full constructor */
    public Image(String name, String filename,int sizeX,int sizeY) {
        this.name = name;
        this.filename = filename;
        this.sizeX=sizeX;
        this.sizeY = sizeY;
    }

    /** default constructor */
    public Image() {
    }
    
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSizeX() {
        return this.sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public boolean equals(Object o){
      if(this==o) return true;
      if(! (o instanceof Image)) return false;
      final Image other=(Image)o;

      if(this.name.equals(other.getName()) 
        && this.filename.equals(other.getFilename()) 
        && this.sizeX==other.getSizeX()
        && this.sizeY==other.getSizeY())
        return true;
      else
        return false;
    }

   public int hashCode() {
	int result;
	result = name.hashCode();
	result = 29 * result + filename.hashCode()+sizeX+sizeY;
	return result;
   }
}
