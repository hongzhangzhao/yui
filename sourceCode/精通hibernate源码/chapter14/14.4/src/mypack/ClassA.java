package mypack;

public class ClassA extends DOClass {

    private String a1;

    public ClassA(String a1) {
        this.a1 = a1;
    }

    /** default constructor */
    public ClassA() {
    }

    public String getA1() {
        return this.a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

}
