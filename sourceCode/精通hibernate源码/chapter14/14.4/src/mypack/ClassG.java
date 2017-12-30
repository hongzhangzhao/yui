package mypack;

public class ClassG extends ClassD {

    private String g1;

    public ClassG(String a1,String d1,String g1) {
        super(a1,d1);
        this.g1 = g1;
    }

    /** default constructor */
    public ClassG() {
    }

    public String getG1() {
        return this.g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

}
