package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Computer implements Serializable {

    /** identifier field */
    private Long id;

    /** nullable persistent field */
    private String type;

    /** persistent field */
    private mypack.CpuBox cpuBox;

    /** full constructor */
    public Computer(String type, mypack.CpuBox cpuBox) {
        this.type = type;
        this.cpuBox = cpuBox;
    }

    /** default constructor */
    public Computer() {
    }

    /** minimal constructor */
    public Computer(mypack.CpuBox cpuBox) {
        this.cpuBox = cpuBox;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public mypack.CpuBox getCpuBox() {
        return this.cpuBox;
    }

    public void setCpuBox(mypack.CpuBox cpuBox) {
        this.cpuBox = cpuBox;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
