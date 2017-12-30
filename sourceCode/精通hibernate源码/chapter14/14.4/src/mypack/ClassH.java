package mypack;

public class ClassH extends ClassD {

    private String h1;

    public ClassH(String a1,String d1,String h1) {
        super(a1,d1);
        this.h1 = h1;
    }

    /** default constructor */
    public ClassH() {
    }

    public String getH1() {
        return this.h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

}
