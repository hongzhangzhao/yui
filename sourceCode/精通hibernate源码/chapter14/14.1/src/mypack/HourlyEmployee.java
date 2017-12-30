package mypack;

import java.io.Serializable;

public class HourlyEmployee extends Employee{

    private double rate;

    /** full constructor */
    public HourlyEmployee(String name, double rate,Company company) {
        super(name,company);
        this.rate=rate;
    }

    /** default constructor */
    public HourlyEmployee() {
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
}
