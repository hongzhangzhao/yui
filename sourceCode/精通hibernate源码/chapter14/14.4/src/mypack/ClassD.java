package mypack;

public class ClassD extends ClassA {

    private String d1;

    public ClassD(String a1,String d1) {
        super(a1);
        this.d1 = d1;
    }

    /** default constructor */
    public ClassD() {
    }

    public String getD1() {
        return this.d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

}
