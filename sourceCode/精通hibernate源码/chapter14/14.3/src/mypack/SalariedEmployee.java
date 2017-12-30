package mypack;

import java.io.Serializable;

public class SalariedEmployee extends Employee {

    private double salary;

    /** full constructor */
    public SalariedEmployee(String name, double salary,Company company) {
        super(name,company);
        this.salary=salary;
        
    }

    /** default constructor */
    public SalariedEmployee() {
    }

   public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
