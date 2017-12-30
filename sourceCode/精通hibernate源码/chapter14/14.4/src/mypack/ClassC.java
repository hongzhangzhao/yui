package mypack;

public class ClassC extends ClassA {

    private String c1;

    public ClassC(String a1,String c1) {
        super(a1);
        this.c1 = c1;
    }

    /** default constructor */
    public ClassC() {
    }

    public String getC1() {
        return this.c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

}
